import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class533 extends class535 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -65431743
	)
	int field5371;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -193872539
	)
	int field5374;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 132238255
	)
	int field5372;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 945446851
	)
	int field5373;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1351921807
	)
	int field5375;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 578322401
	)
	int field5376;

	public class533(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5371 = 0;
		this.field5374 = 0;
		this.field5372 = 0;
		this.field5373 = 0;
		this.field5375 = 0;
		this.field5376 = 0;
		this.field5371 = var1;
		this.field5374 = var2;
		this.field5372 = var3;
		this.field5373 = var4;
		this.field5375 = var5;
		this.field5376 = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133258747"
	)
	public int vmethod9768() {
		double var1 = this.method9776();
		return (int)Math.round((double)this.field5371 + (double)(this.field5373 - this.field5371) * var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1239347117"
	)
	public int vmethod9763() {
		double var1 = this.method9776();
		return (int)Math.round(var1 * (double)(this.field5375 - this.field5374) + (double)this.field5374);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int vmethod9764() {
		double var1 = this.method9776();
		return (int)Math.round((double)this.field5372 + var1 * (double)(this.field5376 - this.field5372));
	}
}
