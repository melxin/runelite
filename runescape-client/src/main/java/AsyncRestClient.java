import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("af")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("aw")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("at")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -391947939
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-125"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)Lag;",
		garbageValue = "642811050"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "846925215"
	)
	static void method188() {
		IndexCheck.accessToken = System.getenv("JX_ACCESS_TOKEN");
		MilliClock.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		WorldMapID.sessionId = System.getenv("JX_SESSION_ID");
		KitDefinition.characterId = System.getenv("JX_CHARACTER_ID");
		PlatformInfo.method10584(System.getenv("JX_DISPLAY_NAME"));
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Widget.method8102();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(II)Lwd;",
		garbageValue = "-524460341"
	)
	@Export("getDbTable2")
	static DbTable getDbTable2(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(WorldMapLabelSize.field3302, var0);
		}

		return var1;
	}
}
