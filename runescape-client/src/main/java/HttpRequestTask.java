import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static Fonts field78;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final HttpRequest field79;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Lap;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field79 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field79.connect()) {
				GrandExchangeOfferOwnWorldComparator.method789(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field79.getResponse();
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-3"
	)
	static void method285(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeShortAddLE(var1 + class547.topLevelWorldView.baseY);
		var4.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeShortLE(var0 + class547.topLevelWorldView.baseX);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(class159.localPlayer.x);
		var4.packetBuffer.writeShort(class159.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	static void method286(int var0) {
		PacketBufferNode var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-277637373"
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
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(ChatChannel.field803);
				var15.packetBuffer.writeIntME(HealthBarUpdate.field1098);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortLE(class204.Players_count);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeIntME(class142.selectedSpellWidget);
				var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var18;
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeShortLE(class204.Players_count);
						var18.packetBuffer.writeShortAddLE(var3);
						var18.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeInt(HealthBarUpdate.field1098);
						var18.packetBuffer.writeShortAddLE(ChatChannel.field803);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeIntLE(class142.selectedSpellWidget);
						var18.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var18.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeShort(var3);
						var18.packetBuffer.writeShort(Client.selectedSpellItemId);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeShort(var3);
						var18.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var18);
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
						var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var18.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var18);
					}
				} else {
					Player var21;
					if (var2 == 14) {
						var21 = (Player)var14.get((long)var3);
						if (var21 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var18.packetBuffer.writeInt(HealthBarUpdate.field1098);
							var18.packetBuffer.writeShort(class204.Players_count);
							var18.packetBuffer.writeShort(var3);
							var18.packetBuffer.writeShort(ChatChannel.field803);
							var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var18);
						}
					} else if (var2 == 15) {
						var21 = (Player)var14.get((long)var3);
						if (var21 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var18.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var18.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
							var18.packetBuffer.writeShortAddLE(var3);
							var18.packetBuffer.writeInt(class142.selectedSpellWidget);
							var18.packetBuffer.writeShort(Client.selectedSpellChildIndex);
							Client.packetWriter.addNode(var18);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntLE(HealthBarUpdate.field1098);
						var15.packetBuffer.writeShortLE(ChatChannel.field803);
						var15.packetBuffer.writeShortAdd(class204.Players_count);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeIntME(class142.selectedSpellWidget);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5216();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var17;
						Widget var23;
						if (var2 == 24) {
							var23 = class35.widgetDefinition.method7496(var1);
							if (var23 != null) {
								boolean var16 = true;
								if (var23.contentType > 0) {
									var16 = class113.method3527(var23);
								}

								if (var16) {
									var17 = HorizontalAlignment.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var17.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var17);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class35.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class30.method470();
									class572.method11201(var1, var0, AsyncRestClient.Widget_unpackTargetMask(MouseRecorder.method2181(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = ClientPreferences.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + class171.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = class171.colorStartTag(65280) + var23.field4305 + class171.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								class206.method4591();
							} else {
								int var19;
								Widget var22;
								if (var2 == 28) {
									var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var22 = class35.widgetDefinition.method7496(var1);
									if (var22 != null && var22.cs1Instructions != null && var22.cs1Instructions[0][0] == 5) {
										var19 = var22.cs1Instructions[0][1];
										Varps.Varps_main[var19] = 1 - Varps.Varps_main[var19];
										class271.changeGameOptions(var19);
									}
								} else if (var2 == 29) {
									var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var22 = class35.widgetDefinition.method7496(var1);
									if (var22 != null && var22.cs1Instructions != null && var22.cs1Instructions[0][0] == 5) {
										var19 = var22.cs1Instructions[0][1];
										if (Varps.Varps_main[var19] != var22.cs1ComparisonValues[0]) {
											Varps.Varps_main[var19] = var22.cs1ComparisonValues[0];
											class271.changeGameOptions(var19);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class507.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class35.widgetDefinition.getWidgetChild(var1, var0);
										class154.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var18.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 45) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeShort(var3);
										var18.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 46) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeShortAdd(var3);
										var18.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 47) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var18.packetBuffer.writeShortAddLE(var3);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 48) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var18.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 49) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeShortAddLE(var3);
										var18.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 50) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var18.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var18);
									}
								} else if (var2 == 51) {
									var21 = (Player)var14.get((long)var3);
									if (var21 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var18.packetBuffer.writeShortAddLE(var3);
										var18.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var18);
									}
								} else {
									label666: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = class35.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4319 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4319;
														class332.runScriptEvent(var25);
													}

													var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var18.packetBuffer.writeShortAdd(var0);
													var18.packetBuffer.writeShort(Client.selectedSpellChildIndex);
													var18.packetBuffer.writeInt(class142.selectedSpellWidget);
													var18.packetBuffer.writeIntME(var1);
													var18.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var18.packetBuffer.writeShortLE(var4);
													Client.packetWriter.addNode(var18);
												}
												break label666;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field565 = var3;
												Client.field557 = 30;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByte(var3);
												Client.packetWriter.addNode(var15);
												break label666;
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
													var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITYU, Client.packetWriter.isaacCipher);
													var18.packetBuffer.writeShort(var3);
													var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var18.packetBuffer.writeShort(class204.Players_count);
													var18.packetBuffer.writeShort(ChatChannel.field803);
													var18.packetBuffer.writeInt(HealthBarUpdate.field1098);
													Client.packetWriter.addNode(var18);
												}
												break label666;
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
													var18 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITYT, Client.packetWriter.isaacCipher);
													var18.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var18.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var18.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													var18.packetBuffer.writeShortAdd(var3);
													var18.packetBuffer.writeIntME(class142.selectedSpellWidget);
													Client.packetWriter.addNode(var18);
												}
												break label666;
											}

											if (var2 == 63) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITY1, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 64) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITY2, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 65) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITY3, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var3);
												var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 66) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITY4, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var3);
												var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 67) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITY5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeShortAdd(var0 + var11);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label666;
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
														var17 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var17.packetBuffer.writeShortAddLE(var24.id);
														Client.packetWriter.addNode(var17);
													}
												}
												break label666;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var0 + var11);
												var15.packetBuffer.writeShortAdd(var12 + var1);
												var15.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var15);
												break label666;
											}

											if (var2 != 1007) {
												if (var2 != 1009 && var2 != 1010 && var2 != 1011 && var2 != 1008 && var2 != 1012) {
													if (var2 == 1013) {
														Client.mouseCrossX = var8;
														Client.mouseCrossY = var9;
														Client.mouseCrossColor = 2;
														Client.mouseCrossState = 0;
														var15 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPWORLDENTITYE, Client.packetWriter.isaacCipher);
														var15.packetBuffer.writeShortAddLE(var3);
														Client.packetWriter.addNode(var15);
													}
												} else {
													class50.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label666;
											}
										}

										var23 = class35.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											class179.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
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
				class154.invalidateWidget(class35.widgetDefinition.method7496(HealthBarUpdate.field1098));
			}

			if (Client.isSpellSelected) {
				class30.method470();
			}

		}
	}
}
