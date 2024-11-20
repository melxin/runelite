import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class132 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -608774375
	)
	int field1525;
	@ObfuscatedName("aw")
	float field1528;
	@ObfuscatedName("at")
	float field1526;
	@ObfuscatedName("ae")
	float field1527;
	@ObfuscatedName("ao")
	float field1524;
	@ObfuscatedName("ac")
	float field1529;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	class132 field1530;

	class132() {
		this.field1526 = Float.MAX_VALUE;
		this.field1527 = Float.MAX_VALUE;
		this.field1524 = Float.MAX_VALUE;
		this.field1529 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "-31"
	)
	void method3264(Buffer var1, int var2) {
		this.field1525 = var1.readShort();
		this.field1528 = var1.method10121();
		this.field1526 = var1.method10121();
		this.field1527 = var1.method10121();
		this.field1524 = var1.method10121();
		this.field1529 = var1.method10121();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfo;",
		garbageValue = "16776960"
	)
	static class138[] method3270() {
		return new class138[]{class138.field1600, class138.field1597, class138.field1596, class138.field1599, class138.field1598, class138.field1601};
	}
}
