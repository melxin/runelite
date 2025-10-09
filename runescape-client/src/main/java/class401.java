import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class401 {
	@ObfuscatedName("ld")
	@Export("worldHost")
	static String worldHost;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-20"
	)
	static boolean method8315(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
