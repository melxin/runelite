import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lm")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -336595349
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1847023617
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1773160551
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "-2138389610"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class269.getNextWorldListWorld();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "-63"
	)
	static int method6337(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class156.scriptDotWidget : SoundCache.field295;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.childIndex * -1626125685;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.method7366() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return Varps.method6884(var3);
		} else {
			return var0 == 1709 ? WorldMapData_1.method6203(var3) : 2;
		}
	}
}
