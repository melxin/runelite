import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class273 extends Node {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field3204;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 233435093
	)
	public int field3197;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 32878481
	)
	public int field3199;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1134151549
	)
	public int field3200;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	public Widget field3196;

	@ObfuscatedSignature(
		descriptor = "(IIILoi;)V"
	)
	public class273(int var1, int var2, int var3, Widget var4) {
		this.field3200 = var1;
		this.field3197 = var2;
		this.field3199 = var3;
		this.field3196 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1966824077"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var3[var6 + var4] = -128;
				} else if (var7 == 8218) {
					var3[var6 + var4] = -126;
				} else if (var7 == 402) {
					var3[var6 + var4] = -125;
				} else if (var7 == 8222) {
					var3[var6 + var4] = -124;
				} else if (var7 == 8230) {
					var3[var6 + var4] = -123;
				} else if (var7 == 8224) {
					var3[var6 + var4] = -122;
				} else if (var7 == 8225) {
					var3[var6 + var4] = -121;
				} else if (var7 == 710) {
					var3[var6 + var4] = -120;
				} else if (var7 == 8240) {
					var3[var6 + var4] = -119;
				} else if (var7 == 352) {
					var3[var6 + var4] = -118;
				} else if (var7 == 8249) {
					var3[var6 + var4] = -117;
				} else if (var7 == 338) {
					var3[var6 + var4] = -116;
				} else if (var7 == 381) {
					var3[var6 + var4] = -114;
				} else if (var7 == 8216) {
					var3[var6 + var4] = -111;
				} else if (var7 == 8217) {
					var3[var6 + var4] = -110;
				} else if (var7 == 8220) {
					var3[var6 + var4] = -109;
				} else if (var7 == 8221) {
					var3[var6 + var4] = -108;
				} else if (var7 == 8226) {
					var3[var6 + var4] = -107;
				} else if (var7 == 8211) {
					var3[var6 + var4] = -106;
				} else if (var7 == 8212) {
					var3[var6 + var4] = -105;
				} else if (var7 == 732) {
					var3[var6 + var4] = -104;
				} else if (var7 == 8482) {
					var3[var6 + var4] = -103;
				} else if (var7 == 353) {
					var3[var6 + var4] = -102;
				} else if (var7 == 8250) {
					var3[var6 + var4] = -101;
				} else if (var7 == 339) {
					var3[var6 + var4] = -100;
				} else if (var7 == 382) {
					var3[var6 + var4] = -98;
				} else if (var7 == 376) {
					var3[var6 + var4] = -97;
				} else {
					var3[var6 + var4] = 63;
				}
			} else {
				var3[var6 + var4] = (byte)var7;
			}
		}

		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILoi;Loi;I)Loi;",
		garbageValue = "-1744307497"
	)
	static Widget method6113(int var0, Widget var1, Widget var2) {
		int var3 = 0;
		Widget var4 = null;

		for (int var5 = var2.childIndex * -217986249 + 1; var5 < var1.children.length; ++var5) {
			Widget var6 = var1.children[var5];
			if (var6 != null && var6.field4165 == var2.childIndex * -217986249) {
				++var3;
				if (var0 == var3 - 1) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}
}
