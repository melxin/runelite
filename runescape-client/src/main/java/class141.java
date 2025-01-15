import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
final class class141 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lff;FB)F",
		garbageValue = "-75"
	)
	static float method3511(class136 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var1 == var0.field1576) {
				var2 = 0.0F;
			} else if (var1 == var0.field1577) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1576) / (var0.field1577 - var0.field1576);
			}

			float var3;
			if (var0.field1575) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1578 - var2, var0.field1579, var0.field1580, var0.field1581};
				float[] var5 = new float[5];
				int var6 = Tiles.method2556(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var0.field1582 + var3 * (var3 * (var3 * var0.field1591 + var0.field1584) + var0.field1585);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "111"
	)
	public static long method3506(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "39"
	)
	public static boolean method3509(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "0"
	)
	static int method3510(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
