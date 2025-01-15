import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -934221379
	)
	static int field62;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1368043261
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("ah")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("az")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ao")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "816481997"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lau;I)Lag;",
		garbageValue = "2084087012"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1078520818"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "-1881468642"
	)
	static void method187(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method187(var0, var1, var2, var5 - 1);
			method187(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2001552610"
	)
	static boolean method188(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
