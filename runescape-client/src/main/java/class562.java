import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
public class class562 {
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1852629368"
	)
	static void method10158(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class376.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (class108 var6 = (class108)var5.last(); var6 != null; var6 = (class108)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.method2953(var4);
					break;
				}
			}
		}

	}
}
