import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class418 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static final class418 field4996;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4987;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4988;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4989;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5007;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4991;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4990;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4995;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4994;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4986;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5002;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4997;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4998;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4999;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5000;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5008;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5001;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5003;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5004;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5010;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5006;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field4992;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5005;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	public static final class418 field5009;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static final class418 field4993;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static final class418 field5011;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 468737477
	)
	public final int field5012;

	static {
		field4996 = new class418(255);
		field4987 = new class418(0);
		field4988 = new class418(1);
		field4989 = new class418(2);
		field5007 = new class418(3);
		field4991 = new class418(4);
		field4990 = new class418(5);
		field4995 = new class418(6);
		field4994 = new class418(7);
		field4986 = new class418(8);
		field5002 = new class418(9);
		field4997 = new class418(10);
		field4998 = new class418(11);
		field4999 = new class418(12);
		field5000 = new class418(13);
		field5008 = new class418(14);
		field5001 = new class418(15);
		field5003 = new class418(17);
		field5004 = new class418(18);
		field5010 = new class418(19);
		field5006 = new class418(20);
		field4992 = new class418(21);
		field5005 = new class418(22);
		field5009 = new class418(23);
		field4993 = new class418(24);
		field5011 = new class418(25);
	}

	class418(int var1) {
		this.field5012 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)V",
		garbageValue = "0"
	)
	static void method8578(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * 2077538819 > -1) {
			if (var1 > var0.field4241) {
				var0.field4241 = var1;
			}

			if (var1 < var0.field4236) {
				var0.field4236 = var1;
			}
		}

	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(ZLxj;I)V",
		garbageValue = "-1793120611"
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
			var2 = var1.readUnsignedShort();
			int var3 = var1.readUnsignedShortAddLE();
			var1.readUnsignedIntLE();
			var4 = var1.readUnsignedShort();
			SpriteBufferProperties.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					SpriteBufferProperties.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			Script.regions = new int[var4];
			FaceNormal.regionMapArchiveIds = new int[var4];
			class210.regionLandArchiveIds = new int[var4];
			class160.regionLandArchives = new byte[var4][];
			class148.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					Script.regions[var4] = var7;
					FaceNormal.regionMapArchiveIds[var4] = Tile.archive9.getGroupId("m" + var5 + "_" + var6);
					class210.regionLandArchiveIds[var4] = Tile.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class167.method4165(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShort();
			boolean var15 = var1.readUnsignedByteAdd() == 1;
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
			SpriteBufferProperties.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					SpriteBufferProperties.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			Script.regions = new int[var5];
			FaceNormal.regionMapArchiveIds = new int[var5];
			class210.regionLandArchiveIds = new int[var5];
			class160.regionLandArchives = new byte[var5][];
			class148.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = class498.method10142(var9);
							int var11 = Renderable.method5835(var9);
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (Script.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								Script.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								FaceNormal.regionMapArchiveIds[var5] = Tile.archive9.getGroupId("m" + var13 + "_" + var14);
								class210.regionLandArchiveIds[var5] = Tile.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class167.method4165(var4, var2, !var15);
		}

	}
}
