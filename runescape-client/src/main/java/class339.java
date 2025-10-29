import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public final class class339 {
	@ObfuscatedName("ag")
	static final HashMap field3866;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1378093337
	)
	public static int field3870;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1714049539
	)
	static int field3865;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		field3866 = new HashMap();
		TimeZone var0;
		synchronized(field3866) {
			TimeZone var2 = (TimeZone)field3866.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3866.put("Europe/London", var2);
			}

			var0 = var2;
		}

		Calendar.getInstance(var0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2112697734"
	)
	public static boolean method7287(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lbn;",
		garbageValue = "-1303001442"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class217.getNextWorldListWorld();
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "([Lof;Lof;ZI)V",
		garbageValue = "229322667"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * -1946208531;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * -905446999;
		class452.resizeInterface(var0, var1.field4236, var1.field4241, var1.id, var1.childIndex * 2077538819, var3, var4, var2);
		if (var1.children != null) {
			class452.resizeInterface(var1.children, 0, var1.children.length - 1, var1.id, -1, var3, var4, var2);
		}

		if (var1.childIndex * 2077538819 == -1) {
			InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
			if (var5 != null) {
				ActorSpotAnim.method10602(var5.group, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIIIII)V",
		garbageValue = "-714083267"
	)
	static final void method7286(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field482) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field482 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class376.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class376.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class376.invalidateWidget(var0);
				Client.field482 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * -1946208531;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class376.invalidateWidget(var0);
			}
		}

	}
}
