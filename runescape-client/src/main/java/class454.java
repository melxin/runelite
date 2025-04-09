import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public class class454 {
	@ObfuscatedName("ao")
	public char field4990;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -433063475
	)
	public int field4987;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 415550305
	)
	public int field4988;

	class454() {
		this.field4987 = 0;
		this.field4988 = 0;
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-190181864"
	)
	static void method8727(int var0) {
		SequenceDefinition var1 = class91.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class142 var4 = class87.method2465(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3397() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field568.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
