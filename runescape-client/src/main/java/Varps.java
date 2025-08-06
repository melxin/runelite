import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("al")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ab")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ac")
	@Export("Varps_masks")
	static int[] Varps_masks;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lox;I[B[BI)V",
		garbageValue = "-1966700037"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field4145 == null) {
			if (var2 == null) {
				return;
			}

			var0.field4145 = new byte[11][];
			var0.field4146 = new byte[11][];
			var0.field4147 = new int[11];
			var0.field4055 = new int[11];
		}

		var0.field4145[var1] = var2;
		if (var2 != null) {
			var0.field4068 = true;
		} else {
			var0.field4068 = false;

			for (int var4 = 0; var4 < var0.field4145.length; ++var4) {
				if (var0.field4145[var4] != null) {
					var0.field4068 = true;
					break;
				}
			}
		}

		var0.field4146[var1] = var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "1577705317"
	)
	public static int method7383(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field9343[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
