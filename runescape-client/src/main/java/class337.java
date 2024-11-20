import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public class class337 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 546362975
	)
	int field3688;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	class53 field3687;

	@ObfuscatedSignature(
		descriptor = "(ILct;)V"
	)
	class337(int var1, class53 var2) {
		this.field3688 = var1;
		this.field3687 = var2;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	static boolean method6733() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
