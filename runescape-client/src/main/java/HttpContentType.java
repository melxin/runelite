import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	static final HttpContentType field5129;
	@ObfuscatedName("ae")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		field5129 = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1246106886"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
