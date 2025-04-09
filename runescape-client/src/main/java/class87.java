import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dl")
public class class87 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	public static void method2462() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfy;",
		garbageValue = "-23"
	)
	public static class142 method2465(int var0) {
		class142 var1 = (class142)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			AbstractArchive var4 = class149.SpotAnimationDefinition_archive;
			boolean var5 = class182.method3997(var3, var4, var0);
			class142 var2;
			if (!var5) {
				var2 = null;
			} else {
				if (class142.field1657 == null) {
					class142.field1659 = Runtime.getRuntime().availableProcessors();
					class142.field1657 = new ThreadPoolExecutor(0, class142.field1659, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class142.field1659 * 100 + 100), new class228());
				}

				try {
					var2 = new class142(var3, var4, var0);
				} catch (Exception var7) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnh;II)V",
		garbageValue = "-481983583"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4018 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4090 == null) {
				var0.field4090 = new int[var0.field4018.length];
			}

			var0.field4090[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1809304782"
	)
	static int method2467(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			EnumComposition var10 = class142.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				EnumComposition var4 = class142.getEnum(var3);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			EnumComposition var7 = class142.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	public static int method2469(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "97"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class440.logOut();
		switch(var0) {
		case 1:
			class137.method3379(24);
			TileItem.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			Language.method8020();
		}

	}
}
