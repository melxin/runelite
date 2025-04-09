import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class442 field2299;
	@ObfuscatedName("bz")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -320820321
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -47929649
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("bw")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 822436175
	)
	@Export("ViewportMouse_entityCount")
	static int ViewportMouse_entityCount;
	@ObfuscatedName("be")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		field2299 = new class442();
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}
}
