import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ah")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-2003495708"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label131: {
			label125: {
				try {
					label115: {
						var9 = true;
						String var3 = var1.field1555.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1559 = UrlRequest.field1554;
								var9 = false;
								break label115;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method3556(var2, var1);
						var9 = false;
						break label131;
					}
				} catch (IOException var10) {
					var1.field1559 = UrlRequest.field1554;
					var9 = false;
					break label125;
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
		descriptor = "(Lez;I)Ljava/net/URLConnection;",
		garbageValue = "1523536342"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1555.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Ljava/net/URLConnection;",
		garbageValue = "402611853"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1555.openConnection();
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "22"
	)
	public static Object method3587(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lcj;",
		garbageValue = "76333634"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class142.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class142.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class203.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(ILtg;Ldm;B)I",
		garbageValue = "122"
	)
	static int method3585(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == Client.currentWorldViewId) {
			var3 = var2.plane;
		} else if (Client.currentWorldViewId == -1) {
			var3 = var1.field5482.method4539();
		} else {
			WorldEntity var4 = Client.worldViewManager.method2396();
			WorldView var5 = var4.field5483;
			if (var5.plane == var4.field5482.method4539()) {
				if (var0 == -1) {
					var3 = var4.getX();
				} else {
					var3 = var1.field5482.method4539();
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-404392602"
	)
	static boolean method3583(int var0) {
		for (int var1 = 0; var1 < Client.field434; ++var1) {
			if (Client.field568[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "60"
	)
	static void method3586(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class478.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
