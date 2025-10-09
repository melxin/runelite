import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public enum class393 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4851(-1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4850(0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4849(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4852(2);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -469330151
	)
	final int field4853;

	class393(int var3) {
		this.field4853 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4853;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)Ltl;",
		garbageValue = "64"
	)
	public static DynamicArray method8268(String[] var0) {
		DynamicArray var1 = new DynamicArray(class572.field5877, false);
		var1.field5576 = var0;
		var1.size = var0.length * 1093200759;
		var1.field5572 = var0.length;
		return var1;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldm;III)V",
		garbageValue = "16473220"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class263.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
