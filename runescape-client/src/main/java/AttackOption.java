import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1193(2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	field1197(4);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -34704261
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrk;ILra;I)I",
		garbageValue = "-1467006737"
	)
	public static int method2764(AnimationSequence var0, int var1, class464 var2) {
		int var3 = 0;
		if (!var0.isActive()) {
			var0.method9579(0);
			return var3;
		} else {
			SequenceDefinition var4 = var0.getSequenceDefinition();
			if (var4.frameCount == -1) {
				var3 |= 8;
			}

			if (var4.method4719()) {
				var0.method9579(0);
			} else {
				var0.method9579(var0.method9597() + var1);
			}

			if (!var4.isCachedModelIdSet()) {
				var3 |= class149.method3780(var0, var1, var2);
				return var3;
			} else {
				int var7 = var1;
				int var8 = 0;
				SequenceDefinition var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0) {
					var7 = var1 - (var1 - 1) / var9.frameCount * var9.frameCount;
				}

				int var10 = var0.getFrame();
				int var11 = var0.method9578();

				while (true) {
					int var12;
					int var13;
					do {
						if (var7 <= 0) {
							var0.method9583(var10, var11);
							var3 |= var8;
							return var3;
						}

						--var7;
						++var10;
						var8 |= 4;
						if (var2 != null) {
							var2.vmethod10923(var9, var10);
						}

						var12 = var9.frameCount == -1 ? 1 : var9.field2437;
						var13 = var9.getMayaAnimFrame();
					} while(var10 < var13);

					++var11;
					var8 |= 1;
					if (var9.frameCount > 0) {
						var10 -= var9.frameCount;
						if (var10 < 0 || var10 >= var13) {
							var10 = 0;
						}
					} else {
						var10 = 0;
					}

					if (var11 >= var12) {
						var8 |= 2;
					} else if (var2 != null) {
						var2.vmethod10923(var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)[Lte;",
		garbageValue = "-31870"
	)
	public static class512[] method2756() {
		return new class512[]{class512.field5381, class512.field5374, class512.field5376, class512.field5377};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-1458319693"
	)
	public static class144 method2762(int var0) {
		class144 var1 = (class144)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = class167.SequenceDefinition_skeletonsArchive;
			AbstractArchive var4 = class202.SpotAnimationDefinition_archive;
			boolean var5 = Projectile.method1952(var3, var4, var0);
			class144 var2;
			if (!var5) {
				var2 = null;
			} else {
				if (class144.field1714 == null) {
					class144.field1711 = Runtime.getRuntime().availableProcessors();
					class144.field1714 = new ThreadPoolExecutor(0, class144.field1711, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class144.field1711 * 100 + 100), new class175());
				}

				try {
					var2 = new class144(var3, var4, var0);
				} catch (Exception var7) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ldj;III)Lrm;",
		garbageValue = "1289149798"
	)
	static class448 method2761(WorldView var0, int var1, int var2) {
		if (var0 != null && class7.topLevelWorldView != var0) {
			WorldEntity var3 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? ClientPreferences.method2599((float)var1, 0.0F, (float)var2) : var3.method10109(var1, var2);
		} else {
			return ClientPreferences.method2599((float)var1, 0.0F, (float)var2);
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			Renderable var10 = null;
			Renderable var11 = null;
			int var12 = -1;
			long var13 = 0L;
			boolean var15 = false;
			boolean var16 = false;
			if (var2 == 0) {
				var13 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var13 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var13 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var13 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var17;
			ObjectComposition var18;
			if (var13 != 0L) {
				var17 = var9.getObjectFlags(var1, var3, var4, var13);
				var12 = class70.Entity_unpackID(var13);
				int var20 = var17 & 31;
				int var21 = var17 >> 6 & 3;
				var18 = SpriteMask.getObjectDefinition(var12);
				var0.method2631(var1, var3, var4, var18, var21);
				if (var2 == 0) {
					BoundaryObject var19 = var9.getBoundaryObject(var1, var3, var4);
					var10 = var19.renderable1;
					var11 = var19.renderable2;
					var9.removeBoundaryObject(var1, var3, var4);
					if (var18.interactType != 0) {
						var0.collisionMaps[var1].method6145(var3, var4, var20, var21, var18.boolean1);
					}
				}

				if (var2 == 1) {
					WallDecoration var22 = var9.getWallDecoration(var1, var3, var4);
					var10 = var22.renderable1;
					var11 = var22.renderable2;
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var10 = var9.getGameObject(var1, var3, var4).renderable;
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var18.sizeX > var0.sizeX - 1 || var4 + var18.sizeX > var0.sizeY - 1 || var3 + var18.sizeY > var0.sizeX - 1 || var4 + var18.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var18.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var18.sizeX, var18.sizeY, var21, var18.boolean1);
					}
				}

				if (var2 == 3) {
					var10 = var9.getFloorDecoration(var1, var3, var4).renderable;
					var9.removeFloorDecoration(var1, var3, var4);
					if (var18.interactType == 1) {
						var0.collisionMaps[var1].method6179(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var17 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var17 = var1 + 1;
				}

				if (var5 != var12) {
					var10 = null;
					var11 = null;
				}

				class46.method1839(var0, var1, var17, var3, var4, var5, var6, var7, var8, var0.collisionMaps[var1], var10, var11);
				var18 = SpriteMask.getObjectDefinition(var5);
				if (var18 != null && var18.hasSound()) {
					var0.createObjectSound(var17, var3, var4, var18, var6);
				}
			}
		}

	}
}
