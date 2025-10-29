import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public enum class137 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	field1637(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	field1631(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	field1632(2, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	field1633(3, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	field1634(4, 4);

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1061759277
	)
	final int field1635;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 808963879
	)
	final int field1636;

	class137(int var3, int var4) {
		this.field1635 = var3;
		this.field1636 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1636;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "-32"
	)
	static File method3826(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		SoundCache.field1347 = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		File var31;
		if (SoundCache.field1347.exists()) {
			AccessFile var7 = null;

			try {
				var7 = new AccessFile(SoundCache.field1347, "rw", 10000L);

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset * 2108391709 < var8.array.length; var8.offset += 1741769013 * var9) {
					var9 = var7.read(var8.array, var8.offset * 2108391709, var8.array.length - var8.offset * 2108391709);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}
			} catch (Exception var28) {
				var28.printStackTrace();
			} finally {
				try {
					if (var7 != null) {
						var7.close();
					}
				} catch (IOException var26) {
				}

			}

			if (var4 != null) {
				var31 = new File(var4);
				if (!var31.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var31 = new File(var4, "test.dat");
				if (!class194.method4453(var31, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label298:
			for (int var15 = 0; var15 < class201.field2173.length; ++var15) {
				for (int var16 = 0; var16 < class596.field6009.length; ++var16) {
					File var17 = new File(class596.field6009[var16] + class201.field2173[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && class194.method4453(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label298;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var30 = new File(var5);
			var31 = new File(var4);

			try {
				File[] var32 = var30.listFiles();
				File[] var18 = var32;

				for (int var19 = 0; var19 < var18.length; ++var19) {
					File var12 = var18[var19];
					File var13 = new File(var31, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var27) {
				var27.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			class225.method5013(new File(var4), (File)null);
		}

		return new File(var4);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1846807064"
	)
	public static int method3827(int var0) {
		return class543.field5653[var0 & 16383];
	}
}
