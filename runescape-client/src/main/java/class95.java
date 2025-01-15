import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class95 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1165;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1157;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1153;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1151;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1152;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1150;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1154;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1155;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1149;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1148;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1158;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1159;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1156;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1161;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1162;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1163;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1160;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static final class95 field1164;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -399746587
	)
	static int field1167;

	static {
		field1165 = new class95();
		field1157 = new class95();
		field1153 = new class95();
		field1151 = new class95();
		field1152 = new class95();
		field1150 = new class95();
		field1154 = new class95();
		field1155 = new class95();
		field1149 = new class95();
		field1148 = new class95();
		field1158 = new class95();
		field1159 = new class95();
		field1156 = new class95();
		field1161 = new class95();
		field1162 = new class95();
		field1163 = new class95();
		field1160 = new class95();
		field1164 = new class95();
	}

	class95() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1117049380"
	)
	public static int method2708(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}
}
