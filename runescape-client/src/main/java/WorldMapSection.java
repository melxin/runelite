import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)V",
		garbageValue = "121"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1479617515"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1854006794"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Lnt;",
		garbageValue = "1321767121"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "1096753286"
	)
	@Export("read")
	void read(Buffer var1);
}
