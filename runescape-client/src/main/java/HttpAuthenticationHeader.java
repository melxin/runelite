import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("BASIC")
	static final HttpAuthenticationHeader BASIC;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("az")
	@Export("key")
	final String key;

	static {
		BASIC = new HttpAuthenticationHeader("Basic");
		BEARER = new HttpAuthenticationHeader("Bearer");
	}

	HttpAuthenticationHeader(String var1) {
		this.key = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1894461815"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}
}
