import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -825469743
	)
	@Export("Interpreter_objectStackSize")
	static int Interpreter_objectStackSize;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 174735711
	)
	@Export("count")
	int count;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1382138377
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1910973529
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@Export("sender")
	String sender;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("af")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ae")
	@Export("text")
	String text;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "11"
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
		garbageValue = "58"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-107"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1828899815"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = KitDefinition.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "943293545"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
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
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = KitDefinition.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1534906655"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class188.method4334(this.sender), class147.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1761975769"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class204.World_request == null) {
				class204.World_request = PcmPlayer.urlRequester.request(new URL(ClanSettings.field1853));
			} else if (class204.World_request.isDone()) {
				byte[] var0 = class204.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.method11575();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.method11575();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class489.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class204.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class204.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-721417004"
	)
	public static char method767(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class441.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIIB)V",
		garbageValue = "-111"
	)
	static final void method765(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (Calendar.method8179(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
