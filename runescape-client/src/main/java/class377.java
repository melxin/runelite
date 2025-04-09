import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public enum class377 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4189(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4186(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4191(2, 2);

	@ObfuscatedName("pm")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1707415641
	)
	public final int field4188;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1690496211
	)
	int field4185;

	class377(int var3, int var4) {
		this.field4188 = var3;
		this.field4185 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4185;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "-381028447"
	)
	public static void method7553(String[] var0, int[] var1) {
		Actor.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}
}
