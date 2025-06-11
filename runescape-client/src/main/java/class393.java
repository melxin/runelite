import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class393 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1473588291"
	)
	public static int method7981(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	static final void method7980() {
		for (PendingSpawn var0 = (PendingSpawn)Sound.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Sound.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				BoundaryObject.method5841(Sound.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
