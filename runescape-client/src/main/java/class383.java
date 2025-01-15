import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public enum class383 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4488(-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4486(0),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4487(1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4485(2);

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -286042239
	)
	static int field4491;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1596427081
	)
	final int field4492;

	class383(int var3) {
		this.field4492 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4492;
	}
}
