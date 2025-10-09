import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class566 field624;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field621;
	@ObfuscatedName("oy")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 308951631
	)
	int field618;

	@ObfuscatedSignature(
		descriptor = "(Lvt;)V"
	)
	FriendSystem(LoginType var1) {
		this.field618 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2144594436"
	)
	boolean method1555() {
		return this.field618 == 2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "12778029"
	)
	final void method1598() {
		this.field618 = 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "974960885"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field618 = 2;
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

		class50.method1923();
		if (class445.friendsChat != null) {
			class445.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1925592849"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5444 < class281.method6373() / 1000L - 5L) {
				if (var1.world > 0) {
					class292.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class292.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-667071871"
	)
	final void method1559() {
		this.field618 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxp;ZI)Z",
		garbageValue = "1508802041"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class159.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lxp;I)Z",
		garbageValue = "-328601432"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1939842008"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class333.method7076();
				} else if (class159.localPlayer.username.equals(var2)) {
					UserComparator9.method3637();
				} else if (this.isFriended(var2, false)) {
					Frames.method5459(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					WorldMapLabelSize.method6406(var1);
				} else {
					PacketBufferNode var3 = HorizontalAlignment.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-60"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field463 != 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "77921721"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					Frames.method5459("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (class159.localPlayer.username.equals(var2)) {
					class57.method2062();
				} else if (this.isIgnored(var2)) {
					IntProjection.method5086(var1);
				} else if (this.isFriended(var2, false)) {
					Frames.method5459("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2097274574"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field463 != 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1359926464"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field470 = Client.cycleCntr;
					PacketBufferNode var3 = HorizontalAlignment.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var1));
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

				class50.method1923();
				if (class445.friendsChat != null) {
					class445.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-174097465"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field470 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				Login.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxp;S)Z",
		garbageValue = "256"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-88"
	)
	static int method1628(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field631 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "2114333311"
	)
	static final void method1627(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.field1032 * 128 + var0.size * 64;
		int var3 = var0.field1080 * 128 + var0.size * 64;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1093 = 0;
		var0.orientation = var0.field1084;
	}
}
