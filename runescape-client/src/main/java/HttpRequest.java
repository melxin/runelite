import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -525624951
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static AbstractSocket field50;
	@ObfuscatedName("af")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final HttpMethod field43;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ap")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("aq")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 31347639
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lau;Lsv;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method80()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method201());
			}

			this.field43 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lau;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lsv;",
		garbageValue = "0"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V",
		garbageValue = "1539917845"
	)
	@Export("setPayload")
	public void setPayload(HttpPayload var1) {
		if (!this.requestInitialized) {
			if (var1 == null) {
				this.httpHeaders.removeHeader("Content-Type");
				this.httpPayload = null;
			} else {
				this.httpPayload = var1;
				if (this.httpPayload.getContentType() != null) {
					this.httpHeaders.contentType(this.httpPayload.getContentType());
				} else {
					this.httpHeaders.removeContentType();
				}

			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field43.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field43.method70() && this.httpPayload != null) {
				this.connection.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.httpPayload.toBytes());
					var1.writeTo(this.connection.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.connection.setConnectTimeout(this.connectionTimeout);
			this.connection.setInstanceFollowRedirects(this.followRedirects);
			this.requestInitialized = true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-397843239"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lah;",
		garbageValue = "-123"
	)
	@Export("getResponse")
	HttpResponse getResponse() {
		try {
			if (!this.requestInitialized || this.connection.getResponseCode() == -1) {
				return new HttpResponse("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.connection.disconnect();
			return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
		}

		HttpResponse var3;
		try {
			HttpResponse var1 = new HttpResponse(this.connection);
			return var1;
		} catch (IOException var8) {
			var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.connection.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1979397457"
	)
	static int method98(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.width * 469894397;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.height * 1156037777;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lti;IB)Ljava/lang/Object;",
		garbageValue = "121"
	)
	public static Object method97(DynamicArray var0, int var1) {
		class374.method8144(var0);
		if (var1 >= 0 && var1 < var0.size * -1549457881) {
			Object var2 = var0.method10323(var1);
			if (var1 < var0.size * -1549457881 - 1) {
				class82.method2773(var0, var1 + 1, var0, var1, var0.size * -1549457881 - (var1 + 1));
			}

			var0.method10362(var0.size * -1549457881 - 1);
			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lct;IIIIII)V",
		garbageValue = "-992147073"
	)
	@Export("drawActor2d")
	static final void drawActor2d(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.isVisible()) {
			if (var1 instanceof NPC) {
				NPCComposition var7 = ((NPC)var1).definition;
				if (var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 == null) {
					return;
				}
			}

			int var76 = Client.playerUpdateManager.playerCount;
			int[] var8 = Client.playerUpdateManager.playerIndices;
			boolean var9 = var2 < var76;
			int var10 = -2;
			if (var1.overheadText != null && (!var9 || !var1.field1077 && (Client.publicChatMode == 4 || !var1.field1101 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				class343.method7327(var0, var1, var1.vmethod2734() + var1.method2417());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field492) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class333.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class333.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1079;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1080;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field586[Client.overheadTextCount] = var1.field1081;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method8743()) {
				class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var78 = var11.definition;
						SpritePixels var79 = var78.getBackSprite();
						SpritePixels var85 = var78.getFrontSprite();
						int var86 = 0;
						if (var79 != null && var85 != null) {
							if (var78.widthPadding * 2 < var85.subWidth) {
								var86 = var78.widthPadding;
							}

							var16 = var85.subWidth - var86 * 2;
						} else {
							var16 = var78.width;
						}

						int var83 = 255;
						boolean var87 = true;
						int var88 = Client.cycle - var12.cycle;
						int var89 = var16 * var12.health2 / var78.width;
						int var90;
						int var107;
						if (var12.cycleOffset > var88) {
							var90 = var78.field2046 == 0 ? 0 : var78.field2046 * (var88 / var78.field2046);
							var23 = var16 * var12.health / var78.width;
							var107 = var90 * (var89 - var23) / var12.cycleOffset + var23;
						} else {
							var107 = var89;
							var90 = var12.cycleOffset + var78.int5 - var88;
							if (var78.int3 >= 0) {
								var83 = (var90 << 8) / (var78.int5 - var78.int3);
							}
						}

						if (var12.health2 > 0 && var107 < 1) {
							var107 = 1;
						}

						if (var79 != null && var85 != null) {
							if (var107 == var16) {
								var107 += var86 * 2;
							} else {
								var107 += var86;
							}

							var90 = var79.subHeight;
							var10 += var90;
							var23 = var3 + Client.viewportTempX - (var16 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var86;
							if (var83 >= 0 && var83 < 255) {
								var79.drawTransAt(var23, var24, var83);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var107, var24 + var90);
								var85.drawTransAt(var23, var24, var83);
							} else {
								var79.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var107, var90 + var24);
								var85.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var90 = var3 + Client.viewportTempX - (var16 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var23, var107, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var107 + var90, var23, var16 - var107, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			if (var9 && Client.cycle == var1.playerCycle) {
				Player var93 = (Player)var1;
				boolean var77;
				if (Client.drawPlayerNames == 0) {
					var77 = false;
				} else if (var93 != HealthBarUpdate.localPlayer) {
					boolean var13 = (Client.drawPlayerNames & 4) != 0;
					boolean var14 = var13;
					boolean var15;
					if (!var13) {
						var15 = (Client.drawPlayerNames & 1) != 0;
						var14 = var15 && var93.isFriend();
					}

					var15 = var14;
					if (!var14) {
						boolean var98 = (Client.drawPlayerNames & 2) != 0;
						var15 = var98 && var93.isFriendsChatMember();
					}

					var77 = var15;
				} else {
					var77 = GrandExchangeOfferUnitPriceComparator.method8532();
				}

				if (var77) {
					Player var101 = (Player)var1;
					if (var9) {
						class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
						AbstractFont var104 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						var10 += 4;
						var104.drawCentered(var101.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
						var10 += 18;
					}
				}
			}

			if (var9) {
				Player var91 = (Player)var1;
				if (var91.isHidden) {
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) {
					class343.method7327(var0, var1, var1.defaultHeight + 15 + var1.method2417());
					if (Client.viewportTempX > -1) {
						if (var91.headIconPk != -1) {
							var10 += 25;
							ItemComposition.headIconPkSprites[var91.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var91.headIconPrayer != -1) {
							var10 += 25;
							LoginScreenAnimation.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrowType == 10 && var8[var2] == Client.hintArrowPlayerIndex) {
					class343.method7327(var0, var1, 15 + var1.defaultHeight + var1.method2417());
					if (Client.viewportTempX > -1) {
						var10 += class400.headIconHintSprites[1].subHeight;
						class400.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var92 = (NPC)var1;
				int[] var94 = var92.method2724();
				short[] var103 = var92.method2748();
				if (var103 != null && var94 != null) {
					for (int var96 = 0; var96 < var103.length; ++var96) {
						if (var103[var96] >= 0 && var94[var96] >= 0) {
							long var80 = (long)var94[var96] << 8 | (long)var103[var96];
							SpritePixels var17 = (SpritePixels)Client.field603.method9819(var80);
							if (var17 == null) {
								SpritePixels[] var18 = class463.method9400(Friend.archive8, var94[var96], 0);
								if (var18 != null && var103[var96] < var18.length) {
									var17 = var18[var103[var96]];
									Client.field603.method9834(var80, var17);
								}
							}

							if (var17 != null) {
								class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var96 + 1) * (var4 - var17.subHeight - 2) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex == var0.field1161.method9787(var2 - var76) && Client.cycle % 20 < 10) {
					class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
					if (Client.viewportTempX > -1) {
						class400.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var102 = 0; var102 < 4; ++var102) {
				int var82 = var1.hitSplatCycles[var102];
				int var95 = var1.hitSplatTypes[var102];
				HitSplatDefinition var105 = null;
				int var97 = 0;
				if (var95 >= 0) {
					if (var82 <= Client.cycle) {
						continue;
					}

					var105 = MusicPatchNode2.method7103(var1.hitSplatTypes[var102]);
					var97 = var105.field2289;
					if (var105 != null && var105.transforms != null) {
						var105 = var105.transform();
						if (var105 == null) {
							var1.hitSplatCycles[var102] = -1;
							continue;
						}
					}
				} else if (var82 < 0) {
					continue;
				}

				var16 = var1.hitSplatTypes2[var102];
				HitSplatDefinition var99 = null;
				if (var16 >= 0) {
					var99 = MusicPatchNode2.method7103(var16);
					if (var99 != null && var99.transforms != null) {
						var99 = var99.transform();
					}
				}

				if (var82 - var97 <= Client.cycle) {
					if (var105 == null) {
						var1.hitSplatCycles[var102] = -1;
					} else {
						class343.method7327(var0, var1, var1.vmethod2734() / 2 + var1.method2417());
						if (Client.viewportTempX > -1) {
							boolean var106 = true;
							if (var102 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var102 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var102 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							SpritePixels var22 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							SpritePixels var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var19 = var105.method4573();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var105.method4574();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var105.method4575();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var105.method4576();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var99 != null) {
								var31 = var99.method4573();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var99.method4574();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var99.method4575();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var99.method4576();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var84 = var105.getFont();
							if (var84 == null) {
								var84 = class342.fontPlain11;
							}

							Font var45;
							if (var99 != null) {
								var45 = var99.getFont();
								if (var45 == null) {
									var45 = class342.fontPlain11;
								}
							} else {
								var45 = class342.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var105.getString(var1.hitSplatValues[var102]);
							int var100 = var84.stringWidth(var46);
							if (var99 != null) {
								var47 = var99.getString(var1.hitSplatValues2[var102]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var100 / var24 + 1;
								}
							}

							if (var99 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var100) / 2;
							} else {
								var52 += var100;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var99 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var36 * var51;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var1.hitSplatCycles[var102] - Client.cycle;
							int var64 = var105.field2294 - var63 * var105.field2294 / var105.field2289;
							int var65 = var63 * var105.field2295 / var105.field2289 + -var105.field2295;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var105.field2297 + 15;
							int var71 = var70 - var84.maxAscent;
							int var72 = var70 + var84.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var99 != null) {
								var73 = var67 + var99.field2297 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var105.field2292 >= 0) {
								var74 = (var63 << 8) / (var105.field2289 - var105.field2292);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var84.drawAlpha(var46, var66 + var56, var70, var105.textColor, 0, var74);
								if (var99 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var59 + var66 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var99.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var75 * var24 + (var66 + var55 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var84.draw(var46, var56 + var66, var70, var105.textColor | -16777216, 0);
								if (var99 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var66 + var58 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var75 * var36 + (var60 + var66 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var99.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1067827092"
	)
	public static final void method103(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field566[var4] = true;
			}
		}

	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "615696011"
	)
	static final void method104() {
		PacketBufferNode var0 = UserComparator6.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field652 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				WorldEntityCoord.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class89.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field652 = false;
	}
}
