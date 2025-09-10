import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class386 {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field4416;
	@ObfuscatedName("pr")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1940577976"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		FontName.clear();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		Client.field598.method6085();
		System.gc();
		class257.method5884(0, 0);
		class159.method3892();
		Client.playingJingle = false;
		WorldMapSection0.method6773();
		UrlRequest.updateGameState(10);
		Client.serverCycle = 0;
		class259.method5905().method5965();
		class259.method5905().method5966();
	}
}
