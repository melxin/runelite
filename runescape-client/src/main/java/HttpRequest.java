import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("al")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final HttpMethod field45;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("au")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("as")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 325775401
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laj;Lst;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method72()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method177());
			}

			this.field45 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laj;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lst;",
		garbageValue = "-714089106"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lue;I)V",
		garbageValue = "-1707768348"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-705255554"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field45.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field45.method75() && this.httpPayload != null) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-639598270"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Laz;",
		garbageValue = "-896233224"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "91262493"
	)
	static void method101(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfn;I)V",
		garbageValue = "-286155393"
	)
	static void method102(float var0, float var1, float var2, float var3, class137 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1649 = var7 - var6 - var8;
		var4.field1637 = var8 + var8 + var8;
		var4.field1647 = var5 + var5 + var5;
		var4.field1651 = var0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-372510360"
	)
	static boolean method89() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
			var2.setLenient(false);
			StringBuilder var3 = new StringBuilder();
			String[] var4 = Login.field706;
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5];
					if (var6 != null) {
						var3.append(var6);
						++var5;
						continue;
					}

					DynamicObject.method1987(7);
					class460.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
					var1 = null;
				} else {
					var3.append("12");
					var1 = var2.parse(var3.toString());
				}

				var0 = var1;
				break;
			}
		} catch (ParseException var10) {
			DynamicObject.method1987(7);
			class460.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			java.util.Calendar var11 = java.util.Calendar.getInstance();
			var11.set(1, var11.get(1) - 13);
			var11.set(5, var11.get(5) + 1);
			var11.set(11, 0);
			var11.set(12, 0);
			var11.set(13, 0);
			var11.set(14, 0);
			Date var12 = var11.getTime();
			boolean var7 = var0.before(var12);
			boolean var9 = MusicPatchNode.method7352(var0);
			if (!var9) {
				class254.method5872("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var7) {
					Skeleton.field2625 = 8388607;
				} else {
					Skeleton.field2625 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}
}
