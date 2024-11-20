import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dt")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("aw")
	String field1016;
	@ObfuscatedName("at")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ae")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ao")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2051475341
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1143957423
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -145116321
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1337332303
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lug;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[Lug;",
		garbageValue = "-1320134833"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1497539764"
	)
	static void method2357(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1431074721"
	)
	static int method2369(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.method7331() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return Actor.method2694(var3);
		} else {
			return var0 == 1709 ? AbstractWorldMapData.method6228(var3) : 2;
		}
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-403465315"
	)
	static boolean method2367() {
		return SecureUrlRequester.clientPreferences.getEULA() >= Client.field788;
	}
}
