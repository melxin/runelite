import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("oq")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 380472083
	)
	@Export("count")
	int count;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1755101527
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1475546943
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("sender")
	String sender;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aj")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ak")
	@Export("text")
	String text;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1203927316"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1180595798"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-741097795"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class320.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1831205668"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "782484908"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-202776839"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class320.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1590361376"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class117.method3622(this.sender), LoginScreenAnimation.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-65"
	)
	public static int method778(CharSequence var0) {
		return CollisionMap.method6397(var0, 10, true);
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcx;",
		garbageValue = "2"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class593.method11550(var1);
		Widget var4 = class226.widgetDefinition.method7728(var0);
		class376.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class376.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class339.revalidateWidgetScroll(class226.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		MidiPcmStream.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class520.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1066345315"
	)
	static final void method766(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4196()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + AccessFile.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
