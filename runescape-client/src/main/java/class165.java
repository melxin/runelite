import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public abstract class class165 extends Node {
	class165() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	abstract void vmethod4076(Buffer var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	abstract void vmethod4077(ClanChannel var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lah;",
		garbageValue = "1973922930"
	)
	public static class6[] method4006() {
		return new class6[]{class6.field16};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ltn;B)I",
		garbageValue = "42"
	)
	public static int method4008(DynamicArray var0, DynamicArray var1) {
		if (var1 == var0) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var2 = var0.method10351();
			int var3 = var1.method10351();
			int var4 = Math.min(var2, var3);
			int var7;
			if (var0.field5399 == class570.field5721 && class570.field5721 == var1.field5399) {
				int[] var10 = var0.method10348();
				int[] var12 = var1.method10348();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var10[var7] < var12[var7]) {
						return -1;
					}

					if (var10[var7] > var12[var7]) {
						return 1;
					}
				}
			} else if (var0.field5399 == class570.field5724 && class570.field5724 == var1.field5399) {
				long[] var9 = var0.method10377();
				long[] var11 = var1.method10377();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var9[var7] < var11[var7]) {
						return -1;
					}

					if (var9[var7] > var11[var7]) {
						return 1;
					}
				}
			} else {
				if (var0.field5399 != class570.field5718 || class570.field5718 != var1.field5399) {
					throw new RuntimeException();
				}

				Object[] var5 = var0.method10393();
				Object[] var6 = var1.method10393();

				for (var7 = 0; var7 < var4; ++var7) {
					int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
					if (var8 < 0) {
						return -1;
					}

					if (var8 > 0) {
						return 1;
					}
				}
			}

			return var2 < var3 ? -1 : (var2 == var3 ? 0 : 1);
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ldj;III)V",
		garbageValue = "698316863"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class570.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
