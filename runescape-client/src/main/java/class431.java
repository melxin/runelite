import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qx")
public class class431 {
	@ObfuscatedName("an")
	static int[] field5110;
	@ObfuscatedName("ls")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;
	@ObfuscatedName("ae")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ak")
	int[] field5113;
	@ObfuscatedName("aw")
	int[] field5114;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1261959677
	)
	int field5117;

	public class431() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field5113 = new int[2048];
		this.field5114 = new int[2048];
		this.field5117 = 0;
		field5110 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class151.method3969((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
			field5110[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field5110.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class151.method3969((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field5110.length; ++var1) {
				field5110[var1] = var5;
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "105"
	)
	void method8832(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class320.method7178(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(var3[var8] * var3[var9] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lxt;",
		garbageValue = "-1097044866"
	)
	SpritePixels method8814(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method8832(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-183280906"
	)
	public final void method8815(int var1, int var2) {
		if (this.field5117 < this.field5113.length) {
			this.field5113[this.field5117] = var1;
			this.field5114[this.field5117] = var2;
			++this.field5117;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "954655421"
	)
	public final void method8816() {
		this.field5117 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILxt;FI)V",
		garbageValue = "16582757"
	)
	public final void method8839(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method8814(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field5117; ++var10) {
			var11 = this.field5113[var10];
			var12 = this.field5114[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method9239(var8, var9);
			this.method8813(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field5110.length) {
						var11 = field5110.length;
					}

					var12 = field5110[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxt;Lxt;Lrl;I)V",
		garbageValue = "-1291066961"
	)
	void method8813(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-2056260639"
	)
	public static int method8837(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "369940969"
	)
	static int method8838(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			class356.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class408.Interpreter_intStackSize -= 2;
			CameraViewMode.performPlayerAnimation(class330.localPlayer, Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field618) {
				Interpreter.field620 = true;
			}

			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				var8 = 0;
				if (ViewportMouse.isNumber(var7)) {
					var8 = Message.method778(var7);
				}

				PacketBufferNode var13 = ReflectionCheck.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var8);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var11 = ReflectionCheck.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var11 = ReflectionCheck.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
						ItemLayer.method5255(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class408.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
						Widget var14 = class226.widgetDefinition.method7728(var9);
						class141.clickWidget(var14, var3, var8);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class408.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
						class141.clickWidget(var12, var3, var8);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UrlRequest.mouseCam = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class468.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class468.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
						--class408.Interpreter_intStackSize;
						class558.openURL(var7);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = ReflectionCheck.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						SecureRandomFuture.Interpreter_objectStackSize -= 2;
						var4 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
						String var5 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ReflectionCheck.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + AccessFile.stringCp1252NullTerminatedByteSize(var4) + AccessFile.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeShortLE(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class408.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						KeyHandler.setTapToDrop(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class175.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class408.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class408.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class408.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class489.canvasWidth;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class374.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class408.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class408.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field386 = 3;
						Client.field333 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field386 = 2;
						Client.field333 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field386 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field386 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field386 = 3;
						Client.field333 = var2 ? UserComparator3.scriptDotWidget.id : class222.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class468.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class468.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class468.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class468.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class468.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = StudioGame.method8389();
							return 1;
						} else if (var0 == 3155) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class408.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class408.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class408.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class408.Interpreter_intStackSize;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class408.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class408.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class408.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class408.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class408.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class408.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class408.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3181) {
							DefaultsGroup.method10774(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.method784();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							class468.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class468.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							class397.method8413(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "20"
	)
	static final void method8826(int var0, int var1) {
		if (Client.hintArrow.method8423() == 4) {
			WorldEntity var2 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)Client.hintArrow.method8454());
			if (var2 != null) {
				int var3 = var2.worldView.sizeX * 64;
				int var4 = var2.worldView.sizeY * 64;
				class155.method4001(var2.worldView, var3, var4, Client.hintArrow.method8429() * 2, 0);
				if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
					SceneTilePaint.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
				}

			}
		}
	}
}
