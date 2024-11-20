import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1469097757
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("wd")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ab")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aw")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "463948945"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-488722369"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-80664188"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return class173.method3692();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;S)I",
		garbageValue = "-18389"
	)
	static int method2350(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field962;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field963;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field942;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1438833992"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && HttpRequest.topLevelWorldView.worldEntities[var5] != null) {
			var10 = HttpRequest.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = HttpRequest.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
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
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntIME(RouteStrategy.Players_count);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(class424.field4755);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShort(class174.field1826);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeIntLE(Clock.selectedSpellWidget);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShort(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var3);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = Message.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var16;
				NPC var20;
				if (var2 == 7) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAddLE(class174.field1826);
						var16.packetBuffer.writeShortAdd(class424.field4755);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeIntLE(RouteStrategy.Players_count);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 8) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeIntLE(Clock.selectedSpellWidget);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeShort(Client.selectedSpellItemId);
						var16.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 9) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 10) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 11) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 12) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 13) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = Message.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else {
					Player var22;
					if (var2 == 14) {
						var22 = var14[var3];
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAdd(class174.field1826);
							var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeIntLE(RouteStrategy.Players_count);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeShortAdd(class424.field4755);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 15) {
						var22 = var14[var3];
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeIntME(Clock.selectedSpellWidget);
							var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
							var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(class174.field1826);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShortAddLE(class424.field4755);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeIntLE(RouteStrategy.Players_count);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var15.packetBuffer.writeIntLE(Clock.selectedSpellWidget);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShort(Client.selectedSpellItemId);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = Message.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method4933();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var19;
						Widget var23;
						if (var2 == 24) {
							var23 = class379.widgetDefinition.method6875(var1);
							if (var23 != null) {
								boolean var18 = true;
								if (var23.contentType > 0) {
									var18 = ClientPreferences.method2781(var23);
								}

								if (var18) {
									var19 = Message.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var19.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var19);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class379.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class320.method6451();
									class229.method4534(var1, var0, class202.Widget_unpackTargetMask(Renderable.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = Fonts.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + class438.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = class438.colorStartTag(65280) + var23.field3997 + class438.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								Login.method2332();
							} else {
								int var17;
								Widget var21;
								if (var2 == 28) {
									var15 = Message.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class379.widgetDefinition.method6875(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
										class145.changeGameOptions(var17);
									}
								} else if (var2 == 29) {
									var15 = Message.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class379.widgetDefinition.method6875(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var17] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var17] = var21.cs1ComparisonValues[0];
											class145.changeGameOptions(var17);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class359.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class379.widgetDefinition.getWidgetChild(var1, var0);
										class178.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 45) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 46) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 47) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAddLE(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 48) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortLE(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 49) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 50) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 51) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = Message.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var23 = class379.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											if (var23.field3976 != null) {
												ScriptEvent var24 = new ScriptEvent();
												var24.widget = var23;
												var24.opIndex = var3;
												var24.targetName = var7;
												var24.args = var23.field3976;
												WorldMapEvent.runScriptEvent(var24);
											}

											var16 = Message.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
											var16.packetBuffer.writeShortAddLE(var0);
											var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
											var16.packetBuffer.writeIntLE(var1);
											var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
											var16.packetBuffer.writeIntME(Clock.selectedSpellWidget);
											var16.packetBuffer.writeShortAdd(var4);
											Client.packetWriter.addNode(var16);
										}
									} else if (var2 == 60) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 1;
										Client.mouseCrossState = 0;
										var15 = Message.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeByteAdd(var3);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1001) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var15 = Message.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var15.packetBuffer.writeShortAddLE(var3);
										var15.packetBuffer.writeShort(var0 + var11);
										var15.packetBuffer.writeShortAddLE(var12 + var1);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var15 = Message.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeShortLE(var3);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1003) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var20 = var13[var3];
										if (var20 != null) {
											NPCComposition var25 = var20.definition;
											if (var25.transforms != null) {
												var25 = var25.transform();
											}

											if (var25 != null) {
												var19 = Message.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
												var19.packetBuffer.writeShortAdd(var25.id);
												Client.packetWriter.addNode(var19);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var15 = Message.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeShortAdd(var0 + var11);
										var15.packetBuffer.writeShort(var3);
										var15.packetBuffer.writeShort(var12 + var1);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1008 || var2 == 1011 || var2 == 1009 || var2 == 1010 || var2 == 1012) {
										class158.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var23 = class379.widgetDefinition.getWidgetChild(var1, var0);
									if (var23 != null) {
										AsyncHttpResponse.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
									}
								}
							}
						}
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				class178.invalidateWidget(class379.widgetDefinition.method6875(RouteStrategy.Players_count));
			}

			if (Client.isSpellSelected) {
				class320.method6451();
			}

		}
	}
}
