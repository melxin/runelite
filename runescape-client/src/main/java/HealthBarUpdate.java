import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1310527883
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1870888501
	)
	@Export("health")
	int health;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1572125551
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1766608137
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-16"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1035165513"
	)
	public static boolean method2833(int var0) {
		return var0 >= WorldMapDecorationType.field4074.id && var0 <= WorldMapDecorationType.field4068.id || var0 == WorldMapDecorationType.field4066.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CLph;I)C",
		garbageValue = "-2022951409"
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
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
