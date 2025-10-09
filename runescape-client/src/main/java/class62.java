import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class class62 {
	@ObfuscatedName("oj")
	static int[] field864;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "958718571"
	)
	public static byte[] method2162(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lwn;IB)V",
		garbageValue = "-118"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2) {
		int var3 = var1.readUnsignedByte();
		int var5;
		if (var3 < var0.field1170.method9887()) {
			for (int var4 = var3; var4 < var0.field1170.method9887(); ++var4) {
				var5 = var0.field1170.method9886(var4);
				class135.method3743(var5);
				WorldEntity var22 = (WorldEntity)var0.worldEntities.get((long)var5);
				if (var22 != null) {
					var22.remove();
				}
			}
		}

		if (var3 > var0.field1170.method9887()) {
			throw new RuntimeException("");
		} else {
			var0.field1170.method9888();
			WorldEntityCoord var16 = new WorldEntityCoord();

			int var6;
			int var8;
			int var23;
			for (var5 = 0; var5 < var3; ++var5) {
				var6 = var0.field1170.method9886(var5);
				WorldEntity var17 = (WorldEntity)var0.worldEntities.get((long)var6);
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					class135.method3743(var6);
					if (var17 != null) {
						var17.remove();
					}
				} else {
					var0.field1170.method9884(var6);
					if (var8 != 1) {
						var16.method6291(var17.method10186());
						byte var9 = var1.readByte();
						if (var9 != 0) {
							int var18 = NPC.method2823(var1, var9, 0);
							int var19 = NPC.method2823(var1, var9, 2);
							int var20 = NPC.method2823(var1, var9, 4);
							int var21 = NPC.method2823(var1, var9, 6);
							var16.method6294(var18, var19, var20, var21);
						}

						if (var8 == 2) {
							var17.method10254(var16);
						} else {
							var17.method10174(var16);
						}
					}

					var23 = var1.readUnsignedByte();
					if ((var23 & 1) != 0) {
						MidiPcmStream.method7285(var17, var1);
					}

					if ((var23 & 2) != 0) {
						var17.method10188(var1.readUnsignedByte());
					}
				}
			}

			while (var1.method11330(Client.packetWriter.serverPacketLength) > 0) {
				var5 = var1.readUnsignedShort();
				var0.field1170.method9884(var5);
				var6 = var1.readUnsignedByte();
				int var7 = var1.readUnsignedByte();
				var8 = var6 * 8;
				var23 = var7 * 8;
				WorldView var10 = Client.worldViewManager.createWorldView2(var5, var8, var23, class154.clientPreferences.getDrawDistance(), class216.field2512);
				WorldEntity var12 = new WorldEntity(var5, var10);
				var0.worldEntities.put(var12, (long)var5);
				var12.plane = var5;
				var12.field5487 = var0.id;
				var12.method10184(class178.method4207(var1.readShort()));
				SongTask.method9752(var1, var12.worldEntityCoord, 0, 0);
				var12.method10254(var12.worldEntityCoord);
				class391[] var14 = new class391[]{class391.field4828, class391.field4831, class391.TOKEN};
				var12.method10181((class391)ScriptFrame.findEnumerated(var14, var1.readUnsignedByte()));
				int var15 = var1.readUnsignedByte();
				if ((var15 & 1) != 0) {
					MidiPcmStream.method7285(var12, var1);
				}

				if ((var15 & 2) != 0) {
					var12.method10188(var1.readUnsignedByte());
				}
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	public static void method2163() {
		synchronized(ArchiveDiskActionHandler.field4931) {
			if (ArchiveDiskActionHandler.field4932 != 0) {
				ArchiveDiskActionHandler.field4932 = 1;

				try {
					ArchiveDiskActionHandler.field4931.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}
}
