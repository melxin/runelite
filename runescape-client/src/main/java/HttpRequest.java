import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "[Lna;"
	)
	static Widget[] field53;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ay")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final HttpMethod field48;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ad")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("an")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1817451863
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lac;Lri;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method75()) {
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

			this.field48 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lac;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lri;",
		garbageValue = "62"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltn;B)V",
		garbageValue = "2"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1136076020"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field48.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field48.method68() && this.httpPayload != null) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1407153734"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Lai;",
		garbageValue = "-252"
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

	@ObfuscatedName("ay")
	public static String method113(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "78"
	)
	public static int method100(int var0) {
		return class506.field5148[var0 & 16383];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)I",
		garbageValue = "-36"
	)
	static int method112(Widget var0) {
		if (var0.type != 11) {
			--HealthBarConfig.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var0.method7465(var1);
			return 1;
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-439773603"
	)
	static void method92(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class30.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}
}
