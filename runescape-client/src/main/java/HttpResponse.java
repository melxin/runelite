import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("al")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -62797757
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("at")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("ag")
	final Map field78;
	@ObfuscatedName("an")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field78 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field78 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-498360691"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1887299199"
	)
	public String method299() {
		return this.headerFields;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/Map;",
		garbageValue = "31110"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field78;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-127381519"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;Luw;ZII)V",
		garbageValue = "-1412508735"
	)
	static void method311(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (class217.clearLoginScreen) {
			if (var4 == 4) {
				class30.method484(4);
			}

		} else {
			if (var4 == 0) {
				class586.updateLoginStatusUsernameRemembered(var3);
			} else {
				class30.method484(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			class560.leftTitleSprite = class201.readSpritePixelsFromBytes(var5);
			WorldMapData_1.rightTitleSprite = class560.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class594.field5995.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class594.field5996.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class594.field5986.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else if ((var6 & class594.field5976.rsOrdinal()) != 0) {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "");
			} else {
				class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class208.titleboxSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			World.titlebuttonSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class311.field3509 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			TriBool.field5495 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			DirectByteArrayCopier.runesSprite = class288.getFont(var1, "runes", "");
			FadeOutTask.title_muteSprite = class288.getFont(var1, "title_mute", "");
			class456.options_buttons_0Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UserComparator6.field1577 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			WidgetConfigNode.options_buttons_2Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			HealthBarDefinition.field2048 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class164.field1862 = class456.options_buttons_0Sprite.subWidth;
			TaskHandler.field2564 = class456.options_buttons_0Sprite.subHeight * -183371056;
			class204.loginScreenRunesAnimation = new LoginScreenAnimation(DirectByteArrayCopier.runesSprite, var2.field5615);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field694 = new String[8];
				Login.field706 = 0;
			}

			class28.otpMedium = 0;
			UserComparator6.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (class468.clientPreferences.isTitleMusicDisabled()) {
				class167.method4167(0, 0);
			} else {
				class148.method3950("scape main", 255);
			}

			class179.method4284();
			JagNetThread var7 = VarbitComposition.field2279;
			var7.method8679(false);
			class217.clearLoginScreen = true;
			Login.xPadding = (class489.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			CollisionMap.loginBoxCenter = Login.loginBoxX + 180;
			class560.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapData_1.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class50.logoSprite.drawAt(Login.xPadding + 382 - class50.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "531360680"
	)
	protected static final void method314() {
		class389.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class142.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "1"
	)
	static void method313(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		Scene var4 = var0.scene;
		int var5 = 1;
		int var6 = 2;
		int var7 = 4;

		for (int var8 = 0; var8 < 4; ++var8) {
			if (var8 > 0) {
				var5 <<= 3;
				var6 <<= 3;
				var7 <<= 3;
			}

			for (int var9 = 0; var9 <= var8; ++var9) {
				for (int var10 = 0; var10 <= var2; ++var10) {
					for (int var11 = 0; var11 <= var1; ++var11) {
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int[] var10000;
						short var17;
						int var18;
						int var19;
						int var20;
						int var21;
						if ((class148.field1747[var9][var11][var10] & var5) != 0) {
							var12 = var10;
							var13 = var10;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (class148.field1747[var9][var11][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < var2 && (class148.field1747[var9][var11][var13 + 1] & var5) != 0) {
								++var13;
							}

							label186:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class148.field1747[var14 - 1][var11][var16] & var5) == 0) {
										break label186;
									}
								}

								--var14;
							}

							label175:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class148.field1747[var15 + 1][var11][var16] & var5) == 0) {
										break label175;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var11][var12] - var17;
								var19 = var3[var14][var11][var12];
								var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = class148.field1747[var20][var11];
										var10000[var21] &= ~var5;
									}
								}
							}
						}

						if ((class148.field1747[var9][var11][var10] & var6) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (class148.field1747[var9][var12 - 1][var10] & var6) != 0; --var12) {
							}

							while (var13 < var1 && (class148.field1747[var9][var13 + 1][var10] & var6) != 0) {
								++var13;
							}

							label239:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class148.field1747[var14 - 1][var16][var10] & var6) == 0) {
										break label239;
									}
								}

								--var14;
							}

							label228:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class148.field1747[var15 + 1][var16][var10] & var6) == 0) {
										break label228;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var12][var10] - var17;
								var19 = var3[var14][var12][var10];
								var4.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = class148.field1747[var20][var21];
										var10000[var10] &= ~var6;
									}
								}
							}
						}

						if ((class148.field1747[var9][var11][var10] & var7) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var10;

							for (var15 = var10; var14 > 0 && (class148.field1747[var9][var11][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (class148.field1747[var9][var11][var15 + 1] & var7) != 0) {
								++var15;
							}

							label292:
							while (var12 > 0) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((class148.field1747[var9][var12 - 1][var16] & var7) == 0) {
										break label292;
									}
								}

								--var12;
							}

							label281:
							while (var13 < var1) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((class148.field1747[var9][var13 + 1][var16] & var7) == 0) {
										break label281;
									}
								}

								++var13;
							}

							if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) {
								var16 = var3[var9][var12][var14];
								var4.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

								for (int var22 = var12; var22 <= var13; ++var22) {
									for (var18 = var14; var18 <= var15; ++var18) {
										var10000 = class148.field1747[var9][var22];
										var10000[var18] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1293624304"
	)
	static int method312(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.childIndex * 2077538819;
			return 1;
		} else {
			int var4;
			if (var0 == 1703) {
				var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				ParamComposition var7 = WorldMap.getParamDefinition(var4);
				if (var7.isString()) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.method8283(var4, var7.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.method8315(var4, var7.defaultInt);
				}

				return 1;
			} else if (var0 == 1704) {
				var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Object var5 = class39.method816(var4);
				int var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var3.method8175(var6, var5);
				return 1;
			} else if (var0 == 1707) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.method8183() ? 1 : 0;
				return 1;
			} else if (var0 == 1708) {
				return FriendSystem.method1655(var3);
			} else {
				return var0 == 1709 ? class28.method465(var3) : 2;
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([JIII)V",
		garbageValue = "980942039"
	)
	static void method307(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lut;ILut;IIB)V",
		garbageValue = "2"
	)
	static void method296(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
		if (var0.field5584 == class586.field5937) {
			System.arraycopy(var0.array, var1, var2.array, var3, var4);
		} else if (var0.field5584 == class586.field5942) {
			System.arraycopy(var0.field5590, var1, var2.field5590, var3, var4);
		} else {
			System.arraycopy(var0.field5586, var1, var2.field5586, var3, var4);
		}

	}
}
