import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1200949965
	)
	static int field257;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1352901255
	)
	@Export("count")
	int count;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -370937945
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -742473955
	)
	@Export("type")
	int type;
	@ObfuscatedName("ai")
	@Export("sender")
	String sender;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ac")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("aa")
	@Export("text")
	String text;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1239697184"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = SoundSystem.method2980();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-480321233"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1605021692"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = Actor.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1758498810"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2146226873"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1681697546"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = Actor.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-762029701"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class332.method6860(this.sender), AbstractUserComparator.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lch;",
		garbageValue = "-1911339395"
	)
	static class68[] method739() {
		return new class68[]{class68.field926, class68.field929, class68.field925, class68.field928, class68.field924, class68.field927, class68.field930};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1879055796"
	)
	static final int method738(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-83691962"
	)
	public static long method740(int var0) {
		if (var0 > 63) {
			throw new class450("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lke;I)V",
		garbageValue = "-1042849476"
	)
	static void method710(class270 var0) {
		if (var0 != null && var0.field3051 != null) {
			if (var0.field3051.childIndex * -744024149 >= 0) {
				Widget var1 = ClientPreferences.widgetDefinition.method7286(var0.field3051.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field3051.childIndex * -744024149 >= var1.children.length || var0.field3051 != var1.children[var0.field3051.childIndex * -744024149]) {
					return;
				}
			}

			if (var0.field3051.type == 11 && var0.field3055 == 0) {
				if (var0.field3051.method7761(var0.field3053, var0.field3054, 0, 0)) {
					var0.field3051.method7758().method4636().method4767(1, var0.field3051.method7758().method4678());
					switch(var0.field3051.method7765()) {
					case 0:
						Calendar.openURL(var0.field3051.method7767(), true, false);
						break;
					case 1:
						int var2 = class255.method5526(var0.field3051);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field3051.method7772();
							if (var3 != null) {
								PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntIME(var0.field3051.method7766());
								var4.packetBuffer.writeInt(var3[2]);
								var4.packetBuffer.writeIntIME(var0.field3051.id);
								var4.packetBuffer.writeShort(var0.field3051.childIndex * -744024149);
								var4.packetBuffer.writeIntLE(var3[0]);
								var4.packetBuffer.writeIntME(var3[1]);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field3051.type == 12) {
				class367 var6 = var0.field3051.method7755();
				if (var6 != null && var6.method7450()) {
					switch(var0.field3055) {
					case 0:
						Client.field491.method5863(var0.field3051);
						var6.method7515(true);
						var6.method7467(var0.field3053, var0.field3054, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method7438(var0.field3053, var0.field3054);
					}
				}
			}

		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIB)Lcc;",
		garbageValue = "8"
	)
	static final PendingSpawn method709(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
