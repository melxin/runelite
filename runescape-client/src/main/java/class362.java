import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nc")
public class class362 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZS)I",
		garbageValue = "10549"
	)
	static int method7307(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = ClientPreferences.widgetDefinition.method7286(var4);
		} else {
			var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class367 var17 = var3.method7755();
				if (var17 != null && var17.method7410(var23, var16)) {
					ScriptFrame.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width * -1805166981) {
					var3.scrollX = var3.scrollWidth - var3.width * -1805166981;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height * -2133353239) {
					var3.scrollY = var3.scrollHeight - var3.height * -2133353239;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				ScriptFrame.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				ScriptFrame.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ScriptFrame.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class367 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
				if (var3.type == 12) {
					var21 = var3.method7755();
					if (var21 != null && var21.method7454()) {
						var21.method7462(var15);
					} else {
						var3.text = var15;
					}

					ScriptFrame.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					ScriptFrame.invalidateWidget(var3);
				}

				return 1;
			} else {
				class367 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7755();
						if (var19 != null) {
							var19.method7414();
						}
					}

					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7755();
						if (var19 != null) {
							var19.method7411(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
							var19.method7412(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					}

					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					ScriptFrame.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						ClanSettings.revalidateWidgetScroll(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class132.resumePauseWidget(var3.id, var3.childIndex * -744024149);
					Client.meslayerContinueWidget = var3;
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					ScriptFrame.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					FillMode var22 = (FillMode)class175.findEnumerated(Skills.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						ScriptFrame.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.field3983 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field4020 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
						ScriptFrame.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7776((String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize], "", class167.urlRequester, AsyncRestClient.getUserId());
						return 1;
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3.method7759(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7760((String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						return 1;
					} else {
						class361 var20;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method7774();
							if (var20 != null) {
								var20.field3885 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method7774();
							if (var20 != null) {
								var20.field3883 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class175.Interpreter_objectStackSize;
							var19 = var3.method7755();
							if (var19 != null) {
								var3.text2 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method7774();
							if (var20 != null) {
								var20.field3886 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null && var19.method7407(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null && var19.method7408(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null && var19.method7409(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field491.method5864();
							var21 = var3.method7755();
							if (var21 != null && var21.method7515(var14)) {
								if (var14) {
									Client.field491.method5863(var3);
								}

								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field491.method5862() == var3) {
								Client.field491.method5864();
								ScriptFrame.invalidateWidget(var3);
							}

							var21 = var3.method7755();
							if (var21 != null) {
								var21.method7584(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var19 = var3.method7755();
							if (var19 != null && var19.method7435(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null && var19.method7435(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null) {
								var19.method7463(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null) {
								var19.method7540(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null) {
								var19.method7413(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var19 = var3.method7755();
							if (var19 != null) {
								var19.method7466(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								ScriptFrame.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var18 = var3.method7775();
								if (var18 != null) {
									var18.method424(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var18 = var3.method7775();
								if (var18 != null) {
									var18.method429((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7757((String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize], class167.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class175.Interpreter_objectStackSize -= 3;
								var15 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize];
								String var13 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 1];
								String var7 = (String)Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize + 2];
								long var8 = AsyncRestClient.getUserId();
								long var10 = WorldMapSectionType.getUserHash();
								String var12 = class144.getPlatformInfo().getDeviceId(class144.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7756(var15, var13, var7, var12, Long.toString(var10), class167.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class217 var5 = var3.method7758();
									boolean var6 = var5 != null && var5.method4681() && VarcInt.method4037().method4759(var5.method4678());
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
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
