import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class113 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1436;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1419;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1420;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1421;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1422;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1423;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1428;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1425;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1426;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1427;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1430;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1418;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1429;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("field1390")
	static final class113 field1390;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1424;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	static final class113 field1433;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	static SpritePixels[] field1435;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 860939573
	)
	int field1434;

	static {
		field1436 = new class113(0);
		field1419 = new class113(1);
		field1420 = new class113(2);
		field1421 = new class113(3);
		field1422 = new class113(4);
		field1423 = new class113(5);
		field1428 = new class113(6);
		field1425 = new class113(7);
		field1426 = new class113(8);
		field1427 = new class113(9);
		field1430 = new class113(10);
		field1418 = new class113(11);
		field1429 = new class113(12);
		field1390 = new class113(13);
		field1424 = new class113(14);
		field1433 = new class113(15);
	}

	class113(int var1) {
		this.field1434 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2034895920"
	)
	static final void method3069(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4835();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var15 = var0 * var8 + var11 * var1 >> 16;
			int var17 = WorldMapRenderer.method6085(var11, var8, var1, var0);
			int var14 = class191.method3888(var13, var9, var1, var0);
			int var16 = var9 * var1 - var0 * var13 >> 16;
			var13 = var14;
			var14 = Interpreter.method2104(var10, var17, var3, var2);
			var17 = class180.method3752(var10, var17, var3, var2);
			var10 = var14;
			var14 = Interpreter.method2104(var12, var16, var3, var2);
			var9 = class180.method3752(var12, var16, var3, var2);
			class107.field1369 = (var14 + var10) / 2;
			Bounds.field4747 = (var15 + var13) / 2;
			class180.field1867 = (var17 + var9) / 2;
			class162.field1770 = (var14 - var10) / 2;
			class289.field3175 = (var13 - var15) / 2;
			class1.field5 = (var9 - var17) / 2;
			GrandExchangeOfferNameComparator.field4636 = Math.abs(class162.field1770);
			Client.field815 = Math.abs(class289.field3175);
			class146.field1657 = Math.abs(class1.field5);
			ViewportMouse.field2895.method8103((float)(var14 - var10), (float)(var13 - var15), (float)(var9 - var17));
			ViewportMouse.field2895.method8107();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILny;ZI)V",
		garbageValue = "-637882470"
	)
	static void method3068(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class403.getWorldMap().getMapArea(var0);
		int var4 = AsyncHttpResponse.localPlayer.plane;
		int var5 = (AsyncHttpResponse.localPlayer.x >> 7) + HttpRequest.topLevelWorldView.baseX;
		int var6 = (AsyncHttpResponse.localPlayer.y >> 7) + HttpRequest.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class403.getWorldMap().method9566(var3, var7, var1, var2);
	}
}
