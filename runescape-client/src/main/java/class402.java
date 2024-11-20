import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class402 {
	@ObfuscatedName("ab")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("at")
	int[] field4663;
	@ObfuscatedName("ae")
	int[] field4662;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -71437587
	)
	int field4665;

	public class402() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4663 = new int[2048];
		this.field4662 = new int[2048];
		this.field4665 = 0;
		class379.method7475();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1507753105"
	)
	void method7761(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = FloorUnderlayDefinition.method3993((double)(var8 - 0) / var4) / var4;
			var7[var9] = var20;
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var11 * var2] = (int)(var14[var11] * var14[var12] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvr;",
		garbageValue = "48"
	)
	SpritePixels method7777(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7761(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2013697849"
	)
	public final void method7763(int var1, int var2) {
		if (this.field4665 < this.field4663.length) {
			this.field4663[this.field4665] = var1;
			this.field4662[this.field4665] = var2;
			++this.field4665;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2003993885"
	)
	public final void method7764() {
		this.field4665 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILvr;FB)V",
		garbageValue = "35"
	)
	public final void method7762(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method7777(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4665; ++var10) {
			var11 = this.field4663[var10];
			var12 = this.field4662[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8093(var8, var9);
			this.method7771(var6, var3, var9);
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
					if (var11 > class354.field3791.length) {
						var11 = class354.field3791.length;
					}

					var12 = class354.field3791[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvr;Lvr;Lqw;B)V",
		garbageValue = "-2"
	)
	void method7771(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
}
