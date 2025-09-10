import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class82 {
	@ObfuscatedName("ae")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lti;ILti;IIB)V",
		garbageValue = "111"
	)
	static void method2773(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
		if (var0.field5504 == class574.field5820) {
			System.arraycopy(var0.array, var1, var2.array, var3, var4);
		} else if (var0.field5504 == class574.field5816) {
			System.arraycopy(var0.field5508, var1, var2.field5508, var3, var4);
		} else {
			System.arraycopy(var0.field5506, var1, var2.field5506, var3, var4);
		}

	}
}
