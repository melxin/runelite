import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -696652255
	)
	@Export("width")
	int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -523191227
	)
	@Export("height")
	int height;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1284259845
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -723924223
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Lle;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	static void method6283() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (class178.mouseRecorder != null) {
			class178.mouseRecorder.index = 0;
		}

		class361.hasFocus = true;
		Client.hadFocus = true;
		Client.field753 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1492 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1491 = null;
		Client.packetWriter.field1495 = null;
		Client.packetWriter.field1481 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1490 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class435.method8221();
		class330.method6523(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		Client.field810 = null;
		Client.minimapState = 0;
		Client.field799 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.field780 = -1;
		Client.playerUpdateManager.method3020();
		SoundCache.friendSystem.clear();
		if (VarpDefinition.field1924 > 5000) {
		}

		int var0;
		if (Client.field575) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1924; ++var0) {
				VarpDefinition var1 = Login.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (class322.varcs != null) {
			class322.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class376.widgetDefinition.method6930(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			class33.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class435.method8221();
		Client.playerAppearance.method6947((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var3 = class272.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(DynamicObject.getWindowedMode());
			var3.packetBuffer.writeShort(GameEngine.canvasWidth);
			var3.packetBuffer.writeShort(SwapSongTask.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		class7.friendsChat = null;
		class196.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		HttpMethod.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		AABB.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}
}
