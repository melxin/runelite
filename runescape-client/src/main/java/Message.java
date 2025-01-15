import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1531834981
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -45791165
	)
	@Export("count")
	int count;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 855742145
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 119134741
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@Export("sender")
	String sender;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("ax")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("at")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-94"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Tiles.method2572();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "662241692"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = HttpRequest.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-348559967"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-538386494"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-929945081"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = HttpRequest.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(Canvas.method334(this.sender), class383.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "1020129089"
	)
	static class137 method1253(int var0) {
		class137[] var1 = new class137[]{class137.field1604, class137.field1600, class137.field1596, class137.field1597, class137.field1598, class137.field1599};
		class137 var2 = (class137)StructComposition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class137.field1604;
		}

		return var2;
	}
}
