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

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;
import lombok.SneakyThrows;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.instruction.types.GetFieldInstruction;
import net.runelite.asm.attributes.code.instruction.types.LVTInstruction;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.execution.StackContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClientPacketUpdater
{
	private static final Logger logger = LoggerFactory.getLogger(ClientPacketUpdater.class);

	private final ClassGroup source;

	private final ClassGroup target;

	private final Multimap<String, BufferInput> packetMappingSource = LinkedHashMultimap.create();

	private final Multimap<String, BufferInput> packetMappingTarget = LinkedHashMultimap.create();

	public ClientPacketUpdater(ClassGroup source, ClassGroup target)
	{
		this.source = source;
		this.target = target;
	}

	/**
	 * Resolves each argument sctx by recursing through each popped sctx
	 * of the instruction that pushed the argument sctx until only instructions
	 * that popped 0 or 1 sctx are found
	 */
	private List<Instruction> resolve(InstructionContext ictx, StackContext sctx)
	{
		List<Instruction> allResolved = new ArrayList<>();
		InstructionContext immediateResolvedCtx = ictx.resolve(sctx);

		if (immediateResolvedCtx.getPops().size() > 1)
		{
			for (StackContext popped : immediateResolvedCtx.getPops())
			{
				allResolved.addAll(resolve(popped.getPushed(), popped));
			}
		}
		else
		{
			allResolved.add(immediateResolvedCtx.getInstruction());
		}

		return allResolved;
	}

	/**
	 * Finds and maps buffer instructions/arguments for client packet block
	 */
	private void mapPacketBlock(MethodContext mctx, GetStatic gsi, boolean source)
	{
		if (mctx.getMethod().getCode() == null)
			return;
		if ((source ? packetMappingSource : packetMappingTarget).containsKey(gsi.getField().getName()))
			return;

		InstructionContext gsctx = new ArrayList<>(mctx.getInstructonContexts(gsi)).get(0); //only one path through so it shouldn't matter which context we choose
		assert gsctx.getPushes().size() == 1;

		List<InstructionContext> gsiPopped = gsctx.getPushes().get(0).getPopped();
		if (gsiPopped.size() > 1) //should only be popped by getPacketBufferNode
			return;

		InstructionContext isctx = gsiPopped.get(0);
		if (isctx.getInstruction().getType() != InstructionType.INVOKESTATIC)
			return;

		InvokeStatic is = (InvokeStatic) isctx.getInstruction();
		if (!is.getMethod().getName().equals("getPacketBufferNode"))
			return;

		List<Instruction> instructions = mctx.getMethod().getCode().getInstructions().getInstructions();

		int idx = instructions.indexOf(is);
		assert idx != -1;

		for (int i = idx + 1; i < instructions.size(); i++)
		{
			Instruction ins = instructions.get(i);

			if (ins.getType() == InstructionType.GETSTATIC &&
				((GetStatic) ins).getField().getType().getInternalName().equals("ClientPacket"))
			{
				return;
			}

			if (ins.getType() == InstructionType.INVOKEVIRTUAL)
			{
				InvokeVirtual iv = (InvokeVirtual) ins;
				if (!iv.getMethod().getClazz().getName().equals("Buffer") && !iv.getMethod().getClazz().getName().equals("PacketBuffer"))
				{
					continue;
				}

				InstructionContext ivctx = new ArrayList<>(mctx.getInstructonContexts(iv)).get(0); //only one path through so it shouldn't matter which context we choose
				if (ivctx.getPops().size() < 2)
					continue; //eliminates no arg write methods (e.g. readStringCp1252NullTerminated), these do not be considered

				StackContext sctx = ivctx.getPops().get(0);
				List<Instruction> resolvedArgs = resolve(sctx.getPushed(), sctx);

				(source ? packetMappingSource : packetMappingTarget).put(
					gsi.getField().getName(),
					new BufferInput(
						iv.getMethod().getName(),
						resolvedArgs
					)
				);
			}
		}
	}

	private void visit(MethodContext mctx, boolean source)
	{
		for (Instruction ins : mctx.getMethod().getCode().getInstructions())
		{
			if (ins.getType() == InstructionType.GETSTATIC)
			{
				GetStatic gsi = (GetStatic) ins;
				if (gsi.getField().getType().getInternalName().equals("ClientPacket"))
				{
					mapPacketBlock(mctx, gsi, source);
				}
			}
		}
	}

	@SneakyThrows
	private List<File> loadFiles(Path folderPath)
	{
		try (Stream<Path> paths = Files.walk(folderPath))
		{
			return paths
				.filter(Files::isRegularFile)
				.map(Path::toFile)
				.collect(Collectors.toList());
		}
	}

	private List<File> loadPacketSourceFiles()
	{
		String subPath = "runelite-client\\src\\main\\java\\net\\unethicalite\\api\\packets";
		Path packetsPath = Paths.get(System.getProperty("user.dir")).getParent().resolve(subPath);
		return loadFiles(packetsPath);
	}

	/**
	 * Fixes up the buffer write instructions/arguments in the source file using javaparser
	 */
	private void fixBufferWrites(MethodDeclaration method)
	{
		if (method.getNameAsString().equals("createType1Action"))
			return; //this method is deprecated/removed and has argument/instruction count mismatch

		String fieldName = method.findAll(MethodCallExpr.class).stream()
			.filter(call -> call.getScope().isPresent() && call.getScope().get().toString().equals("clientPacket"))
			.map(MethodCallExpr::getNameAsString)
			.findFirst()
			.orElse(null);
		if (fieldName == null)
		{
			return;
		}

		Collection<BufferInput> bufferInputs = packetMappingTarget.get(fieldName);

		List<String> newBufferIns = bufferInputs
			.stream()
			.map(BufferInput::getInstruction)
			.collect(Collectors.toList());

		if (newBufferIns.isEmpty())
			return; //no buffer instructions in this method

		modifyCallInstructions(method, newBufferIns);

		List<List<Instruction>> oldBufferArgs = packetMappingSource.get(fieldName)
			.stream()
			.map(BufferInput::getArgument)
			.collect(Collectors.toList());

		List<List<Instruction>> newBufferArgs = bufferInputs
			.stream()
			.map(BufferInput::getArgument)
			.collect(Collectors.toList());

		modifyCallArguments(method, oldBufferArgs, newBufferArgs);
	}

	/**
	 * Replaces old buffer write call types with new types
	 */
	private void modifyCallInstructions(MethodDeclaration method, List<String> newIns)
	{
		AtomicInteger idx = new AtomicInteger();
		method.findAll(MethodCallExpr.class).forEach(call ->
		{
			if (call.getScope().isPresent() && call.getScope().get().toString().endsWith("getPacketBuffer()"))
				call.setName(newIns.get(idx.getAndIncrement()));
		});
	}

	/**
	 * Replaces old buffer write call arguments in source files with new arguments
	 */
	private void modifyCallArguments(MethodDeclaration method, List<List<Instruction>> oldArgIns, List<List<Instruction>> newArgIns)
	{
		List<String> oldArgs = method.findAll(MethodCallExpr.class).stream()
			.filter(n -> n.getScope().isPresent()
				&& n.getScope().get() instanceof MethodCallExpr
				&& ((MethodCallExpr) n.getScope().get()).getNameAsString().equals("getPacketBuffer"))
			.map(n -> n.getArgument(0).toString())
			.collect(Collectors.toList());

		Map<Integer, String> lvtMap = mapLVTs(oldArgs, oldArgIns);

		Set<Integer> excludedIdxs = lvtMap.values()
			.stream()
			.map(oldArgs::indexOf)
			.collect(Collectors.toSet());
		Multimap<String, String> gfiMap = mapGFIs(oldArgs, oldArgIns, excludedIdxs);

		excludedIdxs.addAll(gfiMap.keys()
			.stream()
			.map(oldArgs::indexOf)
			.collect(Collectors.toSet()));
		Multimap<String, Integer> pciMap = mapPCIs(oldArgs, oldArgIns, excludedIdxs);

		List<String> newArgs = new ArrayList<>();
		for (int i = 0; i < oldArgIns.size(); i++)
		{
			//if only more argument left, it must be the correct one
			if (oldArgs.size() == 1)
			{
				newArgs.add(oldArgs.get(0));
				oldArgs.remove(oldArgs.get(0));
			}
			else
			{
				List<Instruction> resolvedIns = newArgIns.get(i);

				String sourceArg = findLVTArg(lvtMap, resolvedIns);

				if (sourceArg == null)
				{
					sourceArg = findGFIArg(gfiMap, resolvedIns);
				}

				if (sourceArg == null)
				{
					sourceArg = findPCIArg(pciMap, resolvedIns);
				}

				if (sourceArg == null)
				{
					logger.error("Unmapped args: {}", oldArgs);
					logger.error("Current resolved instructions: {}", resolvedIns);
					throw new IllegalStateException("Packet buffer instruction argument should never be null");
				}

				oldArgs.remove(sourceArg);
				newArgs.add(sourceArg);
			}
		}

		AtomicInteger idx = new AtomicInteger();
		method.findAll(MethodCallExpr.class).stream()
			.filter(n -> n.getScope().isPresent()
				&& n.getScope().get() instanceof MethodCallExpr
				&& ((MethodCallExpr) n.getScope().get()).getNameAsString().equals("getPacketBuffer"))
			.forEach(n -> n.setArgument(0, new NameExpr(newArgs.get(idx.getAndIncrement()))));
	}

	/**
	 * Maps the LVT index in the resolved instructions to the
	 * argument in packet source file
	 */
	private Map<Integer, String> mapLVTs(List<String> oldArgs, List<List<Instruction>> oldArgIns)
	{
		Map<Integer, String> lvts = new HashMap<>();
		for (int i = 0; i < oldArgs.size(); i++)
		{
			List<Instruction> resolvedIns = oldArgIns.get(i);
			for (Instruction ins : resolvedIns)
			{
				if (ins instanceof LVTInstruction)
				{
					lvts.put(((LVTInstruction) ins).getVariableIndex(), oldArgs.get(i));
					break;
				}
			}
		}

		return lvts;
	}

	/**
	 * Finds the associated source file argument for the variable index
	 * in the lvt instructions of the resolved target argument
	 */
	private String findLVTArg(Map<Integer, String> lvtMap, List<Instruction> resolvedIns)
	{
		for (Instruction ins : resolvedIns)
		{
			if (ins instanceof LVTInstruction)
				return lvtMap.get(((LVTInstruction) ins).getVariableIndex());
		}

		return null;
	}

	/**
	 * Maps the arguments in packet source file to any accessed field names
	 * in the resolved argument instructions, excluding any arguments already mapped
	 */
	private Multimap<String, String> mapGFIs(List<String> oldArgs, List<List<Instruction>> oldArgIns, Set<Integer> excludedIdxs)
	{
		List<String> filteredArgs = IntStream.range(0, oldArgs.size())
			.filter(i -> !excludedIdxs.contains(i))
			.mapToObj(oldArgs::get)
			.collect(Collectors.toList());
		List<List<Instruction>> filteredIns = IntStream.range(0, oldArgIns.size())
			.filter(i -> !excludedIdxs.contains(i))
			.mapToObj(oldArgIns::get)
			.collect(Collectors.toList());

		Multimap<String, String> gfis = HashMultimap.create();
		for (int i = 0; i < filteredIns.size(); i++)
		{
			List<Instruction> resolvedIns = filteredIns.get(i);
			for (Instruction ins : resolvedIns)
			{
				if (ins instanceof GetFieldInstruction)
				{
					GetFieldInstruction gfi = (GetFieldInstruction) ins;
					gfis.put(filteredArgs.get(i), gfi.getField().getName());
				}
			}
		}

		return gfis;
	}

	/**
	 * Finds the associated source file argument for the field name
	 * in the getField instructions of the resolved target argument
	 */
	private String findGFIArg(Multimap<String, String> gfiMap, List<Instruction> resolvedIns)
	{
		for (Instruction ins : resolvedIns)
		{
			if (ins instanceof GetFieldInstruction)
			{
				GetFieldInstruction gfi = (GetFieldInstruction) ins;
				for (String arg : gfiMap.keys())
				{
					for (String fieldName : gfiMap.get(arg))
					{
						if (fieldName.equals(gfi.getField().getName()))
							return arg;
					}
				}
			}
		}

		return null;
	}

	/**
	 * Maps the arguments in packet source file to any constants pushed
	 * in the resolved argument instructions, excluding any arguments
	 * already mapped
	 */
	private Multimap<String, Integer> mapPCIs(List<String> oldArgs, List<List<Instruction>> oldArgIns, Set<Integer> excludedIdxs)
	{
		List<String> filteredArgs = IntStream.range(0, oldArgs.size())
			.filter(i -> !excludedIdxs.contains(i))
			.mapToObj(oldArgs::get)
			.collect(Collectors.toList());
		List<List<Instruction>> filteredIns = IntStream.range(0, oldArgIns.size())
			.filter(i -> !excludedIdxs.contains(i))
			.mapToObj(oldArgIns::get)
			.collect(Collectors.toList());

		Multimap<String, Integer> pcis = HashMultimap.create();
		for (int i = 0; i < filteredIns.size(); i++)
		{
			List<Instruction> resolvedIns = filteredIns.get(i);
			for (Instruction ins : resolvedIns)
			{
				if (ins instanceof PushConstantInstruction)
				{
					PushConstantInstruction pci = (PushConstantInstruction) ins;
					pcis.put(filteredArgs.get(i), ((Number) pci.getConstant()).intValue());
				}
			}
		}

		return pcis;
	}

	/**
	 * Finds the associated source file argument for the constant
	 * in the pushConstant instructions of the resolved target argument
	 */
	private String findPCIArg(Multimap<String, Integer> pciMap, List<Instruction> resolvedIns)
	{
		for (Instruction ins : resolvedIns)
		{
			if (ins instanceof PushConstantInstruction)
			{
				PushConstantInstruction pci = (PushConstantInstruction) ins;
				for (String arg : pciMap.keys())
				{
					for (Integer constant : pciMap.get(arg))
					{
						if (constant == ((Number) pci.getConstant()).intValue())
							return arg;
					}
				}
			}
		}

		return null;
	}

	@SneakyThrows
	private void modifySourceFiles(List<File> javaFiles)
	{
		for (File file : javaFiles)
		{
			CompilationUnit cu = StaticJavaParser.parse(file);
			List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);

			for (MethodDeclaration method : methods)
			{
				fixBufferWrites(method);
			}

			String newFileName = file.getPath().replace(".java", "_modified.java");
			Files.write(Paths.get(newFileName), cu.toString().getBytes());
		}
	}

	/**
	 * Replaces packet source files with correct buffer write methods and arguments
	 */
	public void run()
	{
		Execution execution = new Execution(source);
		execution.addMethodContextVisitor(mctx -> visit(mctx, true));
		execution.populateInitialMethods();
		execution.run();

		execution = new Execution(target);
		execution.addMethodContextVisitor(mctx -> visit(mctx, false));
		execution.populateInitialMethods();
		execution.run();

		List<File> sourceFiles = loadPacketSourceFiles();
		modifySourceFiles(sourceFiles);
	}

	@Data
	static class BufferInput
	{
		private final String instruction;
		private final List<Instruction> argument; //resolved instructions can pop multiple things (e.g. IADD), so we flatmap all of these here
	}
}