import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public enum class144 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1679(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1677(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1678(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1686(3, 3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1680(4, 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1676(5, 5),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1682(6, 6),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1683(7, 7),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1684(8, 8);

	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1641061029
	)
	final int field1685;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -833913403
	)
	final int field1681;

	class144(int var3, int var4) {
		this.field1685 = var3;
		this.field1681 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1681;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lix;",
		garbageValue = "8"
	)
	static class230 method3627() {
		return class230.field2511;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)Luf;",
		garbageValue = "799903470"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return WorldMapArea.platformInfo;
	}
}
