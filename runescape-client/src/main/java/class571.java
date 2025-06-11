import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vl")
public enum class571 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5642(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5648(2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5629(4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5630(8),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5628(16),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5632(32),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5631(64, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5634(128),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5635(256, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5636(512),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5650(1024),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5638(2048),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5654(4096),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5640(8192),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5641(16384),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5639(32768),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5627(65536),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5644(131072),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5637(262144),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5649(524288),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5646(1048576),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5643(2097152),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5647(4194304),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5645(8388608),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5651(16777216),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5652(33554432),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5653(67108864, true),
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5633(134217728),
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5655(268435456),
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5656(536870912, true),
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5657(1073741824, true),
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	field5658(Integer.MIN_VALUE);

	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1077790717
	)
	final int field5659;

	class571(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class571(int var3, boolean var4) {
		this.field5659 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5659;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1773096605"
	)
	static final int method10767() {
		return Client.menu.menuOptionsCount - 1;
	}
}
