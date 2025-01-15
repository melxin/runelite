import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("au")
	static int field1990;
	@ObfuscatedName("ay")
	boolean field1983;
	@ObfuscatedName("ah")
	boolean field1981;
	@ObfuscatedName("at")
	int[] field1989;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	Clips field1982;

	static {
		field1990 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lhm;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field1983 = false;
		this.field1981 = false;
		this.field1989 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field1982 = var1;
	}

	@ObfuscatedName("ay")
	void method4133(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("ao")
	void method4134(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4132(var10, var13, var14, var15, var16);
		var11 = method4132(var11, var13, var14, var15, var16);
		var12 = method4132(var12, var13, var14, var15, var16);
		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ad")
	void method4152(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4132(var10, var11, var12, var13, var14);
		var10 = this.field1989[var15];
		this.vmethod4755(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("an")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ae")
	abstract void vmethod4755(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ax")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("at")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ah")
	static int method4132(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("az")
	static final int method4131(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ac")
	static final int method4138() {
		return field1990;
	}

	@ObfuscatedName("au")
	static void method4139(int var0) {
		field1990 = var0;
	}

	@ObfuscatedName("as")
	static void method4156(int var0) {
		int var1 = var0 * 210;
		method4139(var1);
	}
}
