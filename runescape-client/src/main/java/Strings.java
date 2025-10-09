import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fe")
	public static String field4686;
	@ObfuscatedName("kp")
	public static String field4777;
	@ObfuscatedName("ka")
	public static String field4626;
	@ObfuscatedName("lz")
	public static String field4779;

	static {
		field4686 = "Please visit the support page for assistance.";
		field4777 = "";
		field4626 = "Page has opened in the browser.";
		field4779 = "";
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	static void method8218() {
		if (class159.localPlayer.x >> 7 == Client.destinationX && class159.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
