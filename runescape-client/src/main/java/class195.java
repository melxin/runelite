import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class195 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;I)V",
		garbageValue = "-2045898617"
	)
	public static void method3954(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1530864184"
	)
	static int method3956(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lvg;B)V",
		garbageValue = "4"
	)
	static void method3955(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
		int var5 = var4.sizeX / 8;
		int var6 = var4.sizeY / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field584[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field584[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		AuthenticationScheme.field1523 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				AuthenticationScheme.field1523[var8][var9] = var1.readInt();
			}
		}

		Canvas.field109 = new int[var7];
		WorldMapSection2.field3116 = new int[var7];
		FloorDecoration.field2539 = new int[var7];
		LoginState.field507 = new byte[var7][];
		class333.field3621 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field584[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (Canvas.field109[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							Canvas.field109[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							WorldMapSection2.field3116[var7] = class309.archive9.getGroupId("m" + var15 + "_" + var16);
							FloorDecoration.field2539[var7] = class309.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		class31.updateGameState(25);
		Client.field519 = true;
		HttpQueryParams.field5137 = var4;
		WorldMapID.method6241(var4);
	}
}
