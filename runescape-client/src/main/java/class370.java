import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class370 {
	@ObfuscatedName("jo")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(ZLvu;I)V",
		garbageValue = "-284930364"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var3 = var1.readUnsignedShortAddLE();
			int var2 = var1.readUnsignedShortLE();
			var1.readSignedShort();
			var4 = var1.readUnsignedShort();
			class28.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class28.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class401.regions = new int[var4];
			ItemLayer.regionMapArchiveIds = new int[var4];
			UserComparator8.regionLandArchiveIds = new int[var4];
			KitDefinition.regionLandArchives = new byte[var4][];
			regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class401.regions[var4] = var7;
					ItemLayer.regionMapArchiveIds[var4] = class166.archive9.getGroupId("m" + var5 + "_" + var6);
					UserComparator8.regionLandArchiveIds[var4] = class166.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class396.method7567(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByteSub() == 1;
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShortLE();
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
			class28.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class28.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class401.regions = new int[var5];
			ItemLayer.regionMapArchiveIds = new int[var5];
			UserComparator8.regionLandArchiveIds = new int[var5];
			KitDefinition.regionLandArchives = new byte[var5][];
			regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class401.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class401.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								ItemLayer.regionMapArchiveIds[var5] = class166.archive9.getGroupId("m" + var13 + "_" + var14);
								UserComparator8.regionLandArchiveIds[var5] = class166.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class396.method7567(var4, var3, !var15);
		}

	}
}
