import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class195 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field2100")
	static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "10"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
