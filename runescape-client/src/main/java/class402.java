import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public enum class402 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4863(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4868(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	field4861(2, 2);

	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1598981191
	)
	static int field4864;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1573211635
	)
	public final int field4862;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 512803091
	)
	final int field4865;

	class402(int var3, int var4) {
		this.field4862 = var3;
		this.field4865 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4865;
	}
}
