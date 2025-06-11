import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
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
			class569.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "807833514"
	)
	static int method2980() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Loh;",
		garbageValue = "-2065050190"
	)
	public static class389[] method2977() {
		return new class389[]{class389.field4605, class389.field4601, class389.TOKEN};
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)Z",
		garbageValue = "-336178722"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class71.method2212(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
