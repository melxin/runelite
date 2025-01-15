import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public enum class369 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4063(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4059(1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4062(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4061(3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	field4064(4);

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 171324907
	)
	final int field4060;

	class369(int var3) {
		this.field4060 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4060;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lip;",
		garbageValue = "1429932229"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-866296781"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class522.garbageCollector == null || !class522.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class522.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class522.garbageCollector != null) {
			long var9 = ReflectionCheck.method724();
			long var3 = class522.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
