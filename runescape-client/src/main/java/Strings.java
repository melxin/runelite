import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fn")
	public static String field4414;
	@ObfuscatedName("kx")
	public static String field4550;
	@ObfuscatedName("kd")
	public static String field4551;
	@ObfuscatedName("la")
	public static String field4552;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Widget field4598;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = 1575865067
	)
	static int field4599;

	static {
		field4414 = "Please visit the support page for assistance.";
		field4550 = "";
		field4551 = "Page has opened in the browser.";
		field4552 = "";
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ljava/lang/Object;IIB)I",
		garbageValue = "1"
	)
	public static int method7954(class509 var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method9937()) {
			var3 = var0.method9937();
		}

		int var5;
		if (var0.field5288 == class563.field5600) {
			int[] var11 = var0.method9965();
			var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; --var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5288 == class563.field5594) {
			long[] var10 = var0.method9973();
			long var8 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; --var7) {
				if (var8 == var10[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method9936();

			for (var5 = var3 - 1; var5 >= var2; --var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}
}
