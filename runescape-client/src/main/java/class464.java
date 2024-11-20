import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
class class464 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	final class465 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	class464(class465 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;B)I",
		garbageValue = "6"
	)
	int method8874(class466 var1, class466 var2) {
		if (var1.field4968 > var2.field4968) {
			return 1;
		} else {
			return var1.field4968 < var2.field4968 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method8874((class466)var1, (class466)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)F",
		garbageValue = "1309043299"
	)
	static float method8873(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (float)(var2 - var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1289232933"
	)
	public static void method8871() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
