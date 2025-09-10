import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ap")
	static final Object field5317;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -590896119
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 121384753
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1234378733
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1130222243
	)
	static int field5321;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1275812891
	)
	static int field5322;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1782319671
	)
	static int field5316;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 489034209
	)
	static int field5324;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1935076913
	)
	static int field5325;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ay")
	static byte[][] field5328;
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ah")
	public static ArrayList field5331;

	static {
		field5317 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5321 = 0;
		field5322 = 1000;
		field5316 = 250;
		field5324 = 100;
		field5325 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5328 = new byte[50][];
		field5331 = new ArrayList();
		new HashMap();
		field5331.clear();
		field5331.add(100);
		field5331.add(5000);
		field5331.add(10000);
		field5331.add(30000);
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "350949477"
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
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeIntIME(class325.Players_count);
				var15.packetBuffer.writeShortLE(class36.field240);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortAdd(AABB.field2800);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(Client.selectedSpellItemId);
				var15.packetBuffer.writeInt(ModeWhere.selectedSpellWidget);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeInt(class325.Players_count);
						var16.packetBuffer.writeShort(AABB.field2800);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(class36.field240);
						var16.packetBuffer.writeShortLE(var3);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeInt(ModeWhere.selectedSpellWidget);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
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
						var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
							var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAdd(AABB.field2800);
							var16.packetBuffer.writeIntIME(class325.Players_count);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShortAddLE(class36.field240);
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
							var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeIntLE(ModeWhere.selectedSpellWidget);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeIntLE(class325.Players_count);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortLE(class36.field240);
						var15.packetBuffer.writeShort(AABB.field2800);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeShort(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var15.packetBuffer.writeInt(ModeWhere.selectedSpellWidget);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5131();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var18;
						Widget var23;
						if (var2 == 24) {
							var23 = UrlRequester.widgetDefinition.method7476(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = SpriteMask.method7398(var23);
								}

								if (var19) {
									var18 = UserComparator6.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var18.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var18);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = UrlRequester.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									Timer.method8270();
									Message.method767(var1, var0, class537.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = WorldMapLabelSize.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + class134.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = class134.colorStartTag(65280) + var23.field4298 + class134.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								HttpRequest.method104();
							} else {
								int var17;
								Widget var21;
								if (var2 == 28) {
									var15 = UserComparator6.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = UrlRequester.widgetDefinition.method7476(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
										AbstractByteArrayCopier.changeGameOptions(var17);
									}
								} else if (var2 == 29) {
									var15 = UserComparator6.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = UrlRequester.widgetDefinition.method7476(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var17] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var17] = var21.cs1ComparisonValues[0];
											AbstractByteArrayCopier.changeGameOptions(var17);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class115.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = UrlRequester.widgetDefinition.getWidgetChild(var1, var0);
										class89.invalidateWidget(Client.meslayerContinueWidget);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortLE(var3);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label663: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = UrlRequester.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4302 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4302;
														PacketBufferNode.runScriptEvent(var25);
													}

													var16 = UserComparator6.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
													var16.packetBuffer.writeIntLE(var1);
													var16.packetBuffer.writeShortAdd(var4);
													var16.packetBuffer.writeShortAdd(var0);
													var16.packetBuffer.writeInt(ModeWhere.selectedSpellWidget);
													var16.packetBuffer.writeShort(Client.selectedSpellItemId);
													Client.packetWriter.addNode(var16);
												}
												break label663;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field583 = var3;
												Client.field584 = 30;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteAdd(var3);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											WorldEntity var26;
											if (var2 == 61) {
												var26 = (WorldEntity)var10.worldEntities.get((long)var3);
												if (var26 != null) {
													Client.mouseCrossX = var8;
													Client.mouseCrossY = var9;
													Client.mouseCrossColor = 2;
													Client.mouseCrossState = 0;
													Client.destinationX = var0;
													Client.destinationY = var1;
													var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITYU, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAdd(var3);
													var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var16.packetBuffer.writeIntME(class325.Players_count);
													var16.packetBuffer.writeShortAdd(AABB.field2800);
													var16.packetBuffer.writeShortAdd(class36.field240);
													Client.packetWriter.addNode(var16);
												}
												break label663;
											}

											if (var2 == 62) {
												var26 = (WorldEntity)var10.worldEntities.get((long)var3);
												if (var26 != null) {
													Client.mouseCrossX = var8;
													Client.mouseCrossY = var9;
													Client.mouseCrossColor = 2;
													Client.mouseCrossState = 0;
													Client.destinationX = var0;
													Client.destinationY = var1;
													var16 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITYT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
													var16.packetBuffer.writeIntIME(ModeWhere.selectedSpellWidget);
													var16.packetBuffer.writeShortAdd(var3);
													var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
													Client.packetWriter.addNode(var16);
												}
												break label663;
											}

											if (var2 == 63) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITY1, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 64) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITY2, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 65) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITY3, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 66) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITY4, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var3);
												var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 67) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITY5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var0 + var11);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var15);
												break label663;
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
														var18 = UserComparator6.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var18.packetBuffer.writeShort(var24.id);
														Client.packetWriter.addNode(var18);
													}
												}
												break label663;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var12 + var1);
												var15.packetBuffer.writeShortLE(var0 + var11);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label663;
											}

											if (var2 != 1007) {
												if (var2 != 1009 && var2 != 1008 && var2 != 1011 && var2 != 1010 && var2 != 1012) {
													if (var2 == 1013) {
														Client.mouseCrossX = var8;
														Client.mouseCrossY = var9;
														Client.mouseCrossColor = 2;
														Client.mouseCrossState = 0;
														var15 = UserComparator6.getPacketBufferNode(ClientPacket.OPWORLDENTITYE, Client.packetWriter.isaacCipher);
														var15.packetBuffer.writeShortLE(var3);
														Client.packetWriter.addNode(var15);
													}
												} else {
													DynamicObject.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label663;
											}
										}

										var23 = UrlRequester.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											WorldMapScaleHandler.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
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
				class89.invalidateWidget(UrlRequester.widgetDefinition.method7476(class325.Players_count));
			}

			if (Client.isSpellSelected) {
				Timer.method8270();
			}

		}
	}
}
