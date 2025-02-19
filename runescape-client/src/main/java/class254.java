import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class254 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Lpl;II)Lfb;",
		garbageValue = "1071342260"
	)
	public static class144 method5253(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, int var3) {
		AbstractArchive var4 = var1.vmethod7631() ? var1 : var0;
		byte[] var6 = var4.getFile(var3 >> 16 & 65535, var3 & 65535);
		boolean var5;
		if (var6 == null) {
			var5 = false;
		} else {
			int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
			byte[] var8 = var2.getFile(var7, 0);
			var5 = var8 != null;
		}

		if (!var5) {
			return null;
		} else {
			if (class144.field1687 == null) {
				class144.field1686 = Runtime.getRuntime().availableProcessors();
				class144.field1687 = new ThreadPoolExecutor(0, class144.field1686, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class144.field1686 * 100 + 100), new class141());
			}

			try {
				return new class144(var4, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
