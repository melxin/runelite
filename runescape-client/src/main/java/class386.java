import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public enum class386 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4571(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4570(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("TOKEN")
	TOKEN(2, 2);

	@ObfuscatedName("av")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("aj")
	@Export("osName")
	static String osName;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1483723955
	)
	final int field4576;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -959440779
	)
	final int field4569;

	class386(int var3, int var4) {
		this.field4576 = var3;
		this.field4569 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4569;
	}
}
