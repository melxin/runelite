import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gj")
public class class163 extends class149 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 684515493
	)
	int field1822;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class163(class152 var1) {
		this.this$0 = var1;
		this.field1822 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1822 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3751(this.field1822);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-788083369"
	)
	static int method3833(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex * -744024149;
			return 1;
		} else {
			int var4;
			if (var0 == 1703) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				ParamComposition var7 = TaskHandler.getParamDefinition(var4);
				if (var7.isString()) {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3.method7752(var4, var7.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method7753(var4, var7.defaultInt);
				}

				return 1;
			} else if (var0 == 1704) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Object var5 = PlayerType.method7974(var4);
				int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var3.method7754(var6, var5);
				return 1;
			} else if (var0 == 1707) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method7841() ? 1 : 0;
				return 1;
			} else if (var0 == 1708) {
				return DevicePcmPlayerProvider.method327(var3);
			} else {
				return var0 == 1709 ? class114.method3308(var3) : 2;
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-18"
	)
	static final void method3834(int var0, int var1, int var2) {
		if (class6.cameraX < var0) {
			class6.cameraX = (var0 - class6.cameraX) * WorldMapData_0.field3133 / 1000 + class6.cameraX + class148.field1710;
			if (class6.cameraX > var0) {
				class6.cameraX = var0;
			}
		}

		if (class6.cameraX > var0) {
			class6.cameraX -= (class6.cameraX - var0) * WorldMapData_0.field3133 / 1000 + class148.field1710;
			if (class6.cameraX < var0) {
				class6.cameraX = var0;
			}
		}

		if (ClientPreferences.cameraY < var1) {
			ClientPreferences.cameraY = (var1 - ClientPreferences.cameraY) * WorldMapData_0.field3133 / 1000 + ClientPreferences.cameraY + class148.field1710;
			if (ClientPreferences.cameraY > var1) {
				ClientPreferences.cameraY = var1;
			}
		}

		if (ClientPreferences.cameraY > var1) {
			ClientPreferences.cameraY -= (ClientPreferences.cameraY - var1) * WorldMapData_0.field3133 / 1000 + class148.field1710;
			if (ClientPreferences.cameraY < var1) {
				ClientPreferences.cameraY = var1;
			}
		}

		if (GrandExchangeOfferAgeComparator.cameraZ < var2) {
			GrandExchangeOfferAgeComparator.cameraZ = (var2 - GrandExchangeOfferAgeComparator.cameraZ) * WorldMapData_0.field3133 / 1000 + GrandExchangeOfferAgeComparator.cameraZ + class148.field1710;
			if (GrandExchangeOfferAgeComparator.cameraZ > var2) {
				GrandExchangeOfferAgeComparator.cameraZ = var2;
			}
		}

		if (GrandExchangeOfferAgeComparator.cameraZ > var2) {
			GrandExchangeOfferAgeComparator.cameraZ -= (GrandExchangeOfferAgeComparator.cameraZ - var2) * WorldMapData_0.field3133 / 1000 + class148.field1710;
			if (GrandExchangeOfferAgeComparator.cameraZ < var2) {
				GrandExchangeOfferAgeComparator.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1939748619"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
			VerticalAlignment.updateInterface(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(IILnr;B)I",
		garbageValue = "-10"
	)
	static int method3836(int var0, int var1, SpriteMask var2) {
		int var3 = var2.width / 2 + var0;
		int var4 = var2.height / 2 + var1;
		int var5 = MouseHandler.MouseHandler_x - var3;
		int var6 = MouseHandler.MouseHandler_y - var4;
		int var7 = class453.method8935(var6, var5);
		var7 -= Client.camAngleY;
		var7 &= 2047;
		return class384.method7943(var7);
	}
}
