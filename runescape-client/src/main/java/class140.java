import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
public class class140 implements class130 {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "7"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldz;[BIIB)V",
		garbageValue = "-95"
	)
	static final void method3503(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					WorldMapSection1.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "546395833"
	)
	static final int method3505(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "1156609576"
	)
	static int method3501(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				HealthBarConfig.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3 + PlayerType.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					long var14 = (11745L + (long)var11) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						HealthBarConfig.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class166.method3809(class211.compareStrings(Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1], ScriptFrame.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							ScriptFrame.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var12 = class220.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							ScriptFrame.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var12 = class220.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							HealthBarConfig.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = IsaacCipher.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldEntityCoord.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class167.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							ScriptFrame.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							HealthBarConfig.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							HealthBarConfig.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 2];
							if (ModeWhere.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(ModeWhere.localPlayer.appearance.field3811) {
								case 0:
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ModeWhere.localPlayer.appearance != null ? ModeWhere.localPlayer.appearance.field3811 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					HealthBarConfig.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
					if (ModeWhere.localPlayer.appearance != null && ModeWhere.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	static final void method3504(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		class33.method522((double)var1);
	}
}
