import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("fb")
	static boolean field687;
	@ObfuscatedName("nz")
	static boolean field680;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1812823337
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -934798451
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1614259925
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1451809209
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -272592289
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -10543881
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ae")
	@Export("action")
	String action;
	@ObfuscatedName("aq")
	@Export("target")
	String target;
	@ObfuscatedName("ac")
	boolean field685;

	MenuAction() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	static void method1919() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class26.KeyHandler_keyCodes[186] = 57;
			class26.KeyHandler_keyCodes[187] = 27;
			class26.KeyHandler_keyCodes[188] = 71;
			class26.KeyHandler_keyCodes[189] = 26;
			class26.KeyHandler_keyCodes[190] = 72;
			class26.KeyHandler_keyCodes[191] = 73;
			class26.KeyHandler_keyCodes[192] = 58;
			class26.KeyHandler_keyCodes[219] = 42;
			class26.KeyHandler_keyCodes[220] = 74;
			class26.KeyHandler_keyCodes[221] = 43;
			class26.KeyHandler_keyCodes[222] = 59;
			class26.KeyHandler_keyCodes[223] = 28;
		} else {
			class26.KeyHandler_keyCodes[44] = 71;
			class26.KeyHandler_keyCodes[45] = 26;
			class26.KeyHandler_keyCodes[46] = 72;
			class26.KeyHandler_keyCodes[47] = 73;
			class26.KeyHandler_keyCodes[59] = 57;
			class26.KeyHandler_keyCodes[61] = 27;
			class26.KeyHandler_keyCodes[91] = 42;
			class26.KeyHandler_keyCodes[92] = 74;
			class26.KeyHandler_keyCodes[93] = 43;
			class26.KeyHandler_keyCodes[192] = 28;
			class26.KeyHandler_keyCodes[222] = 58;
			class26.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1928850565"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class275.method6241(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lok;III)V",
		garbageValue = "-2097048095"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var7 = MouseRecorder.getWidgetFlags(var0);
				int var6 = var7 >> 17 & 7;
				int var8 = var6;
				Widget var4;
				int var9;
				if (var6 == 0) {
					var4 = null;
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5;
							break;
						}

						var5 = class35.widgetDefinition.method7496(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var9;
					}
				}

				Widget var10 = var4;
				if (var4 == null) {
					var10 = var0.parent;
				}

				if (var10 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var7 = MouseRecorder.getWidgetFlags(var0);
					var6 = var7 >> 17 & 7;
					var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}

							var5 = class35.widgetDefinition.method7496(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var9;
						}
					}

					var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					SecureRandomCallable.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = Client.menu.menuOptionsCount - 1;
					if (var11 != -1) {
						class191.method4365(var11);
					}

					return;
				}
			}

		}
	}
}
