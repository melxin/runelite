import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class135 {
	@ObfuscatedName("an")
	public static final float field1605;
	@ObfuscatedName("ae")
	public static final float field1609;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		longValue = 6337075287727686201L
	)
	static long field1607;

	static {
		field1605 = Math.ulp(1.0F);
		field1609 = field1605 * 2.0F;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lof;I)Ljava/lang/String;",
		garbageValue = "2108391709"
	)
	static String method3779(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = class147.method3943(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
