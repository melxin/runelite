import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kl")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2122298269"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3478.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "104"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3434 = new byte[super.planes][64][64];
		super.field3442 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class302.field3472.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return super.regionX == var2.regionX && super.regionY == var2.regionY;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2114471068"
	)
	public static boolean method6385(int var0) {
		if (class338.field3891.isEmpty()) {
			return false;
		} else {
			MidiRequest var1 = (MidiRequest)class338.field3891.get(0);
			return var1 != null && var0 == var1.musicTrackGroupId;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1395497576"
	)
	static int method6388(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			class292.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			UrlRequest.Interpreter_intStackSize -= 2;
			class271.performPlayerAnimation(class159.localPlayer, Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field641) {
				Interpreter.field640 = true;
			}

			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				var8 = 0;
				if (class464.isNumber(var7)) {
					var8 = class349.method7392(var7);
				}

				PacketBufferNode var13 = HorizontalAlignment.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var8);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					var11 = HorizontalAlignment.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					var11 = HorizontalAlignment.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var4 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
						VarbitComposition.method4587(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						UrlRequest.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
						Widget var14 = class35.widgetDefinition.method7496(var9);
						MenuAction.clickWidget(var14, var3, var8);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
						MenuAction.clickWidget(var12, var3, var8);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ObjectComposition.mouseCam = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class154.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class154.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
						--UrlRequest.Interpreter_intStackSize;
						class114.openURL(var7);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = HorizontalAlignment.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Message.Interpreter_objectStackSize -= 2;
						var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
						String var5 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = HorizontalAlignment.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + WorldMapArea.stringCp1252NullTerminatedByteSize(var4) + WorldMapArea.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeByte(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--UrlRequest.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class202.setTapToDrop(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = JagexCache.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						UrlRequest.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						UrlRequest.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--UrlRequest.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class4.canvasWidth;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class558.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--UrlRequest.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						UrlRequest.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field403 = 3;
						Client.field404 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field403 = 2;
						Client.field404 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field403 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field403 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field403 = 3;
						Client.field404 = var2 ? class359.scriptDotWidget.id : GameEngine.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							class154.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class154.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class154.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							class154.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class154.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class239.method5520();
							return 1;
						} else if (var0 == 3155) {
							--Message.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							UrlRequest.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--UrlRequest.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--UrlRequest.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Message.Interpreter_objectStackSize;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--UrlRequest.Interpreter_intStackSize;
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--UrlRequest.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							UrlRequest.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							UrlRequest.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							UrlRequest.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--UrlRequest.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--UrlRequest.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--UrlRequest.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Message.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Message.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3181) {
							GrandExchangeEvents.method8528(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class461.method9466();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							class154.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class154.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							InvDefinition.method4188(var3);
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
