import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("hy")
	static String field61;
	@ObfuscatedName("jb")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 956451141
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1050379199
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("aw")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("at")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ae")
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
		garbageValue = "-627437642"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Laf;I)Lah;",
		garbageValue = "190843423"
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
		descriptor = "(I)V",
		garbageValue = "-2137295839"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "287766449"
	)
	static long method165(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-11063"
	)
	static void method168(int var0) {
		class426.field4767 = var0;
		class426.field4765 = new class426[var0];
		class426.field4762 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lug;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	static String method162(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqc;FFFB)F",
		garbageValue = "75"
	)
	static float method167(class430 var0, float var1, float var2, float var3) {
		float var4 = class372.method7458(var0.field4793, var0.field4794, var1);
		if (Math.abs(var4) < class133.field1535) {
			return var1;
		} else {
			float var5 = class372.method7458(var0.field4793, var0.field4794, var2);
			if (Math.abs(var5) < class133.field1535) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = class133.field1532 * Math.abs(var2) + 0.5F * var3;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var12 * 2.0F * var17;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = ((var10 - var11) * 2.0F * var17 * var10 - (var11 - 1.0F) * (var2 - var1)) * var12;
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (var9 * 2.0F < var10 * 3.0F * var17 - Math.abs(var10 * var16) && var9 < Math.abs(0.5F * var12 * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = class372.method7458(var0.field4793, var0.field4794, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	public static int method169(String var0) {
		return var0.length() + 2;
	}
}
