import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lk")
public class class298 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final class298 field3236;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	static final class298 field3237;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -292070717
	)
	static int field3239;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1906777519
	)
	@Export("value")
	final int value;

	static {
		field3236 = new class298(0);
		field3237 = new class298(1);
	}

	class298(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1463983379"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-647715500"
	)
	static int method6400(int var0, Script var1, boolean var2) {
		Widget var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Widget_unpackTargetMask(class232.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
