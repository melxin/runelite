import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("aa")
	static int field2671;
	@ObfuscatedName("am")
	boolean field2672;
	@ObfuscatedName("ah")
	boolean field2669;
	@ObfuscatedName("ag")
	int[] field2670;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	Clips field2675;

	static {
		field2671 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkh;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2672 = false;
		this.field2669 = false;
		this.field2670 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2675 = var1;
	}

	@ObfuscatedName("ac")
	void method5166(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("aa")
	void method5130(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.field2675.field2990.overrideAmount;
		if (var13 > 0) {
			byte var14 = this.field2675.field2990.overrideHue;
			byte var15 = this.field2675.field2990.overrideSaturation;
			byte var16 = this.field2675.field2990.overrideLuminance;
			var10 = method5124(var10, var14, var15, var16, var13);
			var11 = method5124(var11, var14, var15, var16, var13);
			var12 = method5124(var12, var14, var15, var16, var13);
		}

		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("am")
	void method5131(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.field2675.field2990.overrideAmount;
		if (var11 > 0) {
			int var12 = method5124(var10, this.field2675.field2990.overrideHue, this.field2675.field2990.overrideSaturation, this.field2675.field2990.overrideLuminance, this.field2675.field2990.overrideAmount);
			var10 = this.field2670[var12];
		}

		this.vmethod5777(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ah")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ag")
	abstract void vmethod5777(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("au")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ar")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ap")
	static int method5124(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("aj")
	static final int method5141(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("an")
	static final int method5136() {
		return field2671;
	}

	@ObfuscatedName("ai")
	static void method5155(int var0) {
		field2671 = var0;
	}

	@ObfuscatedName("al")
	static void method5128(int var0) {
		int var1 = var0 * 210;
		method5155(var1);
	}
}
