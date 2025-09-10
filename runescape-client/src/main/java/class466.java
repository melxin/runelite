import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public class class466 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class462 field5268;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1745629377
	)
	int field5269;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -175834659
	)
	int field5273;

	@ObfuscatedSignature(
		descriptor = "(Lrb;II)V"
	)
	class466(class462 var1, int var2, int var3) {
		this.field5269 = 0;
		this.field5273 = 0;
		this.field5268 = var1;
		this.field5269 = var2;
		this.field5273 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "128"
	)
	public String method9518() {
		if (this.method9533()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9532());

			for (int var2 = this.field5269; var2 < this.field5273; ++var2) {
				class464 var3 = this.field5268.method9382(var2);
				var1.append(var3.field5242);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1925327790"
	)
	boolean method9517(int var1) {
		return this.field5268.method9287() == 2 || this.field5268.method9287() == 1 && (!this.field5268.field5232 || this.field5273 - 1 != var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "102293078"
	)
	public boolean method9533() {
		return this.field5273 == this.field5269;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-340776252"
	)
	public int method9532() {
		return this.field5273 - this.field5269;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrx;B)Z",
		garbageValue = "0"
	)
	boolean method9522(class464 var1) {
		if (this.field5268.field5220 == 2) {
			return true;
		} else if (this.field5268.field5220 == 0) {
			return false;
		} else {
			return this.field5268.method9268() != var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	int method9520() {
		if (this.method9533()) {
			return 0;
		} else {
			class464 var1 = this.field5268.method9382(this.field5273 - 1);
			if (var1.field5242 == '\n') {
				return 0;
			} else if (this.method9522(var1)) {
				return this.field5268.field5228.advances[42];
			} else {
				int var2 = this.field5268.field5228.advances[var1.field5242];
				if (var2 == 0) {
					return var1.field5242 == '\t' ? this.field5268.field5228.advances[32] * 3 : this.field5268.field5228.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvt;",
		garbageValue = "554897908"
	)
	public class557 method9524() {
		if (this.method9533()) {
			return new class557(0, 0);
		} else {
			class464 var1 = this.field5268.method9382(this.field5273 - 1);
			return new class557(var1.field5241 + this.method9520(), var1.field5244);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lrx;",
		garbageValue = "-1368859848"
	)
	public class464 method9525(int var1) {
		return var1 >= 0 && var1 < this.method9532() ? this.field5268.method9382(this.field5269 + var1) : null;
	}
}
