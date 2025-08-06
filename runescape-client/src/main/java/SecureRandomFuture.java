import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1950216001
	)
	@Export("Interpreter_objectStackSize")
	static int Interpreter_objectStackSize;
	@ObfuscatedName("at")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("al")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ab")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "28"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return class386.method8197();
		}
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(IIILxv;I)V",
		garbageValue = "-582905527"
	)
	static void method1967(int var0, int var1, int var2, SpritePixels var3) {
		int var4 = var2 * 128;
		var4 += Client.camAngleY;
		var4 &= 2047;
		byte var5 = 30;
		int var9 = class532.field5477[var4 & 2047];
		double var7 = (double)var9 / 65536.0D;
		var9 = var0 - (int)((double)var5 * var7);
		double var11 = (double)WorldMapLabel.method6812(var4) / 65536.0D;
		int var13 = var1 + (int)((double)var5 * var11);
		int var14 = Math.max(var3.subWidth, var3.subHeight);
		int var15 = var14 / 2;
		var3.method11801(var9 - var15, var13 - var15, var3.subWidth, var3.subHeight, var3.subWidth / 2, var3.subHeight / 2, (double)class31.method501(var4), 256);
	}
}
