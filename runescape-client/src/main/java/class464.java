import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
class class464 implements Comparator {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -242649963
	)
	static int field4955;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	static SpritePixels[] field4957;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	final class465 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	class464(class465 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrs;Lrs;I)I",
		garbageValue = "-339076083"
	)
	int method9026(class466 var1, class466 var2) {
		if (var1.field4969 > var2.field4969) {
			return 1;
		} else {
			return var1.field4969 < var2.field4969 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method9026((class466)var1, (class466)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
