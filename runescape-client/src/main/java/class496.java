import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tm")
public class class496 {
	@ObfuscatedName("dk")
	static boolean field5164;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "20"
	)
	static int method9377(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			var3 = class376.widgetDefinition.method6918(var4);
		} else {
			var3 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class361 var17 = var3.method7331();
				if (var17 != null && var17.method7030(var23, var16)) {
					MilliClock.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width * 779142065) {
					var3.scrollX = var3.scrollWidth - var3.width * 779142065;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height * 1836304183) {
					var3.scrollY = var3.scrollHeight - var3.height * 1836304183;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				MilliClock.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			HealthBarConfig.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 5];
			MilliClock.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				MilliClock.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			MilliClock.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class361 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7331();
					if (var21 != null && var21.method7077()) {
						var21.method7112(var15);
					} else {
						var3.text = var15;
					}

					MilliClock.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					MilliClock.invalidateWidget(var3);
				}

				return 1;
			} else {
				class361 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7331();
						if (var19 != null) {
							var19.method7037();
						}
					}

					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					HealthBarConfig.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7331();
						if (var19 != null) {
							var19.method7031(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
							var19.method7032(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
					}

					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					MilliClock.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class157.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					MilliClock.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					class581 var22 = (class581)class454.findEnumerated(class437.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						MilliClock.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						var3.field3965 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3968 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						MilliClock.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7313(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], "", Tiles.urlRequester, WorldMapElement.getUserId());
						return 1;
					} else if (var0 == 1131) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						var3.method7382(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7317(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
						return 1;
					} else {
						class355 var20;
						if (var0 == 1133) {
							--HealthBarConfig.Interpreter_intStackSize;
							var20 = var3.method7332();
							if (var20 != null) {
								var20.field3853 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--HealthBarConfig.Interpreter_intStackSize;
							var20 = var3.method7332();
							if (var20 != null) {
								var20.field3848 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--Interpreter.Interpreter_stringStackSize;
							var19 = var3.method7331();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--HealthBarConfig.Interpreter_intStackSize;
							var20 = var3.method7332();
							if (var20 != null) {
								var20.field3849 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null && var19.method7128(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize])) {
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null && var19.method7028(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize])) {
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null && var19.method7029(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize])) {
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
							Client.field749.method5559();
							var21 = var3.method7331();
							if (var21 != null && var21.method7021(var14)) {
								if (var14) {
									Client.field749.method5557(var3);
								}

								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field749.method5584() == var3) {
								Client.field749.method5559();
								MilliClock.invalidateWidget(var3);
							}

							var21 = var3.method7331();
							if (var21 != null) {
								var21.method7022(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							var19 = var3.method7331();
							if (var19 != null && var19.method7213(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1])) {
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null && var19.method7213(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize])) {
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null) {
								var19.method7034(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]);
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null) {
								var19.method7033(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null) {
								var19.method7036(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--HealthBarConfig.Interpreter_intStackSize;
							var19 = var3.method7331();
							if (var19 != null) {
								var19.method7220(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]);
								MilliClock.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var18 = var3.method7333();
								if (var18 != null) {
									var18.method341(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var18 = var3.method7333();
								if (var18 != null) {
									var18.method342((char)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7300(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Tiles.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								Interpreter.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2];
								long var8 = WorldMapElement.getUserId();
								long var10 = RestClientThreadFactory.getUserHash();
								String var12 = class134.getPlatformInfo().getDeviceId(class134.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7424(var15, var13, var7, var12, Long.toString(var10), Tiles.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class216 var5 = var3.method7327();
									boolean var6 = var5 != null && var5.method4431() && class152.method3501().method4546(var5.method4397());
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
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
