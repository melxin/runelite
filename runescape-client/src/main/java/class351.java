import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class351 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("ag")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-58633690"
	)
	public static void method7188() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}
}
