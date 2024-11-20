import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public final class class416 {
	@ObfuscatedName("aj")
	static int[][] field4723;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "26934"
	)
	static int method7986(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-253253913"
	)
	public static void method7985() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
