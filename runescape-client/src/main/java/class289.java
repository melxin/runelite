import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class289 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lqh;",
		garbageValue = "-873555905"
	)
	static class426 method6322() {
		synchronized(class426.field4746) {
			if (class426.field4742 == 0) {
				return new class426();
			} else {
				class426.field4746[--class426.field4742].method8287();
				return class426.field4746[class426.field4742];
			}
		}
	}
}
