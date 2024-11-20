import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class154 extends class150 {
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2110673279
	)
	int field1702;
	@ObfuscatedName("aw")
	byte field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class154(class153 var1) {
		this.this$0 = var1;
		this.field1702 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1702 = var1.readUnsignedShort();
		this.field1704 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3548(this.field1702, this.field1704);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZI)F",
		garbageValue = "-2134776422"
	)
	static float method3485(class137 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3335() != 0) {
			float var4 = (float)var0.field1574[0].field1525;
			float var5 = (float)var0.field1574[var0.method3335() - 1].field1525;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1574[0].field1528;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1572 == class135.field1558) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1572 != class135.field1555 && var0.field1572 != class135.field1557) {
						if (var0.field1572 == class135.field1561) {
							var10 = var4 - var1;
							var13 = var0.field1574[0].field1526;
							var14 = var0.field1574[0].field1527;
							var3 = var0.field1574[0].field1528;
							if (var13 != 0.0F) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1573 == class135.field1558) {
					if (var9 != 0.0F) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1573 != class135.field1555 && var0.field1573 != class135.field1557) {
					if (var0.field1573 == class135.field1561) {
						var10 = var1 - var5;
						var13 = var0.field1574[var0.method3335() - 1].field1524;
						var14 = var0.field1574[var0.method3335() - 1].field1529;
						var3 = var0.field1574[var0.method3335() - 1].field1528;
						if (0.0F != var13) {
							var3 += var10 * var14 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = class344.method6792(var0, var10);
				float var15;
				if (var2 && var0.field1572 == class135.field1557) {
					var15 = var0.field1574[var0.method3335() - 1].field1528 - var0.field1574[0].field1528;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1573 == class135.field1557) {
					var15 = var0.field1574[var0.method3335() - 1].field1528 - var0.field1574[0].field1528;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}
