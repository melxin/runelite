import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class440 {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("fontBold12")
	public static Font fontBold12;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-954162307"
	)
	static int method8335(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "435788540"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class279.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3011();
		Client.field654.method5641();
		System.gc();
		MenuAction.method2254(0, 0);
		class438.method8301();
		Client.playingJingle = false;
		class521.method9686();
		class325.updateGameState(10);
		Client.serverCycle = 0;
		BoundaryObject.method4686().method4850();
		BoundaryObject.method4686().method4882();
	}
}
