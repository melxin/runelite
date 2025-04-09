import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class282 {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1784028577"
	)
	public static final synchronized long method5908() {
		long var0 = System.currentTimeMillis();
		if (var0 < class331.field3672) {
			class331.field3671 += class331.field3672 - var0;
		}

		class331.field3672 = var0;
		return class331.field3671 + var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "1602972946"
	)
	public static void method5910(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method5910(var0, var1, var2, var5 - 1);
			method5910(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1694845322"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (Renderable.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field552[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
