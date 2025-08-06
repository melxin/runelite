import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static class564 field3424;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -397979105
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILng;Lng;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}
}
