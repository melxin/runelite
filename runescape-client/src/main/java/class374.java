import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class374 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-182312200"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5049) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5053) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5054) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5055) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5046 < ByteArrayPool.field5056) {
				ByteArrayPool.field5061[++ByteArrayPool.field5046 - 1] = var0;
			} else {
				if (class172.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < Login.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == Login.ByteArrayPool_alternativeSizes[var2] && AddRequestTask.ByteArrayPool_altSizeArrayCounts[var2] < class172.ByteArrayPool_arrays[var2].length) {
							class172.ByteArrayPool_arrays[var2][AddRequestTask.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1835733035"
	)
	static final void method7502() {
		int var0;
		int var1;
		int var2;
		if (!Client.field552) {
			var0 = Coord.method6905(ItemLayer.field2525);
			var1 = Coord.method6905(GraphicsDefaults.field5219);
			var2 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var0, var1, class200.topLevelWorldView.plane) - WorldMapSection1.field3329;
			InvDefinition.method3751(var0, var2, var1);
		} else if (Client.field779 != null) {
			class181.cameraX = Client.field779.vmethod9685();
			ApproximateRouteStrategy.cameraZ = Client.field779.vmethod9686();
			if (Client.field777) {
				GrandExchangeOfferUnitPriceComparator.cameraY = Client.field779.vmethod9689();
			} else {
				GrandExchangeOfferUnitPriceComparator.cameraY = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class181.cameraX, ApproximateRouteStrategy.cameraZ, class200.topLevelWorldView.plane) - Client.field779.vmethod9689();
			}

			Client.field779.method9698();
		}

		if (!Client.field776) {
			var0 = Coord.method6905(Decimator.field399);
			var1 = Coord.method6905(GameObject.field3039);
			var2 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var0, var1, class200.topLevelWorldView.plane) - FloorOverlayDefinition.field2345;
			int var3 = var0 - class181.cameraX;
			int var4 = var2 - GrandExchangeOfferUnitPriceComparator.cameraY;
			int var5 = var1 - ApproximateRouteStrategy.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			GraphicsObject.method6532(var7, var8);
		} else {
			if (Client.field791 != null) {
				class59.cameraPitch = Client.field791.method9682();
				class59.cameraPitch = Math.min(Math.max(class59.cameraPitch, 128), 383);
				Client.field791.method9698();
			}

			if (Client.field596 != null) {
				FloorDecoration.cameraYaw = Client.field596.method9682() & 2047;
				Client.field596.method9698();
			}
		}

	}
}
