import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class459 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1456777497
	)
	int field5122;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class459(int var1, boolean var2) {
		this.field5122 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1526758786"
	)
	public int method9411() {
		return this.field5122;
	}
}
