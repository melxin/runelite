import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1652364669
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("ay")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("au")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ad")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-1215161377"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lae;I)Laz;",
		garbageValue = "2106579208"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2037455773"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "4"
	)
	public static int method145(int var0) {
		return class333.field3673[var0];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "-37"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = GZipDecompressor.World_worlds[var6];
			GZipDecompressor.World_worlds[var6] = GZipDecompressor.World_worlds[var1];
			GZipDecompressor.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = GZipDecompressor.World_worlds[var9];
				int var12 = ClientPreferences.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = ClientPreferences.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = GZipDecompressor.World_worlds[var9];
					GZipDecompressor.World_worlds[var9] = GZipDecompressor.World_worlds[var7];
					GZipDecompressor.World_worlds[var7++] = var14;
				}
			}

			GZipDecompressor.World_worlds[var1] = GZipDecompressor.World_worlds[var7];
			GZipDecompressor.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1668913407"
	)
	static final void method146(String var0) {
		LoginPacket.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "542847787"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
