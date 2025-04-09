import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
class class472 implements Comparator {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 899184787
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsx;)V"
	)
	class472(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "692386373"
	)
	int method9049(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method9049((Entry)var1, (Entry)var2);
	}
}
