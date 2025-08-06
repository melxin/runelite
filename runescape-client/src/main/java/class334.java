import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class334 {
	@ObfuscatedName("al")
	static int[] field3744;

	static {
		new Object();
		field3744 = new int[33];
		field3744[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3744[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1582086879"
	)
	static final void method7074(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		FriendSystem.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
