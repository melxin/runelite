import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("ab")
	byte[] field3883;
	@ObfuscatedName("at")
	byte[] field3881;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 227103177
	)
	int field3890;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1293833275
	)
	int field3885;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2012102397
	)
	int field3884;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -916801415
	)
	int field3882;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2131437789
	)
	int field3886;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -637111279
	)
	int field3887;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219612203
	)
	int field3888;

	MusicPatchNode2() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([[[IIIIB)V",
		garbageValue = "1"
	)
	static final void method7120(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
