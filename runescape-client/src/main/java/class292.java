import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class292 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "932211490"
	)
	public static void method6705() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ljava/lang/Object;IIS)I",
		garbageValue = "-23157"
	)
	public static int method6704(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10351()) {
			var3 = var0.method10351();
		}

		int var5;
		if (var0.field5399 == class570.field5721) {
			int[] var11 = var0.method10348();
			var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; --var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5399 == class570.field5724) {
			long[] var10 = var0.method10377();
			long var8 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; --var7) {
				if (var10[var7] == var8) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10393();

			for (var5 = var3 - 1; var5 >= var2; --var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1027882675"
	)
	static void method6703() {
		Client.field328 = Client.localPlayerIndex;
		BuddyRankComparator.field1571 = class381.USERNAME_PASSWORD;
		Client.field327 = -1;
	}
}
