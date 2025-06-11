import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public class class496 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5222;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -496448089
	)
	int field5220;

	class496() {
		this.field5222 = new WorldEntityCoord();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIII)V",
		garbageValue = "64932614"
	)
	public static void method9774(String[] var0, long[] var1, int var2, int var3) {
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
			method9774(var0, var1, var2, var5 - 1);
			method9774(var0, var1, var5 + 1, var3);
		}

	}
}
