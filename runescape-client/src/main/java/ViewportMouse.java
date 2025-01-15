import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ay")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 817069503
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1688319745
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ao")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1882311153
	)
	static int field2267;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1552819489
	)
	static int field2262;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	public static class426 field2268;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1009263401
	)
	@Export("ViewportMouse_entityCount")
	static int ViewportMouse_entityCount;
	@ObfuscatedName("ak")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		field2268 = new class426();
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}
}
