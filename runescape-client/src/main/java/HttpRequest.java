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

@ObfuscatedName("ax")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("ao")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final HttpMethod field42;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("as")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("aq")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -55978685
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Lsx;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method64()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method177());
			}

			this.field42 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lap;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsx;",
		garbageValue = "-1786452918"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lth;I)V",
		garbageValue = "-2125909117"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field42.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field42.method66() && this.httpPayload != null) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1505757066"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-2146926355"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "64"
	)
	static int method95(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1004588744"
	)
	static int method99(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			ObjectComposition var4 = class162.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-266999969"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field553;
		} else if (var5 >= 100) {
			var6 = Client.field554;
		} else {
			var6 = (Client.field554 - Client.field553) * var5 / 100 + Client.field553;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field527) {
			var10 = Client.field527;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field803) {
				var6 = Client.field803;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field560) {
			var10 = Client.field560;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field557) {
				var6 = Client.field557;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class33.method492(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(ZLvu;B)V",
		garbageValue = "1"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var1.readShort();
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShort();
			int var4 = var1.readUnsignedShort();
			PacketBufferNode.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					PacketBufferNode.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class377.regions = new int[var4];
			ArchiveLoader.regionMapArchiveIds = new int[var4];
			ClanChannelMember.regionLandArchiveIds = new int[var4];
			class149.regionLandArchives = new byte[var4][];
			WorldMapSection1.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class377.regions[var4] = var7;
					ArchiveLoader.regionMapArchiveIds[var4] = class161.archive9.getGroupId("m" + var5 + "_" + var6);
					ClanChannelMember.regionLandArchiveIds[var4] = class161.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			BufferedSource.method9490(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortLE();
			var3 = var1.readUnsignedShortAddLE();
			boolean var15 = var1.readUnsignedByte() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			PacketBufferNode.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					PacketBufferNode.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class377.regions = new int[var5];
			ArchiveLoader.regionMapArchiveIds = new int[var5];
			ClanChannelMember.regionLandArchiveIds = new int[var5];
			class149.regionLandArchives = new byte[var5][];
			WorldMapSection1.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class377.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class377.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								ArchiveLoader.regionMapArchiveIds[var5] = class161.archive9.getGroupId("m" + var13 + "_" + var14);
								ClanChannelMember.regionLandArchiveIds[var5] = class161.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			BufferedSource.method9490(var2, var3, !var15);
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "([Lnh;IIIIIIIIIIB)V",
		garbageValue = "-117"
	)
	static final void method98(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		for (int var11 = var1; var11 <= var2; ++var11) {
			Widget var12 = var0[var11];
			if (var12 != null && var3 == var12.parentId && var4 == var12.field3960 && (var12.method7357() || class31.getWidgetFlags(var12) != 0 || var12 == Client.clickedWidgetParent)) {
				if (var12.isIf3) {
					if (DynamicObject.method2369(var12)) {
						continue;
					}
				} else if (var12.type == 0 && var12 != AbstractUserComparator.field5138 && DynamicObject.method2369(var12)) {
					continue;
				}

				if (var12.type == 11) {
					if (var12.method7374(class232.widgetDefinition, ParamComposition.urlRequester)) {
						if (var12.method7366()) {
							class139.invalidateWidget(var12);
							class170.revalidateWidgetScroll(var12.children, var12, true);
							var12.method7373().method4719().method4847(3, var12.method7373().method4732());
						}

						if (var12.field4068 != null) {
							ScriptEvent var13 = new ScriptEvent();
							var13.widget = var12;
							var13.args = var12.field4068;
							Client.scriptEvents.addFirst(var13);
						}
					}
				} else if (var12.type == 12 && var12.method7382(class232.widgetDefinition)) {
					class139.invalidateWidget(var12);
				}

				int var29 = var9 + var12.x;
				int var14 = var10 + var12.y;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var12.type == 9) {
					var19 = var29;
					var20 = var14;
					var21 = var29 + var12.width * 624892547;
					int var22 = var14 + var12.height * 1265510039;
					if (var21 < var29) {
						var19 = var21;
						var21 = var29;
					}

					if (var22 < var14) {
						var20 = var22;
						var22 = var14;
					}

					++var21;
					++var22;
					var15 = var19 > var5 ? var19 : var5;
					var16 = var20 > var6 ? var20 : var6;
					var17 = var21 < var7 ? var21 : var7;
					var18 = var22 < var8 ? var22 : var8;
				} else {
					var19 = var29 + var12.width * 624892547;
					var20 = var14 + var12.height * 1265510039;
					var15 = var29 > var5 ? var29 : var5;
					var16 = var14 > var6 ? var14 : var6;
					var17 = var19 < var7 ? var19 : var7;
					var18 = var20 < var8 ? var20 : var8;
				}

				if (var12 == Client.clickedWidget) {
					Client.field520 = true;
					Client.field729 = var29;
					Client.field790 = var14;
				}

				boolean var37 = false;
				if (var12.field4017) {
					switch(Client.field608) {
					case 0:
						var37 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field609 == var12.id >>> 16) {
							var37 = true;
						}
						break;
					case 3:
						if (var12.id == Client.field609) {
							var37 = true;
						}
					}
				}

				if (var37 || !var12.isIf3 || var15 < var17 && var16 < var18) {
					if (var12.isIf3) {
						ScriptEvent var30;
						if (var12.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var30.field1090) {
										var30.remove();
										var30.widget.field4082 = false;
									}
								}

								class339.method6807();
								if (class165.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									WorldView.addCancelMenuEntry();
								}
							}
						} else if (var12.noScrollThrough && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
							for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var30.field1090 && var30.widget.onScroll == var30.args) {
									var30.remove();
								}
							}
						}
					}

					var20 = MouseHandler.MouseHandler_x;
					var21 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var20 = MouseHandler.MouseHandler_lastPressedX;
						var21 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var38 = var20 >= var15 && var21 >= var16 && var20 < var17 && var21 < var18;
					if (var12.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var38) {
							WorldMapSectionType.addSceneMenuOptions(var20, var21, var15, var16);
						}
					} else if (var12.contentType == 1338) {
						SecureUrlRequester.checkIfMinimapClicked(var12, var29, var14);
					} else {
						if (var12.contentType == 1400) {
							GameBuild.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var38, var29, var14, var12.width * 624892547, var12.height * 1265510039);
						}

						if (!Client.isMenuOpen && var38) {
							if (var12.contentType == 1400) {
								GameBuild.worldMap.addElementMenuOptions(var29, var14, var12.width * 624892547, var12.height * 1265510039, var20, var21);
							} else {
								class401.Widget_addToMenu(var12);
							}
						}

						boolean var24;
						int var26;
						if (var37) {
							for (int var23 = 0; var23 < var12.field4018.length; ++var23) {
								var24 = false;
								boolean var31 = false;
								if (!var24 && var12.field4018[var23] != null) {
									for (var26 = 0; var26 < var12.field4018[var23].length; ++var26) {
										boolean var27 = false;
										if (var12.field4090 != null) {
											var27 = Client.indexCheck.isValidIndexInRange(var12.field4018[var23][var26]);
										}

										if (class157.method3542(var12.field4018[var23][var26]) || var27) {
											var24 = true;
											if (var12.field4090 != null && var12.field4090[var23] > Client.cycle) {
												break;
											}

											byte var36 = var12.field3944[var23][var26];
											if (var36 == 0 || ((var36 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var36 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var36 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var36 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var23 < 10) {
										class153.widgetDefaultMenuAction(var23 + 1, var12.id, var12.childIndex * -1626125685, var12.itemId, "");
									} else if (var23 == 10) {
										ActorSpotAnim.method9429();
										HttpResponse.method302(var12.id, var12.childIndex * -1626125685, WorldMapIcon_1.Widget_unpackTargetMask(class31.getWidgetFlags(var12)), var12.itemId);
										Client.selectedSpellActionName = class141.Widget_getSpellActionName(var12);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var12.dataText + Decimator.colorStartTag(16777215);
									}

									var26 = var12.field4020[var23];
									if (var12.field4090 == null) {
										var12.field4090 = new int[var12.field4018.length];
									}

									if (var12.field3952 == null) {
										var12.field3952 = new int[var12.field4018.length];
									}

									if (var26 != 0) {
										if (var12.field4090[var23] == 0) {
											var12.field4090[var23] = var26 + Client.cycle + var12.field3952[var23];
										} else {
											var12.field4090[var23] = var26 + Client.cycle;
										}
									} else {
										var12.field4090[var23] = Integer.MAX_VALUE;
									}
								}

								if (!var24 && var12.field4090 != null) {
									var12.field4090[var23] = 0;
								}
							}
						}

						if (var12.isIf3) {
							if (MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								var38 = true;
							} else {
								var38 = false;
							}

							boolean var39 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var38) {
								var39 = true;
							}

							var24 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var15 && MouseHandler.MouseHandler_lastPressedY >= var16 && MouseHandler.MouseHandler_lastPressedX < var17 && MouseHandler.MouseHandler_lastPressedY < var18) {
								var24 = true;
							}

							if (var24) {
								WorldMapArea.clickWidget(var12, MouseHandler.MouseHandler_lastPressedX - var29, MouseHandler.MouseHandler_lastPressedY - var14);
							}

							if (var12.method7358()) {
								if (var24) {
									Client.field622.addFirst(new class269(0, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}

								if (var39) {
									Client.field622.addFirst(new class269(1, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}
							}

							if (var12.contentType == 1400) {
								GameBuild.worldMap.method9801(var20, var21, var38 & var39, var38 & var24);
							}

							if (Client.clickedWidget != null && var12 != Client.clickedWidget && var38 && WorldMapIcon_1.method5940(class31.getWidgetFlags(var12))) {
								Client.draggedOnWidget = var12;
							}

							if (var12 == Client.clickedWidgetParent) {
								Client.field725 = true;
								Client.field726 = var29;
								Client.field727 = var14;
							}

							if (var12.hasListener) {
								ScriptEvent var25;
								if (var38 && Client.mouseWheelRotation != 0 && var12.onScroll != null) {
									var25 = new ScriptEvent();
									var25.field1090 = true;
									var25.widget = var12;
									var25.mouseY = Client.mouseWheelRotation;
									var25.args = var12.onScroll;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var24 = false;
									var39 = false;
									var38 = false;
								}

								if (!var12.field4083 && var24) {
									var12.field4083 = true;
									if (var12.onClick != null) {
										var25 = new ScriptEvent();
										var25.field1090 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_lastPressedX - var29;
										var25.mouseY = MouseHandler.MouseHandler_lastPressedY - var14;
										var25.args = var12.onClick;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4083 && var39 && var12.onClickRepeat != null) {
									var25 = new ScriptEvent();
									var25.field1090 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onClickRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4083 && !var39) {
									var12.field4083 = false;
									if (var12.onRelease != null) {
										var25 = new ScriptEvent();
										var25.field1090 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onRelease;
										Client.field621.addFirst(var25);
									}
								}

								if (var39 && var12.onHold != null) {
									var25 = new ScriptEvent();
									var25.field1090 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onHold;
									Client.scriptEvents.addFirst(var25);
								}

								if (!var12.field4082 && var38) {
									var12.field4082 = true;
									if (var12.onMouseOver != null) {
										var25 = new ScriptEvent();
										var25.field1090 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseOver;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4082 && var38 && var12.onMouseRepeat != null) {
									var25 = new ScriptEvent();
									var25.field1090 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onMouseRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4082 && !var38) {
									var12.field4082 = false;
									if (var12.onMouseLeave != null) {
										var25 = new ScriptEvent();
										var25.field1090 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseLeave;
										Client.field621.addFirst(var25);
									}
								}

								if (var12.onTimer != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onTimer;
									Client.field620.addFirst(var25);
								}

								ScriptEvent var28;
								int var40;
								int var42;
								if (var12.onVarTransmit != null && Client.changedVarpCount > var12.field4081) {
									if (var12.varTransmitTriggers != null && Client.changedVarpCount - var12.field4081 <= 32) {
										label830:
										for (var42 = var12.field4081; var42 < Client.changedVarpCount; ++var42) {
											var26 = Client.changedItemContainers[var42 & 31];

											for (var40 = 0; var40 < var12.varTransmitTriggers.length; ++var40) {
												if (var26 == var12.varTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label830;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onVarTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4081 = Client.changedVarpCount;
								}

								if (var12.onInvTransmit != null && Client.field735 > var12.field4086) {
									if (var12.invTransmitTriggers != null && Client.field735 - var12.field4086 <= 32) {
										label806:
										for (var42 = var12.field4086; var42 < Client.field735; ++var42) {
											var26 = Client.defaultRotations[var42 & 31];

											for (var40 = 0; var40 < var12.invTransmitTriggers.length; ++var40) {
												if (var26 == var12.invTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label806;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onInvTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4086 = Client.field735;
								}

								if (var12.onStatTransmit != null && Client.field737 > var12.field4077) {
									if (var12.statTransmitTriggers != null && Client.field737 - var12.field4077 <= 32) {
										label782:
										for (var42 = var12.field4077; var42 < Client.field737; ++var42) {
											var26 = Client.field736[var42 & 31];

											for (var40 = 0; var40 < var12.statTransmitTriggers.length; ++var40) {
												if (var26 == var12.statTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label782;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onStatTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4077 = Client.field737;
								}

								if (Client.chatCycle > var12.field4013 && var12.field4054 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4054;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field740 > var12.field4013 && var12.field4058 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4058;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field741 > var12.field4013 && var12.field4059 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4059;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field742 > var12.field4013 && var12.field4060 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4060;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field743 > var12.field4013 && var12.field4010 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4010;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field744 > var12.field4013 && var12.field3988 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field3988;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.hintArrowHeight > var12.field4013 && var12.field4015 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4015;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field746 > var12.field4013 && var12.onChatTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onChatTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								var12.field4013 = Client.cycleCntr;
								if (var12.field4055 != null) {
									for (var42 = 0; var42 < Client.field627; ++var42) {
										ScriptEvent var35 = new ScriptEvent();
										var35.widget = var12;
										var35.keyTyped = Client.field629[var42];
										var35.keyPressed = Client.field575[var42];
										var35.args = var12.field4055;
										Client.scriptEvents.addFirst(var35);
									}
								}

								ScriptEvent var34;
								int[] var41;
								if (var12.field4056 != null) {
									var41 = Client.indexCheck.method5677();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4056;
										Client.scriptEvents.addFirst(var34);
									}
								}

								if (var12.field4057 != null) {
									var41 = Client.indexCheck.method5678();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4057;
										Client.scriptEvents.addFirst(var34);
									}
								}
							}
						}

						if (!var12.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var12.mouseOverRedirect >= 0 || var12.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								if (var12.mouseOverRedirect >= 0) {
									AbstractUserComparator.field5138 = var0[var12.mouseOverRedirect];
								} else {
									AbstractUserComparator.field5138 = var12;
								}
							}

							if (var12.type == 8 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								class555.field5526 = var12;
							}

							if (var12.scrollHeight > var12.height * 1265510039) {
								Interpreter.method2025(var12, var12.width * 624892547 + var29, var14, var12.height * 1265510039, var12.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var12.type == 0) {
							method98(var0, var12.field3962, var12.field3968, var12.id, var12.childIndex * -1626125685, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							if (var12.children != null) {
								method98(var12.children, 0, var12.children.length - 1, var12.id, -1, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							}

							if (var12.childIndex * -1626125685 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var12.id);
								if (var32 != null) {
									if (var32.type == 0 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18 && !Client.isMenuOpen) {
										for (ScriptEvent var33 = (ScriptEvent)Client.scriptEvents.last(); var33 != null; var33 = (ScriptEvent)Client.scriptEvents.previous()) {
											if (var33.field1090) {
												var33.remove();
												var33.widget.field4082 = false;
											}
										}

										if (class165.widgetDragDuration == 0) {
											Client.clickedWidget = null;
											Client.clickedWidgetParent = null;
										}

										if (!Client.isMenuOpen) {
											WorldView.addCancelMenuEntry();
										}
									}

									DynamicObject.updateRootInterface(var32.group, var15, var16, var17, var18, var29, var14);
								}
							}
						}
					}
				}
			}
		}

	}
}
