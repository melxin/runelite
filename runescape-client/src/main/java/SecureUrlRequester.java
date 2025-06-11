import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("or")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("al")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Leo;B)V",
		garbageValue = "0"
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
						String var3 = var1.field1493.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1491 = UrlRequest.field1497;
								var9 = false;
								break label131;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method3323(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1491 = UrlRequest.field1497;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Leo;B)Ljava/net/URLConnection;",
		garbageValue = "0"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1493.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Leo;I)Ljava/net/URLConnection;",
		garbageValue = "1753419906"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1493.openConnection();
		if (!this.secureHttps) {
			var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method185());
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfi;",
		garbageValue = "1131056131"
	)
	static class137[] method3358() {
		return new class137[]{class137.field1620, class137.field1621, class137.field1618, class137.field1619, class137.field1616, class137.field1627};
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "313395296"
	)
	static void method3363(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class330.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			WorldMapRectangle.updateItemPile(var0, var1, var2);
		}

	}
}
