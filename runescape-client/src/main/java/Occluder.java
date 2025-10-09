import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	public static class421 field2830;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -15866743
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1232613773
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -466413845
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 808093151
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1413146603
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1995887661
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1153400869
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1947947995
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 71627173
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1260573221
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 974877055
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1770007129
	)
	int field2823;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -430076585
	)
	int field2812;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -344663637
	)
	int field2825;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -824580017
	)
	int field2820;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -313526351
	)
	int field2827;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1138219283
	)
	int field2828;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 769687355
	)
	int field2829;

	Occluder() {
	}

	@ObfuscatedName("at")
	static final void method5461(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	static void method5462() {
		if (ModeWhere.varcs != null && ModeWhere.varcs.hasUnwrittenChanges()) {
			ModeWhere.varcs.write();
		}

		ServerPacket.method7053();
		AsyncRestClient.method174();
		if (MidiRequest.mouseRecorder != null) {
			MidiRequest.mouseRecorder.isRunning = false;
		}

		MidiRequest.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		class562.clear();
		NPCComposition.method4448();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		class50.worldMap = null;
		Clock.method6092(0, 0);
		WorldMapSectionType.method6800();
		Client.playingJingle = false;
		NpcOverrides.method4379();
		if (class135.pcmPlayer1 != null) {
			class135.pcmPlayer1.shutdown();
		}

		BufferedNetSocket.field5515.method8497();
		class62.method2163();
		if (PcmPlayer.urlRequester != null) {
			PcmPlayer.urlRequester.close();
		}

		Projection.method5508();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		JagexCache.JagexCache_idxFiles = null;
		Calendar.method8180();
		class479.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field520 = 0;
		BufferedNetSocket.field5515 = new JagNetThread();
		PcmPlayer.urlRequester = new SecureUrlRequester(class32.client.https, 234);

		try {
			ItemLayer.method4893("oldschool", IntProjection.field2650, class69.field958.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		class479.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		GameEngine.taskHandler = new TaskHandler();
		class32.client.method519();
		RestClientThreadFactory.method205(class69.field953);
		class135.updateGameState(0);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1751268999"
	)
	static int method5463(int var0) {
		return var0 * 3 + 600;
	}
}
