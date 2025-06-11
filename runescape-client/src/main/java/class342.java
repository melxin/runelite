import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
class class342 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmt;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
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

			var2.field3760.method3227();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;BII)I",
		garbageValue = "-2130424302"
	)
	public static int method7116(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
