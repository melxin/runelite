import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
public class class474 {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field5353;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class470 field5349;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 358630923
	)
	int field5350;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1858758065
	)
	int field5351;

	@ObfuscatedSignature(
		descriptor = "(Lsf;II)V"
	)
	class474(class470 var1, int var2, int var3) {
		this.field5350 = 0;
		this.field5351 = 0;
		this.field5349 = var1;
		this.field5350 = var2;
		this.field5351 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "59"
	)
	public String method9830() {
		if (this.method9836()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9833());

			for (int var2 = this.field5350; var2 < this.field5351; ++var2) {
				class472 var3 = this.field5349.method9573(var2);
				var1.append(var3.field5322);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-35"
	)
	boolean method9832(int var1) {
		return this.field5349.method9604() == 2 || this.field5349.method9604() == 1 && (!this.field5349.field5315 || this.field5351 - 1 != var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2146475355"
	)
	public boolean method9836() {
		return this.field5351 == this.field5350;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "13211"
	)
	public int method9833() {
		return this.field5351 - this.field5350;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsw;I)Z",
		garbageValue = "-1640531527"
	)
	boolean method9834(class472 var1) {
		if (this.field5349.field5317 == 2) {
			return true;
		} else if (this.field5349.field5317 == 0) {
			return false;
		} else {
			return this.field5349.method9574() != var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-236485834"
	)
	int method9851() {
		if (this.method9836()) {
			return 0;
		} else {
			class472 var1 = this.field5349.method9573(this.field5351 - 1);
			if (var1.field5322 == '\n') {
				return 0;
			} else if (this.method9834(var1)) {
				return this.field5349.field5316.advances[42];
			} else {
				int var2 = this.field5349.field5316.advances[var1.field5322];
				if (var2 == 0) {
					return var1.field5322 == '\t' ? this.field5349.field5316.advances[32] * 3 : this.field5349.field5316.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;",
		garbageValue = "726888077"
	)
	public class569 method9855() {
		if (this.method9836()) {
			return new class569(0, 0);
		} else {
			class472 var1 = this.field5349.method9573(this.field5351 - 1);
			return new class569(var1.field5324 + this.method9851(), var1.field5323);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lsw;",
		garbageValue = "-1761261047"
	)
	public class472 method9837(int var1) {
		return var1 >= 0 && var1 < this.method9833() ? this.field5349.method9573(this.field5350 + var1) : null;
	}
}
