import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	AbstractSocket() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-72"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1807232209"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1814158103"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1534386910"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "154652065"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883200549"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1202997885"
	)
	static void method10404() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (class535.mouseRecorder != null) {
			class535.mouseRecorder.index = 0;
		}

		class489.hasFocus = true;
		Client.hadFocus = true;
		Client.field408 = -1L;
		class27.method414();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1262 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1272 = null;
		Client.packetWriter.field1275 = null;
		Client.packetWriter.field1267 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1270 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrow.method8434();
		class177.method4269();
		MouseHandler.MouseHandler_idleCycles = 0;
		class69.method2283();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		RestClientThreadFactory.method206();
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		Client.field571 = null;
		class39.minimapState = 0;
		class39.field233 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.currentWorldViewId = -1;
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		class320.friendSystem.method1627();
		WorldMapScaleHandler.method7134();
		if (class166.varcs != null) {
			class166.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class226.widgetDefinition.method7731(Client.rootInterface);
		}

		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			class39.closeInterface(var0, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class177.method4269();
		Client.playerAppearance.method7837((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		int var1;
		for (var1 = 0; var1 < 8; ++var1) {
			Client.playerMenuActions[var1] = null;
			Client.playerOptionsPriorities[var1] = false;
		}

		Skills.method8356();
		Client.isLoading = true;

		for (var1 = 0; var1 < 100; ++var1) {
			Client.validRootWidgets[var1] = true;
		}

		class439.method8922();
		BuddyRankComparator.friendsChat = null;
		SecureRandomFuture.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class57.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			Client.grandExchangeOffers[var1] = new GrandExchangeOffer();
		}

		class234.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
		SecureUrlRequester.client.method536(false);
	}
}
