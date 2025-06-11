import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	static IndexedSprite field270;
	@ObfuscatedName("jb")
	static String field267;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILkf;I)Z",
		garbageValue = "-1878565050"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lbh;III)V",
		garbageValue = "899467936"
	)
	static final void method741(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			PlayerType.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lcz;ZB)V",
		garbageValue = "0"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			ClientPreferences.widgetDefinition.method7289(var2);
		}

		for (WidgetConfigNode var4 = (WidgetConfigNode)Client.widgetFlags.first(); var4 != null; var4 = (WidgetConfigNode)Client.widgetFlags.next()) {
			if ((long)var2 == (var4.key >> 48 & 65535L)) {
				var4.remove();
			}
		}

		Widget var5 = ClientPreferences.widgetDefinition.method7286(var3);
		if (var5 != null) {
			ScriptFrame.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			UserComparator10.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
