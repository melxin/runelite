import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class48 {
	@ObfuscatedName("ap")
	static final BigInteger field671;
	@ObfuscatedName("ad")
	static final BigInteger field676;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 75800003
	)
	static int field674;

	static {
		field671 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field676 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	static void method1912() {
		class57.soundEffectCount = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIII)V",
		garbageValue = "758649677"
	)
	static final void method1916(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					Projectile.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "0"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemLayer.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = WorldMapIcon_1.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					PlayerCompositionColorTextureOverride.foundItemIdCount = -1;
					class114.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class114.foundItemIds = var2;
		WorldMapRenderer.foundItemIndex = 0;
		PlayerCompositionColorTextureOverride.foundItemIdCount = var3;
		String[] var8 = new String[PlayerCompositionColorTextureOverride.foundItemIdCount];

		for (int var5 = 0; var5 < PlayerCompositionColorTextureOverride.foundItemIdCount; ++var5) {
			var8[var5] = WorldMapIcon_1.ItemDefinition_get(var2[var5]).name;
		}

		WorldMapCacheName.method6908(var8, class114.foundItemIds);
	}
}
