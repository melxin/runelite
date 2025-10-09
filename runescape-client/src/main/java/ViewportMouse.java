import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class450 field2955;
	@ObfuscatedName("bb")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1995247465
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1034591313
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("bm")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 851039837
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("bv")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("bi")
	public static int[] field2958;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	static IndexedSprite[] field2951;

	static {
		field2955 = new class450();
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
		field2958 = new int[1000];
	}
}
