import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	static IndexedSprite field3172;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 424083009
	)
	static int field3174;

	ModelData0() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)Z",
		garbageValue = "-755359068"
	)
	public static boolean method6246(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		long var10 = 1073741824L;
		long var12 = -1073741824L;
		long var8;
		long var14;
		long var16;
		if (var0 != var2) {
			var14 = (long)(var3 - var1);
			var16 = (var14 << 15) / (long)(var2 - var0);
			var8 = Math.min(1073741824L, Math.max(-1073741824L, var16));
		} else if (var1 > var3) {
			var8 = -1073741824L;
		} else {
			var8 = 1073741824L;
		}

		var14 = 1073741824L;
		var16 = -1073741824L;
		long var18;
		if (var4 != var6) {
			var18 = (long)(var7 - var5);
			long var20 = (var18 << 15) / (long)(var6 - var4);
			var12 = Math.min(1073741824L, Math.max(-1073741824L, var20));
		} else if (var5 > var7) {
			var12 = -1073741824L;
		} else {
			var12 = 1073741824L;
		}

		if (var12 == var8) {
			return false;
		} else {
			var16 = ((long)var1 << 15) - var8 * (long)var0;
			var18 = ((long)var5 << 15) - var12 * (long)var4;
			int var23 = -((int)((var16 - var18) / (var8 - var12)));
			if (Math.min(var0, var2) <= var23 && Math.max(var0, var2) >= var23 && Math.min(var4, var6) <= var23 && Math.max(var4, var6) >= var23) {
				long var21;
				if (Math.abs(var8) < Math.abs(var12)) {
					var21 = var16 + (long)var23 * var8 >> 15;
				} else {
					var21 = var12 * (long)var23 + var18 >> 15;
				}

				return (long)Math.min(var1, var3) <= var21 && (long)Math.max(var1, var3) >= var21 && (long)Math.min(var5, var7) <= var21 && (long)Math.max(var5, var7) >= var21;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	static void method6245() {
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
