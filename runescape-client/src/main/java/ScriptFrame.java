import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	static class580 field202;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -2101212985
	)
	static int field210;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 2001367751
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1078296483
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ag")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("an")
	@Export("stringLocals")
	Object[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1590935225"
	)
	public static void method745() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIB)V",
		garbageValue = "-97"
	)
	static final void method749(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Tiles.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1310410940"
	)
	public static boolean method748() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class345.field3929.isEmpty()) {
			SongTask var2 = (SongTask)class345.field3929.get(0);
			if (var2 == null) {
				class345.field3929.remove(0);
			} else if (var2.vmethod9974()) {
				if (var2.method9961()) {
					System.out.println("Error in midimanager.service: " + var2.method9948());
					var0 = true;
				} else {
					if (var2.method9949() != null) {
						class345.field3929.add(1, var2.method9949());
					}

					var1 = var2.method9958();
				}

				class345.field3929.remove(0);
			} else {
				var1 = var2.method9958();
			}
		}

		if (var0) {
			class345.field3929.clear();
			class151.method3973();
		}

		return var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "0"
	)
	static int method747(int var0, Script var1, boolean var2) {
		Widget var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.width * -1946208531;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.height * -905446999;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else if (var0 != 2506) {
			return 2;
		} else {
			int var4 = var3.parentId;
			if (var4 == -1) {
				for (InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)Client.interfaceParents.next()) {
					if (var3.id >> 16 == var5.group) {
						var4 = (int)var5.key;
						break;
					}
				}
			}

			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "-73"
	)
	static int method746(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class408.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			ClientPacket.privateChatMode = class461.method9363(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
			if (ClientPacket.privateChatMode == null) {
				ClientPacket.privateChatMode = PrivateChatMode.field6174;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = ReflectionCheck.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(ClientPacket.privateChatMode.field6176);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				class408.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var6 = ReflectionCheck.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class408.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var5 = class70.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = ArchiveLoader.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (ClientPacket.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ClientPacket.privateChatMode.field6176;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var12 = class184.method4319(var7, var8, class352.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							SecureRandomFuture.Interpreter_objectStackSize -= 2;
							var8 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
							String var11 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
							var12 = ReflectionCheck.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset * 2108391709;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class287.method6523(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset * 2108391709 - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
							class408.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var6 = class184.method4319(var7, var8, class352.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = KeyHandler.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class194.method4452(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								GrandExchangeOfferOwnWorldComparator.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field448 = ((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]).toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = Client.field448;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class408.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
								var5 = class70.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var4 = ArchiveLoader.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class330.localPlayer != null && class330.localPlayer.username != null) {
								var8 = class330.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
