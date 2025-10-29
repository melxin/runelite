import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -407887475
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1100797107
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1391053375
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1335182407
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1321091891
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -573999143
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -837543411
	)
	int field3344;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1291318441
	)
	int field3350;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 304107425
	)
	int field3353;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -483891709
	)
	int field3352;

	WorldMapSection2() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1683202969"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3344) {
			var1.regionLowX = this.field3344;
		}

		if (var1.regionHighX < this.field3353) {
			var1.regionHighX = this.field3353;
		}

		if (var1.regionLowY > this.field3350) {
			var1.regionLowY = this.field3350;
		}

		if (var1.regionHighY < this.field3352) {
			var1.regionHighY = this.field3352;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-15"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1836111411"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3344 && var1 >> 6 <= this.field3353 && var2 >> 6 >= this.field3350 && var2 >> 6 <= this.field3352;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3344 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3350 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Loj;",
		garbageValue = "216292671"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3344 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3350 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1666502772"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3344 = var1.readUnsignedShort();
		this.field3350 = var1.readUnsignedShort();
		this.field3353 = var1.readUnsignedShort();
		this.field3352 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1589644882"
	)
	@Export("postRead")
	void postRead() {
	}
}
