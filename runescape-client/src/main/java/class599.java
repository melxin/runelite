import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xh")
public enum class599 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	field5899(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	field5897(2, 2);

	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -488888901
	)
	public final int field5900;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1955429139
	)
	final int field5898;

	class599(int var3, int var4) {
		this.field5900 = var3;
		this.field5898 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5898;
	}
}
