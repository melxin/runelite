import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1747143425
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1922297601
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1728899777
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1837221829
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 253851301
	)
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1572372041
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 118736907
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1901785051
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -631571575
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1075972829
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -361424135
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -518371837
	)
	int field2774;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2095835569
	)
	int field2773;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1094593375
	)
	int field2778;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2088531503
	)
	int field2775;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1710977545
	)
	int field2776;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2013500371
	)
	int field2777;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1022023155
	)
	int field2772;

	Occluder() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "45"
	)
	public static void method5373(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class533.field5487 = var4;
		ClientPreferences.cacheGamebuild = var3;

		try {
			ApproximateRouteStrategy.osName = System.getProperty("os.name");
		} catch (Exception var14) {
			ApproximateRouteStrategy.osName = "Unknown";
		}

		HorizontalAlignment.osNameLowercase = ApproximateRouteStrategy.osName.toLowerCase();
		class502.userHomeDirectory = null;

		try {
			class502.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var13) {
		}

		if (class502.userHomeDirectory == null) {
			try {
				class502.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var12) {
			}
		}

		if (class502.userHomeDirectory != null) {
			class502.userHomeDirectory = class502.userHomeDirectory + "/";
		}

		try {
			if (HorizontalAlignment.osNameLowercase.startsWith("win")) {
				if (class502.userHomeDirectory == null) {
					class502.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class502.userHomeDirectory == null) {
				class502.userHomeDirectory = System.getenv("HOME");
			}

			if (class502.userHomeDirectory != null) {
				class502.userHomeDirectory = class502.userHomeDirectory + "/";
			}
		} catch (Exception var11) {
		}

		if (class502.userHomeDirectory == null) {
			class502.userHomeDirectory = "~/";
		}

		HttpMethod.field41 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class502.userHomeDirectory, "/tmp/", ""};
		class427.field4969 = new String[]{".jagex_cache_" + ClientPreferences.cacheGamebuild, ".file_store_" + ClientPreferences.cacheGamebuild};
		int var10 = 0;

		label107:
		while (var10 < 4) {
			UserComparator9.cacheDir = Skeleton.method5073(var0, var2, var10);
			if (!UserComparator9.cacheDir.exists()) {
				UserComparator9.cacheDir.mkdirs();
			}

			File[] var6 = UserComparator9.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label107;
				}

				File var9 = var7[var8];
				if (!MenuAction.method1865(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		ActorSpotAnim.method10193(UserComparator9.cacheDir);
		UserComparator5.method3504();
		JagexCache.JagexCache_dat2File = new AccessFile(Tiles.getFile("main_file_cache.dat2"), "rw", 1048576000L);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Tiles.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class159.JagexCache_idxFiles = new BufferedFile[class533.field5487];

		for (var10 = 0; var10 < class533.field5487; ++var10) {
			class159.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(Tiles.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([II)Ltn;",
		garbageValue = "782923509"
	)
	public static DynamicArray method5374(int[] var0) {
		DynamicArray var1 = new DynamicArray(class570.field5721, false);
		var1.array = var0;
		var1.size = var0.length * 1527641021;
		var1.field5402 = var0.length;
		return var1;
	}
}
