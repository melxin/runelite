import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class41 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1395797943"
	)
	static int method781(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
		int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2084416642"
	)
	static void method782() {
		class464.otp.trim();
		if (class464.otp.length() != 6) {
			MouseRecorder.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class38.otpMedium = Integer.parseInt(class464.otp);
			class464.otp = "";
			class325.method7035(true);
			MouseRecorder.setLoginResponseString("", "Connecting to server...", "");
			UrlRequest.updateGameState(20);
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIB)V",
		garbageValue = "10"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var7 = class255.method5812(var0, var3, var4, var0.plane, var6);
			int var8 = var7 - var5;
			var1 -= HealthBarDefinition.cameraX;
			var8 -= class174.cameraY;
			var2 -= HttpRequest.cameraZ;
			int var9 = Rasterizer3D.Rasterizer3D_sine[class401.cameraPitch];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class401.cameraPitch];
			int var11 = Rasterizer3D.Rasterizer3D_sine[WorldMapLabel.cameraYaw];
			int var12 = Rasterizer3D.Rasterizer3D_cosine[WorldMapLabel.cameraYaw];
			int var13 = var11 * var2 + var12 * var1 >> 16;
			var2 = var12 * var2 - var11 * var1 >> 16;
			var1 = var13;
			var13 = var10 * var8 - var9 * var2 >> 16;
			var2 = var10 * var2 + var8 * var9 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var13 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
