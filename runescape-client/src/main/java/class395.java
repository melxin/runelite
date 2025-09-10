import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public enum class395 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4802(-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4807(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4804(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4805(2);

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -191198889
	)
	final int field4803;

	class395(int var3) {
		this.field4803 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4803;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "566898958"
	)
	static void method8231() {
		for (class273 var0 = (class273)Client.field437.last(); var0 != null; var0 = (class273)Client.field437.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1492666343"
	)
	static final void method8228(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
			var15 = var11 * var14 - var13 * var7 >> 16;
			var12 = var7 * var14 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var12 * var13 + var14 * var10 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			class257.field3087 = var0 - var10;
			class114.field1510 = var1 - var11;
			class401.field4853 = var2 - var12;
			class63.field884 = var3;
			class165.field1886 = var4;
		} else {
			HealthBarDefinition.cameraX = var0 - var10;
			class174.cameraY = var1 - var11;
			HttpRequest.cameraZ = var2 - var12;
			class401.cameraPitch = var3;
			WorldMapLabel.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class172.oculusOrbFocalPointX >> 7 != HealthBarUpdate.localPlayer.x >> 7 || BuddyRankComparator.oculusOrbFocalPointY >> 7 != HealthBarUpdate.localPlayer.y >> 7)) {
			var13 = HealthBarUpdate.localPlayer.plane;
			var14 = (class172.oculusOrbFocalPointX >> 7) + class333.topLevelWorldView.baseX;
			var15 = (BuddyRankComparator.oculusOrbFocalPointY >> 7) + class333.topLevelWorldView.baseY;
			WorldMapSectionType.method6782(var14, var15, var13, true);
		}

	}
}
