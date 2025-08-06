import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wt")
public enum class578 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5781(1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5752(2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5753(4),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5754(8),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5763(16),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5756(32),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5757(64, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5758(128),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5759(256, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5760(512),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5761(1024),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5770(2048),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5772(4096),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5764(8192),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5765(16384),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5774(32768),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5767(65536),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5768(131072),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5769(262144),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5775(524288),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5771(1048576),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5783(2097152),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5773(4194304),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5782(8388608),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5762(16777216),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5776(33554432),
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5751(67108864, true),
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5778(134217728),
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5779(268435456),
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5780(536870912, true),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5766(1073741824, true),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	field5777(Integer.MIN_VALUE);

	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1482331875
	)
	final int field5755;

	class578(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class578(int var3, boolean var4) {
		this.field5755 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5755;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	public static void method11153() {
		KitDefinition.KitDefinition_cached.clear();
	}
}
