import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class327 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3652;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3653;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3655;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3659;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3656;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3660;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3658;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3657;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3654;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3661;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3662;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3663;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final class327 field3664;

	static {
		field3652 = new class327(14);
		field3653 = new class327(14);
		field3655 = new class327(24);
		field3659 = new class327(6);
		field3656 = new class327(4);
		field3660 = new class327(7);
		field3658 = new class327(4);
		field3657 = new class327(7);
		field3654 = new class327(7);
		field3661 = new class327(2);
		field3662 = new class327(11);
		field3663 = new class327(-2);
		field3664 = new class327(17);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "14"
	)
	class327(int var1) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/lang/Object;III)I",
		garbageValue = "1517036281"
	)
	public static int method7042(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10433()) {
			var3 = var0.method10433();
		}

		int var4 = 0;
		int var6;
		if (var0.field5571 == class572.field5879) {
			int[] var5 = var0.method10430();
			var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var6 == var5[var7]) {
					++var4;
				}
			}
		} else if (var0.field5571 == class572.field5878) {
			long[] var11 = var0.method10431();
			long var9 = (Long)var1;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var11[var8] == var9) {
					++var4;
				}
			}
		} else {
			Object[] var12 = var0.method10428();

			for (var6 = var2; var6 < var3; ++var6) {
				if (var12[var6] == var1 || var12[var6] != null && var12[var6].equals(var1)) {
					++var4;
				}
			}
		}

		return var4;
	}
}
