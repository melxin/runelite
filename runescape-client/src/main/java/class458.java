import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class458 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "22026"
	)
	public static int method8966(int var0, int var1, int var2) {
		int var3 = ItemComposition.method5643(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}
