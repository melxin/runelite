import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class357 extends Node {
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
	final int field3956;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1851820471
	)
	final int field3957;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2073771595
	)
	final int field3958;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -368810727
	)
	final int field3955;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class357 field3959;

	class357(int var1, int var2, int var3, int var4) {
		this.field3956 = var1;
		this.field3957 = var2;
		this.field3958 = var3;
		this.field3955 = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-970726199"
	)
	public int method7475() {
		return this.field3958;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "40"
	)
	public int method7474() {
		return this.field3955;
	}
}
