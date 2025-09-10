import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("fh")
	static boolean field793;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lqm;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("at")
	String field795;
	@ObfuscatedName("ac")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ap")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("aq")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1797357531
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 814391737
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1207287197
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 562338133
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqm;",
		garbageValue = "32"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1984251400"
	)
	static final void method2006(String var0) {
		VarbitComposition.method4512(var0 + " is already on your ignore list");
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "-9152"
	)
	public static byte[] method2005() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
