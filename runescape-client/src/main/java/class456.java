import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class456 {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field5014;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	class452 field5015;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 674489597
	)
	int field5019;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -715946205
	)
	int field5016;

	@ObfuscatedSignature(
		descriptor = "(Lre;II)V"
	)
	class456(class452 var1, int var2, int var3) {
		this.field5019 = 0;
		this.field5016 = 0;
		this.field5015 = var1;
		this.field5019 = var2;
		this.field5016 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "32"
	)
	public String method8854() {
		if (this.method8856()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8857());

			for (int var2 = this.field5019; var2 < this.field5016; ++var2) {
				class454 var3 = this.field5015.method8627(var2);
				var1.append(var3.field4990);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-59295384"
	)
	boolean method8861(int var1) {
		return this.field5015.method8622() == 2 || this.field5015.method8622() == 1 && (!this.field5015.field4980 || this.field5016 - 1 != var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "57"
	)
	public boolean method8856() {
		return this.field5019 == this.field5016;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	public int method8857() {
		return this.field5016 - this.field5019;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)Z",
		garbageValue = "1171236534"
	)
	boolean method8858(class454 var1) {
		if (this.field5015.field4978 == 2) {
			return true;
		} else if (this.field5015.field4978 == 0) {
			return false;
		} else {
			return this.field5015.method8633() != var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	int method8859() {
		if (this.method8856()) {
			return 0;
		} else {
			class454 var1 = this.field5015.method8627(this.field5016 - 1);
			if (var1.field4990 == '\n') {
				return 0;
			} else if (this.method8858(var1)) {
				return this.field5015.field4976.advances[42];
			} else {
				int var2 = this.field5015.field4976.advances[var1.field4990];
				if (var2 == 0) {
					return var1.field4990 == '\t' ? this.field5015.field4976.advances[32] * 3 : this.field5015.field4976.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lug;",
		garbageValue = "1"
	)
	public class541 method8853() {
		if (this.method8856()) {
			return new class541(0, 0);
		} else {
			class454 var1 = this.field5015.method8627(this.field5016 - 1);
			return new class541(var1.field4987 + this.method8859(), var1.field4988);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lry;",
		garbageValue = "51"
	)
	public class454 method8873(int var1) {
		return var1 >= 0 && var1 < this.method8857() ? this.field5015.method8627(this.field5019 + var1) : null;
	}
}
