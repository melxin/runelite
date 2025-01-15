import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public final class class432 {
	@ObfuscatedName("ay")
	final Object field4785;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -322115481
	)
	int field4784;

	class432(Object var1, int var2) {
		this.field4785 = var1;
		this.field4784 = var2;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IIZI)V",
		garbageValue = "445127993"
	)
	static void method8480(class261 var0, int var1, int var2, boolean var3) {
		if (var0 != null) {
			if (var0.field2782 == 0) {
				if (!var3) {
					return;
				}

				Client.soundLocations[Client.soundEffectCount] = 0;
			} else {
				int var4 = (var1 - 64) / 128;
				int var5 = (var2 - 64) / 128;
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2782 + (var4 << 16);
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2785;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2781;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.field753[Client.soundEffectCount] = var0.field2783;
			++Client.soundEffectCount;
		}
	}
}
