import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class141 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1702;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1683;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1684;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1685;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1686;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1687;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1688;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1682;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1690;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1691;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1692;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1693;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1699;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1697;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1696;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1700;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	static final class141 field1695;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field1694;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1198107101
	)
	final int field1689;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 83983233
	)
	final int field1698;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -830743683
	)
	final int field1701;

	static {
		field1702 = new class141(0, 0, (String)null, -1, -1);
		field1683 = new class141(1, 1, (String)null, 0, 2);
		field1684 = new class141(2, 2, (String)null, 1, 2);
		field1685 = new class141(3, 3, (String)null, 2, 2);
		field1686 = new class141(4, 4, (String)null, 3, 1);
		field1687 = new class141(5, 5, (String)null, 4, 1);
		field1688 = new class141(6, 6, (String)null, 5, 1);
		field1682 = new class141(7, 7, (String)null, 6, 3);
		field1690 = new class141(8, 8, (String)null, 7, 3);
		field1691 = new class141(9, 9, (String)null, 8, 3);
		field1692 = new class141(10, 10, (String)null, 0, 7);
		field1693 = new class141(11, 11, (String)null, 1, 7);
		field1699 = new class141(12, 12, (String)null, 2, 7);
		field1697 = new class141(13, 13, (String)null, 3, 7);
		field1696 = new class141(14, 14, (String)null, 4, 7);
		field1700 = new class141(15, 15, (String)null, 5, 7);
		field1695 = new class141(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class141(int var1, int var2, String var3, int var4, int var5) {
		this.field1689 = var1;
		this.field1698 = var2;
		this.field1701 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1698;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method3875() {
		return this.field1701;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lcg;I)V",
		garbageValue = "1856325427"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		LoginType.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lwi;",
		garbageValue = "185472044"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class177.field1946.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method11491(new Buffer(var2));
			}

			var1.method11505();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)V",
		garbageValue = "-1951975841"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && KitDefinition.method4386(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = KitDefinition.method4386(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class201.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menu.menuOptionsCount - 1;
				if (var3 != -1) {
					class329.method7255(var3);
				}

			}
		}
	}
}
