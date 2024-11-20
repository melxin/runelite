import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class96 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1868343462"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
