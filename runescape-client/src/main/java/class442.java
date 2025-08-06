import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class442 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ltn;IIII)V",
		garbageValue = "1955821217"
	)
	public static void method8957(class515 var0, class515 var1, int var2, int var3, int var4) {
		class281.method6335(var0);
		WorldMapData_1.method6678(var1, var0.field5399);
		int var5 = var0.method10351();
		int var6 = var1.method10351();
		if (var4 == -1) {
			var4 = var0.method10351() - var2;
		}

		if (var4 != 0 && (var1 != var0 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var5 && var3 >= 0 && var3 + var4 <= var6) {
				class401.method8272(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
