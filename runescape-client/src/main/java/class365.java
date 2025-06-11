import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("op")
public class class365 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public class367 field3897;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	class361 field3901;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	class27 field3896;
	@ObfuscatedName("ai")
	public Object[] field3898;
	@ObfuscatedName("al")
	public Object[] field3899;
	@ObfuscatedName("ac")
	public Object[] field3900;
	@ObfuscatedName("aa")
	public Object[] field3895;

	class365() {
		this.field3897 = new class367();
		this.field3901 = new class361();
		this.field3896 = new class27();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-1355916216"
	)
	static int method7314(int var0, Script var1, boolean var2) {
		Widget var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width * -1805166981;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height * -2133353239;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
