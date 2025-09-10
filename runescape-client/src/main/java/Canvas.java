import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ad")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 2068617489
	)
	static int field94;
	@ObfuscatedName("af")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1316501754"
	)
	public static boolean method338(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "([Loi;Loi;ZB)V",
		garbageValue = "29"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * 469894397;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * 1156037777;
		class537.resizeInterface(var0, var1.field4248, var1.field4214, var1.id, var1.childIndex * -217986249, var3, var4, var2);
		if (var1.children != null) {
			class537.resizeInterface(var1.children, 0, var1.children.length - 1, var1.id, -1, var3, var4, var2);
		}

		if (var1.childIndex * -217986249 == -1) {
			InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
			if (var5 != null) {
				class382.method8179(var5.group, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(II)Lwd;",
		garbageValue = "-1437045612"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(WorldMapLabelSize.field3302, class456.method9207(var0), BufferedNetSocket.method10223(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
