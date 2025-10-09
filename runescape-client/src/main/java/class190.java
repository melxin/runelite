import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class190 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)V",
		garbageValue = "116"
	)
	static void method4362(Font var0, Font var1) {
		if (class85.worldSelectBackSprites == null) {
			class85.worldSelectBackSprites = AnimationSequence.method9685(BoundaryObject.archive8, "sl_back", "");
		}

		if (class456.worldSelectFlagSprites == null) {
			class456.worldSelectFlagSprites = ArchiveDiskAction.getFont(BoundaryObject.archive8, "sl_flags", "");
		}

		if (Huffman.worldSelectArrows == null) {
			Huffman.worldSelectArrows = ArchiveDiskAction.getFont(BoundaryObject.archive8, "sl_arrows", "");
		}

		if (UserList.worldSelectStars == null) {
			UserList.worldSelectStars = ArchiveDiskAction.getFont(BoundaryObject.archive8, "sl_stars", "");
		}

		if (class349.worldSelectLeftSprite == null) {
			class349.worldSelectLeftSprite = class334.SpriteBuffer_getIndexedSpriteByName(BoundaryObject.archive8, "leftarrow", "");
		}

		if (WorldMap.worldSelectRightSprite == null) {
			WorldMap.worldSelectRightSprite = class334.SpriteBuffer_getIndexedSpriteByName(BoundaryObject.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (UserList.worldSelectStars != null) {
			UserList.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			UserList.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (Huffman.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				Huffman.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				Huffman.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				Huffman.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				Huffman.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				Huffman.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				Huffman.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				Huffman.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				Huffman.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				Huffman.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Huffman.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				Huffman.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Huffman.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				Huffman.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Huffman.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				Huffman.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Huffman.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class85.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var5 != var6 || var4 != var7);

			var6 = (765 - var23 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class349.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class349.worldSelectLeftSprite.drawAt(8, class558.canvasHeight / 2 - class349.worldSelectLeftSprite.subHeight / 2);
			}

			if (WorldMap.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				WorldMap.worldSelectRightSprite.drawAt(class4.canvasWidth - WorldMap.worldSelectRightSprite.subWidth - 8, class558.canvasHeight / 2 - WorldMap.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class88 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class88.field1263 : class88.field1259;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class88.field1261 : class88.field1270;
				} else if (var17.method1508()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class88.field1256 : class88.field1260;
				} else if (var17.method1510()) {
					var20 = var17.isMembersOnly() ? class88.field1265 : class88.field1264;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class88.field1262 : class88.field1258;
				} else if (var17.method1513()) {
					var20 = var17.isMembersOnly() ? class88.field1267 : class88.field1266;
				} else if (var17.method1511()) {
					var20 = var17.isMembersOnly() ? class88.field1390 : class88.field1271;
				}

				if (var20 == null || var20.field1272 >= class85.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class88.field1257 : class88.field1268;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var11 + var24 && var18) {
					Login.hoveredWorldIndex = var16;
					class85.worldSelectBackSprites[var20.field1272].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class85.worldSelectBackSprites[var20.field1272].drawAt(var12, var11);
				}

				if (class456.worldSelectFlagSprites != null) {
					class456.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var24;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var6 + var23;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}
}
