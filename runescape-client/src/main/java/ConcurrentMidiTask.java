import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sz")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("al")
	ArrayList field5193;

	@ObfuscatedSignature(
		descriptor = "(Lsj;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5193 = var2;
		super.field5191 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		for (int var1 = 0; var1 < this.field5193.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5193.get(var1);
			if (var2 == null) {
				this.field5193.remove(var1);
				--var1;
			} else if (var2.vmethod9672()) {
				if (var2.method9650()) {
					this.method9654(var2.method9667());
					this.field5193.clear();
					return true;
				}

				if (var2.method9653() != null) {
					this.field5193.add(var2.method9653());
				}

				super.field5188 = var2.field5188;
				this.field5193.remove(var1);
				--var1;
			}
		}

		if (this.field5193.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-26"
	)
	static int method9671(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			ClanChannelMember.privateChatMode = GraphicsDefaults.method10477(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
			if (ClanChannelMember.privateChatMode == null) {
				ClanChannelMember.privateChatMode = PrivateChatMode.field5971;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class291.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(ClanChannelMember.privateChatMode.field5973);
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
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var6 = class291.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var5 = class400.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
						var4 = VarpDefinition.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (ClanChannelMember.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ClanChannelMember.privateChatMode.field5973;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var12 = class46.method1841(var7, var8, HorizontalAlignment.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							SecureRandomFuture.Interpreter_objectStackSize -= 2;
							var8 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
							String var11 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
							var12 = class291.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							PcmPlayer.method3049(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var6 = class46.method1841(var7, var8, HorizontalAlignment.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = KeyHandler.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = SceneTilePaint.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = GameObject.method5790(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								WorldMapDecorationType.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field420 = ((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]).toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = Client.field420;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
								var5 = class400.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								var4 = VarpDefinition.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class27.localPlayer != null && class27.localPlayer.username != null) {
								var8 = class27.localPlayer.username.getName();
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
