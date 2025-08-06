import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lp")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1774097993
	)
	static int field3345;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = 1054088091
	)
	static int field3343;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 981328529
	)
	@Export("type")
	final int type;
	@ObfuscatedName("as")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Llp;",
		garbageValue = "2067226370"
	)
	static WorldMapSectionType[] method6752() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "22"
	)
	static int method6756(int var0, Script var1, boolean var2) {
		Widget var3;
		int var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			var3 = class167.widgetDefinition.method7456(var4);
		} else {
			var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			int var15 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class364 var16 = var3.method7935();
				if (var16 != null && var16.method7589(var4, var15)) {
					ApproximateRouteStrategy.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var4;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var15;
				if (var3.scrollY > var3.scrollHeight - var3.height * -1326764757) {
					var3.scrollY = var3.scrollHeight - var3.height * -1326764757;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				ApproximateRouteStrategy.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 5];
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			if (var4 != var3.sequenceId) {
				var3.sequenceId = var4;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				ApproximateRouteStrategy.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			ApproximateRouteStrategy.invalidateWidget(var3);
			return 1;
		} else {
			String var17;
			class364 var18;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var17 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				if (var3.type == 12) {
					var18 = var3.method7935();
					if (var18 != null && var18.method7797()) {
						var18.method7582(var17);
					} else {
						var3.text = var17;
					}

					ApproximateRouteStrategy.invalidateWidget(var3);
				} else if (!var17.equals(var3.text)) {
					var3.text = var17;
					ApproximateRouteStrategy.invalidateWidget(var3);
				}

				return 1;
			} else {
				class364 var21;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (var3.type == 12) {
						var21 = var3.method7935();
						if (var21 != null) {
							var21.method7688();
						}
					}

					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var21 = var3.method7935();
						if (var21 != null) {
							var21.method7590(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
							var21.method7591(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					}

					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					ApproximateRouteStrategy.invalidateWidget(var3);
					if (var3.type == 0) {
						Widget[] var23 = var3.childIndex * -64977777 == -1 ? class167.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class167.widgetDefinition.method7456(var3.parentId).children;
						Tiles.revalidateWidgetScroll(var23, var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class66.resumePauseWidget(var3.id, var3.childIndex * -64977777);
					Client.meslayerContinueWidget = var3;
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ApproximateRouteStrategy.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					FillMode var19 = (FillMode)HealthBarConfig.findEnumerated(WorldMapIcon_1.FillMode_values(), var4);
					if (var19 != null) {
						var3.fillMode = var19;
						ApproximateRouteStrategy.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
						var3.field4109 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field4069 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
						ApproximateRouteStrategy.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7910((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], "", class203.urlRequester, class344.getUserId());
						return 1;
					} else if (var0 == 1131) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
						var3.method8025(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7946((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
						return 1;
					} else {
						class358 var22;
						if (var0 == 1133) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var22 = var3.method7970();
							if (var22 != null) {
								var22.field3966 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var22 = var3.method7970();
							if (var22 != null) {
								var22.field3962 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							var21 = var3.method7935();
							if (var21 != null) {
								var3.text2 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var22 = var3.method7970();
							if (var22 != null) {
								var22.field3963 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null && var21.method7586(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize])) {
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null && var21.method7829(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize])) {
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null && var21.method7588(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize])) {
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							Client.field344.method6081();
							var18 = var3.method7935();
							if (var18 != null && var18.method7580(var14)) {
								if (var14) {
									Client.field344.method6079(var3);
								}

								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field344.method6055() == var3) {
								Client.field344.method6081();
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							var18 = var3.method7935();
							if (var18 != null) {
								var18.method7581(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var21 = var3.method7935();
							if (var21 != null && var21.method7601(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1])) {
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null && var21.method7601(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize])) {
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null) {
								var21.method7729(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null) {
								var21.method7628(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null) {
								var21.method7592(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							var21 = var3.method7935();
							if (var21 != null) {
								var21.method7644(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
								ApproximateRouteStrategy.invalidateWidget(var3);
							}

							return 1;
						} else {
							class28 var20;
							if (var0 == 1148) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
								var20 = var3.method8041();
								if (var20 != null) {
									var20.method420(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
								var20 = var3.method8041();
								if (var20 != null) {
									var20.method442((char)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7912((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], class203.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								SecureRandomFuture.Interpreter_objectStackSize -= 3;
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
								String var13 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								String var6 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 2];
								long var7 = class344.getUserId();
								long var9 = class360.getUserHash();
								String var11 = WorldMapSection2.getPlatformInfo().getDeviceId(WorldMapSection2.getPlatformInfo().os);
								if (var7 != -1L) {
									var17 = var17.replaceAll("%userid%", Long.toString(var7));
								}

								if (-1L != var9) {
									var17 = var17.replaceAll("%userhash%", Long.toString(var9));
								}

								if (!var11.isEmpty()) {
									var17 = var17.replaceAll("%deviceid%", var11);
								}

								var3.method7911(var17, var13, var6, var11, Long.toString(var9), class203.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class254 var12 = var3.method7924();
									boolean var5 = var12 != null && var12.method5814() && class190.method4289().method5939(var12.method5822());
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != FriendSystem.clientPreferences.getMusicVolume()) {
			if (FriendSystem.clientPreferences.getMusicVolume() == 0 && UserComparator9.method3532()) {
				GrandExchangeOfferUnitPriceComparator.method8561(MoveSpeed.field3199, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				class267.method6028(0, 0);
				Client.playingJingle = false;
			} else if (!class337.midiRequests.isEmpty()) {
				Iterator var1 = class337.midiRequests.iterator();

				while (var1.hasNext()) {
					MidiRequest var2 = (MidiRequest)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MidiRequest var3 = (MidiRequest)class337.midiRequests.get(0);
				if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3914) {
					var3.midiPcmStream.setPcmStreamVolume(var0);
					var3.field3912 = (float)var0;
				}
			}

			FriendSystem.clientPreferences.updateMusicVolume(var0);
		}

	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static final void method6762() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)class7.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.method2190();
				}
			}
		}

	}
}
