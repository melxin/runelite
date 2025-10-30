import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class30 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrx;I)Lrx;",
		garbageValue = "742787141"
	)
	public static ProjectionCoord method486(ProjectionCoord var0) {
		synchronized(ProjectionCoord.field5238) {
			if (ProjectionCoord.field5236 == 0) {
				return new ProjectionCoord(var0);
			} else {
				ProjectionCoord.field5238[--ProjectionCoord.field5236].method9342(var0);
				return ProjectionCoord.field5238[ProjectionCoord.field5236];
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1923316222"
	)
	static void method484(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		WorldMapElement.clear();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		Client.widgetFocusInputManager.method6268();
		System.gc();
		class167.method4167(0, 0);
		class179.method4284();
		Client.playingJingle = false;
		class356.method7610();
		WorldMapSectionType.updateGameState(10);
		Client.serverCycle = 0;
		WorldMapArea.method6664().method5131();
		WorldMapArea.method6664().method5132();
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	static void method483() {
		for (class279 var0 = (class279)Client.field400.last(); var0 != null; var0 = (class279)Client.field400.previous()) {
			var0.remove();
		}

	}
}
