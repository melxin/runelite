import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class348 extends Node {
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ap")
	BitSet field3826;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1926703807
	)
	int field3828;

	class348(int var1) {
		this.field3828 = var1;
		this.field3826 = new BitSet(128);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ltp;",
		garbageValue = "-1810322857"
	)
	public static class509 method7169(String var0, String var1) {
		if (var1 != null && !var1.isEmpty()) {
			int var2 = var1.length();
			int var3 = 1;

			int var4;
			for (var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
				++var3;
			}

			class509 var5 = new class509(class563.field5595, (Object)null, var3, var3);
			int var6 = 0;
			var4 = 0;

			for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
				var5.method9936()[var3++] = var0.substring(var6, var4);
				var4 += var2;
			}

			var5.method9936()[var3] = var0.substring(var6);
			return var5;
		} else {
			throw new RuntimeException();
		}
	}
}
