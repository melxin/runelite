import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 165529761
	)
	public static int field2962;

	ModelData0() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-896863894"
	)
	static Date method5773() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lox;IIZI)V",
		garbageValue = "-1056768743"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height * -1326764757;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * 1782851971;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * 1782851971;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * 1782851971;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field4084 * var0.height * -1326764757 / var0.field4085;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field4085 * var0.width / var0.field4084 * 1782851971;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7935().method7585(var0.width, var0.height * -1326764757);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height * -1326764757)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
