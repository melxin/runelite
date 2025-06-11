import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4626(6, 22, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4633(7, 41, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4628(8, 42, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4624(9, 43, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4630(10, 44, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4631(11, 45, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4635(12, 46, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4632(13, 47, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4634(14, 48, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4639(15, 49, false, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4636(16, 52, false, false, true);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 903265821
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ae")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("av")
	@Export("isUser")
	public final boolean isUser;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -581203091
	)
	@Export("id")
	final int id;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "10149398"
	)
	static Object method7974(int var0) {
		return var0 == -1 ? null : ArchiveDiskAction.method8009((class563)class175.findEnumerated(class563.method10641(), var0));
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-37"
	)
	static void method7979(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class330.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-99"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = Client.worldViewManager.getWorldView(var5);
		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			IndexedObjectSet var13 = var10.npcs;
			IndexedObjectSet var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortAddLE(ConcurrentMidiTask.field5095);
				var15.packetBuffer.writeShortLE(HttpMethod.field42);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeInt(Login.field771);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntME(class394.selectedSpellWidget);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class139.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var16;
				NPC var20;
				if (var2 == 7) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(ConcurrentMidiTask.field5095);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeInt(Login.field771);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeShort(HttpMethod.field42);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 8) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeIntLE(class394.selectedSpellWidget);
						var16.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 9) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 10) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 11) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 12) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 13) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class139.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else {
					Player var22;
					if (var2 == 14) {
						var22 = (Player)var14.get((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShort(var3);
							var16.packetBuffer.writeShortAddLE(HttpMethod.field42);
							var16.packetBuffer.writeInt(Login.field771);
							var16.packetBuffer.writeShort(ConcurrentMidiTask.field5095);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 15) {
						var22 = (Player)var14.get((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeIntME(class394.selectedSpellWidget);
							var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
							var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShortAdd(ConcurrentMidiTask.field5095);
						var15.packetBuffer.writeInt(Login.field771);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAddLE(HttpMethod.field42);
						var15.packetBuffer.writeShortLE(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeInt(class394.selectedSpellWidget);
						var15.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShort(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class139.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5258();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var19;
						Widget var23;
						if (var2 == 24) {
							var23 = ClientPreferences.widgetDefinition.method7286(var1);
							if (var23 != null) {
								boolean var18 = true;
								if (var23.contentType > 0) {
									var18 = HttpMethod.method75(var23);
								}

								if (var18) {
									var19 = class139.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var19.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var19);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = ClientPreferences.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									WorldMapSectionType.method6573();
									class564.method10658(var1, var0, class187.method4098(class255.method5526(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = class322.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + AbstractWorldMapIcon.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = AbstractWorldMapIcon.colorStartTag(65280) + var23.field4113 + AbstractWorldMapIcon.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								class386.method7953();
							} else {
								int var17;
								Widget var21;
								if (var2 == 28) {
									var15 = class139.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = ClientPreferences.widgetDefinition.method7286(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
										class172.changeGameOptions(var17);
									}
								} else if (var2 == 29) {
									var15 = class139.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = ClientPreferences.widgetDefinition.method7286(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var17] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var17] = var21.cs1ComparisonValues[0];
											class172.changeGameOptions(var17);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class132.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = ClientPreferences.widgetDefinition.getWidgetChild(var1, var0);
										ScriptFrame.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 45) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 46) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortLE(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 47) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 48) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 49) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 50) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 51) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class139.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label576: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = ClientPreferences.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4092 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4092;
														ModeWhere.runScriptEvent(var25);
													}

													var16 = class139.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeIntME(class394.selectedSpellWidget);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var16.packetBuffer.writeShortAddLE(var0);
													var16.packetBuffer.writeIntIME(var1);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													var16.packetBuffer.writeShort(var4);
													Client.packetWriter.addNode(var16);
												}
												break label576;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field485 = var3;
												Client.field312 = 30;
												var15 = class139.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByte(var3);
												Client.packetWriter.addNode(var15);
												break label576;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = class139.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeShort(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label576;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class139.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var15);
												break label576;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var20 = (NPC)var13.get((long)var3);
												if (var20 != null) {
													NPCComposition var24 = var20.definition;
													if (var24.transforms != null) {
														var24 = var24.transform();
													}

													if (var24 != null) {
														var19 = class139.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var19.packetBuffer.writeShort(var24.id);
														Client.packetWriter.addNode(var19);
													}
												}
												break label576;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class139.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var12 + var1);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeShortAdd(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label576;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1008 || var2 == 1009 || var2 == 1012 || var2 == 1011) {
													class338.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label576;
											}
										}

										var23 = ClientPreferences.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											VarbitComposition.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
										}
									}
								}
							}
						}
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				ScriptFrame.invalidateWidget(ClientPreferences.widgetDefinition.method7286(Login.field771));
			}

			if (Client.isSpellSelected) {
				WorldMapSectionType.method6573();
			}

		}
	}
}
