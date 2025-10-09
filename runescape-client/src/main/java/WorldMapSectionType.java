import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ly")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -128565773
	)
	static int field3426;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2121519693
	)
	@Export("type")
	final int type;
	@ObfuscatedName("af")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public static void method6800() {
		class338.field3891.clear();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "703251374"
	)
	static int method6799(int var0, Script var1, boolean var2) {
		Widget var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.height * -171267385;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else if (var0 != 2506) {
			return 2;
		} else {
			int var4 = var3.parentId;
			if (var4 == -1) {
				for (InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)Client.interfaceParents.next()) {
					if (var3.id >> 16 == var5.group) {
						var4 = (int)var5.key;
						break;
					}
				}
			}

			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4;
			return 1;
		}
	}
}
