import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class447 extends RuntimeException {
	@ObfuscatedName("as")
	@Export("javaVersion")
	public static String javaVersion;

	public class447(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "-20"
	)
	public static String method8529(CharSequence var0) {
		String var1 = GrandExchangeOfferUnitPriceComparator.base37DecodeLong(Language.method8011(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "380796578"
	)
	public static int method8528(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var4 = (int)(var2 >>> 52 & 4095L);
		if ((long)var4 == 4095L) {
			var4 = -1;
		}

		return var4;
	}
}
