import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1903007061
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 732307795
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1276273555
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1069406477
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1034937463"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-120"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-1525487803"
	)
	public void method6070(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-11"
	)
	public void method6057(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1858390628"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-214277242"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2146523987"
	)
	public void method6059(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "91"
	)
	public static int method6095(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5694[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IZI)V",
		garbageValue = "250024176"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = (Player)var0.players.get((long)var1);
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.movementSequence == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = class275.calculateTag(0, 0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = GrandExchangeOfferTotalQuantityComparator.method8203(var0, var3.x, var3.y, var4, var3.method2196());
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = GrandExchangeOfferTotalQuantityComparator.method8203(var0, var3.x, var3.y, var4, var3.method2196());
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIB)V",
		garbageValue = "56"
	)
	static final void method6093(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1147.method9429(); ++var10) {
			Actor var23;
			if (var10 < var8) {
				var23 = (Actor)var0.players.get((long)var9[var10]);
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == class152.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = (Actor)var0.npcs.get((long)var0.field1147.method9430(var10 - var8));
			}

			WidgetDefinition.drawActor2d(var0, var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			WidgetDefinition.drawActor2d(var0, class152.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			WidgetDefinition.drawActor2d(var0, (Actor)var0.players.get((long)Client.combatTargetPlayerIndex), var6, var1, var2, var3, var4);
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
					var17 = Client.field565[Client.overheadTextColors[var10]];
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
				if (Client.overheadTextColors[var10] == 12 && Client.field490[var10] == null) {
					var18 = var16.length();
					Client.field490[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field490[var10][var19] = class527.field5374[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					Friend.fontBold12.method9178(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field490[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					Friend.fontBold12.method9104(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field490[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					Friend.fontBold12.method9150(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field490[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					Friend.fontBold12.method9106(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var10], Client.field490[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (Friend.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					Friend.fontBold12.method9126(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field490[var10]);
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

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - Friend.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					Friend.fontBold12.method9178(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field490[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				Friend.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
