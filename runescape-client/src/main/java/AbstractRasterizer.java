import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("af")
	static int field2629;
	@ObfuscatedName("ab")
	boolean field2625;
	@ObfuscatedName("aw")
	boolean field2623;
	@ObfuscatedName("au")
	int[] field2627;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	Clips field2628;

	static {
		field2629 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkg;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2625 = false;
		this.field2623 = false;
		this.field2627 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2628 = var1;
	}

	@ObfuscatedName("ab")
	void method4854(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("ae")
	void method4830(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4828(var10, var13, var14, var15, var16);
		var11 = method4828(var11, var13, var14, var15, var16);
		var12 = method4828(var12, var13, var14, var15, var16);
		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ao")
	void method4865(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4828(var10, var11, var12, var13, var14);
		var10 = this.field2627[var15];
		this.vmethod5474(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ac")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("aj")
	abstract void vmethod5474(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("av")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("au")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aw")
	static int method4828(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("at")
	static final int method4829(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("an")
	static final int method4835() {
		return field2629;
	}

	@ObfuscatedName("af")
	static void method4853(int var0) {
		field2629 = var0;
	}

	@ObfuscatedName("ai")
	static void method4837(int var0) {
		int var1 = var0 * 210;
		method4853(var1);
	}
}
