import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class392 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lut;Ljava/lang/Object;III)I",
		garbageValue = "703900950"
	)
	public static int method8381(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10652()) {
			var3 = var0.method10652();
		}

		int var5;
		if (var0.field5584 == class586.field5937) {
			int[] var11 = var0.method10650();
			var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; --var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5584 == class586.field5942) {
			long[] var10 = var0.method10651();
			long var8 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; --var7) {
				if (var8 == var10[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10681();

			for (var5 = var3 - 1; var5 >= var2; --var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "1930097690"
	)
	static void method8383(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		class228.method5080(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < JagexCache.field2586.length; ++var4) {
			if (DevicePcmPlayerProvider.field86[var4] != -1 && JagexCache.field2586[var4] == null) {
				JagexCache.field2586[var4] = Tile.archive9.takeFile(DevicePcmPlayerProvider.field86[var4], 0);
				if (JagexCache.field2586[var4] == null) {
					var3 = false;
				}
			}

			if (HealthBarUpdate.field1082[var4] != -1 && Login.field717[var4] == null) {
				Login.field717[var4] = Tile.archive9.takeFileEncrypted(HealthBarUpdate.field1082[var4], 0, Sound.field1803[var4]);
				if (Login.field717[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			class228.method5080(false);
			var3 = true;

			for (var4 = 0; var4 < JagexCache.field2586.length; ++var4) {
				byte[] var17 = Login.field717[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= ClanChannelMember.method3985(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				HttpRequestTask.method290();
				SoundSystem.method3227();
				var0.method2770();
				class228.method5080(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					HttpRequestTask.method290();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field429[var4][var5][var18];
							if (var8 != -1) {
								var9 = class225.method5054(var8);
								var10 = VarbitComposition.method4673(var8);
								var11 = class498.method10142(var8);
								var12 = Renderable.method5835(var8);
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < LoginState.field277.length; ++var14) {
									if (LoginState.field277[var14] == var13 && JagexCache.field2586[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										SequenceDefinition.method4986(var0, JagexCache.field2586[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								class226.method5057(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field429[0][var4][var5];
						if (var18 == -1) {
							ScriptFrame.method749(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				class228.method5080(true);

				for (var4 = 0; var4 < 4; ++var4) {
					HttpRequestTask.method290();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field429[var4][var5][var18];
							if (var20 != -1) {
								var8 = class225.method5054(var20);
								var9 = VarbitComposition.method4673(var20);
								var10 = class498.method10142(var20);
								var11 = Renderable.method5835(var20);
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < LoginState.field277.length; ++var13) {
									if (LoginState.field277[var13] == var12 && Login.field717[var13] != null) {
										Tiles.method2092(var0, Login.field717[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				class228.method5080(true);
				HttpRequestTask.method290();
				class470.method9712(var0);
				class228.method5080(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				HttpRequestTask.method290();
				InterfaceParent.method2179();
				Client.field473 = false;
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "1228825693"
	)
	static boolean method8382(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = AsyncHttpResponse.worldView.scene;
		int var9;
		if (var5 == class405.field4901.field4897) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = HorizontalAlignment.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4405.id) {
					var8.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(AsyncHttpResponse.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class405.field4898.field4897) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = HorizontalAlignment.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4390.id && var3 != WorldMapDecorationType.field4392.id) {
					if (var3 == WorldMapDecorationType.field4393.id) {
						var10.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4394.id) {
						var10.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4395.id) {
						var10.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(AsyncHttpResponse.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(AsyncHttpResponse.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class405.field4899.field4897) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4407.id) {
				var3 = WorldMapDecorationType.field4387.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(AsyncHttpResponse.worldView, HorizontalAlignment.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class405.field4900.field4897) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(AsyncHttpResponse.worldView, HorizontalAlignment.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
