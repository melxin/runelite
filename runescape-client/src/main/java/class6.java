import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public enum class6 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	field20(0, 0);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1595182735
	)
	final int field15;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1657914651
	)
	final int field16;

	class6(int var3, int var4) {
		this.field15 = var3;
		this.field16 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "-873550757"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return class231.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldt;",
		garbageValue = "-1302722243"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		RestClientThreadFactory.method211(var1);
		Widget var4 = ClanChannel.widgetDefinition.method7031(var0);
		UserComparator8.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		WorldMapIcon_0.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Client.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
