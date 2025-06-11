import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ad")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("an")
	String field803;
	@ObfuscatedName("ai")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("al")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ac")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1709334205
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1497554515
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1203552951
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1296687751
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqp;",
		garbageValue = "0"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
