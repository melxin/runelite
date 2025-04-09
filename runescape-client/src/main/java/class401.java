import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class401 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	Archive field4713;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -697015953
	)
	int field4714;
	@ObfuscatedName("ae")
	byte field4715;

	class401() {
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "-1401993206"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			ItemContainer.method2448(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = class141.Widget_getSpellActionName(var0);
			if (var1 != null) {
				ItemContainer.method2448(var1, Decimator.colorStartTag(65280) + var0.field4000, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class555.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class555.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class555.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class555.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class219.method4843(class31.getWidgetFlags(var0)) && (class31.selectedSpellFlags & 32) == 32) {
					ItemContainer.method2448(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * -1626125685, var0.id, var0.itemId);
				}
			} else {
				for (int var8 = 9; var8 >= 0; --var8) {
					String var9;
					if (var8 == var0.field4089 * -810698403) {
						var9 = class141.Widget_getSpellActionName(var0);
						if (var9 != null) {
							ItemContainer.method2448(var9, var0.dataText, 25, 0, var0.childIndex * -1626125685, var0.id, var0.itemId);
						}
					}

					var9 = WorldEntityCoord.method5844(var0, var8);
					if (var9 != null) {
						int var3;
						short var4;
						if (var8 > var0.field4089 * -810698403) {
							var4 = 1007;
							var3 = ItemContainer.method2448(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -1626125685, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = UserComparator6.insertMenuItem(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -1626125685, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4024 != null && var8 < var0.field4024.length && var0.field4024[var8] != null) {
							String[] var5 = var0.field4024[var8];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var8 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									SequenceDefinition.method5619(var3, var5[var6], "", var4, var7, var0.childIndex * -1626125685, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				int var2 = class31.getWidgetFlags(var0);
				boolean var10 = (var2 & 1) != 0;
				if (var10) {
					class555.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * -1626125685, var0.id);
				}
			}
		}

	}
}
