import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bq")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -395576611
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			ArchiveLoader.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-35"
	)
	static int method829(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			var3 = class379.widgetDefinition.method6875(var4);
		} else {
			var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class359 var17 = var3.method7284();
				if (var17 != null && var17.method7114(var23, var16)) {
					class178.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width * 1063514007) {
					var3.scrollX = var3.scrollWidth - var3.width * 1063514007;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height * 1899982693) {
					var3.scrollY = var3.scrollHeight - var3.height * 1899982693;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				class178.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			PrivateChatMode.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 5];
			class178.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				class178.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			class178.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class359 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7284();
					if (var21 != null && var21.method7035()) {
						var21.method6981(var15);
					} else {
						var3.text = var15;
					}

					class178.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					class178.invalidateWidget(var3);
				}

				return 1;
			} else {
				class359 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7284();
						if (var19 != null) {
							var19.method7106();
						}
					}

					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					PrivateChatMode.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7284();
						if (var19 != null) {
							var19.method6989(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
							var19.method6992(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
					}

					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					class178.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class359.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					class178.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					FillMode var22 = (FillMode)ScriptEvent.findEnumerated(AddRequestTask.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						class178.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						var3.field3895 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3898 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						class178.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7265(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], "", class167.urlRequester, class150.getUserId());
						return 1;
					} else if (var0 == 1131) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						var3.method7336(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7266(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
						return 1;
					} else {
						class353 var20;
						if (var0 == 1133) {
							--PrivateChatMode.Interpreter_intStackSize;
							var20 = var3.method7240();
							if (var20 != null) {
								var20.field3786 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--PrivateChatMode.Interpreter_intStackSize;
							var20 = var3.method7240();
							if (var20 != null) {
								var20.field3785 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--Interpreter.Interpreter_stringStackSize;
							var19 = var3.method7284();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--PrivateChatMode.Interpreter_intStackSize;
							var20 = var3.method7240();
							if (var20 != null) {
								var20.field3787 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null && var19.method6985(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize])) {
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null && var19.method6986(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize])) {
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null && var19.method6987(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize])) {
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							Client.field816.method5556();
							var21 = var3.method7284();
							if (var21 != null && var21.method7057(var14)) {
								if (var14) {
									Client.field816.method5541(var3);
								}

								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field816.method5548() == var3) {
								Client.field816.method5556();
								class178.invalidateWidget(var3);
							}

							var21 = var3.method7284();
							if (var21 != null) {
								var21.method6980(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							PrivateChatMode.Interpreter_intStackSize -= 2;
							var19 = var3.method7284();
							if (var19 != null && var19.method7003(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1])) {
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null && var19.method7003(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize])) {
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null) {
								var19.method6979(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
								class178.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null) {
								var19.method7103(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null) {
								var19.method6994(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--PrivateChatMode.Interpreter_intStackSize;
							var19 = var3.method7284();
							if (var19 != null) {
								var19.method6993(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
								class178.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var18 = var3.method7280();
								if (var18 != null) {
									var18.method387(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var18 = var3.method7280();
								if (var18 != null) {
									var18.method364((char)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7263(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], class167.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								Interpreter.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2];
								long var8 = class150.getUserId();
								long var10 = class372.getUserHash();
								String var12 = ApproximateRouteStrategy.getPlatformInfo().getDeviceId(ApproximateRouteStrategy.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (-1L != var10) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7262(var15, var13, var7, var12, Long.toString(var10), class167.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class216 var5 = var3.method7276();
									boolean var6 = var5 != null && var5.method4336() && Actor.method2671().method4456(var5.method4343());
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "904975880"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
