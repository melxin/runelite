import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1893703015
	)
	static int field2800;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1337717187
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1389386173
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1982909743
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1528866355
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1315156917
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -65913531
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1529153599
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.orientation = var1;
		this.xMid = var2;
		this.yMid = var3;
		this.zMid = var4;
		this.xMidOffset = var5;
		this.yMidOffset = var6;
		this.zMidOffset = var7;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)Lvi;",
		garbageValue = "47121015"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return DynamicObject.worldMap;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lwf;B)V",
		garbageValue = "1"
	)
	static void method5360(WorldView var0, PacketBuffer var1) {
		WorldView var2 = HttpHeaders.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field423[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field423[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class87.field1235 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				class87.field1235[var6][var7] = var1.readShortSmart();
			}
		}

		Frames.field2811 = new int[var5];
		Messages.field1281 = new int[var5];
		SoundCache.field1377 = new int[var5];
		class166.field1890 = new byte[var5][];
		SequenceDefinition.field2494 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field423[var6][var7][var8];
					if (var9 != -1) {
						int var10 = GameObject.method5796(var9);
						int var11 = GameEngine.method689(var9);
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (Frames.field2811[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							Frames.field2811[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							Messages.field1281[var5] = LoginPacket.archive9.getGroupId("m" + var13 + "_" + var14);
							SoundCache.field1377[var5] = LoginPacket.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		UrlRequest.updateGameState(25);
		Client.field453 = true;
		VertexNormal.field2978 = var2;
		GrandExchangeOfferUnitPriceComparator.method8537(var2);
	}
}
