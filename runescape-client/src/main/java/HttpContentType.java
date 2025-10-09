import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final HttpContentType field5624;
	@ObfuscatedName("aj")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		field5624 = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2120847028"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
