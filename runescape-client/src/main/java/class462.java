import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
class class462 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrs;)V"
	)
	class462(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "46"
	)
	int method8864(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method8864((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
