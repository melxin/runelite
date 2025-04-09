import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ao")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lse;I)I",
		garbageValue = "-290030494"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[BLti;I)V",
		garbageValue = "-84672039"
	)
	static void method3222(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4664) {
			if (ArchiveDiskActionHandler.field4668 == 0) {
				GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.setDaemon(true);
				GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.start();
				GrandExchangeOfferOwnWorldComparator.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4668 = 600;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-889019955"
	)
	public static void method3214(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class250.field2763 = var4;
		class450.cacheGamebuild = var3;

		try {
			class386.osName = System.getProperty("os.name");
		} catch (Exception var16) {
			class386.osName = "Unknown";
		}

		UserComparator5.osNameLowercase = class386.osName.toLowerCase();
		class166.userHomeDirectory = null;

		try {
			class166.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var15) {
		}

		if (class166.userHomeDirectory == null) {
			try {
				class166.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var14) {
			}
		}

		if (class166.userHomeDirectory != null) {
			class166.userHomeDirectory = class166.userHomeDirectory + "/";
		}

		try {
			if (UserComparator5.osNameLowercase.startsWith("win")) {
				if (class166.userHomeDirectory == null) {
					class166.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class166.userHomeDirectory == null) {
				class166.userHomeDirectory = System.getenv("HOME");
			}

			if (class166.userHomeDirectory != null) {
				class166.userHomeDirectory = class166.userHomeDirectory + "/";
			}
		} catch (Exception var13) {
		}

		if (class166.userHomeDirectory == null) {
			class166.userHomeDirectory = "~/";
		}

		VertexNormal.field2318 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class166.userHomeDirectory, "/tmp/", ""};
		Varcs.field1454 = new String[]{".jagex_cache_" + class450.cacheGamebuild, ".file_store_" + class450.cacheGamebuild};
		int var10 = 0;

		int var8;
		File var9;
		label154:
		while (var10 < 4) {
			class7.cacheDir = class130.method3260(var0, var2, var10);
			if (!class7.cacheDir.exists()) {
				class7.cacheDir.mkdirs();
			}

			File[] var6 = class7.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label154;
				}

				var9 = var7[var8];
				if (!RestClientThreadFactory.method204(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		File var5 = class7.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;

			try {
				File var18 = new File(class166.userHomeDirectory, "random.dat");
				if (var18.exists()) {
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var18, "rw", 25L), 24, 0);
				} else {
					label134:
					for (int var11 = 0; var11 < Varcs.field1454.length; ++var11) {
						for (var8 = 0; var8 < VertexNormal.field2318.length; ++var8) {
							var9 = new File(VertexNormal.field2318[var8] + Varcs.field1454[var11] + File.separatorChar + "random.dat");
							if (var9.exists()) {
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var9, "rw", 25L), 24, 0);
								break label134;
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) {
					RandomAccessFile var19 = new RandomAccessFile(var18, "rw");
					var8 = var19.read();
					var19.seek(0L);
					var19.write(var8);
					var19.seek(0L);
					var19.close();
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var18, "rw", 25L), 24, 0);
				}
			} catch (IOException var17) {
			}

			JagexCache.JagexCache_dat2File = new AccessFile(class140.getFile("main_file_cache.dat2"), "rw", 1048576000L);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[class250.field2763];

			for (int var12 = 0; var12 < class250.field2763; ++var12) {
				JagexCache.JagexCache_idxFiles[var12] = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	public static void method3219() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IZLdb;I)V",
		garbageValue = "-486713431"
	)
	static void method3221(Widget var0, int var1, boolean var2, Script var3) {
		if (var0.children == null) {
			var0.children = new Widget[var1 + 1];
		}

		if (var0.children.length <= var1) {
			Widget[] var4 = new Widget[var1 + 1];
			System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
			var0.children = var4;
		} else {
			Widget var5 = var0.children[var1];
			if (var5 != null) {
				if (var2) {
					throw new RuntimeException("");
				}

				class322.method6542(var5, var0);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lph;Ljava/lang/String;Ljava/lang/String;B)Lws;",
		garbageValue = "-17"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class362.method7335(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class280.method5890();
			}

			return var5;
		}
	}
}
