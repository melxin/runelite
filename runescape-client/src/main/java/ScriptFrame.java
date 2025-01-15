import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 688799447
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1296451257
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("az")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ao")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-404819722"
	)
	public static int method1232(CharSequence var0, int var1) {
		return class141.method3510(var0, var1, true);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "104"
	)
	static final boolean method1231(int var0) {
		return var0 == 2 || var0 == 8 || var0 == 25 || var0 == 17 || var0 == 25;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	static void method1230() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (class168.mouseRecorder != null) {
			class168.mouseRecorder.index = 0;
		}

		SecureRandomFuture.hasFocus = true;
		Client.hadFocus = true;
		Client.field740 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1456 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1458 = null;
		Client.packetWriter.field1447 = null;
		Client.packetWriter.field1460 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1454 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		FloatProjection.method4443();
		MouseHandler.MouseHandler_idleCycles = 0;
		class277.method5948();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class184.field1975 = null;
		Client.minimapState = 0;
		Client.field739 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3139();
		HttpRequest.friendSystem.clear();
		if (VarpDefinition.field2505 > 5000) {
		}

		int var0;
		if (Client.field512) {
			ObjectSound.method2104();
		} else {
			for (var0 = 0; var0 < VarpDefinition.field2505; ++var0) {
				VarpDefinition var1 = class254.VarpDefinition_get(var0);
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
			ClanChannel.widgetDefinition.method7021(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			NPCComposition.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		FloatProjection.method4443();
		Client.playerAppearance.method7056((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		Tiles.method2571();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var3 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(TextureProvider.getWindowedMode());
			var3.packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
			var3.packetBuffer.writeShort(Huffman.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		WorldMapLabelSize.friendsChat = null;
		InvDefinition.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class106.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class328.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1288710563"
	)
	static void method1229(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
