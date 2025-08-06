import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public enum class66 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field902(0, -1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field893(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field892(2, 7),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field895(3, 8),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field896(4, 9);

	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -232168375
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = -963333959
	)
	static int field894;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -39842447
	)
	final int field899;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 354335045
	)
	final int field898;

	class66(int var3, int var4) {
		this.field899 = var3;
		this.field898 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field898;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1248717073"
	)
	static void method2131() {
		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (FriendSystem.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = FriendSystem.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "1035077023"
	)
	static int method2137(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
			class303.queueSoundEffect(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				WorldMapLabelSize.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				HttpMethod.method80(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
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
							var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = 0;
							class67 var19 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var3);
							if (var19 != null) {
								var4 = var19 != class67.field908 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = 0;
							class66 var13 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var3);
							if (var13 != null) {
								var4 = var13 != field902 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
								class267.method6028(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								WorldMapLabelSize.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
								ViewportMouse.method5645(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class67.field908;
							var11 = field902;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var10 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var11 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == field902) {
								switch(var10.field911) {
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
								switch(var11.field899) {
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

							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class67.field908;
						var11 = field902;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var10 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var11 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var10 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var6);
							if (var10 == null) {
								var11 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class67.field909;
						} else if (var0 == 3204) {
							var11 = field892;
						} else if (var0 == 3206) {
							var11 = field895;
						} else if (var0 == 3208) {
							var11 = field896;
						}

						if (var11 == field902) {
							switch(var10.field911) {
							case 1:
								var5 = FriendSystem.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = FriendSystem.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = FriendSystem.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = FriendSystem.clientPreferences.method2525();
								break;
							case 5:
								var5 = ChatChannel.method2002();
								break;
							case 6:
								var5 = FriendSystem.clientPreferences.method2548() ? 1 : 0;
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10);
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field899) {
							case 1:
								var5 = FriendSystem.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = FriendSystem.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = FriendSystem.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = FriendSystem.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11);
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class67.field908;
					var11 = field902;
					var5 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						var10 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						var11 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						var10 = (class67)HealthBarConfig.findEnumerated(UserComparator7.method3492(), var6);
						if (var10 == null) {
							var11 = (class66)HealthBarConfig.findEnumerated(class326.method7016(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class67.field909;
					} else if (var0 == 3203) {
						var11 = field892;
					} else if (var0 == 3205) {
						var11 = field895;
					} else if (var0 == 3207) {
						var11 = field896;
					}

					if (var11 == field902) {
						switch(var10.field911) {
						case 1:
							FriendSystem.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							FriendSystem.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							FriendSystem.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							FriendSystem.clientPreferences.updateEULA(var5);
							break;
						case 5:
							VerticalAlignment.method4380(var5);
							break;
						case 6:
							FriendSystem.clientPreferences.method2522(var5 == 1);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10);
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field899) {
						case 1:
							FriendSystem.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							WorldMapSectionType.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							PcmPlayer.method3045(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class334.method7074(var6);
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

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1851975024"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class291.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAdd(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}
