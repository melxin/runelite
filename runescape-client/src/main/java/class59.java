import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class59 {
	@ObfuscatedName("jm")
	static String field405;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	VorbisFloor field410;
	@ObfuscatedName("an")
	boolean field406;
	@ObfuscatedName("ae")
	int[] field407;
	@ObfuscatedName("af")
	int[] field408;
	@ObfuscatedName("as")
	boolean[] field409;

	@ObfuscatedSignature(
		descriptor = "(Lbv;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field410 = var1;
		this.field406 = var2;
		this.field407 = var3;
		this.field408 = var4;
		this.field409 = var5;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "-58"
	)
	void method1166(float[] var1, int var2) {
		int var3 = this.field410.field247.length;
		VorbisFloor var10000 = this.field410;
		int var4 = VorbisFloor.field246[this.field410.multiplier - 1];
		boolean[] var5 = this.field409;
		this.field409[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field410.method783(this.field407, var6);
			var8 = this.field410.method779(this.field407, var6);
			var9 = this.field410.method774(this.field407[var7], this.field408[var7], this.field407[var8], this.field408[var8], this.field407[var6]);
			var10 = this.field408[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field409;
				this.field409[var8] = true;
				var14[var7] = true;
				this.field409[var6] = true;
				if (var10 >= var13) {
					this.field408[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field408[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field409[var6] = false;
				this.field408[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field410.multiplier * this.field408[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field409[var8]) {
				var9 = this.field407[var8];
				var10 = this.field410.multiplier * this.field408[var8];
				this.field410.method777(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field410;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-678943923"
	)
	boolean method1170() {
		return this.field406;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-4"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field407[var1];
			int var5 = this.field408[var1];
			boolean var6 = this.field409[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field407[var7];
				if (var8 < var4) {
					this.field407[var3] = var8;
					this.field408[var3] = this.field408[var7];
					this.field409[var3] = this.field409[var7];
					++var3;
					this.field407[var7] = this.field407[var3];
					this.field408[var7] = this.field408[var3];
					this.field409[var7] = this.field409[var3];
				}
			}

			this.field407[var3] = var4;
			this.field408[var3] = var5;
			this.field409[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIIII)Z",
		garbageValue = "176043089"
	)
	static boolean method1163(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = WorldMapData_0.field3149 - var6;
		int var13 = class214.field2434 - var7;
		int var14 = class110.field1408 - var8;
		if (Math.abs(var12) > var9 + class169.field1861) {
			return false;
		} else if (Math.abs(var13) > var10 + class74.field907) {
			return false;
		} else if (Math.abs(var14) > var11 + HorizontalAlignment.field2685) {
			return false;
		} else if (Math.abs(var14 * Login.field963 - var13 * class72.field886) > var11 * class74.field907 + var10 * HorizontalAlignment.field2685) {
			return false;
		} else if (Math.abs(var12 * class72.field886 - var14 * class504.field5236) > var9 * HorizontalAlignment.field2685 + var11 * class169.field1861) {
			return false;
		} else {
			return Math.abs(var13 * class504.field5236 - var12 * Login.field963) <= var9 * class74.field907 + var10 * class169.field1861;
		}
	}
}
