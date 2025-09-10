import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
public class class146 extends DualNode {
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1277799945
	)
	int field1729;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[Lff;"
	)
	public class138[][] field1732;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lff;"
	)
	class138[][] field1737;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	public Skeleton field1731;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1520836279
	)
	int field1730;
	@ObfuscatedName("as")
	boolean field1735;
	@ObfuscatedName("al")
	Future field1734;
	@ObfuscatedName("au")
	List field1733;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V"
	)
	class146(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1732 = null;
		this.field1737 = null;
		this.field1730 = 0;
		this.field1729 = var3;
		byte[] var4 = var1.takeFile(this.field1729 >> 16 & 65535, this.field1729 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1731 = new Skeleton(var7, var8);
		this.field1733 = new ArrayList();
		this.field1734 = class86.field1231.submit(new class143(this, var5, var6));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "71"
	)
	void method3783(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1730 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1737 = new class138[this.field1731.method5095().method5026()][];
		this.field1732 = new class138[this.field1731.method5094()][];
		class137[] var4 = new class137[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class139 var16 = (class139)class173.findEnumerated(class389.method8215(), var7);
			if (var16 == null) {
				var16 = class139.field1685;
			}

			var9 = var1.readUShortSmart();
			int var11 = var1.readUnsignedByte();
			class140 var12 = (class140)class173.findEnumerated(WorldMapSectionType.method6781(), var11);
			if (var12 == null) {
				var12 = class140.field1704;
			}

			class138 var13 = new class138();
			var13.method3670(var1, var2);
			var4[var5] = new class137(this, var13, var16, var12, var9);
			int var14 = var16.method3707();
			class138[][] var15;
			if (var16 == class139.field1682) {
				var15 = this.field1737;
			} else {
				var15 = this.field1732;
			}

			if (var15[var9] == null) {
				var15[var9] = new class138[var14];
			}

			if (var16 == class139.field1687) {
				this.field1735 = true;
			}
		}

		var5 = var3 / class86.field1230;
		int var6 = var3 % class86.field1230;
		int var8 = 0;

		for (var9 = 0; var9 < class86.field1230; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1733.add(class86.field1231.submit(new class141(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1947499881"
	)
	public boolean method3754() {
		if (this.field1734 == null && this.field1733 == null) {
			return true;
		} else {
			if (this.field1734 != null) {
				if (!this.field1734.isDone()) {
					return false;
				}

				this.field1734 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1733.size(); ++var2) {
				if (!((Future)this.field1733.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1733.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1733 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2011880333"
	)
	public int method3755() {
		return this.field1730;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	public boolean method3756() {
		return this.field1735;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILfa;III)V",
		garbageValue = "-1827910137"
	)
	public void method3757(int var1, class135 var2, int var3, int var4) {
		TransformationMatrix var5 = class401.method8245();
		this.method3758(var5, var3, var2, var1);
		this.method3770(var5, var3, var2, var1);
		this.method3759(var5, var3, var2, var1);
		var2.method3636(var5);
		var5.method9140();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrj;ILfa;II)V",
		garbageValue = "-1899615591"
	)
	void method3758(TransformationMatrix var1, int var2, class135 var3, int var4) {
		float[] var5 = var3.method3630(this.field1730);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1737[var2] != null) {
			class138 var9 = this.field1737[var2][0];
			class138 var10 = this.field1737[var2][1];
			class138 var11 = this.field1737[var2][2];
			if (var9 != null) {
				var6 = var9.method3672(var4);
			}

			if (var10 != null) {
				var7 = var10.method3672(var4);
			}

			if (var11 != null) {
				var8 = var11.method3672(var4);
			}
		}

		class453 var16 = PendingSpawn.method2414();
		var16.method9056(1.0F, 0.0F, 0.0F, var6);
		class453 var14 = PendingSpawn.method2414();
		var14.method9056(0.0F, 1.0F, 0.0F, var7);
		class453 var15 = PendingSpawn.method2414();
		var15.method9056(0.0F, 0.0F, 1.0F, var8);
		class453 var12 = PendingSpawn.method2414();
		var12.method9059(var15);
		var12.method9059(var16);
		var12.method9059(var14);
		TransformationMatrix var13 = class401.method8245();
		var13.method9107(var12);
		var1.method9173(var13);
		var16.method9054();
		var14.method9054();
		var15.method9054();
		var12.method9054();
		var13.method9140();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrj;ILfa;IB)V",
		garbageValue = "1"
	)
	void method3759(TransformationMatrix var1, int var2, class135 var3, int var4) {
		float[] var5 = var3.method3631(this.field1730);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1737[var2] != null) {
			class138 var9 = this.field1737[var2][3];
			class138 var10 = this.field1737[var2][4];
			class138 var11 = this.field1737[var2][5];
			if (var9 != null) {
				var6 = var9.method3672(var4);
			}

			if (var10 != null) {
				var7 = var10.method3672(var4);
			}

			if (var11 != null) {
				var8 = var11.method3672(var4);
			}
		}

		var1.field5186[12] = var6;
		var1.field5186[13] = var7;
		var1.field5186[14] = var8;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrj;ILfa;IB)V",
		garbageValue = "-84"
	)
	void method3770(TransformationMatrix var1, int var2, class135 var3, int var4) {
		float[] var5 = var3.method3632(this.field1730);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1737[var2] != null) {
			class138 var9 = this.field1737[var2][6];
			class138 var10 = this.field1737[var2][7];
			class138 var11 = this.field1737[var2][8];
			if (var9 != null) {
				var6 = var9.method3672(var4);
			}

			if (var10 != null) {
				var7 = var10.method3672(var4);
			}

			if (var11 != null) {
				var8 = var11.method3672(var4);
			}
		}

		TransformationMatrix var12 = class401.method8245();
		var12.method9132(var6, var7, var8);
		var1.method9173(var12);
		var12.method9140();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "2006370656"
	)
	public static void method3777(AbstractArchive var0) {
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZS)I",
		garbageValue = "323"
	)
	static int method3752(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			UserComparator7.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			WorldMapElement.privateChatMode = WorldMapSectionType.method6780(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
			if (WorldMapElement.privateChatMode == null) {
				WorldMapElement.privateChatMode = PrivateChatMode.field6070;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = UserComparator6.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(WorldMapElement.privateChatMode.field6073);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				UserComparator7.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var6 = UserComparator6.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var5 = class47.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = ObjectComposition.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (WorldMapElement.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = WorldMapElement.privateChatMode.field6073;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var12 = DbTableType.method11058(var7, var8, ViewportMouse.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Interpreter.Interpreter_objectStackSize -= 2;
							var8 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
							String var11 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
							var12 = UserComparator6.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.array * 1216585693;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							WidgetConfigNode.method7497(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.array * 1216585693 - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
							UserComparator7.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var6 = DbTableType.method11058(var7, var8, ViewportMouse.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = WorldMapScaleHandler.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class154.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FloorDecoration.method4910(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
								class154.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field441 = ((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]).toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Client.field441;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
								var5 = class47.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var4 = ObjectComposition.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (HealthBarUpdate.localPlayer != null && HealthBarUpdate.localPlayer.username != null) {
								var8 = HealthBarUpdate.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)V",
		garbageValue = "775445120"
	)
	static void method3782(Widget var0) {
		var0.method7970();
		var0.method7971().method7677(new class86(var0));
		var0.method7971().method7648(new class87(var0));
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lkg;S)V",
		garbageValue = "-3583"
	)
	static void method3781(class273 var0) {
		if (var0 != null && var0.field3196 != null) {
			if (var0.field3196.childIndex * -217986249 >= 0) {
				Widget var1 = UrlRequester.widgetDefinition.method7476(var0.field3196.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field3196.childIndex * -217986249 >= var1.children.length || var0.field3196 != var1.children[var0.field3196.childIndex * -217986249]) {
					return;
				}
			}

			if (var0.field3196.type == 11 && var0.field3200 == 0) {
				if (var0.field3196.method7959(var0.field3197, var0.field3199, 0, 0)) {
					var0.field3196.method7967().method5816().method5962(1, var0.field3196.method7967().method5825());
					switch(var0.field3196.method7963()) {
					case 0:
						DevicePcmPlayerProvider.openURL(var0.field3196.method7965(), true, false);
						break;
					case 1:
						if (class328.method7044(DirectByteArrayCopier.getWidgetFlags(var0.field3196))) {
							int[] var4 = var0.field3196.method7966();
							if (var4 != null) {
								PacketBufferNode var2 = UserComparator6.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var2.packetBuffer.method11234(var4[0]);
								var2.packetBuffer.writeIntIME(var4[2]);
								var2.packetBuffer.method11250(var4[1]);
								var2.packetBuffer.writeIntLE(var0.field3196.childIndex * -217986249);
								var2.packetBuffer.writeInt(var0.field3196.id);
								var2.packetBuffer.writeIntIME(var0.field3196.method7964());
								Client.packetWriter.addNode(var2);
							}
						}
					}
				}
			} else if (var0.field3196.type == 12) {
				class366 var3 = var0.field3196.method7971();
				if (var3 != null && var3.method7654()) {
					switch(var0.field3200) {
					case 0:
						Client.field598.method6104(var0.field3196);
						var3.method7605(true);
						var3.method7641(var0.field3197, var0.field3199, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var3.method7642(var0.field3197, var0.field3199);
					}
				}
			}

		}
	}
}
