import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lqw;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("ag")
	String field769;
	@ObfuscatedName("aj")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ah")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("af")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -163957189
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 675819761
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 283905223
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2050695233
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lqw;",
		garbageValue = "-879548067"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
