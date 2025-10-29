import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
class class352 implements Callable {
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lnc;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class352(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class349 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class349)var1.remove();
			}

			var2.field3991.method3478();
		}
	}
}
