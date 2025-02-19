import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class441 {
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)I",
		garbageValue = "-2107772171"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1119425845"
	)
	static void method8294(int var0) {
		SequenceDefinition var1 = WorldMapData_1.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class144 var4 = class144.method3421(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3412() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field812.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
