import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class453 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -762537333
	)
	int field4970;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class453(int var1, boolean var2) {
		this.field4970 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	public int method8678() {
		return this.field4970;
	}
}
