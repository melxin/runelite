import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class136 {
	@ObfuscatedName("ap")
	boolean field1599;
	@ObfuscatedName("aj")
	boolean field1593;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	class134 field1604;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	class134 field1615;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	class131[] field1596;
	@ObfuscatedName("ac")
	boolean field1592;
	@ObfuscatedName("aa")
	float field1600;
	@ObfuscatedName("am")
	float field1597;
	@ObfuscatedName("ah")
	float field1595;
	@ObfuscatedName("ag")
	float field1601;
	@ObfuscatedName("au")
	float field1602;
	@ObfuscatedName("ar")
	float field1603;
	@ObfuscatedName("ad")
	float field1612;
	@ObfuscatedName("af")
	float field1605;
	@ObfuscatedName("ak")
	float field1594;
	@ObfuscatedName("az")
	float field1607;
	@ObfuscatedName("aw")
	boolean field1598;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 607543817
	)
	int field1609;
	@ObfuscatedName("ae")
	float[] field1610;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 574502321
	)
	int field1611;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 268829253
	)
	int field1606;
	@ObfuscatedName("as")
	float field1613;
	@ObfuscatedName("ax")
	float field1614;

	class136() {
		this.field1598 = true;
		this.field1609 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)I",
		garbageValue = "14"
	)
	int method3527(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class144 var5 = (class144)class175.findEnumerated(class178.method3967(), var4);
		if (var5 == null) {
			var5 = class144.field1684;
		}

		this.field1604 = UserComparator4.method3382(var1.readUnsignedByte());
		int var6 = var1.readUnsignedByte();
		class134 var7 = (class134)class175.findEnumerated(class70.method2209(), var6);
		if (var7 == null) {
			var7 = class134.field1581;
		}

		this.field1615 = var7;
		this.field1599 = var1.readUnsignedByte() != 0;
		this.field1596 = new class131[var3];
		class131 var10 = null;

		for (int var8 = 0; var8 < var3; ++var8) {
			class131 var9 = new class131();
			var9.method3456(var1, var2);
			this.field1596[var8] = var9;
			if (var10 != null) {
				var10.field1549 = var9;
			}

			var10 = var9;
		}

		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-987642425"
	)
	void method3528() {
		this.field1611 = this.field1596[0].field1552;
		this.field1606 = this.field1596[this.method3551() - 1].field1552;
		this.field1610 = new float[this.method3531() + 1];

		for (int var1 = this.method3533(); var1 <= this.method3530(); ++var1) {
			this.field1610[var1 - this.method3533()] = JagexCache.method4732(this, (float)var1);
		}

		this.field1596 = null;
		this.field1613 = JagexCache.method4732(this, (float)(this.method3533() - 1));
		this.field1614 = JagexCache.method4732(this, (float)(this.method3530() + 1));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "29"
	)
	public float method3526(int var1) {
		if (var1 < this.method3533()) {
			return this.field1613;
		} else {
			return var1 > this.method3530() ? this.field1614 : this.field1610[var1 - this.method3533()];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "549216447"
	)
	int method3533() {
		return this.field1611;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2039043206"
	)
	int method3530() {
		return this.field1606;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	int method3531() {
		return this.method3530() - this.method3533();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "-40"
	)
	int method3532(float var1) {
		if (this.field1609 < 0 || (float)this.field1596[this.field1609].field1552 > var1 || this.field1596[this.field1609].field1549 != null && (float)this.field1596[this.field1609].field1549.field1552 <= var1) {
			if (var1 >= (float)this.method3533() && var1 <= (float)this.method3530()) {
				int var2 = this.method3551();
				int var3 = this.field1609;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1596[var6].field1552) {
							if (var1 > (float)this.field1596[var6 - 1].field1552) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1596[var6].field1552) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1596[var6 + 1].field1552) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1609) {
					this.field1609 = var3;
					this.field1598 = true;
				}

				return this.field1609;
			} else {
				return -1;
			}
		} else {
			return this.field1609;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FB)Lfa;",
		garbageValue = "115"
	)
	class131 method3549(float var1) {
		int var2 = this.method3532(var1);
		return var2 >= 0 && var2 < this.field1596.length ? this.field1596[var2] : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1350602946"
	)
	int method3551() {
		return this.field1596 == null ? 0 : this.field1596.length;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "638715219"
	)
	public static void method3548(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "208393953"
	)
	static int method3534(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
