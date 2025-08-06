import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class389 {
	@ObfuscatedName("oj")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(DDIB)[D",
		garbageValue = "-71"
	)
	public static double[] method8204(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = ReflectionCheck.method756((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ljava/lang/Object;IIS)V",
		garbageValue = "4124"
	)
	public static void method8205(class515 var0, Object var1, int var2, int var3) {
		class150.method3792(var0, (class570)null, true);
		if (var2 < 0) {
			var2 = 0;
		}

		int var4 = var3 + var2;
		if (var3 < 0 || var4 < 0 || var4 > var0.method10351()) {
			var4 = var0.method10351();
		}

		if (var0.field5399 == class570.field5721) {
			Arrays.fill(var0.method10348(), var2, var4, (Integer)var1);
		} else if (var0.field5399 == class570.field5724) {
			Arrays.fill(var0.method10377(), var2, var4, (Long)var1);
		} else {
			Arrays.fill(var0.method10393(), var2, var4, var1);
		}

	}
}
