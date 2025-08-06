import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class322 {
	@ObfuscatedName("ip")
	static List field3448;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static GameBuild field3447;

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V",
		garbageValue = "0"
	)
	static final void method7010(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.method1853()) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.method1853()) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "-2119304511"
	)
	static final void method7011(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			if (var1.hitpoints == 0) {
				if (var1.objectId < 0 || FloorUnderlayDefinition.method4434(var1.objectId, var1.field1017)) {
					AttackOption.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1009, var1.field1017, var1.field1003);
					var1.remove();
				}
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102 && (var1.field1011 < 0 || FloorUnderlayDefinition.method4434(var1.field1011, var1.field1013))) {
					AttackOption.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1011, var1.field1012, var1.field1013, var1.field1003);
					var1.delay = -1;
					if (var1.objectId == var1.field1011 && var1.objectId == -1) {
						var1.remove();
					} else if (var1.field1011 == var1.objectId && var1.field1009 == var1.field1012 && var1.field1013 == var1.field1017) {
						var1.remove();
					}
				}
			}
		}

	}
}
