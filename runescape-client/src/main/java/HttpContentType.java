import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static final HttpContentType field5644;
	@ObfuscatedName("an")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		field5644 = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1230476822"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}
}
