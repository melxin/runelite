import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class95 {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1439936663
	)
	static int field1188;

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "([Lnz;Lnz;ZI)V",
		garbageValue = "2056523368"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * 779142065;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * 1836304183;
		Tiles.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			Tiles.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			class366.method7455(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
