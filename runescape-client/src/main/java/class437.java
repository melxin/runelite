import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class437 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1495424769
	)
	int field4823;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class437(int var1, boolean var2) {
		this.field4823 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-724362671"
	)
	public int method8522() {
		return this.field4823;
	}
}
