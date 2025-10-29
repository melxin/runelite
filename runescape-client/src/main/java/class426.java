import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class426 {
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		longValue = -2587547758179158271L
	)
	static long field5085;

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	static final void method8758() {
		for (PendingSpawn var0 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				WorldMapLabelSize.method6578(Occluder.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
