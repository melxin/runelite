import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class114 {
	@ObfuscatedName("ad")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("ou")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -725260395
	)
	int field1492;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 580461485
	)
	int field1490;
	@ObfuscatedName("ac")
	byte[] field1491;

	class114() {
		this.field1492 = 0;
		this.field1490 = 0;
		this.field1491 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1008479519"
	)
	int method3409(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field1490; var1 -= var4) {
			var4 = 8 - this.field1490;
			int var5 = (1 << var4) - 1;
			var2 += (this.field1491[this.field1492] >> this.field1490 & var5) << var3;
			this.field1490 = 0;
			++this.field1492;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field1491[this.field1492] >> this.field1490 & var4) << var3;
			this.field1490 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	int method3408() {
		int var1 = this.field1491[this.field1492] >> this.field1490 & 1;
		++this.field1490;
		this.field1492 += this.field1490 >> 3;
		this.field1490 &= 7;
		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIS)V",
		garbageValue = "-13006"
	)
	void method3400(byte[] var1, int var2) {
		this.field1491 = var1;
		this.field1492 = var2;
		this.field1490 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "40"
	)
	static final boolean method3402(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class359.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class559.field5678;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class559.field5680;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFFIIIB)V",
		garbageValue = "-28"
	)
	public static final void method3411(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!ViewportMouse.ViewportMouse_false0) {
			float var11 = 50.0F;
			float var12 = (float)AbstractRasterizer.method5026();
			float var13 = (float)(ViewportMouse.ViewportMouse_x - var4) * var11 / (float)var6;
			float var14 = (float)(ViewportMouse.ViewportMouse_y - var5) * var11 / (float)var6;
			float var15 = var12 * (float)(ViewportMouse.ViewportMouse_x - var4) / (float)var6;
			float var16 = var12 * (float)(ViewportMouse.ViewportMouse_y - var5) / (float)var6;
			float var18 = var0 * var11 + var1 * var14;
			float var19 = var1 * var11 - var14 * var0;
			float var17 = class155.method3844(var16, var12, var1, var0);
			float var20 = var12 * var1 - var16 * var0;
			var16 = var17;
			var17 = SpotAnimationDefinition.method4410(var13, var19, var3, var2);
			float var21 = var19 * var3 + var2 * var13;
			var13 = var17;
			var17 = SpotAnimationDefinition.method4410(var15, var20, var3, var2);
			float var22 = var3 * var20 + var15 * var2;
			FriendSystem.method1578((int)var13, (int)var18, (int)var21, (int)var17, (int)var16, (int)var22);
		}
	}
}
