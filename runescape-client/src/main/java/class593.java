import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wz")
public class class593 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public static final class593 field6035;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	public static final class593 field6034;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class593 field6038;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class593 field6033;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class593 field6037;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static final class593 field6036;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 830002933
	)
	final int field6039;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -92076057
	)
	final int field6040;

	static {
		field6035 = new class593(3, 0);
		field6034 = new class593(0, 2);
		field6038 = new class593(5, 5);
		field6033 = new class593(1, 6);
		field6037 = new class593(4, 7);
		field6036 = new class593(2, 8);
	}

	class593(int var1, int var2) {
		this.field6039 = var1;
		this.field6040 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field6040;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1964985179"
	)
	public boolean method11670() {
		return this == field6034;
	}
}
