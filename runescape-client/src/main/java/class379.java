import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public enum class379 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4201(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4200(2, 2);

	@ObfuscatedName("ac")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 293087215
	)
	public final int field4198;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 518902223
	)
	int field4202;

	class379(int var3, int var4) {
		this.field4198 = var3;
		this.field4202 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4202;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "-1116749936"
	)
	public static void method7926(AbstractArchive var0) {
		class1.VarpDefinition_archive = var0;
		VarpDefinition.field1910 = class1.VarpDefinition_archive.getGroupFileCount(16);
	}
}
