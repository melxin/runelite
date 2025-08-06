import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
public class class505 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([JIII)V",
		garbageValue = "-1904365956"
	)
	static void method10192(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
