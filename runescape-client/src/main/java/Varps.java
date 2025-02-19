import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ab")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("au")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ad")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[5000];
		Varps_main = new int[5000];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "4"
	)
	public static void method6860(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		BuddyRankComparator.field1546 = var4;
		class47.cacheGamebuild = var3;

		try {
			class140.osName = System.getProperty("os.name");
		} catch (Exception var41) {
			class140.osName = "Unknown";
		}

		GrandExchangeOfferAgeComparator.osNameLowercase = class140.osName.toLowerCase();
		class321.userHomeDirectory = null;

		try {
			class321.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var40) {
		}

		if (class321.userHomeDirectory == null) {
			try {
				class321.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var39) {
			}
		}

		if (class321.userHomeDirectory != null) {
			class321.userHomeDirectory = class321.userHomeDirectory + "/";
		}

		try {
			if (GrandExchangeOfferAgeComparator.osNameLowercase.startsWith("win")) {
				if (class321.userHomeDirectory == null) {
					class321.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class321.userHomeDirectory == null) {
				class321.userHomeDirectory = System.getenv("HOME");
			}

			if (class321.userHomeDirectory != null) {
				class321.userHomeDirectory = class321.userHomeDirectory + "/";
			}
		} catch (Exception var38) {
		}

		if (class321.userHomeDirectory == null) {
			class321.userHomeDirectory = "~/";
		}

		class338.field3747 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class321.userHomeDirectory, "/tmp/", ""};
		Message.field471 = new String[]{".jagex_cache_" + class47.cacheGamebuild, ".file_store_" + class47.cacheGamebuild};
		int var19 = 0;

		label522:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field2430 = new File(class321.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			File var47;
			if (JagexCache.field2430.exists()) {
				AccessFile var11 = null;

				try {
					var11 = new AccessFile(JagexCache.field2430, "rw", 10000L);

					Buffer var12;
					int var13;
					for (var12 = new Buffer((int)var11.length()); var12.field5570 < var12.field5573.length; var12.field5570 += var13) {
						var13 = var11.read(var12.field5573, var12.field5570, var12.field5573.length - var12.field5570);
						if (var13 == -1) {
							throw new IOException();
						}
					}

					var12.field5570 = 0;
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
				} catch (Exception var43) {
					var43.printStackTrace();
				} finally {
					try {
						if (var11 != null) {
							var11.close();
						}
					} catch (IOException var37) {
					}

				}

				if (var8 != null) {
					var47 = new File(var8);
					if (!var47.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var47 = new File(var8, "test.dat");
					if (!KeyHandler.method319(var47, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label494:
				for (int var20 = 0; var20 < Message.field471.length; ++var20) {
					for (int var21 = 0; var21 < class338.field3747.length; ++var21) {
						File var22 = new File(class338.field3747[var21] + Message.field471[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists() && KeyHandler.method319(new File(var22, "test.dat"), true)) {
							var8 = var22.toString();
							var10 = true;
							break label494;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class321.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var46 = new File(var9);
				var47 = new File(var8);

				try {
					File[] var49 = var46.listFiles();
					File[] var23 = var49;

					for (int var24 = 0; var24 < var23.length; ++var24) {
						File var16 = var23[var24];
						File var17 = new File(var47, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var42) {
					var42.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				HealthBarUpdate.method2662(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			VarcInt.cacheDir = var6;
			if (!VarcInt.cacheDir.exists()) {
				VarcInt.cacheDir.mkdirs();
			}

			File[] var45 = VarcInt.cacheDir.listFiles();
			if (var45 != null) {
				File[] var48 = var45;

				for (int var25 = 0; var25 < var48.length; ++var25) {
					File var26 = var48[var25];
					if (!KeyHandler.method319(var26, false)) {
						++var19;
						continue label522;
					}
				}
			}
			break;
		}

		class140.method3399(VarcInt.cacheDir);
		ArchiveDisk.method9482();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class59.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class59.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class379.JagexCache_idxFiles = new BufferedFile[BuddyRankComparator.field1546];

		for (var19 = 0; var19 < BuddyRankComparator.field1546; ++var19) {
			class379.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(class59.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}

	}
}
