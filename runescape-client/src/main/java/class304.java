import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class304 {
	@ObfuscatedName("an")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -910381573
	)
	static int field3485;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)I",
		garbageValue = "86"
	)
	public static int method6849(DynamicArray var0) {
		IntHashTable.method9896(var0);
		byte var1 = 0;
		int var2 = var0.method10433();
		int var3 = -1;
		int var8;
		if (var0.field5571 == class572.field5879) {
			int[] var4 = var0.method10430();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] > var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5571 == class572.field5878) {
			long[] var9 = var0.method10431();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] > var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5571 == class572.field5877) {
			String var10 = null;
			Object[] var5 = var0.method10428();

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
