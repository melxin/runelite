import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class430 {
	@ObfuscatedName("ab")
	float[] field4793;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1505387827
	)
	int field4794;

	class430(float[] var1, int var2) {
		this.field4793 = var1;
		this.field4794 = var2;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ZLvg;I)V",
		garbageValue = "-1520405361"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var1.readShortLE();
			var2 = var1.readUnsignedShortLE();
			int var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			Client.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					Client.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			AsyncRestClient.regions = new int[var4];
			class27.regionMapArchiveIds = new int[var4];
			class187.regionLandArchiveIds = new int[var4];
			class164.regionLandArchives = new byte[var4][];
			MouseHandler.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					AsyncRestClient.regions[var4] = var7;
					class27.regionMapArchiveIds[var4] = class309.archive9.getGroupId("m" + var5 + "_" + var6);
					class187.regionLandArchiveIds[var4] = class309.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class139.method3371(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAdd();
			boolean var15 = var1.readUnsignedByteSub() == 1;
			var4 = var1.readUnsignedShortAdd();
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
			Client.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Client.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			AsyncRestClient.regions = new int[var5];
			class27.regionMapArchiveIds = new int[var5];
			class187.regionLandArchiveIds = new int[var5];
			class164.regionLandArchives = new byte[var5][];
			MouseHandler.regionMapArchives = new byte[var5][];
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
								if (AsyncRestClient.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								AsyncRestClient.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class27.regionMapArchiveIds[var5] = class309.archive9.getGroupId("m" + var13 + "_" + var14);
								class187.regionLandArchiveIds[var5] = class309.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class139.method3371(var2, var4, !var15);
		}

	}
}
