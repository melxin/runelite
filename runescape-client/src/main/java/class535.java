import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("up")
public class class535 {
	@ObfuscatedName("af")
	static int[] field5657;
	@ObfuscatedName("ae")
	public static int[] field5655;

	static {
		field5657 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5657[var0] = method10670(var0);
		}

		method10671();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2050202735"
	)
	static final int method10670(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D;
		double var3 = (double)(var0 >> 5 & 31) / 31.0D;
		double var5 = (double)(var0 & 31) / 31.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var7 + var9) / 2.0D;
		if (var9 != var7) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var9 == var5) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = 256.0D * var13;
		if (var18 < 0.0D) {
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995D) {
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D);
		return (int)(128.0D * var15) + (var20 << 7);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-1802308754"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.field2186.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	static void method10671() {
		if (field5655 == null) {
			field5655 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + 6.0D * (var15 - var17) * var19;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = var17 + (0.6666666666666666D - var3) * (var15 - var17) * 6.0D;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = 6.0D * (var15 - var17) * var23 + var17;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = 6.0D * (var15 - var17) * (0.6666666666666666D - var23) + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(256.0D * var9);
				int var16 = (int)(var11 * 256.0D);
				int var26 = (int)(var13 * 256.0D);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5655[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-482686104"
	)
	public static int method10672(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1340624154"
	)
	static int method10673(int var0, Script var1, boolean var2) {
		Widget var3;
		int var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			var3 = class35.widgetDefinition.method7496(var4);
		} else {
			var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			int var15 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class365 var16 = var3.method8041();
				if (var16 != null && var16.method7811(var4, var15)) {
					class154.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var4;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var15;
				if (var3.scrollY > var3.scrollHeight - var3.height * -171267385) {
					var3.scrollY = var3.scrollHeight - var3.height * -171267385;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class154.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			UrlRequest.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 5];
			class154.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			if (var4 != var3.sequenceId) {
				var3.sequenceId = var4;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class154.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			class154.invalidateWidget(var3);
			return 1;
		} else {
			String var17;
			class365 var18;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var17 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				if (var3.type == 12) {
					var18 = var3.method8041();
					if (var18 != null && var18.method7664()) {
						var18.method7614(var17);
					} else {
						var3.text = var17;
					}

					class154.invalidateWidget(var3);
				} else if (!var17.equals(var3.text)) {
					var3.text = var17;
					class154.invalidateWidget(var3);
				}

				return 1;
			} else {
				class365 var21;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (var3.type == 12) {
						var21 = var3.method8041();
						if (var21 != null) {
							var21.method7625();
						}
					}

					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					UrlRequest.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var21 = var3.method8041();
						if (var21 != null) {
							var21.method7729(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
							var21.method7623(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					}

					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					class154.invalidateWidget(var3);
					if (var3.type == 0) {
						Widget[] var23 = var3.childIndex * -2066937045 == -1 ? class35.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class35.widgetDefinition.method7496(var3.parentId).children;
						VarcInt.revalidateWidgetScroll(var23, var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class507.resumePauseWidget(var3.id, var3.childIndex * -2066937045);
					Client.meslayerContinueWidget = var3;
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class154.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					FillMode var19 = (FillMode)ScriptFrame.findEnumerated(ArchiveDiskActionHandler.FillMode_values(), var4);
					if (var19 != null) {
						var3.fillMode = var19;
						class154.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						var3.field4180 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field4212 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
						class154.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7944((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], "", PcmPlayer.urlRequester, Varcs.getUserId());
						return 1;
					} else if (var0 == 1131) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var3.method7948(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7949((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
						return 1;
					} else {
						class359 var22;
						if (var0 == 1133) {
							--UrlRequest.Interpreter_intStackSize;
							var22 = var3.method7921();
							if (var22 != null) {
								var22.field4074 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--UrlRequest.Interpreter_intStackSize;
							var22 = var3.method7921();
							if (var22 != null) {
								var22.field4069 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--Message.Interpreter_objectStackSize;
							var21 = var3.method8041();
							if (var21 != null) {
								var3.text2 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--UrlRequest.Interpreter_intStackSize;
							var22 = var3.method7921();
							if (var22 != null) {
								var22.field4070 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null && var21.method7842(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize])) {
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null && var21.method7619(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize])) {
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null && var21.method7620(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize])) {
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							Client.field491.method6096();
							var18 = var3.method8041();
							if (var18 != null && var18.method7883(var14)) {
								if (var14) {
									Client.field491.method6116(var3);
								}

								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field491.method6094() == var3) {
								Client.field491.method6096();
								class154.invalidateWidget(var3);
							}

							var18 = var3.method8041();
							if (var18 != null) {
								var18.method7732(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var21 = var3.method8041();
							if (var21 != null && var21.method7718(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1])) {
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null && var21.method7718(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize])) {
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null) {
								var21.method7673(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
								class154.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null) {
								var21.method7748(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null) {
								var21.method7624(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--UrlRequest.Interpreter_intStackSize;
							var21 = var3.method8041();
							if (var21 != null) {
								var21.method7716(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
								class154.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var20;
							if (var0 == 1148) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var20 = var3.method7963();
								if (var20 != null) {
									var20.method406(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var20 = var3.method7963();
								if (var20 != null) {
									var20.method407((char)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method8038((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], PcmPlayer.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								Message.Interpreter_objectStackSize -= 3;
								var17 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
								String var13 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
								String var6 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 2];
								long var7 = Varcs.getUserId();
								long var9 = WorldMapSection0.getUserHash();
								String var11 = FloorUnderlayDefinition.getPlatformInfo().getDeviceId(FloorUnderlayDefinition.getPlatformInfo().os);
								if (var7 != -1L) {
									var17 = var17.replaceAll("%userid%", Long.toString(var7));
								}

								if (-1L != var9) {
									var17 = var17.replaceAll("%userhash%", Long.toString(var9));
								}

								if (!var11.isEmpty()) {
									var17 = var17.replaceAll("%deviceid%", var11);
								}

								var3.method7945(var17, var13, var6, var11, Long.toString(var9), PcmPlayer.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class255 var12 = var3.method7957();
									boolean var5 = var12 != null && var12.method5875() && class32.method493().method5992(var12.method5891());
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}
}
