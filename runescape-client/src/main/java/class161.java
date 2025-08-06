import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class161 extends class165 {
	@ObfuscatedName("fi")
	static boolean field1846;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("al")
	String field1839;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -981336431
	)
	int field1838;
	@ObfuscatedName("ac")
	byte field1837;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	class161(class166 var1) {
		this.this$0 = var1;
		this.field1839 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	void vmethod4076(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1839 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1838 = var1.readUnsignedShort();
		this.field1837 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	void vmethod4077(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1839);
		var2.world = this.field1838;
		var2.rank = this.field1837;
		var1.addMember(var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-125"
	)
	public static void method3963(ArrayList var0, int var1, int var2, int var3, int var4) {
		class337.field3790.clear();
		class337.field3790.addAll(var0);
		class166.method4014(var1, var2, var3, var4);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "-564254494"
	)
	static IndexCheck method3960() {
		return Client.indexCheck;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(ZLwk;I)V",
		garbageValue = "1990751842"
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
			int var3 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			class86.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class86.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			ItemContainer.regions = new int[var4];
			class108.regionMapArchiveIds = new int[var4];
			SequenceDefinition.regionLandArchiveIds = new int[var4];
			class458.regionLandArchives = new byte[var4][];
			UserComparator6.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					ItemContainer.regions[var4] = var7;
					class108.regionMapArchiveIds[var4] = class201.archive9.getGroupId("m" + var5 + "_" + var6);
					SequenceDefinition.regionLandArchiveIds[var4] = class201.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			Client.method1484(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAdd();
			boolean var15 = var1.readUnsignedByte() == 1;
			var4 = var1.readUnsignedShortAddLE();
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
			class86.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class86.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			ItemContainer.regions = new int[var5];
			class108.regionMapArchiveIds = new int[var5];
			SequenceDefinition.regionLandArchiveIds = new int[var5];
			class458.regionLandArchives = new byte[var5][];
			UserComparator6.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = MusicPatchNode2.method7087(var9);
							int var11 = class149.method3791(var9);
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (ItemContainer.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								ItemContainer.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class108.regionMapArchiveIds[var5] = class201.archive9.getGroupId("m" + var13 + "_" + var14);
								SequenceDefinition.regionLandArchiveIds[var5] = class201.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			Client.method1484(var4, var2, !var15);
		}

	}
}
