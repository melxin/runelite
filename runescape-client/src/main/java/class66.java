import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public enum class66 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field899(0, -1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field893(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field900(2, 7),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field895(3, 8),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field896(4, 9);

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static Task field894;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 522005819
	)
	final int field897;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1587590837
	)
	final int field901;

	class66(int var3, int var4) {
		this.field897 = var3;
		this.field901 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field901;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1707514886"
	)
	static int method2187(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class82.method2866() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
