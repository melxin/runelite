import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
class class342 implements Callable {
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmp;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class342(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class339 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class339)var1.remove();
			}

			var2.field3750.method1059();
		}
	}
}
