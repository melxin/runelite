import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class139 {
	@ObfuscatedName("av")
	boolean field1662;
	@ObfuscatedName("at")
	boolean field1651;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	class137 field1664;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	class137 field1653;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lfl;"
	)
	class134[] field1652;
	@ObfuscatedName("aj")
	boolean field1660;
	@ObfuscatedName("ak")
	float field1654;
	@ObfuscatedName("aw")
	float field1648;
	@ObfuscatedName("ap")
	float field1655;
	@ObfuscatedName("ay")
	float field1657;
	@ObfuscatedName("au")
	float field1658;
	@ObfuscatedName("az")
	float field1659;
	@ObfuscatedName("ad")
	float field1649;
	@ObfuscatedName("ai")
	float field1661;
	@ObfuscatedName("as")
	float field1667;
	@ObfuscatedName("ac")
	float field1663;
	@ObfuscatedName("ab")
	boolean field1650;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -86703831
	)
	int field1665;
	@ObfuscatedName("ar")
	float[] field1666;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1966735995
	)
	int field1656;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1391052631
	)
	int field1668;
	@ObfuscatedName("af")
	float field1669;
	@ObfuscatedName("am")
	float field1670;

	class139() {
		this.field1650 = true;
		this.field1665 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;IB)I",
		garbageValue = "102"
	)
	int method3833(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class147 var5 = (class147)GrandExchangeOffer.findEnumerated(WorldMapID.method7020(), var4);
		if (var5 == null) {
			var5 = class147.field1733;
		}

		this.field1664 = UrlRequest.method3673(var1.readUnsignedByte());
		this.field1653 = UrlRequest.method3673(var1.readUnsignedByte());
		this.field1662 = var1.readUnsignedByte() != 0;
		this.field1652 = new class134[var3];
		class134 var8 = null;

		for (int var6 = 0; var6 < var3; ++var6) {
			class134 var7 = new class134();
			var7.method3755(var1, var2);
			this.field1652[var6] = var7;
			if (var8 != null) {
				var8.field1598 = var7;
			}

			var8 = var7;
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void method3848() {
		this.field1656 = this.field1652[0].field1593;
		this.field1668 = this.field1652[this.method3841() - 1].field1593;
		this.field1666 = new float[this.method3855() + 1];

		for (int var1 = this.method3836(); var1 <= this.method3837(); ++var1) {
			this.field1666[var1 - this.method3836()] = HintArrow.method8430(this, (float)var1);
		}

		this.field1652 = null;
		this.field1669 = HintArrow.method8430(this, (float)(this.method3836() - 1));
		this.field1670 = HintArrow.method8430(this, (float)(this.method3837() + 1));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "73"
	)
	public float method3835(int var1) {
		if (var1 < this.method3836()) {
			return this.field1669;
		} else {
			return var1 > this.method3837() ? this.field1670 : this.field1666[var1 - this.method3836()];
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1536981458"
	)
	int method3836() {
		return this.field1656;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "570529957"
	)
	int method3837() {
		return this.field1668;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "830628460"
	)
	int method3855() {
		return this.method3837() - this.method3836();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-950150636"
	)
	int method3844(float var1) {
		if (this.field1665 < 0 || (float)this.field1652[this.field1665].field1593 > var1 || this.field1652[this.field1665].field1598 != null && (float)this.field1652[this.field1665].field1598.field1593 <= var1) {
			if (var1 >= (float)this.method3836() && var1 <= (float)this.method3837()) {
				int var2 = this.method3841();
				int var3 = this.field1665;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1652[var6].field1593) {
							if (var1 > (float)this.field1652[var6 - 1].field1593) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1652[var6].field1593) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1652[var6 + 1].field1593) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1665) {
					this.field1665 = var3;
					this.field1650 = true;
				}

				return this.field1665;
			} else {
				return -1;
			}
		} else {
			return this.field1665;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfl;",
		garbageValue = "-599508916"
	)
	class134 method3840(float var1) {
		int var2 = this.method3844(var1);
		return var2 >= 0 && var2 < this.field1652.length ? this.field1652[var2] : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	int method3841() {
		return this.field1652 == null ? 0 : this.field1652.length;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1516989941"
	)
	public static void method3862() {
		class212.field1909.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)Lra;",
		garbageValue = "38"
	)
	static class461 method3857(float var0, float var1, float var2, float var3) {
		synchronized(class461.field5251) {
			if (class461.field5245 == 0) {
				return new class461(var0, var1, var2, var3);
			} else {
				class461.field5251[--class461.field5245].method9361(var0, var1, var2, var3);
				return class461.field5251[class461.field5245];
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1308175271"
	)
	public static final void method3832() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
