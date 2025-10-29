import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1587963663
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1049656067
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1390606829
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1647693473
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 904145837
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1867222109
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1346337081
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -772594043
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -788775355
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 31146891
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1501587847
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 566946729
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 351793759
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 926045135
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1683202969"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-15"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
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
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
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
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
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
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1666502772"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8857"
	)
	@Export("postRead")
	void postRead() {
	}
}
