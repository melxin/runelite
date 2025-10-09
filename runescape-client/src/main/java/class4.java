import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public final class class4 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1978602545
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field10;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1881896873"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1492301028"
	)
	@Export("worldToScreen")
	static void worldToScreen(int var0, int var1, int var2, int var3) {
		if (var0 >= 128 && 13056 >= var0 && var1 >= 128 && 13056 >= var1) {
			var0 -= Huffman.cameraX;
			var2 -= class514.cameraY;
			var1 -= ChatChannel.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class386.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class386.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[SpriteBufferProperties.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[SpriteBufferProperties.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var2 - var4 * var1 >> 16;
			var1 = var4 * var2 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
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
