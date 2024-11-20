import java.awt.Image;
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

@ObfuscatedName("ay")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("bp")
	static Image field100;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 2121157151
	)
	static int field98;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	static IndexedSprite[] field101;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("entity")
	static Entity entity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1074900177
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("aw")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("at")
	final Map field96;
	@ObfuscatedName("ae")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field96 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field96 = var1.getHeaderFields();
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
		descriptor = "(B)I",
		garbageValue = "11"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2094002613"
	)
	public String method273() {
		return this.headerFields;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/Map;",
		garbageValue = "8625"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field96;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1413368716"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-369730497"
	)
	static final int method284(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2055035174"
	)
	static int method270(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field864 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "1808396095"
	)
	static void method283(Buffer var0, int var1) {
		class27.method377(var0.array, var1);
		class92.method2511(var0, var1);
	}
}
