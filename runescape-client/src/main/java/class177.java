import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gq")
public class class177 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1842")
	static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIS)V",
		garbageValue = "8804"
	)
	public static void method3741(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class201.field2090 = var4;
		class168.cacheGamebuild = var3;

		try {
			ClientPreferences.osName = System.getProperty("os.name");
		} catch (Exception var49) {
			ClientPreferences.osName = "Unknown";
		}

		class33.osNameLowercase = ClientPreferences.osName.toLowerCase();
		class4.userHomeDirectory = null;

		try {
			class4.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var48) {
		}

		if (class4.userHomeDirectory == null) {
			try {
				class4.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var47) {
			}
		}

		if (class4.userHomeDirectory != null) {
			class4.userHomeDirectory = class4.userHomeDirectory + "/";
		}

		try {
			if (class33.osNameLowercase.startsWith("win")) {
				if (class4.userHomeDirectory == null) {
					class4.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class4.userHomeDirectory == null) {
				class4.userHomeDirectory = System.getenv("HOME");
			}

			if (class4.userHomeDirectory != null) {
				class4.userHomeDirectory = class4.userHomeDirectory + "/";
			}
		} catch (Exception var46) {
		}

		if (class4.userHomeDirectory == null) {
			class4.userHomeDirectory = "~/";
		}

		DevicePcmPlayerProvider.field107 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class4.userHomeDirectory, "/tmp/", ""};
		class354.field3790 = new String[]{".jagex_cache_" + class168.cacheGamebuild, ".file_store_" + class168.cacheGamebuild};
		int var19 = 0;

		label573:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			class141.field1631 = new File(class4.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			int var13;
			int var21;
			File var55;
			if (class141.field1631.exists()) {
				AccessFile var11 = null;

				try {
					var11 = new AccessFile(class141.field1631, "rw", 10000L);

					Buffer var12;
					for (var12 = new Buffer((int)var11.length()); var12.offset < var12.array.length; var12.offset += var13) {
						var13 = var11.read(var12.array, var12.offset, var12.array.length - var12.offset);
						if (var13 == -1) {
							throw new IOException();
						}
					}

					var12.offset = 0;
					var13 = var12.readUnsignedByte();
					if (var13 < 1 || var13 > 3) {
						throw new IOException("" + var13);
					}

					int var14 = 0;
					if (var13 > 1) {
						var14 = var12.readUnsignedByte();
					}

					if (var13 <= 2) {
						var8 = var12.readStringCp1252NullCircumfixed();
						if (var14 == 1) {
							var9 = var12.readStringCp1252NullCircumfixed();
						}
					} else {
						var8 = var12.readCESU8();
						if (var14 == 1) {
							var9 = var12.readCESU8();
						}
					}
				} catch (Exception var51) {
					var51.printStackTrace();
				} finally {
					try {
						if (var11 != null) {
							var11.close();
						}
					} catch (IOException var42) {
					}

				}

				if (var8 != null) {
					var55 = new File(var8);
					if (!var55.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var55 = new File(var8, "test.dat");

					boolean var58;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var55, "rw");
						var21 = var20.read();
						var20.seek(0L);
						var20.write(var21);
						var20.seek(0L);
						var20.close();
						var55.delete();
						var58 = true;
					} catch (Exception var45) {
						var58 = false;
					}

					if (!var58) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label546:
				for (int var22 = 0; var22 < class354.field3790.length; ++var22) {
					for (int var23 = 0; var23 < DevicePcmPlayerProvider.field107.length; ++var23) {
						File var24 = new File(DevicePcmPlayerProvider.field107[var23] + class354.field3790[var22] + File.separatorChar + var0 + File.separatorChar);
						if (var24.exists()) {
							File var15 = new File(var24, "test.dat");

							boolean var59;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var15, "rw");
								int var17 = var16.read();
								var16.seek(0L);
								var16.write(var17);
								var16.seek(0L);
								var16.close();
								var15.delete();
								var59 = true;
							} catch (Exception var44) {
								var59 = false;
							}

							if (var59) {
								var8 = var24.toString();
								var10 = true;
								break label546;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class4.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var54 = new File(var9);
				var55 = new File(var8);

				try {
					File[] var63 = var54.listFiles();
					File[] var61 = var63;

					for (var21 = 0; var21 < var61.length; ++var21) {
						File var60 = var61[var21];
						File var25 = new File(var55, var60.getName());
						boolean var18 = var60.renameTo(var25);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var50) {
					var50.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				ItemComposition.method4193(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			WorldMapScaleHandler.cacheDir = var6;
			if (!WorldMapScaleHandler.cacheDir.exists()) {
				WorldMapScaleHandler.cacheDir.mkdirs();
			}

			File[] var53 = WorldMapScaleHandler.cacheDir.listFiles();
			if (var53 != null) {
				File[] var56 = var53;

				for (int var26 = 0; var26 < var56.length; ++var26) {
					File var27 = var56[var26];

					boolean var62;
					try {
						RandomAccessFile var57 = new RandomAccessFile(var27, "rw");
						var13 = var57.read();
						var57.seek(0L);
						var57.write(var13);
						var57.seek(0L);
						var57.close();
						var62 = true;
					} catch (Exception var43) {
						var62 = false;
					}

					if (!var62) {
						++var19;
						continue label573;
					}
				}
			}
			break;
		}

		File var5 = WorldMapScaleHandler.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			PlayerUpdateManager.method3067();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(HealthBarDefinition.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(HealthBarDefinition.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			UserComparator7.JagexCache_idxFiles = new BufferedFile[class201.field2090];

			for (int var28 = 0; var28 < class201.field2090; ++var28) {
				UserComparator7.JagexCache_idxFiles[var28] = new BufferedFile(new AccessFile(HealthBarDefinition.getFile("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1496488013"
	)
	static int method3739(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class359 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7284();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.method7216().method8383();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class353 var4;
				if (var0 == 1617) {
					var4 = var3.method7240();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3786 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7240();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3785 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7284();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7028().method8383() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7240();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4 != null ? var4.field3787 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7038() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7039() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7040() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null && var7.method7030() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7284();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6977().method8643() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7284();
						int var5 = var7 != null ? var7.method7104() : 0;
						int var6 = var7 != null ? var7.method7033() : 0;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7033() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7042() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7015() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7043() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7284();
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null ? var7.method7044() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7280();
							Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = var8 != null ? var8.method365(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7280();
							Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = var8 != null ? var8.method366((char)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7284();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7 != null && var7.method7139() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
