import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1460599331
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILny;Lny;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)V",
		garbageValue = "4"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class53.runScript(var0, 500000, 475000);
	}
}
