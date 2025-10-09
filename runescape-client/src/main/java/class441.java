import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class441 {
	@ObfuscatedName("ab")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIB)V",
		garbageValue = "94"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		StudioGame.method8201();
		SpriteMask var4 = var0.method8091(class35.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field484 / 32 + 48;
				int var7 = 464 - Client.field377 / 32;
				class135.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var1, var2, var4.xStarts, var4.xWidths);
				class404.method8318(var1, var2, var5, var4);
				class160.method3974(class547.topLevelWorldView, var1, var2, var5, var4);
				AttackOption.method2882(class547.topLevelWorldView, var1, var2, var5, var4);
				WorldView var8 = class547.topLevelWorldView;

				int var9;
				int var11;
				for (var9 = 0; var9 < var8.field1170.method9887(); ++var9) {
					WorldEntity var15 = (WorldEntity)var8.worldEntities.get((long)var8.field1170.method9886(var9));
					if (var15 != null && !var15.method10243()) {
						var11 = var15.getY() / 32 - Client.field484 / 32;
						int var12 = var15.getPlane() / 32 - Client.field377 / 32;
						SpritePixels var13 = var15.field5482.method4514();
						byte var14 = 1;
						Sound.method3958(var1, var2, var11, var12, var5, 2047 - var15.method10204() + 1024, var13, var4, var14);
						class160.method3974(var15.worldView, var1, var2, var5, var4);
						AttackOption.method2882(var15.worldView, var1, var2, var5, var4);
						class281.method6364(var15.worldView, var1, var2, var5, var4);
					}
				}

				class281.method6364(class547.topLevelWorldView, var1, var2, var5, var4);
				if (Client.hintArrow.method8229() && Client.cycle % 20 < 10) {
					var9 = Client.hintArrow.method8230();
					FloorOverlayDefinition.method4795(class547.topLevelWorldView, var1, var2, var5, var4, var9);
				}

				int var10;
				if (Client.destinationX != 0) {
					var9 = Client.destinationX * 4 + 2 - Client.field484 / 32;
					var10 = Client.destinationY * 4 + 2 - Client.field377 / 32;
					class445.drawSpriteOnMinimap(var1, var2, var9, var10, var5, AsyncHttpResponse.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2376(-1) == class516.field5564 && AsyncHttpResponse.mapDotSprites.length >= 4) {
					var9 = var4.width / 2 + var1;
					var10 = var4.height / 2 + var2;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var11 = class146.method3870(var1, var2, var4);
						class139.method3815(var9, var10, var11, AsyncHttpResponse.mapDotSprites[2]);
					}

					if (Client.field557 > 0) {
						class139.method3815(var9, var10, Client.field565, AsyncHttpResponse.mapDotSprites[3]);
					}
				}

				if (!class159.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field539[var3] = true;
		}
	}
}
