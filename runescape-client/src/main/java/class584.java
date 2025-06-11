import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wc")
public class class584 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	public static final class584 field5746;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	public static final class584 field5748;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final class584 field5745;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final class584 field5752;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final class584 field5749;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final class584 field5750;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 568496815
	)
	final int field5751;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1701016191
	)
	final int field5747;

	static {
		field5746 = new class584(2, 0);
		field5748 = new class584(1, 2);
		field5745 = new class584(4, 5);
		field5752 = new class584(5, 6);
		field5749 = new class584(3, 7);
		field5750 = new class584(0, 8);
	}

	class584(int var1, int var2) {
		this.field5751 = var1;
		this.field5747 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-103"
	)
	public boolean method11148() {
		return this == field5748;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5747;
	}
}
