import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class321 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static AbstractArchive field3367;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lfx;",
		garbageValue = "318535941"
	)
	static class138 method6828(int var0) {
		class138 var1 = (class138)class175.findEnumerated(InterfaceParent.method2107(), var0);
		if (var1 == null) {
			var1 = class138.field1648;
		}

		return var1;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-800417842"
	)
	static final void method6827(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		class6.method35((double)var1);
	}
}
