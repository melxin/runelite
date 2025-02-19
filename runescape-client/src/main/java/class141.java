import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
final class class141 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-864"
	)
	static final int method3402(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
