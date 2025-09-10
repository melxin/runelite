import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
class class485 implements Comparator {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field5345;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsv;)V"
	)
	class485(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;S)I",
		garbageValue = "180"
	)
	int method9781(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method9781((Entry)var1, (Entry)var2);
	}
}
