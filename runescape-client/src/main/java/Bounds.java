import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrv;"
	)
	static Bounds[] field4953;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1338182051
	)
	static int field4952;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 427165781
	)
	static int field4954;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 597472973
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -587150435
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1305327973
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -939172829
	)
	@Export("highY")
	public int highY;

	static {
		field4953 = new Bounds[0];
		HttpContentType.method10100(8);
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1121377499"
	)
	public void method8642() {
		synchronized(field4953) {
			if (field4954 < field4952) {
				field4953[++field4954 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-43"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-631153195"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-118"
	)
	public boolean method8644(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrv;I)Z",
		garbageValue = "-1346696694"
	)
	public boolean method8645(Bounds var1) {
		return this.lowX <= var1.method8676() && var1.lowX <= this.method8676() && this.lowY <= var1.method8679() && var1.lowY <= this.method8679();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;B)V",
		garbageValue = "78"
	)
	public void method8646(Bounds var1, Bounds var2) {
		this.method8647(var1, var2);
		this.method8648(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)V",
		garbageValue = "1075824849"
	)
	void method8647(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8676() > var1.method8676()) {
			var2.highX -= var2.method8676() - var1.method8676();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;B)V",
		garbageValue = "116"
	)
	void method8648(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8679() > var1.method8679()) {
			var2.highY -= var2.method8679() - var1.method8679();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-573467637"
	)
	int method8676() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-998117703"
	)
	int method8679() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
