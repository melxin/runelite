import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rm")
public class class454 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "17"
	)
	public static int method8933(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-166948006"
	)
	static int method8934(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			var3 = ClanChannel.widgetDefinition.method7031(var4);
		} else {
			var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class359 var17 = var3.method7444();
				if (var17 != null && var17.method7138(var23, var16)) {
					UserComparator8.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				UserComparator8.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			ScriptFrame.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 5];
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				UserComparator8.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			UserComparator8.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class359 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7444();
					if (var21 != null && var21.method7276()) {
						var21.method7131(var15);
					} else {
						var3.text = var15;
					}

					UserComparator8.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					UserComparator8.invalidateWidget(var3);
				}

				return 1;
			} else {
				class359 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7444();
						if (var19 != null) {
							var19.method7145();
						}
					}

					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					ScriptFrame.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7444();
						if (var19 != null) {
							var19.method7345(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
							var19.method7311(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
					}

					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					UserComparator8.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class212.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					UserComparator8.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					FillMode var22 = (FillMode)StructComposition.findEnumerated(class309.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						UserComparator8.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						var3.field3907 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3908 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
						UserComparator8.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7426(Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize], "", class280.urlRequester, MilliClock.getUserId());
						return 1;
					} else if (var0 == 1131) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						var3.method7521(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7546(Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
						return 1;
					} else {
						class353 var20;
						if (var0 == 1133) {
							--ScriptFrame.Interpreter_intStackSize;
							var20 = var3.method7445();
							if (var20 != null) {
								var20.field3783 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--ScriptFrame.Interpreter_intStackSize;
							var20 = var3.method7445();
							if (var20 != null) {
								var20.field3781 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--HealthBarConfig.Interpreter_stringStackSize;
							var19 = var3.method7444();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--ScriptFrame.Interpreter_intStackSize;
							var20 = var3.method7445();
							if (var20 != null) {
								var20.field3782 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null && var19.method7212(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize])) {
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null && var19.method7136(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize])) {
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null && var19.method7379(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize])) {
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							Client.field575.method5738();
							var21 = var3.method7444();
							if (var21 != null && var21.method7129(var14)) {
								if (var14) {
									Client.field575.method5727(var3);
								}

								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field575.method5728() == var3) {
								Client.field575.method5738();
								UserComparator8.invalidateWidget(var3);
							}

							var21 = var3.method7444();
							if (var21 != null) {
								var21.method7128(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							var19 = var3.method7444();
							if (var19 != null && var19.method7285(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1])) {
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null && var19.method7285(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize])) {
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null) {
								var19.method7142(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null) {
								var19.method7141(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null) {
								var19.method7144(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--ScriptFrame.Interpreter_intStackSize;
							var19 = var3.method7444();
							if (var19 != null) {
								var19.method7143(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
								UserComparator8.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var18 = var3.method7535();
								if (var18 != null) {
									var18.method408(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var18 = var3.method7535();
								if (var18 != null) {
									var18.method407((char)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7428(Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize], class280.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								HealthBarConfig.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 2];
								long var8 = MilliClock.getUserId();
								long var10 = EnumComposition.getUserHash();
								String var12 = class225.getPlatformInfo().getDeviceId(class225.getPlatformInfo().os);
								if (var8 != -1L) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (-1L != var10) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7427(var15, var13, var7, var12, Long.toString(var10), class280.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class212 var5 = var3.method7440();
									boolean var6 = var5 != null && var5.method4845() && class143.method3517().method4983(var5.method4853());
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
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

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(II)Lvr;",
		garbageValue = "-1349481154"
	)
	static DbTable method8935(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(HitSplatDefinition.field2777, var0);
		}

		return var1;
	}
}
