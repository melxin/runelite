import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oa")
public class class385 {
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("loginState")
	static LoginState loginState;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[Lch;",
		garbageValue = "-85"
	)
	static class67[] method8212() {
		return new class67[]{class67.field911, class67.field904, class67.field908, class67.field906, class67.field907, class67.field903, class67.field905};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ltl;IIIB)V",
		garbageValue = "10"
	)
	public static void method8204(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4) {
		IntHashTable.method9896(var0);
		class572 var5 = var0.field5571;
		PacketBufferNode.method7052(var1, var5, true);
		int var6 = var0.method10433();
		int var7 = var1.method10433();
		if (var4 == -1) {
			var4 = var0.method10433() - var2;
		}

		if (var4 != 0 && (var1 != var0 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var6 && var3 >= 0 && var3 + var4 <= var7) {
				class167.method4091(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1039003859"
	)
	static int method8210(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.childIndex * -2066937045;
			return 1;
		} else {
			int var4;
			if (var0 == 1703) {
				var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				ParamComposition var7 = VarpDefinition.getParamDefinition(var4);
				if (var7.isString()) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.method7941(var4, var7.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.method7942(var4, var7.defaultInt);
				}

				return 1;
			} else if (var0 == 1704) {
				var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Object var5 = WorldMap.method10995(var4);
				int var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				var3.method7943(var6, var5);
				return 1;
			} else if (var0 == 1707) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.method7951() ? 1 : 0;
				return 1;
			} else if (var0 == 1708) {
				return World.method1553(var3);
			} else {
				return var0 == 1709 ? class210.method4670(var3) : 2;
			}
		}
	}
}
