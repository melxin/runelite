import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
@Implements("HealthBarConfig")
public class HealthBarConfig extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -899894429
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static Widget field1346;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Ljc;)V"
	)
	HealthBarConfig(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1002957734"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ldp;",
		garbageValue = "-66124549"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1961180597"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method8050();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "48"
	)
	static boolean method3008(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1139670283"
	)
	static int method3000(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			ScriptFrame.Interpreter_intStackSize -= 3;
			class378.queueSoundEffect(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				ScriptFrame.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				class420.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				DynamicObject.method2494(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class93 var10;
				class92 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var4 = 0;
							class93 var19 = (class93)StructComposition.findEnumerated(class277.method5964(), var3);
							if (var19 != null) {
								var4 = var19 != class93.field1110 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var4 = 0;
							class92 var13 = (class92)StructComposition.findEnumerated(Login.method2388(), var3);
							if (var13 != null) {
								var4 = var13 != class92.field1108 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
								UserComparator3.method3347(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								ScriptFrame.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								class420.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								ScriptFrame.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
								class309.method6539(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class93.field1110;
							var11 = class92.field1108;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								var10 = (class93)StructComposition.findEnumerated(class277.method5964(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								var11 = (class92)StructComposition.findEnumerated(Login.method2388(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class92.field1108) {
								switch(var10.field1115) {
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
									var12 = String.format("Unkown device option: %s.", var10.toString());
									throw new RuntimeException(var12);
								}
							} else {
								switch(var11.field1107) {
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
									var12 = String.format("Unkown game option: %s.", var11.toString());
									throw new RuntimeException(var12);
								}
							}

							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class93.field1110;
						var11 = class92.field1108;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var10 = (class93)StructComposition.findEnumerated(class277.method5964(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var11 = (class92)StructComposition.findEnumerated(Login.method2388(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var10 = (class93)StructComposition.findEnumerated(class277.method5964(), var6);
							if (var10 == null) {
								var11 = (class92)StructComposition.findEnumerated(Login.method2388(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class93.field1114;
						} else if (var0 == 3204) {
							var11 = class92.field1099;
						} else if (var0 == 3206) {
							var11 = class92.field1100;
						} else if (var0 == 3208) {
							var11 = class92.field1097;
						}

						if (var11 == class92.field1108) {
							switch(var10.field1115) {
							case 1:
								var5 = class544.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = class544.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = class544.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = class544.clientPreferences.method2892();
								break;
							case 5:
								var5 = SoundCache.method893();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1107) {
							case 1:
								var5 = class544.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = class544.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = class544.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = class544.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class93.field1110;
					var11 = class92.field1108;
					var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var10 = (class93)StructComposition.findEnumerated(class277.method5964(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = (class92)StructComposition.findEnumerated(Login.method2388(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var10 = (class93)StructComposition.findEnumerated(class277.method5964(), var6);
						if (var10 == null) {
							var11 = (class92)StructComposition.findEnumerated(Login.method2388(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class93.field1114;
					} else if (var0 == 3203) {
						var11 = class92.field1099;
					} else if (var0 == 3205) {
						var11 = class92.field1100;
					} else if (var0 == 3207) {
						var11 = class92.field1097;
					}

					if (var11 == class92.field1108) {
						switch(var10.field1115) {
						case 1:
							class544.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							class544.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							class544.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							class544.clientPreferences.method2891(var5);
							break;
						case 5:
							class140.method3504(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1107) {
						case 1:
							class544.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class149.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							ClanChannel.method3839(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class240.method5252(var6);
							break;
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString());
							throw new RuntimeException(var14);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "-1509113256"
	)
	public static IndexCheck method3010() {
		return Client.indexCheck;
	}
}
