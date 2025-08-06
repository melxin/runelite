import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public enum class392 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4705(-1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4702(0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4703(1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4701(2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 856256927
	)
	final int field4704;

	class392(int var3) {
		this.field4704 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4704;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)I",
		garbageValue = "874353513"
	)
	public static int method8222(class515 var0) {
		class281.method6335(var0);
		byte var1 = 0;
		int var2 = var0.method10351();
		int var3 = -1;
		int var8;
		if (var0.field5399 == class570.field5721) {
			int[] var4 = var0.method10348();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] > var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5399 == class570.field5724) {
			long[] var9 = var0.method10377();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] > var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5399 == class570.field5718) {
			String var10 = null;
			Object[] var5 = var0.method10393();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) > 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}
}
