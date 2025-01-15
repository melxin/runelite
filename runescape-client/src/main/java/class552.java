import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public enum class552 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5434(1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5426(2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5428(4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5445(8),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5430(16),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5446(32),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5432(64, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5452(128),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5441(256, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5435(512),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5427(1024),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5437(2048),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5438(4096),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5439(8192),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5440(16384),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5429(32768),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5442(65536),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5433(131072),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5444(262144),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5453(524288),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5455(1048576),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5443(2097152),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5448(4194304),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5449(8388608),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5450(16777216),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5451(33554432),
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5436(67108864, true),
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5447(134217728),
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5454(268435456),
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5431(536870912, true),
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5456(1073741824, true),
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	field5457(Integer.MIN_VALUE);

	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 156122405
	)
	final int field5458;

	class552(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class552(int var3, boolean var4) {
		this.field5458 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5458;
	}
}
