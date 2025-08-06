import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1281551411
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 764557967
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2042070515
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1144314533
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -200096769
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1395107215
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 24989221
	)
	int field3232;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 62213577
	)
	int field3239;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1065690519
	)
	int field3240;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1928913839
	)
	int field3234;

	WorldMapSection2() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llr;B)V",
		garbageValue = "78"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3232) {
			var1.regionLowX = this.field3232;
		}

		if (var1.regionHighX < this.field3240) {
			var1.regionHighX = this.field3240;
		}

		if (var1.regionLowY > this.field3239) {
			var1.regionLowY = this.field3239;
		}

		if (var1.regionHighY < this.field3234) {
			var1.regionHighY = this.field3234;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "828092552"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-29"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3232 && var1 >> 6 <= this.field3240 && var2 >> 6 >= this.field3239 && var2 >> 6 <= this.field3234;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-826920955"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3232 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3239 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lng;",
		garbageValue = "-596761800"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3232 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3239 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1001820155"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3232 = var1.readUnsignedShort();
		this.field3239 = var1.readUnsignedShort();
		this.field3240 = var1.readUnsignedShort();
		this.field3234 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017217403"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(B)Lut;",
		garbageValue = "-6"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return ArchiveLoader.platformInfo;
	}
}
