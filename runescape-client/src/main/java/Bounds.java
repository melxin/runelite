import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	public static Bounds[] field4903;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -827953655
	)
	static int field4904;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 5463805
	)
	public static int field4906;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1289368625
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -682741809
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1292646393
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1052477337
	)
	@Export("highY")
	public int highY;

	static {
		field4903 = new Bounds[0];
		field4904 = 8;
		field4903 = new Bounds[8];
		field4906 = 0;
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method8303() {
		synchronized(field4903) {
			if (field4906 < field4904) {
				field4903[++field4906 - 1] = this;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2124733118"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-151814927"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "4424"
	)
	public boolean method8322(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)Z",
		garbageValue = "-1860854466"
	)
	public boolean method8307(Bounds var1) {
		return this.lowX <= var1.method8312() && var1.lowX <= this.method8312() && this.lowY <= var1.method8325() && var1.lowY <= this.method8325();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;B)V",
		garbageValue = "-101"
	)
	public void method8308(Bounds var1, Bounds var2) {
		this.method8309(var1, var2);
		this.method8310(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "235798542"
	)
	void method8309(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8312() > var1.method8312()) {
			var2.highX -= var2.method8312() - var1.method8312();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "210514834"
	)
	void method8310(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8325() > var1.method8325()) {
			var2.highY -= var2.method8325() - var1.method8325();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "672732506"
	)
	int method8312() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1934536206"
	)
	int method8325() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
