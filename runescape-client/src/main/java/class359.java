import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class359 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -790338677
	)
	public int field4074;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1361350001
	)
	public int field4069;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2110717437
	)
	public int field4070;

	class359() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "698014846"
	)
	public static String method7518(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
