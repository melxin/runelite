import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class391 {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1991792090"
	)
	static void method7542(int var0) {
		WorldView var1 = Client.worldViewManager.getWorldView(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				int var3 = Client.playerUpdateManager.playerIndices[var2];
				Client.playerUpdateManager.method2987((Player)var1.players.get((long)var3));
			}

			Client.worldViewManager.method2529(var0);
		}
	}
}
