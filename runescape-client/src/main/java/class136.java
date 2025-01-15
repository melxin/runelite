import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class136 {
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static Task field1587;
	@ObfuscatedName("ay")
	boolean field1593;
	@ObfuscatedName("ah")
	boolean field1571;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	class134 field1572;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	class134 field1574;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	class131[] field1573;
	@ObfuscatedName("an")
	boolean field1575;
	@ObfuscatedName("ae")
	float field1576;
	@ObfuscatedName("ax")
	float field1577;
	@ObfuscatedName("at")
	float field1578;
	@ObfuscatedName("ac")
	float field1579;
	@ObfuscatedName("au")
	float field1580;
	@ObfuscatedName("as")
	float field1581;
	@ObfuscatedName("aq")
	float field1582;
	@ObfuscatedName("af")
	float field1585;
	@ObfuscatedName("aa")
	float field1584;
	@ObfuscatedName("ak")
	float field1591;
	@ObfuscatedName("al")
	boolean field1586;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 412565635
	)
	int field1583;
	@ObfuscatedName("ag")
	float[] field1588;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1445207609
	)
	int field1589;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1830532937
	)
	int field1590;
	@ObfuscatedName("ar")
	float field1570;
	@ObfuscatedName("am")
	float field1592;

	class136() {
		this.field1586 = true;
		this.field1583 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)I",
		garbageValue = "-1723338220"
	)
	int method3447(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class142.method3513(var1.readUnsignedByte());
		this.field1572 = AbstractByteArrayCopier.method7582(var1.readUnsignedByte());
		this.field1574 = AbstractByteArrayCopier.method7582(var1.readUnsignedByte());
		this.field1593 = var1.readUnsignedByte() != 0;
		this.field1573 = new class131[var3];
		class131 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class131 var6 = new class131();
			var6.method3375(var1, var2);
			this.field1573[var5] = var6;
			if (var4 != null) {
				var4.field1532 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	void method3448() {
		this.field1589 = this.field1573[0].field1528;
		this.field1590 = this.field1573[this.method3455() - 1].field1528;
		this.field1588 = new float[this.method3452() + 1];

		for (int var1 = this.method3466(); var1 <= this.method3451(); ++var1) {
			this.field1588[var1 - this.method3466()] = class149.method3585(this, (float)var1);
		}

		this.field1573 = null;
		this.field1570 = class149.method3585(this, (float)(this.method3466() - 1));
		this.field1592 = class149.method3585(this, (float)(this.method3451() + 1));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-6"
	)
	public float method3454(int var1) {
		if (var1 < this.method3466()) {
			return this.field1570;
		} else {
			return var1 > this.method3451() ? this.field1592 : this.field1588[var1 - this.method3466()];
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1105216544"
	)
	int method3466() {
		return this.field1589;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1110077187"
	)
	int method3451() {
		return this.field1590;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "989125341"
	)
	int method3452() {
		return this.method3451() - this.method3466();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1666062473"
	)
	int method3453(float var1) {
		if (this.field1583 >= 0 && (float)this.field1573[this.field1583].field1528 <= var1 && (this.field1573[this.field1583].field1532 == null || (float)this.field1573[this.field1583].field1532.field1528 > var1)) {
			return this.field1583;
		} else if (var1 >= (float)this.method3466() && var1 <= (float)this.method3451()) {
			int var2 = this.method3455();
			int var3 = this.field1583;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;

				do {
					int var6 = var4 + var5 >> 1;
					if (var1 < (float)this.field1573[var6].field1528) {
						if (var1 > (float)this.field1573[var6 - 1].field1528) {
							var3 = var6 - 1;
							break;
						}

						var5 = var6 - 1;
					} else {
						if (var1 <= (float)this.field1573[var6].field1528) {
							var3 = var6;
							break;
						}

						if (var1 < (float)this.field1573[var6 + 1].field1528) {
							var3 = var6;
							break;
						}

						var4 = var6 + 1;
					}
				} while(var4 <= var5);
			}

			if (var3 != this.field1583) {
				this.field1583 = var3;
				this.field1586 = true;
			}

			return this.field1583;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfn;",
		garbageValue = "-1934359287"
	)
	class131 method3460(float var1) {
		int var2 = this.method3453(var1);
		return var2 >= 0 && var2 < this.field1573.length ? this.field1573[var2] : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	int method3455() {
		return this.field1573 == null ? 0 : this.field1573.length;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;ZI)V",
		garbageValue = "-533189619"
	)
	public static void method3476(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}
}
