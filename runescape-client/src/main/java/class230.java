import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class230 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;
	@ObfuscatedName("ww")
	static List field2489;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "737624929"
	)
	static void method5124() {
		if (GameEngine.topLevelWorldView != null) {
			GameEngine.topLevelWorldView.scene.method4211(class544.clientPreferences.getDrawDistance());
		}

	}
}
