import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	static Bounds[] field5048;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -137043801
	)
	static int field5042;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1330734883
	)
	static int field5043;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -345218871
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1839305339
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1904220373
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1547341651
	)
	@Export("highY")
	public int highY;

	static {
		field5048 = new Bounds[0];
		field5042 = 8;
		field5048 = new Bounds[8];
		field5043 = 0;
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
		descriptor = "(I)V",
		garbageValue = "693538969"
	)
	public void method8977() {
		synchronized(field5048) {
			if (field5043 < field5042) {
				field5048[++field5043 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "128"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1553421664"
	)
	public boolean method8987(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lri;B)Z",
		garbageValue = "-43"
	)
	public boolean method9003(Bounds var1) {
		return this.lowX <= var1.method8985() && var1.lowX <= this.method8985() && this.lowY <= var1.method9000() && var1.lowY <= this.method9000();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;I)V",
		garbageValue = "903313438"
	)
	public void method8982(Bounds var1, Bounds var2) {
		this.method8983(var1, var2);
		this.method9008(var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;I)V",
		garbageValue = "1778832239"
	)
	void method8983(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8985() > var1.method8985()) {
			var2.highX -= var2.method8985() - var1.method8985();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;I)V",
		garbageValue = "1843182648"
	)
	void method9008(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method9000() > var1.method9000()) {
			var2.highY -= var2.method9000() - var1.method9000();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1113455496"
	)
	int method8985() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1885404664"
	)
	int method9000() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;III)V",
		garbageValue = "203742730"
	)
	public static void method8984(int[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					Object var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method8984(var0, var1, var2, var5 - 1);
			method8984(var0, var1, var5 + 1, var3);
		}

	}
}
