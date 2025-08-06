import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1830553691
	)
	static int field1533;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1820355875
	)
	static int field1535;
	@ObfuscatedName("ac")
	final URL field1538;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2125377197
	)
	volatile int field1536;
	@ObfuscatedName("au")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1533 = -1;
		field1535 = -2;
	}

	UrlRequest(URL var1) {
		this.field1536 = field1533;
		this.field1538 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1536 != field1533;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1545179593"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-284249520"
	)
	public String method3462() {
		return this.field1538.toString();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ltn;",
		garbageValue = "-1138706445"
	)
	public static class515 method3470(String var0, String var1) {
		if (var1 != null && !var1.isEmpty()) {
			int var2 = var1.length();
			int var3 = 1;

			int var4;
			for (var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
				++var3;
			}

			class515 var5 = new class515(class570.field5718, (Object)null, var3, var3);
			int var6 = 0;
			var4 = 0;

			for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
				var5.method10393()[var3++] = var0.substring(var6, var4);
				var4 += var2;
			}

			var5.method10393()[var3] = var0.substring(var6);
			return var5;
		} else {
			throw new RuntimeException();
		}
	}
}
