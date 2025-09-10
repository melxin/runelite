import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class446 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpg;",
		garbageValue = "1882011353"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4817, PlayerType.field4834, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.field4826, PlayerType.field4832, PlayerType.field4823, PlayerType.PlayerType_normal, PlayerType.field4829, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4821, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4827, PlayerType.field4828, PlayerType.field4830, PlayerType.field4824};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	public static void method8923() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1588775097"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + class134.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class134.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class134.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method8916(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		class259.method5906((double)var1);
	}
}
