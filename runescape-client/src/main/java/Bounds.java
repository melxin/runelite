import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lrw;"
	)
	public static Bounds[] field5164;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 636525271
	)
	static int field5157;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 292874865
	)
	public static int field5161;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -50774795
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -660429583
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -952635521
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 747239103
	)
	@Export("highY")
	public int highY;

	static {
		field5164 = new Bounds[0];
		field5157 = 8;
		field5164 = new Bounds[8];
		field5161 = 0;
	}

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public void method8941() {
		synchronized(field5164) {
			if (field5161 < field5157) {
				field5164[++field5161 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "102"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1670106959"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1642465505"
	)
	public boolean method8976(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I)Z",
		garbageValue = "-1498497084"
	)
	public boolean method8944(Bounds var1) {
		return this.lowX <= var1.method8948() && var1.lowX <= this.method8948() && this.lowY <= var1.method8949() && var1.lowY <= this.method8949();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)V",
		garbageValue = "674770577"
	)
	public void method8945(Bounds var1, Bounds var2) {
		this.method8959(var1, var2);
		this.method8946(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;B)V",
		garbageValue = "4"
	)
	void method8959(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8948() > var1.method8948()) {
			var2.highX -= var2.method8948() - var1.method8948();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)V",
		garbageValue = "1378406993"
	)
	void method8946(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8949() > var1.method8949()) {
			var2.highY -= var2.method8949() - var1.method8949();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	int method8948() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	int method8949() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-557356187"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class333.topLevelWorldView.scene.cycle = Client.cycle;
		if (HealthBarUpdate.localPlayer.x >> 7 == Client.destinationX && HealthBarUpdate.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		BufferedNetSocket.method10222(class333.topLevelWorldView);
		WorldView var4 = class333.topLevelWorldView;
		int var5 = Client.menu.menuOptionsCount - 1;
		int var7;
		if (var4 == class333.topLevelWorldView && var5 >= 0 && Client.menu.menuOpcodes[var5] == 60) {
			var7 = Client.menu.menuIdentifiers[var5] * 128;
			class36.method731(var4, var7, WorldMapArea.field3341);
		}

		WorldView var29 = class333.topLevelWorldView;
		if (Client.renderSelf) {
			class390.addPlayerToScene(var29, Client.localPlayerIndex, false);
		}

		WorldView var30 = class333.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var30.players.get((long)Client.combatTargetPlayerIndex) != null) {
			class390.addPlayerToScene(var30, Client.combatTargetPlayerIndex, false);
		}

		WorldView var31 = class333.topLevelWorldView;
		WorldEntity var8 = (WorldEntity)var31.worldEntities.get((long)Client.currentWorldViewId);
		if (var8 != null) {
			class192.method4314(var31, var8, false);
		}

		StructComposition.method4564(class333.topLevelWorldView, class394.TOKEN);
		StructComposition.method4564(class333.topLevelWorldView, class394.field4796);
		ModeWhere.addNpcsToScene(class333.topLevelWorldView, class197.field2163);
		NPC.method2772(class333.topLevelWorldView);
		ModeWhere.addNpcsToScene(class333.topLevelWorldView, class197.field2162);
		ModeWhere.addNpcsToScene(class333.topLevelWorldView, class197.field2164);
		ItemContainer.method2120();
		WorldView var38 = class333.topLevelWorldView;

		for (GraphicsObject var9 = (GraphicsObject)var38.graphicsObjects.last(); var9 != null; var9 = (GraphicsObject)var38.graphicsObjects.previous()) {
			if (var38.plane == var9.plane && !var9.method1874()) {
				if (Client.cycle >= var9.cycleStart) {
					var9.advance(Client.graphicsCycle);
					if (var9.method1874()) {
						var9.remove();
					} else {
						var38.scene.drawEntity(var9.plane, var9.x, var9.y, var9.z, 60, var9, 0, -1L, false);
					}
				}
			} else {
				var9.remove();
			}
		}

		StructComposition.method4564(class333.topLevelWorldView, class394.field4801);
		WorldMapSectionType.setViewportShape(var0, var1, var2, var3, true);
		int var32 = Client.viewportOffsetX;
		var5 = Client.viewportOffsetY;
		int var6 = Client.viewportWidth;
		var7 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var32, var5, var32 + var6, var7 + var5);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var33 = Client.camAngleX;
		if (Client.field416 / 256 > var33) {
			var33 = Client.field416 / 256;
		}

		if (Client.field610[4] && Client.field594[4] + 128 > var33) {
			var33 = Client.field594[4] + 128;
		}

		int var34 = Client.camAngleY & 2047;
		int var10 = class172.oculusOrbFocalPointX;
		int var11 = class191.oculusOrbFocalPointZ;
		int var12 = BuddyRankComparator.oculusOrbFocalPointY;
		int var15 = var33 * 3 + 600;
		class395.method8228(var10, var11, var12, var33, var34, var15, var7);
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		if (!Client.isCameraLocked) {
			var16 = HttpResponse.method306();
		} else {
			if (class36.clientPreferences.isRoofsHidden()) {
				var17 = class333.topLevelWorldView.plane;
			} else {
				var18 = HealthBarDefinition.cameraX >> 7;
				var19 = HttpRequest.cameraZ >> 7;
				if (var18 >= 0 && 104 > var18 && var19 >= 0 && 104 > var19) {
					var20 = JagNetThread.getTileHeight(class333.topLevelWorldView, HealthBarDefinition.cameraX, HttpRequest.cameraZ, class333.topLevelWorldView.plane);
					if (var20 - class174.cameraY < 800 && (class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var18][var19] & 4) != 0) {
						var17 = class333.topLevelWorldView.plane;
					} else {
						var17 = 3;
					}
				} else {
					var17 = class333.topLevelWorldView.plane;
				}
			}

			var16 = var17;
		}

		var17 = HealthBarDefinition.cameraX;
		var18 = class174.cameraY;
		var19 = HttpRequest.cameraZ;
		var20 = class401.cameraPitch;
		int var21 = WorldMapLabel.cameraYaw;

		int var22;
		int var23;
		for (var22 = 0; var22 < 5; ++var22) {
			if (Client.field610[var22]) {
				var23 = (int)(Math.random() * (double)(Client.field593[var22] * 2 + 1) - (double)Client.field593[var22] + Math.sin((double)Client.field406[var22] * ((double)Client.field595[var22] / 100.0D)) * (double)Client.field594[var22]);
				if (var22 == 0) {
					HealthBarDefinition.cameraX += var23;
				}

				if (var22 == 1) {
					class174.cameraY += var23;
				}

				if (var22 == 2) {
					HttpRequest.cameraZ += var23;
				}

				if (var22 == 3) {
					WorldMapLabel.cameraYaw = var23 + WorldMapLabel.cameraYaw & 2047;
				}

				if (var22 == 4) {
					class401.cameraPitch += var23;
					if (class401.cameraPitch < 128) {
						class401.cameraPitch = 128;
					}

					if (class401.cameraPitch > 383) {
						class401.cameraPitch = 383;
					}
				}
			}
		}

		var22 = MouseHandler.MouseHandler_x;
		var23 = MouseHandler.MouseHandler_y;
		int var24;
		if (var22 >= var32 && var22 < var6 + var32 && var23 >= var5 && var23 < var7 + var5) {
			var24 = var22 - var32;
			int var25 = var23 - var5;
			ViewportMouse.ViewportMouse_x = var24;
			ViewportMouse.ViewportMouse_y = var25;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
			Iterator var26 = Client.worldViewManager.iterator();

			while (var26.hasNext()) {
				WorldView var27 = (WorldView)var26.next();
				var27.scene.method5140(var27.plane, var22 - var32, var23 - var5);
			}
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		UserComparator5.method3557();
		Rasterizer2D.Rasterizer2D_fillRectangle(var32, var5, var6, var7, 0);
		UserComparator5.method3557();
		var24 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4927(class521.client.field206);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		class217 var35 = Client.currentWorldViewId == -1 ? class217.field2512 : class217.field2511;
		class333.topLevelWorldView.scene.method5139(var35);
		class333.topLevelWorldView.scene.draw(HealthBarDefinition.cameraX, class174.cameraY, HttpRequest.cameraZ, class401.cameraPitch, WorldMapLabel.cameraYaw, var16, Client.field552, Client.field337, Client.isCameraLocked);
		Rasterizer3D.method4927(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var24;
		UserComparator5.method3557();
		class303.method6830(class333.topLevelWorldView, var32, var5, var6, var7);

		for (int var36 = 0; var36 < class333.topLevelWorldView.field1176.method9790(); ++var36) {
			WorldEntity var41 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)class333.topLevelWorldView.field1176.method9787(var36));
			if (var41 != null) {
				class303.method6830(var41.worldView, var32, var5, var6, var7);
			}
		}

		WorldView var40 = class333.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var37 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var40.baseX << 7);
			int var28 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var40.baseY << 7);
			class41.worldToScreen(var40, var37, var28, var37, var28, Client.hintArrowHeight * 2, 0);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class400.headIconHintSprites[0].drawTransBgAt(var32 + Client.viewportTempX - 12, var5 + Client.viewportTempY - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		SecureRandomCallable.method2086(var32, var5, var6, var7);
		HealthBarDefinition.cameraX = var17;
		class174.cameraY = var18;
		HttpRequest.cameraZ = var19;
		class401.cameraPitch = var20;
		WorldMapLabel.cameraYaw = var21;
		if (Client.isLoading && WorldMapSectionType.field3418.method8443(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var32, var5, var6, var7, 0);
			class464.drawLoadingMessage("Loading - please wait.", false);
		}

		class333.topLevelWorldView.scene.setViewportWalking();

		for (var33 = 0; var33 < class333.topLevelWorldView.field1176.method9790(); ++var33) {
			WorldEntity var39 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)class333.topLevelWorldView.field1176.method9787(var33));
			if (var39 != null) {
				var39.worldView.scene.setViewportWalking();
			}
		}

	}
}
