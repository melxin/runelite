import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class138 {
	@ObfuscatedName("af")
	boolean field1680;
	@ObfuscatedName("aw")
	boolean field1676;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	class136 field1659;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	class136 field1660;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lfd;"
	)
	class133[] field1673;
	@ObfuscatedName("aq")
	boolean field1662;
	@ObfuscatedName("ao")
	float field1663;
	@ObfuscatedName("as")
	float field1661;
	@ObfuscatedName("al")
	float field1664;
	@ObfuscatedName("au")
	float field1657;
	@ObfuscatedName("ai")
	float field1667;
	@ObfuscatedName("aa")
	float field1668;
	@ObfuscatedName("am")
	float field1669;
	@ObfuscatedName("an")
	float field1670;
	@ObfuscatedName("ar")
	float field1671;
	@ObfuscatedName("ae")
	float field1672;
	@ObfuscatedName("ay")
	boolean field1658;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 291283811
	)
	int field1674;
	@ObfuscatedName("ag")
	float[] field1675;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -516697813
	)
	int field1665;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -676408603
	)
	int field1666;
	@ObfuscatedName("ab")
	float field1678;
	@ObfuscatedName("ax")
	float field1679;

	class138() {
		this.field1658 = true;
		this.field1674 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)I",
		garbageValue = "-1008941972"
	)
	int method3670(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		LoginState.method790(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class136[] var6 = new class136[]{class136.field1647, class136.field1641, class136.field1642, class136.field1643, class136.field1644};
		class136 var7 = (class136)class173.findEnumerated(var6, var5);
		if (var7 == null) {
			var7 = class136.field1647;
		}

		this.field1659 = var7;
		int var11 = var1.readUnsignedByte();
		class136[] var8 = new class136[]{class136.field1647, class136.field1641, class136.field1642, class136.field1643, class136.field1644};
		class136 var9 = (class136)class173.findEnumerated(var8, var11);
		if (var9 == null) {
			var9 = class136.field1647;
		}

		this.field1660 = var9;
		this.field1680 = var1.readUnsignedByte() != 0;
		this.field1673 = new class133[var3];
		class133 var13 = null;

		for (int var12 = 0; var12 < var3; ++var12) {
			class133 var10 = new class133();
			var10.method3602(var1, var2);
			this.field1673[var12] = var10;
			if (var13 != null) {
				var13.field1609 = var10;
			}

			var13 = var10;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-840055360"
	)
	void method3671() {
		this.field1665 = this.field1673[0].field1612;
		this.field1666 = this.field1673[this.method3697() - 1].field1612;
		this.field1675 = new float[this.method3675() + 1];

		for (int var1 = this.method3673(); var1 <= this.method3682(); ++var1) {
			this.field1675[var1 - this.method3673()] = UserComparator6.method3592(this, (float)var1);
		}

		this.field1673 = null;
		this.field1678 = UserComparator6.method3592(this, (float)(this.method3673() - 1));
		this.field1679 = UserComparator6.method3592(this, (float)(this.method3682() + 1));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "1"
	)
	public float method3672(int var1) {
		if (var1 < this.method3673()) {
			return this.field1678;
		} else {
			return var1 > this.method3682() ? this.field1679 : this.field1675[var1 - this.method3673()];
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	int method3673() {
		return this.field1665;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "79226392"
	)
	int method3682() {
		return this.field1666;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	int method3675() {
		return this.method3682() - this.method3673();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1998379979"
	)
	int method3676(float var1) {
		if (this.field1674 < 0 || (float)this.field1673[this.field1674].field1612 > var1 || this.field1673[this.field1674].field1609 != null && (float)this.field1673[this.field1674].field1609.field1612 <= var1) {
			if (var1 >= (float)this.method3673() && var1 <= (float)this.method3682()) {
				int var2 = this.method3697();
				int var3 = this.field1674;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1673[var6].field1612) {
							if (var1 > (float)this.field1673[var6 - 1].field1612) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1673[var6].field1612) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1673[var6 + 1].field1612) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1674) {
					this.field1674 = var3;
					this.field1658 = true;
				}

				return this.field1674;
			} else {
				return -1;
			}
		} else {
			return this.field1674;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfd;",
		garbageValue = "1452496094"
	)
	class133 method3677(float var1) {
		int var2 = this.method3676(var1);
		return var2 >= 0 && var2 < this.field1673.length ? this.field1673[var2] : null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method3697() {
		return this.field1673 == null ? 0 : this.field1673.length;
	}
}
