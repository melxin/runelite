import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 538022243
	)
	int field839;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	FriendSystem(LoginType var1) {
		this.field839 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2145665525"
	)
	boolean method1934() {
		return this.field839 == 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-184762405"
	)
	final void method1935() {
		this.field839 = 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-1315105598"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field839 = 2;
		SpriteBufferProperties.method10708();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-47049186"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5001 < class59.method1150() / 1000L - 5L) {
				if (var1.world > 0) {
					class289.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class289.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1836299627"
	)
	@Export("clear")
	final void clear() {
		this.field839 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwo;ZI)Z",
		garbageValue = "-2104269435"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(AsyncHttpResponse.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwo;B)Z",
		garbageValue = "49"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1931113997"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class216.method4331();
				} else if (AsyncHttpResponse.localPlayer.username.equals(var2)) {
					FontName.method9746();
				} else if (this.isFriended(var2, false)) {
					HttpRequestTask.method269(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					class139.method3374(var1);
				} else {
					class33.method463(var1);
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "897041691"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field638 != 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-523810870"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					GameEngine.method635();
				} else if (AsyncHttpResponse.localPlayer.username.equals(var2)) {
					HttpRequestTask.method269("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					class191.method3886(var1);
				} else if (this.isFriended(var2, false)) {
					GrandExchangeOfferOwnWorldComparator.method1218(var1);
				} else {
					WorldMapSection1.method6274(var1);
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field638 != 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2145278766"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					MouseRecorder.method2504();
					PacketBufferNode var3 = Message.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				SpriteBufferProperties.method10708();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "89"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					MouseRecorder.method2504();
					if (var2) {
						PacketBufferNode var4 = Message.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				Occluder.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Z",
		garbageValue = "-616705578"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	static void method1964() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (SecureUrlRequester.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = SecureUrlRequester.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1329853306"
	)
	static int method1951(int var0, Script var1, boolean var2) {
		return 2;
	}
}
