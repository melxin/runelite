import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("fc")
	static boolean field83;
	@ObfuscatedName("gm")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1758711661
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("ay")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("au")
	final Map field89;
	@ObfuscatedName("ad")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field89 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field89 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "879679553"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "22981932"
	)
	public String method253() {
		return this.headerFields;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1366839830"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field89;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}
}
