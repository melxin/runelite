package net.runelite.deob.deobfuscators.transformers;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.VarInsnNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.LLoad;
import net.runelite.asm.attributes.code.instructions.LMul;
import net.runelite.deob.Transformer;

public class VariableExprFixer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(VariableExprFixer.class);

	private int count = 0;

	@Override
	public void transform(ClassGroup group)
	{
		for (ClassFile cf : group)
		{
			for (Method method : cf.getMethods().stream()
				.filter(m -> m.getCode() != null)
				.collect(Collectors.toList()))
			{
				//LabelMap labelMap = new LabelMap();
				Code code = method.getCode();
				Instructions instructions = code.getInstructions();
				List<Instruction> ins = instructions.getInstructions();

				for (int i = 0; i < ins.size(); i++)
				{
					if (i < 2 || i + 1 >= ins.size())
					{
						continue;
					}
					Instruction in = ins.get(i);
					Instruction previousIn = ins.get(i - 1);
					Instruction previousPreviousIn = ins.get(i - 2);
					Instruction nextIn = ins.get(i + 1);

					if (in instanceof GetField)
					{
						if (((GetField) in).getMyField() == null)
						{
							continue;
						}

						if (!((GetField) in).getMyField().getType().equals(Type.INT) && !((GetField) in).getMyField().getType().equals(Type.LONG))
						{
							continue;
						}

						if (previousIn instanceof ALoad && previousPreviousIn instanceof LDC && ((LDC) previousPreviousIn).getConstant() instanceof Number && (nextIn instanceof IMul || nextIn instanceof LMul))
						{
							Instruction getField = in;
							Instruction aload = previousIn;
							Instruction ldc = previousPreviousIn;
							ins.set(i - 2, aload); // Swap LDC -> ALOAD
							ins.set(i - 1, getField); // Swap ALOAD -> GetField
							ins.set(i, ldc); // Swap GetField -> LDC
							// MUL here
							count++;
						}
					}
					else if (in instanceof GetStatic && previousIn instanceof LDC && ((LDC) previousIn).getConstant() instanceof Number && (nextIn instanceof IMul || nextIn instanceof LMul))
					{
						ins.set(i - 1, in); // Swap LDC -> GetStatic
						ins.set(i, previousIn); // Swap GetStatic -> LDC
						count++;
					}
					else if ((in instanceof ILoad || in instanceof LLoad) && previousIn instanceof LDC && ((LDC) previousIn).getConstant() instanceof Number && (nextIn instanceof IMul || nextIn instanceof LMul))
					{
						ins.set(i - 1, in); // Swap LDC -> LOAD
						ins.set(i, previousIn); // Swap LOAD -> LDC
						count++;
					}
					/*else if (in instanceof ALoad && (nextIn instanceof ILoad || nextIn instanceof LLoad))
					{
						if (i + 2 < ins.size() && ins.get(i + 2) instanceof LDC && ((LDC) ins.get(i + 2)).getConstant() instanceof Number)
						{
							if (i + 3 < ins.size() && (ins.get(i + 3) instanceof IMul || ins.get(i + 3) instanceof LMul))
							{
								if (i + 4 < ins.size() && ins.get(i + 4) instanceof LDC)
								{
									ins.set(i + 1, ins.get(i + 2)); // Swap Iload with LDC 1
									ins.set(i + 2, ins.get(i + 4)); // Swap LDC 1 With LDC 2
									ins.set(i + 3, ins.get(i + 1)); // Swap Mul with Iload
									ins.set(i + 4, ins.get(i + 3)); // Swap LDC 2 with Mul
								}
							}
						}
					}*/

					/*else if (previousIn.getType().getCode() == Opcodes.GETFIELD && (isVarInsnNode(previousPreviousIn.getType().getCode()) || previousPreviousIn.getType().getCode() == Opcodes.GETSTATIC) && isConstant(previousPreviousPreviousIn.getType().getCode()))
					{
						Instruction newLeft0 = previousPreviousIn.clone();
						Instruction newLeft1 = previousIn.clone();
						Instruction newRight = previousPreviousPreviousIn.clone();
						ins.set(i - 3, newLeft0);
						ins.set(i - 2, newLeft1);
						ins.set(i - 1, newRight);
						count++;
					}
					else if (previousIn.getType().getCode() == Opcodes.GETSTATIC && isConstant(previousPreviousIn.getType().getCode()))
					{
						Instruction newLeft = previousIn.clone();
						Instruction newRight = previousPreviousIn.clone();
						ins.set(i - 2, newLeft);
						ins.set(i - 1, newRight);
						count++;
					}*/
				}
			}
		}

		logger.info("Reordered " + count + " variable binary expressions.");
	}

	private boolean isOrderable(int opcode)
	{
		return opcode == Opcodes.IF_ICMPEQ || opcode == Opcodes.IF_ICMPNE || opcode == Opcodes.IF_ACMPEQ || opcode == Opcodes.IF_ACMPNE
			|| (opcode >= Opcodes.IMUL && opcode <= Opcodes.DMUL) || (opcode >= Opcodes.IADD && opcode <= Opcodes.DADD);
	}

	private boolean isConstant(int opcode)
	{
		return opcode >= Opcodes.ICONST_M1 && opcode <= Opcodes.LDC;
	}

	private boolean isVarInsnNode(int opcode)
	{
		return opcode == VarInsnNode.FIELD_INSN;
	}
}
