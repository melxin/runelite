import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	public static final Bounds[] field5201;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 806016253
	)
	static final int field5199;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1843591501
	)
	public static int field5200;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -359878993
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1331962027
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -173022167
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1316863729
	)
	@Export("highY")
	public int highY;

	static {
		field5200 = 0;
		field5199 = 8;
		field5201 = new Bounds[field5199];
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	public void method9032() {
		synchronized(field5201) {
			if (field5200 < field5199) {
				field5201[++field5200 - 1] = this;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-34"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "942381678"
	)
	public boolean method9035(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)Z",
		garbageValue = "1313694981"
	)
	public boolean method9025(Bounds var1) {
		return this.lowX <= var1.method9042() && var1.lowX <= this.method9042() && this.lowY <= var1.method9045() && var1.lowY <= this.method9045();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lra;Lra;I)V",
		garbageValue = "-28660710"
	)
	public void method9031(Bounds var1, Bounds var2) {
		this.method9029(var1, var2);
		this.method9030(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lra;Lra;I)V",
		garbageValue = "-1547627551"
	)
	void method9029(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method9042() > var1.method9042()) {
			var2.highX -= var2.method9042() - var1.method9042();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lra;Lra;B)V",
		garbageValue = "1"
	)
	void method9030(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method9045() > var1.method9045()) {
			var2.highY -= var2.method9045() - var1.method9045();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-587745800"
	)
	int method9042() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	int method9045() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
