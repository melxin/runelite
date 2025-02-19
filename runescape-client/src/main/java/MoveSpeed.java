import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3124((byte)-1, 0.0F),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3128((byte)0, 0.5F),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3122((byte)1, 1.0F),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3123((byte)2, 2.0F),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3121((byte)3, 1.5F),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3125((byte)4, 2.5F),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3126((byte)5, 3.0F),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3127((byte)6, 3.5F),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	field3120((byte)7, 4.0F);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static MoveSpeed[] field3130 = class268.method5587();
	@ObfuscatedName("as")
	@Export("id")
	final byte id;

	static {
		class386.method7526();
	}

	@ObfuscatedSignature(
		descriptor = "(BF)V",
		garbageValue = "0.0"
	)
	MoveSpeed(byte var3, float var4) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "126"
	)
	static void method5792(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = (var0[1] + (var0[0] - 2.0F)) * var0[0] + (var0[1] - 2.0F) * var0[1] + 1.0F;
			if (class132.field1572 + var1 > 0.0F) {
				if (var0[0] + class132.field1572 < 1.3333334F) {
					float var2 = var0[0] - 2.0F;
					float var3 = var0[0] - 1.0F;
					float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3));
					float var5 = (-var2 + var4) * 0.5F;
					if (var0[1] + class132.field1572 > var5) {
						var0[1] = var5 - class132.field1572;
					} else {
						var5 = 0.5F * (-var2 - var4);
						if (var0[1] < class132.field1572 + var5) {
							var0[1] = var5 + class132.field1572;
						}
					}
				} else {
					var0[0] = 1.3333334F - class132.field1572;
					var0[1] = 0.33333334F - class132.field1572;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	public static int method5791(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
