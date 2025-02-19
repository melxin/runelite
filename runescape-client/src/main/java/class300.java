import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class300 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	static final class300 field3314;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	static final class300 field3313;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 606403969
	)
	@Export("value")
	final int value;

	static {
		field3314 = new class300(0);
		field3313 = new class300(1);
	}

	class300(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-28696"
	)
	public static int method6292(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}
}
