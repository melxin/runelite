import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class294 {
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 299977365
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;IB)Lfh;",
		garbageValue = "-12"
	)
	public static class146 method6731(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var4 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			int var5 = (var4[1] & 255) << 8 | var4[2] & 255;
			byte[] var6 = var1.getFile(var5, 0);
			var3 = var6 != null;
		}

		if (!var3) {
			return null;
		} else {
			if (class86.field1231 == null) {
				class86.field1230 = Runtime.getRuntime().availableProcessors();
				class86.field1231 = new ThreadPoolExecutor(0, class86.field1230, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class86.field1230 * 100 + 100), new class145());
			}

			try {
				return new class146(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}
}
