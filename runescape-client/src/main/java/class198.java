import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class198 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2094;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2091;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2092;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2093;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2095;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2096;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public static final class198 field2101;
	@ObfuscatedName("ah")
	public static int[] field2098;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 1510104727
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1662999537
	)
	public final int field2099;

	static {
		field2094 = new class198(0);
		field2091 = new class198(1);
		field2092 = new class198(2);
		field2093 = new class198(3);
		field2095 = new class198(4);
		field2096 = new class198(5);
		field2101 = new class198(6);
		field2098 = null;
	}

	class198(int var1) {
		this.field2099 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1104726025"
	)
	public static boolean method4233(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class436.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
