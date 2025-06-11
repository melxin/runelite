import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mc")
public class class320 {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("pc")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "7"
	)
	static int method6826(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
			GrandExchangeOfferWorldComparator.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2;
			GraphicsObject.performPlayerAnimation(class152.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field665) {
				Interpreter.field664 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				var15 = 0;
				if (class300.isNumber(var7)) {
					var15 = class146.method3635(var7);
				}

				PacketBufferNode var13 = class139.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
					var11 = class139.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
					var11 = class139.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
						PacketWriter.method2834(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var14 = ClientPreferences.widgetDefinition.method7286(var9);
						class142.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
						class142.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class7.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						ClientPacket.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						Calendar.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = class139.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class175.Interpreter_stringStackSize -= 2;
						var4 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize];
						String var5 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class139.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + FriendsChat.stringCp1252NullTerminatedByteSize(var4) + FriendsChat.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeByteSub(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						UserComparator6.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class342.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field413 = 3;
						Client.field414 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field413 = 2;
						Client.field414 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field413 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field413 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field413 = 3;
						Client.field414 = var2 ? class539.scriptDotWidget.id : Huffman.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							ClientPacket.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								ClientPacket.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							ClientPacket.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_1.method6194();
							return 1;
						} else if (var0 == 3155) {
							--class175.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class175.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class175.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class175.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class321.method6827(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HitSplatDefinition.method4398();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							ClientPacket.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = ClientPacket.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							MouseHandler.method677(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}
}
