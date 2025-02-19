import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("ae")
	static int field2673;
	@ObfuscatedName("ab")
	boolean field2671;
	@ObfuscatedName("ay")
	boolean field2663;
	@ObfuscatedName("aa")
	int[] field2670;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	Clips field2672;

	static {
		field2673 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2671 = false;
		this.field2663 = false;
		this.field2670 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2672 = var1;
	}

	@ObfuscatedName("ab")
	void method4857(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("ad")
	void method4869(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.field2672.field3000.overrideAmount;
		if (var13 > 0) {
			byte var14 = this.field2672.field3000.overrideHue;
			byte var15 = this.field2672.field3000.overrideSaturation;
			byte var16 = this.field2672.field3000.overrideLuminance;
			var10 = method4893(var10, var14, var15, var16, var13);
			var11 = method4893(var11, var14, var15, var16, var13);
			var12 = method4893(var12, var14, var15, var16, var13);
		}

		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ah")
	void method4861(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.field2672.field3000.overrideAmount;
		if (var11 > 0) {
			int var12 = method4893(var10, this.field2672.field3000.overrideHue, this.field2672.field3000.overrideSaturation, this.field2672.field3000.overrideLuminance, this.field2672.field3000.overrideAmount);
			var10 = this.field2670[var12];
		}

		this.vmethod5491(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ac")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ao")
	abstract void vmethod5491(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("af")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aa")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ay")
	static int method4893(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += var8 * (var1 - var5) >> 7;
		}

		if (var2 != -1) {
			var6 += var8 * (var2 - var6) >> 7;
		}

		if (var3 != -1) {
			var7 += var8 * (var3 - var7) >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfuscatedName("au")
	static final int method4866(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("as")
	static final int method4881() {
		return field2673;
	}

	@ObfuscatedName("ae")
	static void method4867(int var0) {
		field2673 = var0;
	}

	@ObfuscatedName("ax")
	static void method4868(int var0) {
		int var1 = var0 * 210;
		method4867(var1);
	}
}
