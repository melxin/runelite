import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("an")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "2015273201"
	)
	void method4024(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4034(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-1898017727"
	)
	void method4034(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-1039978270"
	)
	public static class226 method4037() {
		return class226.field2465;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILov;IIIII[FB)Lov;",
		garbageValue = "27"
	)
	static Widget method4038(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * 926100227;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)(var1.width * -1805166981));
		var8.rawY = (int)(var7[1] * (float)(var1.height * -2133353239));
		var8.rawWidth = (int)(var7[2] * (float)(var1.width * -1805166981));
		var8.rawHeight = (int)((float)(var1.height * -2133353239) * var7[3]);
		return var8;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIS)I",
		garbageValue = "7090"
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
