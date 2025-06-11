import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
final class class175 implements ThreadFactory {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -486479365
	)
	@Export("Interpreter_objectStackSize")
	static int Interpreter_objectStackSize;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Lqd;IB)Lqd;",
		garbageValue = "1"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)I",
		garbageValue = "598380860"
	)
	static int method3945(AbstractArchive var0) {
		int var1 = Login.field769.length + Login.field768.length;
		String[] var2 = Login.field737;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "151652605"
	)
	static void method3948(int var0) {
		--class58.soundEffectCount;

		for (int var1 = var0; var1 < class58.soundEffectCount; ++var1) {
			class58.soundEffectIds[var1] = class58.soundEffectIds[var1 + 1];
			class58.soundEffects[var1] = class58.soundEffects[var1 + 1];
			class58.soundLocations[var1] = class58.soundLocations[var1 + 1];
			class58.field834[var1] = class58.field834[var1 + 1];
			class58.queuedSoundEffectLoops[var1] = class58.queuedSoundEffectLoops[var1 + 1];
			class58.queuedSoundEffectDelays[var1] = class58.queuedSoundEffectDelays[var1 + 1];
			class58.field836[var1] = class58.field836[var1 + 1];
			class58.field842[var1] = class58.field842[var1 + 1];
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "84524813"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (ClientPacket.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && class58.soundEffectCount < 50) {
			IntProjection.method5097(-1, var0, 0, 0, 0, 0, var1, var2, false);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "45"
	)
	static void method3946(int var0, int var1, int var2, int var3) {
		class335.musicPlayerStatus = var0;
		class335.field3697 = var1;
		class335.field3702 = var2;
		class335.field3703 = var3;
	}
}
