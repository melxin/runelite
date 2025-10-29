import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class210 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class210 field2264;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class210 field2263;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class210 field2262;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class210 field2265;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class210 field2266;
	@ObfuscatedName("od")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	static {
		field2264 = new class210(0);
		field2263 = new class210(1);
		field2262 = new class210(2);
		field2265 = new class210(3);
		field2266 = new class210(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class210(int var1) {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljh;IIIIIIII)Lrx;",
		garbageValue = "-317748003"
	)
	public static final ProjectionCoord method4667(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		float var8 = 1.0E-5F;
		ModelData0.method6245();
		WorldMapEvent.method7176(var0.field2905, var0.field2876, var0.field2907, var0.field2846, var5, var6, var7);
		ProjectionCoord var9 = FaceNormal.method5848(0.0F, 1.0F, 0.0F);
		ProjectionCoord var11 = ViewportMouse.field3109;
		float var10 = var9.method9303(var11);
		if (Math.abs(var10) < 1.0E-5F) {
			var9.release();
			return null;
		} else {
			ProjectionCoord var13 = FaceNormal.method5848((float)var2, (float)var3, (float)var4);
			ProjectionCoord var14 = FaceNormal.method5848(var13.x, var13.z - (float)var1, var13.y);
			float var15 = var9.method9303(var14);
			float var16 = -var15 / var10;
			var9.release();
			if (var16 < 0.0F) {
				var14.release();
				var13.release();
				return null;
			} else {
				ProjectionCoord var17 = ViewportMouse.method6107(ViewportMouse.field3109, var16);
				ProjectionCoord var19 = class30.method486(var13);
				var19.method9294(var17);
				var17.release();
				var14.release();
				var13.release();
				return var19;
			}
		}
	}
}
