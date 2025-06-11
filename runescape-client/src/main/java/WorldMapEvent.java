import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1058527297
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnp;Lnp;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}
}
