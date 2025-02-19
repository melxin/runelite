import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ul")
public class class521 {
	@ObfuscatedName("ac")
	static int[] field5285;
	@ObfuscatedName("ao")
	public static int[] field5286;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	static {
		field5285 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			int[] var1 = field5285;
			double var4 = (double)(var0 >> 10 & 31) / 31.0D;
			double var6 = (double)(var0 >> 5 & 31) / 31.0D;
			double var8 = (double)(var0 & 31) / 31.0D;
			double var10 = var4;
			if (var6 < var4) {
				var10 = var6;
			}

			if (var8 < var10) {
				var10 = var8;
			}

			double var12 = var4;
			if (var6 > var4) {
				var12 = var6;
			}

			if (var8 > var12) {
				var12 = var8;
			}

			double var14 = 0.0D;
			double var29 = 0.0D;
			double var31 = (var12 + var10) / 2.0D;
			if (var10 != var12) {
				if (var31 < 0.5D) {
					var29 = (var12 - var10) / (var12 + var10);
				}

				if (var31 >= 0.5D) {
					var29 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var4 == var12) {
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var12 == var6) {
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var8 == var12) {
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D);
			var20 &= 255;
			double var21 = var29 * 256.0D;
			if (var21 < 0.0D) {
				var21 = 0.0D;
			} else if (var21 > 255.0D) {
				var21 = 255.0D;
			}

			if (var31 > 0.7D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.75D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.85D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.95D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var31 > 0.995D) {
				var31 = 0.995D;
			}

			int var33 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8));
			int var34 = (int)(128.0D * var31) + (var33 << 7);
			var1[var0] = var34;
		}

		if (field5286 == null) {
			field5286 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (1.0D + var5) * var7;
					} else {
						var15 = var5 + var7 - var7 * var5;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + var19 * (var15 - var17) * 6.0D;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = 6.0D * (var15 - var17) * (0.6666666666666666D - var19) + var17;
					} else {
						var9 = var17;
					}

					if (6.0D * var3 < 1.0D) {
						var11 = var17 + var3 * 6.0D * (var15 - var17);
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var23 * (var15 - var17) * 6.0D + var17;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(var9 * 256.0D);
				int var16 = (int)(256.0D * var11);
				int var28 = (int)(256.0D * var13);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field5286[var2] = var18 & 16777215;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "579701847"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) {
				World.World_request = Tiles.urlRequester.request(new URL(class510.field5244));
			} else if (World.World_request.isDone()) {
				byte[] var0 = World.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				GZipDecompressor.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = GZipDecompressor.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				WorldMapEvent.sortWorlds(GZipDecompressor.World_worlds, 0, GZipDecompressor.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				World.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			World.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "125"
	)
	public static int method9608(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1888199153"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "-8"
	)
	public static void method9609(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.field5573, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "20"
	)
	static int method9615(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "320008194"
	)
	static int method9613() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field708;
		} else {
			return 10000;
		}
	}
}
