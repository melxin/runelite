import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class class455 {
	@ObfuscatedName("av")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("at")
	static long[] field5212;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field5212 = new long[12];

		for (int var0 = 0; var0 < field5212.length; ++var0) {
			field5212[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)Lvs;",
		garbageValue = "-630590717"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Skills.worldMap;
	}
}
