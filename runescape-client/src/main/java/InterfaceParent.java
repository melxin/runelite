import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 49473397
	)
	@Export("group")
	int group;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 89843461
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	boolean field868;

	InterfaceParent() {
		this.field868 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-72"
	)
	static int method2164(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-981039427"
	)
	static int method2165(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
		int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-2078878023"
	)
	static int method2166(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			UrlRequest.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			WorldMapRenderer.privateChatMode = Menu.method12069(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
			if (WorldMapRenderer.privateChatMode == null) {
				WorldMapRenderer.privateChatMode = PrivateChatMode.field6138;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(WorldMapRenderer.privateChatMode.field6139);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				UrlRequest.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var6 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var5 = AsyncHttpResponse.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var4 = SecureRandomFuture.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (WorldMapRenderer.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapRenderer.privateChatMode.field6139;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var12 = WorldMapScaleHandler.method6972(var7, var8, class179.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Message.Interpreter_objectStackSize -= 2;
							var8 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
							String var11 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
							var12 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							KitDefinition.method4297(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							UrlRequest.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var6 = WorldMapScaleHandler.method6972(var7, var8, class179.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Varcs.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = UrlRequest.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class137.method3788(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
								TileItem.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field427 = ((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]).toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = Client.field427;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
								var5 = AsyncHttpResponse.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								var4 = SecureRandomFuture.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class159.localPlayer != null && class159.localPlayer.username != null) {
								var8 = class159.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
