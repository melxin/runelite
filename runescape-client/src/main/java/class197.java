import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class197 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "155183598"
	)
	static void method4230(int var0) {
		WorldView var1 = Client.worldViewManager.getWorldView(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				int var3 = Client.playerUpdateManager.playerIndices[var2];
				Client.playerUpdateManager.method2708((Player)var1.players.get((long)var3));
			}

			Client.worldViewManager.method2272(var0);
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "529521849"
	)
	static void method4232(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class470.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
