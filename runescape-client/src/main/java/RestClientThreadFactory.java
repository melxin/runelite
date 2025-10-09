import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field67;
	@ObfuscatedName("ab")
	final ThreadGroup field65;
	@ObfuscatedName("at")
	final AtomicInteger field62;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field62 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field65 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field65, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field62.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILtd;Lpg;I)V",
		garbageValue = "649952052"
	)
	static void method203(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		RouteStrategy.method6246();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)V",
		garbageValue = "1119074074"
	)
	static void method205(class69 var0) {
		if (Client.field443 != var0) {
			Client.field443 = var0;
		}
	}
}
