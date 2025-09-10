import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("km")
public class class267 {
	@ObfuscatedName("pd")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("aw")
	ArrayList field3162;
	@ObfuscatedName("at")
	ArrayList field3165;
	@ObfuscatedName("ac")
	ArrayList field3163;
	@ObfuscatedName("ap")
	String field3164;
	@ObfuscatedName("aq")
	float[] field3171;
	@ObfuscatedName("ao")
	Map field3160;
	@ObfuscatedName("as")
	Map field3169;
	@ObfuscatedName("al")
	String field3168;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1614126997
	)
	int field3166;

	class267() {
		this.field3162 = new ArrayList();
		this.field3165 = new ArrayList();
		this.field3163 = new ArrayList();
		this.field3164 = null;
		this.field3171 = new float[4];
		this.field3160 = new HashMap();
		this.field3169 = new HashMap();
		this.field3166 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1785254874"
	)
	String method5996() {
		return this.field3168;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method6005() {
		return this.field3166;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	void method5998() {
		this.field3164 = null;
		this.field3171[0] = 0.0F;
		this.field3171[1] = 0.0F;
		this.field3171[2] = 1.0F;
		this.field3171[3] = 1.0F;
		this.field3162.clear();
		this.field3165.clear();
		this.field3163.clear();
		this.field3160.clear();
		this.field3169.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
		garbageValue = "-2093080640"
	)
	boolean method5999(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method5998();
				return false;
			}

			try {
				this.method6000(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field3165.clear();
			}

			try {
				this.method6002(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field3163.clear();
			}
		} else {
			try {
				this.method6022(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field3165.clear();
			}

			try {
				this.method5997(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field3163.clear();
			}
		}

		try {
			this.method6004(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field3164 = null;
			this.field3171[0] = 0.0F;
			this.field3171[1] = 0.0F;
			this.field3171[2] = 1.0F;
			this.field3171[3] = 1.0F;
			this.field3162.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method6029(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field3160.clear();
			this.field3169.clear();
		}

		if (var2 == 2) {
			try {
				this.field3168 = var4.getString("id");
				this.field3166 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-666105600"
	)
	void method6000(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class257 var5 = new class257(this);
					var5.field3088 = var2.request(new URL(var4.getString("src")));
					var5.field3086 = class173.method4097(var4, "placement");
					this.field3165.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lel;I)V",
		garbageValue = "-56418049"
	)
	void method6022(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class257 var3 = new class257(this);
			var3.field3088 = var2.request(new URL(var1.getString("src")));
			var3.field3086 = class173.method4097(var1, "placement");
			this.field3165.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "614781638"
	)
	void method6002(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class268 var4 = new class268(this);
				var4.field3173 = var3.getString("text");
				var4.field3175 = class200.method4402(var3.getString("align_x"));
				var4.field3176 = class200.method4402(var3.getString("align_y"));
				var4.field3177 = var3.getInt("font");
				var4.field3178 = class173.method4097(var3, "placement");
				this.field3163.add(var4);
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "4"
	)
	void method5997(JSONObject var1) throws JSONException {
		class268 var2 = new class268(this);
		var2.field3173 = var1.optString("text");
		var2.field3175 = class200.method4402(var1.optString("align_x"));
		var2.field3176 = class200.method4402(var1.optString("align_y"));
		var2.field3177 = var1.optInt("font");
		var2.field3178 = class173.method4097(var1, "placement");
		this.field3163.add(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1250768624"
	)
	void method6004(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field3171 = class173.method4097(var1, "clickbounds");
			this.field3164 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field3162.add(new class255(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field3162.add(new class255(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field3162.add(new class255(this, var2[var3], 0));
							} else {
								this.field3162.add(new class264(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1514932381"
	)
	void method6029(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field3160.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field3160.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field3160.put(var2[var3], 0);
					} else {
						this.field3169.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbl;Lrv;Lrv;B)V",
		garbageValue = "43"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		int var33;
		int var34;
		boolean var43;
		if (Login.worldSelectOpen) {
			IndexCheck var32 = Client.indexCheck;
			IndexCheck var4 = var32;

			while (true) {
				if (!var4.method6121()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class423.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					var5 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(0, 1);
						break;
					}

					var33 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var33 && MouseHandler.MouseHandler_lastPressedX <= var33 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var33 + 15 && MouseHandler.MouseHandler_lastPressedX <= var33 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(1, 1);
						break;
					}

					var34 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var34 && MouseHandler.MouseHandler_lastPressedX <= var34 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var34 + 15 && MouseHandler.MouseHandler_lastPressedX <= var34 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(2, 1);
						break;
					}

					int var35 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						ParamComposition.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						class521.method10431();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var36 = World.World_worlds[Login.hoveredWorldIndex];
						var43 = WorldEntity.method10134(Client.worldProperties, class582.field5865);
						boolean var44 = var36.isDeadman();
						class509.field5441 = var44;
						var36.field638 = var44 ? "beta" : var36.field638;
						VerticalAlignment.changeWorld(var36);
						class521.method10431();
						if (var44 != var43) {
							class173.method4099();
						}
					} else {
						if (Login.worldSelectPage > 0 && WorldMapData_1.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapData_1.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class396.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class396.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class411.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class411.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class396.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class396.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var4.field3212 == 13) {
					class521.method10431();
					break;
				}

				if (var4.field3212 == 96) {
					if (Login.worldSelectPage > 0 && WorldMapData_1.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var4.field3212 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class411.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				class36.clientPreferences.updateTitleMusicDisabled(!class36.clientPreferences.isTitleMusicDisabled());
				if (class36.clientPreferences.isTitleMusicDisabled()) {
					class257.method5884(0, 0);
				} else {
					class257.method5884(0, 0);
					ArrayList var3 = new ArrayList();
					var3.add(new MidiRequest(WidgetDefinition.field4042, "scape main", "", 255, false));
					Clock.method6081(var3, 0, 0, 0, 100, false);
				}

				class159.method3892();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field757) {
					Login.field757 = class189.method4284() + 1000L;
				}

				long var21 = class189.method4284();
				if (PacketWriter.method2956() && Login.field734 == -1L) {
					Login.field734 = var21;
					if (Login.field734 > Login.field757) {
						Login.field757 = Login.field734;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == ViewportMouse.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) {
								if (ScriptEvent.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (World.World_request != null && ScriptEvent.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var33 = MouseHandler.MouseHandler_lastPressedX;
					var34 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var33 = MouseHandler.MouseHandler_x;
						var34 = MouseHandler.MouseHandler_y;
					}

					if (!class423.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var23 = Client.indexCheck;
					IndexCheck var9 = var23;
					short var38;
					int var39;
					if (Login.loginIndex == 0) {
						var43 = false;

						while (var9.method6121()) {
							if (var9.field3212 == 84) {
								var43 = true;
							}
						}

						var39 = class294.loginBoxCenter - 80;
						var38 = 291;
						if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
							DevicePcmPlayerProvider.openURL(FloorOverlayDefinition.method4756("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var39 = class294.loginBoxCenter + 80;
						if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20 || var43) {
							class38.method742();
						}
					} else if (Login.loginIndex == 1) {
						var43 = class521.client.containsAccessAndRefreshToken() || class521.client.otlTokenRequesterInitialized() || class521.client.containsSessionAndCharacterId();

						while (var9.method6121()) {
							if (var9.field3212 == 84) {
								if (var43) {
									MouseRecorder.setLoginResponseString("", "Connecting to server...", "");
									Client.field330 = class595.field5974;
									class325.method7035(false);
									UrlRequest.updateGameState(20);
								} else {
									class265.Login_promptCredentials(false);
								}

								return;
							}

							if (var9.field3212 == 13) {
								Varps.updateLoginStatusUsernameRemembered(true);
								return;
							}
						}

						var39 = class294.loginBoxCenter - 80;
						var38 = 321;
						if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
							if (var43) {
								MouseRecorder.setLoginResponseString("", "Connecting to server...", "");
								Client.field330 = class595.field5974;
								class325.method7035(false);
								UrlRequest.updateGameState(20);
							} else {
								class265.Login_promptCredentials(false);
							}

							return;
						}

						var39 = class294.loginBoxCenter + 80;
						if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
							Varps.updateLoginStatusUsernameRemembered(true);
							return;
						}
					} else {
						int var10;
						short var37;
						boolean var40;
						if (Login.loginIndex == 2) {
							var37 = 201;
							var10 = var37 + 52;
							if (var5 == 1 && var34 >= var10 - 12 && var34 < var10 + 2) {
								Login.currentLoginField = 0;
							}

							var10 += 15;
							if (var5 == 1 && var34 >= var10 - 12 && var34 < var10 + 2) {
								Login.currentLoginField = 1;
							}

							var10 += 15;
							var37 = 361;
							if (AbstractSocket.field5447 != null) {
								var39 = AbstractSocket.field5447.highX / 2;
								if (var5 == 1 && var33 >= AbstractSocket.field5447.lowX - var39 && var33 <= var39 + AbstractSocket.field5447.lowX && var34 >= var37 - 15 && var34 < var37) {
									switch(Login.field735) {
									case 1:
										DevicePcmPlayerProvider.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									case 2:
										DevicePcmPlayerProvider.openURL("https://support.runescape.com/hc/en-gb", true, false);
									}
								}
							}

							var39 = class294.loginBoxCenter - 80;
							var38 = 321;
							if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
								class137.method3665();
								return;
							}

							var39 = Login.loginBoxX + 180 + 80;
							if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
								ClientPreferences.method2677(0);
								Login.Login_username = "";
								Login.Login_password = "";
								class38.otpMedium = 0;
								class464.otp = "";
								Login.rememberUsername = true;
							}

							var39 = class294.loginBoxCenter + -117;
							var38 = 277;
							Login.field727 = var33 >= var39 && var33 < var39 + class33.field174 && var34 >= var38 && var34 < var38 + class537.field5577;
							if (var5 == 1 && Login.field727) {
								Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
								if (!Client.Login_isUsernameRemembered && class36.clientPreferences.getRememberedUsername() != null) {
									class36.clientPreferences.updateRememberedUsername((String)null);
								}
							}

							var39 = class294.loginBoxCenter + 24;
							var38 = 277;
							Login.field749 = var33 >= var39 && var33 < var39 + class33.field174 && var34 >= var38 && var34 < var38 + class537.field5577;
							if (var5 == 1 && Login.field749) {
								class36.clientPreferences.updateHideUsername(!class36.clientPreferences.isUsernameHidden());
								if (!class36.clientPreferences.isUsernameHidden()) {
									Login.Login_username = "";
									class36.clientPreferences.updateRememberedUsername((String)null);
									if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
										Login.currentLoginField = 1;
									} else {
										Login.currentLoginField = 0;
									}
								}
							}

							label1506:
							while (true) {
								int var42;
								Transferable var46;
								do {
									while (true) {
										char var41;
										label1470:
										do {
											while (true) {
												while (var9.method6121()) {
													if (var9.field3212 != 13) {
														if (Login.currentLoginField != 0) {
															continue label1470;
														}

														HttpMethod.method84(var9.field3215);
														if (var9.field3212 == 85 && !Login.Login_username.isEmpty()) {
															Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
														}

														if (var9.field3212 == 84 || var9.field3212 == 80) {
															Login.currentLoginField = 1;
														}

														var41 = var9.field3215;
														var40 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1;
														if (var40 && Login.Login_username.length() < 320) {
															Login.Login_username = Login.Login_username + var9.field3215;
														}
													} else {
														ClientPreferences.method2677(0);
														Login.Login_username = "";
														Login.Login_password = "";
														class38.otpMedium = 0;
														class464.otp = "";
														Login.rememberUsername = true;
													}
												}

												return;
											}
										} while(Login.currentLoginField != 1);

										if (var9.field3212 == 85 && !Login.Login_password.isEmpty()) {
											Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
										} else if (var9.field3212 == 84 || var9.field3212 == 80) {
											Login.currentLoginField = 0;
											if (var9.field3212 == 84) {
												class137.method3665();
												return;
											}
										}

										if ((var9.isValidIndexInRange(82) || var9.isValidIndexInRange(87)) && var9.field3212 == 67) {
											Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var46 = var45.getContents(class521.client);
											var42 = 20 - Login.Login_password.length();
											break;
										}

										if (MusicPatchNode2.method7102(var9.field3215)) {
											var41 = var9.field3215;
											var40 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1;
											if (var40 && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var9.field3215;
											}
										}
									}
								} while(var42 <= 0);

								try {
									String var16 = (String)var46.getTransferData(DataFlavor.stringFlavor);
									int var17 = Math.min(var42, var16.length());
									int var18 = 0;

									while (true) {
										if (var18 >= var17) {
											Login.Login_password = Login.Login_password + var16.substring(0, var17);
											continue label1506;
										}

										if (!MusicPatchNode2.method7102(var16.charAt(var18))) {
											break;
										}

										char var20 = var16.charAt(var18);
										boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
										if (!var19) {
											break;
										}

										++var18;
									}

									ClientPreferences.method2677(3);
									return;
								} catch (UnsupportedFlavorException var30) {
								} catch (IOException var31) {
								}
							}
						} else {
							short var11;
							Bounds var26;
							if (Login.loginIndex == 3) {
								var10 = Login.loginBoxX + 180;
								var11 = 241;
								var26 = var1.method9419(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
								if (var5 == 1 && var26.method8976(var33, var34)) {
									DevicePcmPlayerProvider.openURL("https://oldschool.runescape.com/launcher", true, false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 276;
								if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
									Varps.updateLoginStatusUsernameRemembered(false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 326;
								if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
									DevicePcmPlayerProvider.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									return;
								}
							} else {
								int var13;
								if (Login.loginIndex == 4) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
										class41.method782();
										return;
									}

									if (var5 == 1 && var33 >= Login.loginBoxX + 180 - 9 && var33 <= Login.loginBoxX + 180 + 130 && var34 >= 263 && var34 <= 296) {
										Login.rememberUsername = !Login.rememberUsername;
									}

									if (var5 == 1 && var33 >= Login.loginBoxX + 180 - 34 && var33 <= Login.loginBoxX + 34 + 180 && var34 >= 351 && var34 <= 363) {
										DevicePcmPlayerProvider.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
										ClientPreferences.method2677(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class38.otpMedium = 0;
										class464.otp = "";
									}

									while (var9.method6121()) {
										boolean var12 = false;

										for (var13 = 0; var13 < "1234567890".length(); ++var13) {
											if (var9.field3215 == "1234567890".charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var9.field3212 == 13) {
											ClientPreferences.method2677(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class38.otpMedium = 0;
											class464.otp = "";
										} else {
											if (var9.field3212 == 85 && !class464.otp.isEmpty()) {
												class464.otp = class464.otp.substring(0, class464.otp.length() - 1);
											}

											if (var9.field3212 == 84) {
												class41.method782();
												return;
											}

											if (var12 && class464.otp.length() < 6) {
												class464.otp = class464.otp + var9.field3215;
											}
										}
									}
								} else {
									int var14;
									if (Login.loginIndex == 5) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
											InterfaceParent.method2132();
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
											class265.Login_promptCredentials(true);
										}

										var38 = 361;
										if (class537.field5585 != null) {
											var13 = class537.field5585.highX / 2;
											if (var5 == 1 && var33 >= class537.field5585.lowX - var13 && var33 <= var13 + class537.field5585.lowX && var34 >= var38 - 15 && var34 < var38) {
												DevicePcmPlayerProvider.openURL(FloorOverlayDefinition.method4756("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var9.method6121()) {
											var40 = false;

											for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
												if (var9.field3215 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
													var40 = true;
													break;
												}
											}

											if (var9.field3212 == 13) {
												class265.Login_promptCredentials(true);
											} else {
												if (var9.field3212 == 85 && !Login.Login_username.isEmpty()) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var9.field3212 == 84) {
													InterfaceParent.method2132();
													return;
												}

												if (var40 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var9.field3215;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (class563.field5781 && !Client.onMobile) {
												var10 = class294.loginBoxCenter - 150;
												var39 = var10 + 40 + 240 + 25;
												var38 = 231;
												var13 = var38 + 40;
												if (var5 == 1 && var33 >= var10 && var33 <= var39 && var34 >= var38 && var34 <= var13) {
													Login.field738 = class183.method4178(var10, var33);
												}

												var14 = Login.loginBoxX + 180 - 80;
												short var15 = 321;
												boolean var27;
												if (var5 == 1 && var33 >= var14 - 75 && var33 <= var14 + 75 && var34 >= var15 - 20 && var34 <= var15 + 20) {
													var27 = HttpContentType.method10482();
													if (var27) {
														UrlRequest.updateGameState(50);
														return;
													}
												}

												var14 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var33 >= var14 - 75 && var33 <= var14 + 75 && var34 >= var15 - 20 && var34 <= var15 + 20) {
													Login.field739 = new String[8];
													class265.Login_promptCredentials(true);
												}

												while (var9.method6121()) {
													if (var9.field3212 == 101) {
														Login.field739[Login.field738] = null;
													}

													if (var9.field3212 == 85) {
														if (Login.field739[Login.field738] == null && Login.field738 > 0) {
															--Login.field738;
														}

														Login.field739[Login.field738] = null;
													}

													if (var9.field3215 >= '0' && var9.field3215 <= '9') {
														Login.field739[Login.field738] = "" + var9.field3215;
														if (Login.field738 < 7) {
															++Login.field738;
														}
													}

													if (var9.field3212 == 84) {
														var27 = HttpContentType.method10482();
														if (var27) {
															UrlRequest.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
													DevicePcmPlayerProvider.openURL(FloorOverlayDefinition.method4756("secure", true) + "m=dob/set_dob.ws", true, false);
													MouseRecorder.setLoginResponseString("", "Page has opened in the browser.", "");
													ClientPreferences.method2677(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
													class265.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												DevicePcmPlayerProvider.openURL("https://www.jagex.com/terms/privacy", true, false);
												MouseRecorder.setLoginResponseString("", "Page has opened in the browser.", "");
												ClientPreferences.method2677(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												class265.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var10 = Login.loginBoxX + 180;
											var11 = 311;
											if (var23.field3212 == 84 || var23.field3212 == 13 || var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												Varps.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var10 = Login.loginBoxX + 180;
											var11 = 209;
											if (var23.field3212 == 84 || var5 == 1 && var33 >= var10 - 109 && var33 <= var10 + 109 && var34 >= var11 && var34 <= var11 + 68) {
												if (KeyHandler.method399()) {
													return;
												}

												MouseRecorder.setLoginResponseString("", "Connecting to server...", "");
												Client.field330 = class595.field5974;
												class325.method7035(false);
												UrlRequest.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var10 = class294.loginBoxCenter;
											var11 = 233;
											var26 = var2.method9419(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var24 = var2.method9419(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var25 = var2.method9419(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											var39 = var11 + 17;
											Bounds var28 = var2.method9419(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var39);
											if (var5 == 1) {
												if (var26.method8976(var33, var34)) {
													DevicePcmPlayerProvider.openURL("https://www.jagex.com/terms", true, false);
												} else if (var24.method8976(var33, var34)) {
													DevicePcmPlayerProvider.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var25.method8976(var33, var34) || var28.method8976(var33, var34)) {
													DevicePcmPlayerProvider.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = class294.loginBoxCenter - 80;
											var11 = 311;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												class36.clientPreferences.method2627(Client.field388);
												Varps.updateLoginStatusUsernameRemembered(true);
											}

											var10 = class294.loginBoxCenter + 80;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var10 = class294.loginBoxCenter;
											var11 = 321;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												Varps.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var29 = "";
											switch(Login.Login_banType) {
											case 0:
												var29 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var29 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var29 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class265.Login_promptCredentials(false);
											}

											var39 = Login.loginBoxX + 180;
											var38 = 276;
											if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
												DevicePcmPlayerProvider.openURL(var29, true, false);
												MouseRecorder.setLoginResponseString("", "Page has opened in the browser.", "");
												ClientPreferences.method2677(6);
												return;
											}

											var39 = Login.loginBoxX + 180;
											var38 = 326;
											if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
												class265.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var10 = Login.loginBoxX + 180;
											var11 = 301;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												Varps.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												DevicePcmPlayerProvider.openURL(FloorOverlayDefinition.method4756("secure", true) + "m=dob/set_dob.ws", true, false);
												MouseRecorder.setLoginResponseString("", "Page has opened in the browser.", "");
												ClientPreferences.method2677(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												class265.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												DevicePcmPlayerProvider.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												class265.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 34) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												if (ScriptEvent.loadWorlds()) {
													Login.worldSelectOpen = true;
													Login.worldSelectPage = 0;
													Login.worldSelectPagesCount = 0;
												}

												return;
											}

											if (World.World_request != null && ScriptEvent.loadWorlds()) {
												Login.worldSelectOpen = true;
												Login.worldSelectPage = 0;
												Login.worldSelectPagesCount = 0;
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
												class265.Login_promptCredentials(false);
											}
										}
									} else {
										while (true) {
											do {
												if (!var9.method6121()) {
													var37 = 321;
													if (var5 == 1 && var34 >= var37 - 20 && var34 <= var37 + 20) {
														class265.Login_promptCredentials(true);
													}

													return;
												}
											} while(var9.field3212 != 84 && var9.field3212 != 13);

											class265.Login_promptCredentials(true);
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}
}
