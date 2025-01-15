import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ad")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1821014649"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true;
						String var3 = var1.field1473.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1476 = UrlRequest.field1474;
								var9 = false;
								break label131;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method3289(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1476 = UrlRequest.field1474;
					var9 = false;
					break label128;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Len;S)Ljava/net/URLConnection;",
		garbageValue = "24310"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1473.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Len;B)Ljava/net/URLConnection;",
		garbageValue = "-103"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1473.openConnection();
		if (!this.secureHttps) {
			if (SecureRandomSSLSocketFactory.INSTANCE == null) {
				SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
			}

			SecureRandomSSLSocketFactory var4 = SecureRandomSSLSocketFactory.INSTANCE;
			var2.setSSLSocketFactory(var4);
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	static final int method3301(int var0) {
		return Math.abs(var0 - IntProjection.cameraYaw) > 1024 ? var0 + (var0 < IntProjection.cameraYaw ? 1 : -1) * 2048 : var0;
	}
}
