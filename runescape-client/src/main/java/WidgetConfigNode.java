import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("WidgetConfigNode")
public class WidgetConfigNode extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1487990791
	)
	@Export("start")
	final int start;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -244896843
	)
	@Export("end")
	final int end;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2065861549
	)
	@Export("clickMask")
	final int clickMask;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -376500063
	)
	@Export("opMask")
	final int opMask;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("nextWidgetConfigNode")
	WidgetConfigNode nextWidgetConfigNode;

	WidgetConfigNode(int var1, int var2, int var3, int var4) {
		this.start = var1;
		this.end = var2;
		this.clickMask = var3;
		this.opMask = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1197403593"
	)
	public int method7503() {
		return this.clickMask;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1451738490"
	)
	public int method7499() {
		return this.opMask;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;Ljava/lang/String;I)I",
		garbageValue = "66073683"
	)
	public static int method7497(Buffer var0, String var1) {
		int var2 = var0.array * 1216585693;
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
		var0.array += class376.huffman.compress(var5, 0, var5.length, var0.field5916, 1216585693 * var0.array) * -290410379;
		return var0.array * 1216585693 - var2;
	}
}
