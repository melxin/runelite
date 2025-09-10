import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public enum class398 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4840(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4839(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4844(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4841(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4838(-1, -1);

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2010354431
	)
	final int field4842;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1714261557
	)
	final int field4843;

	class398(int var3, int var4) {
		this.field4842 = var3;
		this.field4843 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4843;
	}
}
