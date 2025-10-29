import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vh")
public class class565 {
	@ObfuscatedName("ax")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -382859955
	)
	final int field5849;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -477863467
	)
	final int field5845;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 299509079
	)
	final int field5851;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1524422205
	)
	final int field5847;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 809239137
	)
	final int field5848;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 978893637
	)
	final int field5844;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1015642731
	)
	final int field5850;

	class565(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5849 = var1;
		this.field5845 = var2;
		this.field5848 = var3;
		this.field5844 = var4;
		this.field5851 = var1 / 2;
		this.field5847 = var2 / 2;
		this.field5850 = this.field5847 * this.field5847 + this.field5851 * this.field5851;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5849, this.field5845, this.field5848, this.field5844);
	}
}
