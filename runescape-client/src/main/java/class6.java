import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public enum class6 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	field16(0, 0);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 866126915
	)
	public final int field14;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2089926171
	)
	final int field15;

	class6(int var3, int var4) {
		this.field14 = var3;
		this.field15 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	static void method32() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
