import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kn")
public class class280 {
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-198196294"
	)
	public static String method6344(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "789545283"
	)
	static int method6345(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			UrlRequest.Interpreter_intStackSize -= 3;
			class210.queueSoundEffect(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				UrlRequest.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				DynamicObject.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				UrlRequest.Interpreter_intStackSize -= 2;
				SoundSystem.method3199(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class67 var10;
				class66 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var4 = 0;
							class67 var19 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var3);
							if (var19 != null) {
								var4 = var19 != class67.field907 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var4 = 0;
							class66 var13 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var3);
							if (var13 != null) {
								var4 = var13 != class66.field899 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
								Clock.method6092(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								UrlRequest.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								DynamicObject.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								UrlRequest.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
								AbstractWorldMapIcon.method6885(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class67.field907;
							var11 = class66.field899;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var10 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var11 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class66.field899) {
								switch(var10.field909) {
								case 1:
								case 2:
								case 3:
									var18 = 0;
									var6 = 1;
									break;
								case 4:
									var18 = 0;
									var6 = Integer.MAX_VALUE;
									break;
								case 5:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10);
									throw new RuntimeException(var12);
								}
							} else {
								switch(var11.field897) {
								case 1:
									var18 = 0;
									var6 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11);
									throw new RuntimeException(var12);
								}
							}

							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class67.field907;
						var11 = class66.field899;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var10 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var11 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var10 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var6);
							if (var10 == null) {
								var11 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class67.field911;
						} else if (var0 == 3204) {
							var11 = class66.field900;
						} else if (var0 == 3206) {
							var11 = class66.field895;
						} else if (var0 == 3208) {
							var11 = class66.field896;
						}

						if (var11 == class66.field899) {
							switch(var10.field909) {
							case 1:
								var5 = class154.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class154.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class154.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class154.clientPreferences.method2602();
								break;
							case 5:
								var5 = class461.method9466();
								break;
							case 6:
								var5 = class154.clientPreferences.method2624() ? 1 : 0;
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10);
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field897) {
							case 1:
								var5 = class154.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class154.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class154.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class154.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11);
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class67.field907;
					var11 = class66.field899;
					var5 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var10 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var10 = (class67)ScriptFrame.findEnumerated(class385.method8212(), var6);
						if (var10 == null) {
							var11 = (class66)ScriptFrame.findEnumerated(UserComparator8.method3610(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class67.field911;
					} else if (var0 == 3203) {
						var11 = class66.field900;
					} else if (var0 == 3205) {
						var11 = class66.field895;
					} else if (var0 == 3207) {
						var11 = class66.field896;
					}

					if (var11 == class66.field899) {
						switch(var10.field909) {
						case 1:
							class154.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class154.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class154.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class154.clientPreferences.updateEULA(var5);
							break;
						case 5:
							GrandExchangeEvents.method8528(var5);
							break;
						case 6:
							class154.clientPreferences.method2631(var5 == 1);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10);
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field897) {
						case 1:
							class154.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class404.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							ClanChannel.method4122(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							NPC.method2849(var6);
							break;
						default:
							var14 = String.format("Unkown game option: %s.", var11);
							throw new RuntimeException(var14);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIII)I",
		garbageValue = "-983664452"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var9 * (128 - var8) + var10 * var8 >> 7;
		} else {
			return 0;
		}
	}
}
