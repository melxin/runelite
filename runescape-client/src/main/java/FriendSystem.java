import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("py")
	static int[] field634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -127469585
	)
	int field636;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	FriendSystem(LoginType var1) {
		this.field636 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	boolean method1531() {
		return this.field636 == 2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	final void method1498() {
		this.field636 = 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-882546654"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field636 = 2;
		Iterator var3 = Client.worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();

			for (int var5 = 0; var5 < Client.field326.playerCount; ++var5) {
				Player var6 = (Player)var4.players.get((long)Client.field326.playerIndices[var5]);
				if (var6 != null) {
					var6.clearIsFriend();
				}
			}
		}

		var3 = Messages.Messages_hashTable.iterator();

		while (var3.hasNext()) {
			Message var7 = (Message)var3.next();
			var7.clearIsFromFriend();
		}

		if (class187.friendsChat != null) {
			class187.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1563531332"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5182 < class180.method3973() / 1000L - 5L) {
				if (var1.world > 0) {
					GrandExchangeOfferWorldComparator.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					GrandExchangeOfferWorldComparator.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1450686127"
	)
	final void method1523() {
		this.field636 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxm;ZI)Z",
		garbageValue = "-1457044852"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class152.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxm;I)Z",
		garbageValue = "342185015"
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
		garbageValue = "2125369599"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					GrandExchangeOfferOwnWorldComparator.method760("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (class152.localPlayer.username.equals(var2)) {
					GrandExchangeOfferOwnWorldComparator.method760("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					UrlRequest.method3375(var1);
				} else if (this.isIgnored(var2)) {
					GrandExchangeOfferOwnWorldComparator.method760("Please remove " + var1 + " from your ignore list first");
				} else {
					PacketBufferNode var3 = class139.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-837725278"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field335 != 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1885040757"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					GrandExchangeOfferOwnWorldComparator.method760("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (class152.localPlayer.username.equals(var2)) {
					class134.method3519();
				} else if (this.isIgnored(var2)) {
					GrandExchangeOfferOwnWorldComparator.method760(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					GrandExchangeOfferOwnWorldComparator.method760("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = class139.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-108336913"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field335 != 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field534 = Client.cycleCntr;
					PacketBufferNode var3 = class139.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Iterator var7 = Client.worldViewManager.iterator();

				while (var7.hasNext()) {
					WorldView var4 = (WorldView)var7.next();

					for (int var5 = 0; var5 < Client.field326.playerCount; ++var5) {
						Player var6 = (Player)var4.players.get((long)Client.field326.playerIndices[var5]);
						if (var6 != null) {
							var6.clearIsFriend();
						}
					}
				}

				var7 = Messages.Messages_hashTable.iterator();

				while (var7.hasNext()) {
					Message var8 = (Message)var7.next();
					var8.clearIsFromFriend();
				}

				if (class187.friendsChat != null) {
					class187.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "207248970"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field534 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				WorldMapLabelSize.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxm;I)Z",
		garbageValue = "1625854015"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;",
		garbageValue = "-1333180455"
	)
	public static VarpDefinition method1550(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class1.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lwt;IIIIIII)V",
		garbageValue = "-1882954735"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						int[] var17 = var8[0][var3];
						int var14 = var5 + 932731;
						int var15 = var6 + 556238;
						int var16 = ObjectSound.method1600(var14 + 45365, var15 + 91923, 4) - 128 + (ObjectSound.method1600(var14 + 10294, 37821 + var15, 2) - 128 >> 1) + (ObjectSound.method1600(var14, var15, 1) - 128 >> 2);
						var16 = (int)(0.3D * (double)var16) + 35;
						if (var16 < 10) {
							var16 = 10;
						} else if (var16 > 60) {
							var16 = 60;
						}

						var17[var4] = -var16 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					class31.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					User.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					class518.field5341[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					AuthenticationScheme.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "120"
	)
	static int method1551(int var0) {
		return var0 * 3 + 600;
	}
}
