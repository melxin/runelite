import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static final HttpContentType field5344;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ai")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		field5344 = new HttpContentType("text/plain");
		TEXT_PLAIN = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-51"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-525364753"
	)
	static void method10100(int var0) {
		Bounds.field4952 = var0;
		Bounds.field4953 = new Bounds[var0];
		Bounds.field4954 = 0;
	}
}
