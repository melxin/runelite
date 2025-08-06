import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class482 {
	@ObfuscatedName("bd")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("al")
	final int[] field5236;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 669807823
	)
	int field5234;

	public class482(int var1) {
		this.field5236 = new int[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2032746726"
	)
	public void method9808(int var1) {
		this.field5236[++this.field5234 - 1] = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "222"
	)
	public int method9817(int var1) {
		return this.field5236[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1632193794"
	)
	public int method9810() {
		return this.field5234;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1910686459"
	)
	public void method9809() {
		this.field5234 = 0;
	}
}
