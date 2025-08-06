import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class399 {
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lcr;III)V",
		garbageValue = "1891146722"
	)
	static void method8268(Player var0, int var1, int var2) {
		SequenceDefinition var3 = var0.field1065.method9571();
		if (var1 == var0.field1065.method9595() && var1 != -1) {
			int var4 = var3.restartMode;
			if (var4 == 1) {
				var0.field1065.method9576();
				var0.field1059 = var2;
			}

			if (var4 == 2) {
				var0.field1065.method9577();
			}
		} else if (var1 == -1 || !var0.field1065.method9570() || AsyncHttpResponse.SequenceDefinition_get(var1).field2410 >= var3.field2410) {
			var0.field1065.method9569(var1);
			var0.field1065.method9576();
			var0.field1059 = var2;
			var0.field1086 = var0.pathLength;
		}

	}
}
