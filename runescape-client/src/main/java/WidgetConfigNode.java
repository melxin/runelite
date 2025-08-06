import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("WidgetConfigNode")
public class WidgetConfigNode extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -84860095
	)
	@Export("start")
	final int start;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1851820471
	)
	@Export("end")
	final int end;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2073771595
	)
	@Export("clickMask")
	final int clickMask;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -368810727
	)
	@Export("opMask")
	final int opMask;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("nextWidgetConfigNode")
	WidgetConfigNode nextWidgetConfigNode;

	WidgetConfigNode(int var1, int var2, int var3, int var4) {
		this.start = var1;
		this.end = var2;
		this.clickMask = var3;
		this.opMask = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-970726199"
	)
	public int method7475() {
		return this.clickMask;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "40"
	)
	public int method7474() {
		return this.opMask;
	}
}
