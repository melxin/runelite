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

@ObfuscatedName("au")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1967414437
	)
	static int field52;
	@ObfuscatedName("pv")
	static int[] field53;
	@ObfuscatedName("ap")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final HttpMethod field47;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("al")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("ac")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1967490067
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lag;Lsx;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method81()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method185());
			}

			this.field47 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lag;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lsx;",
		garbageValue = "-1779212623"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lue;I)V",
		garbageValue = "398577248"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-239176657"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field47.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field47.method69() && this.httpPayload != null) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "354357555"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lao;",
		garbageValue = "7"
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

	@ObfuscatedName("ap")
	public static double method99(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIIB)V",
		garbageValue = "48"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field4060 == null) {
			throw new RuntimeException();
		} else {
			var0.field4060[var1] = var2;
			var0.field4031[var1] = var3;
		}
	}
}
