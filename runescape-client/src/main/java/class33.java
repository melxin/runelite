import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class33 {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 881010105
	)
	int field162;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1996885317
	)
	int field163;

	class33(int var1, int var2) {
		this.field162 = var1;
		this.field163 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbz;B)Z",
		garbageValue = "2"
	)
	boolean method451(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field162) {
			case 1:
				return var1.vmethod5612(this.field163);
			case 2:
				return var1.vmethod5592(this.field163);
			case 3:
				return var1.vmethod5590((char)this.field163);
			case 4:
				return var1.vmethod5595(this.field163 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "934976077"
	)
	static int method454(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			LoginPacket.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			RestClientThreadFactory.performPlayerAnimation(class132.localPlayer, Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field882) {
				Interpreter.field881 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var15 = 0;
				if (class36.isNumber(var7)) {
					var15 = Tiles.method2370(var7);
				}

				PacketBufferNode var13 = class272.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = class272.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = class272.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						class136.method3345(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						HealthBarConfig.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
						Widget var14 = class376.widgetDefinition.method6918(var9);
						class228.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
						class228.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class466.mouseCam = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						AbstractWorldMapIcon.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						class91.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = class272.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class272.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + AsyncRestClient.stringCp1252NullTerminatedByteSize(var4) + AsyncRestClient.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeByteSub(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--HealthBarConfig.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						LoginState.setTapToDrop(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Canvas.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--HealthBarConfig.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = SwapSongTask.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--HealthBarConfig.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field820 = 3;
						Client.field813 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field820 = 2;
						Client.field813 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field820 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field820 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field820 = 3;
						Client.field813 = var2 ? class132.scriptDotWidget.id : PlayerCompositionColorTextureOverride.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
							AbstractWorldMapIcon.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								AbstractWorldMapIcon.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
							AbstractWorldMapIcon.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class521.method9613();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--HealthBarConfig.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--HealthBarConfig.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--HealthBarConfig.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--HealthBarConfig.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							HealthBarConfig.Interpreter_intStackSize -= 2;
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
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--HealthBarConfig.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--HealthBarConfig.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--HealthBarConfig.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
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
							ScriptFrame.method1178(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class176.method3762();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							AbstractWorldMapIcon.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = AbstractWorldMapIcon.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							class441.method8294(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZS)I",
		garbageValue = "6451"
	)
	static int method453(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			var4 = ItemComposition.method4221(var3);
			var5 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			var6 = Timer.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = Skills.method7501(var5);
				class227.field2490 = var6.method10116(var4, var7);
				if (class227.field2490 != null) {
					Client.field809 = class72.method2202(var5);
					ReflectionCheck.field244 = class227.field2490.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class227.field2490.size();
					}
				} else {
					Client.field809 = -1;
					ReflectionCheck.field244 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				var20 = class72.method2202(var19);
				var7 = DbTable.method10109(var19);
				int var21 = Skills.method7501(var19);
				DbRowType var26 = class135.getDbRowType(var3);
				DbTableType var27 = ConcurrentMidiTask.getDbTableType(var20);
				int[] var28 = var27.types[var7];
				int var12 = 0;
				int var13 = var28.length;
				if (var21 >= 0) {
					if (var21 >= var13) {
						throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
					}

					var12 = var21;
					var13 = var21 + 1;
				}

				Object[] var14 = var26.getColumnType(var7);
				if (var14 == null && var27.defaultValues != null) {
					var14 = var27.defaultValues[var7];
				}

				int var15;
				int var16;
				if (var14 == null) {
					for (var15 = var12; var15 < var13; ++var15) {
						var16 = var28[var15];
						class555 var22 = class330.method6526(var16);
						if (var22 == class555.field5492) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class280.method5841(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class555 var18 = class330.method6526(var28[var16]);
							if (var18 == class555.field5492) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = class72.method2202(var19);
				var7 = DbTable.method10109(var19);
				DbRowType var25 = class135.getDbRowType(var3);
				DbTableType var9 = ConcurrentMidiTask.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--HealthBarConfig.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				DbTable var24 = PlayerUpdateManager.method3028(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					class227.field2490 = var24.method10116(0, 0);
					var5 = 0;
					if (class227.field2490 != null) {
						Client.field809 = var3;
						ReflectionCheck.field244 = class227.field2490.iterator();
						var5 = class227.field2490.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				DbRowType var23 = class135.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var19 = -1;
				if (class227.field2490 != null && var3 >= 0 && var3 < class227.field2490.size()) {
					var19 = (Integer)class227.field2490.get(var3);
				}

				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var4 = ItemComposition.method4221(var3);
				var5 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var6 = Timer.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (class72.method2202(var5) != Client.field809) {
					throw new RuntimeException();
				} else if (class227.field2490 == null && class227.field2490.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = Skills.method7501(var5);
					List var8 = var6.method10116(var4, var7);
					class227.field2490 = new LinkedList(class227.field2490);
					if (var8 != null) {
						class227.field2490.retainAll(var8);
					} else {
						class227.field2490.clear();
					}

					ReflectionCheck.field244 = class227.field2490.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class227.field2490.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (ReflectionCheck.field244 != null && ReflectionCheck.field244.hasNext()) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (Integer)ReflectionCheck.field244.next();
			} else {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ZI)V",
		garbageValue = "-295716124"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class376.widgetDefinition.method6930(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = class376.widgetDefinition.method6918(var3);
		if (var5 != null) {
			MilliClock.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			UrlRequester.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
