import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -201184013
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("og")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 989003393
	)
	static int field23;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	final Buffer field21;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	final class3 field22;
	@ObfuscatedName("ag")
	ExecutorService field19;
	@ObfuscatedName("an")
	Future field17;

	@ObfuscatedSignature(
		descriptor = "(Lxa;Lan;)V"
	)
	public SpriteBufferProperties(Buffer var1, class3 var2) {
		this.field19 = Executors.newSingleThreadExecutor();
		this.field21 = var1;
		this.field22 = var2;
		this.method48();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1881629513"
	)
	public boolean method50() {
		return this.field17.isDone();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1612475570"
	)
	public void method46() {
		this.field19.shutdown();
		this.field19 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lxa;",
		garbageValue = "1137813296"
	)
	public Buffer method52() {
		try {
			return (Buffer)this.field17.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "817077716"
	)
	void method48() {
		this.field17 = this.field19.submit(new class1(this, this.field21, this.field22));
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "192429840"
	)
	static final void method45(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			if (var1.hitpoints == 0) {
				if (var1.objectId < 0 || class480.method9927(var1.objectId, var1.field992)) {
					class150.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1007, var1.field992, var1.field1001);
					var1.remove();
				}
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102 && (var1.field998 < 0 || class480.method9927(var1.field998, var1.field1000))) {
					class150.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field998, var1.field999, var1.field1000, var1.field1001);
					var1.delay = -1;
					if (var1.field998 == var1.objectId && var1.objectId == -1) {
						var1.remove();
					} else if (var1.objectId == var1.field998 && var1.field1007 == var1.field999 && var1.field992 == var1.field1000) {
						var1.remove();
					}
				}
			}
		}

	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1615040760"
	)
	static void method58(int var0, int var1) {
		class146.method3937(WorldMapSection2.tempMenuAction, var0, var1);
		WorldMapSection2.tempMenuAction = null;
	}
}
