import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class324 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-1986646754"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class334.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class137.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)I",
		garbageValue = "-636914799"
	)
	static int method7032(Widget var0) {
		if (var0.type != 11) {
			--Interpreter.Interpreter_objectStackSize;
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var0.method7961(var1);
			return 1;
		}
	}
}
