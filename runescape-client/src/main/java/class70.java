import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class70 {
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbu;",
		garbageValue = "1"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIZI)V",
		garbageValue = "1910838794"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width * -1946208531;
		int var5 = var0.height * -905446999;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth * 1190762213;
		} else if (var0.widthAlignment == 1) {
			var0.width = (var1 - var0.rawWidth) * 1190762213;
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1 >> 14) * 1190762213;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * -1551910247;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * -1551910247;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * -1551910247;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field4231 * -905446999 / var0.field4232 * 1190762213;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field4232 * var0.width * -1946208531 / var0.field4231 * -1551910247;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method8194().method7880(var0.width * -1946208531, var0.height * -905446999);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width * -1946208531 || var5 != var0.height * -905446999)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
