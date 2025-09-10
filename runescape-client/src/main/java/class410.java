import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class410 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final class410 field4947;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4929;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4930;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4931;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4952;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4933;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4942;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4935;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4934;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4937;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4938;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4928;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4945;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4939;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4953;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4943;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4944;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4936;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4946;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4932;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4948;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4949;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4950;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class410 field4941;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final class410 field4940;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final class410 field4951;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1078359815
	)
	public final int field4954;

	static {
		field4947 = new class410(255);
		field4929 = new class410(0);
		field4930 = new class410(1);
		field4931 = new class410(2);
		field4952 = new class410(3);
		field4933 = new class410(4);
		field4942 = new class410(5);
		field4935 = new class410(6);
		field4934 = new class410(7);
		field4937 = new class410(8);
		field4938 = new class410(9);
		field4928 = new class410(10);
		field4945 = new class410(11);
		field4939 = new class410(12);
		field4953 = new class410(13);
		field4943 = new class410(14);
		field4944 = new class410(15);
		field4936 = new class410(17);
		field4946 = new class410(18);
		field4932 = new class410(19);
		field4948 = new class410(20);
		field4949 = new class410(21);
		field4950 = new class410(22);
		field4941 = new class410(23);
		field4940 = new class410(24);
		field4951 = new class410(25);
	}

	class410(int var1) {
		this.field4954 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "1153056146"
	)
	static byte[] method8331(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var4 + var3;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CLqh;I)I",
		garbageValue = "1808778048"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "-1622360873"
	)
	static void method8328(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method8328(var0, var1, var2, var5 - 1);
			method8328(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1898101594"
	)
	static int method8330(int var0, Script var1, boolean var2) {
		if (var0 == 13337) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Interpreter.field653;
			return 1;
		} else {
			return 2;
		}
	}
}
