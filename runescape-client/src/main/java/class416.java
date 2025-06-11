import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class416 {
	@ObfuscatedName("ai")
	static int[] field4842;
	@ObfuscatedName("al")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("aa")
	int[] field4845;
	@ObfuscatedName("am")
	int[] field4846;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 892251439
	)
	int field4848;

	public class416() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4845 = new int[2048];
		this.field4846 = new int[2048];
		this.field4848 = 0;
		class4.method14();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2002723576"
	)
	void method8268(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = HttpRequest.method99((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lwd;",
		garbageValue = "-968958636"
	)
	SpritePixels method8269(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method8268(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-815412750"
	)
	public final void method8270(int var1, int var2) {
		if (this.field4848 < this.field4845.length) {
			this.field4845[this.field4848] = var1;
			this.field4846[this.field4848] = var2;
			++this.field4848;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-988852815"
	)
	public final void method8281() {
		this.field4848 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILwd;FB)V",
		garbageValue = "-29"
	)
	public final void method8278(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method8269(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4848; ++var10) {
			var11 = this.field4845[var10];
			var12 = this.field4846[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8646(var8, var9);
			this.method8271(var6, var3, var9);
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
					if (var11 > field4842.length) {
						var11 = field4842.length;
					}

					var12 = field4842[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwd;Lwd;Lrv;B)V",
		garbageValue = "0"
	)
	void method8271(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
