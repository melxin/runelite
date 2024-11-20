import java.applet.Applet;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("eq")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("ao")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)V",
		garbageValue = "-1770364499"
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
						String var3 = var1.field1480.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1485 = UrlRequest.field1482;
								var9 = false;
								break label115;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method3158(var2, var1);
						var9 = false;
						break label131;
					}
				} catch (IOException var10) {
					var1.field1485 = UrlRequest.field1482;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Ljava/net/URLConnection;",
		garbageValue = "-479621481"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1480.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Ljava/net/URLConnection;",
		garbageValue = "783769497"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1480.openConnection();
		if (!this.secureHttps) {
			var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method177());
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-82"
	)
	public static int method3179(CharSequence var0) {
		return class167.method3641(var0, 10, true);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "572337262"
	)
	static boolean method3185(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field156.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method360(class31.field151, var2, new Object[]{(new URL(class31.field151.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field151.getAppletContext().showDocument(new URL(class31.field151.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field151;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class31.field151.getAppletContext().showDocument(new URL(class31.field151.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2137825429"
	)
	static void method3187() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1454 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1467 = null;
		Client.packetWriter.field1471 = null;
		Client.packetWriter.field1469 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1455 = 0;
		Client.rebootTimer = 0;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;
		HttpRequest.topLevelWorldView.method2868();
		ItemContainer.itemContainers = new NodeHashTable(32);
		class31.updateGameState(30);

		for (int var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class93.getWindowedMode());
			var1.packetBuffer.writeShort(class329.canvasWidth);
			var1.packetBuffer.writeShort(class535.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
