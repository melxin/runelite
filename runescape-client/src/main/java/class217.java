import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class217 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	public UrlRequest field2414;
	@ObfuscatedName("ay")
	public float[] field2415;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	class217(class227 var1) {
		this.this$0 = var1;
		this.field2415 = new float[4];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1287161340"
	)
	static void method4439(int var0) {
		class442.field4896 = var0;
		class442.field4894 = new class442[var0];
		class187.field1997 = 0;
	}

	@ObfuscatedName("ay")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class437.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "38"
	)
	public static int method4437(int var0) {
		return var0 >> 17 & 7;
	}
}
