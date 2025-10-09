import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ah")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1227984896
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1918449088
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -891259371
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1577320271
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -895828325
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -996334357
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 858463433
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 390737845
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("as")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ar")
	byte[][][] field3434;
	@ObfuscatedName("az")
	byte[][][] field3442;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[[[Llj;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ak")
	boolean field3444;
	@ObfuscatedName("ao")
	boolean field3445;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3444 = false;
		this.field3445 = false;
		new LinkedList();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "104"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2093050314"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3444 && this.field3445;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "-16"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3444 = true;
				this.field3445 = true;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3434 = null;
		this.field3442 = null;
		this.decorations = null;
		this.field3444 = false;
		this.field3445 = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILwj;I)V",
		garbageValue = "1116667400"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6830(var1, var2, var3, var4);
			} else {
				this.method6807(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILwj;IB)V",
		garbageValue = "-63"
	)
	void method6830(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILwj;II)V",
		garbageValue = "67093970"
	)
	void method6807(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3434[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3442[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-1203"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1536562895"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method6829(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIII)V",
		garbageValue = "2078618470"
	)
	static final void method6806(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1169.method9887(); ++var10) {
			Actor var23;
			if (var10 < var8) {
				var23 = (Actor)var0.players.get((long)var9[var10]);
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == class159.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = (Actor)var0.npcs.get((long)var0.field1169.method9886(var10 - var8));
			}

			ArchiveLoader.drawActor2d(var0, var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			ArchiveLoader.drawActor2d(var0, class159.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			ArchiveLoader.drawActor2d(var0, (Actor)var0.players.get((long)Client.combatTargetPlayerIndex), var6, var1, var2, var3, var4);
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
					var17 = Client.field546[Client.overheadTextColors[var10]];
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
				if (Client.overheadTextColors[var10] == 12 && Client.field501[var10] == null) {
					var18 = var16.length();
					Client.field501[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)((float)var19 / (float)var18 * 64.0F);
						int var21 = var20 << 10 | 896 | 64;
						Client.field501[var10][var19] = class535.field5655[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					class70.fontBold12.method9491(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field501[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					class70.fontBold12.method9488(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field501[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					class70.fontBold12.method9489(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, Client.field501[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					class70.fontBold12.method9493(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.cycle, 150 - Client.overheadTextCyclesRemaining[var10], Client.field501[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (class70.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					class70.fontBold12.method9480(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field501[var10]);
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

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - class70.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					class70.fontBold12.method9491(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field501[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				class70.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}
}
