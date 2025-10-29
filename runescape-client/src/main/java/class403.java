import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public enum class403 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	field4873(-1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	field4870(0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	field4872(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	field4874(2);

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -904125937
	)
	final int field4871;

	class403(int var3) {
		this.field4871 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4871;
	}
}
