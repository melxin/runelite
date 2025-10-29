import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class412 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lut;III)V",
		garbageValue = "-1362640853"
	)
	public static void method8516(DynamicArray var0, int var1, int var2) {
		if (var0 != null && var0.method10652() > 1) {
			class461.method9375(var0, (class586)null, true);
			if (var0.field5584 == class586.field5937) {
				class488.method9989(var0.method10650(), var0.method10652(), var1, var2);
			} else if (var0.field5584 == class586.field5942) {
				class488.method10003(var0.method10651(), var0.method10652(), var1, var2);
			} else {
				class488.method10009(var0.method10681(), var0.method10652(), var1, var2);
			}

		}
	}
}
