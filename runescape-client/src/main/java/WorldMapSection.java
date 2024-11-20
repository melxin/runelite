import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-1753900965"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "58"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "719649251"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-439069343"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lny;",
		garbageValue = "-17070"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2089662585"
	)
	@Export("read")
	void read(Buffer var1);
}
