import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 70477995
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -3451756420657839043L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 985204991
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -496937227
	)
	@Export("z")
	int z;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 504071911
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1044397321
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1193957357
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -158811479
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1581408207
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -499861321
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -149041761
	)
	int field3059;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -251231821
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -773460857
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "272039198"
	)
	public static int method5796(int var0) {
		return var0 >> 14 & 1023;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "-74"
	)
	public static void method5795(String[] var0, int[] var1) {
		class567.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-691908688"
	)
	static void method5797(int var0) {
		for (WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.first(); var1 != null; var1 = (WidgetConfigNode)Client.widgetFlags.next()) {
			if ((var1.key >> 16 & 65535L) == (long)var0) {
				var1.remove();
			}
		}

	}
}
