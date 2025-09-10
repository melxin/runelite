import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class150 extends class151 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field1767;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field1765;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 941269453
	)
	int field1768;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class150(class154 var1) {
		this.this$0 = var1;
		this.field1768 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1768 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3922(this.field1768);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-786380047"
	)
	static final void method3816() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (PendingSpawn var2 = (PendingSpawn)var1.pendingSpawns.last(); var2 != null; var2 = (PendingSpawn)var1.pendingSpawns.previous()) {
				if (var2.hitpoints > 0) {
					--var2.hitpoints;
				}

				boolean var3;
				int var4;
				int var5;
				ObjectComposition var6;
				if (var2.hitpoints == 0) {
					if (var2.objectId >= 0) {
						var4 = var2.objectId;
						var5 = var2.field1035;
						var6 = ModeWhere.getObjectDefinition(var4);
						if (var5 == 11) {
							var5 = 10;
						}

						if (var5 >= 5 && var5 <= 8) {
							var5 = 4;
						}

						var3 = var6.method4630(var5);
						if (!var3) {
							continue;
						}
					}

					class333.addPendingSpawnToScene(var1, var2.plane, var2.type, var2.x, var2.y, var2.objectId, var2.field1025, var2.field1035, var2.field1023);
					var2.remove();
				} else {
					if (var2.delay > 0) {
						--var2.delay;
					}

					if (var2.delay == 0 && var2.x >= 1 && var2.y >= 1 && var2.x <= 102 && var2.y <= 102) {
						if (var2.field1027 >= 0) {
							var4 = var2.field1027;
							var5 = var2.field1029;
							var6 = ModeWhere.getObjectDefinition(var4);
							if (var5 == 11) {
								var5 = 10;
							}

							if (var5 >= 5 && var5 <= 8) {
								var5 = 4;
							}

							var3 = var6.method4630(var5);
							if (!var3) {
								continue;
							}
						}

						class333.addPendingSpawnToScene(var1, var2.plane, var2.type, var2.x, var2.y, var2.field1027, var2.field1028, var2.field1029, var2.field1023);
						var2.delay = -1;
						if (var2.field1027 == var2.objectId && var2.objectId == -1) {
							var2.remove();
						} else if (var2.field1027 == var2.objectId && var2.field1025 == var2.field1028 && var2.field1035 == var2.field1029) {
							var2.remove();
						}
					}
				}
			}
		}

	}
}
