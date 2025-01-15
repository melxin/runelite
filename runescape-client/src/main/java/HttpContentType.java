import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("APPLICATION_X_WWW_FORM_URLENCODED")
	static final HttpContentType APPLICATION_X_WWW_FORM_URLENCODED;
	@ObfuscatedName("am")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("ao")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
		APPLICATION_X_WWW_FORM_URLENCODED = new HttpContentType("application/x-www-form-urlencoded");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "455008847"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1950558171"
	)
	static void method9544() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
