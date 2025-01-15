import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	static IndexedSprite[] field829;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -721230967
	)
	static int field830;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1560136083
	)
	int field827;

	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	FriendSystem(LoginType var1) {
		this.field827 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1622484082"
	)
	boolean method2019() {
		return this.field827 == 2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1621276437"
	)
	final void method2066() {
		this.field827 = 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1207581411"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field827 = 2;
		Iterator var3 = Client.worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();

			for (int var5 = 0; var5 < Client.playerUpdateManager.playerCount; ++var5) {
				Player var6 = var4.players[Client.playerUpdateManager.playerIndices[var5]];
				if (var6 != null) {
					var6.clearIsFriend();
				}
			}
		}

		Interpreter.method2269();
		if (WorldMapLabelSize.friendsChat != null) {
			WorldMapLabelSize.friendsChat.clearFriends();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "911863708"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4997 < ReflectionCheck.method724() / 1000L - 5L) {
				if (var1.world > 0) {
					Interpreter.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					Interpreter.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("clear")
	final void clear() {
		this.field827 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwb;ZB)Z",
		garbageValue = "0"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(ModeWhere.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Z",
		garbageValue = "-1462398022"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-85"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class440.method8812();
				} else if (ModeWhere.localPlayer.username.equals(var2)) {
					class7.method58();
				} else if (this.isFriended(var2, false)) {
					FloorDecoration.method3989(var1);
				} else if (this.isIgnored(var2)) {
					SoundCache.method897(var1);
				} else {
					PacketBufferNode var3 = ScriptEvent.getPacketBufferNode(ClientPacket.field3374, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-752792445"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field628 != 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1315844068"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					HttpRequestTask.method287();
				} else {
					StringBuilder var10000;
					String var3;
					if (ModeWhere.localPlayer.username.equals(var2)) {
						var10000 = null;
						var3 = "You can't add yourself to your own ignore list";
						Interpreter.addGameMessage(30, "", var3);
					} else if (this.isIgnored(var2)) {
						class405.method7966(var1);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						Object var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var3 = var10000.append(" from your friend list first").toString();
						Interpreter.addGameMessage(30, "", var3);
					} else {
						class378.method7636(var1);
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "78734807"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field628 != 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "866716320"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					class327.method6639();
					PacketBufferNode var3 = ScriptEvent.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Iterator var7 = Client.worldViewManager.iterator();

				while (var7.hasNext()) {
					WorldView var4 = (WorldView)var7.next();

					for (int var5 = 0; var5 < Client.playerUpdateManager.playerCount; ++var5) {
						Player var6 = var4.players[Client.playerUpdateManager.playerIndices[var5]];
						if (var6 != null) {
							var6.clearIsFriend();
						}
					}
				}

				Interpreter.method2269();
				if (WorldMapLabelSize.friendsChat != null) {
					WorldMapLabelSize.friendsChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-54"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class327.method6639();
					if (var2) {
						PacketBufferNode var4 = ScriptEvent.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class328.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Z",
		garbageValue = "-1126787481"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "584905582"
	)
	static final int method2089(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(ZLvv;I)V",
		garbageValue = "1634524342"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var3 = var1.readUnsignedShortLE();
			var2 = var1.readUnsignedShort();
			var1.readSignedShort();
			int var4 = var1.readUnsignedShort();
			MusicPatchPcmStream.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					MusicPatchPcmStream.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			TextureProvider.regions = new int[var4];
			class92.regionMapArchiveIds = new int[var4];
			GrandExchangeOfferNameComparator.regionLandArchiveIds = new int[var4];
			HttpResponse.regionLandArchives = new byte[var4][];
			WorldMapCacheName.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					TextureProvider.regions[var4] = var7;
					class92.regionMapArchiveIds[var4] = LoginState.archive9.getGroupId("m" + var5 + "_" + var6);
					GrandExchangeOfferNameComparator.regionLandArchiveIds[var4] = LoginState.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			FloatProjection.method4437(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortLE();
			var3 = var1.readUnsignedShort();
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			MusicPatchPcmStream.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					MusicPatchPcmStream.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			TextureProvider.regions = new int[var5];
			class92.regionMapArchiveIds = new int[var5];
			GrandExchangeOfferNameComparator.regionLandArchiveIds = new int[var5];
			HttpResponse.regionLandArchives = new byte[var5][];
			WorldMapCacheName.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (TextureProvider.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								TextureProvider.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class92.regionMapArchiveIds[var5] = LoginState.archive9.getGroupId("m" + var13 + "_" + var14);
								GrandExchangeOfferNameComparator.regionLandArchiveIds[var5] = LoginState.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			FloatProjection.method4437(var2, var3, !var15);
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "10"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = GameEngine.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = var6 != 0L;
			if (var13) {
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var20 = class174.sceneMinimapSprite.pixels;
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class360.Entity_unpackID(var6);
			ObjectComposition var16 = class142.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = class155.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 1) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var20[var27] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class360.Entity_unpackID(var6);
			ObjectComposition var21 = class142.getObjectDefinition(var11);
			if (var21.mapSceneId != -1) {
				IndexedSprite var29 = class155.mapSceneSprites[var21.mapSceneId];
				if (var29 != null) {
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2;
					var15 = (var21.sizeY * 4 - var29.subHeight) / 2;
					var29.drawAt(var1 * 4 + var27 + 48, var15 + (104 - var2 - var21.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var28 = var6 != 0L;
				if (var28) {
					boolean var22 = (int)(var6 >>> 16 & 1L) == 1;
					var28 = !var22;
				}

				if (var28) {
					var26 = 15597568;
				}

				int[] var23 = class174.sceneMinimapSprite.pixels;
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var23[var30] = var26;
					var23[var30 + 1 + 512] = var26;
					var23[var30 + 1024 + 2] = var26;
					var23[var30 + 1536 + 3] = var26;
				} else {
					var23[var30 + 1536] = var26;
					var23[var30 + 1 + 1024] = var26;
					var23[var30 + 512 + 2] = var26;
					var23[var30 + 3] = var26;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (0L != var6) {
			var8 = class360.Entity_unpackID(var6);
			ObjectComposition var24 = class142.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = class155.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var12 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var11 + var1 * 4 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
