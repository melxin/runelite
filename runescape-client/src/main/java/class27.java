import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bs")
public class class27 {
	@ObfuscatedName("db")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive10")
	static Archive archive10;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "2120412646"
	)
	public static void method412(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field3110 = var4;
		UserComparator9.cacheGamebuild = var3;

		try {
			WorldMapLabelSize.osName = System.getProperty("os.name");
		} catch (Exception var42) {
			WorldMapLabelSize.osName = "Unknown";
		}

		JagexCache.osNameLowercase = WorldMapLabelSize.osName.toLowerCase();
		class82.userHomeDirectory = null;

		try {
			class82.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var41) {
		}

		if (class82.userHomeDirectory == null) {
			try {
				class82.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var40) {
			}
		}

		if (class82.userHomeDirectory != null) {
			class82.userHomeDirectory = class82.userHomeDirectory + "/";
		}

		try {
			if (JagexCache.osNameLowercase.startsWith("win")) {
				if (class82.userHomeDirectory == null) {
					class82.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class82.userHomeDirectory == null) {
				class82.userHomeDirectory = System.getenv("HOME");
			}

			if (class82.userHomeDirectory != null) {
				class82.userHomeDirectory = class82.userHomeDirectory + "/";
			}
		} catch (Exception var39) {
		}

		if (class82.userHomeDirectory == null) {
			class82.userHomeDirectory = "~/";
		}

		UserComparator2.field5981 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class82.userHomeDirectory, "/tmp/", ""};
		GameBuild.field4411 = new String[]{".jagex_cache_" + UserComparator9.cacheGamebuild, ".file_store_" + UserComparator9.cacheGamebuild};
		int var19 = 0;

		label526:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field3109 = new File(class82.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			File var48;
			if (JagexCache.field3109.exists()) {
				AccessFile var11 = null;

				try {
					var11 = new AccessFile(JagexCache.field3109, "rw", 10000L);

					Buffer var12;
					int var13;
					for (var12 = new Buffer((int)var11.length()); var12.array * 1216585693 < var12.field5916.length; var12.array += -290410379 * var13) {
						var13 = var11.read(var12.field5916, var12.array * 1216585693, var12.field5916.length - var12.array * 1216585693);
						if (var13 == -1) {
							throw new IOException();
						}
					}

					var12.array = 0;
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
				} catch (Exception var44) {
					var44.printStackTrace();
				} finally {
					try {
						if (var11 != null) {
							var11.close();
						}
					} catch (IOException var38) {
					}

				}

				if (var8 != null) {
					var48 = new File(var8);
					if (!var48.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var48 = new File(var8, "test.dat");
					if (!HttpMethod.method82(var48, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label499:
				for (int var20 = 0; var20 < GameBuild.field4411.length; ++var20) {
					for (int var21 = 0; var21 < UserComparator2.field5981.length; ++var21) {
						File var22 = new File(UserComparator2.field5981[var21] + GameBuild.field4411[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists() && HttpMethod.method82(new File(var22, "test.dat"), true)) {
							var8 = var22.toString();
							var10 = true;
							break label499;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class82.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var47 = new File(var9);
				var48 = new File(var8);

				try {
					File[] var50 = var47.listFiles();
					File[] var23 = var50;

					for (int var24 = 0; var24 < var23.length; ++var24) {
						File var16 = var23[var24];
						File var17 = new File(var48, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var43) {
					var43.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				class570.method10977(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			Canvas.cacheDir = var6;
			if (!Canvas.cacheDir.exists()) {
				Canvas.cacheDir.mkdirs();
			}

			File[] var46 = Canvas.cacheDir.listFiles();
			if (var46 != null) {
				File[] var49 = var46;

				for (int var25 = 0; var25 < var49.length; ++var25) {
					File var26 = var49[var25];
					if (!HttpMethod.method82(var26, false)) {
						++var19;
						continue label526;
					}
				}
			}
			break;
		}

		File var5 = Canvas.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			ItemContainer.method2113();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(VerticalAlignment.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(VerticalAlignment.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.field3110];

			for (int var27 = 0; var27 < JagexCache.field3110; ++var27) {
				JagexCache.JagexCache_idxFiles[var27] = new BufferedFile(new AccessFile(VerticalAlignment.getFile("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "1839988757"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "114"
	)
	static int method414(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class366 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7971();
					if (var7 != null) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.method7650().method9329();
						return 1;
					}
				}

				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class360 var4;
				if (var0 == 1617) {
					var4 = var3.method8088();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4052 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method8088();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4053 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7971();
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7651().method9329() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method8088();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4055 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7777() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7662() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7663() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null && var7.method7839() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7971();
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7796().method9518() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7971();
						int var5 = var7 != null ? var7.method7857() : 0;
						int var6 = var7 != null ? var7.method7656() : 0;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7656() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7666() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7783() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7773() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7689() : 0;
						return 1;
					} else {
						class28 var8;
						if (var0 == 1633) {
							var8 = var3.method7973();
							Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = var8 != null ? var8.method419(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7973();
							Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = var8 != null ? var8.method420((char)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null && var7.method7654() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1634465290"
	)
	static final void method409() {
		int var0;
		int var1;
		int var2;
		if (!Client.field553) {
			var0 = Coord.method7416(KeyHandler.field114);
			var1 = Coord.method7416(SequenceDefinition.field2487);
			var2 = JagNetThread.method8434(class333.topLevelWorldView, var0, var1, class333.topLevelWorldView.plane) - GrandExchangeOffer.field5046;
			WorldMapLabel.method6829(var0, var2, var1);
		} else if (Client.field589 != null) {
			HealthBarDefinition.cameraX = Client.field589.vmethod10615();
			HttpRequest.cameraZ = Client.field589.vmethod10609();
			if (Client.field588) {
				class174.cameraY = Client.field589.vmethod10614();
			} else {
				class174.cameraY = JagNetThread.method8434(class333.topLevelWorldView, HealthBarDefinition.cameraX, HttpRequest.cameraZ, class333.topLevelWorldView.plane) - Client.field589.vmethod10614();
			}

			Client.field589.method10620();
		}

		if (!Client.field587) {
			var0 = Coord.method7416(class169.field1909);
			var1 = Coord.method7416(class227.field2654);
			var2 = JagNetThread.method8434(class333.topLevelWorldView, var0, var1, class333.topLevelWorldView.plane) - Buddy.field5413;
			int var3 = var0 - HealthBarDefinition.cameraX;
			int var4 = var2 - class174.cameraY;
			int var5 = var1 - HttpRequest.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			ClanChannel.method4066(var7, var8);
		} else {
			if (Client.field477 != null) {
				class401.cameraPitch = Client.field477.method10607();
				class401.cameraPitch = Math.min(Math.max(class401.cameraPitch, 128), 383);
				Client.field477.method10620();
			}

			if (Client.field514 != null) {
				WorldMapLabel.cameraYaw = Client.field514.method10607() & 2047;
				Client.field514.method10620();
			}
		}

	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-125"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class333.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = var6 != 0L;
			if (var13) {
				boolean var14 = (int)(var6 >>> 19 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var20 = SceneTilePaint.sceneMinimapSprite.pixels;
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class537.Entity_unpackID(var6);
			ObjectComposition var16 = ModeWhere.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = GameEngine.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var18 + var1 * 4 + 48, var19 + (104 - var2 - var16.sizeY) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 1) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var20[var27] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class537.Entity_unpackID(var6);
			ObjectComposition var21 = ModeWhere.getObjectDefinition(var11);
			if (var21.mapSceneId != -1) {
				IndexedSprite var29 = GameEngine.mapSceneSprites[var21.mapSceneId];
				if (var29 != null) {
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2;
					var15 = (var21.sizeY * 4 - var29.subHeight) / 2;
					var29.drawAt(var27 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var15 + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var28 = 0L != var6;
				if (var28) {
					boolean var22 = (int)(var6 >>> 19 & 1L) == 1;
					var28 = !var22;
				}

				if (var28) {
					var26 = 15597568;
				}

				int[] var23 = SceneTilePaint.sceneMinimapSprite.pixels;
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var23[var30] = var26;
					var23[var30 + 1 + 512] = var26;
					var23[var30 + 1024 + 2] = var26;
					var23[var30 + 1536 + 3] = var26;
				} else {
					var23[var30 + 1536] = var26;
					var23[var30 + 1 + 1024] = var26;
					var23[var30 + 512 + 2] = var26;
					var23[var30 + 3] = var26;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (0L != var6) {
			var8 = class537.Entity_unpackID(var6);
			ObjectComposition var24 = ModeWhere.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = GameEngine.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var12 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var11 + var1 * 4 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
