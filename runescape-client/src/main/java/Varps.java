import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ab")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("at")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ae")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[5000];
		Varps_main = new int[5000];
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1734793010"
	)
	static final void method6801() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = var3.players[var1[var4]];
				if (var5 != null) {
					class36.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
