import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("ao")
	static int field2665;
	@ObfuscatedName("as")
	boolean field2659;
	@ObfuscatedName("al")
	int[] field2667;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	Clips field2668;

	static {
		field2665 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2659 = false;
		this.field2667 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2668 = var1;
	}

	@ObfuscatedName("aq")
	abstract boolean vmethod5713();

	@ObfuscatedName("ao")
	void method5054(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("as")
	void method5059(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.field2668.field3001.overrideAmount;
		if (var13 > 0) {
			byte var14 = this.field2668.field3001.overrideHue;
			byte var15 = this.field2668.field3001.overrideSaturation;
			byte var16 = this.field2668.field3001.overrideLuminance;
			var10 = method5090(var10, var14, var15, var16, var13);
			var11 = method5090(var11, var14, var15, var16, var13);
			var12 = method5090(var12, var14, var15, var16, var13);
		}

		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("al")
	void method5055(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.field2668.field3001.overrideAmount;
		if (var11 > 0) {
			int var12 = method5090(var10, this.field2668.field3001.overrideHue, this.field2668.field3001.overrideSaturation, this.field2668.field3001.overrideLuminance, this.field2668.field3001.overrideAmount);
			var10 = this.field2667[var12];
		}

		this.vmethod5717(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("au")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ai")
	abstract void vmethod5717(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("aa")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("am")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("af")
	static int method5090(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("aw")
	static final int method5087(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("at")
	static final int method5050() {
		return field2665;
	}

	@ObfuscatedName("ac")
	static void method5051(int var0) {
		field2665 = var0;
	}

	@ObfuscatedName("ap")
	static void method5052(int var0) {
		int var1 = var0 * 210;
		method5051(var1);
	}
}
