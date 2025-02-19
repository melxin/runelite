import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class359 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	public class361 field3863;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class355 field3859;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	class27 field3858;
	@ObfuscatedName("ad")
	public Object[] field3861;
	@ObfuscatedName("ah")
	public Object[] field3862;
	@ObfuscatedName("ac")
	public Object[] field3860;
	@ObfuscatedName("ao")
	public Object[] field3864;

	class359() {
		this.field3863 = new class361();
		this.field3859 = new class355();
		this.field3858 = new class27();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "1744161635"
	)
	public static String method6944(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}
}
