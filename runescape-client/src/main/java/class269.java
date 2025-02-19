import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
public class class269 extends Node {
	@ObfuscatedName("gl")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 209151693
	)
	public int field3049;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2007603225
	)
	public int field3052;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2113801075
	)
	public int field3051;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public Widget field3054;

	@ObfuscatedSignature(
		descriptor = "(IIILnz;)V"
	)
	public class269(int var1, int var2, int var3, Widget var4) {
		this.field3051 = var1;
		this.field3049 = var2;
		this.field3052 = var3;
		this.field3054 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1107556703"
	)
	static int method5589(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ItemLayer.Widget_unpackTargetMask(class441.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
