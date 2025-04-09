import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class135 {
	@ObfuscatedName("ao")
	boolean field1589;
	@ObfuscatedName("an")
	boolean field1585;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	class133 field1586;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	class133 field1587;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	class130[] field1598;
	@ObfuscatedName("aq")
	boolean field1597;
	@ObfuscatedName("av")
	float field1590;
	@ObfuscatedName("am")
	float field1591;
	@ObfuscatedName("aa")
	float field1584;
	@ObfuscatedName("ap")
	float field1604;
	@ObfuscatedName("ax")
	float field1594;
	@ObfuscatedName("aw")
	float field1595;
	@ObfuscatedName("ar")
	float field1592;
	@ObfuscatedName("au")
	float field1605;
	@ObfuscatedName("aj")
	float field1593;
	@ObfuscatedName("al")
	float field1599;
	@ObfuscatedName("ac")
	boolean field1600;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -42635867
	)
	int field1601;
	@ObfuscatedName("ak")
	float[] field1602;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1875225469
	)
	int field1603;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1978803239
	)
	int field1588;
	@ObfuscatedName("ad")
	float field1596;
	@ObfuscatedName("ah")
	float field1606;

	class135() {
		this.field1600 = true;
		this.field1601 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)I",
		garbageValue = "1933358306"
	)
	int method3319(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class143 var5 = (class143)ArchiveDiskActionHandler.findEnumerated(class151.method3484(), var4);
		if (var5 == null) {
			var5 = class143.field1676;
		}

		int var6 = var1.readUnsignedByte();
		class133[] var7 = new class133[]{class133.field1564, class133.field1574, class133.field1566, class133.field1567, class133.field1568};
		class133 var8 = (class133)ArchiveDiskActionHandler.findEnumerated(var7, var6);
		if (var8 == null) {
			var8 = class133.field1564;
		}

		this.field1586 = var8;
		int var12 = var1.readUnsignedByte();
		class133[] var9 = new class133[]{class133.field1564, class133.field1574, class133.field1566, class133.field1567, class133.field1568};
		class133 var10 = (class133)ArchiveDiskActionHandler.findEnumerated(var9, var12);
		if (var10 == null) {
			var10 = class133.field1564;
		}

		this.field1587 = var10;
		this.field1589 = var1.readUnsignedByte() != 0;
		this.field1598 = new class130[var3];
		class130 var14 = null;

		for (int var13 = 0; var13 < var3; ++var13) {
			class130 var11 = new class130();
			var11.method3256(var1, var2);
			this.field1598[var13] = var11;
			if (var14 != null) {
				var14.field1539 = var11;
			}

			var14 = var11;
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067269351"
	)
	void method3348() {
		this.field1603 = this.field1598[0].field1537;
		this.field1588 = this.field1598[this.method3320() - 1].field1537;
		this.field1602 = new float[this.method3324() + 1];

		for (int var1 = this.method3334(); var1 <= this.method3342(); ++var1) {
			this.field1602[var1 - this.method3334()] = class445.method8520(this, (float)var1);
		}

		this.field1598 = null;
		this.field1596 = class445.method8520(this, (float)(this.method3334() - 1));
		this.field1606 = class445.method8520(this, (float)(this.method3342() + 1));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2116713105"
	)
	public float method3321(int var1) {
		if (var1 < this.method3334()) {
			return this.field1596;
		} else {
			return var1 > this.method3342() ? this.field1606 : this.field1602[var1 - this.method3334()];
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-6429"
	)
	int method3334() {
		return this.field1603;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "225870592"
	)
	int method3342() {
		return this.field1588;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1581818134"
	)
	int method3324() {
		return this.method3342() - this.method3334();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1481329756"
	)
	int method3325(float var1) {
		if (this.field1601 >= 0 && (float)this.field1598[this.field1601].field1537 <= var1 && (this.field1598[this.field1601].field1539 == null || (float)this.field1598[this.field1601].field1539.field1537 > var1)) {
			return this.field1601;
		} else if (var1 >= (float)this.method3334() && var1 <= (float)this.method3342()) {
			int var2 = this.method3320();
			int var3 = this.field1601;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;

				do {
					int var6 = var4 + var5 >> 1;
					if (var1 < (float)this.field1598[var6].field1537) {
						if (var1 > (float)this.field1598[var6 - 1].field1537) {
							var3 = var6 - 1;
							break;
						}

						var5 = var6 - 1;
					} else {
						if (var1 <= (float)this.field1598[var6].field1537) {
							var3 = var6;
							break;
						}

						if (var1 < (float)this.field1598[var6 + 1].field1537) {
							var3 = var6;
							break;
						}

						var4 = var6 + 1;
					}
				} while(var4 <= var5);
			}

			if (var3 != this.field1601) {
				this.field1601 = var3;
				this.field1600 = true;
			}

			return this.field1601;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FB)Lfh;",
		garbageValue = "-76"
	)
	class130 method3326(float var1) {
		int var2 = this.method3325(var1);
		return var2 >= 0 && var2 < this.field1598.length ? this.field1598[var2] : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	int method3320() {
		return this.field1598 == null ? 0 : this.field1598.length;
	}
}
