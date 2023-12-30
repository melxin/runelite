package net.runelite.deob.deobfuscators.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.instruction.types.FieldInstruction;
import net.runelite.asm.attributes.code.instruction.types.GetFieldInstruction;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.Transformer;
import net.runelite.deob.deobfuscators.mapping.ParallelExecutorMapping;
import net.runelite.deob.util.JarUtil;

public class ObfuscatedGetterValueCorrectionTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(ObfuscatedGetterValueCorrectionTransformer.class);

	private final Map<Field, List<Number>> vanillaFieldValuesMap = new HashMap<>();

	private final ParallelExecutorMapping mapping;

	public ObfuscatedGetterValueCorrectionTransformer(ParallelExecutorMapping mapping)
	{
		this.mapping = mapping;
	}

	@Override
	public void transform(ClassGroup group)
	{
		ClassGroup vanillaGroup = JarUtil.load(DeobProperties.getVanilla());
		vanillaGroup.buildClassGraph();
		vanillaGroup.lookup();

		for (ClassFile vanillaCF : vanillaGroup)
		{
			if (vanillaCF.getName().contains("bouncycastle"))
			{
				continue;
			}

			for (Method vanillaMethod : vanillaCF.getMethods())
			{
				if (vanillaMethod == null || vanillaMethod.getCode() == null)
				{
					continue;
				}

				List<Instruction> ins = vanillaMethod.getCode().getInstructions().getInstructions();
				for (int i = 0; i < ins.size(); i++)
				{
					Instruction in = ins.get(i);

					Instruction shouldBeLDC = null;

					if (in instanceof GetFieldInstruction)
					{
						if (((GetFieldInstruction) in).getMyField() == null)
						{
							continue;
						}

						if (!((GetFieldInstruction) in).getMyField().getType().equals(Type.INT) && !((GetFieldInstruction) in).getMyField().getType().equals(Type.LONG))
						{
							continue;
						}

						try
						{
							if (i + 1 < ins.size() && shouldBeLDC == null)
							{
								shouldBeLDC = ins.get(i + 1) instanceof LDC ? ins.get(i + 1) : null;
							}
							else if (i >= 1 && shouldBeLDC == null)
							{
								shouldBeLDC = ins.get(i - 1) instanceof LDC ? ins.get(i - 1) : null;
							}
							else if (i + 2 < ins.size() && shouldBeLDC == null)
							{
								shouldBeLDC = ins.get(i + 2) instanceof LDC ? ins.get(i + 2) : null;
							}
							else if (i >= 2 && shouldBeLDC == null)
							{
								shouldBeLDC = ins.get(i - 2) instanceof LDC ? ins.get(i - 2) : null;
							}
						}
						catch (IndexOutOfBoundsException e)
						{
							logger.info("", e);
							continue;
						}
					}

					if (shouldBeLDC != null && shouldBeLDC instanceof LDC && ((LDC) shouldBeLDC).getConstant() instanceof Number)
					{
						Number vanillaValue = (Number) ((LDC) shouldBeLDC).getConstant();
						if (vanillaValue.byteValue() == 1)
						{
							continue;
						}

						if (!vanillaFieldValuesMap.containsKey(((GetFieldInstruction) in).getMyField()))
						{
							ArrayList<Number> valueList = new ArrayList<>();
							valueList.add(vanillaValue);
							vanillaFieldValuesMap.put(((GetFieldInstruction) in).getMyField(), valueList);
						}
						else
						{
							vanillaFieldValuesMap.get(((GetFieldInstruction) in).getMyField()).add(vanillaValue);
						}
					}
				}
			}
		}

		for (ClassFile cf : group.getClasses())
		{
			for (Field f : cf.getFields())
			{
				if (!f.getAnnotations().containsKey(DeobAnnotations.OBFUSCATED_GETTER))
				{
					continue;
				}

				Annotation obfuscatedGetter = f.getAnnotations().get(DeobAnnotations.OBFUSCATED_GETTER);
				Number obfuscatedGetterValue = obfuscatedGetter.get("intValue") != null ? (Number) obfuscatedGetter.get("intValue") : obfuscatedGetter.get("longValue") != null ? (Number) obfuscatedGetter.get("longValue") : null;
				//logger.info("ObfuscatedGetter: {} | value: {}", obfuscatedGetter, obfuscatedGetterValue);

				String obfuscatedClassName = DeobAnnotations.getObfuscatedName(cf);
				String obfuscatedFieldName = DeobAnnotations.getObfuscatedName(f);
				Field mappedField = (Field) mapping.getMap().entrySet().stream().filter(e -> e.getValue().equals(f)).map(Map.Entry::getKey).findFirst().orElse(null);

				List<Number> values = vanillaFieldValuesMap.entrySet().stream().filter(e -> e.getKey().getClassFile().getName().equals(obfuscatedClassName) && e.getKey().getName().equals(obfuscatedFieldName)).map(Map.Entry::getValue).findFirst().orElse(null);
				int mostDuplications = 0;
				Number predictedValue = null;
				if (values != null)
				{
					for (Number n : values)
					{
						int duplication = Collections.frequency(values, n);
						if (duplication > mostDuplications)
						{
							mostDuplications = duplication;
							predictedValue = n;
						}
					}

					/*if (obfuscatedGetterValue.intValue() < predictedValue.intValue())
					{
						continue;
					}*/
					if (!values.contains(obfuscatedGetterValue))
					{
						logger.info("found incorrect obfget: {} != {} for field: {} ({}.{}) mapped: {}", obfuscatedGetterValue, values.get(0), f, obfuscatedClassName, obfuscatedFieldName, mappedField);
						/*if (predictedValue instanceof Long)
						{
							obfuscatedGetter.setElement("longValue", predictedValue);
						}
						else if (predictedValue instanceof Integer)
						{
							obfuscatedGetter.setElement("intValue", predictedValue);
						}*/
						//logger.info("inversed: {}", modInverse((Integer) obfuscatedGetterValue.intValue()));
					}
					//logger.info("found values: {} for field: {}", values, obfuscatedFieldName);
				}
			}
		}
	}

	public int modInverse(int val)
	{
		return modInverse(BigInteger.valueOf(val), 32).intValue();
	}

	private BigInteger modInverse(BigInteger val, int bits)
	{
		BigInteger shift = BigInteger.ONE.shiftLeft(bits);
		return val.modInverse(shift);
	}
}
