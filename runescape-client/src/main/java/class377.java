import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public enum class377 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4338(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4334(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4335(2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4336(3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4337(4);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -137820307
	)
	final int field4340;

	class377(int var3) {
		this.field4340 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4340;
	}
}
