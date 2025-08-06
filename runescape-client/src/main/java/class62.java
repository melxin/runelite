import java.applet.Applet;
import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class62 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	static final void method2116() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		AuthenticationScheme.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1327826387"
	)
	public static void method2110(Applet var0, String var1) {
		class31.field147 = var0;
		if (var1 != null) {
			class31.field146 = var1;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1734607381"
	)
	protected static final void method2111() {
		GameEngine.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		VarbitComposition.gameCyclesToDo = 0;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1444741502"
	)
	static void method2115() {
		if (FloorDecoration.varcs != null && FloorDecoration.varcs.hasUnwrittenChanges()) {
			FloorDecoration.varcs.write();
		}

		SpotAnimationDefinition.method4414();
		method2113();
		if (WorldMapLabel.mouseRecorder != null) {
			WorldMapLabel.mouseRecorder.isRunning = false;
		}

		WorldMapLabel.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		Sound.clear();
		WorldViewManager.method2364();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Skills.worldMap = null;
		class267.method6028(0, 0);
		class330.method7035();
		Client.playingJingle = false;
		Script.method1978();
		if (Client.pcmPlayer1 != null) {
			Client.pcmPlayer1.shutdown();
		}

		HorizontalAlignment.field2060.method8455();
		class82.method2751();
		if (class203.urlRequester != null) {
			class203.urlRequester.close();
		}

		class303.method6823();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class159.JagexCache_idxFiles = null;
		SpotAnimationDefinition.method4411();
		class406.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field480 = 0;
		HorizontalAlignment.field2060 = new JagNetThread();
		class203.urlRequester = new SecureUrlRequester(Language.client.https, 232);

		try {
			Occluder.method5373("oldschool", class31.field148, class322.field3447.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		class406.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		GameEngine.taskHandler = new TaskHandler();
		Language.client.method546();
		class202.method4464(class69.field954);
		AuthenticationScheme.updateGameState(0);
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "294115173"
	)
	static void method2113() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (WorldMapLabel.mouseRecorder != null) {
			WorldMapLabel.mouseRecorder.index = 0;
		}

		WorldMapScaleHandler.hasFocus = true;
		Client.hadFocus = true;
		Client.field465 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1275 = 0;
		Client.packetWriter.packetBuffer.field5818 = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1279 = null;
		Client.packetWriter.field1276 = null;
		Client.packetWriter.field1266 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1274 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class448.method9062();
		class182.method4165(0);
		SceneTilePaint.method5663();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		class57.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class1.field2 = null;
		Client.minimapState = 0;
		Client.field555 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.field326 = -1;
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		class137.friendSystem.method1565();
		Arrays.fill(Varps.Varps_temp, 0);
		Arrays.fill(Varps.Varps_main, 0);
		if (FloorDecoration.varcs != null) {
			FloorDecoration.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class167.widgetDefinition.method7460(Client.rootInterface);
		}

		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			WorldMapCacheName.method6881(var0, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.method7513((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		int var1;
		for (var1 = 0; var1 < 8; ++var1) {
			Client.playerMenuActions[var1] = null;
			Client.playerOptionsPriorities[var1] = false;
		}

		AbstractWorldMapData.method6797();
		Client.isLoading = true;

		for (var1 = 0; var1 < 100; ++var1) {
			Client.validRootWidgets[var1] = true;
		}

		class101.method3101();
		MusicPatch.friendsChat = null;
		VarcInt.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class531.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			Client.grandExchangeOffers[var1] = new GrandExchangeOffer();
		}

		SceneTilePaint.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}
}
