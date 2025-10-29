import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1595015587
	)
	@Export("Interpreter_objectStackSize")
	static int Interpreter_objectStackSize;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("oz")
	static SecureRandom field751;
	@ObfuscatedName("av")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("at")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1955746211"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "-19548"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return WorldMapData_0.method6570();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIILxt;Loz;I)V",
		garbageValue = "1663436157"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, int var4, SpritePixels var5, SpriteMask var6) {
		if (var5 != null) {
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var4];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var5.method12148(var10 + var6.width / 2 - var5.width / 2, var6.height / 2 - var11 - var5.height / 2, var0, var1, var6.width, var6.height, var6.xStarts, var6.xWidths);
				} else {
					var5.drawTransBgAt(var0 + var10 + var6.width / 2 - var5.width / 2, var6.height / 2 + var1 - var11 - var5.height / 2);
				}

			}
		}
	}
}
