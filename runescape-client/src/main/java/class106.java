import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class106 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 352322127
	)
	int field1381;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1576786133
	)
	int field1382;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1936003533
	)
	int field1383;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1424015633
	)
	int field1385;

	class106(int var1, int var2, int var3, int var4) {
		this.field1381 = var1;
		this.field1382 = var2;
		this.field1383 = var3;
		this.field1385 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-437831049"
	)
	int method2956() {
		return this.field1381;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	int method2957() {
		return this.field1382;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	int method2958() {
		return this.field1383;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	int method2959() {
		return this.field1385;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1137541175"
	)
	static void method2966() {
		Client.field639 = true;
		if (NPCComposition.varcs != null && NPCComposition.varcs.hasUnwrittenChanges()) {
			NPCComposition.varcs.write();
		}

		class432.method8220();
		WorldMapIcon_1.method5942();
		if (class433.mouseRecorder != null) {
			class433.mouseRecorder.isRunning = false;
		}

		class433.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		class279.clear();
		HitSplatDefinition.method5381();
		Client.worldViewManager.clear();
		GameBuild.worldMap = null;
		MenuAction.method2254(0, 0);
		class438.method8301();
		Client.playingJingle = false;
		class521.method9686();
		if (class1.pcmPlayer1 != null) {
			class1.pcmPlayer1.shutdown();
		}

		ClanSettings.field1791.method7794();
		class274.method5798();
		if (ParamComposition.urlRequester != null) {
			ParamComposition.urlRequester.close();
		}

		class449.method8543();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		JagexCache.JagexCache_idxFiles = null;
		class87.method2462();
		class6.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field794 = 0;
		ClanSettings.field1791 = new JagNetThread();
		ParamComposition.urlRequester = new SecureUrlRequester(SecureRandomCallable.client.https, 230);

		try {
			UserComparator7.method3214("oldschool", HealthBarUpdate.field1292, IntProjection.field2013.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		class6.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		GameEngine.taskHandler = new TaskHandler();
		SecureRandomCallable.client.method513();
		class136.method3366(class94.field1158);
		class325.updateGameState(0);
	}
}
