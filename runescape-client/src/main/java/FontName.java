import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("vf")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1402417377
	)
	static int field5750;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	static Model field5748;
	@ObfuscatedName("ao")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvf;",
		garbageValue = "1774305818"
	)
	public static FontName[] method10844() {
		return new FontName[]{FontName_verdana11, FontName_verdana13, FontName_bold12, FontName_verdana15, FontName_plain11, FontName_plain12};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lti;B)I",
		garbageValue = "62"
	)
	public static int method10842(DynamicArray var0) {
		ItemLayer.method4826(var0, (class574)null, false);
		byte var1 = 0;
		int var2 = var0.method10322();
		int var3 = -1;
		int var8;
		if (var0.field5504 == class574.field5820) {
			int[] var4 = var0.method10318();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] < var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5504 == class574.field5816) {
			long[] var9 = var0.method10320();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] < var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5504 == class574.field5824) {
			String var10 = null;
			Object[] var5 = var0.method10321();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "-173169752"
	)
	public static void method10841(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1363231406"
	)
	static int method10849(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			Varcs.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			UserComparator7.Interpreter_intStackSize -= 2;
			class163.performPlayerAnimation(HealthBarUpdate.localPlayer, Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field652) {
				Interpreter.field667 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				var15 = 0;
				if (FriendSystem.isNumber(var7)) {
					var15 = EnumComposition.method4308(var7);
				}

				PacketBufferNode var13 = UserComparator6.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					var11 = UserComparator6.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					var11 = UserComparator6.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
						WorldMapSection1.method6862(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						UserComparator7.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
						Widget var14 = UrlRequester.widgetDefinition.method7476(var9);
						class584.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
						class584.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class423.mouseCam = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class36.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class36.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						DevicePcmPlayerProvider.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = UserComparator6.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStackSize -= 2;
						var4 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
						String var5 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = UserComparator6.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + WorldMapSection2.stringCp1252NullTerminatedByteSize(var4) + WorldMapSection2.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByteSub(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--UserComparator7.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class216.setTapToDrop(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class305.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						UserComparator7.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						UserComparator7.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--UserComparator7.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class396.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--UserComparator7.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						UserComparator7.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field324 = 3;
						Client.field573 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field324 = 2;
						Client.field573 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field324 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field324 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field324 = 3;
						Client.field573 = var2 ? HttpRequestTask.scriptDotWidget.id : class141.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							class36.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class36.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class36.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							class36.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class36.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class537.method10536();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							UserComparator7.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--UserComparator7.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--UserComparator7.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_objectStackSize;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--UserComparator7.Interpreter_intStackSize;
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--UserComparator7.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							UserComparator7.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							UserComparator7.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							UserComparator7.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--UserComparator7.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--UserComparator7.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--UserComparator7.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_objectStackSize;
							return 1;
						} else if (var0 == 3181) {
							class446.method8916(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = EnumComposition.method4305();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							class36.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class36.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							AbstractSocket.method10165(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "977260124"
	)
	@Export("clear")
	static final void clear() {
		class189.field2007.clear();
		class191.field2023.clear();
		Varcs.method2891();
		class381.method8178();
		DbTableType.DBTableType_cache.clear();
		EnumComposition.EnumDefinition_cached.clear();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		class446.method8923();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		Client.method1114();
		KitDefinition.KitDefinition_cached.clear();
		InvDefinition.InvDefinition_cached.clear();
		class102.method3148();
		class159.method3885();
		class404.method8272();
		AsyncHttpResponse.method291();
		class167.method4031();
		VarcInt.method4206();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		class147.method3790();
		class70.method2237();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (class161.field1835 != null) {
			class161.field1835.method10966();
		}

		if (DynamicObject.field817 != null) {
			DynamicObject.field817.method10966();
		}

		class166.method4023();
		AttackOption.method2799();
		VarcInt.VarcInt_cached.clear();
		class183.field1864.clear();
		class178.field1842.clear();
		class181.field1851.clear();
		ClanSettings.method3991();
		class325.method7034();
		class204.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		class174.method4109();
		if (UrlRequester.widgetDefinition != null) {
			UrlRequester.widgetDefinition.method7480();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		class517.method10312();
		Client.field603.clearFiles();
		if (class418.field5030 != null) {
			class418.field5030.clearFiles();
		}

		if (MouseRecorder.field913 != null) {
			MouseRecorder.field913.clearFiles();
		}

		if (class273.field3204 != null) {
			class273.field3204.clearFiles();
		}

		if (class27.archive10 != null) {
			class27.archive10.clearFiles();
		}

		if (class334.archive12 != null) {
			class334.archive12.clearFiles();
		}

		if (VarpDefinition.archive2 != null) {
			VarpDefinition.archive2.clearFiles();
		}

		if (WorldMapLabelSize.field3302 != null) {
			WorldMapLabelSize.field3302.clearFiles();
		}

		if (GrandExchangeOfferNameComparator.field5019 != null) {
			GrandExchangeOfferNameComparator.field5019.clearFiles();
		}

		if (class145.archive13 != null) {
			class145.archive13.clearFiles();
		}

		if (GraphicsObject.archive4 != null) {
			GraphicsObject.archive4.clearFiles();
		}

		if (ReflectionCheck.soundEffectsArchive != null) {
			ReflectionCheck.soundEffectsArchive.clearFiles();
		}

		if (class115.field1514 != null) {
			class115.field1514.clearFiles();
		}

		if (class259.archive6 != null) {
			class259.archive6.clearFiles();
		}

		if (LoginPacket.archive9 != null) {
			LoginPacket.archive9.clearFiles();
		}

		if (WidgetDefinition.field4042 != null) {
			WidgetDefinition.field4042.clearFiles();
		}

		if (class485.field5345 != null) {
			class485.field5345.clearFiles();
		}

		if (HorizontalAlignment.field2091 != null) {
			HorizontalAlignment.field2091.clearFiles();
		}

		if (Friend.archive8 != null) {
			Friend.archive8.clearFiles();
		}

		if (PlayerCompositionColorTextureOverride.field1956 != null) {
			PlayerCompositionColorTextureOverride.field1956.clearFiles();
		}

		if (class159.field1830 != null) {
			class159.field1830.clearFiles();
		}

		if (ApproximateRouteStrategy.field280 != null) {
			ApproximateRouteStrategy.field280.clearFiles();
		}

		if (class551.field5661 != null) {
			class551.field5661.clearFiles();
		}

		if (WorldMapScaleHandler.field3506 != null) {
			WorldMapScaleHandler.field3506.clearFiles();
		}

	}
}
