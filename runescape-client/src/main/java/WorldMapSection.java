import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llr;B)V",
		garbageValue = "78"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "828092552"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-29"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-826920955"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lng;",
		garbageValue = "-596761800"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1001820155"
	)
	@Export("read")
	void read(Buffer var1);
}
