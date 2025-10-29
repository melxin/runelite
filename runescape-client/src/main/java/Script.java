import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ac")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("oa")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("ag")
	String field754;
	@ObfuscatedName("an")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ae")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("aj")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -58237571
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -14880459
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -968069229
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1480905639
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[Lql;",
		garbageValue = "-1702266709"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(S)Lqy;",
		garbageValue = "-2262"
	)
	static JagNetThread method2043() {
		return VarbitComposition.field2279;
	}
}
