import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public enum class6 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	field16(0, 0);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1503257161
	)
	public final int field14;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1913006529
	)
	final int field15;

	class6(int var3, int var4) {
		this.field14 = var3;
		this.field15 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-825469743"
	)
	public static void method39() {
		class180.field1851.clear();
	}
}
