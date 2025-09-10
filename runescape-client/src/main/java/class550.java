import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vy")
public class class550 extends class552 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -550630141
	)
	int field5657;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1714549097
	)
	int field5658;

	public class550(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5657 = 0;
		this.field5658 = 0;
		this.field5657 = var1;
		this.field5658 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	public int method10607() {
		double var1 = this.method10618();
		return (int)Math.round(var1 * (double)(this.field5658 - this.field5657) + (double)this.field5657);
	}
}
