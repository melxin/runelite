import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class262 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1453407961
	)
	public int field2870;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 528543635
	)
	public int field2867;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1490276105
	)
	public int field2866;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 112989857
	)
	public int field2868;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -521733583
	)
	public int field2869;

	class262(int var1, int var2, int var3, int var4, int var5) {
		this.field2870 = 0;
		this.field2867 = 1;
		this.field2866 = 0;
		this.field2868 = 0;
		this.field2869 = 0;
		this.field2870 = var1;
		this.field2867 = var2;
		this.field2866 = var3;
		this.field2868 = var4;
		this.field2869 = var5;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZS)I",
		garbageValue = "-18555"
	)
	static int method5425(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = NPCComposition.method5175() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
