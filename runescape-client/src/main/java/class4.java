import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class4 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 47249087
	)
	public static int field8;
	@ObfuscatedName("bz")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	static class384 field7;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)Lre;",
		garbageValue = "1274021437"
	)
	public static final class452 method18(class452 var0, class452 var1) {
		class452 var2 = class334.method7060(var0);
		var2.method8997(var1);
		return var2;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-239212976"
	)
	static int method16(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Loi;III)V",
		garbageValue = "1388841937"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method8005(UrlRequester.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + Client.field552 >> 7;
					int var12 = Client.field337 - var10 >> 7;
					class518 var13 = Client.worldViewManager.method2352(-1);
					if (var13 == class518.field5493) {
						class455.method9187(var11, var12, var4, var5);
					} else if (var13 == class518.field5494) {
						int var15 = var3.width / 2 + var1;
						int var16 = var3.height / 2 + var2;
						int var17 = MouseHandler.MouseHandler_x - var15;
						int var18 = MouseHandler.MouseHandler_y - var16;
						int var19 = UserComparator9.method3568(var18, var17);
						var19 -= Client.camAngleY;
						var19 &= 2047;
						int var21 = var19 + 64;
						int var20 = (var21 & 2047) / 128;
						Client.field583 = var20;
						Client.field584 = 30;
						class204.method4499(Client.field583);
					}
				}
			}

		}
	}
}
