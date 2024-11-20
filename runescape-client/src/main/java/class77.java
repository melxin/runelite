import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class77 {
	@ObfuscatedName("ab")
	static final BigInteger field922;
	@ObfuscatedName("aw")
	static final BigInteger field921;

	static {
		field922 = new BigInteger("10001", 16);
		field921 = new BigInteger("9829f2207847825aba94b679f0b2273bbe751ef6b2fb2d228ff668f0747ba9d3ae32ba9435bbfb321f963058f721b4ef92bb5eae1cc0d5eb34d6b4f5f8a82a04468126347c988e5c5f8ce927b6dccdf8a4135cf9bc8730b3aa7c73995b0ad0f3f03022a85d17c921d1fca339ab4603dbafb5726d88a0ca9b282226c9bc2c7fe7", 16);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIB)I",
		garbageValue = "68"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4][var5] * (128 - var7) + var7 * var0.tileHeights[var6][var4 + 1][var5] >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var9 * (128 - var8) + var10 * var8 >> 7;
		} else {
			return 0;
		}
	}
}
