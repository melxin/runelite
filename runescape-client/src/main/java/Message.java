import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2036755855
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1797091037
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -764731175
	)
	@Export("type")
	int type;
	@ObfuscatedName("ae")
	@Export("sender")
	String sender;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("av")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("au")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "16965"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class421.method8052();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1313927234"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-605089750"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33089341"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = InterfaceParent.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-636076471"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1926414127"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = InterfaceParent.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2028611192"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class135.method3315(this.sender), class28.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lmj;Lwu;I)Lmc;",
		garbageValue = "-2142660227"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = Interpreter.method2155();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1662182103"
	)
	static final void method1201(int var0, int var1, int var2, boolean var3) {
		if (class379.widgetDefinition.loadInterface(var0)) {
			Tile.resizeInterface(class379.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
