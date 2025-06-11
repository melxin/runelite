import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
public class class507 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2147464167"
	)
	public static String method9926(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
