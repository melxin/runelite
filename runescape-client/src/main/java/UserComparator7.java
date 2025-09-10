import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1006641339
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ay")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;I)I",
		garbageValue = "1752275061"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldr;[BIIIIIIIIII)V",
		garbageValue = "214421375"
	)
	static final void method3545(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];

			for (var13 = var3; var13 < var3 + 8; ++var13) {
				for (var14 = var4; var14 < var4 + 8; ++var14) {
					if (var12.method6174(var13, var14)) {
						var12.method6173(var13, var14, 1073741824);
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		int var15;
		int var16;
		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var16 = var3 + class264.method5949(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var4 + var18;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class144.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						class144.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

		var13 = var25.array * 1216585693 < var25.field5916.length ? var25.readUnsignedByte() : 0;
		boolean var26 = (var13 & 1) != 0;
		if (var26) {
			for (var15 = 0; var15 < 64; ++var15) {
				for (var16 = 0; var16 < 64; ++var16) {
					EnumComposition.method4307(var25);
				}
			}
		}

	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZLwf;B)V",
		garbageValue = "0"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var1.readShort();
			var2 = var1.readShortLE();
			var3 = var1.readUnsignedShort();
			int var4 = var1.readUnsignedShort();
			class267.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class267.xteaKeys[var5][var6] = var1.readShortSmart();
				}
			}

			class405.regions = new int[var4];
			SequenceDefinition.regionMapArchiveIds = new int[var4];
			class386.regionLandArchiveIds = new int[var4];
			UrlRequester.regionLandArchives = new byte[var4][];
			VarcInt.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class405.regions[var4] = var7;
					SequenceDefinition.regionMapArchiveIds[var4] = LoginPacket.archive9.getGroupId("m" + var5 + "_" + var6);
					class386.regionLandArchiveIds[var4] = LoginPacket.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class364.method7522(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readShortLE();
			boolean var15 = var1.readUnsignedShortAdd() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class267.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class267.xteaKeys[var6][var7] = var1.readShortSmart();
				}
			}

			class405.regions = new int[var5];
			SequenceDefinition.regionMapArchiveIds = new int[var5];
			class386.regionLandArchiveIds = new int[var5];
			UrlRequester.regionLandArchives = new byte[var5][];
			VarcInt.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = GameObject.method5796(var9);
							int var11 = GameEngine.method689(var9);
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class405.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class405.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								SequenceDefinition.regionMapArchiveIds[var5] = LoginPacket.archive9.getGroupId("m" + var13 + "_" + var14);
								class386.regionLandArchiveIds[var5] = LoginPacket.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class364.method7522(var2, var3, !var15);
		}

	}
}
