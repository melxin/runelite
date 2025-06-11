import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class378 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lps;II)V",
		garbageValue = "2087246757"
	)
	static void method7920(AbstractArchive var0, int var1) {
		if ((var1 & class571.field5656.rsOrdinal()) != 0) {
			class348.logoSprite = class404.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class571.field5657.rsOrdinal()) != 0) {
			class348.logoSprite = class404.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class571.field5635.rsOrdinal()) != 0) {
			class348.logoSprite = class404.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			class348.logoSprite = class404.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltp;II)Ljava/lang/Object;",
		garbageValue = "-499677898"
	)
	public static Object method7919(class509 var0, int var1) {
		class573.method10775(var0);
		if (var1 >= 0 && var1 < var0.field5287 * 935110769) {
			Object var2 = var0.method9938(var1);
			if (var1 < var0.field5287 * 935110769 - 1) {
				ClanChannel.method3879(var0, var1 + 1, var0, var1, var0.field5287 * 935110769 - (var1 + 1));
			}

			var0.method9944(var0.field5287 * 935110769 - 1);
			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-714035305"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		UrlRequest.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method8404();
		Client.field326.clear();
		Client.field491.method5864();
		System.gc();
		HttpResponse.method306(0, 0);
		class153.method3696();
		Client.playingJingle = false;
		WorldMapArea.method6241();
		HealthBarConfig.updateGameState(10);
		Client.serverCycle = 0;
		VarcInt.method4037().method4763();
		VarcInt.method4037().method4764();
	}
}
