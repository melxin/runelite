import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("bs")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4941993234787246017L
	)
	public long field1984;
	@ObfuscatedName("aw")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("at")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ae")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ao")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field1984 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;I)V",
		garbageValue = "-1556242361"
	)
	static void method3897(Font var0, Font var1) {
		if (HealthBarUpdate.worldSelectBackSprites == null) {
			HealthBarUpdate.worldSelectBackSprites = FriendsList.method8935(AttackOption.archive8, "sl_back", "");
		}

		if (class424.worldSelectFlagSprites == null) {
			class424.worldSelectFlagSprites = class438.getFont(AttackOption.archive8, "sl_flags", "");
		}

		if (HttpMethod.worldSelectArrows == null) {
			HttpMethod.worldSelectArrows = class438.getFont(AttackOption.archive8, "sl_arrows", "");
		}

		if (class182.worldSelectStars == null) {
			class182.worldSelectStars = class438.getFont(AttackOption.archive8, "sl_stars", "");
		}

		if (class1.worldSelectLeftSprite == null) {
			class1.worldSelectLeftSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(AttackOption.archive8, "leftarrow", "");
		}

		if (class508.worldSelectRightSprite == null) {
			class508.worldSelectRightSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(AttackOption.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class182.worldSelectStars != null) {
			class182.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class182.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (HttpMethod.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				HttpMethod.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				HttpMethod.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				HttpMethod.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				HttpMethod.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				HttpMethod.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				HttpMethod.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				HttpMethod.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				HttpMethod.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				HttpMethod.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				HttpMethod.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				HttpMethod.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				HttpMethod.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				HttpMethod.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				HttpMethod.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				HttpMethod.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				HttpMethod.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (HealthBarUpdate.worldSelectBackSprites != null) {
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
			} while(var6 != var5 || var7 != var4);

			var6 = (765 - var23 * var4) / (var4 + 1);
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
			if (class1.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class1.worldSelectLeftSprite.drawAt(8, class535.canvasHeight / 2 - class1.worldSelectLeftSprite.subHeight / 2);
			}

			if (class508.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class508.worldSelectRightSprite.drawAt(class329.canvasWidth - class508.worldSelectRightSprite.subWidth - 8, class535.canvasHeight / 2 - class508.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class142.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class113 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class113.field1425 : class113.field1428;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class113.field1433 : class113.field1424;
				} else if (var17.method1918()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class113.field1423 : class113.field1422;
				} else if (var17.method1878()) {
					var20 = var17.isMembersOnly() ? class113.field1427 : class113.field1426;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class113.field1421 : class113.field1420;
				} else if (var17.method1869()) {
					var20 = var17.isMembersOnly() ? class113.field1418 : class113.field1430;
				} else if (var17.method1892()) {
					var20 = var17.isMembersOnly() ? class113.field1390 : class113.field1429;
				}

				if (var20 == null || var20.field1434 >= HealthBarUpdate.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class113.field1419 : class113.field1436;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var23 + var12 && MouseHandler.MouseHandler_y < var24 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					HealthBarUpdate.worldSelectBackSprites[var20.field1434].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					HealthBarUpdate.worldSelectBackSprites[var20.field1434].drawAt(var12, var11);
				}

				if (class424.worldSelectFlagSprites != null) {
					class424.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
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
				var16 = var1.stringWidth(class142.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(class142.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "8"
	)
	static int method3898(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
