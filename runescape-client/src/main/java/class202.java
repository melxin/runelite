import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class202 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Ltr;ZB)V",
		garbageValue = "-23"
	)
	static void method4298(WorldView var0, WorldEntity var1, boolean var2) {
		boolean var3 = var1.field5213.field2127 && !var2;
		int var4 = var1.getX();
		int var6 = var1.getY();
		int var5 = var6 >> 7;
		int var9 = var1.getPlane();
		int var8 = var9 >> 7;
		long var10 = class275.calculateTag(var4, var5, var8, 4, var3, var1.plane, var0.id);
		var1.worldEntityCoord.setZ(DevicePcmPlayerProvider.method329(var0, var1.getY(), var1.getPlane(), var0.plane));
		var1.worldView.scene.cycle = Client.cycle;
		var1.initScenePlane(var2);
		boolean var12 = var0.scene.drawEntity(var0.plane, var1.getY(), var1.getPlane(), var1.getZ(), 60, var1.worldView.scene, var1.method9706(), var10, false);
		if (var12 && !var2) {
			class177.method3962(var1.worldView);
			WorldView var13 = var1.worldView;
			if (Client.combatTargetPlayerIndex >= 0 && var13.players.get((long)Client.combatTargetPlayerIndex) != null) {
				WorldEntityCoord.addPlayerToScene(var13, Client.combatTargetPlayerIndex, false);
			}

			AABB.addNpcsToScene(var1.worldView, true);
			WorldView var14 = var1.worldView;
			int var15 = Client.field326.playerCount;
			int[] var16 = Client.field326.playerIndices;

			for (int var17 = 0; var17 < var15; ++var17) {
				if (var16[var17] != Client.combatTargetPlayerIndex && var16[var17] != Client.localPlayerIndex) {
					WorldEntityCoord.addPlayerToScene(var14, var16[var17], true);
				}
			}

			AABB.addNpcsToScene(var1.worldView, false);
			WorldView var18 = var1.worldView;

			for (GraphicsObject var19 = (GraphicsObject)var18.projectiles.last(); var19 != null; var19 = (GraphicsObject)var18.projectiles.previous()) {
				if (var19.field706 == var18.plane && !var19.isFinished) {
					if (Client.cycle >= var19.field694) {
						var19.advance(Client.graphicsCycle);
						if (var19.isFinished) {
							var19.remove();
						} else {
							var18.scene.drawEntity(var19.field706, var19.x, var19.field697, var19.cycleStart, 60, var19, 0, -1L, false);
						}
					}
				} else {
					var19.remove();
				}
			}
		}

	}
}
