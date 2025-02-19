import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hr")
public class class196 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "-18212"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1838750947"
	)
	static int method3984(int var0, Script var1, boolean var2) {
		Widget var3 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.width * 779142065;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.height * 1836304183;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
