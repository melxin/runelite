import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1860530755
	)
	static int field1511;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 767580067
	)
	static int field1510;
	@ObfuscatedName("ab")
	final URL field1509;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1854276191
	)
	volatile int field1512;
	@ObfuscatedName("ah")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1511 = -1;
		field1510 = -2;
	}

	UrlRequest(URL var1) {
		this.field1512 = field1511;
		this.field1509 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "211588433"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1512 != field1511;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-74"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-45"
	)
	public String method3170() {
		return this.field1509.toString();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltx;",
		garbageValue = "878384868"
	)
	public static class505[] method3166() {
		return new class505[]{class505.field5211, class505.field5212, class505.field5213};
	}
}
