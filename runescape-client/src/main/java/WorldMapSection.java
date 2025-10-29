import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1683202969"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-15"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1836111411"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "35"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Loj;",
		garbageValue = "216292671"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1666502772"
	)
	@Export("read")
	void read(Buffer var1);
}
