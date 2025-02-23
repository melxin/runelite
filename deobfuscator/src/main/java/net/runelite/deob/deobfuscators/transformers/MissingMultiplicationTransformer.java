/*
 * Copyright (c) 2025, Melxin <https://github.com/melxin>
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
package net.runelite.deob.deobfuscators.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.IAdd;
import net.runelite.asm.attributes.code.instructions.IMul;
import net.runelite.asm.attributes.code.instructions.LAdd;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.attributes.code.instructions.LMul;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.Transformer;
import net.runelite.deob.util.JarUtil;

/**
 * Fix missing multiplications(ObfuscatedGetter) from Widget and Menu
 */
public class MissingMultiplicationTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(MissingMultiplicationTransformer.class);

	private final List<Field> missingObfuscatedGetters = new ArrayList<>();
	private final Map<Field, Number> existingMultiplications = new HashMap<>();
	private final Map<Field, List<Number>> foundMultiplications = new HashMap<>();

	@Override
	public void transform(ClassGroup group)
	{
		fixMissingMultiplications(group);
		fixIncorrectMultiplications(); // depends on fixMissingMultiplications
	}

	private void fixMissingMultiplications(ClassGroup group)
	{
		for (ClassFile cf : group.getClasses())
		{
			List<Field> fields = cf.getFields();
			for (Field field : fields)
			{
				if (!field.getType().equals(Type.INT) && !field.getType().equals(Type.LONG))
				{
					continue;
				}

				Annotation obfuscatedGetter = field.getAnnotations().get(DeobAnnotations.OBFUSCATED_GETTER);
				if (obfuscatedGetter == null)
				{
					//logger.error("No obfuscatedGetter present at field: {}.{}", cf.getName(), field.getName());
					missingObfuscatedGetters.add(field);
					continue;
				}

				Number obfuscatedGetterValue = field.getType().equals(Type.INT) ? (Number) obfuscatedGetter.get("intValue") : (Number) obfuscatedGetter.get("longValue");
				existingMultiplications.put(field, obfuscatedGetterValue);
			}

			List<Method> methods = cf.getMethods();
			for (Method method : methods)
			{
				Code code = method.getCode();
				if (code == null)
				{
					continue;
				}
				Instructions instructions = code.getInstructions();
				List<Instruction> ins = instructions.getInstructions();
				for (int i = 0; i < ins.size(); i++)
				{
					Instruction in = ins.get(i);
					if (in instanceof GetField && missingObfuscatedGetters.contains(((GetField) in).getMyField()))
					{
						Instruction multiplication = i + 1 < ins.size() ? ins.get(i + 1) : null;
						Instruction IAddOrLAdd = i + 2 < ins.size() ? ins.get(i + 2) : null;
						if (multiplication != null && multiplication instanceof LDC && (IAddOrLAdd == null || !(IAddOrLAdd instanceof IAdd) && !(IAddOrLAdd instanceof LAdd)))
						{
							Field targetField = ((GetField) in).getMyField();
							ClassFile targetClassFile = targetField.getClassFile();

							if (targetClassFile.getName().equals("Widget") || targetClassFile.getName().equals("Menu"))
							{
								Number constant = ((LDC) multiplication).getNumber();

								Annotation exportAnnotation = targetField.getAnnotations().get(DeobAnnotations.EXPORT);
								targetField.getAnnotations().remove(DeobAnnotations.EXPORT);

								targetField.addAnnotation(DeobAnnotations.OBFUSCATED_GETTER, targetField.getType().equals(Type.INT) ? "intValue" : "longValue", constant);
								targetField.addAnnotation(exportAnnotation);

								logger.info("Added missing obfuscatedGetter: {} for field: {}.{}", constant, targetClassFile.getName(), targetField.getName());
								missingObfuscatedGetters.remove(targetField);
							}
						}
					}
				}
			}
		}
	}

	private void fixIncorrectMultiplications()
	{
		ClassGroup vanillaGroup = JarUtil.load(DeobProperties.getVanilla());
		vanillaGroup.buildClassGraph();
		vanillaGroup.lookup();

		for (ClassFile vanillaCF : vanillaGroup.getClasses())
		{
			List<Method> methods = vanillaCF.getMethods();
			for (Method method : methods)
			{
				Code code = method.getCode();
				if (code == null)
				{
					continue;
				}
				Instructions instructions = code.getInstructions();
				List<Instruction> ins = instructions.getInstructions();
				for (int i = 0; i < ins.size(); i++)
				{
					Instruction in = ins.get(i);
					if (in instanceof GetField)
					{
						Field targetField = ((GetField) in).getMyField();
						if (targetField == null)
						{
							continue;
						}
						ClassFile targetClassFile = targetField.getClassFile();

						Field existingField = existingMultiplications.keySet().stream().filter(f -> DeobAnnotations.getObfuscatedName(f.getClassFile()).equals(targetClassFile.getName()) && DeobAnnotations.getObfuscatedName(f).equals(((GetField) in).getMyField().getName())).findFirst().orElse(null);
						if (existingField == null
							|| (!existingField.getName().equals("x")
							&& !existingField.getName().equals("y")
							&& !existingField.getName().equals("tileX")
							&& !existingField.getName().equals("tileY"))
							|| (!existingField.getClassFile().getName().equals("BoundaryObject")
							&& !existingField.getClassFile().getName().equals("WallDecoration")
							&& !existingField.getClassFile().getName().equals("FloorDecoration")
							&& !existingField.getClassFile().getName().equals("ItemLayer")
							&& !existingField.getClassFile().getName().equals("WorldMapRenderer")))
						{
							continue;
						}

						Instruction multiplication = i + 1 < ins.size() ? ins.get(i + 1) : null;
						Instruction mul = i + 2 < ins.size() ? ins.get(i + 2) : null;
						if (multiplication != null && multiplication instanceof LDC && mul != null && (mul instanceof IMul || mul instanceof LMul))
						{
							Number foundConstant = ((LDC) multiplication).getNumber();

							if (!foundMultiplications.containsKey(existingField))
							{
								ArrayList<Number> valueList = new ArrayList<>();
								valueList.add(foundConstant);
								foundMultiplications.put(existingField, valueList);
							}
							else
							{
								foundMultiplications.get(existingField).add(foundConstant);
							}
						}
						else
						{
							Instruction aload = i - 1 > 0 ? ins.get(i - 1) : null;
							Instruction constant = i - 2 > 0 ? ins.get(i - 2) : null;
							if (aload != null && aload instanceof ALoad && constant != null && constant instanceof LDC)
							{
								Number foundConstant = ((LDC) constant).getNumber();
								if (!foundMultiplications.containsKey(existingField))
								{
									ArrayList<Number> valueList = new ArrayList<>();
									valueList.add(foundConstant);
									foundMultiplications.put(existingField, valueList);
								}
								else
								{
									foundMultiplications.get(existingField).add(foundConstant);
								}
							}
						}
					}
				}
			}
		}

		foundMultiplications.entrySet().stream().forEach((entry) ->
		{
			Field existingField = entry.getKey();
			List<Number> multiplications = entry.getValue();

			int mostDuplications = 0;
			Number predictedValue = null;
			if (multiplications != null)
			{
				for (Number n : multiplications)
				{
					int duplication = Collections.frequency(multiplications, n);
					if (duplication > mostDuplications)
					{
						mostDuplications = duplication;
						predictedValue = n;
					}
				}
				Number existingMultiplication = existingMultiplications.get(existingField);
				if (predictedValue != null && !existingMultiplication.toString().equals(String.valueOf(predictedValue)))
				{
					existingField.getAnnotations().get(DeobAnnotations.OBFUSCATED_GETTER).setElement(existingField.getType().equals(Type.INT) ? "intValue" : "longValue", predictedValue);
					logger.info("Changed incorrect obfuscatedGetter: {} -> {} for field: {}.{}", existingMultiplication, predictedValue, existingField.getClassFile().getName(), existingField.getName());
				}
			}
		});
	}
}