import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("av")
	static int field2026;
	@ObfuscatedName("am")
	boolean field2027;
	@ObfuscatedName("aa")
	boolean field2028;
	@ObfuscatedName("ap")
	int[] field2029;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	Clips field2030;

	static {
		field2026 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lhm;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2027 = false;
		this.field2028 = false;
		this.field2029 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2030 = var1;
	}

	@ObfuscatedName("aq")
	void method4037(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("av")
	void method4004(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		byte var13 = this.field2030.field2344.overrideAmount;
		if (var13 > 0) {
			byte var14 = this.field2030.field2344.overrideHue;
			byte var15 = this.field2030.field2344.overrideSaturation;
			byte var16 = this.field2030.field2344.overrideLuminance;
			var10 = method3999(var10, var14, var15, var16, var13);
			var11 = method3999(var11, var14, var15, var16, var13);
			var12 = method3999(var12, var14, var15, var16, var13);
		}

		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("am")
	void method4005(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		byte var11 = this.field2030.field2344.overrideAmount;
		if (var11 > 0) {
			int var12 = method3999(var10, this.field2030.field2344.overrideHue, this.field2030.field2344.overrideSaturation, this.field2030.field2344.overrideLuminance, this.field2030.field2344.overrideAmount);
			var10 = this.field2029[var12];
		}

		this.vmethod4638(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("aa")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ap")
	abstract void vmethod4638(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ax")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aw")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ao")
	static int method3999(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("an")
	static final int method4000(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ae")
	static final int method4001() {
		return field2026;
	}

	@ObfuscatedName("af")
	static void method4002(int var0) {
		field2026 = var0;
	}

	@ObfuscatedName("as")
	static void method4012(int var0) {
		int var1 = var0 * 210;
		method4002(var1);
	}
}
