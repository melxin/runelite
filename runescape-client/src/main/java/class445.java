import java.util.regex.Pattern;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public final class class445 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "1538083612"
	)
	static float method8902(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}
}
