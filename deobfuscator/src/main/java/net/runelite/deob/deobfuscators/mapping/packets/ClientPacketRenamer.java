/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators.mapping.packets;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import lombok.RequiredArgsConstructor;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.*;
import net.runelite.asm.attributes.code.instructions.*;
import net.runelite.asm.execution.*;
import net.runelite.asm.pool.Field;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.deobfuscators.mapping.MappingExecutorUtil;
import net.runelite.deob.deobfuscators.mapping.ParallelExecutorMapping;
import net.runelite.deob.util.NameMappings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ClientPacketRenamer
{
    private static final Logger logger = LoggerFactory.getLogger(ClientPacketRenamer.class);

    private final ClassGroup source, target;

    private final ParallelExecutorMapping mapping;

    private final NameMappings nameMappings = new NameMappings();

    private final String packetDeobClassName;

    private final Map<String, String> methodMapping = new HashMap<>();

    private final Multimap<String, InstructionContext> namedMethodInstructions = HashMultimap.create();
    private final Multimap<String, InstructionContext> targetMethodInstructions = HashMultimap.create();

    private final Map<String, String> classMapping = new HashMap<>();

    public ClientPacketRenamer(ClassGroup source, ClassGroup target, ParallelExecutorMapping mapping)
    {
        this.source = source;
        this.target = target;
        this.mapping = mapping;

        ClassFile classInfo = (ClassFile) mapping.get(source.getClasses().stream().filter(n -> n.getClassName().equals("ClientPacket")).findFirst().get());
        this.packetDeobClassName = classInfo.getClassName();
    }

    private void findComparisonJumpMatches()
    {
        //already reduced so we don't have to
        Map<Object, Object> objectMap = mapping.getMap();
        for (Object o1 : objectMap.keySet())
        {
            if (o1 instanceof Method)
            {
                Method m1 = (Method) o1;
                Method m2 = (Method) objectMap.get(o1);
                investigateIfs(m1, m2);
            }
        }
    }

    /**
     * Finds client packet field mapping within method in the first block before any comparison
     * instructions are encountered
     */
    private void findMethodStartMatches()
    {
        //already reduced so we don't have to
        Map<Object, Object> objectMap = mapping.getMap();
        for (Object o1 : objectMap.keySet())
        {
            if (o1 instanceof Method)
            {
                Method m1 = (Method) o1;
                Method m2 = (Method) objectMap.get(o1);

                investigateMethods(m1, m2);
            }
        }
    }

    private void investigateMethods(Method m1, Method m2)
    {
        if (m1.getCode() == null || m2.getCode() == null)
            return;

        List<Instruction> blockNamed = getConsecutiveBlock(m1, m1.getCode().getInstructions().getInstructions().get(0));
        List<Instruction> blockTarget = getConsecutiveBlock(m2, m2.getCode().getInstructions().getInstructions().get(0));

        mapBlocks(blockNamed, blockTarget);
    }

    /**
     * Steps into mapped methods and matches if statements using ParallelMappingExecutor
     */
    private void investigateIfs(Method m1, Method m2)
    {
        if (m1.getCode() == null || m2.getCode() == null)
            return;

        Map<JumpingInstruction, JumpingInstruction> cmpCandidates = new HashMap<>();

        Execution e = new Execution(source);
        e.step = true;
        Frame frame = new Frame(e, m1);
        frame.initialize();
        e.frames.add(frame);

        Execution e2 = new Execution(target);
        e2.step = true;
        Frame frame2 = new Frame(e2, m2);
        frame2.initialize();
        e2.frames.add(frame2);

        frame.other = frame2;
        frame2.other = frame;

        ParallellMappingExecutor parallel = new ParallellMappingExecutor(e, e2);
        ParallelExecutorMapping mappings = new ParallelExecutorMapping(m1.getClassFile().getGroup(),
                m2.getClassFile().getGroup());

        mappings.m1 = m1;
        mappings.m2 = m2;

        parallel.mappings = mappings;

        while (parallel.step())
        {
            // get what each frame is paused/exited on
            InstructionContext p1 = parallel.getP1(), p2 = parallel.getP2();

            assert p1.getInstruction() instanceof MappableInstruction;
            assert p2.getInstruction() instanceof MappableInstruction;

            MappableInstruction mi1 = (MappableInstruction) p1.getInstruction(),
                    mi2 = (MappableInstruction) p2.getInstruction();

            boolean isSame = mi1.isSame(p1, p2);
            assert isSame == mi2.isSame(p2, p1)
                    : "isSame fail " + p1.getInstruction() + " <> " + p2.getInstruction();

            if (!isSame)
            {
                p1.getFrame().stop();
                p2.getFrame().stop();
                continue;
            }

            mi1.map(mappings, p1, p2);

            if (mi1 instanceof ComparisonInstruction &&
                    ((Instruction) mi1).getInstructions().getCode().getMethod().getName().equals(m1.getName()))
            {
                if (m1.getName().equals("menuAction"))
                    continue;

                JumpingInstruction ji1 = (JumpingInstruction) mi1; //comparison types are always jumping types too
                JumpingInstruction ji2 = (JumpingInstruction) mi2;

                assert ji1.getJumps().size() == 1;
                assert ji2.getJumps().size() == 1;

                cmpCandidates.putIfAbsent(ji1, ji2);
            }
        }

        for (Map.Entry<JumpingInstruction, JumpingInstruction> insPair : cmpCandidates.entrySet())
        {
            JumpingInstruction jiNamed = insPair.getKey(), jiTarget = insPair.getValue();

            List<Instruction> immediateBlockNamed = getConsecutiveBlock(m1, getNextInstruction(m1, jiNamed, false));
            List<Instruction> immediateBlockTarget = getConsecutiveBlock(m2, getNextInstruction(m2, jiTarget, false));
            //explore normal branching of the ji
            mapBlocks(immediateBlockNamed, immediateBlockTarget);

            immediateBlockNamed = getConsecutiveBlock(m1, getNextInstruction(m1, jiNamed, true));
            immediateBlockTarget = getConsecutiveBlock(m2, getNextInstruction(m2, jiTarget, true));
            //explore inverted branching of the ji
            mapBlocks(immediateBlockNamed, immediateBlockTarget);
        }
    }

    /**
     * Some if statements are not mapped. This method attempts
     * a last-effort mapping.
     */
    private void fixUnmatchedIfs()
    {
        Execution e = new Execution(source);
        e.populateInitialMethods();
        e.addMethodContextVisitor(ic -> visit(ic, true));
        e.run();

        Execution e2 = new Execution(target);
        e2.populateInitialMethods();
        e2.addMethodContextVisitor(ic -> visit(ic, false));
        e2.run();

        Multimap<JumpingInstruction, JumpingInstruction> ifCandidates = handleIfMatching();

        for (JumpingInstruction jiNamed : ifCandidates.keys())
        {
            Method m1 = ((Instruction) jiNamed).getInstructions().getCode().getMethod();
            for (JumpingInstruction jiTarget : ifCandidates.get(jiNamed))
            {
                Method m2 = ((Instruction) jiTarget).getInstructions().getCode().getMethod();

                List<Instruction> immediateBlockNamed = getConsecutiveBlock(m1, getNextInstruction(m1, jiNamed, false));
                List<Instruction> immediateBlockTarget = getConsecutiveBlock(m2, getNextInstruction(m2, jiTarget, false));
                //explore normal branching of the ji
                mapBlocks(immediateBlockNamed, immediateBlockTarget);

                immediateBlockNamed = getConsecutiveBlock(m1, getNextInstruction(m1, jiNamed, true));
                immediateBlockTarget = getConsecutiveBlock(m2, getNextInstruction(m2, jiTarget, true));
                //explore inverted branching of the ji
                mapBlocks(immediateBlockNamed, immediateBlockTarget);
            }
        }
    }

    private void visit(MethodContext mctx, boolean named)
    {
        String methodName = mctx.getMethod().getName();

        if (named)
        {
            Method targetMethod = (Method) mapping.get(mctx.getMethod());
            if (targetMethod == null)
            {
                return;
            }

            methodMapping.putIfAbsent(methodName, targetMethod.getName());
            classMapping.putIfAbsent(mctx.getMethod().getClassFile().getName(), targetMethod.getClassFile().getName());
        }

        if (named && mctx.getMethod().getCode().getInstructions().getInstructions().stream()
                .noneMatch(i -> i instanceof GetStatic && ((GetStatic) i).getField().getClazz().getName().equals("ClientPacket")))
        {
            return;
        }

        for (InstructionContext ictx : mctx.getInstructionContexts())
        {
            (named ? namedMethodInstructions : targetMethodInstructions).put(methodName, ictx);
        }
    }

    /**
     * Handles client packet field mapping separately since the if statement order
     * is swapped around, messing with the ParallelMappingExecutor step matching
     */
    private Multimap<JumpingInstruction, JumpingInstruction> handleIfMatching()
    {
        Multimap<JumpingInstruction, JumpingInstruction> ifCandidates = HashMultimap.create();
        for (String sourceName : namedMethodInstructions.keySet())
        {
            for (InstructionContext ic1 : namedMethodInstructions.get(sourceName))
            {
                Instruction i1 = ic1.getInstruction();
                if (!(i1 instanceof ComparisonInstruction) || ifCandidates.containsKey(i1))
                    continue;

                String targetMethodName = methodMapping.get(sourceName);
                targetMethodInstructions.get(targetMethodName).stream()
                        .filter(ic2 -> ic2.getInstruction() instanceof ComparisonInstruction)
                        .filter(ic2 ->
                        {
                            try
                            {
                                return IfExtended.isSame(ic1, ic2, mapping, classMapping);
                            }
                            catch (RuntimeException ignored)
                            {
                                return false;
                            }
                        })
                        .map(InstructionContext::getInstruction)
                        .forEach(match ->
                        {
                            JumpingInstruction ji1 = (JumpingInstruction) i1; //comparison types are always jumping types too
                            JumpingInstruction ji2 = (JumpingInstruction) match;

                            assert ji1.getJumps().size() == 1;
                            assert ji2.getJumps().size() == 1;

                            ifCandidates.put(ji1, ji2);
                        });
            }
        }

        return ifCandidates;
    }

    private void mapBlocks(List<Instruction> blockNamed, List<Instruction> blockTarget)
    {
        Field packetFieldNamed = blockNamed.stream()
                .filter(i -> i.getType() == InstructionType.GETSTATIC)
                .map(i -> ((GetStatic) i).getField())
                .filter(field -> field.getType().getInternalName().equals("ClientPacket") && !field.getName().contains("field"))
                .findFirst()
                .orElse(null);

        Field packetFieldTarget = blockTarget.stream()
                .filter(i -> i.getType() == InstructionType.GETSTATIC)
                .map(i -> ((GetStatic) i).getField())
                .filter(field -> field.getType().getInternalName().equals(packetDeobClassName))
                .findFirst()
                .orElse(null);

        if (packetFieldNamed == null || packetFieldTarget == null)
            return;

        if (!nameMappings.getMap().containsKey(packetFieldTarget))
        {
            nameMappings.map(packetFieldTarget, packetFieldNamed.getName());
            logger.info("Mapped packet field: {} -> {}", packetFieldTarget.getName(), packetFieldNamed.getName());
        }
    }

    /**
     * Obtains next instruction assuming condition is met,
     * takes the jump label for eq and next instruction for ne under normal circumstances;
     *
     * @param invert value of "true" implies above ordering is flipped
     */
    private Instruction getNextInstruction(Method method, JumpingInstruction ji1, boolean invert)
    {
        boolean isNegationCmp = Stream.of(IfACmpNe.class, IfICmpNe.class, IfNe.class, IfNonNull.class).anyMatch(c -> c.isInstance(ji1));

        if (isNegationCmp ^ invert)
        {
            List<Instruction> mIns = method.getCode().getInstructions().getInstructions();
            int idx = mIns.indexOf(ji1);
            assert idx != -1;

            if (idx + 1 == mIns.size())
                return null;

            Instruction nextIns = mIns.get(idx + 1);
            if (nextIns instanceof Goto || nextIns instanceof GotoW)
                nextIns = ((JumpingInstruction) nextIns).getJumps().get(0);

            return nextIns;
        }
        else
        {
            return ji1.getJumps().get(0);
        }
    }

    /**
     * Obtains first contiguous block from a start instruction
     * and terminates if method ends or another jump is encountered
     */
    private List<Instruction> getConsecutiveBlock(Method method, Instruction startIns)
    {
        List<Instruction> blockInstructions = new ArrayList<>();
        Instructions instructions = method.getCode().getInstructions();

        int idx = instructions.getInstructions().indexOf(startIns);
        if (idx == -1)
            return blockInstructions;

        while (idx < instructions.size())
        {
            Instruction ins = instructions.getInstructions().get(idx);

            if (ins instanceof JumpingInstruction)
            {
                return blockInstructions;
            }

            if (ins instanceof Label)
            {
                Instruction last = blockInstructions.isEmpty() ? null : blockInstructions.get(blockInstructions.size() - 1);
                if (last != null && last.isTerminal())
                {
                    return blockInstructions;
                }
            }

            blockInstructions.add(ins);
            idx++;
        }

        return blockInstructions;
    }

    /**
     * Maps/renames client packet field names
     */
    public void run()
    {
        findComparisonJumpMatches();
        findMethodStartMatches();
        fixUnmatchedIfs();
        Renamer renamer = new Renamer(nameMappings);
        renamer.run(target);
    }

    //this only exists because some matching is broken and didn't want to modify the existing code
    @RequiredArgsConstructor
    enum IfExtended
    {
        IFACMPEQ(InstructionType.IF_ACMPEQ, 2,
                Map.of(InstructionType.IFNULL, i -> i.getInstruction().getType() == InstructionType.ACONST_NULL,
                        InstructionType.IFNONNULL, i -> i.getInstruction().getType() == InstructionType.ACONST_NULL)),
        IFACMPNE(InstructionType.IF_ACMPNE, 2,
                Map.of(InstructionType.IFNULL, i -> i.getInstruction().getType() == InstructionType.ACONST_NULL,
                        InstructionType.IFNONNULL, i -> i.getInstruction().getType() == InstructionType.ACONST_NULL)),
        IFCMPGE(InstructionType.IF_ICMPGE, 2,
                Map.of(InstructionType.IF_ICMPLT, i -> true)),
        IFCMPGT(InstructionType.IF_ICMPGT, 2,
                Map.of(InstructionType.IF_ICMPLE, i -> true)),
        IFCMPLE(InstructionType.IF_ICMPLE, 2,
                Map.of(InstructionType.IF_ICMPGT, i -> true)),
        IFCMPLT(InstructionType.IF_ICMPLT, 2,
                Map.of(InstructionType.IF_ICMPGE, i -> true)),
        IFEQ(InstructionType.IFEQ, 1,
                Map.of(InstructionType.IFNE, i -> true,
                        InstructionType.IF_ICMPEQ, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)),
                        InstructionType.IF_ICMPNE, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)))),
        IFGE(InstructionType.IFGE, 1,
                Map.of(InstructionType.IFLT, i -> true)),
        IFGT(InstructionType.IFGT, 1,
                Map.of(InstructionType.IFLE, i -> true)),
        IFICMPEQ(InstructionType.IF_ICMPEQ, 2,
                Map.of(InstructionType.IF_ICMPNE, i -> true,
                        InstructionType.IFEQ, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)),
                        InstructionType.IFNE, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)))),
        IFICMPNE(InstructionType.IF_ICMPNE, 2,
                Map.of(InstructionType.IF_ICMPEQ, i -> true,
                        InstructionType.IFEQ, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)),
                        InstructionType.IFNE, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)))),
        IFLE(InstructionType.IFLE, 1,
                Map.of(InstructionType.IFGT, i -> true)),
        IFLT(InstructionType.IFLT, 1,
                Map.of(InstructionType.IFGE, i -> true)),
        IFNE(InstructionType.IFNE, 1,
                Map.of(InstructionType.IFEQ, i -> true,
                        InstructionType.IF_ICMPNE, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)),
                        InstructionType.IF_ICMPEQ, i -> IfICmpEq.isZero(i.getPops().get(0)) || IfICmpEq.isZero(i.getPops().get(1)) ||
                                IfICmpEq.isOne(i.getPops().get(0)) || IfICmpEq.isOne(i.getPops().get(1)))),
        IFNONNULL(InstructionType.IFNONNULL, 1,
                Map.of(InstructionType.IFNULL, i -> true,
                        InstructionType.IF_ACMPEQ, i -> i.getPops().get(0).getPushed().getInstruction() instanceof AConstNull ||
                                i.getPops().get(1).getPushed().getInstruction() instanceof AConstNull,
                        InstructionType.IF_ACMPNE, i -> i.getPops().get(0).getPushed().getInstruction() instanceof AConstNull ||
                                i.getPops().get(1).getPushed().getInstruction() instanceof AConstNull)),
        IFNULL(InstructionType.IFNULL, 1,
                Map.of(InstructionType.IFNONNULL, i -> true,
                        InstructionType.IF_ACMPEQ, i -> i.getPops().get(0).getPushed().getInstruction() instanceof AConstNull ||
                                i.getPops().get(1).getPushed().getInstruction() instanceof AConstNull,
                        InstructionType.IF_ACMPNE, i -> i.getPops().get(0).getPushed().getInstruction() instanceof AConstNull ||
                                i.getPops().get(1).getPushed().getInstruction() instanceof AConstNull));

        private final InstructionType type;
        private final int poppedArgs;
        private final Map<InstructionType, Predicate<InstructionContext>> equivalentInstr; //key is equivalent instruction and value is necessary popped instructions

        private static final Map<InstructionType, IfExtended> map;

        static
        {
            ImmutableMap.Builder<InstructionType, IfExtended> builder = new ImmutableMap.Builder<>();

            for (IfExtended ifExtended : values())
            {
                builder.put(ifExtended.type, ifExtended);
            }

            map = builder.build();
        }

        private static List<net.runelite.asm.Field> getComparedFieldsMultiple(InstructionContext ctx)
        {
            List<net.runelite.asm.Field> fields = new ArrayList<>();

            for (StackContext sctx : ctx.getPops())
            {
                InstructionContext base = resolve(sctx.getPushed(), sctx);

                if (base != null && base.getInstruction() instanceof GetFieldInstruction)
                {
                    GetFieldInstruction gfi = (GetFieldInstruction) base.getInstruction();

                    if (gfi.getMyField() != null)
                    {
                        fields.add(gfi.getMyField());
                    }
                }
            }

            return fields.isEmpty() ? null : fields;
        }

        private static List<Integer> getComparedConstants(InstructionContext ctx)
        {
            List<Integer> constants = new ArrayList<>();

            for (StackContext sctx : ctx.getPops())
            {
                InstructionContext base = resolve(sctx.getPushed(), sctx);

                if (base != null && base.getInstruction() instanceof PushConstantInstruction)
                {
                    PushConstantInstruction gfi = (PushConstantInstruction) base.getInstruction();

                    if (gfi.getConstant() != null && gfi.getConstant() instanceof Number)
                    {
                        constants.add(((Number) gfi.getConstant()).intValue());
                    }
                }
            }

            return constants.isEmpty() ? null : constants;
        }

        private static boolean couldBeSameMultiple(net.runelite.asm.Field f1, net.runelite.asm.Field f2, ParallelExecutorMapping mapping)
        {
            if (mapping.get(f1) == f2)
                return true;

            if (f1.isStatic() != f2.isStatic())
            {
                return false;
            }

            if (!f1.isStatic())
            {
                if (!MappingExecutorUtil.isMaybeEqual(f1.getClassFile(), f2.getClassFile()))
                {
                    return false;
                }
            }

            return MappingExecutorUtil.isMaybeEqual(f1.getType(), f2.getType());
        }

        private static boolean isSameFieldMultiple(InstructionContext thisIc, InstructionContext otherIc, ParallelExecutorMapping mapping)
        {
            List<net.runelite.asm.Field> f1s = getComparedFieldsMultiple(thisIc), f2s = getComparedFieldsMultiple(otherIc);
            List<Integer> c1s = getComparedConstants(thisIc), c2s = getComparedConstants(otherIc);

            if ((c1s == null) ^ (c2s == null))
                return false;
            if (c1s != null)
            {
                if (c1s.size() != c2s.size())
                    return false;

                assert c1s.size() == 1;

                Integer c1 = c1s.get(0), c2 = c2s.get(0);
                if (!c1.equals(c2))
                    return false;
            }

            if ((f1s == null) == (f2s != null))
            {
                return false;
            }

            if (f1s == null)
            {
                return true;
            }

            if (f1s.size() != f2s.size())
            {
                return false;
            }

            assert f1s.size() == 1 || f1s.size() == 2;

            if (f1s.size() == 2)
            {
                net.runelite.asm.Field f1 = f1s.get(0), f2 = f2s.get(0);
                net.runelite.asm.Field j1 = f1s.get(1), j2 = f2s.get(1);

                if (!f1.isStatic() && !j1.isStatic() && !f2.isStatic() && !j2.isStatic())
                {
                    if ((f1.getClassFile() == j1.getClassFile()) != (f2.getClassFile() == j2.getClassFile()))
                    {
                        return false;
                    }
                }

                if (couldBeSameMultiple(f1, f2, mapping) && couldBeSameMultiple(j1, j2, mapping) && couldBeSameMultiple(f1, j2, mapping) && couldBeSameMultiple(j1, f2, mapping))
                {
                    return true;
                }

                if (couldBeSameMultiple(f1, f2, mapping) && couldBeSameMultiple(j1, j2, mapping))
                {
                    return true;
                }

                return couldBeSameMultiple(f1, j2, mapping) && couldBeSameMultiple(j1, f2, mapping);
            }
            else
            {
                net.runelite.asm.Field f1 = f1s.get(0), f2 = f2s.get(0);
                return couldBeSameMultiple(f1, f2, mapping);
            }
        }

        private static InstructionContext resolve(
                InstructionContext ctx,
                StackContext from // pushed from ctx
        )
        {
            if (ctx.getInstruction() instanceof SetFieldInstruction)
            {
                StackContext s = ctx.getPops().get(0);
                return resolve(s.getPushed(), s);
            }

            if (ctx.getInstruction() instanceof ConversionInstruction)
            {
                // assume it pops one and pushes one
                StackContext s = ctx.getPops().get(0);
                return resolve(s.getPushed(), s);
            }

            if (ctx.getInstruction() instanceof DupInstruction)
            {
                DupInstruction d = (DupInstruction) ctx.getInstruction();
                StackContext s = d.getOriginal(from);
                return resolve(s.getPushed(), s);
            }

            if (ctx.getInstruction() instanceof ArrayLoad)
            {
                // might be multidimensional array
                StackContext s = ctx.getPops().get(1); // the array
                return resolve(s.getPushed(), s);
            }

            if (ctx.getInstruction() instanceof LVTInstruction)
            {
                LVTInstruction lvt = (LVTInstruction) ctx.getInstruction();
                Variables variables = ctx.getVariables();

                if (lvt.store())
                {
                    StackContext s = ctx.getPops().get(0); // is this right?
                    return resolve(s.getPushed(), s);
                }
                else
                {
                    VariableContext vctx = variables.get(lvt.getVariableIndex()); // variable being loaded
                    assert vctx != null;

                    InstructionContext storedCtx = vctx.getInstructionWhichStored();
                    if (storedCtx == null || vctx.isIsParameter())
                        return null; // modified from original method since parameter mapping was messing up; we also don't care about parameter origin outside of method

                    return resolve(storedCtx, null);
                }
            }

            if (ctx.getInstruction() instanceof InvokeStatic)
            {
                if (from.returnSource != null)
                {
                    return resolve(from.returnSource.getPushed(), from.returnSource);
                }
            }

            return ctx;
        }

        private static net.runelite.asm.Field getComparedField0(InstructionContext ctx)
        {
            GetFieldInstruction gfi = null;

            for (StackContext sctx : ctx.getPops())
            {
                InstructionContext base = resolve(sctx.getPushed(), sctx);

                if (base != null && base.getInstruction() instanceof GetFieldInstruction)
                {
                    if (gfi != null)
                        return null;

                    gfi = (GetFieldInstruction) base.getInstruction();
                }
            }

            if (gfi == null)
                return null;

            return gfi.getMyField();
        }

        private static boolean isSameField0(InstructionContext thisIc, InstructionContext otherIc, ParallelExecutorMapping mapping, Map<String, String> classMapping)
        {
            net.runelite.asm.Field f1 = getComparedField0(thisIc), f2 = getComparedField0(otherIc);
            if ((f1 == null) == (f2 != null))
                return false;

            if (f1 == null)
                return true;

            if (f1.isStatic() != f2.isStatic())
                return false;

            if (mapping.get(f1.getClassFile()) == f2.getClassFile() &&
                    (classMapping.get(f1.getType().getInternalName()) != null && classMapping.get(f1.getType().getInternalName()).equals(f2.getType().getInternalName()) ||
                            classMapping.get(f1.getType().getInternalName()) == null && f1.getType().getInternalName().equals(f2.getType().getInternalName())) &&
                    f1.getType().getDimensions() == f2.getType().getDimensions())
                return true;

            if (!f1.isStatic())
                if (!MappingExecutorUtil.isMaybeEqual(f1.getClassFile(), f2.getClassFile()))
                    return false;

            return MappingExecutorUtil.isMaybeEqual(f1.getType(), f2.getType());
        }

        private static boolean isSame(InstructionContext ic1, InstructionContext ic2, ParallelExecutorMapping mapping, Map<String, String> classMapping)
        {
            IfExtended extended1 = map.get(ic1.getInstruction().getType()), extended2 = map.get(ic2.getInstruction().getType());

            if (extended1 == null || extended2 == null)
                return false;

            int poppedArgs = extended1.poppedArgs;

            if (!(poppedArgs == 2 ? isSameFieldMultiple(ic1, ic2, mapping) : isSameField0(ic1, ic2, mapping, classMapping)))
                return false;

            if (ic1.getInstruction().getClass() == ic2.getInstruction().getClass())
                return analyzePrevIfs(ic1, ic2, mapping, classMapping);

            if (extended1.equivalentInstr.get(ic2.getInstruction().getType()) == null ||
                    !extended1.equivalentInstr.get(ic2.getInstruction().getType()).test(ic2))
            {
                return false;
            }

            return analyzePrevIfs(ic1, ic2, mapping, classMapping);
        }

        /**
         * Analyze whether previous if instructions for both contexts
         * match, and then recursively follows that chain up to verify
         * equivalence (depth set to 1 seems to work for now)
         */
        private static boolean analyzePrevIfs(InstructionContext ic1, InstructionContext ic2, ParallelExecutorMapping mapping, Map<String, String> classMapping)
        {
            List<Instruction> instructions1 = ic1.getInstruction().getInstructions().getInstructions();
            List<Instruction> instructions2 = ic2.getInstruction().getInstructions().getInstructions();

            int idx1 = instructions1.indexOf(ic1.getInstruction()), idx2 = instructions2.indexOf(ic2.getInstruction());

            Instruction prevIf1 = null, prevIf2 = null;
            //topological order so any nesting comparison instr must come prior to current comparison instr
            for (int i = idx1 - 1; i >= 0; i--)
            {
                if (instructions1.get(i) instanceof ComparisonInstruction)
                { //comparisons are also jumping
                    prevIf1 = instructions1.get(i);
                    break;
                }
            }

            for (int i = idx2 - 1; i >= 0; i--)
            {
                if (instructions2.get(i) instanceof ComparisonInstruction)
                {
                    prevIf2 = instructions2.get(i);
                    break;
                }
            }

            if ((prevIf1 == null) ^ (prevIf2 == null))
            {
                return false;
            }

            if (prevIf1 != null)
            {
                Label prevJump1 = ((JumpingInstruction) prevIf1).getJumps().get(0);

                int prevIfJumpIdx1 = instructions1.indexOf(prevJump1);
                int ifIdx1 = instructions1.indexOf(ic1.getInstruction());

                if (prevJump1 != ((JumpingInstruction) ic1.getInstruction()).getJumps().get(0) &&
                        ifIdx1 >= prevIfJumpIdx1)
                { //do not have to worry about index of prev if statement since CFG deob has been run
                    //previous if statement doesn't jump to same label meaning it is not part of a compound if statement,
                    // and previous if statement also doesn't nest current if statement
                    return true;
                }

                InstructionContext nestedIC1 = null, nestedIC2 = null;

                for (InstructionContext ic : ic1.getFrame().getInstructions())
                {
                    if (ic.getInstruction() == prevIf1)
                    {
                        nestedIC1 = ic;
                        break;
                    }
                }

                for (InstructionContext ic : ic2.getFrame().getInstructions())
                {
                    if (ic.getInstruction() == prevIf2)
                    {
                        nestedIC2 = ic;
                        break;
                    }
                }

                assert nestedIC1 != null;
                assert nestedIC2 != null;

                return isSame(nestedIC1, nestedIC2, mapping, classMapping);
            }

            return true;
        }
    }
}