import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public enum class93 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1110(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1109(1, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1112(2, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1117(3, 4),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1113(4, 5),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1114(5, 6);

	@ObfuscatedName("dr")
	static boolean field1111;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static IndexedSprite field1118;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -203307499
	)
	final int field1115;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -774392109
	)
	final int field1116;

	class93(int var3, int var4) {
		this.field1115 = var3;
		this.field1116 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1116;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-91"
	)
	static final int method2647(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	public static void method2651() {
		FileSystem.FileSystem_cacheFiles.clear();
	}
}
