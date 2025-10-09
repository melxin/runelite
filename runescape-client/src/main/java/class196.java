import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class196 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class196 field2146;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class196 field2147;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static final class196 field2151;
	@ObfuscatedName("pp")
	static byte[][] field2145;

	static {
		field2146 = new class196();
		field2147 = new class196();
		field2151 = new class196();
	}

	class196() {
	}

	@ObfuscatedName("ag")
	public static int method4452(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;B)Ltl;",
		garbageValue = "0"
	)
	static DynamicArray method4453(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (DynamicArray)var0;
		}
	}
}
