import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hw")
public class class197 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final class197 field2163;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final class197 field2162;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public static final class197 field2164;

	static {
		field2163 = new class197();
		field2162 = new class197();
		field2164 = new class197();
	}

	class197() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "25"
	)
	static int method4388(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "2087246230"
	)
	static int method4389(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			UserComparator7.Interpreter_intStackSize -= 3;
			class574.queueSoundEffect(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				UserComparator7.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				class568.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				UserComparator7.Interpreter_intStackSize -= 2;
				class175.method4117(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class68 var10;
				class67 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var4 = 0;
							class68 var19 = (class68)class173.findEnumerated(class6.method40(), var3);
							if (var19 != null) {
								var4 = var19 != class68.field927 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var4 = 0;
							class67 var13 = (class67)class173.findEnumerated(class350.method7378(), var3);
							if (var13 != null) {
								var4 = var13 != class67.field920 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
								class257.method5884(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								UserComparator7.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								class568.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								UserComparator7.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
								class173.method4098(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class68.field927;
							var11 = class67.field920;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var10 = (class68)class173.findEnumerated(class6.method40(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var11 = (class67)class173.findEnumerated(class350.method7378(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class67.field920) {
								switch(var10.field930) {
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
								switch(var11.field919) {
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

							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class68.field927;
						var11 = class67.field920;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var10 = (class68)class173.findEnumerated(class6.method40(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var11 = (class67)class173.findEnumerated(class350.method7378(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var10 = (class68)class173.findEnumerated(class6.method40(), var6);
							if (var10 == null) {
								var11 = (class67)class173.findEnumerated(class350.method7378(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class68.field928;
						} else if (var0 == 3204) {
							var11 = class67.field916;
						} else if (var0 == 3206) {
							var11 = class67.field922;
						} else if (var0 == 3208) {
							var11 = class67.field914;
						}

						if (var11 == class67.field920) {
							switch(var10.field930) {
							case 1:
								var5 = class36.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class36.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class36.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class36.clientPreferences.method2616();
								break;
							case 5:
								var5 = EnumComposition.method4305();
								break;
							case 6:
								var5 = class36.clientPreferences.method2586() ? 1 : 0;
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10);
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field919) {
							case 1:
								var5 = class36.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class36.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class36.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class36.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11);
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class68.field927;
					var11 = class67.field920;
					var5 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var10 = (class68)class173.findEnumerated(class6.method40(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = (class67)class173.findEnumerated(class350.method7378(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var10 = (class68)class173.findEnumerated(class6.method40(), var6);
						if (var10 == null) {
							var11 = (class67)class173.findEnumerated(class350.method7378(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class68.field928;
					} else if (var0 == 3203) {
						var11 = class67.field916;
					} else if (var0 == 3205) {
						var11 = class67.field922;
					} else if (var0 == 3207) {
						var11 = class67.field914;
					}

					if (var11 == class67.field920) {
						switch(var10.field930) {
						case 1:
							class36.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class36.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class36.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class36.clientPreferences.updateEULA(var5);
							break;
						case 5:
							class446.method8916(var5);
							break;
						case 6:
							class36.clientPreferences.method2668(var5 == 1);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10);
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field919) {
						case 1:
							class36.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class240.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class270.method6071(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class558.method10857(var6);
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
