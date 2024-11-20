import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3074((byte)-1, 0.0F),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3066((byte)0, 0.5F),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3067((byte)1, 1.0F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3073((byte)2, 2.0F),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3069((byte)3, 1.5F),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3070((byte)4, 2.5F),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3071((byte)5, 3.0F),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3068((byte)6, 3.5F),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	field3072((byte)7, 4.0F);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	static MoveSpeed[] field3065 = WorldEntityCoord.method5731();
	@ObfuscatedName("an")
	@Export("id")
	final byte id;

	static {
		ViewportMouse.method5417();
	}

	@ObfuscatedSignature(
		descriptor = "(BF)V",
		garbageValue = "0.0"
	)
	MoveSpeed(byte var3, float var4) {
		this.id = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1718564347"
	)
	static final int method5741(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "855651123"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (SecureUrlRequester.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field763[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
