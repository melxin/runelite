import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wz")
public class class595 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public static final class595 field5970;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public static final class595 field5974;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class595 field5971;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class595 field5972;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class595 field5969;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class595 field5973;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1452716097
	)
	final int field5975;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1808872637
	)
	final int field5976;

	static {
		field5970 = new class595(2, 0);
		field5974 = new class595(4, 2);
		field5971 = new class595(5, 5);
		field5972 = new class595(0, 6);
		field5969 = new class595(3, 7);
		field5973 = new class595(1, 8);
	}

	class595(int var1, int var2) {
		this.field5975 = var1;
		this.field5976 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5976;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035084470"
	)
	public boolean method11512() {
		return this == field5974;
	}
}
