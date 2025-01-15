import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class353 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 887651347
	)
	public int field3783;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1120993141
	)
	public int field3781;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1023470549
	)
	public int field3782;

	class353() {
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "492656019"
	)
	static void method7037(int var0) {
		SequenceDefinition var1 = class33.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (class166.method3808(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field792.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
