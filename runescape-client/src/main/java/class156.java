import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class156 extends class166 {
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field1814;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 224245923
	)
	int field1812;
	@ObfuscatedName("at")
	byte field1809;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -846642853
	)
	int field1810;
	@ObfuscatedName("aj")
	String field1811;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	class156(class167 var1) {
		this.this$0 = var1;
		this.field1812 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	void vmethod4154(Buffer var1) {
		this.field1812 = var1.readUnsignedShort();
		this.field1809 = var1.readByte();
		this.field1810 = var1.readUnsignedShort();
		var1.readLong();
		this.field1811 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	void vmethod4151(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1812);
		var2.rank = this.field1809;
		var2.world = this.field1810;
		var2.username = new Username(this.field1811);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "44"
	)
	public static void method3950(AbstractArchive var0) {
		class142.field1721 = var0;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(ZLwn;B)V",
		garbageValue = "-48"
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
			var1.readShortLE();
			var3 = var1.readUnsignedShort();
			int var2 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			PlayerComposition.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					PlayerComposition.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class29.regions = new int[var4];
			AsyncRestClient.regionMapArchiveIds = new int[var4];
			WorldViewManager.regionLandArchiveIds = new int[var4];
			AbstractUserComparator.regionLandArchives = new byte[var4][];
			GrandExchangeOffer.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class29.regions[var4] = var7;
					AsyncRestClient.regionMapArchiveIds[var4] = ItemContainer.archive9.getGroupId("m" + var5 + "_" + var6);
					WorldViewManager.regionLandArchiveIds[var4] = ItemContainer.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class455.method9284(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByte() == 1;
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
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
			PlayerComposition.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					PlayerComposition.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class29.regions = new int[var5];
			AsyncRestClient.regionMapArchiveIds = new int[var5];
			WorldViewManager.regionLandArchiveIds = new int[var5];
			AbstractUserComparator.regionLandArchives = new byte[var5][];
			GrandExchangeOffer.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = class210.method4671(var9);
							int var11 = class138.method3798(var9);
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class29.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class29.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								AsyncRestClient.regionMapArchiveIds[var5] = ItemContainer.archive9.getGroupId("m" + var13 + "_" + var14);
								WorldViewManager.regionLandArchiveIds[var5] = ItemContainer.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class455.method9284(var3, var4, !var15);
		}

	}
}
