import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public class class491 {
	@ObfuscatedName("av")
	final int[] field5415;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1653486181
	)
	int field5414;

	public class491(int var1) {
		this.field5415 = new int[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-77"
	)
	public void method10036(int var1) {
		this.field5415[++this.field5414 - 1] = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public int method10037(int var1) {
		return this.field5415[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2050652984"
	)
	public int method10038() {
		return this.field5414;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-339513105"
	)
	public void method10039() {
		this.field5414 = 0;
	}
}
