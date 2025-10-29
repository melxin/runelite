import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public final class class340 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5036542711667253977L
	)
	static long field3876;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lxj;IB)V",
		garbageValue = "119"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2) {
		int var3 = var1.readUnsignedByte();
		int var5;
		int var7;
		int var8;
		if (var3 < var0.field1148.method10038()) {
			for (int var4 = var3; var4 < var0.field1148.method10038(); ++var4) {
				var5 = var0.field1148.method10037(var4);
				WorldView var19 = Client.worldViewManager.getWorldView(var5);
				if (var19 != null) {
					for (var7 = 0; var7 < Client.playerUpdateManager.playerCount; ++var7) {
						var8 = Client.playerUpdateManager.playerIndices[var7];
						Client.playerUpdateManager.method2947((Player)var19.players.get((long)var8));
					}

					Client.worldViewManager.removeWorldViewById(var5);
				}

				WorldEntity var21 = (WorldEntity)var0.worldEntities.get((long)var5);
				if (var21 != null) {
					var21.remove();
				}
			}
		}

		if (var3 > var0.field1148.method10038()) {
			throw new RuntimeException("");
		} else {
			var0.field1148.method10039();
			WorldEntityCoord var14 = new WorldEntityCoord();

			int var6;
			for (var5 = 0; var5 < var3; ++var5) {
				var6 = var0.field1148.method10037(var5);
				WorldEntity var15 = (WorldEntity)var0.worldEntities.get((long)var6);
				var8 = var1.readUnsignedByte();
				int var16;
				int var17;
				if (var8 != 0) {
					var0.field1148.method10036(var6);
					if (var8 != 1) {
						var14.method6455(var15.method10562());
						byte var9 = var1.readByte();
						if (var9 != 0) {
							var16 = HttpRequestTask.method291(var1, var9, 0);
							var17 = HttpRequestTask.method291(var1, var9, 2);
							int var12 = HttpRequestTask.method291(var1, var9, 4);
							int var13 = HttpRequestTask.method291(var1, var9, 6);
							var14.method6459(var16, var17, var12, var13);
						}

						if (var8 == 2) {
							var15.method10550(var14);
						} else {
							var15.method10506(var14);
						}
					}

					Fonts.method11262(var15, var1);
				} else {
					WorldView var18 = Client.worldViewManager.getWorldView(var6);
					if (var18 != null) {
						for (var16 = 0; var16 < Client.playerUpdateManager.playerCount; ++var16) {
							var17 = Client.playerUpdateManager.playerIndices[var16];
							Client.playerUpdateManager.method2947((Player)var18.players.get((long)var17));
						}

						Client.worldViewManager.removeWorldViewById(var6);
					}

					if (var15 != null) {
						var15.remove();
					}
				}
			}

			while (var1.method11567(Client.packetWriter.serverPacketLength) > 0) {
				var5 = var1.readUnsignedShort();
				var0.field1148.method10036(var5);
				var6 = var1.readUnsignedByte();
				var7 = var1.readUnsignedByte();
				var8 = var6 * 8;
				int var20 = var7 * 8;
				WorldView var10 = class168.method4178(var5, var8, var20);
				WorldEntity var11 = new WorldEntity(var5, var10);
				var0.worldEntities.put(var11, (long)var5);
				var11.plane = var5;
				var11.field5535 = var0.id;
				var11.method10494(WorldMapRegion.method6822(var1.readShort()));
				LoginPacket.method3958(var1, var11.worldEntityCoord, 0, 0);
				var11.method10550(var11.worldEntityCoord);
				var11.method10497((class400)GrandExchangeOffer.findEnumerated(class85.method2928(), var1.readUnsignedByte()));
				Fonts.method11262(var11, var1);
			}

		}
	}
}
