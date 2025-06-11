import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static StudioGame field5530;
	@ObfuscatedName("aa")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvz;",
		garbageValue = "487820194"
	)
	public static FontName[] method10485() {
		return new FontName[]{FontName_plain12, FontName_plain11, FontName_verdana13, FontName_verdana15, FontName_bold12, FontName_verdana11};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	protected static final void method10484() {
		GameEngine.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lwx;B)V",
		garbageValue = "7"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		int var4;
		if (var2 < var0.field1159.method9429()) {
			for (int var3 = var2; var3 < var0.field1159.method9429(); ++var3) {
				var4 = var0.field1159.method9430(var3);
				class197.method4230(var4);
				WorldEntity var22 = (WorldEntity)var0.worldEntities.get((long)var4);
				if (var22 != null) {
					var22.remove();
				}
			}
		}

		if (var2 > var0.field1159.method9429()) {
			throw new RuntimeException("");
		} else {
			var0.field1159.method9432();
			WorldEntityCoord var16 = new WorldEntityCoord();

			int var5;
			int var7;
			for (var4 = 0; var4 < var2; ++var4) {
				var5 = var0.field1159.method9430(var4);
				WorldEntity var17 = (WorldEntity)var0.worldEntities.get((long)var5);
				var7 = var1.readUnsignedByte();
				if (var7 == 0) {
					class197.method4230(var5);
					if (var17 != null) {
						var17.remove();
					}
				} else {
					var0.field1159.method9428(var5);
					if (var7 != 1) {
						var16.method6070(var17.method9746());
						byte var8 = var1.readByte();
						if (var8 != 0) {
							int var18 = class342.method7116(var1, var8, 0);
							int var19 = class342.method7116(var1, var8, 2);
							int var20 = class342.method7116(var1, var8, 4);
							int var21 = class342.method7116(var1, var8, 6);
							var16.method6059(var18, var19, var20, var21);
						}

						if (var7 == 2) {
							var17.method9717(var16);
						} else {
							var17.method9715(var16);
						}
					}
				}
			}

			while (var1.method10796(Client.packetWriter.serverPacketLength) > 0) {
				var4 = var1.readUnsignedShort();
				var0.field1159.method9428(var4);
				var5 = var1.readUnsignedByte();
				int var6 = var1.readUnsignedByte();
				var7 = var5 * 8;
				int var23 = var6 * 8;
				WorldView var9 = Client.worldViewManager.method2222(var4, var7, var23, ClientPacket.clientPreferences.getDrawDistance(), class233.field2523);
				WorldEntity var10 = new WorldEntity(var4, var9);
				var0.worldEntities.put(var10, (long)var4);
				var10.plane = var4;
				var10.field5206 = var0.id;
				int var13 = var1.readShort();
				class201 var14 = (class201)class201.field2132.get((long)var13);
				class201 var12;
				if (var14 != null) {
					var12 = var14;
				} else {
					byte[] var15 = SwapSongTask.field5075.takeFile(72, var13);
					var14 = new class201();
					if (var15 != null) {
						var14.method4272(new Buffer(var15));
					}

					var14.method4274();
					class201.field2132.put(var14, (long)var13);
					var12 = var14;
				}

				var10.method9708(var12);
				class230.method4832(var1, var10.worldEntityCoord, 0, 0);
				var10.method9717(var10.worldEntityCoord);
				var10.method9761((class389)class175.findEnumerated(SoundSystem.method2977(), var1.readUnsignedByte()));
			}

		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	static void method10486() {
		for (int var0 = 0; var0 < Client.field593.size(); ++var0) {
			if (class36.method700((Integer)Client.field593.get(var0)) != 2) {
				Client.field593.remove(var0);
				--var0;
			}
		}

	}
}
