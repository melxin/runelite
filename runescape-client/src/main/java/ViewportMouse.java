import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static final ProjectionCoord field3109;
	@ObfuscatedName("bs")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 770621097
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -459009589
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("bb")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1556503267
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("bn")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("bd")
	public static int[] field3116;

	static {
		field3109 = new ProjectionCoord();
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
		field3116 = new int[1000];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-605717746"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class114.method3585(var0, 10, true);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrx;FI)Lrx;",
		garbageValue = "-197067365"
	)
	public static final ProjectionCoord method6107(ProjectionCoord var0, float var1) {
		ProjectionCoord var2 = class30.method486(var0);
		var2.method9334(var1);
		return var2;
	}
}
