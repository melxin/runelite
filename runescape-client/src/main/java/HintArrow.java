import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("HintArrow")
public class HintArrow {
	@ObfuscatedName("tw")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -81304289
	)
	@Export("targetType")
	int targetType;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1237904385
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1421373973
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1327275491
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1076175705
	)
	@Export("subX")
	int subX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1339969195
	)
	@Export("subY")
	int subY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2050442785
	)
	@Export("height")
	int height;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613845080"
	)
	public void method8434() {
		this.targetType = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-67"
	)
	public boolean method8422() {
		return this.targetType != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1945711579"
	)
	public int method8423() {
		return this.targetType;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "35124348"
	)
	public int method8454() {
		return this.targetIndex;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1551083808"
	)
	public int method8435() {
		return this.x;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "670254771"
	)
	public int method8445() {
		return this.y;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1636916364"
	)
	public int method8427() {
		return this.subX;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1692472347"
	)
	public int method8428() {
		return this.subY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-31080751"
	)
	public int method8429() {
		return this.height;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "988882878"
	)
	public void method8455(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		switch(var2) {
		case 1:
			this.targetType = 1;
			break;
		case 2:
			this.subX = 64;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 3:
			this.subX = 0;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 4:
			this.subX = 128;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 5:
			this.subX = 64;
			this.subY = 0;
			this.targetType = 2;
			break;
		case 6:
			this.subX = 64;
			this.subY = 128;
			this.targetType = 2;
		case 7:
		case 8:
		case 9:
		default:
			break;
		case 10:
			this.targetType = 3;
			break;
		case 11:
			this.targetType = 4;
		}

		switch(this.targetType) {
		case 0:
			break;
		case 1:
		case 3:
			this.targetIndex = var1.readUnsignedShort();
			break;
		case 2:
			this.x = var1.readUnsignedShort();
			this.y = var1.readUnsignedShort();
			this.height = var1.readUnsignedByte();
			break;
		case 4:
			this.targetIndex = var1.readUnsignedShort();
			this.height = var1.readMedium();
			break;
		default:
			throw new RuntimeException("");
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lft;FI)F",
		garbageValue = "-1644257037"
	)
	static float method8430(class139 var0, float var1) {
		if (var0 != null && var0.method3841() != 0) {
			if (var1 < (float)var0.field1652[0].field1593) {
				return var0.field1664 == class137.field1637 ? var0.field1652[0].field1597 : class175.method4234(var0, var1, true);
			} else if (var1 > (float)var0.field1652[var0.method3841() - 1].field1593) {
				return var0.field1653 == class137.field1637 ? var0.field1652[var0.method3841() - 1].field1597 : class175.method4234(var0, var1, false);
			} else if (var0.field1651) {
				return var0.field1652[0].field1597;
			} else {
				class134 var2 = var0.method3840(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0F == var2.field1599 && 0.0F == var2.field1600) {
						var3 = true;
					} else if (var2.field1599 == Float.MAX_VALUE && var2.field1600 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1598 != null) {
						if (var0.field1650) {
							var5 = (float)var2.field1593;
							float var9 = var2.field1597;
							var6 = var5 + var2.field1599 * 0.33333334F;
							float var10 = var9 + 0.33333334F * var2.field1600;
							float var8 = (float)var2.field1598.field1593;
							float var12 = var2.field1598.field1597;
							var7 = var8 - 0.33333334F * var2.field1598.field1594;
							float var11 = var12 - var2.field1598.field1595 * 0.33333334F;
							if (var0.field1662) {
								ItemComposition.method4897(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else {
								ObjectSound.method2336(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1650 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1597;
					} else if (var4) {
						return var1 != (float)var2.field1593 && var2.field1598 != null ? var2.field1598.field1597 : var2.field1597;
					} else if (var0.field1662) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var1 == var0.field1654) {
								var6 = 0.0F;
							} else if (var0.field1648 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1654) / (var0.field1648 - var0.field1654);
							}

							if (var0.field1660) {
								var7 = var6;
							} else {
								float[] var13 = new float[]{var0.field1655 - var6, var0.field1657, var0.field1658, var0.field1659};
								float[] var14 = new float[5];
								int var15 = class157.method4017(var13, 3, 0.0F, true, 1.0F, true, var14);
								if (var15 == 1) {
									var7 = var14[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = (var0.field1661 + var7 * (var0.field1663 * var7 + var0.field1667)) * var7 + var0.field1649;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1654;
							var5 = var0.field1659 + var6 * (var0.field1658 + (var0.field1655 * var6 + var0.field1657) * var6);
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
