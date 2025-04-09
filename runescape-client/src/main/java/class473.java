import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class473 {
	@ObfuscatedName("ao")
	final int[] field5086;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1140352431
	)
	int field5085;

	public class473(int var1) {
		this.field5086 = new int[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1775452516"
	)
	public void method9064(int var1) {
		this.field5086[++this.field5085 - 1] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "98"
	)
	public int method9056(int var1) {
		return this.field5086[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-219139390"
	)
	public int method9060() {
		return this.field5085;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	public void method9058() {
		this.field5085 = 0;
	}
}
