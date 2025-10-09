import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class101 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	VorbisSample field1384;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	RawSound field1385;
	@ObfuscatedName("ag")
	ReentrantLock field1386;

	@ObfuscatedSignature(
		descriptor = "(Leh;Ldi;)V"
	)
	class101(VorbisSample var1, RawSound var2) {
		this.field1384 = var1;
		this.field1385 = var2;
		this.field1386 = new ReentrantLock();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfu;FB)F",
		garbageValue = "-67"
	)
	static float method3230(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1656 == var1) {
				var2 = 0.0F;
			} else if (var1 == var0.field1661) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1656) / (var0.field1661 - var0.field1656);
			}

			float var3;
			if (var0.field1651) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1664 - var2, var0.field1657, var0.field1667, var0.field1662};
				float[] var5 = new float[5];
				int var6 = class173.method4150(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var3 * ((var0.field1665 + var0.field1666 * var3) * var3 + var0.field1659) + var0.field1663;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "403482131"
	)
	static final int method3231(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
