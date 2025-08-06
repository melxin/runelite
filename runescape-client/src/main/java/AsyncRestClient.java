import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("fd")
	static boolean field57;
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	static SpritePixels[] field62;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -433169259
	)
	static int field60;
	@ObfuscatedName("al")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("ab")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ac")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -643487589
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-18"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lag;I)Laq;",
		garbageValue = "-1520158396"
	)
	@Export("submitRequest")
	public AsyncHttpResponse submitRequest(HttpRequest var1) {
		if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.threadPoolExecutor.getCorePoolSize() + " Queue capacity " + this.workQueueCapacity);
			return new AsyncHttpResponse("Queue full");
		} else {
			AsyncHttpResponse var2 = new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "717566437"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "1865094494"
	)
	public static void method174(String[] var0, short[] var1) {
		ArchiveLoader.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1314746657"
	)
	static final void method161() {
		if (Client.logoutTimer > 0) {
			MilliClock.logOut();
		} else {
			Client.timer.method8245();
			AuthenticationScheme.updateGameState(40);
			Tiles.field834 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-659308431"
	)
	static final void method175() {
		Client.field514 = Client.cycleCntr;
		MilliClock.ClanChat_inClanChat = true;
	}
}
