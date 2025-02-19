import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public enum class377 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4171(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	field4170(2, 2);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1837252563
	)
	public final int field4173;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -317192639
	)
	int field4172;

	class377(int var3, int var4) {
		this.field4173 = var3;
		this.field4172 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4172;
	}
}
