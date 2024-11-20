import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("js")
	static int[] field3116;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -798679981
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -565851327
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2072968143
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1492940683
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1848431061
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 311377623
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1244866069
	)
	int field3114;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 861318723
	)
	int field3110;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1215262701
	)
	int field3106;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 192697917
	)
	int field3111;

	WorldMapSection2() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-1753900965"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3114) {
			var1.regionLowX = this.field3114;
		}

		if (var1.regionHighX < this.field3106) {
			var1.regionHighX = this.field3106;
		}

		if (var1.regionLowY > this.field3110) {
			var1.regionLowY = this.field3110;
		}

		if (var1.regionHighY < this.field3111) {
			var1.regionHighY = this.field3111;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "58"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "719649251"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3114 && var1 >> 6 <= this.field3106 && var2 >> 6 >= this.field3110 && var2 >> 6 <= this.field3111;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-439069343"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3114 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3110 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lny;",
		garbageValue = "-17070"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3114 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3110 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2089662585"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3114 = var1.readUnsignedShort();
		this.field3110 = var1.readUnsignedShort();
		this.field3106 = var1.readUnsignedShort();
		this.field3111 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-575069597"
	)
	@Export("postRead")
	void postRead() {
	}
}
