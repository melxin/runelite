import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class30 {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static GraphicsDefaults field133;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -2093912385
	)
	static int field134;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("worldView")
	static WorldView worldView;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "1"
	)
	public static void method483(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class438.field4823 = var4;
		class73.cacheGamebuild = var3;

		try {
			class544.osName = System.getProperty("os.name");
		} catch (Exception var14) {
			class544.osName = "Unknown";
		}

		Decimator.osNameLowercase = class544.osName.toLowerCase();
		HttpContentType.userHomeDirectory = null;

		try {
			HttpContentType.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var13) {
		}

		if (HttpContentType.userHomeDirectory == null) {
			try {
				HttpContentType.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var12) {
			}
		}

		if (HttpContentType.userHomeDirectory != null) {
			HttpContentType.userHomeDirectory = HttpContentType.userHomeDirectory + "/";
		}

		try {
			if (Decimator.osNameLowercase.startsWith("win")) {
				if (HttpContentType.userHomeDirectory == null) {
					HttpContentType.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (HttpContentType.userHomeDirectory == null) {
				HttpContentType.userHomeDirectory = System.getenv("HOME");
			}

			if (HttpContentType.userHomeDirectory != null) {
				HttpContentType.userHomeDirectory = HttpContentType.userHomeDirectory + "/";
			}
		} catch (Exception var11) {
		}

		if (HttpContentType.userHomeDirectory == null) {
			HttpContentType.userHomeDirectory = "~/";
		}

		class355.field3789 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", HttpContentType.userHomeDirectory, "/tmp/", ""};
		BuddyRankComparator.field1522 = new String[]{".jagex_cache_" + class73.cacheGamebuild, ".file_store_" + class73.cacheGamebuild};
		int var10 = 0;

		label108:
		while (var10 < 4) {
			JagexCache.cacheDir = class145.method3556(var0, var2, var10);
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var6 = JagexCache.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label108;
				}

				File var9 = var7[var8];
				if (!HealthBarConfig.method3008(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		HttpResponse.method308(JagexCache.cacheDir);
		MouseRecorder.method2635();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		UserComparator4.JagexCache_idxFiles = new BufferedFile[class438.field4823];

		for (var10 = 0; var10 < class438.field4823; ++var10) {
			UserComparator4.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(class140.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljc;",
		garbageValue = "-1834814068"
	)
	public static HealthBarDefinition method482(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field2568 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1094768085"
	)
	public static int method481(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-56"
	)
	static int method484(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.indexCheck.method5755(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.indexCheck.method5774(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "716080260"
	)
	public static boolean method480() {
		return Client.staffModLevel >= 2;
	}
}
