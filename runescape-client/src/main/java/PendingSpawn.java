import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1423598727
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -514825559
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1049010619
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1650497557
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1689167601
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1153141933
	)
	int field1184;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1431760373
	)
	int field1185;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 915934251
	)
	int field1191;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -344500513
	)
	int field1187;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1894077093
	)
	int field1182;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -539529437
	)
	int field1189;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1945698097
	)
	int field1186;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1363012079
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 217571631
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1186 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1107990270"
	)
	void method2632(int var1) {
		this.field1186 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-97"
	)
	boolean method2633(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1186 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "567551072"
	)
	public static void method2635(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2635(var0, var1, var2, var5 - 1);
			method2635(var0, var1, var5 + 1, var3);
		}

	}
}
