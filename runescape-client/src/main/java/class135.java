import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public enum class135 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1559(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1561(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1555(2, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1557(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1558(4, 4);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1279697579
	)
	final int field1556;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -608264253
	)
	final int field1560;

	class135(int var3, int var4) {
		this.field1556 = var3;
		this.field1560 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1560;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "271476457"
	)
	static void method3320() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (class190.mouseRecorder != null) {
			class190.mouseRecorder.index = 0;
		}

		class289.hasFocus = true;
		Client.hadFocus = true;
		Client.field746 = -1L;
		Tiles.method2392();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1454 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1467 = null;
		Client.packetWriter.field1471 = null;
		Client.packetWriter.field1469 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1455 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		MouseHandler.MouseHandler_idleCycles = 0;
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class506.field5147 = null;
		Client.minimapState = 0;
		Client.field700 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3037();
		InterfaceParent.friendSystem.clear();
		if (VarpDefinition.field1871 > 5000) {
		}

		int var0;
		if (Client.field698) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1871; ++var0) {
				VarpDefinition var1 = FileSystem.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (HttpRequestTask.varcs != null) {
			HttpRequestTask.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class379.widgetDefinition.method6872(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			class60.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.method6902((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

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
			PacketBufferNode var3 = Message.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(class93.getWindowedMode());
			var3.packetBuffer.writeShort(class329.canvasWidth);
			var3.packetBuffer.writeShort(class535.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		class178.friendsChat = null;
		class378.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		ObjectComposition.guestClanChannel = null;
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

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "520089219"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class1.fontPlain12.lineWidth(var0, 250);
			int var6 = class1.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			class1.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			Canvas.method311(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
			if (var1) {
				class154.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
						Client.field724[var11] = true;
					}
				}
			}

		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method3315(String var0) {
		PlayerType[] var1 = ObjectComposition.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class153.method3479(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
