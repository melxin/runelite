import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("jc")
	static String field1372;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class508.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lti;IB)I",
		garbageValue = "64"
	)
	public static int method3116(DynamicArray var0, int var1) {
		class328.method7046(var0, class574.field5820);
		if (var1 >= 0) {
			int[] var2 = var0.method10318();
			int var3 = var0.method10322();

			for (int var4 = 0; var4 < var3; ++var4) {
				if (var1 < var2[var4]) {
					return var4;
				}

				var1 -= var2[var4];
			}
		}

		return -1;
	}
}
