import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("an")
	static final int[] field800;
	@ObfuscatedName("ae")
	static final int[] field804;
	@ObfuscatedName("aj")
	static final int[] field802;
	@ObfuscatedName("ak")
	static final int[] field798;
	@ObfuscatedName("aw")
	static final int[] field803;
	@ObfuscatedName("ap")
	static final int[] field805;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -957711027
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("as")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1001072297
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1076351093
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		field800 = new int[]{1, 2, 4, 8};
		field804 = new int[]{16, 32, 64, 128};
		field802 = new int[]{1, 0, -1, 0};
		field798 = new int[]{0, -1, 0, 1};
		field803 = new int[]{1, -1, -1, 1};
		field805 = new int[]{-1, -1, 1, 1};
		Tiles_minPlane = 99;
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ag")
	public static int method2117(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIIIII)V"
	)
	static final void method2092(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
					ObjectComposition var20 = AsyncHttpResponse.getObjectDefinition(var10);
					int var23 = var15 & 7;
					int var24 = var14 & 7;
					int var26 = var20.sizeX;
					int var27 = var20.sizeY;
					int var28;
					if ((var19 & 1) == 1) {
						var28 = var26;
						var26 = var27;
						var27 = var28;
					}

					int var25 = var8 & 3;
					int var22;
					if (var25 == 0) {
						var22 = var23;
					} else if (var25 == 1) {
						var22 = var24;
					} else if (var25 == 2) {
						var22 = 7 - var23 - (var26 - 1);
					} else {
						var22 = 7 - var24 - (var27 - 1);
					}

					var28 = var22 + var3;
					int var29 = var4 + class69.method2286(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					if (var28 > 0 && var29 > 0 && var28 < var0.sizeX - 1 && var29 < var0.sizeY - 1) {
						int var30 = var2;
						if ((var0.tileSettings[1][var28][var29] & 2) == 2) {
							var30 = var2 - 1;
						}

						CollisionMap var31 = null;
						if (var30 >= 0 && var0.collisionMaps != null) {
							var31 = var0.collisionMaps[var30];
						}

						FriendSystem.addObjects(var0, var2, var28, var29, var10, var19 + var8 & 3, var18, var31);
					}
				}
			}
		}
	}
}
