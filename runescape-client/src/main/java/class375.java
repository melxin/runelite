import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public final class class375 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldp;[BIIIIIIIIII)V",
		garbageValue = "164998341"
	)
	static final void method7504(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		int var15;
		int var16;
		int var18;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];
			var13 = var3 - var12.xInset;
			var14 = var4 - var12.yInset;

			for (var15 = 0; var15 < 8; ++var15) {
				var16 = var13 + var15;

				for (int var17 = 0; var17 < 8; ++var17) {
					var18 = var14 + var17;
					if (var16 > 0 && var16 < var12.flags.length && var18 > 0 && var18 < var12.flags[var16].length) {
						int[] var10000 = var12.flags[var16];
						var10000[var18] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var16 = var3 + class300.method6292(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var18 + var4;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class47.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						class47.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
