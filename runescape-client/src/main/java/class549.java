import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class class549 extends class551 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -921802695
	)
	int field5655;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1694521679
	)
	int field5649;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -631882721
	)
	int field5651;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2110134701
	)
	int field5652;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 390082165
	)
	int field5650;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 652979259
	)
	int field5654;

	public class549(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5655 = 0;
		this.field5649 = 0;
		this.field5651 = 0;
		this.field5652 = 0;
		this.field5650 = 0;
		this.field5654 = 0;
		this.field5655 = var1;
		this.field5649 = var2;
		this.field5651 = var3;
		this.field5652 = var4;
		this.field5650 = var5;
		this.field5654 = var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2121166831"
	)
	public int vmethod10615() {
		double var1 = this.method10618();
		return (int)Math.round((double)(this.field5652 - this.field5655) * var1 + (double)this.field5655);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1036932109"
	)
	public int vmethod10609() {
		double var1 = this.method10618();
		return (int)Math.round((double)this.field5649 + (double)(this.field5650 - this.field5649) * var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1956644652"
	)
	public int vmethod10614() {
		double var1 = this.method10618();
		return (int)Math.round((double)(this.field5654 - this.field5651) * var1 + (double)this.field5651);
	}
}
