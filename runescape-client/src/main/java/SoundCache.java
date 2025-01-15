import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bs")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field294;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	NodeHashTable field293;

	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field293 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field294 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbc;",
		garbageValue = "-1288138879"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method878(var1, var2, false);
		class53 var6 = (class53)this.field293.get(var4);
		if (var6 != null) {
			return var6.method1119();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field293.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lcn;",
		garbageValue = "-1812904405"
	)
	class53 method874(int var1, int var2) {
		long var3 = this.method878(var1, var2, true);
		class53 var5 = (class53)this.field293.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field294, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field293.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbc;",
		garbageValue = "5"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lcn;",
		garbageValue = "2081628013"
	)
	public class53 method876(int var1) {
		if (this.field294.getGroupCount() == 1) {
			return this.method874(0, var1);
		} else if (this.field294.getGroupFileCount(var1) == 1) {
			return this.method874(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lbc;",
		garbageValue = "2051084819"
	)
	public RawSound method888(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-1650709308"
	)
	long method878(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lff;FZB)F",
		garbageValue = "92"
	)
	static float method895(class136 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3455() != 0) {
			float var4 = (float)var0.field1573[0].field1528;
			float var5 = (float)var0.field1573[var0.method3455() - 1].field1528;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1573[0].field1527;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1572 == class134.field1563) {
						if (var9 != 0.0F) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1572 != class134.field1559 && var0.field1572 != class134.field1560) {
						if (var0.field1572 == class134.field1557) {
							var10 = var4 - var1;
							var13 = var0.field1573[0].field1531;
							var14 = var0.field1573[0].field1529;
							var3 = var0.field1573[0].field1527;
							if (var13 != 0.0F) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1574 == class134.field1563) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1574 != class134.field1559 && var0.field1574 != class134.field1560) {
					if (var0.field1574 == class134.field1557) {
						var10 = var1 - var5;
						var13 = var0.field1573[var0.method3455() - 1].field1530;
						var14 = var0.field1573[var0.method3455() - 1].field1526;
						var3 = var0.field1573[var0.method3455() - 1].field1527;
						if (0.0F != var13) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = class149.method3585(var0, var10);
				float var15;
				if (var2 && var0.field1572 == class134.field1560) {
					var15 = var0.field1573[var0.method3455() - 1].field1527 - var0.field1573[0].field1527;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1574 == class134.field1560) {
					var15 = var0.field1573[var0.method3455() - 1].field1527 - var0.field1573[0].field1527;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-84"
	)
	static final void method897(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		Interpreter.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZS)I",
		garbageValue = "19493"
	)
	static int method896(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.method7433() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			return HttpRequest.method112(var3);
		} else if (var0 == 2709) {
			var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			return WorldMapCacheName.method6467(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "601935983"
	)
	static int method872(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
			Interpreter.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			Decimator.performPlayerAnimation(ModeWhere.localPlayer, Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field862) {
				Interpreter.field850 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				var15 = 0;
				if (class426.isNumber(var7)) {
					var15 = class278.method5972(var7);
				}

				PacketBufferNode var13 = ScriptEvent.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					var11 = ScriptEvent.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					var11 = ScriptEvent.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
						AbstractWorldMapIcon.method6463(var3, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						ScriptFrame.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
						Widget var14 = ClanChannel.widgetDefinition.method7031(var9);
						WorldMapLabel.clickWidget(var14, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
						WorldMapLabel.clickWidget(var12, var3, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						KeyHandler.mouseCam = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class544.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						WorldMapRectangle.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var11 = ScriptEvent.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						HealthBarConfig.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[HealthBarConfig.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ScriptEvent.getPacketBufferNode(ClientPacket.BUG_REPORT, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + MouseRecorder.stringCp1252NullTerminatedByteSize(var4) + MouseRecorder.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeByteAdd(var3);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--ScriptFrame.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						SecureRandomFuture.setTapToDrop(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--ScriptFrame.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = BuddyRankComparator.canvasWidth;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Huffman.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--ScriptFrame.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field665 = 3;
						Client.field707 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field665 = 2;
						Client.field707 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field665 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field665 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field665 = 3;
						Client.field707 = var2 ? class134.scriptDotWidget.id : HttpMethod.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							class544.clientPreferences.updateHideUsername(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var10;
							if (!var10) {
								class544.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							class544.clientPreferences.updateTitleMusicDisabled(!var10);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class544.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class254.method5409();
							return 1;
						} else if (var0 == 3155) {
							--HealthBarConfig.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--ScriptFrame.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--ScriptFrame.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--HealthBarConfig.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--ScriptFrame.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--ScriptFrame.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							ScriptFrame.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--ScriptFrame.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--ScriptFrame.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--ScriptFrame.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--HealthBarConfig.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--HealthBarConfig.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class140.method3504(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = method893();
							return 1;
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							class544.clientPreferences.setDrawDistance(var3);
							return 1;
						} else if (var0 == 3186) {
							var3 = class544.clientPreferences.getDrawDistance();
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3;
							return 1;
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
							class353.method7037(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1159973217"
	)
	static void method881() {
		for (class268 var0 = (class268)Client.field709.last(); var0 != null; var0 = (class268)Client.field709.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	static final int method893() {
		float var0 = 200.0F * ((float)class544.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvr;",
		garbageValue = "20"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(HitSplatDefinition.field2777, class244.method5288(var0), class384.method7653(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
