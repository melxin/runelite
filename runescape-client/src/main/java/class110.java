import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
final class class110 implements class351 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	class110(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1894647927"
	)
	public void vmethod7020() {
		if (this.val$item.method7447().field3804 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2628(this.val$item);
			var1.setArgs(this.val$item.method7447().field3804);
			WorldMapElement.method5196().addFirst(var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-8"
	)
	static final void method3122(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4138();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var14 = FriendSystem.method2089(var11, var8, var1, var0);
			int var19 = class93.method2647(var11, var8, var1, var0);
			var11 = var14;
			var14 = FriendSystem.method2089(var13, var9, var1, var0);
			var9 = class93.method2647(var13, var9, var1, var0);
			int var15 = var3 * var10 - var2 * var19 >> 16;
			int var16 = var19 * var3 + var10 * var2 >> 16;
			int var17 = var12 * var3 - var2 * var9 >> 16;
			int var18 = var9 * var3 + var12 * var2 >> 16;
			ViewportMouse.field2267 = (var17 + var15) / 2;
			Huffman.field4034 = (var14 + var11) / 2;
			class169.field1804 = (var16 + var18) / 2;
			ViewportMouse.field2262 = (var17 - var15) / 2;
			class496.field5128 = (var14 - var11) / 2;
			CollisionMap.field2995 = (var18 - var16) / 2;
			WorldMapSprite.field3231 = Math.abs(ViewportMouse.field2262);
			class464.field4955 = Math.abs(class496.field5128);
			UserComparator10.field1516 = Math.abs(CollisionMap.field2995);
			ViewportMouse.field2268.method8285((float)(var17 - var15), (float)(var14 - var11), (float)(var18 - var16));
			ViewportMouse.field2268.method8289();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}
}
