import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
public class class525 {
	@ObfuscatedName("ai")
	static final int[] field5355;
	@ObfuscatedName("al")
	static final int[] field5353;

	static {
		field5355 = new int[16384];
		field5353 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5355[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5353[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "-1230125682"
	)
	static final void method10146(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			boolean var2;
			int var3;
			int var4;
			ObjectComposition var5;
			if (var1.hitpoints == 0) {
				if (var1.objectId >= 0) {
					var3 = var1.objectId;
					var4 = var1.field999;
					var5 = HealthBarConfig.getObjectDefinition(var3);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method4436(var4);
					if (!var2) {
						continue;
					}
				}

				Client.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1000, var1.field999, var1.field1003);
				var1.remove();
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102) {
					if (var1.field1008 >= 0) {
						var3 = var1.field1008;
						var4 = var1.field1002;
						var5 = HealthBarConfig.getObjectDefinition(var3);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method4436(var4);
						if (!var2) {
							continue;
						}
					}

					Client.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1008, var1.field1001, var1.field1002, var1.field1003);
					var1.delay = -1;
					if (var1.field1008 == var1.objectId && var1.objectId == -1) {
						var1.remove();
					} else if (var1.objectId == var1.field1008 && var1.field1000 == var1.field1001 && var1.field1002 == var1.field999) {
						var1.remove();
					}
				}
			}
		}

	}
}
