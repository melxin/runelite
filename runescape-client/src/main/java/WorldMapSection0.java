import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -354932289
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -544494821
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -802542697
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1932073375
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1009718171
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1451885025
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2027904087
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1252243189
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2086652681
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 16890185
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -601900463
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 815553665
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1277316649
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1742668909
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1851402279"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1948636213"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1741175838"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "668393896"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lnp;",
		garbageValue = "1118968187"
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
		descriptor = "(Lwt;I)V",
		garbageValue = "2137904343"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postRead")
	void postRead() {
	}
}
