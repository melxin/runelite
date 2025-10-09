import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class178 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhz;",
		garbageValue = "9"
	)
	public static class202 method4207(int var0) {
		class202 var1 = (class202)class202.field2228.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ScriptFrame.field240.takeFile(72, var0);
			var1 = new class202();
			var1.field2222 = var0;
			if (var2 != null) {
				var1.method4515(new Buffer(var2));
			}

			var1.method4517();
			class202.field2228.put(var1, (long)var0);
			return var1;
		}
	}
}
