import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class329 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 2000305701
	)
	static int field3661;

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2066707877"
	)
	static final void method6519(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		AbstractWorldMapIcon.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
