import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("WidgetConfigNode")
public class WidgetConfigNode extends Node {
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1247489297
	)
	@Export("start")
	final int start;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1508033891
	)
	@Export("end")
	final int end;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1825652171
	)
	@Export("clickMask")
	final int clickMask;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2063023149
	)
	@Export("opMask")
	final int opMask;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("nextWidgetConfigNode")
	WidgetConfigNode nextWidgetConfigNode;

	WidgetConfigNode(int var1, int var2, int var3, int var4) {
		this.start = var1;
		this.end = var2;
		this.clickMask = var3;
		this.opMask = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2140075893"
	)
	public int method7744() {
		return this.clickMask;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	public int method7745() {
		return this.opMask;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-9"
	)
	static final boolean method7755() {
		return Client.isMenuOpen;
	}
}
