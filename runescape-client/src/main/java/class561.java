import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class561 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public static final class561 field5523;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public static final class561 field5529;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final class561 field5525;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final class561 field5526;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final class561 field5527;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final class561 field5528;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -51509853
	)
	final int field5524;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1600028359
	)
	final int field5530;

	static {
		field5523 = new class561(3, 0);
		field5529 = new class561(1, 2);
		field5525 = new class561(5, 5);
		field5526 = new class561(4, 6);
		field5527 = new class561(0, 7);
		field5528 = new class561(2, 8);
	}

	class561(int var1, int var2) {
		this.field5524 = var1;
		this.field5530 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2112067926"
	)
	public boolean method10412() {
		return this == field5529;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5530;
	}
}
