import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xn")
public class class604 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	public static final class604 field6077;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	public static final class604 field6072;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	static final class604 field6073;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	static final class604 field6074;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	static final class604 field6078;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	static final class604 field6076;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -666243253
	)
	final int field6075;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2098599481
	)
	final int field6071;

	static {
		field6077 = new class604(3, 0);
		field6072 = new class604(2, 2);
		field6073 = new class604(5, 5);
		field6074 = new class604(1, 6);
		field6078 = new class604(0, 7);
		field6076 = new class604(4, 8);
	}

	class604(int var1, int var2) {
		this.field6075 = var1;
		this.field6071 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field6071;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	public boolean method11953() {
		return this == field6072;
	}
}
