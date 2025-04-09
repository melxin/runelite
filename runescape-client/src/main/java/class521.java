import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
public class class521 {
	@ObfuscatedName("aq")
	static int[] field5304;
	@ObfuscatedName("av")
	public static int[] field5305;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	static {
		field5304 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			int[] var1 = field5304;
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
			double var16 = 0.0D;
			double var18 = (var12 + var10) / 2.0D;
			if (var10 != var12) {
				if (var18 < 0.5D) {
					var16 = (var12 - var10) / (var10 + var12);
				}

				if (var18 >= 0.5D) {
					var16 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var12 == var4) {
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var6 == var12) {
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var8 == var12) {
					var14 = 4.0D + (var4 - var6) / (var12 - var10);
				}
			}

			int var20 = (int)(var14 * 256.0D / 6.0D);
			var20 &= 255;
			double var21 = 256.0D * var16;
			if (var21 < 0.0D) {
				var21 = 0.0D;
			} else if (var21 > 255.0D) {
				var21 = 255.0D;
			}

			if (var18 > 0.7D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.75D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.85D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.95D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.995D) {
				var18 = 0.995D;
			}

			int var23 = (int)(var21 / 32.0D + (double)(var20 / 4 * 8));
			int var3 = (int)(128.0D * var18) + (var23 << 7);
			var1[var0] = var3;
		}

		method9680();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1753732316"
	)
	static void method9680() {
		if (field5305 == null) {
			field5305 = new int[65536];
			double var0 = 0.949999988079071D;

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
						var15 = (var5 + 1.0D) * var7;
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = (var15 - var17) * 6.0D * var19 + var17;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (6.0D * var3 < 1.0D) {
						var11 = var17 + (var15 - var17) * 6.0D * var3;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var3);
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var17 + var23 * 6.0D * (var15 - var17);
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(var9 * 256.0D);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5305[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	static void method9686() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				BufferedSink.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				BufferedSink.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "7526"
	)
	public static int method9679(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-873048875"
	)
	static void method9685() {
		Script.Script_cached.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-929263721"
	)
	static boolean method9684(Date var0) {
		java.util.Calendar var2 = java.util.Calendar.getInstance();
		var2.set(2, 0);
		var2.set(5, 1);
		var2.set(1, 1900);
		Date var1 = var2.getTime();
		return var0.after(var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "118"
	)
	static int method9678(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
