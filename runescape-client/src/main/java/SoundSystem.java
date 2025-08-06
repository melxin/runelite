import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ci")
	@Export("otp")
	static String otp;
	@ObfuscatedName("pi")
	static int[] field1344;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
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
			class559.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "734747258"
	)
	public static float method3067(float var0, float var1, float var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
