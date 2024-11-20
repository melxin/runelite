import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class440 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class436 field4853;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -424982803
	)
	int field4856;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 248798475
	)
	int field4855;

	@ObfuscatedSignature(
		descriptor = "(Lqj;II)V"
	)
	class440(class436 var1, int var2, int var3) {
		this.field4856 = 0;
		this.field4855 = 0;
		this.field4853 = var1;
		this.field4856 = var2;
		this.field4855 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-8832"
	)
	public String method8643() {
		if (this.method8652()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8636());

			for (int var2 = this.field4856; var2 < this.field4855; ++var2) {
				class438 var3 = this.field4853.method8378(var2);
				var1.append(var3.field4825);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1311383658"
	)
	boolean method8667(int var1) {
		return this.field4853.method8409() == 2 || this.field4853.method8409() == 1 && (!this.field4853.field4816 || this.field4855 - 1 != var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	public boolean method8652() {
		return this.field4856 == this.field4855;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1994513588"
	)
	public int method8636() {
		return this.field4855 - this.field4856;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqo;B)Z",
		garbageValue = "37"
	)
	boolean method8641(class438 var1) {
		if (this.field4853.field4806 == 2) {
			return true;
		} else if (this.field4853.field4806 == 0) {
			return false;
		} else {
			return this.field4853.method8493() != var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3180"
	)
	int method8642() {
		if (this.method8652()) {
			return 0;
		} else {
			class438 var1 = this.field4853.method8378(this.field4855 - 1);
			if (var1.field4825 == '\n') {
				return 0;
			} else if (this.method8641(var1)) {
				return this.field4853.field4812.advances[42];
			} else {
				int var2 = this.field4853.field4812.advances[var1.field4825];
				if (var2 == 0) {
					return var1.field4825 == '\t' ? this.field4853.field4812.advances[32] * 3 : this.field4853.field4812.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lup;",
		garbageValue = "-104027626"
	)
	public class527 method8661() {
		if (this.method8652()) {
			return new class527(0, 0);
		} else {
			class438 var1 = this.field4853.method8378(this.field4855 - 1);
			return new class527(var1.field4824 + this.method8642(), var1.field4826);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqo;",
		garbageValue = "-1320467703"
	)
	public class438 method8638(int var1) {
		return var1 >= 0 && var1 < this.method8636() ? this.field4853.method8378(this.field4856 + var1) : null;
	}
}
