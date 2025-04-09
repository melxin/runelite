import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class376 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-704424996"
	)
	public static int method7547(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1851165126"
	)
	public static final void method7548(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4001();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var15 = var1 * var11 + var0 * var8 >> 16;
			int var19 = HttpResponse.method305(var11, var8, var1, var0);
			int var16 = var1 * var13 + var9 * var0 >> 16;
			var9 = HttpResponse.method305(var13, var9, var1, var0);
			int var14 = class152.method3502(var10, var19, var3, var2);
			int var17 = var10 * var2 + var19 * var3 >> 16;
			var10 = var14;
			var14 = class152.method3502(var12, var9, var3, var2);
			int var18 = var12 * var2 + var3 * var9 >> 16;
			WorldMapData_0.field3149 = (var14 + var10) / 2;
			class214.field2434 = (var16 + var15) / 2;
			class110.field1408 = (var17 + var18) / 2;
			class504.field5236 = (var14 - var10) / 2;
			Login.field963 = (var16 - var15) / 2;
			class72.field886 = (var18 - var17) / 2;
			class169.field1861 = Math.abs(class504.field5236);
			class74.field907 = Math.abs(Login.field963);
			HorizontalAlignment.field2685 = Math.abs(class72.field886);
			ViewportMouse.field2299.method8340((float)(var14 - var10), (float)(var16 - var15), (float)(var18 - var17));
			ViewportMouse.field2299.method8344();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}
}
