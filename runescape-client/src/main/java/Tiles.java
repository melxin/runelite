import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 306641589
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ao")
	static byte[][][] field1038;
	@ObfuscatedName("an")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ak")
	static final int[] field1037;
	@ObfuscatedName("ap")
	static final int[] field1047;
	@ObfuscatedName("ah")
	static final int[] field1044;
	@ObfuscatedName("ad")
	static final int[] field1045;
	@ObfuscatedName("ay")
	static final int[] field1046;
	@ObfuscatedName("ax")
	static final int[] field1050;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1591851205
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1458011603
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_minPlane = 99;
		field1037 = new int[]{1, 2, 4, 8};
		field1047 = new int[]{16, 32, 64, 128};
		field1044 = new int[]{1, 0, -1, 0};
		field1045 = new int[]{0, -1, 0, 1};
		field1046 = new int[]{1, -1, -1, 1};
		field1050 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "1908221532"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1906593937"
	)
	public static void method2392() {
		class36.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIIIIIII)V"
	)
	static final void method2387(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = HttpMethod.getObjectDefinition(var10);
					int var21 = var3 + class150.method3459(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					int var24 = var15 & 7;
					int var25 = var14 & 7;
					int var27 = var20.sizeX;
					int var28 = var20.sizeY;
					int var29;
					if ((var19 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var8 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var25;
					} else if (var26 == 1) {
						var23 = 7 - var24 - (var27 - 1);
					} else if (var26 == 2) {
						var23 = 7 - var25 - (var28 - 1);
					} else {
						var23 = var24;
					}

					var29 = var23 + var4;
					if (var21 > 0 && var29 > 0 && var21 < var0.sizeX - 1 && var29 < var0.sizeY - 1) {
						int var30 = var2;
						if ((var0.tileSettings[1][var21][var29] & 2) == 2) {
							var30 = var2 - 1;
						}

						CollisionMap var31 = null;
						if (var30 >= 0 && var0.collisionMaps != null) {
							var31 = var0.collisionMaps[var30];
						}

						GameObject.addObjects(var0, var2, var21, var29, var10, var19 + var8 & 3, var18, var31);
					}
				}
			}
		}
	}
}
