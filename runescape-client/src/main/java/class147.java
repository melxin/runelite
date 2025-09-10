import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public enum class147 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1746(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1741(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1742(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1743(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1744(4, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1747(5, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1745(6, 6),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1740(7, 7),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1748(8, 8);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1380100275
	)
	final int field1749;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1144934615
	)
	final int field1750;

	class147(int var3, int var4) {
		this.field1749 = var3;
		this.field1750 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1750;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public static void method3790() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}
}
