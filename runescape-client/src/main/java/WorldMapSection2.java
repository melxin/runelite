import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 461265323
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1895804853
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -233570557
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1528817153
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1312211509
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -165445585
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 518332491
	)
	int field3174;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 4913257
	)
	int field3178;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -351242003
	)
	int field3179;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1771011671
	)
	int field3180;

	WorldMapSection2() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-127"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3174) {
			var1.regionLowX = this.field3174;
		}

		if (var1.regionHighX < this.field3179) {
			var1.regionHighX = this.field3179;
		}

		if (var1.regionLowY > this.field3178) {
			var1.regionLowY = this.field3178;
		}

		if (var1.regionHighY < this.field3180) {
			var1.regionHighY = this.field3180;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2003842246"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field3174 && var1 >> 6 <= this.field3179 && var2 >> 6 >= this.field3178 && var2 >> 6 <= this.field3180;
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
			int[] var4 = new int[]{this.field3174 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3178 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field3174 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3178 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2010052210"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3174 = var1.readUnsignedShort();
		this.field3178 = var1.readUnsignedShort();
		this.field3179 = var1.readUnsignedShort();
		this.field3180 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "261188269"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-556400158"
	)
	public static int method5887(int var0, int var1, int var2) {
		int var3 = AsyncRestClient.method145(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "36928040"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
