import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class409 extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field4989;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	Archive field4986;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1096001883
	)
	int field4985;
	@ObfuscatedName("ag")
	byte field4984;

	class409() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CLqd;I)C",
		garbageValue = "-1309102883"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-1207103039"
	)
	static void method8389(WorldView var0) {
		if (UserComparator3.field1576 != null && Client.field557 > 0) {
			int var1 = Client.field565 * 128;
			class143.method3828(var0, var1, UserComparator3.field1576);
		}

	}
}
