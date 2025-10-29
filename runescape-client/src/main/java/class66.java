import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public enum class66 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	field874(0, -1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	field873(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	field883(2, 7),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	field875(3, 8),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	field881(4, 9);

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	static Widget[] field882;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1002545705
	)
	final int field877;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -60529133
	)
	final int field878;

	class66(int var3, int var4) {
		this.field877 = var3;
		this.field878 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field878;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1460497665"
	)
	public static int method2206(int var0) {
		return class544.field5667[var0 & 2047];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Lut;",
		garbageValue = "405832279"
	)
	static DynamicArray method2205(int var0, Object var1) {
		DynamicArray var2 = (DynamicArray)var1;
		if (var2 == null) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}
}
