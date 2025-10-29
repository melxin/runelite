import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("od")
public class class379 {
	@ObfuscatedName("av")
	public static final short[] field4193;
	@ObfuscatedName("at")
	public static final short[][] field4192;
	@ObfuscatedName("ag")
	public static final short[] field4195;
	@ObfuscatedName("an")
	public static final short[][] field4191;

	static {
		field4193 = new short[]{6798, 8741, 25238, 4626, 4550};
		field4192 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field4195 = new short[]{-10304, 9104, -1, -1, -1};
		field4191 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lof;IS)V",
		garbageValue = "11713"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4263 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4372 == null) {
				var0.field4372 = new int[var0.field4263.length];
			}

			var0.field4372[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1813085635"
	)
	static int method8113(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class408.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			EnumComposition var10 = class108.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				EnumComposition var4 = class108.getEnum(var3);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class408.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
			EnumComposition var7 = class108.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
