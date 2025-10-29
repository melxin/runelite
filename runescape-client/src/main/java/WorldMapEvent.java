import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ik")
	static String field3547;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1281703535
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILoj;Loj;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "737657141"
	)
	static void method7177(String var0, String var1, String var2) {
		class30.method484(7);
		class525.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFB)F",
		garbageValue = "111"
	)
	public static float method7175(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var1 - var7) * (var4 - var3) + (var6 - var7) * (var0 - var4)) / var11;
		float var13 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var9 * var13 + var8 * var12 + var14 * var10;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFFIIII)V",
		garbageValue = "-475423693"
	)
	static final void method7176(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!ViewportMouse.ViewportMouse_false0) {
			float var11 = 50.0F;
			float var12 = (float)AbstractRasterizer.method5511();
			float var13 = (float)(ViewportMouse.ViewportMouse_x - var4) * var11 / (float)var6;
			float var14 = var11 * (float)(ViewportMouse.ViewportMouse_y - var5) / (float)var6;
			float var15 = var12 * (float)(ViewportMouse.ViewportMouse_x - var4) / (float)var6;
			float var16 = (float)(ViewportMouse.ViewportMouse_y - var5) * var12 / (float)var6;
			float var18 = var1 * var14 + var11 * var0;
			float var19 = var1 * var11 - var0 * var14;
			float var20 = var1 * var16 + var0 * var12;
			float var21 = var1 * var12 - var16 * var0;
			float var22 = var13 * var3 - var19 * var2;
			var11 = FontName.method11268(var13, var19, var3, var2);
			float var23 = var15 * var3 - var2 * var21;
			var12 = FontName.method11268(var15, var21, var3, var2);
			ReflectionCheck.method3624((int)var22, (int)var18, (int)var11, (int)var23, (int)var20, (int)var12);
		}
	}
}
