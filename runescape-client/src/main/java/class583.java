import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wi")
public class class583 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1146015657
	)
	final int field5801;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1544185167
	)
	final int field5799;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -93626389
	)
	final int field5798;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 253159523
	)
	final int field5802;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 868634633
	)
	final int field5800;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1661246963
	)
	final int field5803;

	class583(int var1, int var2, int var3, int var4) {
		this.field5801 = var1;
		this.field5799 = var2;
		this.field5800 = var3;
		this.field5803 = var4;
		this.field5798 = var1 / 2;
		this.field5802 = var2 / 2;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5801, this.field5799, this.field5800, this.field5803);
	}
}
