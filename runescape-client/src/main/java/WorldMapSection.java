import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-321528483"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1647486588"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "16374902"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-10"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lny;",
		garbageValue = "126893021"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-7"
	)
	@Export("read")
	void read(Buffer var1);
}
