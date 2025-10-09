import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ag")
	boolean field5351;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ah")
	String field5353;
	@ObfuscatedName("af")
	String field5350;
	@ObfuscatedName("ae")
	boolean field5354;

	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public abstract boolean vmethod9763();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1455093197"
	)
	public boolean method9731() {
		return this.field5354;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1786198517"
	)
	public boolean method9732() {
		return this.field5351;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "201284223"
	)
	public String method9729() {
		return "Error in task: " + this.field5350 + ", Error message: " + this.field5353;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "2102437135"
	)
	public SongTask method9745() {
		return this.songTask;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-4"
	)
	void method9741(String var1) {
		this.field5354 = true;
		this.field5353 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Lkg;III)V",
		garbageValue = "535581955"
	)
	public static void method9752(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
		var1.method6292(Coord.method7440(var2), Coord.method7440(var3));
		var1.setZ(0);
		var1.setCurrentRotationAngle(0);
		byte var4 = var0.readByte();
		if (var4 != 0) {
			int var5 = NPC.method2823(var0, var4, 0);
			int var6 = NPC.method2823(var0, var4, 2);
			int var7 = NPC.method2823(var0, var4, 4);
			int var8 = NPC.method2823(var0, var4, 6);
			var1.method6294(var5, var6, var7, var8);
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "12643"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class547.topLevelWorldView.scene;
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
			if (LoginState.method798(var6)) {
				var11 = var4;
			}

			int[] var12 = class135.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = BuddyRankComparator.Entity_unpackID(var6);
			ObjectComposition var15 = TileItem.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = PendingSpawn.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
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
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = BuddyRankComparator.Entity_unpackID(var6);
			ObjectComposition var25 = TileItem.getObjectDefinition(var11);
			int var20;
			if (var25.mapSceneId != -1) {
				IndexedSprite var21 = PendingSpawn.mapSceneSprites[var25.mapSceneId];
				if (var21 != null) {
					var14 = (var25.sizeX * 4 - var21.subWidth) / 2;
					var20 = (var25.sizeY * 4 - var21.subHeight) / 2;
					var21.drawAt(var1 * 4 + var14 + 48, var20 + (104 - var2 - var25.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (LoginState.method798(var6)) {
					var13 = 15597568;
				}

				int[] var19 = class135.sceneMinimapSprite.pixels;
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
		if (0L != var6) {
			var8 = BuddyRankComparator.Entity_unpackID(var6);
			ObjectComposition var22 = TileItem.getObjectDefinition(var8);
			if (var22.mapSceneId != -1) {
				IndexedSprite var23 = PendingSpawn.mapSceneSprites[var22.mapSceneId];
				if (var23 != null) {
					var11 = (var22.sizeX * 4 - var23.subWidth) / 2;
					int var24 = (var22.sizeY * 4 - var23.subHeight) / 2;
					var23.drawAt(var1 * 4 + var11 + 48, var24 + (104 - var2 - var22.sizeY) * 4 + 48);
				}
			}
		}

	}
}
