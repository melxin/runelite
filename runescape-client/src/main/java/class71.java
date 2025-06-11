import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class71 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;Ltx;ZII)V",
		garbageValue = "1550955576"
	)
	static void method2214(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Projection.clearLoginScreen) {
			if (var4 == 4) {
				class85.method2689(4);
			}

		} else {
			if (var4 == 0) {
				class177.updateLoginStatusUsernameRemembered(var3);
			} else {
				class85.method2689(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			InterfaceParent.leftTitleSprite = Tile.readSpritePixelsFromBytes(var5);
			UserComparator4.rightTitleSprite = InterfaceParent.leftTitleSprite.mirrorHorizontally();
			class378.method7920(var1, Client.worldProperties);
			class173.titleboxSprite = class404.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class131.titlebuttonSprite = class404.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field747 = class404.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			FileSystem.field2442 = class404.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class404.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class7.runesSprite = PlayerComposition.getFont(var1, "runes", "");
			WorldMapSection1.title_muteSprite = PlayerComposition.getFont(var1, "title_mute", "");
			class164.options_buttons_0Sprite = class404.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			ApproximateRouteStrategy.field270 = class404.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class82.options_buttons_2Sprite = class404.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			GameEngine.field181 = class404.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			PacketBufferNode.field3497 = class164.options_buttons_0Sprite.subWidth;
			class441.field4947 = class164.options_buttons_0Sprite.subHeight;
			class584.loginScreenRunesAnimation = new LoginScreenAnimation(class7.runesSprite, var2.field5317);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field757 = new String[8];
				Login.field744 = 0;
			}

			PcmPlayer.otpMedium = 0;
			class82.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			LoginState.method761();
			class153.method3696();
			JagNetThread var6 = class330.field3669;
			var6.method8187(false);
			Projection.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			WorldMapData_0.loginBoxCenter = Login.loginBoxX + 180;
			InterfaceParent.leftTitleSprite.drawAt(Login.xPadding, 0);
			UserComparator4.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class348.logoSprite.drawAt(Login.xPadding + 382 - class348.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIIB)V",
		garbageValue = "110"
	)
	static void method2213(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = class330.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method2668();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method3919() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method3921() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field1885 = var9;
						var12.field1886 = null;
					}

					var11.method2669(var12);
					break;
				}
			}

			WorldMapRectangle.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lov;II)I",
		garbageValue = "-1769195292"
	)
	static final int method2212(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ClientPreferences.widgetDefinition.method7286(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!SceneTilePaint.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class152.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ClientPreferences.widgetDefinition.method7286(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!SceneTilePaint.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class4.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class152.localPlayer.x >> 7) + Sound.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (class152.localPlayer.y >> 7) + Sound.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
