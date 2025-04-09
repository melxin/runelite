import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cb")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static ClanSettings field833;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1011519865
	)
	int field835;

	@ObfuscatedSignature(
		descriptor = "(Luw;)V"
	)
	FriendSystem(LoginType var1) {
		this.field835 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	boolean method1916() {
		return this.field835 == 2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1055174752"
	)
	final void method1936() {
		this.field835 = 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "1845941530"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field835 = 2;
		class244.method5165();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5127 < class282.method5908() / 1000L - 5L) {
				if (var1.world > 0) {
					class279.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class279.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-112292868"
	)
	@Export("clear")
	final void clear() {
		this.field835 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwp;ZB)Z",
		garbageValue = "0"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(Script.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwp;B)Z",
		garbageValue = "-114"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "206279038"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class438.method8300();
				} else if (Script.localPlayer.username.equals(var2)) {
					class1.method8();
				} else if (this.isFriended(var2, false)) {
					ClanSettings.method3631(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					class251.method5230(var1);
				} else {
					PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "436938957"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field579 != 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1120444378"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					ClanSettings.method3631("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (Script.localPlayer.username.equals(var2)) {
					ClanSettings.method3631("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					GameObject.method4700(var1);
				} else if (this.isFriended(var2, false)) {
					class230.method5023(var1);
				} else {
					PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-9687"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field579 != 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1269198375"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					FontName.method10006();
					PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class244.method5165();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-446660563"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					FontName.method10006();
					if (var2) {
						PacketBufferNode var4 = FloorDecoration.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				SoundCache.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwp;I)Z",
		garbageValue = "1180976380"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "52"
	)
	static int method1939(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = class232.widgetDefinition.method6951(var3);
		} else {
			var4 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			class139.invalidateWidget(var4);
			SecureRandomCallable.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			class139.invalidateWidget(var4);
			SecureRandomCallable.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class139.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "445708962"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
