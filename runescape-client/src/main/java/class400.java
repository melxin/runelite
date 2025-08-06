import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
public class class400 {
	@ObfuscatedName("pz")
	static int[][] field4760;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Lbd;",
		garbageValue = "1137935261"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZS)I",
		garbageValue = "-3244"
	)
	static int method8269(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class364 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7935();
					if (var7 != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.method7624().method9267();
						return 1;
					}
				}

				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class358 var4;
				if (var0 == 1617) {
					var4 = var3.method7970();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 != null ? var4.field3966 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7970();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 != null ? var4.field3962 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7935();
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7664().method9267() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7970();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 != null ? var4.field3963 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7935();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7635() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7935();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7636() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7935();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7637() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7935();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null && var7.method7753() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7935();
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7626().method9531() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7935();
						int var5 = var7 != null ? var7.method7631() : 0;
						int var6 = var7 != null ? var7.method7630() : 0;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7935();
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7630() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7935();
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7640() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7935();
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7795() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7935();
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7642() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7935();
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? var7.method7639() : 0;
						return 1;
					} else {
						class28 var8;
						if (var0 == 1633) {
							var8 = var3.method8041();
							Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var8 != null ? var8.method422(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method8041();
							Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var8 != null ? var8.method423((char)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7935();
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null && var7.method7611() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIB)V",
		garbageValue = "10"
	)
	static final void method8270(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1150.method9810(); ++var10) {
			Actor var23;
			if (var10 < var8) {
				var23 = (Actor)var0.players.get((long)var9[var10]);
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == class27.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = (Actor)var0.npcs.get((long)var0.field1150.method9817(var10 - var8));
			}

			class281.drawActor2d(var0, var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			class281.drawActor2d(var0, class27.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			class281.drawActor2d(var0, (Actor)var0.players.get((long)Client.combatTargetPlayerIndex), var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < Client.overheadTextCount; ++var10) {
			int var11 = Client.overheadTextXs[var10];
			int var12 = Client.overheadTextYs[var10];
			int var13 = Client.overheadTextXOffsets[var10];
			int var14 = Client.overheadTextAscents[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXOffsets[var22] + Client.overheadTextXs[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
						var12 = Client.overheadTextYs[var22] - Client.overheadTextAscents[var22];
						var15 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var10];
			Client.viewportTempY = Client.overheadTextYs[var10] = var12;
			String var16 = Client.overheadText[var10];
			if (Client.chatEffects == 0) {
				int var17 = 16776960;
				if (Client.overheadTextColors[var10] < 6) {
					var17 = Client.field534[Client.overheadTextColors[var10]];
				}

				if (Client.overheadTextColors[var10] == 6) {
					var17 = Client.cycle % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var10] == 7) {
					var17 = Client.cycle % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var10] == 8) {
					var17 = Client.cycle % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.overheadTextColors[var10] == 9) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var10] == 10) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var10] == 11) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.overheadTextColors[var10] == 12 && Client.field478[var10] == null) {
					var18 = var16.length();
					Client.field478[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field478[var10][var19] = class533.field5484[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					HttpJsonRequestBody.fontBold12.method9437(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field478[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					HttpJsonRequestBody.fontBold12.method9452(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field478[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					HttpJsonRequestBody.fontBold12.method9435(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field478[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					HttpJsonRequestBody.fontBold12.method9440(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, 150 - Client.overheadTextCyclesRemaining[var10], Client.field478[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (HttpJsonRequestBody.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					HttpJsonRequestBody.fontBold12.method9438(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field478[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (Client.overheadTextEffects[var10] == 5) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - HttpJsonRequestBody.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					HttpJsonRequestBody.fontBold12.method9437(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field478[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				HttpJsonRequestBody.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
