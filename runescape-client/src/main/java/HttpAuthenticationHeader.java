import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("BASIC")
	static final HttpAuthenticationHeader BASIC;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("au")
	@Export("key")
	final String key;

	static {
		BASIC = new HttpAuthenticationHeader("Basic");
		BEARER = new HttpAuthenticationHeader("Bearer");
	}

	HttpAuthenticationHeader(String var1) {
		this.key = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1752550517"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}
}
