import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public final class class437 {
	@ObfuscatedName("ab")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("ay")
	static long[] field4877;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4877 = new long[12];

		for (int var0 = 0; var0 < field4877.length; ++var0) {
			field4877[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lwy;",
		garbageValue = "780773620"
	)
	@Export("FillMode_values")
	public static class581[] FillMode_values() {
		return new class581[]{class581.field5655, class581.field5654, class581.SOLID};
	}
}
