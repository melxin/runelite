import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public enum class508 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	field5266(0, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	field5263(1, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	field5262(2, 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	field5265(3, 10);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -346643375
	)
	final int field5267;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1652712379
	)
	final int field5264;

	class508(int var3, int var4) {
		this.field5267 = var3;
		this.field5264 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5264;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
