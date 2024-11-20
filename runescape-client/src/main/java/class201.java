import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class201 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1552070105
	)
	static int field2090;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 665074917
	)
	static int field2085;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1370229955"
	)
	static long method4009(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}
}
