import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
@Implements("WorldEntity")
public class WorldEntity extends Node implements Entity {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -831606533
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	public class203 field5425;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ltn;"
	)
	class506[] field5420;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 277227723
	)
	int field5427;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -899272099
	)
	public int field5431;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	class394 field5428;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 621681109
	)
	int field5430;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	class507 field5426;
	@ObfuscatedName("ad")
	boolean field5432;

	@ObfuscatedSignature(
		descriptor = "(ILdr;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5420 = new class506[10];
		this.field5427 = 0;
		this.field5431 = -1;
		this.field5428 = class394.field4796;
		this.field5430 = 31;
		this.field5426 = new class508();
		this.field5432 = false;
		this.plane = var1;
		this.worldView = var2;
		this.field5427 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5420[var3] = new class506();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getX")
	public int getX() {
		if (this.field5431 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5431);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class333.topLevelWorldView.plane;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1636388490"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		this.worldView.scene.Scene_plane = this.worldView.plane;
		if (var1) {
			this.worldView.scene.field2716 = false;
			this.worldView.scene.field2713 = -1200;
			this.worldView.scene.field2687 = 0.01F;
			this.worldView.scene.modelColorOverride.method5649((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.worldView.scene.field2716 = true;
			this.worldView.scene.field2713 = 0;
			this.worldView.scene.field2687 = 1.0F;
			this.worldView.scene.modelColorOverride.method5650();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "35"
	)
	public boolean method10065() {
		return this.worldView.scene.field2687 == 0.01F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "28"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "999447568"
	)
	public int method10110() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "1923130139"
	)
	public WorldEntityCoord method10090() {
		return this.field5427 == 0 ? this.worldEntityCoord : this.field5420[0].field5434;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhu;S)V",
		garbageValue = "28151"
	)
	public void method10071(class203 var1) {
		this.field5425 = var1;
		this.worldView.scene.field2726 = var1.method4453();
		this.worldView.scene.field2714 = var1.method4454();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lpd;",
		garbageValue = "-39"
	)
	public class394 method10072() {
		return this.field5428;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lpj;",
		garbageValue = "1"
	)
	public class398 method10073(boolean var1) {
		return var1 ? class398.field4839 : this.field5425.method4456();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "989832075"
	)
	public void method10074(class394 var1) {
		this.field5428 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1086541105"
	)
	public void method10075(int var1) {
		this.field5430 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public boolean method10076(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field5430 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-184904310"
	)
	public int method10077() {
		return this.worldView.sizeX * 64 + this.field5425.method4453();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method10093() {
		return this.worldView.sizeY * 64 + this.field5425.method4454();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-290410379"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5420.length; ++var3) {
			this.field5420[var3].field5434.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5426.vmethod10151(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-386251148"
	)
	public final void method10078(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5420[0].field5434.getX();
			int var5 = var1.getY() - this.field5420[0].field5434.getY();
			this.method10082(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method10129(var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "1398169975"
	)
	public void method10129(WorldEntityCoord var1) {
		this.worldEntityCoord.method6282(var1);
		this.field5420[0].field5434.method6282(var1);
		this.field5427 = 0;
		this.field5432 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lky;III)V",
		garbageValue = "1416875586"
	)
	void method10082(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5427 < 9) {
			++this.field5427;
		}

		for (int var4 = this.field5427; var4 > 0; --var4) {
			class506 var5 = this.field5420[var4];
			this.field5420[var4] = this.field5420[var4 - 1];
			this.field5420[var4 - 1] = var5;
		}

		this.field5420[0].field5434.method6282(var1);
		this.field5420[0].field5433 = Client.cycle;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1673189895"
	)
	public final void method10083(int var1) {
		if (this.field5427 == 0) {
			this.method10129(this.field5420[0].field5434);
		} else {
			if (!this.field5432) {
				this.field5426.vmethod10152(this.worldEntityCoord, this.field5420[0], var1);
				this.field5432 = true;
			}

			if (this.field5426.vmethod10149(this.worldEntityCoord, var1, this.field5427)) {
				--this.field5427;
				this.field5432 = false;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Lre;",
		garbageValue = "-2054643686"
	)
	public class452 method10084(int var1, int var2) {
		class448 var3 = new class448();
		TransformationMatrix var4 = class401.method8245();
		var3.field5155.method9072(class51.method1894(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5154.method8993((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method10077();
		var2 -= this.method10093();
		var4.method9097(var3);
		var3.method8931();
		class452 var5 = var4.method9144((float)var1, 0.0F, (float)var2);
		var4.method9140();
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Lre;",
		garbageValue = "1157717593"
	)
	public class452 method10107(int var1, int var2) {
		class448 var3 = new class448();
		TransformationMatrix var4 = class401.method8245();
		var3.field5155.method9072(class51.method1894(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5154.method8993((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method9097(var3);
		var4.method9101();
		var3.method8931();
		class452 var5 = var4.method9144((float)var1, 0.0F, (float)var2);
		var5.method9006((float)this.method10077(), 0.0F, (float)this.method10093());
		var4.method9140();
		return var5;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5422"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "955086849"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILwu;I)Z",
		garbageValue = "-1651594463"
	)
	public static boolean method10134(int var0, class582 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-475844930"
	)
	public static int method10135(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;Lrv;I)V",
		garbageValue = "210043481"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class294.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var8;
		int var10;
		int var25;
		int var31;
		int var38;
		if (Login.worldSelectOpen) {
			if (WorldMapData_1.worldSelectBackSprites == null) {
				WorldMapData_1.worldSelectBackSprites = ClanMate.method9930(Friend.archive8, "sl_back", "");
			}

			if (GrandExchangeOfferOwnWorldComparator.worldSelectFlagSprites == null) {
				GrandExchangeOfferOwnWorldComparator.worldSelectFlagSprites = class168.getFont(Friend.archive8, "sl_flags", "");
			}

			if (UserComparator4.worldSelectArrows == null) {
				UserComparator4.worldSelectArrows = class168.getFont(Friend.archive8, "sl_arrows", "");
			}

			if (class395.worldSelectStars == null) {
				class395.worldSelectStars = class168.getFont(Friend.archive8, "sl_stars", "");
			}

			if (WorldMapData_1.worldSelectLeftSprite == null) {
				WorldMapData_1.worldSelectLeftSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(Friend.archive8, "leftarrow", "");
			}

			if (class411.worldSelectRightSprite == null) {
				class411.worldSelectRightSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(Friend.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class395.worldSelectStars != null) {
				class395.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class395.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var41;
			if (UserComparator4.worldSelectArrows != null) {
				var31 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					UserComparator4.worldSelectArrows[2].drawAt(var31, 4);
				} else {
					UserComparator4.worldSelectArrows[0].drawAt(var31, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					UserComparator4.worldSelectArrows[3].drawAt(var31 + 15, 4);
				} else {
					UserComparator4.worldSelectArrows[1].drawAt(var31 + 15, 4);
				}

				var0.draw("World", var31 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					UserComparator4.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					UserComparator4.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					UserComparator4.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					UserComparator4.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var38 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					UserComparator4.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					UserComparator4.worldSelectArrows[0].drawAt(var38, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					UserComparator4.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					UserComparator4.worldSelectArrows[1].drawAt(var38 + 15, 4);
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1);
				var41 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					UserComparator4.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					UserComparator4.worldSelectArrows[0].drawAt(var41, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					UserComparator4.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					UserComparator4.worldSelectArrows[1].drawAt(var41 + 15, 4);
				}

				var0.draw("Type", var41 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (WorldMapData_1.worldSelectBackSprites != null) {
				var3 = 88;
				byte var36 = 19;
				var38 = 765 / (var3 + 1) - 1;
				var41 = 480 / (var36 + 1);

				do {
					var25 = var41;
					var8 = var38;
					if (var41 * (var38 - 1) >= World.World_count) {
						--var38;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}
				} while(var41 != var25 || var8 != var38);

				var25 = (765 - var38 * var3) / (var38 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var8 = (480 - var36 * var41) / (var41 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var28 = (765 - var38 * var3 - var25 * (var38 - 1)) / 2;
				var10 = (480 - var41 * var36 - var8 * (var41 - 1)) / 2;
				int var35 = (var41 + World.World_count - 1) / var41;
				Login.worldSelectPagesCount = var35 - var38;
				if (WorldMapData_1.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					WorldMapData_1.worldSelectLeftSprite.drawAt(8, class396.canvasHeight / 2 - WorldMapData_1.worldSelectLeftSprite.subHeight / 2);
				}

				if (class411.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class411.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class411.worldSelectRightSprite.subWidth - 8, class396.canvasHeight / 2 - class411.worldSelectRightSprite.subHeight / 2);
				}

				int var12 = var10 + 23;
				int var13 = var28 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var41 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) {
					World var18 = World.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class89 var21 = null;
					int var22 = 0;
					if (var18.isBeta()) {
						var21 = var18.isMembersOnly() ? class89.field1264 : class89.field1263;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class89.field1272 : class89.field1261;
					} else if (var18.method1474()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class89.field1265 : class89.field1262;
					} else if (var18.method1476()) {
						var21 = var18.isMembersOnly() ? class89.field1257 : class89.field1266;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class89.field1260 : class89.field1259;
					} else if (var18.method1497()) {
						var21 = var18.isMembersOnly() ? class89.field1268 : class89.field1267;
					} else if (var18.method1478()) {
						var21 = var18.isMembersOnly() ? class89.field1390 : class89.field1269;
					}

					if (var21 == null || var21.field1273 >= WorldMapData_1.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class89.field1258 : class89.field1271;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var36 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						WorldMapData_1.worldSelectBackSprites[var21.field1273].drawTransOverlayAt(var13, var12, 128, 16777215);
						var15 = true;
					} else {
						WorldMapData_1.worldSelectBackSprites[var21.field1273].drawAt(var13, var12);
					}

					if (GrandExchangeOfferOwnWorldComparator.worldSelectFlagSprites != null) {
						GrandExchangeOfferOwnWorldComparator.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var8 + var36;
					++var14;
					if (var14 >= var41) {
						var12 = var10 + 23;
						var13 = var13 + var25 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var29 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var29 + var37 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var29;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			Projectile.leftTitleSprite.drawAt(Login.xPadding, 0);
			class406.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class139.logoSprite.drawAt(Login.xPadding + 382 - class139.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var30;
			short var32;
			if (Client.gameState == 20) {
				ConcurrentMidiTask.titleboxSprite.drawAt(Login.loginBoxX + 180 - ConcurrentMidiTask.titleboxSprite.subWidth / 2, 271 - ConcurrentMidiTask.titleboxSprite.subHeight / 2);
				var30 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
				var31 = var30 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var31 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10 && Login.loginIndex != 1) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = class36.clientPreferences.isUsernameHidden() ? SecureRandomFuture.method1987(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = SecureRandomFuture.method1987(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var31, 16777215, 0);
					var31 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				ConcurrentMidiTask.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var30 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var30 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var30 = 201;
					var0.drawCentered(Login.Login_response1, class294.loginBoxCenter, var30, 16776960, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, class294.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, class294.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var31 += 7;
					var0.draw("Login: ", class294.loginBoxCenter - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = class36.clientPreferences.isUsernameHidden() ? SecureRandomFuture.method1987(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class134.colorStartTag(16776960) + "|" : ""), class294.loginBoxCenter - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = SecureRandomFuture.method1987(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class134.colorStartTag(16776960) + "|" : ""), class294.loginBoxCenter - 108, var31, 16777215, 0);
					var31 += 15;
					var30 = 277;
					var8 = class294.loginBoxCenter + -117;
					IndexedSprite var9 = class188.method4283(Client.Login_isUsernameRemembered, Login.field727);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var30 + 13, 16776960, 0);
					var8 = class294.loginBoxCenter + 24;
					var9 = class188.method4283(class36.clientPreferences.isUsernameHidden(), Login.field749);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Hide username", var8, var30 + 13, 16776960, 0);
					var31 = var30 + 15;
					var10 = class294.loginBoxCenter - 80;
					short var11 = 321;
					class199.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
					var10 = class294.loginBoxCenter + 80;
					class199.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
					var30 = 357;
					switch(Login.field735) {
					case 2:
						class285.field3296 = "Having trouble logging in?";
						break;
					default:
						class285.field3296 = "Can't login? Click here.";
					}

					AbstractSocket.field5447 = new Bounds(class294.loginBoxCenter, var30, var1.stringWidth(class285.field3296), 11);
					class537.field5585 = new Bounds(class294.loginBoxCenter, var30, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class285.field3296, class294.loginBoxCenter, var30, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var30 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var34;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.draw("PIN: " + SecureRandomFuture.method1987(class464.otp) + (Client.cycle % 40 < 20 ? class134.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var31, 16777215, 0);
						var31 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var31 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var38 = var31 - var0.ascent;
						IndexedSprite var33;
						if (Login.rememberUsername) {
							var33 = class199.options_buttons_2Sprite;
						} else {
							var33 = WorldMapArea.options_buttons_0Sprite;
						}

						var33.drawAt(var4, var38);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Continue", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Cancel", var25, var34 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var34 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var31 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var31, 16777215, 0);
						var32 = 174;
						var5 = class36.clientPreferences.isUsernameHidden() ? SecureRandomFuture.method1987(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class134.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var31, 16777215, 0);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
						var34 = 356;
						var1.drawCentered("Still having trouble logging in?", class294.loginBoxCenter, var34, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class563.field5781 && !Client.onMobile) {
							var30 = 201;
							var0.drawCentered(Login.Login_response1, class294.loginBoxCenter, var30, 16776960, 0);
							var31 = var30 + 15;
							var0.drawCentered(Login.Login_response2, class294.loginBoxCenter, var31, 16776960, 0);
							var31 += 15;
							var0.drawCentered(Login.Login_response3, class294.loginBoxCenter, var31, 16776960, 0);
							var4 = class294.loginBoxCenter - 150;
							var31 += 10;

							for (var38 = 0; var38 < 8; ++var38) {
								class199.titlebuttonSprite.method11678(var4, var31, 30, 40);
								boolean var26 = var38 == Login.field738 & Client.cycle % 40 < 20;
								var0.draw((Login.field739[var38] == null ? "" : Login.field739[var38]) + (var26 ? class134.colorStartTag(16776960) + "|" : ""), var4 + 10, var31 + 27, 16777215, 0);
								if (var38 != 1 && var38 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var31 + 27, 16777215, 0);
								}
							}

							var38 = class294.loginBoxCenter - 80;
							short var39 = 321;
							class199.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Submit", var38, var39 + 5, 16777215, 0);
							var38 = class294.loginBoxCenter + 80;
							class199.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Cancel", var38, var39 + 5, 16777215, 0);
						} else {
							var30 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
							var31 = var30 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var30 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var31 = Login.loginBoxX + 180;
						var32 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = var32 + 20;
						World.field625.drawAt(var31 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class205.field2257.drawAt(var31 - 48, var4 + 18);
						} else {
							class205.field2257.drawAt(var31 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var31, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var31 = class294.loginBoxCenter;
						var32 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var31, var32, 16777215, 0);
						var4 = var32 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var31, var4, 16777215, 0);
						var31 = class294.loginBoxCenter - 80;
						var32 = 311;
						class199.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Accept", var31, var32 + 5, 16777215, 0);
						var31 = class294.loginBoxCenter + 80;
						class199.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Decline", var31, var32 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var30 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var31, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var30 = 311;
						class199.titlebuttonSprite.drawAt(var4 - 73, var30 - 20);
						var0.drawCentered("Back", var4, var30 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var30 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var24 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var24 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var24 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4609;
							break;
						default:
							class265.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var31, 16776960, 0);
						var25 = Login.loginBoxX + 180;
						var34 = 276;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var25, var34 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var25, var34 + 5, 16777215, 0);
						}

						var25 = Login.loginBoxX + 180;
						var34 = 326;
						class199.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var30 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var6 = World.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class199.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class396.canvasHeight);
				class155.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class155.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			Message.title_muteSprite[class36.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == ViewportMouse.clientLanguage) {
				if (CollisionMap.field3231 != null) {
					var31 = Login.xPadding + 5;
					var32 = 463;
					byte var42 = 100;
					byte var40 = 35;
					CollisionMap.field3231.drawAt(var31, var32);
					var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var31, var40 / 2 + var32 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					}
				} else {
					CollisionMap.field3231 = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(Friend.archive8, "sl_button", "");
				}
			}

		}
	}
}
