import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
class class462 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lri;)V"
	)
	class462(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-2064664022"
	)
	int method9017(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method9017((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
