import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class303 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class303 field3463;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class303 field3462;
	@ObfuscatedName("ar")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1922429309
	)
	@Export("value")
	final int value;

	static {
		field3463 = new class303(0);
		field3462 = new class303(1);
	}

	class303(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIB)V",
		garbageValue = "50"
	)
	static final void method6830(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1161.method9790(); ++var10) {
			Actor var23;
			if (var10 < var8) {
				var23 = (Actor)var0.players.get((long)var9[var10]);
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == HealthBarUpdate.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = (Actor)var0.npcs.get((long)var0.field1161.method9787(var10 - var8));
			}

			HttpRequest.drawActor2d(var0, var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			HttpRequest.drawActor2d(var0, HealthBarUpdate.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			HttpRequest.drawActor2d(var0, (Actor)var0.players.get((long)Client.combatTargetPlayerIndex), var6, var1, var2, var3, var4);
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
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXs[var22] + Client.overheadTextXOffsets[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
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
					var17 = Client.field425[Client.overheadTextColors[var10]];
				}

				if (Client.overheadTextColors[var10] == 6) {
					var17 = Client.cycle % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var10] == 7) {
					var17 = Client.cycle % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var10] == 8) {
					var17 = Client.cycle % 20 < 10 ? '뀀' : 8454016;
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
				if (Client.overheadTextColors[var10] == 12 && Client.field586[var10] == null) {
					var18 = var16.length();
					Client.field586[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field586[var10][var19] = class537.field5583[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					class333.fontBold12.method9430(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field586[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					class333.fontBold12.method9427(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field586[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					class333.fontBold12.method9428(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field586[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					class333.fontBold12.method9463(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, 150 - Client.overheadTextCyclesRemaining[var10], Client.field586[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (class333.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					class333.fontBold12.method9431(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field586[var10]);
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

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - class333.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					class333.fontBold12.method9430(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field586[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				class333.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
