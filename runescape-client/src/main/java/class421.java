import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class421 {
	@ObfuscatedName("aj")
	static int[] field5084;
	@ObfuscatedName("ar")
	@Export("osName")
	static String osName;
	@ObfuscatedName("ah")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ae")
	int[] field5083;
	@ObfuscatedName("aq")
	int[] field5088;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1823224673
	)
	int field5089;

	public class421() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field5083 = new int[2048];
		this.field5088 = new int[2048];
		this.field5089 = 0;
		class332.method7066();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1057786364"
	)
	void method8611(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = WorldView.method2763((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var11 * var2] = (int)(256.0D * (var14[var12] * var14[var11] / var15));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lxl;",
		garbageValue = "-642051074"
	)
	SpritePixels method8600(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method8611(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "33"
	)
	public final void method8608(int var1, int var2) {
		if (this.field5089 < this.field5083.length) {
			this.field5083[this.field5089] = var1;
			this.field5088[this.field5089] = var2;
			++this.field5089;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1122711216"
	)
	public final void method8604() {
		this.field5089 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILxl;FI)V",
		garbageValue = "609690302"
	)
	public final void method8609(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method8600(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field5089; ++var10) {
			var11 = this.field5083[var10];
			var12 = this.field5088[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method9031(var8, var9);
			this.method8606(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field5084.length) {
						var11 = field5084.length;
					}

					var12 = field5084[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxl;Lxl;Lra;I)V",
		garbageValue = "-868642713"
	)
	void method8606(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-633824178"
	)
	public static void method8618(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		class57.soundEffectIds[class57.soundEffectCount] = var0;
		class57.soundEffects[class57.soundEffectCount] = null;
		class57.soundLocations[class57.soundEffectCount] = var4 + (var3 << 8) + (var2 << 16);
		class57.field811[class57.soundEffectCount] = var1;
		class57.queuedSoundEffectLoops[class57.soundEffectCount] = var6;
		class57.queuedSoundEffectDelays[class57.soundEffectCount] = var7;
		class57.field813[class57.soundEffectCount] = var5;
		class57.field812[class57.soundEffectCount] = var8;
		++class57.soundEffectCount;
	}
}
