import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class290 implements WorldMapSection {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1477353883
	)
	int field3227;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 570372601
	)
	int field3220;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1381504471
	)
	int field3225;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 624233795
	)
	int field3223;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1513018543
	)
	int field3224;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -88669421
	)
	int field3221;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 748378341
	)
	int field3226;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1079506623
	)
	int field3222;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1185215949
	)
	int field3228;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1038290587
	)
	int field3229;

	class290() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)V",
		garbageValue = "-1851402279"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3224) {
			var1.regionLowX = this.field3224;
		}

		if (var1.regionHighX < this.field3224) {
			var1.regionHighX = this.field3224;
		}

		if (var1.regionLowY > this.field3221) {
			var1.regionLowY = this.field3221;
		}

		if (var1.regionHighY < this.field3221) {
			var1.regionHighY = this.field3221;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1948636213"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3227 && var1 < this.field3220 + this.field3227) {
			return var2 >= (this.field3225 << 6) + (this.field3226 << 3) && var2 <= (this.field3225 << 6) + (this.field3226 << 3) + 7 && var3 >= (this.field3223 << 6) + (this.field3222 << 3) && var3 <= (this.field3223 << 6) + (this.field3222 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1741175838"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3224 << 6) + (this.field3228 << 3) && var1 <= (this.field3224 << 6) + (this.field3228 << 3) + 7 && var2 >= (this.field3221 << 6) + (this.field3229 << 3) && var2 <= (this.field3221 << 6) + (this.field3229 << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "668393896"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3224 * 64 - this.field3225 * 64 + var2 + (this.field3228 * 8 - this.field3226 * 8), var3 + (this.field3221 * 64 - this.field3223 * 64) + (this.field3229 * 8 - this.field3222 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lnp;",
		garbageValue = "1118968187"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3225 * 64 - this.field3224 * 64 + (this.field3226 * 8 - this.field3228 * 8) + var1;
			int var4 = this.field3223 * 64 - this.field3221 * 64 + var2 + (this.field3222 * 8 - this.field3229 * 8);
			return new Coord(this.field3227, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "2137904343"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3227 = var1.readUnsignedByte();
		this.field3220 = var1.readUnsignedByte();
		this.field3225 = var1.readUnsignedShort();
		this.field3226 = var1.readUnsignedByte();
		this.field3223 = var1.readUnsignedShort();
		this.field3222 = var1.readUnsignedByte();
		this.field3224 = var1.readUnsignedShort();
		this.field3228 = var1.readUnsignedByte();
		this.field3221 = var1.readUnsignedShort();
		this.field3229 = var1.readUnsignedByte();
		this.method6497();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	void method6497() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrf;Lrf;I)V",
		garbageValue = "1701118053"
	)
	static void method6518(Font var0, Font var1) {
		if (Skeleton.worldSelectBackSprites == null) {
			Skeleton.worldSelectBackSprites = class171.method3893(GrandExchangeOfferAgeComparator.archive8, "sl_back", "");
		}

		if (MidiPcmStream.worldSelectFlagSprites == null) {
			MidiPcmStream.worldSelectFlagSprites = PlayerComposition.getFont(GrandExchangeOfferAgeComparator.archive8, "sl_flags", "");
		}

		if (Login.worldSelectArrows == null) {
			Login.worldSelectArrows = PlayerComposition.getFont(GrandExchangeOfferAgeComparator.archive8, "sl_arrows", "");
		}

		if (class320.worldSelectStars == null) {
			class320.worldSelectStars = PlayerComposition.getFont(GrandExchangeOfferAgeComparator.archive8, "sl_stars", "");
		}

		if (class205.worldSelectLeftSprite == null) {
			class205.worldSelectLeftSprite = class404.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "leftarrow", "");
		}

		if (FontName.worldSelectRightSprite == null) {
			FontName.worldSelectRightSprite = class404.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class320.worldSelectStars != null) {
			class320.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class320.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (Login.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (Skeleton.worldSelectBackSprites != null) {
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

			var6 = (765 - var4 * var23) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var24 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var4 * var23 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var24 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class205.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class205.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - class205.worldSelectLeftSprite.subHeight / 2);
			}

			if (FontName.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				FontName.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - FontName.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - FontName.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class547.World_worlds[var16];
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
					var20 = var17.isMembersOnly() ? class88.field1237 : class88.field1236;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class88.field1245 : class88.field1244;
				} else if (var17.method1446()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class88.field1235 : class88.field1230;
				} else if (var17.method1455()) {
					var20 = var17.isMembersOnly() ? class88.field1239 : class88.field1241;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class88.field1233 : class88.field1238;
				} else if (var17.method1474()) {
					var20 = var17.isMembersOnly() ? class88.field1234 : class88.field1247;
				} else if (var17.method1450()) {
					var20 = var17.isMembersOnly() ? class88.field1390 : class88.field1240;
				}

				if (var20 == null || var20.field1246 >= Skeleton.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class88.field1242 : class88.field1231;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var23 && MouseHandler.MouseHandler_y < var24 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					Skeleton.worldSelectBackSprites[var20.field1246].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					Skeleton.worldSelectBackSprites[var20.field1246].drawAt(var12, var11);
				}

				if (MidiPcmStream.worldSelectFlagSprites != null) {
					MidiPcmStream.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var24;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class547.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var22 + var25 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(class547.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}
}
