import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1851402279"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1948636213"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1741175838"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "668393896"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lnp;",
		garbageValue = "1118968187"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "2137904343"
	)
	@Export("read")
	void read(Buffer var1);
}
