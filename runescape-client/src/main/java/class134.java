import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class134 implements Callable {
	@ObfuscatedName("og")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class135 field1579;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class136 field1578;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	final class137 field1581;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1056326719
	)
	final int field1580;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;Lfm;Lfu;Lfe;I)V"
	)
	class134(class142 var1, class135 var2, class136 var3, class137 var4, int var5) {
		this.this$0 = var1;
		this.field1579 = var2;
		this.field1578 = var3;
		this.field1581 = var4;
		this.field1580 = var5;
	}

	public Object call() {
		this.field1579.method3348();
		class135[][] var1;
		if (this.field1578 == class136.field1609) {
			var1 = this.this$0.field1666;
		} else {
			var1 = this.this$0.field1660;
		}

		var1[this.field1580][this.field1581.method3369()] = this.field1579;
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class366.garbageCollector == null || !class366.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class366.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class366.garbageCollector != null) {
			long var9 = class282.method5908();
			long var3 = class366.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-826056912"
	)
	static String method3313() {
		StringBuilder var0 = new StringBuilder();

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = (Message)var1.next();
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}

		return var0.toString();
	}
}
