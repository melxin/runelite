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

@ObfuscatedName("ap")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("ab")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final HttpMethod field46;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ah")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("af")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1750908413
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Lsj;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method71()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.connection;
				if (SecureRandomSSLSocketFactory.INSTANCE == null) {
					SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
				}

				SecureRandomSSLSocketFactory var6 = SecureRandomSSLSocketFactory.INSTANCE;
				var5.setSSLSocketFactory(var6);
			}

			this.field46 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsj;",
		garbageValue = "-1026271624"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lub;I)V",
		garbageValue = "-1118838459"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1654479410"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field46.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field46.method68() && this.httpPayload != null) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "96"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lan;",
		garbageValue = "1763344068"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-41"
	)
	static int method99(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var10 = WorldMapIcon_1.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var10 = WorldMapIcon_1.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				ItemComposition var6 = WorldMapIcon_1.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					var4 = WorldMapIcon_1.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					var4 = WorldMapIcon_1.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					var4 = WorldMapIcon_1.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					var4 = WorldMapIcon_1.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					var8 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class48.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = PlayerCompositionColorTextureOverride.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						WorldMapRenderer.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var8 = WorldMapIcon_1.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var4 = WorldMapIcon_1.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.field2420;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = WorldMapIcon_1.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class114.foundItemIds != null && WorldMapRenderer.foundItemIndex < PlayerCompositionColorTextureOverride.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class114.foundItemIds[++WorldMapRenderer.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
