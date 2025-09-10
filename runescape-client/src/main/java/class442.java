import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public final class class442 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1774176523
	)
	static int field5140;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "766296674"
	)
	static final int method8864(int var0, int var1) {
		int var2 = class323.method7031(var0 + 45365, var1 + 91923, 4) - 128 + (class323.method7031(10294 + var0, var1 + 37821, 2) - 128 >> 1) + (class323.method7031(var0, var1, 1) - 128 >> 2);
		var2 = (int)((double)var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
