import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public enum class563 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5538(1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5521(2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5549(4),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5522(8),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5524(16),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5525(32),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5553(64, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5527(128),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5528(256, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5539(512),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5530(1024),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5531(2048),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5532(4096),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5520(8192),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5534(16384),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5535(32768),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5536(65536),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5537(131072),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5542(262144),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5523(524288),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5548(1048576),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5541(2097152),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5545(4194304),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5543(8388608),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5544(16777216),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5533(33554432),
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5526(67108864, true),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5540(134217728),
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5546(268435456),
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5529(536870912, true),
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5550(1073741824, true),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	field5551(Integer.MIN_VALUE);

	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1006600599
	)
	final int field5552;

	class563(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class563(int var3, boolean var4) {
		this.field5552 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5552;
	}
}
