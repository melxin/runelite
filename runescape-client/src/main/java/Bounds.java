import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1187183205
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2020733535
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1966960069
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 98523261
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "36"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-353425709"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-2"
	)
	public boolean method8263(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lql;B)V",
		garbageValue = "-33"
	)
	public void method8265(Bounds var1, Bounds var2) {
		this.method8266(var1, var2);
		this.method8267(var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lql;S)V",
		garbageValue = "1000"
	)
	void method8266(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8268() > var1.method8268()) {
			var2.highX -= var2.method8268() - var1.method8268();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lql;B)V",
		garbageValue = "42"
	)
	void method8267(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8260() > var1.method8260()) {
			var2.highY -= var2.method8260() - var1.method8260();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1827217304"
	)
	int method8268() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1683044794"
	)
	int method8260() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
