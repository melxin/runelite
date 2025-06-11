import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class282 {
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static Fonts field3139;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lve;",
		garbageValue = "44"
	)
	public static class563 method6156(int var0) {
		int var1 = class561.field5589[var0];
		if (var1 == 1) {
			return class563.field5600;
		} else if (var1 == 2) {
			return class563.field5595;
		} else {
			return var1 == 3 ? class563.field5594 : null;
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "4"
	)
	static int method6157(int var0, Script var1, boolean var2) {
		return 2;
	}
}
