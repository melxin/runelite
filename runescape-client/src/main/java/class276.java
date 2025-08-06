import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class276 {
	@ObfuscatedName("al")
	final int[][] field3181;
	@ObfuscatedName("ab")
	final int[][] field3187;
	@ObfuscatedName("ac")
	final int[] field3185;
	@ObfuscatedName("av")
	final int[] field3183;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -733914413
	)
	final int field3180;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 144250009
	)
	int field3184;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1171991643
	)
	int field3186;

	class276(int var1, int var2) {
		this.field3181 = new int[var1][var2];
		this.field3187 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = Huffman.method8114(var3 / 4);
		this.field3185 = new int[var4];
		this.field3183 = new int[var4];
		this.field3180 = var4 - 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1199481384"
	)
	void method6213() {
		for (int var1 = 0; var1 < this.field3181.length; ++var1) {
			for (int var2 = 0; var2 < this.field3181[var1].length; ++var2) {
				this.field3181[var1][var2] = 0;
				this.field3187[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "814867457"
	)
	void method6214(int var1, int var2) {
		this.field3184 = var1;
		this.field3186 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2131776408"
	)
	int method6223() {
		return this.field3184;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1137763837"
	)
	int method6216() {
		return this.field3186;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-92"
	)
	int method6217() {
		return this.field3181.length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-52"
	)
	int method6244() {
		return this.field3181[0].length;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1838918557"
	)
	int[][] method6219() {
		return this.field3181;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "65"
	)
	int[][] method6220() {
		return this.field3187;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1989199158"
	)
	int[] method6221() {
		return this.field3185;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2006993299"
	)
	int[] method6218() {
		return this.field3183;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1817385936"
	)
	int method6212() {
		return this.field3180;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "2"
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
}
