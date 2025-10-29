import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class264 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lxa;IIIIIII)V",
		garbageValue = "2129611754"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				int var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						int[] var17 = var8[0][var3];
						int var14 = var5 + 932731;
						int var15 = var6 + 556238;
						int var16 = class236.method5170(45365 + var14, var15 + 91923, 4) - 128 + (class236.method5170(var14 + 10294, var15 + 37821, 2) - 128 >> 1) + (class236.method5170(var14, var15, 1) - 128 >> 2);
						var16 = (int)((double)var16 * 0.3D) + 35;
						if (var16 < 10) {
							var16 = 10;
						} else if (var16 > 60) {
							var16 = 60;
						}

						var17[var4] = -var16 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					class200.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					HttpRequest.field49[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					class33.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			class148.method3945(var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "-1812540193"
	)
	static String method5907(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}
}
