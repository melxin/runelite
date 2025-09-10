import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class423 {
	@ObfuscatedName("jx")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ap")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ao")
	int[] field5056;
	@ObfuscatedName("as")
	int[] field5052;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1851857603
	)
	int field5051;

	public class423() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field5056 = new int[2048];
		this.field5052 = new int[2048];
		this.field5051 = 0;
		class68.method2165();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "984165337"
	)
	void method8539(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class389.method8216(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lxt;",
		garbageValue = "67"
	)
	SpritePixels method8540(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method8539(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-174112304"
	)
	public final void method8548(int var1, int var2) {
		if (this.field5051 < this.field5056.length) {
			this.field5056[this.field5051] = var1;
			this.field5052[this.field5051] = var2;
			++this.field5051;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	public final void method8538() {
		this.field5051 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILxt;FB)V",
		garbageValue = "-55"
	)
	public final void method8543(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method8540(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field5051; ++var10) {
			var11 = this.field5056[var10];
			var12 = this.field5052[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8945(var8, var9);
			this.method8544(var6, var3, var9);
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
					if (var11 > class464.field5243.length) {
						var11 = class464.field5243.length;
					}

					var12 = class464.field5243[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lxt;Lxt;Lrw;B)V",
		garbageValue = "-83"
	)
	void method8544(SpritePixels var1, SpritePixels var2, Bounds var3) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([IB)Lti;",
		garbageValue = "-37"
	)
	public static DynamicArray method8555(int[] var0) {
		DynamicArray var1 = new DynamicArray(class574.field5820, true);
		var1.array = var0;
		var1.size = var0.length * -698619497;
		var1.field5503 = var0.length;
		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1289018762"
	)
	static void method8556(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "65871715"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !FriendSystem.method1591(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}
}
