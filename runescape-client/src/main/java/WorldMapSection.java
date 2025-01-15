import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)V",
		garbageValue = "43"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "53"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-177019651"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lnz;",
		garbageValue = "-425070677"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1542767096"
	)
	@Export("read")
	void read(Buffer var1);
}
