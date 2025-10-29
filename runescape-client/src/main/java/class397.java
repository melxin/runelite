import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class397 {
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-415824616"
	)
	static void method8413(int var0) {
		SequenceDefinition var1 = ClientPacket.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (HitSplatDefinition.method4740(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field410.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
