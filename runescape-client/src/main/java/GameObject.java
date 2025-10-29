import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 46801735
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 1608625415500949283L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1291248351
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 683703035
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1204024827
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1465977803
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1666005069
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1553138359
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 889015863
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2094327665
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 186764815
	)
	int field3203;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 399338421
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1362575399
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;IB)V",
		garbageValue = "3"
	)
	public static void method6264(AbstractArchive var0, int var1) {
		if (!class345.field3928.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class345.field3928.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field4049 = false;
				var4.field4044 = false;
				var4.field4050 = false;
				var4.field4051 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field4046 = 0.0F;
				var2.add(var4);
			}

			class113.method3574(var2, class345.musicPlayerStatus, class345.field3931, class345.field3932, class345.field3926, false);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1041269477"
	)
	static int method6263(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class408.Interpreter_intStackSize -= 3;
			class27.queueSoundEffect(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				class408.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				KitDefinition.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				class408.Interpreter_intStackSize -= 2;
				MouseRecorder.method2194(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var4 = 0;
							class67 var19 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var3);
							if (var19 != null) {
								var4 = var19 != class67.field887 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var4 = 0;
							class66 var13 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var3);
							if (var13 != null) {
								var4 = var13 != class66.field874 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class408.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
								class167.method4167(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								class408.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								KitDefinition.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								class408.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
								class182.method4293(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class67.field887;
							var11 = class66.field874;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var10 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var11 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class66.field874) {
								switch(var10.field892) {
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
								switch(var11.field877) {
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

							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class67.field887;
						var11 = class66.field874;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var10 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var11 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var10 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var6);
							if (var10 == null) {
								var11 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class67.field894;
						} else if (var0 == 3204) {
							var11 = class66.field883;
						} else if (var0 == 3206) {
							var11 = class66.field875;
						} else if (var0 == 3208) {
							var11 = class66.field881;
						}

						if (var11 == class66.field874) {
							switch(var10.field892) {
							case 1:
								var5 = class468.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class468.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class468.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class468.clientPreferences.method2649();
								break;
							case 5:
								var5 = ApproximateRouteStrategy.method784();
								break;
							case 6:
								var5 = class468.clientPreferences.method2671() ? 1 : 0;
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10);
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field877) {
							case 1:
								var5 = class468.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class468.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class468.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class468.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11);
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class67.field887;
					var11 = class66.field874;
					var5 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var10 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var10 = (class67)GrandExchangeOffer.findEnumerated(ApproximateRouteStrategy.method785(), var6);
						if (var10 == null) {
							var11 = (class66)GrandExchangeOffer.findEnumerated(GrandExchangeEvents.method8723(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class67.field894;
					} else if (var0 == 3203) {
						var11 = class66.field883;
					} else if (var0 == 3205) {
						var11 = class66.field875;
					} else if (var0 == 3207) {
						var11 = class66.field881;
					}

					if (var11 == class66.field874) {
						switch(var10.field892) {
						case 1:
							class468.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class468.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class468.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class468.clientPreferences.updateEULA(var5);
							break;
						case 5:
							DefaultsGroup.method10774(var5);
							break;
						case 6:
							class468.clientPreferences.method2746(var5 == 1);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10);
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field877) {
						case 1:
							class468.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							LoginState.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							User.method10270(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class383.method8349(var6);
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
}
