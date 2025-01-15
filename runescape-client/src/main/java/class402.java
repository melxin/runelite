import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class402 {
	@ObfuscatedName("ay")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("az")
	int[] field4650;
	@ObfuscatedName("ao")
	int[] field4653;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1399423945
	)
	int field4654;

	public class402() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4650 = new int[2048];
		this.field4653 = new int[2048];
		this.field4654 = 0;
		class309.field3287 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = HttpMethod.method82((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			class309.field3287[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class309.field3287.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = HttpMethod.method82((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class309.field3287.length; ++var1) {
				class309.field3287[var1] = var5;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "249957867"
	)
	void method7941(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4;
			double var14 = Math.exp(-var16 * var16 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var24 = var14 / var4;
			var7[var9] = var24;
			++var8;
		}

		double[] var18 = var7;
		double var19 = var7[var1] * var7[var1];
		int[] var21 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var21[var12 + var2 * var11] = (int)(var18[var12] * var18[var11] / var19 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2);
		this.spriteMap.put(var1, var22);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvf;",
		garbageValue = "1"
	)
	SpritePixels method7951(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7941(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "4032"
	)
	public final void method7943(int var1, int var2) {
		if (this.field4654 < this.field4650.length) {
			this.field4650[this.field4654] = var1;
			this.field4653[this.field4654] = var2;
			++this.field4654;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20350834"
	)
	public final void method7940() {
		this.field4654 = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILvf;FI)V",
		garbageValue = "203828085"
	)
	public final void method7945(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method7951(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4654; ++var10) {
			var11 = this.field4650[var10];
			var12 = this.field4653[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8265(var8, var9);
			this.method7946(var6, var3, var9);
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
					if (var11 > class309.field3287.length) {
						var11 = class309.field3287.length;
					}

					var12 = class309.field3287[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Lvf;Lql;B)V",
		garbageValue = "127"
	)
	void method7946(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

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
