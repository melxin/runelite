import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public class class484 {
	@ObfuscatedName("ab")
	final int[] field5401;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1960827799
	)
	int field5402;

	public class484(int var1) {
		this.field5401 = new int[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1802783771"
	)
	public void method9884(int var1) {
		this.field5401[++this.field5402 - 1] = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "80175543"
	)
	public int method9886(int var1) {
		return this.field5401[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1036879648"
	)
	public int method9887() {
		return this.field5402;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public void method9888() {
		this.field5402 = 0;
	}
}
