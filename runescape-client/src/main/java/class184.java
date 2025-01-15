import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class184 {
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	public static class402 field1975;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lfc;"
	)
	class133[] field1976;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2110551047
	)
	int field1977;

	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V"
	)
	class184(Buffer var1, int var2) {
		this.field1976 = new class133[var2];
		this.field1977 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field1976.length; ++var3) {
			class133 var4 = new class133(this.field1977, var1, false);
			this.field1976[var3] = var4;
		}

		this.method4106();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1788165079"
	)
	void method4106() {
		class133[] var1 = this.field1976;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class133 var3 = var1[var2];
			if (var3.field1553 >= 0) {
				var3.field1541 = this.field1976[var3.field1553];
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "695864652"
	)
	public int method4107() {
		return this.field1976.length;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lfc;",
		garbageValue = "-2084598540"
	)
	class133 method4108(int var1) {
		return var1 >= this.method4107() ? null : this.field1976[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfc;",
		garbageValue = "-29"
	)
	class133[] method4126() {
		return this.field1976;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IB)V",
		garbageValue = "1"
	)
	void method4110(class144 var1, int var2) {
		this.method4111(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfl;I[ZZI)V",
		garbageValue = "528946643"
	)
	void method4111(class144 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3529();
		int var6 = 0;
		class133[] var7 = this.method4126();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class133 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3524(var2, var9, var6, var5);
			}

			++var6;
		}

	}
}
