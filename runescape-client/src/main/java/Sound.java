import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("Sound")
public class Sound extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1210171667
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static IndexedSprite field1724;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field1718;
	@ObfuscatedName("ay")
	boolean field1722;
	@ObfuscatedName("ah")
	byte field1716;
	@ObfuscatedName("az")
	byte field1717;
	@ObfuscatedName("ao")
	byte field1723;
	@ObfuscatedName("ad")
	byte field1720;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	Sound(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1722 = var1.readUnsignedByte() == 1;
		this.field1716 = var1.readByte();
		this.field1717 = var1.readByte();
		this.field1723 = var1.readByte();
		this.field1720 = var1.readByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.allowGuests = this.field1722;
		var1.field1742 = this.field1716;
		var1.field1753 = this.field1717;
		var1.field1744 = this.field1723;
		var1.field1745 = this.field1720;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-141301278"
	)
	static int method3656(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			ScriptFrame.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			WorldMapLabelSize.privateChatMode = class463.method9025(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
			if (WorldMapLabelSize.privateChatMode == null) {
				WorldMapLabelSize.privateChatMode = PrivateChatMode.field5630;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = ScriptEvent.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(WorldMapLabelSize.privateChatMode.field5629);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				ScriptFrame.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var6 = ScriptEvent.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					var5 = class47.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var4 = class328.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (WorldMapLabelSize.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.privateChatMode.field5629;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							var12 = class521.method9694(var7, var8, ScriptFrame.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							HealthBarConfig.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
							var12 = ScriptEvent.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class344.method6942(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
							ScriptFrame.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
							var6 = class521.method9694(var7, var8, ScriptFrame.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class330.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = MilliClock.method4964(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
								Script.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field516 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = Client.field516;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								ScriptFrame.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
								var5 = class47.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								var4 = class328.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (ModeWhere.localPlayer != null && ModeWhere.localPlayer.username != null) {
								var8 = ModeWhere.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1387703008"
	)
	static void method3657(Buffer var0, int var1) {
		Skeleton.method4172(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
