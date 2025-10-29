import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field3300((byte)-1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field3299((byte)0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field3304((byte)1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	field3301((byte)2);

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 1002672777
	)
	static int field3305;
	@ObfuscatedName("ae")
	@Export("id")
	final byte id;

	MoveSpeed(byte var3) {
		this.id = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1707581112"
	)
	static int method6513(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
