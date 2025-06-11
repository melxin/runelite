import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class182 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "-87"
	)
	static class137 method3993(int var0) {
		class137 var1 = (class137)class175.findEnumerated(SecureUrlRequester.method3358(), var0);
		if (var1 == null) {
			var1 = class137.field1620;
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1677146219"
	)
	static void method3994() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-58"
	)
	static void method3997(int[] var0, int var1, int var2) {
		while (var1 < var2) {
			int var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1555809520"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						GrandExchangeOfferAgeComparator.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	static void method3995(int var0) {
		class31.tempMenuAction = new MenuAction();
		class31.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		class31.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		class31.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		class31.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		class31.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		class31.tempMenuAction.action = Client.menu.menuActions[var0];
		class31.tempMenuAction.target = Client.menu.menuTargets[var0];
		class31.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		class31.tempMenuAction.field723 = Client.menu.menuShiftClick[var0];
	}
}
