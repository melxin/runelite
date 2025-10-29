import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uv")
public enum class526 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	field5579(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	field5582(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	field5580(2, 2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1559968503
	)
	final int field5578;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1929086875
	)
	final int field5581;

	class526(int var3, int var4) {
		this.field5578 = var3;
		this.field5581 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5581;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;S)V",
		garbageValue = "265"
	)
	static void method10648(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field4236; var2 <= var0.field4241; ++var2) {
				Widget var3 = var1.children[var2];
				if (var3 != null && var0.childIndex * 2077538819 == var3.field4234) {
					method10648(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * 2077538819] = null;
	}
}
