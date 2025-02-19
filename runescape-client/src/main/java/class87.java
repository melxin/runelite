import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class87 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2042497515"
	)
	static int method2430(int var0, int var1, int var2) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnz;IIII)V",
		garbageValue = "19874128"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field4011 == null) {
			throw new RuntimeException();
		} else {
			var0.field4011[var1] = var2;
			var0.field4014[var1] = var3;
		}
	}
}
