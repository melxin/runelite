import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public final class class331 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -3190712157028776057L
	)
	static long field3666;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -392969967752797801L
	)
	static long field3668;

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "59"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class200.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class241.method4839(var6)) {
				var11 = var4;
			}

			int[] var12 = MidiRequest.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = FaceNormal.Entity_unpackID(var6);
			ObjectComposition var15 = class177.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = WorldMapID.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = FaceNormal.Entity_unpackID(var6);
			ObjectComposition var25 = class177.getObjectDefinition(var11);
			int var20;
			if (var25.mapSceneId != -1) {
				IndexedSprite var21 = WorldMapID.mapSceneSprites[var25.mapSceneId];
				if (var21 != null) {
					var14 = (var25.sizeX * 4 - var21.subWidth) / 2;
					var20 = (var25.sizeY * 4 - var21.subHeight) / 2;
					var21.drawAt(var14 + var1 * 4 + 48, (104 - var2 - var25.sizeY) * 4 + var20 + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class241.method4839(var6)) {
					var13 = 15597568;
				}

				int[] var19 = MidiRequest.sceneMinimapSprite.pixels;
				var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var19[var20] = var13;
					var19[var20 + 1 + 512] = var13;
					var19[var20 + 1024 + 2] = var13;
					var19[var20 + 1536 + 3] = var13;
				} else {
					var19[var20 + 1536] = var13;
					var19[var20 + 1 + 1024] = var13;
					var19[var20 + 512 + 2] = var13;
					var19[var20 + 3] = var13;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = FaceNormal.Entity_unpackID(var6);
			ObjectComposition var22 = class177.getObjectDefinition(var8);
			if (var22.mapSceneId != -1) {
				IndexedSprite var23 = WorldMapID.mapSceneSprites[var22.mapSceneId];
				if (var23 != null) {
					var11 = (var22.sizeX * 4 - var23.subWidth) / 2;
					int var24 = (var22.sizeY * 4 - var23.subHeight) / 2;
					var23.drawAt(var1 * 4 + var11 + 48, (104 - var2 - var22.sizeY) * 4 + var24 + 48);
				}
			}
		}

	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1618654549"
	)
	static String method6527(String var0) {
		PlayerType[] var1 = SpriteMask.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(BZip2State.method10506(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
