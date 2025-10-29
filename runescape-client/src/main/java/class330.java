import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class330 {
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2074397494"
	)
	public static int method7260(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)Z",
		garbageValue = "-56"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
