import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("de")
public enum class93 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1120(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1118(1, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1116(2, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1119(3, 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1117(4, 5),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1114(5, 6);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 786206301
	)
	final int field1115;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -167373089
	)
	final int field1121;

	class93(int var3, int var4) {
		this.field1115 = var3;
		this.field1121 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1121;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "964327481"
	)
	public static boolean method2514(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class417.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "88156859"
	)
	static int method2518(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.method7331() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			return Actor.method2694(var3);
		} else if (var0 == 2709) {
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			return AbstractWorldMapData.method6228(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1891065138"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
