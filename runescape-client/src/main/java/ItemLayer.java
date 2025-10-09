import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -888142247
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -768569011
	)
	@Export("z")
	int z;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -39148065
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -546467797
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -4036438617443599847L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1024341611
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "7"
	)
	public static void method4893(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class153.field1788 = var4;
		class380.cacheGamebuild = var3;

		try {
			class421.osName = System.getProperty("os.name");
		} catch (Exception var19) {
			class421.osName = "Unknown";
		}

		class154.osNameLowercase = class421.osName.toLowerCase();
		ItemContainer.userHomeDirectory = null;

		try {
			ItemContainer.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var18) {
		}

		if (ItemContainer.userHomeDirectory == null) {
			try {
				ItemContainer.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var17) {
			}
		}

		if (ItemContainer.userHomeDirectory != null) {
			ItemContainer.userHomeDirectory = ItemContainer.userHomeDirectory + "/";
		}

		try {
			if (class154.osNameLowercase.startsWith("win")) {
				if (ItemContainer.userHomeDirectory == null) {
					ItemContainer.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (ItemContainer.userHomeDirectory == null) {
				ItemContainer.userHomeDirectory = System.getenv("HOME");
			}

			if (ItemContainer.userHomeDirectory != null) {
				ItemContainer.userHomeDirectory = ItemContainer.userHomeDirectory + "/";
			}
		} catch (Exception var16) {
		}

		if (ItemContainer.userHomeDirectory == null) {
			ItemContainer.userHomeDirectory = "~/";
		}

		DefaultsGroup.field5589 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ItemContainer.userHomeDirectory, "/tmp/", ""};
		JagexCache.field3115 = new String[]{".jagex_cache_" + class380.cacheGamebuild, ".file_store_" + class380.cacheGamebuild};
		int var13 = 0;

		label118:
		while (var13 < 4) {
			DbTable.cacheDir = class29.method464(var0, var2, var13);
			if (!DbTable.cacheDir.exists()) {
				DbTable.cacheDir.mkdirs();
			}

			File[] var6 = DbTable.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label118;
				}

				File var9 = var7[var8];

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw");
					int var12 = var11.read();
					var11.seek(0L);
					var11.write(var12);
					var11.seek(0L);
					var11.close();
					var10 = true;
				} catch (Exception var15) {
					var10 = false;
				}

				if (!var10) {
					++var13;
					break;
				}

				++var8;
			}
		}

		File var5 = DbTable.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			class302.method6842();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class147.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class147.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			JagexCache.JagexCache_idxFiles = new BufferedFile[class153.field1788];

			for (int var14 = 0; var14 < class153.field1788; ++var14) {
				JagexCache.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(class147.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
			}

		}
	}
}
