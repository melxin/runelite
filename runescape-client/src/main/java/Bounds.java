import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1297403821
	)
	static int field4747;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -473662445
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("wo")
	@ObfuscatedGetter(
		intValue = -1683139463
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 522181415
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 815856049
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1247655169
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 338190707
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1971543018"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-398831621"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-802421415"
	)
	public boolean method8069(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;I)V",
		garbageValue = "2079400311"
	)
	public void method8093(Bounds var1, Bounds var2) {
		this.method8084(var1, var2);
		this.method8072(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;B)V",
		garbageValue = "55"
	)
	void method8084(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8073() > var1.method8073()) {
			var2.highX -= var2.method8073() - var1.method8073();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;I)V",
		garbageValue = "-2001420446"
	)
	void method8072(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8074() > var1.method8074()) {
			var2.highY -= var2.method8074() - var1.method8074();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method8073() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	int method8074() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
