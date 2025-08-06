import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ObjectDefinition_archive")
	static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("aq")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static WorldView field628;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1342717683
	)
	int field623;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	FriendSystem(LoginType var1) {
		this.field623 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1028210519"
	)
	boolean method1550() {
		return this.field623 == 2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10372"
	)
	final void method1570() {
		this.field623 = 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "89628720"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field623 = 2;
		Iterator var3 = Client.worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();

			for (int var5 = 0; var5 < Client.playerUpdateManager.playerCount; ++var5) {
				Player var6 = (Player)var4.players.get((long)Client.playerUpdateManager.playerIndices[var5]);
				if (var6 != null) {
					var6.clearIsFriend();
				}
			}
		}

		PlayerCompositionColorTextureOverride.method4118();
		if (MusicPatch.friendsChat != null) {
			MusicPatch.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1716783900"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5285 < UserComparator7.method3496() / 1000L - 5L) {
				if (var1.world > 0) {
					AuthenticationScheme.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					AuthenticationScheme.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1604216159"
	)
	final void method1565() {
		this.field623 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxf;ZI)Z",
		garbageValue = "-424679170"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class27.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxf;I)Z",
		garbageValue = "879937167"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-25876659"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class62.method2116();
				} else {
					StringBuilder var10000;
					String var3;
					if (class27.localPlayer.username.equals(var2)) {
						var10000 = null;
						var3 = "You can't add yourself to your own friend list";
						AuthenticationScheme.addGameMessage(30, "", var3);
					} else if (this.isFriended(var2, false)) {
						class402.method8273(var1);
					} else if (this.isIgnored(var2)) {
						var10000 = new StringBuilder();
						Object var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var3 = var10000.append(" from your ignore list first").toString();
						AuthenticationScheme.addGameMessage(30, "", var3);
					} else {
						class28.method460(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2139724386"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field538 != 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1350540506"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) {
					var10000 = null;
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					AuthenticationScheme.addGameMessage(30, "", var4);
				} else if (class27.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					AuthenticationScheme.addGameMessage(30, "", var4);
				} else {
					Object var10001;
					if (this.isIgnored(var2)) {
						var10000 = (new StringBuilder()).append(var1);
						var10001 = null;
						var4 = var10000.append(" is already on your ignore list").toString();
						AuthenticationScheme.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your friend list first").toString();
						AuthenticationScheme.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = class291.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "217656696"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field538 != 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-56"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field557 = Client.cycleCntr;
					PacketBufferNode var3 = class291.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Iterator var7 = Client.worldViewManager.iterator();

				while (var7.hasNext()) {
					WorldView var4 = (WorldView)var7.next();

					for (int var5 = 0; var5 < Client.playerUpdateManager.playerCount; ++var5) {
						Player var6 = (Player)var4.players.get((long)Client.playerUpdateManager.playerIndices[var5]);
						if (var6 != null) {
							var6.clearIsFriend();
						}
					}
				}

				PlayerCompositionColorTextureOverride.method4118();
				if (MusicPatch.friendsChat != null) {
					MusicPatch.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "512707352"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field557 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class144.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lxf;I)Z",
		garbageValue = "-1898815697"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lox;II)V",
		garbageValue = "1989470914"
	)
	static void method1551(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * -64977777 > -1) {
			if (var1 > var0.field4090) {
				var0.field4090 = var1;
			}

			if (var1 < var0.field4148) {
				var0.field4148 = var1;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1884562858"
	)
	static void method1578(int var0, int var1, int var2, int var3, int var4, int var5) {
		HttpContentType.field5455 = (var3 + var0) / 2;
		class172.field1901 = (var4 + var1) / 2;
		WorldMapIcon_0.field3313 = (var5 + var2) / 2;
		class159.field1801 = (var3 - var0) / 2;
		Message.field248 = (var4 - var1) / 2;
		class214.field2459 = (var5 - var2) / 2;
		class188.field2027 = Math.abs(class159.field1801);
		FontName.field5650 = Math.abs(Message.field248);
		NPCOverheadIcons.field5822 = Math.abs(class214.field2459);
		ViewportMouse.field2905.method9022((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
		ViewportMouse.field2905.method9047();
		ViewportMouse.ViewportMouse_false0 = true;
	}
}
