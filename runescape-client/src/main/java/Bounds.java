import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	static final Bounds[] field5229;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 603519017
	)
	static final int field5223;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1799388663
	)
	static int field5228;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -316755897
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -268027987
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -434199641
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 682845965
	)
	@Export("highY")
	public int highY;

	static {
		field5228 = 0;
		field5223 = 8;
		field5229 = new Bounds[field5223];
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1624940431"
	)
	public void method9263() {
		synchronized(field5229) {
			if (field5228 < field5223) {
				field5229[++field5228 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1101244774"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "6385"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1088416383"
	)
	public boolean method9245(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)Z",
		garbageValue = "-609510589"
	)
	public boolean method9238(Bounds var1) {
		return this.lowX <= var1.method9244() && var1.method9246() <= this.method9244() && this.lowY <= var1.method9242() && var1.method9243() <= this.method9242();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)V",
		garbageValue = "-1164215303"
	)
	public void method9239(Bounds var1, Bounds var2) {
		this.method9240(var1, var2);
		this.method9234(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;B)V",
		garbageValue = "15"
	)
	void method9240(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method9244() > var1.method9244()) {
			var2.highX -= var2.method9244() - var1.method9244();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)V",
		garbageValue = "383267262"
	)
	void method9234(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method9242() > var1.method9242()) {
			var2.highY -= var2.method9242() - var1.method9242();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-45"
	)
	int method9246() {
		return this.lowX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "972317147"
	)
	int method9243() {
		return this.lowY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "107"
	)
	int method9244() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "36268567"
	)
	int method9242() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
