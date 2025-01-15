import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class59 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field398;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	VorbisFloor field403;
	@ObfuscatedName("ah")
	boolean field399;
	@ObfuscatedName("az")
	int[] field402;
	@ObfuscatedName("ao")
	int[] field401;
	@ObfuscatedName("ad")
	boolean[] field406;

	@ObfuscatedSignature(
		descriptor = "(Lbv;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field403 = var1;
		this.field399 = var2;
		this.field402 = var3;
		this.field401 = var4;
		this.field406 = var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "0"
	)
	void method1195(float[] var1, int var2) {
		int var3 = this.field403.field247.length;
		VorbisFloor var10000 = this.field403;
		int var4 = VorbisFloor.field251[this.field403.multiplier - 1];
		boolean[] var5 = this.field406;
		this.field406[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field403.method786(this.field402, var6);
			var8 = this.field403.method784(this.field402, var6);
			var9 = this.field403.method791(this.field402[var7], this.field401[var7], this.field402[var8], this.field401[var8], this.field402[var6]);
			var10 = this.field401[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field406;
				this.field406[var8] = true;
				var14[var7] = true;
				this.field406[var6] = true;
				if (var10 >= var13) {
					this.field401[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field401[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field406[var6] = false;
				this.field401[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field403.multiplier * this.field401[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field406[var8]) {
				var9 = this.field402[var8];
				var10 = this.field403.multiplier * this.field401[var8];
				this.field403.method783(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field403;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-299665421"
	)
	boolean method1199() {
		return this.field399;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2077114824"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field402[var1];
			int var5 = this.field401[var1];
			boolean var6 = this.field406[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field402[var7];
				if (var8 < var4) {
					this.field402[var3] = var8;
					this.field401[var3] = this.field401[var7];
					this.field406[var3] = this.field406[var7];
					++var3;
					this.field402[var7] = this.field402[var3];
					this.field401[var7] = this.field401[var3];
					this.field406[var7] = this.field406[var3];
				}
			}

			this.field402[var3] = var4;
			this.field401[var3] = var5;
			this.field406[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-37"
	)
	public static boolean method1203(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class417.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
