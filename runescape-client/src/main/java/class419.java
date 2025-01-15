import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public final class class419 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1866255552"
	)
	public static int method8220(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)V",
		garbageValue = "-1747181726"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			TaskHandler.method4908(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = class47.Widget_getSpellActionName(var0);
			if (var1 != null) {
				TaskHandler.method4908(var1, WorldViewManager.colorStartTag(65280) + var0.field4006, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class6.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class6.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class6.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class6.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class141.method3509(class232.getWidgetFlags(var0)) && (class106.selectedSpellFlags & 32) == 32) {
					TaskHandler.method4908(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var9 = 9; var9 >= 0; --var9) {
					String var2;
					if (var9 == var0.field3958 * 1920625471) {
						var2 = class47.Widget_getSpellActionName(var0);
						if (var2 != null) {
							TaskHandler.method4908(var2, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
						}
					}

					if (!class250.method5357(class232.getWidgetFlags(var0), var9) && var0.onOp == null) {
						var2 = null;
					} else if (var0.actions != null && var0.actions.length > var9 && var0.actions[var9] != null && var0.actions[var9].trim().length() != 0) {
						var2 = var0.actions[var9];
					} else {
						var2 = null;
					}

					if (var2 != null) {
						int var4;
						short var5;
						if (var9 > var0.field3958 * 1920625471) {
							var5 = 1007;
							var4 = TaskHandler.method4908(var2, var0.dataText, var5, var9 + 1, var0.childIndex, var0.id, var0.itemId);
						} else {
							var5 = 57;
							var4 = class231.insertMenuItem(var2, var0.dataText, var5, var9 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field3957 != null && var9 < var0.field3957.length && var0.field3957[var9] != null) {
							String[] var6 = var0.field3957[var9];

							for (int var7 = var6.length - 1; var7 >= 0; --var7) {
								int var8 = var7 + 1 << 16 | var9 + 1;
								if (var6[var7] != null && !var6[var7].isEmpty()) {
									FontName.method9934(var4, var6[var7], "", var5, var8, var0.childIndex, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				if (class248.method5351(class232.getWidgetFlags(var0))) {
					class6.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
