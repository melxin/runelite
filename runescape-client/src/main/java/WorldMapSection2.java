import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1303045837
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 706976047
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -991495653
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1370629845
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1542544165
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1501852901
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1496990717
	)
	int field3161;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1505341487
	)
	int field3162;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -888472545
	)
	int field3160;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 51276729
	)
	int field3164;

	WorldMapSection2() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1851402279"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3161) {
			var1.regionLowX = this.field3161;
		}

		if (var1.regionHighX < this.field3160) {
			var1.regionHighX = this.field3160;
		}

		if (var1.regionLowY > this.field3162) {
			var1.regionLowY = this.field3162;
		}

		if (var1.regionHighY < this.field3164) {
			var1.regionHighY = this.field3164;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1948636213"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field3161 && var1 >> 6 <= this.field3160 && var2 >> 6 >= this.field3162 && var2 >> 6 <= this.field3164;
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
			int[] var4 = new int[]{this.field3161 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3162 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field3161 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3162 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "2137904343"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3161 = var1.readUnsignedShort();
		this.field3162 = var1.readUnsignedShort();
		this.field3160 = var1.readUnsignedShort();
		this.field3164 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method6224() {
		class197.field2022.clear();
	}
}
