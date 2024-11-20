import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class137 {
	@ObfuscatedName("ab")
	boolean field1571;
	@ObfuscatedName("aw")
	boolean field1589;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	class135 field1572;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	class135 field1573;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lfq;"
	)
	class132[] field1574;
	@ObfuscatedName("ac")
	boolean field1570;
	@ObfuscatedName("aj")
	float field1576;
	@ObfuscatedName("av")
	float field1578;
	@ObfuscatedName("au")
	float field1587;
	@ObfuscatedName("an")
	float field1579;
	@ObfuscatedName("af")
	float field1580;
	@ObfuscatedName("ai")
	float field1588;
	@ObfuscatedName("al")
	float field1582;
	@ObfuscatedName("ar")
	float field1583;
	@ObfuscatedName("as")
	float field1584;
	@ObfuscatedName("az")
	float field1585;
	@ObfuscatedName("ak")
	boolean field1586;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1571716515
	)
	int field1593;
	@ObfuscatedName("ah")
	float[] field1575;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -69387161
	)
	int field1577;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -359505389
	)
	int field1590;
	@ObfuscatedName("ax")
	float field1581;
	@ObfuscatedName("aa")
	float field1592;

	class137() {
		this.field1586 = true;
		this.field1593 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)I",
		garbageValue = "2"
	)
	int method3357(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class146[] var5 = new class146[]{class146.field1652, class146.field1663, class146.field1653, class146.field1654, class146.field1655, class146.field1656, class146.field1659, class146.field1658, class146.field1651};
		class146 var6 = (class146)ScriptEvent.findEnumerated(var5, var4);
		if (var6 == null) {
			var6 = class146.field1651;
		}

		int var12 = var1.readUnsignedByte();
		class135[] var7 = new class135[]{class135.field1559, class135.field1561, class135.field1555, class135.field1557, class135.field1558};
		class135 var8 = (class135)ScriptEvent.findEnumerated(var7, var12);
		if (var8 == null) {
			var8 = class135.field1559;
		}

		this.field1572 = var8;
		int var13 = var1.readUnsignedByte();
		class135[] var9 = new class135[]{class135.field1559, class135.field1561, class135.field1555, class135.field1557, class135.field1558};
		class135 var10 = (class135)ScriptEvent.findEnumerated(var9, var13);
		if (var10 == null) {
			var10 = class135.field1559;
		}

		this.field1573 = var10;
		this.field1571 = var1.readUnsignedByte() != 0;
		this.field1574 = new class132[var3];
		class132 var15 = null;

		for (int var14 = 0; var14 < var3; ++var14) {
			class132 var11 = new class132();
			var11.method3264(var1, var2);
			this.field1574[var14] = var11;
			if (var15 != null) {
				var15.field1530 = var11;
			}

			var15 = var11;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	void method3328() {
		this.field1577 = this.field1574[0].field1525;
		this.field1590 = this.field1574[this.method3335() - 1].field1525;
		this.field1575 = new float[this.method3332() + 1];

		for (int var1 = this.method3330(); var1 <= this.method3327(); ++var1) {
			this.field1575[var1 - this.method3330()] = class344.method6792(this, (float)var1);
		}

		this.field1574 = null;
		this.field1581 = class344.method6792(this, (float)(this.method3330() - 1));
		this.field1592 = class344.method6792(this, (float)(this.method3327() + 1));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1702569946"
	)
	public float method3349(int var1) {
		if (var1 < this.method3330()) {
			return this.field1581;
		} else {
			return var1 > this.method3327() ? this.field1592 : this.field1575[var1 - this.method3330()];
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	int method3330() {
		return this.field1577;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "332000073"
	)
	int method3327() {
		return this.field1590;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-113"
	)
	int method3332() {
		return this.method3327() - this.method3330();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1321846041"
	)
	int method3333(float var1) {
		if (this.field1593 < 0 || (float)this.field1574[this.field1593].field1525 > var1 || this.field1574[this.field1593].field1530 != null && (float)this.field1574[this.field1593].field1530.field1525 <= var1) {
			if (var1 >= (float)this.method3330() && var1 <= (float)this.method3327()) {
				int var2 = this.method3335();
				int var3 = this.field1593;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1574[var6].field1525) {
							if (var1 > (float)this.field1574[var6 - 1].field1525) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1574[var6].field1525) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1574[var6 + 1].field1525) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1593) {
					this.field1593 = var3;
					this.field1586 = true;
				}

				return this.field1593;
			} else {
				return -1;
			}
		} else {
			return this.field1593;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfq;",
		garbageValue = "1588430358"
	)
	class132 method3326(float var1) {
		int var2 = this.method3333(var1);
		return var2 >= 0 && var2 < this.field1574.length ? this.field1574[var2] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-89"
	)
	int method3335() {
		return this.field1574 == null ? 0 : this.field1574.length;
	}

	@ObfuscatedName("av")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
