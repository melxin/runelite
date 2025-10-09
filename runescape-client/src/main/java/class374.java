import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public enum class374 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4349(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4352(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4350(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4348(3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4351(4);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 269139919
	)
	final int field4347;

	class374(int var3) {
		this.field4347 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4347;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "32"
	)
	public static long method8159(CharSequence var0) {
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

		while (0L == var1 % 37L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}
}
