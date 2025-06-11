import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class178 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfb;",
		garbageValue = "-791407420"
	)
	static class144[] method3967() {
		return new class144[]{class144.field1679, class144.field1677, class144.field1678, class144.field1686, class144.field1680, class144.field1676, class144.field1682, class144.field1683, class144.field1684};
	}
}
