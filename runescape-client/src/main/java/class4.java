import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public final class class4 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FI)F",
		garbageValue = "-854150964"
	)
	static float method18(class136 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1614 == var1) {
				var2 = 0.0F;
			} else if (var0.field1620 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1614) / (var0.field1620 - var0.field1614);
			}

			float var3;
			if (var0.field1613) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1619 - var2, var0.field1617, var0.field1624, var0.field1621};
				float[] var5 = new float[5];
				int var6 = UserComparator7.method3193(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var0.field1611 + (var0.field1618 + var3 * (var3 * var0.field1608 + var0.field1622)) * var3;
		}
	}
}
