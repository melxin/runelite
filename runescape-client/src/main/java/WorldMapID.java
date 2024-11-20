import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final WorldMapID field3248;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final WorldMapID field3245;
	@ObfuscatedName("dc")
	static boolean field3249;
	@ObfuscatedName("gj")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -337474255
	)
	@Export("value")
	final int value;

	static {
		field3248 = new WorldMapID(0);
		field3245 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IZI)Lfz;",
		garbageValue = "1794738705"
	)
	public static class145 method6239(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (FriendsList.field4979 == null) {
					class580.field5637 = Runtime.getRuntime().availableProcessors();
					FriendsList.field4979 = new ThreadPoolExecutor(0, class580.field5637, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class580.field5637 * 100 + 100), new class142());
				}

				try {
					return new class145(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1862427212"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field797;
		} else if (var5 >= 100) {
			var6 = Client.field511;
		} else {
			var6 = (Client.field511 - Client.field797) * var5 / 100 + Client.field797;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field785) {
			var18 = Client.field785;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field784) {
				var6 = Client.field784;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field786) {
			var18 = Client.field786;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field783) {
				var6 = Client.field783;
				var8 = var18 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var16 * var11 / 256;
				var17[var9] = var14 * var13 >> 16;
			}

			HttpRequest.topLevelWorldView.scene.method4926(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "1370260280"
	)
	static void method6241(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		WorldMapRenderer.method6084(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < LoginState.field507.length; ++var4) {
			if (WorldMapSection2.field3116[var4] != -1 && LoginState.field507[var4] == null) {
				LoginState.field507[var4] = class309.archive9.takeFile(WorldMapSection2.field3116[var4], 0);
				if (LoginState.field507[var4] == null) {
					var3 = false;
				}
			}

			if (FloorDecoration.field2539[var4] != -1 && class333.field3621[var4] == null) {
				class333.field3621[var4] = class309.archive9.takeFileEncrypted(FloorDecoration.field2539[var4], 0, AuthenticationScheme.field1523[var4]);
				if (class333.field3621[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			WorldMapRenderer.method6084(false);
			var3 = true;

			for (var4 = 0; var4 < LoginState.field507.length; ++var4) {
				byte[] var17 = class333.field3621[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= UserComparator3.method3233(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				UserComparator3.method3232();
				GrandExchangeEvent.method7730();
				MouseRecorder.method2503();
				WorldMapRenderer.method6084(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					UserComparator3.method3232();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field584[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < Canvas.field109.length; ++var14) {
									if (Canvas.field109[var14] == var13 && LoginState.field507[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										WorldMapSectionType.method6196(var0, LoginState.field507[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								Client.method1634(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field584[0][var4][var5];
						if (var18 == -1) {
							class346.method6797(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				WorldMapRenderer.method6084(true);

				for (var4 = 0; var4 < 4; ++var4) {
					UserComparator3.method3232();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field584[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < Canvas.field109.length; ++var13) {
									if (Canvas.field109[var13] == var12 && class333.field3621[var13] != null) {
										Tiles.method2387(var0, class333.field3621[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				WorldMapRenderer.method6084(true);
				UserComparator3.method3232();
				Language.method7792(var0);
				WorldMapRenderer.method6084(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				UserComparator3.method3232();
				class268.method5565();
				Client.field519 = false;
			}
		}
	}
}
