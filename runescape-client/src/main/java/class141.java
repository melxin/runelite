import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
class class141 implements Callable {
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -1577543669
	)
	static int field1694;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class144 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfh;Lwj;I)V"
	)
	class141(class144 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3713(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CLqq;B)C",
		garbageValue = "3"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2126172460"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-29"
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
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeInt(class470.Players_count);
				var15.packetBuffer.writeShortAdd(HttpMethod.field32);
				var15.packetBuffer.writeShortLE(HttpRequestTask.field80);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeIntME(class556.selectedSpellWidget);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShort(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class291.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShort(var0 + var11);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeIntLE(class470.Players_count);
						var16.packetBuffer.writeShortAdd(HttpRequestTask.field80);
						var16.packetBuffer.writeShort(HttpMethod.field32);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeIntIME(class556.selectedSpellWidget);
						var16.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAdd(var3);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
						var16 = class291.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
							var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(HttpRequestTask.field80);
							var16.packetBuffer.writeShortAddLE(var3);
							var16.packetBuffer.writeInt(class470.Players_count);
							var16.packetBuffer.writeShortAddLE(HttpMethod.field32);
							var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
							var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAddLE(var3);
							var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeIntIME(class556.selectedSpellWidget);
							var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeShort(HttpMethod.field32);
						var15.packetBuffer.writeShort(HttpRequestTask.field80);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeIntIME(class470.Players_count);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeIntME(class556.selectedSpellWidget);
						var15.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortLE(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class291.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5135();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var17;
						Widget var23;
						if (var2 == 24) {
							var23 = class167.widgetDefinition.method7456(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = DynamicObject.method1989(var23);
								}

								if (var19) {
									var17 = class291.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var17.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var17);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class167.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class136.method3644();
									class385.method8192(var1, var0, class255.Widget_unpackTargetMask(class516.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = class203.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + ObjectSound.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = ObjectSound.colorStartTag(65280) + var23.field4200 + ObjectSound.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								DesktopPlatformInfoProvider.method10613();
							} else {
								int var18;
								Widget var21;
								if (var2 == 28) {
									var15 = class291.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class167.widgetDefinition.method7456(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var18] = 1 - Varps.Varps_main[var18];
										SpotAnimationDefinition.changeGameOptions(var18);
									}
								} else if (var2 == 29) {
									var15 = class291.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class167.widgetDefinition.method7456(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var18] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var18] = var21.cs1ComparisonValues[0];
											SpotAnimationDefinition.changeGameOptions(var18);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class66.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class167.widgetDefinition.getWidgetChild(var1, var0);
										ApproximateRouteStrategy.invalidateWidget(Client.meslayerContinueWidget);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortLE(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAddLE(var3);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
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
										var16 = class291.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label569: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = class167.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4116 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4116;
														SequenceDefinition.runScriptEvent(var25);
													}

													var16 = class291.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAdd(var4);
													var16.packetBuffer.writeIntME(var1);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var16.packetBuffer.writeShortAdd(var0);
													var16.packetBuffer.writeIntME(class556.selectedSpellWidget);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
													Client.packetWriter.addNode(var16);
												}
												break label569;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field308 = var3;
												Client.field307 = 30;
												var15 = class291.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteAdd(var3);
												Client.packetWriter.addNode(var15);
												break label569;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = class291.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var12 + var1);
												var15.packetBuffer.writeShort(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label569;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class291.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var15);
												break label569;
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
														var17 = class291.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var17.packetBuffer.writeShort(var24.id);
														Client.packetWriter.addNode(var17);
													}
												}
												break label569;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class291.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var0 + var11);
												var15.packetBuffer.writeShort(var12 + var1);
												var15.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var15);
												break label569;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1010 || var2 == 1008 || var2 == 1011 || var2 == 1012) {
													Skills.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label569;
											}
										}

										var23 = class167.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											ViewportMouse.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
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
				ApproximateRouteStrategy.invalidateWidget(class167.widgetDefinition.method7456(class470.Players_count));
			}

			if (Client.isSpellSelected) {
				class136.method3644();
			}

		}
	}
}
