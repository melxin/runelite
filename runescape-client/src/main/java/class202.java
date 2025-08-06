import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class202 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "997049734"
	)
	static void method4464(class69 var0) {
		if (Client.field477 != var0) {
			Client.field477 = var0;
		}
	}
}
