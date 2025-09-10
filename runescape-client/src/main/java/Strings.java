import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fb")
	public static String field4609;
	@ObfuscatedName("kv")
	public static String field4745;
	@ObfuscatedName("kt")
	public static String field4793;
	@ObfuscatedName("lf")
	public static String field4747;

	static {
		field4609 = "Please visit the support page for assistance.";
		field4745 = "";
		field4793 = "Page has opened in the browser.";
		field4747 = "";
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	static void method8221() {
		if (DynamicObject.worldMap != null) {
			DynamicObject.worldMap.method10649(class333.topLevelWorldView.plane, (Client.field552 >> 7) + class333.topLevelWorldView.baseX, (Client.field337 >> 7) + class333.topLevelWorldView.baseY, false);
			DynamicObject.worldMap.loadCache();
		}

	}
}
