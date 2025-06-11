import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hf")
public class class201 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static EvictingDualNodeHashTable field2132;
	@ObfuscatedName("at")
	String[] field2131;
	@ObfuscatedName("ae")
	public boolean field2127;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1582549443
	)
	int field2135;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 201081879
	)
	int field2136;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 603778131
	)
	int field2137;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -502843199
	)
	int field2138;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 249399443
	)
	int field2139;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 384441977
	)
	int field2140;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	class575 field2141;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1443438447
	)
	int field2142;

	static {
		field2132 = new EvictingDualNodeHashTable(64);
	}

	public class201() {
		this.field2131 = new String[5];
		this.field2127 = false;
		this.field2135 = 0;
		this.field2136 = 0;
		this.field2137 = 0;
		this.field2138 = 0;
		this.field2139 = 0;
		this.field2140 = 0;
		this.field2142 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;S)V",
		garbageValue = "32767"
	)
	public void method4272(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4286(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "307964468"
	)
	void method4286(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2142 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		default:
			break;
		case 4:
			this.field2135 = var1.readShort();
			break;
		case 5:
			this.field2136 = var1.readShort();
			break;
		case 6:
			this.field2137 = var1.readShort();
			break;
		case 7:
			this.field2138 = var1.readShort();
			break;
		case 8:
			this.field2139 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2140 = var1.readUnsignedShort();
			break;
		case 12:
			var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2127 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2131[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2131[var3].equalsIgnoreCase("Hidden")) {
				this.field2131[var3] = null;
			}
			break;
		case 20:
			var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1567878801"
	)
	public void method4274() {
		this.field2141 = new class575(this.field2139, this.field2140, this.field2137, this.field2138);
		short var1 = 362;
		new class575(var1 + this.field2139, var1 + this.field2140, this.field2137, this.field2138);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	public int method4291() {
		return this.field2142;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method4285() {
		return this.field2135;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1124342620"
	)
	public int method4280() {
		return this.field2136;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lwe;",
		garbageValue = "1612936678"
	)
	public class575 method4273() {
		return this.field2141;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "119"
	)
	public static void method4294(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field2435 = var4;
		class28.cacheGamebuild = var3;

		try {
			WorldMapID.osName = System.getProperty("os.name");
		} catch (Exception var47) {
			WorldMapID.osName = "Unknown";
		}

		class411.osNameLowercase = WorldMapID.osName.toLowerCase();
		class4.userHomeDirectory = null;

		try {
			class4.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var46) {
		}

		if (class4.userHomeDirectory == null) {
			try {
				class4.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var45) {
			}
		}

		if (class4.userHomeDirectory != null) {
			class4.userHomeDirectory = class4.userHomeDirectory + "/";
		}

		try {
			if (class411.osNameLowercase.startsWith("win")) {
				if (class4.userHomeDirectory == null) {
					class4.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class4.userHomeDirectory == null) {
				class4.userHomeDirectory = System.getenv("HOME");
			}

			if (class4.userHomeDirectory != null) {
				class4.userHomeDirectory = class4.userHomeDirectory + "/";
			}
		} catch (Exception var44) {
		}

		if (class4.userHomeDirectory == null) {
			class4.userHomeDirectory = "~/";
		}

		DynamicObject.field825 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class4.userHomeDirectory, "/tmp/", ""};
		FadeInTask.field5086 = new String[]{".jagex_cache_" + class28.cacheGamebuild, ".file_store_" + class28.cacheGamebuild};
		int var19 = 0;

		File var6;
		label639:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			class573.field5665 = new File(class4.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			Buffer var12;
			File var56;
			if (class573.field5665.exists()) {
				AccessFile var11 = null;

				try {
					var11 = new AccessFile(class573.field5665, "rw", 10000L);

					int var13;
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
				} catch (Exception var50) {
					var50.printStackTrace();
				} finally {
					try {
						if (var11 != null) {
							var11.close();
						}
					} catch (IOException var42) {
					}

				}

				if (var8 != null) {
					var56 = new File(var8);
					if (!var56.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var56 = new File(var8, "test.dat");
					if (!class164.method3843(var56, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label611:
				for (int var20 = 0; var20 < FadeInTask.field5086.length; ++var20) {
					for (int var21 = 0; var21 < DynamicObject.field825.length; ++var21) {
						File var22 = new File(DynamicObject.field825[var21] + FadeInTask.field5086[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists() && class164.method3843(new File(var22, "test.dat"), true)) {
							var8 = var22.toString();
							var10 = true;
							break label611;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class4.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			File var55;
			if (var9 != null) {
				var55 = new File(var9);
				var56 = new File(var8);

				try {
					File[] var58 = var55.listFiles();
					File[] var23 = var58;

					for (int var24 = 0; var24 < var23.length; ++var24) {
						File var16 = var23[var24];
						File var17 = new File(var56, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var49) {
					var49.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				var55 = new File(var8);
				var12 = null;

				try {
					AccessFile var59 = new AccessFile(class573.field5665, "rw", 10000L);
					Buffer var60 = new Buffer(500);
					var60.writeByte(3);
					var60.writeByte(var12 != null ? 1 : 0);
					var60.writeCESU8(var55.getPath());
					if (var12 != null) {
						var60.writeCESU8("");
					}

					var59.write(var60.array, 0, var60.offset);
					var59.close();
				} catch (IOException var43) {
					var43.printStackTrace();
				}
			}

			var6 = new File(var8);
			StructComposition.cacheDir = var6;
			if (!StructComposition.cacheDir.exists()) {
				StructComposition.cacheDir.mkdirs();
			}

			File[] var52 = StructComposition.cacheDir.listFiles();
			if (var52 != null) {
				File[] var57 = var52;

				for (int var25 = 0; var25 < var57.length; ++var25) {
					File var26 = var57[var25];
					if (!class164.method3843(var26, false)) {
						++var19;
						continue label639;
					}
				}
			}
			break;
		}

		File var5 = StructComposition.cacheDir;
		class36.FileSystem_cacheDir = var5;
		if (!class36.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				var6 = new File(class4.userHomeDirectory, "random.dat");
				int var28;
				if (var6.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var6, "rw", 25L), 24, 0);
				} else {
					label562:
					for (int var27 = 0; var27 < FadeInTask.field5086.length; ++var27) {
						for (var28 = 0; var28 < DynamicObject.field825.length; ++var28) {
							File var54 = new File(DynamicObject.field825[var28] + FadeInTask.field5086[var27] + File.separatorChar + "random.dat");
							if (var54.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var54, "rw", 25L), 24, 0);
								break label562;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var53 = new RandomAccessFile(var6, "rw");
					var28 = var53.read();
					var53.seek(0L);
					var53.write(var28);
					var53.seek(0L);
					var53.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var6, "rw", 25L), 24, 0);
				}
			} catch (IOException var48) {
			}

			JagexCache.JagexCache_dat2File = new AccessFile(class220.getFile("main_file_cache.dat2"), "rw", 1048576000L);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class220.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.field2435];

			for (int var29 = 0; var29 < JagexCache.field2435; ++var29) {
				JagexCache.JagexCache_idxFiles[var29] = new BufferedFile(new AccessFile(class220.getFile("main_file_cache.idx" + var29), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1240432889"
	)
	static final int method4292(int var0, int var1) {
		int var2 = GrandExchangeEvent.method8235(var0 - 1, var1 - 1) + GrandExchangeEvent.method8235(1 + var0, var1 - 1) + GrandExchangeEvent.method8235(var0 - 1, 1 + var1) + GrandExchangeEvent.method8235(1 + var0, var1 + 1);
		int var3 = GrandExchangeEvent.method8235(var0 - 1, var1) + GrandExchangeEvent.method8235(var0 + 1, var1) + GrandExchangeEvent.method8235(var0, var1 - 1) + GrandExchangeEvent.method8235(var0, 1 + var1);
		int var4 = GrandExchangeEvent.method8235(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "1"
	)
	static int method4293(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DirectByteArrayCopier.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					DefaultsGroup.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ClientPacket.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}
}
