import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public final class class388 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1940838705"
	)
	static int method8367(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
		int var10 = (var7 - var4 + 1) * var2 / 64 + var4 & 255;
		int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}
}
