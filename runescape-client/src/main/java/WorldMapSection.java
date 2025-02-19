import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-127"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2003842246"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1047006974"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "16776960"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnq;",
		garbageValue = "-1362839714"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2010052210"
	)
	@Export("read")
	void read(Buffer var1);
}
