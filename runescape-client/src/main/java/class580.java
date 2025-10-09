import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wo")
public enum class580 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5925(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5914(2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5920(4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5916(8),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5917(16),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5921(32),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5919(64, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5918(128),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5927(256, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5922(512),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5923(1024),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5924(2048),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5938(4096),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5926(8192),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5936(16384),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5928(32768),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5929(65536),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5930(131072),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5931(262144),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5915(524288),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5933(1048576),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5934(2097152),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5935(4194304),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5943(8388608),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5937(16777216),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5932(33554432),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5939(67108864, true),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5913(134217728),
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5941(268435456),
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5942(536870912, true),
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5944(1073741824, true),
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5945(Integer.MIN_VALUE);

	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -499583603
	)
	final int field5940;

	class580(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class580(int var3, boolean var4) {
		this.field5940 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5940;
	}
}
