import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3314;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3312;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1979483899
	)
	@Export("value")
	final int value;

	static {
		field3314 = new WorldMapID(0);
		field3312 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	public static int method6350(int var0) {
		return MouseHandler.method674(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
