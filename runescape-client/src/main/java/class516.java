import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public class class516 {
	@ObfuscatedName("al")
	static final int[] field5408;

	static {
		field5408 = new int[5000];
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lca;B)V",
		garbageValue = "39"
	)
	static final void method10473(Actor var0) {
		boolean var1 = var0.field1075 == Client.cycle || !var0.method2386();
		if (!var1) {
			SequenceDefinition var2 = var0.animationSequence.getSequenceDefinition();
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.animationSequence.getFrameCycle() + 1 > var2.frameLengths[var0.animationSequence.getFrame()];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1075 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1070 * 128 + var0.size * -821821440;
			int var5 = var0.field1072 * 128 + var0.size * -821821440;
			int var6 = var0.field1071 * 128 + var0.size * -821821440;
			int var7 = var0.field1073 * 128 + var0.size * -821821440;
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
		}

		var0.field1085 = 0;
		var0.orientation = var0.field1076;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)I",
		garbageValue = "-2014643701"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = Login.method1930(var1, var0.childIndex * -64977777);
		return var2 != null ? var2.method7475() : var0.flags;
	}
}
