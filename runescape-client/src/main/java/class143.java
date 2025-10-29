import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fo")
class class143 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class146 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfy;Lxa;I)V"
	)
	class143(class146 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3928(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-1"
	)
	static final boolean method3890(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[JIIB)V",
		garbageValue = "62"
	)
	public static void method3889(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var6) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3889(var0, var1, var2, var5 - 1);
			method3889(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-125656445"
	)
	static int method3891(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class150.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var10 = class150.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var10 = class150.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				class408.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				ItemComposition var6 = class150.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					var4 = class150.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					var4 = class150.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					var4 = class150.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					var4 = class150.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var8 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					class408.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class136.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						AbstractByteArrayCopier.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var8 = class150.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = class150.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.field2449;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class150.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class468.foundItemIds != null && AbstractByteArrayCopier.foundItemIndex < class136.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class468.foundItemIds[++AbstractByteArrayCopier.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
