import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class321 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "1738981916"
	)
	public static void method6539(class341 var0) {
		if (!class335.field3695.contains(var0)) {
			class335.field3695.add(var0);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1440636921"
	)
	public static int method6538(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
