import java.io.BufferedReader;
import java.io.File;
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

@ObfuscatedName("ai")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("jx")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("se")
	static boolean field91;
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = -1716801803
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1914974289
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("ah")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("az")
	final Map field90;
	@ObfuscatedName("ao")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field90 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field90 = var1.getHeaderFields();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-16593"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1561646912"
	)
	public String method301() {
		return this.headerFields;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1862700448"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field90;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1539511432"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;B)V",
		garbageValue = "-38"
	)
	static void method308(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1253392583"
	)
	static final float method298(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "643864803"
	)
	public static int method307(int var0) {
		return class360.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
