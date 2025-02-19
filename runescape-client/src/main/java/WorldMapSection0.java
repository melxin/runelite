import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 2028171531
	)
	static int field3263;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2506367
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 862678323
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 423997371
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -969807169
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1991032779
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -429256743
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1924366535
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1418728941
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1541303705
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 351378703
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2106644197
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -856227125
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 84704525
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -65574191
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-127"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2003842246"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2010052210"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1853968470"
	)
	@Export("postRead")
	void postRead() {
	}
}
