import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	public static Bounds[] field4888;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 866510749
	)
	static int field4889;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 311307591
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1466356937
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -690287671
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -240741471
	)
	@Export("highY")
	public int highY;

	static {
		field4888 = new Bounds[0];
		class170.updateLoginIndex(8);
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	public void method8284() {
		synchronized(field4888) {
			if (class346.field3798 < field4889) {
				field4888[++class346.field3798 - 1] = this;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-111"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "430795115"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1081426964"
	)
	public boolean method8260(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqn;B)Z",
		garbageValue = "-112"
	)
	public boolean method8257(Bounds var1) {
		return this.lowX <= var1.method8265() && var1.lowX <= this.method8265() && this.lowY <= var1.method8266() && var1.lowY <= this.method8266();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)V",
		garbageValue = "-1130684373"
	)
	public void method8282(Bounds var1, Bounds var2) {
		this.method8263(var1, var2);
		this.method8264(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)V",
		garbageValue = "1791785332"
	)
	void method8263(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8265() > var1.method8265()) {
			var2.highX -= var2.method8265() - var1.method8265();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)V",
		garbageValue = "1853864290"
	)
	void method8264(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8266() > var1.method8266()) {
			var2.highY -= var2.method8266() - var1.method8266();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1355355600"
	)
	int method8265() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14681"
	)
	int method8266() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
