import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public enum class375 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4255(0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4254(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4253(2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4256(3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4257(4);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1705645361
	)
	final int field4258;

	class375(int var3) {
		this.field4258 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4258;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ljava/lang/Object;III)I",
		garbageValue = "-919717631"
	)
	public static int method8135(DynamicArray var0, Object var1, int var2, int var3) {
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

			for (int var6 = var2; var6 < var3; ++var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5399 == class570.field5724) {
			long[] var10 = var0.method10377();
			long var8 = (Long)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var10[var7] == var8) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10393();

			for (var5 = var2; var5 < var3; ++var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)Z",
		garbageValue = "1853431036"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class198.method4384(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1048278553"
	)
	static void method8129() {
		if (class1.field2 != null) {
			Client.field372 = Client.cycle;
			class1.field2.method8578();
			Iterator var0 = class7.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				class1.field2.method8577((var1.x >> 7) + class7.topLevelWorldView.baseX, (var1.y >> 7) + class7.topLevelWorldView.baseY);
			}
		}

	}
}
