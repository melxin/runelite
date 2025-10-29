import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
final class class85 implements class369 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lof;)V"
	)
	class85(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void vmethod7725() {
		if (this.val$item.method8197().field4135 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2184(this.val$item);
			var1.setArgs(this.val$item.method8197().field4135);
			HttpQueryParams.method10865().addFirst(var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpw;",
		garbageValue = "1309512402"
	)
	public static class400[] method2928() {
		return new class400[]{class400.field4844, class400.field4843, class400.TOKEN};
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lcr;II)V",
		garbageValue = "-299025802"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			WorldMapSection1.method7032(var1);
		} else if (var1.field1057 >= Client.cycle) {
			GameBuild.method8376(var1);
		} else {
			Canvas.method334(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.method2486();
			var1.spotAnimation = 0;
			var1.field1057 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -767295488;
			var1.y = var1.pathY[0] * 128 + var1.size * -767295488;
			var1.method2487();
		}

		if (var1 == class330.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.method2486();
			var1.spotAnimation = 0;
			var1.field1057 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -767295488;
			var1.y = var1.pathY[0] * 128 + var1.size * -767295488;
			var1.method2487();
		}

		int var6;
		if (var1.targetIndex != -1) {
			WorldView var3 = null;
			Actor var4 = null;
			int var5 = 65536;
			if (var1.targetIndex >= var5) {
				var6 = var1.targetIndex - var5;
				var3 = class300.method6916(var6, Client.worldViewManager);
				var4 = (Actor)var3.players.get((long)var6);
			} else {
				int var7 = var1.targetIndex;
				WorldViewManager var8 = Client.worldViewManager;
				Iterator var9 = var8.iterator();

				WorldView var11;
				while (true) {
					if (var9.hasNext()) {
						WorldView var10 = (WorldView)var9.next();
						if (var10.npcs.get((long)var7) == null) {
							continue;
						}

						var11 = var10;
						break;
					}

					var11 = var8.method2394();
					break;
				}

				var3 = var11;
				var4 = (Actor)var11.npcs.get((long)var1.targetIndex);
			}

			if (var4 != null) {
				ProjectionCoord var22 = FaceNormal.method5848((float)var1.x, 0.0F, (float)var1.y);
				ProjectionCoord var12;
				if (var0.id != var3.id) {
					WorldEntity var19;
					if (var0.id == -1) {
						var19 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var3.id);
						var12 = var19.method10509(var4.x, var4.y);
					} else if (var3.id == -1) {
						var19 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var0.id);
						var12 = var19.getProjectionCoord(var4.x, var4.y);
					} else {
						var19 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var3.id);
						WorldEntity var20 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var0.id);
						ProjectionCoord var21 = var19.method10509(var4.x, var4.y);
						var12 = var20.getProjectionCoord((int)var21.x, (int)var21.y);
						var21.release();
					}
				} else {
					var12 = FaceNormal.method5848((float)var4.x, 0.0F, (float)var4.y);
				}

				int var13 = (int)(var22.x - var12.x);
				int var14 = (int)(var22.y - var12.y);
				if (var13 != 0 || var14 != 0) {
					var1.orientation = class101.method3260(var13, var14);
				}

				var22.release();
				var12.release();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var15;
		if (var1.pathLength == 0 || var1.field1074 > 0) {
			var15 = -1;
			if (var1.field1009 != -1) {
				var15 = var1.field1009;
			}

			if (var15 != -1) {
				var1.orientation = var15;
				if (var1.field1020) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2498();
		}

		var15 = var1.orientation - var1.rotation & 2047;
		if (var15 != 0) {
			boolean var16 = true;
			boolean var17 = true;
			++var1.field1068;
			var6 = var15 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1069;
			boolean var18 = true;
			if (var15 < var1.field1069 || var15 > 2048 - var1.field1069) {
				var1.rotation = var1.orientation;
				var18 = false;
			}

			if (var1.field1069 > 0 && var1.method2479() == var1.idleSequence && (var1.field1068 > 25 || var18)) {
				if (var6 == -1 && var1.turnLeftSequence != -1) {
					var1.method2548(var1.turnLeftSequence);
				} else if (var6 == 1 && var1.turnRightSequence != -1) {
					var1.method2548(var1.turnRightSequence);
				} else {
					var1.method2548(var1.walkSequence);
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1068 = 0;
		}

		class134.method3760(var0, var1);
	}
}
