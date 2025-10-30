import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("wa")
public class class575 {
	@ObfuscatedName("ag")
	static final char[] field5903;
	@ObfuscatedName("an")
	static final char[] field5905;

	static {
		field5903 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field5905 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "110"
	)
	static int method11318(int var0, Script var1, boolean var2) {
		Widget var3;
		int var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			var3 = class226.widgetDefinition.method7728(var4);
		} else {
			var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class408.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			int var15 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class378 var16 = var3.method8194();
				if (var16 != null && var16.method7849(var4, var15)) {
					class376.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var4;
				if (var3.scrollX > var3.scrollWidth - var3.width * -1946208531) {
					var3.scrollX = var3.scrollWidth - var3.width * -1946208531;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var15;
				if (var3.scrollY > var3.scrollHeight - var3.height * -905446999) {
					var3.scrollY = var3.scrollHeight - var3.height * -905446999;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class376.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class408.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 5];
			class376.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			if (var4 != var3.sequenceId) {
				var3.sequenceId = var4;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class376.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			class376.invalidateWidget(var3);
			return 1;
		} else {
			String var17;
			class378 var18;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var17 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				if (var3.type == 12) {
					var18 = var3.method8194();
					if (var18 != null && var18.method8105()) {
						var18.method7842(var17);
					} else {
						var3.text = var17;
					}

					class376.invalidateWidget(var3);
				} else if (!var17.equals(var3.text)) {
					var3.text = var17;
					class376.invalidateWidget(var3);
				}

				return 1;
			} else {
				class378 var21;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (var3.type == 12) {
						var21 = var3.method8194();
						if (var21 != null) {
							var21.method8025();
						}
					}

					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class408.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var21 = var3.method8194();
						if (var21 != null) {
							var21.method7850(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
							var21.method7962(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					}

					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class408.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					class376.invalidateWidget(var3);
					if (var3.type == 0) {
						Widget[] var23 = var3.childIndex * 2077538819 == -1 ? class226.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class226.widgetDefinition.method7728(var3.parentId).children;
						class339.revalidateWidgetScroll(var23, var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					HealthBarDefinition.resumePauseWidget(var3.id, var3.childIndex * 2077538819);
					Client.meslayerContinueWidget = var3;
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class376.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					FillMode var19 = (FillMode)GrandExchangeOffer.findEnumerated(class299.FillMode_values(), var4);
					if (var19 != null) {
						var3.fillMode = var19;
						class376.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						var3.field4251 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field4254 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
						class376.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method8257((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], "", class164.urlRequester, class6.getUserId());
						return 1;
					} else if (var0 == 1131) {
						class408.Interpreter_intStackSize -= 2;
						var3.method8180(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method8181((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
						return 1;
					} else {
						class372 var22;
						if (var0 == 1133) {
							--class408.Interpreter_intStackSize;
							var22 = var3.method8195();
							if (var22 != null) {
								var22.field4127 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--class408.Interpreter_intStackSize;
							var22 = var3.method8195();
							if (var22 != null) {
								var22.field4126 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							var21 = var3.method8194();
							if (var21 != null) {
								var3.text2 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--class408.Interpreter_intStackSize;
							var22 = var3.method8195();
							if (var22 != null) {
								var22.field4122 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null && var21.method7846(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize])) {
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null && var21.method8042(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize])) {
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null && var21.method8070(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize])) {
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							Client.widgetFocusInputManager.method6268();
							var18 = var3.method8194();
							if (var18 != null && var18.method7840(var14)) {
								if (var14) {
									Client.widgetFocusInputManager.method6267(var3);
								}

								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (!var14 && Client.widgetFocusInputManager.method6266() == var3) {
								Client.widgetFocusInputManager.method6268();
								class376.invalidateWidget(var3);
							}

							var18 = var3.method8194();
							if (var18 != null) {
								var18.method7841(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							class408.Interpreter_intStackSize -= 2;
							var21 = var3.method8194();
							if (var21 != null && var21.method7861(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1])) {
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null && var21.method7861(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize])) {
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null) {
								var21.method7902(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
								class376.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null) {
								var21.method7900(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null) {
								var21.method7931(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class408.Interpreter_intStackSize;
							var21 = var3.method8194();
							if (var21 != null) {
								var21.method7905(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]);
								class376.invalidateWidget(var3);
							}

							return 1;
						} else {
							class28 var20;
							if (var0 == 1148) {
								class408.Interpreter_intStackSize -= 2;
								var20 = var3.method8280();
								if (var20 != null) {
									var20.method424(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class408.Interpreter_intStackSize -= 2;
								var20 = var3.method8280();
								if (var20 != null) {
									var20.method460((char)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method8178((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], class164.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								SecureRandomFuture.Interpreter_objectStackSize -= 3;
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
								String var13 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								String var6 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 2];
								long var7 = class6.getUserId();
								long var9 = class40.getUserHash();
								String var11 = class282.getPlatformInfo().getDeviceId(class282.getPlatformInfo().os);
								if (-1L != var7) {
									var17 = var17.replaceAll("%userid%", Long.toString(var7));
								}

								if (var9 != -1L) {
									var17 = var17.replaceAll("%userhash%", Long.toString(var9));
								}

								if (!var11.isEmpty()) {
									var17 = var17.replaceAll("%deviceid%", var11);
								}

								var3.method8177(var17, var13, var6, var11, Long.toString(var9), class164.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class225 var12 = var3.method8190();
									boolean var5 = var12 != null && var12.method5009() && WorldMapArea.method6664().method5130(var12.method5017());
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
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
