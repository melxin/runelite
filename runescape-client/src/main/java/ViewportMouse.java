import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static final class445 field2951;
	@ObfuscatedName("bl")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 317529445
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1184550409
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("bq")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1755695005
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("bc")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		field2951 = new class445();
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "([Lov;IIIIIIZB)V",
		garbageValue = "94"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		for (int var8 = var1; var8 <= var2; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var3 == var9.parentId && var4 == var9.field4127) {
				Occluder.alignWidgetSize(var9, var5, var6, var7);
				class228.alignWidgetPosition(var9, var5, var6);
				if (var9.scrollX > var9.scrollWidth - var9.width * -1805166981) {
					var9.scrollX = var9.scrollWidth - var9.width * -1805166981;
				}

				if (var9.scrollX < 0) {
					var9.scrollX = 0;
				}

				if (var9.scrollY > var9.scrollHeight - var9.height * -2133353239) {
					var9.scrollY = var9.scrollHeight - var9.height * -2133353239;
				}

				if (var9.scrollY < 0) {
					var9.scrollY = 0;
				}

				if (var9.type == 0) {
					ClanSettings.revalidateWidgetScroll(var0, var9, var7);
				}
			}
		}

	}
}
