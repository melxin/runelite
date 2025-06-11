import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class459 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	class455 field5073;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1102890637
	)
	int field5072;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 277099519
	)
	int field5071;

	@ObfuscatedSignature(
		descriptor = "(Lrk;II)V"
	)
	class459(class455 var1, int var2, int var3) {
		this.field5072 = 0;
		this.field5071 = 0;
		this.field5073 = var1;
		this.field5072 = var2;
		this.field5071 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2133461459"
	)
	public String method9215() {
		if (this.method9200()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9220());

			for (int var2 = this.field5072; var2 < this.field5071; ++var2) {
				class457 var3 = this.field5073.method9067(var2);
				var1.append(var3.field5045);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1362334215"
	)
	boolean method9207(int var1) {
		return this.field5073.method8964() == 2 || this.field5073.method8964() == 1 && (!this.field5073.field5036 || this.field5071 - 1 != var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "587668122"
	)
	public boolean method9200() {
		return this.field5071 == this.field5072;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1902758053"
	)
	public int method9220() {
		return this.field5071 - this.field5072;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrj;B)Z",
		garbageValue = "-39"
	)
	boolean method9202(class457 var1) {
		if (this.field5073.field5040 == 2) {
			return true;
		} else if (this.field5073.field5040 == 0) {
			return false;
		} else {
			return this.field5073.method8997() != var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135245945"
	)
	int method9198() {
		if (this.method9200()) {
			return 0;
		} else {
			class457 var1 = this.field5073.method9067(this.field5071 - 1);
			if (var1.field5045 == '\n') {
				return 0;
			} else if (this.method9202(var1)) {
				return this.field5073.field5038.advances[42];
			} else {
				int var2 = this.field5073.field5038.advances[var1.field5045];
				if (var2 == 0) {
					return var1.field5045 == '\t' ? this.field5073.field5038.advances[32] * 3 : this.field5073.field5038.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvk;",
		garbageValue = "-1917036672"
	)
	public class547 method9204() {
		if (this.method9200()) {
			return new class547(0, 0);
		} else {
			class457 var1 = this.field5073.method9067(this.field5071 - 1);
			return new class547(var1.field5046 + this.method9198(), var1.field5047);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lrj;",
		garbageValue = "-2067560159"
	)
	public class457 method9209(int var1) {
		return var1 >= 0 && var1 < this.method9220() ? this.field5073.method9067(this.field5072 + var1) : null;
	}
}
