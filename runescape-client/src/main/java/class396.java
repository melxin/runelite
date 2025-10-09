import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public enum class396 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	field4884(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	field4882(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	field4883(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	field4889(3, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	field4885(4, 4); // ??

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 294458489
	)
	final int field4888;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 345046397
	)
	final int field4886;

	class396(int var3, int var4) {
		this.field4888 = var3;
		this.field4886 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4886;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-49"
	)
	static final void method8282(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var14 * var11 - var13 * var7 >> 16;
			var12 = var14 * var7 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var14 * var10 + var13 * var12 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			class304.field3485 = var0 - var10;
			GameEngine.field187 = var1 - var11;
			ServerPacket.field3813 = var2 - var12;
			class70.field966 = var3;
			class32.field150 = var4;
		} else {
			Huffman.cameraX = var0 - var10;
			class514.cameraY = var1 - var11;
			ChatChannel.cameraZ = var2 - var12;
			class386.cameraPitch = var3;
			SpriteBufferProperties.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class454.oculusOrbFocalPointX >> 7 != class159.localPlayer.x >> 7 || WorldMapElement.oculusOrbFocalPointY >> 7 != class159.localPlayer.y >> 7)) {
			var13 = class159.localPlayer.plane;
			var14 = (class454.oculusOrbFocalPointX >> 7) + class547.topLevelWorldView.baseX;
			var15 = (WorldMapElement.oculusOrbFocalPointY >> 7) + class547.topLevelWorldView.baseY;
			FloorOverlayDefinition.method4817(var14, var15, var13, true);
		}

	}
}
