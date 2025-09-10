import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public enum class380 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4374(0, 0, false, false),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4378(1, 1, true, false),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4373(2, 2, true, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4371 = field4373;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1822191657
	)
	final int field4376;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1059864433
	)
	final int field4375;
	@ObfuscatedName("aq")
	public final boolean field4372;
	@ObfuscatedName("ao")
	public final boolean field4377;

	class380(int var3, int var4, boolean var5, boolean var6) {
		this.field4376 = var3;
		this.field4375 = var4;
		this.field4372 = var5;
		this.field4377 = var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4375;
	}
}
