import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
class class475 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsx;)V"
	)
	class475(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;S)I",
		garbageValue = "-4610"
	)
	int method9424(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method9424((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1663738721"
	)
	static final int method9427(int var0) {
		return Math.abs(var0 - class455.cameraYaw) > 1024 ? var0 + (var0 < class455.cameraYaw ? 1 : -1) * 2048 : var0;
	}
}
