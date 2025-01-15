import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class268 extends Node {
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -490227731
	)
	public int field2968;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1771210245
	)
	public int field2969;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -657302699
	)
	public int field2970;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	public Widget field2971;

	@ObfuscatedSignature(
		descriptor = "(IIILna;)V"
	)
	public class268(int var1, int var2, int var3, Widget var4) {
		this.field2970 = var1;
		this.field2968 = var2;
		this.field2969 = var3;
		this.field2971 = var4;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)Z",
		garbageValue = "-73"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = SequenceDefinition.method5725(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
