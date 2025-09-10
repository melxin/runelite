import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class429 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class429 field5088;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class429 field5085;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class429 field5086;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class429 field5087;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static StudioGame field5084;

	static {
		field5088 = new class429();
		field5085 = new class429();
		field5086 = new class429();
		field5087 = new class429();
	}

	class429() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIIB)Z",
		garbageValue = "-90"
	)
	static boolean method8641(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = SpotAnimationDefinition.field2208 - var6;
		int var13 = class204.field2248 - var7;
		int var14 = class179.field1967 - var8;
		if (Math.abs(var12) > var9 + HealthBarUpdate.field1113) {
			return false;
		} else if (Math.abs(var13) > var10 + FontName.field5750) {
			return false;
		} else if (Math.abs(var14) > var11 + WorldMapCacheName.field3500) {
			return false;
		} else if (Math.abs(var14 * class179.field1965 - var13 * UserComparator6.field1591) > var10 * WorldMapCacheName.field3500 + var11 * FontName.field5750) {
			return false;
		} else if (Math.abs(var12 * UserComparator6.field1591 - var14 * class450.field5166) > var11 * HealthBarUpdate.field1113 + var9 * WorldMapCacheName.field3500) {
			return false;
		} else {
			return Math.abs(var13 * class450.field5166 - var12 * class179.field1965) <= var9 * FontName.field5750 + var10 * HealthBarUpdate.field1113;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "5438"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (UrlRequester.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = UrlRequester.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class137.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
