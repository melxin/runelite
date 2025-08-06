import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ie")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 6597881
	)
	static int field2597;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -970472589
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 551133303
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1085473751
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1408604007
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -384949181
	)
	@Export("cameraYaw2")
	int cameraYaw2;
	@ObfuscatedName("as")
	float field2592;
	@ObfuscatedName("ah")
	float field2598;
	@ObfuscatedName("ap")
	float field2599;
	@ObfuscatedName("am")
	float field2600;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 285263451
	)
	int field2601;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2096186399
	)
	int field2596;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw2 = var5;
		this.field2592 = Rasterizer3D.field2590[var4];
		this.field2598 = Rasterizer3D.field2588[var4];
		this.field2599 = Rasterizer3D.field2590[var5];
		this.field2600 = Rasterizer3D.field2588[var5];
		this.field2601 = var6;
		this.field2596 = var7;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Liq;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5458(var2, this.cameraPitch, this.cameraYaw2, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2601, this.field2596, false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljt;IIII)V",
		garbageValue = "-1433574360"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		float var6;
		float var7 = var6 = (float)((var4 << 7) - this.cameraX);
		float var8;
		float var9 = var8 = (float)((var5 << 7) - this.cameraZ);
		float var10;
		float var11 = var10 = var7 + 128.0F;
		float var12;
		float var13 = var12 = 128.0F + var9;
		float var14 = (float)(var1.tileHeights[var3][var4][var5] - this.cameraY);
		float var15 = (float)(var1.tileHeights[var3][var4 + 1][var5] - this.cameraY);
		float var16 = (float)(var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY);
		float var17 = (float)(var1.tileHeights[var3][var4][var5 + 1] - this.cameraY);
		float var18 = this.field2600 * var7 + var9 * this.field2599;
		var9 = var9 * this.field2600 - var7 * this.field2599;
		var7 = var18;
		var18 = var14 * this.field2598 - this.field2592 * var9;
		var9 = var9 * this.field2598 + var14 * this.field2592;
		var14 = var18;
		if (var9 >= 50.0F) {
			var18 = var11 * this.field2600 + var8 * this.field2599;
			var8 = this.field2600 * var8 - this.field2599 * var11;
			var11 = var18;
			var18 = var15 * this.field2598 - this.field2592 * var8;
			var8 = var8 * this.field2598 + var15 * this.field2592;
			var15 = var18;
			if (var8 >= 50.0F) {
				var18 = var13 * this.field2599 + this.field2600 * var10;
				var13 = var13 * this.field2600 - var10 * this.field2599;
				var10 = var18;
				var18 = var16 * this.field2598 - var13 * this.field2592;
				var13 = this.field2598 * var13 + var16 * this.field2592;
				var16 = var18;
				if (var13 >= 50.0F) {
					var18 = var12 * this.field2599 + var6 * this.field2600;
					var12 = var12 * this.field2600 - this.field2599 * var6;
					var6 = var18;
					var18 = this.field2598 * var17 - this.field2592 * var12;
					var12 = var12 * this.field2598 + this.field2592 * var17;
					if (var12 >= 50.0F) {
						this.method5401(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljy;IIB)V",
		garbageValue = "-15"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			float var7 = (float)(var2.vertexX[var6] - this.cameraX);
			float var8 = (float)(var2.vertexY[var6] - this.cameraY);
			float var9 = (float)(var2.vertexZ[var6] - this.cameraZ);
			float var10 = this.field2600 * var7 + this.field2599 * var9;
			var9 = this.field2600 * var9 - var7 * this.field2599;
			var7 = var10;
			var10 = this.field2598 * var8 - this.field2592 * var9;
			var9 = var9 * this.field2598 + var8 * this.field2592;
			if (var9 < 50.0F) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = (int)var7;
				SceneTileModel.field2799[var6] = (int)var10;
				SceneTileModel.verticesX[var6] = (int)var9;
			}

			SceneTileModel.field2808[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2795[var6] = (float)Rasterizer3D.getClipMidY() + var10 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2806[var6] = ClanSettings.method3890(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "1407213961"
	)
	static int method4997(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (VarcInt.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
				class188.field2029 = VarcInt.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
					class188.field2029 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class188.field2029.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1816;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1817;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1831;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1819;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class188.field2029.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class188.field2029.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.method3894(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1827;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.method3893((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					class113.method3397(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
						Renderable.method5364(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class188.field2029.field1828[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class531.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
							class152.field1772 = class531.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
							class152.field1772 = Client.currentClanChannels[var3];
							class358.field3965 = var3;
						} else {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class152.field1772.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class152.field1772.field1883;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class152.field1772.field1880;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class152.field1772.method4045();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = ((ClanChannelMember)class152.field1772.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((ClanChannelMember)class152.field1772.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((ClanChannelMember)class152.field1772.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						class108.method3329(class358.field3965, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class152.field1772.method4046((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class152.field1772.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Projection.field2791 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "68"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		MilliClock.logOut();
		switch(var0) {
		case 1:
			class268.method6039();
			break;
		case 2:
			DynamicObject.method1987(24);
			class460.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-1841540112"
	)
	static void method4992(class271 var0) {
		if (var0 != null && var0.field3129 != null) {
			if (var0.field3129.childIndex * -64977777 >= 0) {
				Widget var1 = class167.widgetDefinition.method7456(var0.field3129.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field3129.childIndex * -64977777 >= var1.children.length || var0.field3129 != var1.children[var0.field3129.childIndex * -64977777]) {
					return;
				}
			}

			if (var0.field3129.type == 11 && var0.field3125 == 0) {
				if (var0.field3129.method7967(var0.field3127, var0.field3128, 0, 0)) {
					var0.field3129.method7924().method5809().method5945(1, var0.field3129.method7924().method5822());
					switch(var0.field3129.method7978()) {
					case 0:
						class441.openURL(var0.field3129.method7922(), true, false);
						break;
					case 1:
						if (SecureRandomCallable.method2085(class516.getWidgetFlags(var0.field3129))) {
							int[] var4 = var0.field3129.method7986();
							if (var4 != null) {
								PacketBufferNode var2 = class291.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var2.packetBuffer.writeIntIME(var0.field3129.id);
								var2.packetBuffer.writeIntLE(var0.field3129.method7921());
								var2.packetBuffer.writeInt(var4[0]);
								var2.packetBuffer.writeIntLE(var4[2]);
								var2.packetBuffer.writeInt(var4[1]);
								var2.packetBuffer.writeShort(var0.field3129.childIndex * -64977777);
								Client.packetWriter.addNode(var2);
							}
						}
					}
				}
			} else if (var0.field3129.type == 12) {
				class364 var3 = var0.field3129.method7935();
				if (var3 != null && var3.method7611()) {
					switch(var0.field3125) {
					case 0:
						Client.field344.method6079(var0.field3129);
						var3.method7580(true);
						var3.method7615(var0.field3127, var0.field3128, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var3.method7616(var0.field3127, var0.field3128);
					}
				}
			}

		}
	}
}
