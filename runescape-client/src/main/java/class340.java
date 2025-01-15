import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
class class340 implements Callable {
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1026790625
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 2099192279
	)
	static int field3703;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lma;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class340(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class337 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class337)var1.remove();
			}

			var2.field3688.method1130();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1320044401"
	)
	static int method6897(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}
}
