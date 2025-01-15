import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class151 extends class150 {
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static WorldView field1683;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1733568859
	)
	int field1682;
	@ObfuscatedName("ah")
	boolean field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class151(class153 var1) {
		this.this$0 = var1;
		this.field1682 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1682 = var1.readUnsignedShort();
		this.field1679 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3687(this.field1682, this.field1679);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lod;",
		garbageValue = "1838023813"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4505, PlayerType.field4515, PlayerType.field4511, PlayerType.PlayerType_normal, PlayerType.field4513, PlayerType.field4507, PlayerType.field4506, PlayerType.field4512, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4508, PlayerType.PlayerType_ultimateIronman, PlayerType.field4514, PlayerType.PlayerType_ironman, PlayerType.PlayerType_playerModerator, PlayerType.field4509, PlayerType.PlayerType_jagexModerator, PlayerType.field4510};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "798078430"
	)
	public static void method3608(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIB)V",
		garbageValue = "10"
	)
	static final void method3599(WorldView var0, int var1, int var2, int var3, int var4) {
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

				if (var23 == ModeWhere.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = var0.npcs[var0.npcIndices[var10 - var8]];
			}

			WorldMapDecorationType.drawActor2d(var0, (Actor)var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			WorldMapDecorationType.drawActor2d(var0, ModeWhere.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			WorldMapDecorationType.drawActor2d(var0, var0.players[Client.combatTargetPlayerIndex], var6, var1, var2, var3, var4);
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
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXs[var22] + Client.overheadTextXOffsets[var22] && var11 + var13 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
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
					var17 = Client.field712[Client.overheadTextColors[var10]];
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
				if (Client.overheadTextColors[var10] == 12 && Client.field651[var10] == null) {
					var18 = var16.length();
					Client.field651[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field651[var10][var19] = class508.field5161[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					GraphicsObject.fontBold12.method8776(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field651[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					GraphicsObject.fontBold12.method8692(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field651[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					GraphicsObject.fontBold12.method8762(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field651[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					GraphicsObject.fontBold12.method8688(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var10], Client.field651[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (GraphicsObject.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					GraphicsObject.fontBold12.method8694(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field651[var10]);
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

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - GraphicsObject.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					GraphicsObject.fontBold12.method8776(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field651[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				GraphicsObject.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
