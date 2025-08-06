import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class159 extends class149 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -813133927
	)
	static int field1801;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1594687595
	)
	int field1806;
	@ObfuscatedName("ab")
	String field1800;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class159(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1806 = var1.readInt();
		this.field1800 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3909(this.field1806, this.field1800);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "2051008532"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class4.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lca;II)V",
		garbageValue = "-840610306"
	)
	static void method3888(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2400(var0);
		int var4 = Coord.method7395(var1.x, var1.size * -549711872 - 1);
		int var5 = Coord.method7395(var1.y, var1.size * -549711872 - 1);
		RestClientThreadFactory.method211(var0, var3.x, var3.y, var4, var5, var2, var1.vmethod2682());
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lwk;I)V",
		garbageValue = "-31933326"
	)
	static void method3878(WorldView var0, PacketBuffer var1) {
		WorldView var2 = class81.worldView;
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
						Client.field451[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field451[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class400.field4760 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				class400.field4760[var6][var7] = var1.readInt();
			}
		}

		FloatProjection.field2737 = new int[var5];
		SoundSystem.field1344 = new int[var5];
		class69.field962 = new int[var5];
		ClanChannel.field1891 = new byte[var5][];
		Canvas.field100 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field451[var6][var7][var8];
					if (var9 != -1) {
						int var10 = MusicPatchNode2.method7087(var9);
						int var11 = class149.method3791(var9);
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (FloatProjection.field2737[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							FloatProjection.field2737[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							SoundSystem.field1344[var5] = class201.archive9.getGroupId("m" + var13 + "_" + var14);
							class69.field962[var5] = class201.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		AuthenticationScheme.updateGameState(25);
		Client.field418 = true;
		FriendSystem.field628 = var2;
		class348.method7363(var2);
	}
}
