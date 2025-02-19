import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
class class476 implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static AbstractArchive field5081;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	final class477 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsr;)V"
	)
	class476(class477 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsk;Lsk;I)I",
		garbageValue = "1765161239"
	)
	int method9026(class478 var1, class478 var2) {
		if (var1.field5092 > var2.field5092) {
			return 1;
		} else {
			return var1.field5092 < var2.field5092 ? -1 : 0;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method9026((class478)var1, (class478)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
