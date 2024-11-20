import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class403 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static final class403 field4667;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static final class403 field4668;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static final class403 field4669;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static final class403 field4670;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1250849613
	)
	@Export("cameraX")
	static int cameraX;

	static {
		field4667 = new class403();
		field4668 = new class403();
		field4669 = new class403();
		field4670 = new class403();
	}

	class403() {
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "96"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class158.worldMap;
	}
}
