import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1203782425
	)
	static int field1471;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -757318905
	)
	static int field1474;
	@ObfuscatedName("ay")
	final URL field1473;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -81627907
	)
	volatile int field1476;
	@ObfuscatedName("ad")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1471 = -1;
		field1474 = -2;
	}

	UrlRequest(URL var1) {
		this.field1476 = field1471;
		this.field1473 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2064838121"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1476 != field1471;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "98"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "2"
	)
	public String method3308() {
		return this.field1473.toString();
	}
}
