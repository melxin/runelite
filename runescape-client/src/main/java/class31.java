import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class31 {
	@ObfuscatedName("ap")
	public static Applet field158;
	@ObfuscatedName("aq")
	public static String field159;

	static {
		field158 = null;
		field159 = "";
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lti;IIB)V",
		garbageValue = "7"
	)
	public static void method478(DynamicArray var0, int var1, int var2) {
		class374.method8144(var0);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.method10322() && var2 < var0.method10322()) {
			if (var2 != var1) {
				if (var0.field5504 == class574.field5820) {
					int[] var3 = var0.method10318();
					int var8 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var8;
				} else if (var0.field5504 == class574.field5816) {
					long[] var9 = var0.method10320();
					long var6 = var9[var1];
					var9[var1] = var9[var2];
					var9[var2] = var6;
				} else {
					Object[] var10 = var0.method10321();
					Object var4 = var10[var1];
					var10[var1] = var10[var2];
					var10[var2] = var4;
				}
			}

		} else {
			throw new RuntimeException();
		}
	}
}
