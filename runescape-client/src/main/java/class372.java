import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class372 {
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -387097237
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1320675718"
	)
	public static void method7459(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-254303518"
	)
	static float method7458(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1646194778"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
