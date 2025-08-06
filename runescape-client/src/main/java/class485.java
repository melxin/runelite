import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
class class485 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	final class486 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsk;)V"
	)
	class485(class486 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;I)I",
		garbageValue = "-2090580980"
	)
	int method9825(class487 var1, class487 var2) {
		if (var1.field5257 > var2.field5257) {
			return 1;
		} else {
			return var1.field5257 < var2.field5257 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method9825((class487)var1, (class487)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
