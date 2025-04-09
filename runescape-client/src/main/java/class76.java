import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class76 {
	@ObfuscatedName("ao")
	static final BigInteger field921;
	@ObfuscatedName("an")
	static final BigInteger field920;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field919;

	static {
		field921 = new BigInteger("10001", 16);
		field920 = new BigInteger("abcd67ffc0d3742a8be1d29f9db87d994d7dfd466e8d04e49f4e9f187a08b2f1d053bc724bccf68bb1b5620e21c47497ac9351327699940bc48a2b49c10fd7c8f56a6f01370cf04c1132096cd3224266edf86d81565d015961b6f0c1e5c7960f94a71100b4d46c60344c409dfdf2508591035400b350161a7697dff8770e9bb9", 16);
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Lch;IIB)V",
		garbageValue = "29"
	)
	static final void method2258(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1759043300"
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
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3400, Client.packetWriter.isaacCipher);
				var15.packetBuffer.method10279(class325.field3498);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShort(class320.Players_count);
				var15.packetBuffer.writeShortAdd(class156.field1756);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3469, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeIntIME(AABB.selectedSpellWidget);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3425, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3466, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3465, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3433, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3422, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(class320.Players_count);
						var16.packetBuffer.writeShortAddLE(class156.field1756);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeIntIME(class325.field3498);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3452, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeInt(AABB.selectedSpellWidget);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						var16.packetBuffer.writeShort(Client.selectedSpellItemId);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3381, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3478, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3432, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3408, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3441, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAdd(var3);
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
							var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3430, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(class156.field1756);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeIntME(class325.field3498);
							var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShort(class320.Players_count);
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
							var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3426, Client.packetWriter.isaacCipher);
							var16.packetBuffer.method10279(AABB.selectedSpellWidget);
							var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeShort(Client.selectedSpellItemId);
							var16.packetBuffer.writeShortAddLE(var3);
							var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3412, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShort(class156.field1756);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntIME(class325.field3498);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortAdd(class320.Players_count);
						var15.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3420, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeInt(AABB.selectedSpellWidget);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3403, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3482, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3424, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3418, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3382, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method4109();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var17;
						Widget var23;
						if (var2 == 24) {
							var23 = class232.widgetDefinition.method6951(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = class210.method4717(var23);
								}

								if (var19) {
									var17 = FloorDecoration.getPacketBufferNode(ClientPacket.field3416, Client.packetWriter.isaacCipher);
									var17.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var17);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class232.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									ActorSpotAnim.method9429();
									HttpResponse.method302(var1, var0, WorldMapIcon_1.Widget_unpackTargetMask(class31.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = class141.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + Decimator.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = Decimator.colorStartTag(65280) + var23.field4000 + Decimator.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								JagNetThread.method7815();
							} else {
								int var18;
								Widget var21;
								if (var2 == 28) {
									var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3416, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class232.widgetDefinition.method6951(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var18] = 1 - Varps.Varps_main[var18];
										HttpHeaders.changeGameOptions(var18);
									}
								} else if (var2 == 29) {
									var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3416, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class232.widgetDefinition.method6951(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var18] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var18] = var21.cs1ComparisonValues[0];
											HttpHeaders.changeGameOptions(var18);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										TileItem.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class232.widgetDefinition.getWidgetChild(var1, var0);
										class139.invalidateWidget(Client.meslayerContinueWidget);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3454, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3453, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3463, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3443, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3393, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3475, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3397, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3464, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label565: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = class232.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4052 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4052;
														class60.runScriptEvent(var25);
													}

													var16 = FloorDecoration.getPacketBufferNode(ClientPacket.field3409, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													var16.packetBuffer.method10279(var1);
													var16.packetBuffer.writeShortLE(var4);
													var16.packetBuffer.writeIntIME(AABB.selectedSpellWidget);
													var16.packetBuffer.writeShort(var0);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
													Client.packetWriter.addNode(var16);
												}
												break label565;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field768 = var3;
												Client.field785 = 30;
												var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3383, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByte(var3);
												Client.packetWriter.addNode(var15);
												break label565;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3423, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var3);
												var15.packetBuffer.writeShortAdd(var12 + var1);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAddLE(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label565;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3480, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var3);
												Client.packetWriter.addNode(var15);
												break label565;
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
														var17 = FloorDecoration.getPacketBufferNode(ClientPacket.field3472, Client.packetWriter.isaacCipher);
														var17.packetBuffer.writeShortAdd(var24.id);
														Client.packetWriter.addNode(var17);
													}
												}
												break label565;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3413, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var3);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeShort(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label565;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													GameBuild.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label565;
											}
										}

										var23 = class232.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											class153.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
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
				class139.invalidateWidget(class232.widgetDefinition.method6951(class325.field3498));
			}

			if (Client.isSpellSelected) {
				ActorSpotAnim.method9429();
			}

		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IIII)V",
		garbageValue = "-1664993955"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class362.method7337();
		SpriteMask var4 = var0.method7359(class232.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field696 / 32 + 48;
				int var7 = 464 - Client.field697 / 32;
				InterfaceParent.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var29;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var29 = Client.mapIconXs[var8] * 4 + 2 - Client.field696 / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - Client.field697 / 32;
					HttpRequestTask.drawSpriteOnMinimap(var1, var2, var29, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var29 = 0; var29 < 104; ++var29) {
						NodeDeque var26 = class509.topLevelWorldView.groundItems[class509.topLevelWorldView.plane][var8][var29];
						if (var26 != null) {
							var11 = var8 * 4 + 2 - Client.field696 / 32;
							var12 = var29 * 4 + 2 - Client.field697 / 32;
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var11, var12, WorldMapSection1.field3325[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class509.topLevelWorldView.field1351.method9060(); ++var8) {
					NPC var9 = (NPC)class509.topLevelWorldView.npcs.get((long)class509.topLevelWorldView.field1351.method9056(var8));
					if (var9 != null && var9.isVisible()) {
						NPCComposition var31 = var9.definition;
						if (var31 != null && var31.transforms != null) {
							var31 = var31.transform();
						}

						if (var31 != null && var31.drawMapDot && var31.isInteractable) {
							var11 = var9.x / 32 - Client.field696 / 32;
							var12 = var9.y / 32 - Client.field697 / 32;
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var11, var12, WorldMapSection1.field3325[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var30 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var27 = (Player)class509.topLevelWorldView.players.get((long)var30[var10]);
					if (var27 != null && var27.isVisible() && !var27.isHidden && var27 != Script.localPlayer) {
						var12 = var27.x / 32 - Client.field696 / 32;
						int var28 = var27.y / 32 - Client.field697 / 32;
						if (var27.isFriend()) {
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var12, var28, WorldMapSection1.field3325[3], var4);
						} else if (Script.localPlayer.team != 0 && var27.team != 0 && var27.team == Script.localPlayer.team) {
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var12, var28, WorldMapSection1.field3325[4], var4);
						} else if (var27.isFriendsChatMember()) {
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var12, var28, WorldMapSection1.field3325[5], var4);
						} else if (var27.isClanMember()) {
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var12, var28, WorldMapSection1.field3325[6], var4);
						} else {
							HttpRequestTask.drawSpriteOnMinimap(var1, var2, var12, var28, WorldMapSection1.field3325[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0) {
						NPC var32 = (NPC)class509.topLevelWorldView.npcs.get((long)Client.hintArrowNpcIndex);
						if (var32 != null) {
							var11 = var32.x / 32 - Client.field696 / 32;
							var12 = var32.y / 32 - Client.field697 / 32;
							Actor.worldToMinimap(var1, var2, var11, var12, class59.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class509.topLevelWorldView.baseX * 4 + 2 - Client.field696 / 32;
						var11 = Client.hintArrowY * 4 - class509.topLevelWorldView.baseY * 4 + 2 - Client.field697 / 32;
						Actor.worldToMinimap(var1, var2, var10, var11, class59.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0) {
						Player var33 = (Player)class509.topLevelWorldView.players.get((long)Client.hintArrowPlayerIndex);
						if (var33 != null) {
							var11 = var33.x / 32 - Client.field696 / 32;
							var12 = var33.y / 32 - Client.field697 / 32;
							Actor.worldToMinimap(var1, var2, var11, var12, class59.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Client.field696 / 32;
					var11 = Client.destinationY * 4 + 2 - Client.field697 / 32;
					HttpRequestTask.drawSpriteOnMinimap(var1, var2, var10, var11, class59.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2578(-1) == class505.field5239 && class59.mapDotSprites.length >= 4) {
					var10 = var4.width / 2 + var1;
					var11 = var4.height / 2 + var2;
					SpritePixels var13;
					int var14;
					byte var15;
					double var17;
					int var19;
					double var21;
					int var23;
					int var24;
					int var25;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var12 = WorldViewManager.method2616(var1, var2, var4);
						var13 = class59.mapDotSprites[2];
						var14 = var12 * 128;
						var14 += Client.camAngleY;
						var14 &= 2047;
						var15 = 30;
						var17 = (double)Archive.method7679(var14) / 65536.0D;
						var19 = var10 - (int)(var17 * (double)var15);
						var23 = class520.field5298[var14 & 2047];
						var21 = (double)var23 / 65536.0D;
						var23 = var11 + (int)((double)var15 * var21);
						var24 = Math.max(var13.subWidth, var13.subHeight);
						var25 = var24 / 2;
						var13.method10795(var19 - var25, var23 - var25, var13.subWidth, var13.subHeight, var13.subWidth / 2, var13.subHeight / 2, (double)class47.method888(var14), 256);
					}

					if (Client.field785 > 0) {
						var12 = Client.field768;
						var13 = class59.mapDotSprites[3];
						var14 = var12 * 128;
						var14 += Client.camAngleY;
						var14 &= 2047;
						var15 = 30;
						var17 = (double)Archive.method7679(var14) / 65536.0D;
						var19 = var10 - (int)(var17 * (double)var15);
						var23 = class520.field5298[var14 & 2047];
						var21 = (double)var23 / 65536.0D;
						var23 = (int)(var21 * (double)var15) + var11;
						var24 = Math.max(var13.subWidth, var13.subHeight);
						var25 = var24 / 2;
						var13.method10795(var19 - var25, var23 - var25, var13.subWidth, var13.subHeight, var13.subWidth / 2, var13.subHeight / 2, (double)class47.method888(var14), 256);
					}
				}

				if (!Script.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field558[var3] = true;
		}
	}
}
