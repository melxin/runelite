import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
class class479 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	final class480 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lso;)V"
	)
	class479(class480 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsa;Lsa;I)I",
		garbageValue = "-293540936"
	)
	int method9454(class481 var1, class481 var2) {
		if (var1.field5157 > var2.field5157) {
			return 1;
		} else {
			return var1.field5157 < var2.field5157 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method9454((class481)var1, (class481)var2);
	}
}
