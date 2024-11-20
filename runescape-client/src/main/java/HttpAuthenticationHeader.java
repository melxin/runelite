import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("BASIC")
	static final HttpAuthenticationHeader BASIC;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("at")
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
		garbageValue = "-1618097958"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	static void method8811(int var0) {
		SequenceDefinition var1 = HealthBarDefinition.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (class150.method3462(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field803.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
