import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("ah")
	static int field2616;
	@ObfuscatedName("ap")
	boolean field2617;
	@ObfuscatedName("am")
	int[] field2611;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	Clips field2619;

	static {
		field2616 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljz;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2617 = false;
		this.field2611 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2619 = var1;
	}

	@ObfuscatedName("as")
	abstract boolean vmethod5761();

	@ObfuscatedName("ah")
	void method5030(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	void method5031(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.field2619.field2943.overrideAmount;
		if (var13 > 0) {
			byte var14 = this.field2619.field2943.overrideHue;
			byte var15 = this.field2619.field2943.overrideSaturation;
			byte var16 = this.field2619.field2943.overrideLuminance;
			var10 = method5024(var10, var14, var15, var16, var13);
			var11 = method5024(var11, var14, var15, var16, var13);
			var12 = method5024(var12, var14, var15, var16, var13);
		}

		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("am")
	void method5063(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.field2619.field2943.overrideAmount;
		if (var11 > 0) {
			int var12 = method5024(var10, this.field2619.field2943.overrideHue, this.field2619.field2943.overrideSaturation, this.field2619.field2943.overrideLuminance, this.field2619.field2943.overrideAmount);
			var10 = this.field2611[var12];
		}

		this.vmethod5725(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("aj")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ag")
	abstract void vmethod5725(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ay")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aa")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("al")
	static int method5024(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("ab")
	static final int method5025(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ac")
	static final int method5026() {
		return field2616;
	}

	@ObfuscatedName("av")
	static void method5054(int var0) {
		field2616 = var0;
	}

	@ObfuscatedName("au")
	static void method5032(int var0) {
		int var1 = var0 * 210;
		method5054(var1);
	}
}
