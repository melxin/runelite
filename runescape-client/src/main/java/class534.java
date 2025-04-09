import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
public class class534 extends class536 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1713985587
	)
	int field5378;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1131379071
	)
	int field5377;

	public class534(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5378 = 0;
		this.field5377 = 0;
		this.field5378 = var1;
		this.field5377 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108907890"
	)
	public int method9757() {
		double var1 = this.method9776();
		return (int)Math.round((double)this.field5378 + var1 * (double)(this.field5377 - this.field5378));
	}
}
