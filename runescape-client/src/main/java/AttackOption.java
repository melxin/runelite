import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1377(2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	field1379(4);

	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -577996255
	)
	static int field1381;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 704986721
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "116940501"
	)
	static final boolean method2989(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIB)V",
		garbageValue = "3"
	)
	static final void method2985(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.npcCount; ++var10) {
			Object var23;
			if (var10 < var8) {
				var23 = var0.players[var9[var10]];
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == AsyncHttpResponse.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = var0.npcs[var0.npcIndices[var10 - var8]];
			}

			Skeleton.drawActor2d(var0, (Actor)var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			Skeleton.drawActor2d(var0, AsyncHttpResponse.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			Skeleton.drawActor2d(var0, var0.players[Client.combatTargetPlayerIndex], var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < Client.overheadTextCount; ++var10) {
			int var11 = Client.overheadTextXs[var10];
			int var12 = Client.overheadTextYs[var10];
			int var13 = Client.overheadTextXOffsets[var10];
			int var14 = Client.overheadTextAscents[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXOffsets[var22] + Client.overheadTextXs[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
						var12 = Client.overheadTextYs[var22] - Client.overheadTextAscents[var22];
						var15 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var10];
			Client.viewportTempY = Client.overheadTextYs[var10] = var12;
			String var16 = Client.overheadText[var10];
			if (Client.chatEffects == 0) {
				int var17 = 16776960;
				if (Client.overheadTextColors[var10] < 6) {
					var17 = Client.field723[Client.overheadTextColors[var10]];
				}

				if (Client.overheadTextColors[var10] == 6) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var10] == 7) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var10] == 8) {
					var17 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.overheadTextColors[var10] == 9) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var10] == 10) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var10] == 11) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.overheadTextColors[var10] == 12 && Client.field660[var10] == null) {
					var18 = var16.length();
					Client.field660[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)((float)var19 / (float)var18 * 64.0F);
						int var21 = var20 << 10 | 896 | 64;
						Client.field660[var10][var19] = class508.field5161[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					PacketWriter.fontBold12.method8547(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field660[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					PacketWriter.fontBold12.method8544(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field660[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					PacketWriter.fontBold12.method8594(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field660[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					PacketWriter.fontBold12.method8626(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var10], Client.field660[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (PacketWriter.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					PacketWriter.fontBold12.method8605(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field660[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (Client.overheadTextEffects[var10] == 5) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - PacketWriter.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					PacketWriter.fontBold12.method8547(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field660[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				PacketWriter.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
