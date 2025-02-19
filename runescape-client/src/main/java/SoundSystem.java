import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
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
			class213.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "-59152862"
	)
	static boolean method829(String var0, int var1) {
		return class178.method3767(var0, var1, "openjs");
	}
}
