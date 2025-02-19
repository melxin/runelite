import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class290 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -170651379
	)
	int field3238;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1857428401
	)
	int field3232;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1410355269
	)
	int field3231;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1116388347
	)
	int field3235;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2074557753
	)
	int field3233;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1951754291
	)
	int field3236;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -990682481
	)
	int field3237;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 875678329
	)
	int field3234;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1818571029
	)
	int field3239;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1898724939
	)
	int field3240;

	class290() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-127"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3233) {
			var1.regionLowX = this.field3233;
		}

		if (var1.regionHighX < this.field3233) {
			var1.regionHighX = this.field3233;
		}

		if (var1.regionLowY > this.field3236) {
			var1.regionLowY = this.field3236;
		}

		if (var1.regionHighY < this.field3236) {
			var1.regionHighY = this.field3236;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2003842246"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3238 && var1 < this.field3238 + this.field3232) {
			return var2 >= (this.field3231 << 6) + (this.field3237 << 3) && var2 <= (this.field3231 << 6) + (this.field3237 << 3) + 7 && var3 >= (this.field3235 << 6) + (this.field3234 << 3) && var3 <= (this.field3235 << 6) + (this.field3234 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1047006974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3233 << 6) + (this.field3239 << 3) && var1 <= (this.field3233 << 6) + (this.field3239 << 3) + 7 && var2 >= (this.field3236 << 6) + (this.field3240 << 3) && var2 <= (this.field3236 << 6) + (this.field3240 << 3) + 7;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "16776960"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3233 * 64 - this.field3231 * 64 + var2 + (this.field3239 * 8 - this.field3237 * 8), var3 + (this.field3236 * 64 - this.field3235 * 64) + (this.field3240 * 8 - this.field3234 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnq;",
		garbageValue = "-1362839714"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3231 * 64 - this.field3233 * 64 + (this.field3237 * 8 - this.field3239 * 8) + var1;
			int var4 = this.field3235 * 64 - this.field3236 * 64 + var2 + (this.field3234 * 8 - this.field3240 * 8);
			return new Coord(this.field3238, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2010052210"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3238 = var1.readUnsignedByte();
		this.field3232 = var1.readUnsignedByte();
		this.field3231 = var1.readUnsignedShort();
		this.field3237 = var1.readUnsignedByte();
		this.field3235 = var1.readUnsignedShort();
		this.field3234 = var1.readUnsignedByte();
		this.field3233 = var1.readUnsignedShort();
		this.field3239 = var1.readUnsignedByte();
		this.field3236 = var1.readUnsignedShort();
		this.field3240 = var1.readUnsignedByte();
		this.method6179();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6179() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "856724468"
	)
	public static void method6197(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6197(var0, var1, var2, var5 - 1);
			method6197(var0, var1, var5 + 1, var3);
		}

	}
}
