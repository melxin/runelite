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
import java.util.List;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.GetField;
import net.runelite.asm.attributes.code.instructions.IAdd;
import net.runelite.asm.attributes.code.instructions.LAdd;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.Transformer;

/**
 * Fix missing multiplications(ObfuscatedGetter) from Widget and Menu
 */
public class MissingMultiplicationTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(MissingMultiplicationTransformer.class);

	private final List<Field> missingObfuscatedGetters = new ArrayList<>();

	@Override
	public void transform(ClassGroup group)
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

				//Number obfuscatedGetterValue = obfuscatedGetter.get("intValue") != null ? (Number) obfuscatedGetter.get("intValue") : obfuscatedGetter.get("longValue") != null ? (Number) obfuscatedGetter.get("longValue") : null;
				//logger.info("obfuscatedGetterValue: {}", obfuscatedGetterValue.toString());
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
}