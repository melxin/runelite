import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class413 {
	@ObfuscatedName("ab")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("au")
	int[] field4777;
	@ObfuscatedName("ad")
	int[] field4778;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 800218613
	)
	int field4781;

	public class413() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4777 = new int[2048];
		this.field4778 = new int[2048];
		this.field4781 = 0;
		class31.method427();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	void method7856(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = HttpMethod.method74(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwg;",
		garbageValue = "2"
	)
	SpritePixels method7858(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7856(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "44"
	)
	public final void method7859(int var1, int var2) {
		if (this.field4781 < this.field4777.length) {
			this.field4777[this.field4781] = var1;
			this.field4778[this.field4781] = var2;
			++this.field4781;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2131627858"
	)
	public final void method7860() {
		this.field4781 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILwg;FB)V",
		garbageValue = "-25"
	)
	public final void method7861(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method7858(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4781; ++var10) {
			var11 = this.field4777[var10];
			var12 = this.field4778[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8282(var8, var9);
			this.method7862(var6, var3, var9);
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
					if (var11 > Varcs.field1473.length) {
						var11 = Varcs.field1473.length;
					}

					var12 = Varcs.field1473[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwg;Lwg;Lqn;I)V",
		garbageValue = "1836304183"
	)
	void method7862(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
