import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class416 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class566 field5060;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive4")
	static Archive archive4;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "621383475"
	)
	static char method8556(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIB)Lcc;",
		garbageValue = "-95"
	)
	static final PendingSpawn method8555(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
