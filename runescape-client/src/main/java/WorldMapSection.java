import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "1896416407"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-739948834"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-51"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2061697618"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "1"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1979822224"
	)
	@Export("read")
	void read(Buffer var1);
}
