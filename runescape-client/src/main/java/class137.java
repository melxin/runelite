import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class137 {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("al")
	boolean field1640;
	@ObfuscatedName("ab")
	boolean field1648;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	class135 field1636;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	class135 field1645;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lfr;"
	)
	class132[] field1634;
	@ObfuscatedName("as")
	boolean field1639;
	@ObfuscatedName("ah")
	float field1658;
	@ObfuscatedName("ap")
	float field1641;
	@ObfuscatedName("am")
	float field1642;
	@ObfuscatedName("aj")
	float field1643;
	@ObfuscatedName("ag")
	float field1635;
	@ObfuscatedName("ay")
	float field1646;
	@ObfuscatedName("aa")
	float field1651;
	@ObfuscatedName("ai")
	float field1647;
	@ObfuscatedName("ak")
	float field1637;
	@ObfuscatedName("ar")
	float field1649;
	@ObfuscatedName("at")
	boolean field1650;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -470606337
	)
	int field1654;
	@ObfuscatedName("aq")
	float[] field1652;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -510355851
	)
	int field1653;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1549196275
	)
	int field1638;
	@ObfuscatedName("ad")
	float field1655;
	@ObfuscatedName("aw")
	float field1656;

	class137() {
		this.field1650 = true;
		this.field1654 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)I",
		garbageValue = "1842642305"
	)
	int method3655(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class28.method461(var1.readUnsignedByte());
		this.field1636 = class270.method6063(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class135 var6 = (class135)HealthBarConfig.findEnumerated(Tile.method4885(), var5);
		if (var6 == null) {
			var6 = class135.field1619;
		}

		this.field1645 = var6;
		this.field1640 = var1.readUnsignedByte() != 0;
		this.field1634 = new class132[var3];
		class132 var9 = null;

		for (int var7 = 0; var7 < var3; ++var7) {
			class132 var8 = new class132();
			var8.method3571(var1, var2);
			this.field1634[var7] = var8;
			if (var9 != null) {
				var9.field1595 = var8;
			}

			var9 = var8;
		}

		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	void method3651() {
		this.field1653 = this.field1634[0].field1597;
		this.field1638 = this.field1634[this.method3658() - 1].field1597;
		this.field1652 = new float[this.method3664() + 1];

		for (int var1 = this.method3653(); var1 <= this.method3654(); ++var1) {
			this.field1652[var1 - this.method3653()] = class301.method6813(this, (float)var1);
		}

		this.field1634 = null;
		this.field1655 = class301.method6813(this, (float)(this.method3653() - 1));
		this.field1656 = class301.method6813(this, (float)(this.method3654() + 1));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "126"
	)
	public float method3652(int var1) {
		if (var1 < this.method3653()) {
			return this.field1655;
		} else {
			return var1 > this.method3654() ? this.field1656 : this.field1652[var1 - this.method3653()];
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "956175984"
	)
	int method3653() {
		return this.field1653;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1967127413"
	)
	int method3654() {
		return this.field1638;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-56"
	)
	int method3664() {
		return this.method3654() - this.method3653();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "645515726"
	)
	int method3675(float var1) {
		if (this.field1654 < 0 || (float)this.field1634[this.field1654].field1597 > var1 || this.field1634[this.field1654].field1595 != null && (float)this.field1634[this.field1654].field1595.field1597 <= var1) {
			if (var1 >= (float)this.method3653() && var1 <= (float)this.method3654()) {
				int var2 = this.method3658();
				int var3 = this.field1654;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1634[var6].field1597) {
							if (var1 > (float)this.field1634[var6 - 1].field1597) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1634[var6].field1597) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1634[var6 + 1].field1597) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1654) {
					this.field1654 = var3;
					this.field1650 = true;
				}

				return this.field1654;
			} else {
				return -1;
			}
		} else {
			return this.field1654;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfr;",
		garbageValue = "26404127"
	)
	class132 method3657(float var1) {
		int var2 = this.method3675(var1);
		return var2 >= 0 && var2 < this.field1634.length ? this.field1634[var2] : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	int method3658() {
		return this.field1634 == null ? 0 : this.field1634.length;
	}
}
