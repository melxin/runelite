import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class146 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1652(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1663(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1653(2, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1654(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1655(4, 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1656(5, 5),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1659(6, 6),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1658(7, 7),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1651(8, 8);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -414941583
	)
	static int field1657;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2095672335
	)
	final int field1660;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -953738385
	)
	final int field1661;

	class146(int var3, int var4) {
		this.field1660 = var3;
		this.field1661 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1661;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-1997420209"
	)
	static void method3435(float[] var0) {
		if (class133.field1535 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
			float var4 = 0.5F * (-var1 + var3);
			if (class133.field1535 + var0[1] > var4) {
				var0[1] = var4 - class133.field1535;
			} else {
				var4 = 0.5F * (-var1 - var3);
				if (var0[1] < class133.field1535 + var4) {
					var0[1] = class133.field1535 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class133.field1535;
			var0[1] = 0.33333334F - class133.field1535;
		}

	}
}
