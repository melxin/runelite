import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wc")
public final class class576 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "519488780"
	)
	static final boolean method11045(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (ModelData0.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class563.field5780;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class563.field5782;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
