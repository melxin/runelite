import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public final class class458 {
	@ObfuscatedName("af")
	final Object field5206;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1991557673
	)
	int field5205;

	class458(Object var1, int var2) {
		this.field5206 = var1;
		this.field5205 = var2;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1917458299"
	)
	static final boolean method9209(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
