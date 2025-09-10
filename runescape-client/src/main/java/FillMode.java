import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xk")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lxk;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxk;"
	)
	field6001(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxk;"
	)
	field6002(2, 2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1170963199
	)
	public final int field6003;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1154368451
	)
	final int field6004;

	FillMode(int var3, int var4) {
		this.field6003 = var3;
		this.field6004 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field6004;
	}
}
