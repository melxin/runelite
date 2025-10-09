import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public abstract class class166 extends Node {
	class166() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	abstract void vmethod4154(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	abstract void vmethod4151(ClanChannel var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIII)V",
		garbageValue = "71512821"
	)
	public static void method4090(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var6 == null || var0[var9] != null && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4090(var0, var1, var2, var5 - 1);
			method4090(var0, var1, var5 + 1, var3);
		}

	}
}
