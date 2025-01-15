import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class397 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIIS)V",
		garbageValue = "30618"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3964 == null) {
			throw new RuntimeException();
		} else {
			var0.field3964[var1] = var2;
			var0.field3864[var1] = var3;
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383475643"
	)
	static final void method7892() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = GameEngine.topLevelWorldView.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
