import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ab")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2122333425
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 227960897
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ad")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 445213521
	)
	static int field2952;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 324044483
	)
	static int field2953;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -196676605
	)
	static int field2960;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1511797353
	)
	static int field2955;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static class442 field2956;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1581469147
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("av")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		field2956 = new class442();
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Ljava/lang/String;I)I",
		garbageValue = "877198529"
	)
	public static int method5407(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var5[var6] = -128;
				} else if (var7 == 8218) {
					var5[var6] = -126;
				} else if (var7 == 402) {
					var5[var6] = -125;
				} else if (var7 == 8222) {
					var5[var6] = -124;
				} else if (var7 == 8230) {
					var5[var6] = -123;
				} else if (var7 == 8224) {
					var5[var6] = -122;
				} else if (var7 == 8225) {
					var5[var6] = -121;
				} else if (var7 == 710) {
					var5[var6] = -120;
				} else if (var7 == 8240) {
					var5[var6] = -119;
				} else if (var7 == 352) {
					var5[var6] = -118;
				} else if (var7 == 8249) {
					var5[var6] = -117;
				} else if (var7 == 338) {
					var5[var6] = -116;
				} else if (var7 == 381) {
					var5[var6] = -114;
				} else if (var7 == 8216) {
					var5[var6] = -111;
				} else if (var7 == 8217) {
					var5[var6] = -110;
				} else if (var7 == 8220) {
					var5[var6] = -109;
				} else if (var7 == 8221) {
					var5[var6] = -108;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (var7 == 8211) {
					var5[var6] = -106;
				} else if (var7 == 8212) {
					var5[var6] = -105;
				} else if (var7 == 732) {
					var5[var6] = -104;
				} else if (var7 == 8482) {
					var5[var6] = -103;
				} else if (var7 == 353) {
					var5[var6] = -102;
				} else if (var7 == 8250) {
					var5[var6] = -101;
				} else if (var7 == 339) {
					var5[var6] = -100;
				} else if (var7 == 382) {
					var5[var6] = -98;
				} else if (var7 == 376) {
					var5[var6] = -97;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class366.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-595997013"
	)
	static void method5420() {
		for (class269 var0 = (class269)Client.field726.last(); var0 != null; var0 = (class269)Client.field726.previous()) {
			var0.remove();
		}

	}
}
