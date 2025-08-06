import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1448943647
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("al")
	final ThreadGroup field71;
	@ObfuscatedName("ab")
	final AtomicInteger field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lak;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field69 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field71 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field71, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field69.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIB)V",
		garbageValue = "42"
	)
	static void method211(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var7 = WorldMapRegion.method6545(var0, var3, var4, var0.plane, var6);
			int var8 = var7 - var5;
			var1 -= Language.cameraX;
			var8 -= WorldMapCacheName.cameraY;
			var2 -= class66.cameraZ;
			int var9 = Rasterizer3D.Rasterizer3D_sine[class187.cameraPitch];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class187.cameraPitch];
			int var11 = Rasterizer3D.Rasterizer3D_sine[class28.cameraYaw];
			int var12 = Rasterizer3D.Rasterizer3D_cosine[class28.cameraYaw];
			int var13 = var11 * var2 + var12 * var1 >> 16;
			var2 = var12 * var2 - var11 * var1 >> 16;
			var1 = var13;
			var13 = var8 * var10 - var9 * var2 >> 16;
			var2 = var8 * var9 + var10 * var2 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var13 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIB)V",
		garbageValue = "24"
	)
	static void method208(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id) {
					var7.setFlag(var5);
					break;
				}
			}
		}

	}
}
