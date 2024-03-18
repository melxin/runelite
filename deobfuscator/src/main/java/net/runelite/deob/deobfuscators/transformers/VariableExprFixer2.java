package net.runelite.deob.deobfuscators.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.MethodContext;
import net.runelite.deob.Transformer;

public class VariableExprFixer2 implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(VariableExprFixer2.class);
	private int count;

	@Override
	public void transform(ClassGroup group)
	{
		group.buildClassGraph();

		Execution e = new Execution(group);
		e.addMethodContextVisitor(i -> visit(i));
		e.populateInitialMethods();
		e.run();

		logger.info("Reordered " + count + " variable binary expressions.");
	}

	private void visit(MethodContext ctx)
	{
		Instructions ins = ctx.getMethod().getCode().getInstructions();
		for (int i = 0; i < ins.size(); i ++)
		{
			Instruction orderable = ins.getInstructions().get(i);
			if (isOrderable(orderable.getType()))
			{
				Instruction previousIn = ins.getInstructions().get(i - 1);
				Instruction previousPreviousIn = ins.getInstructions().get(i - 2);
				Instruction previousPreviousPreviousIn = ins.getInstructions().get(i - 3);

				if (isVarIns(previousIn.getType()) && isConstant(previousPreviousIn.getType()))
				{
					Instruction newLeft = previousPreviousIn.clone();
					Instruction newRight = previousIn.clone();
					ins.getInstructions().set(i - 2, newRight);
					ins.getInstructions().set(i - 1, newLeft);
					count++;
				}
				else if (previousIn instanceof GetField && (isVarIns(previousPreviousIn.getType()) || previousPreviousIn instanceof GetStatic) && isConstant(previousPreviousPreviousIn.getType()))
				{
					Instruction newLeft0 = previousPreviousIn.clone();
					Instruction newLeft1 = previousIn.clone();
					Instruction newRight = previousPreviousPreviousIn.clone();
					ins.getInstructions().set(i - 3, newLeft0);
					ins.getInstructions().set(i - 2, newLeft1);
					ins.getInstructions().set(i - 1, newRight);
					count++;
				}
				else if(previousIn instanceof GetStatic && isConstant(previousPreviousIn.getType()))
				{
					Instruction newLeft = previousIn.clone();
					Instruction newRight = previousPreviousIn.clone();
					ins.getInstructions().set(i - 2, newLeft);
					ins.getInstructions().set(i - 1, newRight);
					count++;
				}
			}
		}
	}

	private boolean isVarIns(InstructionType type)
	{
		switch (type)
		{
			case ILOAD:
			case LLOAD:
			case FLOAD:
			case DLOAD:
			case ALOAD:
			case ISTORE:
			case LSTORE:
			case FSTORE:
			case DSTORE:
			case ASTORE:
			case RETURN:
				return true;
			default:
				return false;
		}
	}

	private boolean isOrderable(InstructionType type)
	{
		switch (type)
		{
			case IADD:
			case LADD:
			case FADD:
			case DADD:
			case IMUL:
			case LMUL:
			case FMUL:
			case DMUL:
			case IF_ICMPEQ:
			case IF_ICMPNE:
			case IF_ACMPEQ:
			case IF_ACMPNE:

				/*

    IF_ICMPEQ
    IF_ICMPNE
    IF_ACMPEQ
    IF_ACMPNE
    IMUL
    DMUL
    IADD
    DADD

				 */
				return true;
			default:
				return false;
		}
	}

	private boolean isConstant(InstructionType type)
	{
		switch (type)
		{
			case ICONST_M1:
			case ICONST_0:
			case ICONST_1:
			case ICONST_2:
			case ICONST_3:
			case ICONST_4:
			case ICONST_5:
			case LCONST_0:
			case LCONST_1:
			case FCONST_0:
			case FCONST_1:
			case FCONST_2:
			case DCONST_0:
			case DCONST_1:
			case BIPUSH:
			case SIPUSH:
			case LDC:
				return true;
			default:
				return false;
		}
	}
}
