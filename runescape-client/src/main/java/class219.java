import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class219 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1952052223"
	)
	public static void method4460(int[] var0, int[] var1, int var2, int var3) {
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
			method4460(var0, var1, var2, var5 - 1);
			method4460(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpl;II)V",
		garbageValue = "-866958373"
	)
	public static void method4457(AbstractArchive var0, int var1) {
		if (!class335.field3689.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class335.field3689.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field3799 = false;
				var4.field3805 = false;
				var4.field3807 = false;
				var4.field3801 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3803 = 0.0F;
				var2.add(var4);
			}

			UserComparator3.method3219(var2, class335.musicPlayerStatus, class335.field3693, class335.field3690, class335.field3684, false);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1006982651"
	)
	static final boolean method4458(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1355106083"
	)
	static final String method4459(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
