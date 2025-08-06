import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	field2125(1, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	field2124(2, 2);

	@ObfuscatedName("as")
	public static short[][] field2127;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1489769599
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1349474371
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-615912838"
	)
	public static boolean method4379(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1967341141"
	)
	static final void method4380(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		TaskHandler.method5886((double)var1);
	}
}
