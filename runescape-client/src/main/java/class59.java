import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class59 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	VorbisFloor field418;
	@ObfuscatedName("aw")
	boolean field420;
	@ObfuscatedName("at")
	int[] field422;
	@ObfuscatedName("ae")
	int[] field421;
	@ObfuscatedName("ao")
	boolean[] field425;

	@ObfuscatedSignature(
		descriptor = "(Lbz;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field418 = var1;
		this.field420 = var2;
		this.field422 = var3;
		this.field421 = var4;
		this.field425 = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "1760129429"
	)
	void method1141(float[] var1, int var2) {
		int var3 = this.field418.field263.length;
		VorbisFloor var10000 = this.field418;
		int var4 = VorbisFloor.field262[this.field418.multiplier - 1];
		boolean[] var5 = this.field425;
		this.field425[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field418.method752(this.field422, var6);
			var8 = this.field418.method754(this.field422, var6);
			var9 = this.field418.method751(this.field422[var7], this.field421[var7], this.field422[var8], this.field421[var8], this.field422[var6]);
			var10 = this.field421[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field425;
				this.field425[var8] = true;
				var14[var7] = true;
				this.field425[var6] = true;
				if (var10 >= var13) {
					this.field421[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field421[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field425[var6] = false;
				this.field421[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field418.multiplier * this.field421[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field425[var8]) {
				var9 = this.field422[var8];
				var10 = this.field418.multiplier * this.field421[var8];
				this.field418.method758(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field418;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	boolean method1142() {
		return this.field420;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field422[var1];
			int var5 = this.field421[var1];
			boolean var6 = this.field425[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field422[var7];
				if (var8 < var4) {
					this.field422[var3] = var8;
					this.field421[var3] = this.field421[var7];
					this.field425[var3] = this.field425[var7];
					++var3;
					this.field422[var7] = this.field422[var3];
					this.field421[var7] = this.field421[var3];
					this.field425[var7] = this.field425[var3];
				}
			}

			this.field422[var3] = var4;
			this.field421[var3] = var5;
			this.field425[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1578109638"
	)
	public static final synchronized long method1150() {
		long var0 = System.currentTimeMillis();
		if (var0 < class543.field5388) {
			class329.field3603 += class543.field5388 - var0;
		}

		class543.field5388 = var0;
		return var0 + class329.field3603;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-62"
	)
	public static int method1144() {
		return ViewportMouse.ViewportMouse_entityCount;
	}
}
