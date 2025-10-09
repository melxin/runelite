import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class381 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4430(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4427(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4426(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 834976349
	)
	public final int field4428;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1247562781
	)
	int field4429;

	class381(int var3, int var4) {
		this.field4428 = var3;
		this.field4429 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4429;
	}
}
