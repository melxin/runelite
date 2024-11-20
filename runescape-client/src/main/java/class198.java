import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hr")
public class class198 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2056;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2048;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2050;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2047;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2051;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2049;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	static final class198 field2053;
	@ObfuscatedName("an")
	public static int[] field2055;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2087026041
	)
	final int field2052;

	static {
		field2056 = new class198(0);
		field2048 = new class198(1);
		field2050 = new class198(2);
		field2047 = new class198(3);
		field2051 = new class198(4);
		field2049 = new class198(5);
		field2053 = new class198(6);
		field2055 = null;
	}

	class198(int var1) {
		this.field2052 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1490312856"
	)
	static void method3972(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	public static void method3968() {
		field2055 = new int[7];
		field2055[field2056.field2052] = class213.field2337.field2338;
		field2055[field2048.field2052] = class213.field2334.field2338;
		field2055[field2050.field2052] = class213.field2323.field2338;
		field2055[field2047.field2052] = class213.field2329.field2338;
		field2055[field2051.field2052] = class213.field2327.field2338;
		field2055[field2049.field2052] = class213.field2335.field2338;
		field2055[field2053.field2052] = class213.field2333.field2338;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "510"
	)
	static int method3971(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			class289.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			class150.performPlayerAnimation(AsyncHttpResponse.localPlayer, Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field868) {
				Interpreter.field871 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var15 = 0;
				if (UserComparator3.isNumber(var7)) {
					var15 = SecureUrlRequester.method3179(var7);
				}

				PacketBufferNode var13 = Message.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = Message.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = Message.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						class197.method3963(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						PrivateChatMode.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
						Widget var14 = class379.widgetDefinition.method6875(var9);
						User.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
						User.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class160.mouseCam = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SecureUrlRequester.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						SecureUrlRequester.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						class445.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = Message.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = Message.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class164.stringCp1252NullTerminatedByteSize(var4) + class164.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteSub(var3);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--PrivateChatMode.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class227.setTapToDrop(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ScriptFrame.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--PrivateChatMode.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class329.canvasWidth;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class535.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--PrivateChatMode.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field710 = 3;
						Client.field676 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field710 = 2;
						Client.field676 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field710 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field710 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field710 = 3;
						Client.field676 = var2 ? RestClientThreadFactory.scriptDotWidget.id : WorldMapCacheName.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							SecureUrlRequester.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SecureUrlRequester.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								SecureUrlRequester.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							SecureUrlRequester.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SecureUrlRequester.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldMapAreaData.method6330();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							PrivateChatMode.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--PrivateChatMode.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--PrivateChatMode.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--PrivateChatMode.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--PrivateChatMode.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							PrivateChatMode.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							PrivateChatMode.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							PrivateChatMode.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--PrivateChatMode.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--PrivateChatMode.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--PrivateChatMode.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							WidgetDefinition.method6885(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class75.method2253();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							SecureUrlRequester.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = SecureUrlRequester.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							HttpAuthenticationHeader.method8811(var3);
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
