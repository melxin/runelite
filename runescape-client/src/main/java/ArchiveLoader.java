import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 800988165
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1183611203
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lpo;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "652237592"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method8290(var1) || this.archive.method8304(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIS)V",
		garbageValue = "3913"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "463708883"
	)
	static final void method2093(int var0, int var1, int var2, int var3) {
		class180.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var4 = Client.camAngleX;
		if (Client.field363 / 256 > var4) {
			var4 = Client.field363 / 256;
		}

		if (Client.field571[4] && Client.field573[4] + 128 > var4) {
			var4 = Client.field573[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		int var6 = class28.oculusOrbFocalPointX;
		int var7 = ClanChannelMember.oculusOrbFocalPointZ;
		int var8 = MusicPatch.oculusOrbFocalPointY;
		int var9 = BuddyRankComparator.method3551(var4);
		int var11 = var3 - 334;
		if (var11 < 0) {
			var11 = 0;
		} else if (var11 > 100) {
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
		int var10 = var9 * var12 / 256;
		var11 = 2048 - var4 & 2047;
		var12 = 2048 - var5 & 2047;
		int var13 = 0;
		int var14 = 0;
		int var15 = var10;
		int var16;
		int var17;
		int var18;
		if (var11 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var11];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var18 = var14 * var17 - var10 * var16 >> 16;
			var15 = var14 * var16 + var10 * var17 >> 16;
			var14 = var18;
		}

		if (var12 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var12];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var18 = var17 * var13 + var16 * var15 >> 16;
			var15 = var15 * var17 - var16 * var13 >> 16;
			var13 = var18;
		}

		if (Client.isCameraLocked) {
			class50.field700 = var6 - var13;
			Login.field743 = var7 - var14;
			class66.field894 = var8 - var15;
			class266.field3103 = var4;
			AsyncRestClient.field60 = var5;
		} else {
			Language.cameraX = var6 - var13;
			WorldMapCacheName.cameraY = var7 - var14;
			class66.cameraZ = var8 - var15;
			class187.cameraPitch = var4;
			class28.cameraYaw = var5;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class28.oculusOrbFocalPointX >> 7 != class27.localPlayer.x >> 7 || MusicPatch.oculusOrbFocalPointY >> 7 != class27.localPlayer.y >> 7)) {
			var16 = class27.localPlayer.plane;
			var17 = (class28.oculusOrbFocalPointX >> 7) + class7.topLevelWorldView.baseX;
			var18 = (MusicPatch.oculusOrbFocalPointY >> 7) + class7.topLevelWorldView.baseY;
			PcmPlayer.method3004(var17, var18, var16, true);
		}

		if (!Client.isCameraLocked) {
			var10 = AuthenticationScheme.method3567();
		} else {
			var10 = class7.method36();
		}

		var11 = Language.cameraX;
		var12 = WorldMapCacheName.cameraY;
		var13 = class66.cameraZ;
		var14 = class187.cameraPitch;
		var15 = class28.cameraYaw;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field571[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field572[var16] * 2 + 1) - (double)Client.field572[var16] + Math.sin((double)Client.field395[var16] / 100.0D * (double)Client.field575[var16]) * (double)Client.field573[var16]);
				if (var16 == 0) {
					Language.cameraX += var17;
				}

				if (var16 == 1) {
					WorldMapCacheName.cameraY += var17;
				}

				if (var16 == 2) {
					class66.cameraZ += var17;
				}

				if (var16 == 3) {
					class28.cameraYaw = var17 + class28.cameraYaw & 2047;
				}

				if (var16 == 4) {
					class187.cameraPitch += var17;
					if (class187.cameraPitch < 128) {
						class187.cameraPitch = 128;
					}

					if (class187.cameraPitch > 383) {
						class187.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x;
		var17 = MouseHandler.MouseHandler_y;
		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
			MusicPatchNode2.method7088(var16 - var0, var17 - var1);
			Iterator var23 = Client.worldViewManager.iterator();

			while (var23.hasNext()) {
				WorldView var19 = (WorldView)var23.next();
				var19.scene.method5253(var19.plane, var16 - var0, var17 - var1);
			}
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		MouseHandler.method722();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		MouseHandler.method722();
		var18 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4968(Language.client.field179);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		class215 var26 = Client.field326 == -1 ? class215.field2460 : class215.field2461;
		class7.topLevelWorldView.scene.method5115(var26);
		class7.topLevelWorldView.scene.draw(Language.cameraX, WorldMapCacheName.cameraY, class66.cameraZ, class187.cameraPitch, class28.cameraYaw, var10, Client.field581, Client.field492, Client.isCameraLocked);
		Rasterizer3D.method4968(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var18;
		MouseHandler.method722();
		class400.method8270(class7.topLevelWorldView, var0, var1, var2, var3);

		for (int var20 = 0; var20 < class7.topLevelWorldView.field1143.method9810(); ++var20) {
			WorldEntity var25 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)class7.topLevelWorldView.field1143.method9817(var20));
			if (var25 != null) {
				class400.method8270(var25.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var24 = class7.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var21 = (Client.hintArrowX - var24.baseX << 7) + Client.field440 * 4096;
			int var22 = (Client.hintArrowY - var24.baseY << 7) + Client.field441 * 4096;
			RestClientThreadFactory.method211(var24, var21, var22, var21, var22, Client.field439 * 4, 0);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class389.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class393.method8228(var0, var1, var2, var3);
		Language.cameraX = var11;
		WorldMapCacheName.cameraY = var12;
		class66.cameraZ = var13;
		class187.cameraPitch = var14;
		class28.cameraYaw = var15;
		if (Client.isLoading && HorizontalAlignment.field2060.method8454(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			WorldMapLabel.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
