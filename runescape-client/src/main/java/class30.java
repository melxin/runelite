import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class30 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1379003321"
	)
	public static void method486(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class337.field3791.clear();
			class337.field3795.clear();
			class33.method525(var5);
			if (!var5) {
				class337.field3790.clear();
			}

			Iterator var6 = var0.iterator();

			while (var6.hasNext()) {
				MidiRequest var7 = (MidiRequest)var6.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class337.field3790.add(var7);
					}

					class337.field3791.add(var7);
				}
			}

			if (!class337.field3791.isEmpty()) {
				class166.method4014(var1, var2, var3, var4);
				class337.field3795.add(new AddRequestTask((SongTask)null));
				class337.field3795.add(new class475((SongTask)null, class337.field3793, class149.field1749, HttpResponse.field93));
				ArrayList var9 = new ArrayList();
				var9.add(new class470(new FadeInTask((SongTask)null, 0, true, class337.field3789)));
				if (!class337.midiRequests.isEmpty()) {
					ArrayList var10 = new ArrayList();
					var10.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var9), class337.field3798));
					ArrayList var8 = AbstractWorldMapIcon.method6879();
					var10.add(new DelayFadeTask(new FadeOutTask(new class468((SongTask)null, var8), 0, false, class337.field3797), class337.musicPlayerStatus));
					class337.field3795.add(new ConcurrentMidiTask((SongTask)null, var10));
				} else {
					class337.field3795.add(new DelayFadeTask((SongTask)null, class337.field3798));
					class337.field3795.add(new ConcurrentMidiTask((SongTask)null, var9));
				}

			}
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "-581611256"
	)
	static void method482(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		class27.method418(class81.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lwk;B)V",
		garbageValue = "31"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		int var4;
		if (var2 < var0.field1143.method9810()) {
			for (int var3 = var2; var3 < var0.field1143.method9810(); ++var3) {
				var4 = var0.field1143.method9817(var3);
				class154.method3822(var4);
				WorldEntity var14 = (WorldEntity)var0.worldEntities.get((long)var4);
				if (var14 != null) {
					var14.vmethod10593();
				}
			}
		}

		if (var2 > var0.field1143.method9810()) {
			throw new RuntimeException("");
		} else {
			var0.field1143.method9809();
			WorldEntityCoord var12 = new WorldEntityCoord();

			int var5;
			int var7;
			for (var4 = 0; var4 < var2; ++var4) {
				var5 = var0.field1143.method9817(var4);
				WorldEntity var13 = (WorldEntity)var0.worldEntities.get((long)var5);
				var7 = var1.readUnsignedByte();
				if (var7 == 0) {
					class154.method3822(var5);
					if (var13 != null) {
						var13.vmethod10593();
					}
				} else {
					var0.field1143.method9808(var5);
					if (var7 != 1) {
						var12.method6255(var13.method10099());
						MilliClock.method5926(var1, var12);
						if (var7 == 2) {
							var13.method10137(var12);
						} else {
							var13.method10107(var12);
						}
					}
				}
			}

			while (var1.method11179(Client.packetWriter.serverPacketLength) > 0) {
				var4 = var1.readUnsignedShort();
				var0.field1143.method9808(var4);
				var5 = var1.readUnsignedByte();
				int var6 = var1.readUnsignedByte();
				var7 = var5 * 8;
				int var8 = var6 * 8;
				WorldView var9 = Client.worldViewManager.method2310(var4, var7, var8, FriendSystem.clientPreferences.getDrawDistance(), class215.field2461);
				WorldEntity var10 = new WorldEntity(var4, var9);
				var0.worldEntities.put(var10, (long)var4);
				var10.plane = var4;
				var10.field5324 = var0.id;
				var10.method10100(WorldMapData_0.method6360(var1.readShort()));
				WorldEntityCoord var11 = var10.worldEntityCoord;
				var11.method6256(Coord.method7393(0), Coord.method7393(0));
				var11.setZ(0);
				var11.setCurrentRotationAngle(0);
				MilliClock.method5926(var1, var11);
				var10.method10137(var10.worldEntityCoord);
				var10.method10102((class391)HealthBarConfig.findEnumerated(class381.method8165(), var1.readUnsignedByte()));
			}

		}
	}
}
