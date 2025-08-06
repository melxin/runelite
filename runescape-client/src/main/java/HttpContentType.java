import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static final HttpContentType field5456;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1530249351
	)
	static int field5455;
	@ObfuscatedName("lf")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("av")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		field5456 = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1816121468"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
