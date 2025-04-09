import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("an")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "425325278"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwu;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "36"
	)
	static void method6347(TransformationMatrix var0) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var1 = 50;
			int var2 = AbstractRasterizer.method4001();
			int var3 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var1 / Rasterizer3D.get3dZoom();
			int var4 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var1 / Rasterizer3D.get3dZoom();
			int var5 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var2 / Rasterizer3D.get3dZoom();
			int var6 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var2 / Rasterizer3D.get3dZoom();
			TransformationMatrix var7;
			synchronized(TransformationMatrix.field4932) {
				if (class339.field3763 == 0) {
					var7 = new TransformationMatrix(var0);
				} else {
					TransformationMatrix.field4932[--class339.field3763].method8430(var0);
					var7 = TransformationMatrix.field4932[class339.field3763];
				}
			}

			var7.method8439();
			float[] var9 = new float[3];
			var7.transformPoint((float)var3, (float)var4, (float)var1, var9);
			var3 = (int)var9[0];
			var4 = (int)var9[1];
			int var11 = (int)var9[2];
			var7.transformPoint((float)var5, (float)var6, (float)var2, var9);
			var5 = (int)var9[0];
			var6 = (int)var9[1];
			var2 = (int)var9[2];
			var7.method8500();
			WorldMapData_0.field3149 = (var5 + var3) / 2;
			class214.field2434 = (var4 + var6) / 2;
			class110.field1408 = (var11 + var2) / 2;
			class504.field5236 = (var5 - var3) / 2;
			Login.field963 = (var6 - var4) / 2;
			class72.field886 = (var2 - var11) / 2;
			class169.field1861 = Math.abs(class504.field5236);
			class74.field907 = Math.abs(Login.field963);
			HorizontalAlignment.field2685 = Math.abs(class72.field886);
			ViewportMouse.field2299.method8340((float)(var5 - var3), (float)(var6 - var4), (float)(var2 - var11));
			ViewportMouse.field2299.method8344();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}
}
