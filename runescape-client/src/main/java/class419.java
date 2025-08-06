import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class419 {
	@ObfuscatedName("au")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ah")
	int[] field4938;
	@ObfuscatedName("ap")
	int[] field4940;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -862713019
	)
	int field4937;

	public class419() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4938 = new int[2048];
		this.field4940 = new int[2048];
		this.field4937 = 0;
		Varcs.method2869();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "128"
	)
	void method8575(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class389.method8204(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lxv;",
		garbageValue = "1592680047"
	)
	SpritePixels method8582(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method8575(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public final void method8577(int var1, int var2) {
		if (this.field4937 < this.field4938.length) {
			this.field4938[this.field4937] = var1;
			this.field4940[this.field4937] = var2;
			++this.field4937;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1669477029"
	)
	public final void method8578() {
		this.field4937 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILxv;FB)V",
		garbageValue = "1"
	)
	public final void method8579(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method8582(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4937; ++var10) {
			var11 = this.field4938[var10];
			var12 = this.field4940[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8982(var8, var9);
			this.method8592(var6, var3, var9);
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
					if (var11 > class447.field5053.length) {
						var11 = class447.field5053.length;
					}

					var12 = class447.field5053[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lxv;Lxv;Lri;I)V",
		garbageValue = "-1583851604"
	)
	void method8592(SpritePixels var1, SpritePixels var2, Bounds var3) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[BIIIIB)V",
		garbageValue = "57"
	)
	static final void method8597(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				CollisionMap var13 = var0.collisionMaps[var6];

				for (var8 = var2; var8 < var2 + 64; ++var8) {
					for (var9 = var3; var9 < var3 + 64; ++var9) {
						if (var13.method6138(var8, var9)) {
							var13.method6146(var8, var9, 1073741824);
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		int var7;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var8 + var2;
					int var11 = var3 + var9;
					AsyncHttpResponse.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

		var7 = var12.offset < var12.array.length ? var12.readUnsignedByte() : 0;
		boolean var14 = (var7 & 1) != 0;
		if (var14) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (var10 = 0; var10 < 64; ++var10) {
					Projectile.method1932(var12);
				}
			}
		}

	}
}
