import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public enum class386 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4423(0, 0, false, false),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4421(1, 1, true, false),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4422(2, 2, true, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4427(3, 3, true, true); // ??

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1777562733
	)
	final int field4426;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 205014581
	)
	final int field4424;
	@ObfuscatedName("aj")
	public final boolean field4425;
	@ObfuscatedName("ak")
	public final boolean field4420;

	class386(int var3, int var4, boolean var5, boolean var6) {
		this.field4426 = var3;
		this.field4424 = var4;
		this.field4425 = var5;
		this.field4420 = var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4424;
	}
}
