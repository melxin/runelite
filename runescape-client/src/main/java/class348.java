import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class348 implements Comparator {
	class348() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;B)I",
		garbageValue = "-28"
	)
	int method7354(class341 var1, class341 var2) {
		return var1.field3854 - var2.field3854;
	}

	public int compare(Object var1, Object var2) {
		return this.method7354((class341)var1, (class341)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-115"
	)
	public static void method7364(int var0, int var1) {
		VarbitComposition var2 = class107.method3302(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "1016075397"
	)
	static final void method7355(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "509843882"
	)
	static void method7363(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		UserComparator8.method3491(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < ClanChannel.field1891.length; ++var4) {
			if (SoundSystem.field1344[var4] != -1 && ClanChannel.field1891[var4] == null) {
				ClanChannel.field1891[var4] = class201.archive9.takeFile(SoundSystem.field1344[var4], 0);
				if (ClanChannel.field1891[var4] == null) {
					var3 = false;
				}
			}

			if (class69.field962[var4] != -1 && Canvas.field100[var4] == null) {
				Canvas.field100[var4] = class201.archive9.takeFileEncrypted(class69.field962[var4], 0, class400.field4760[var4]);
				if (Canvas.field100[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			UserComparator8.method3491(false);
			var3 = true;

			for (var4 = 0; var4 < ClanChannel.field1891.length; ++var4) {
				byte[] var17 = Canvas.field100[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= WallDecoration.method5786(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				MouseHandler.method722();
				class571.method11084();
				var0.method2641();
				UserComparator8.method3491(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					MouseHandler.method722();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field451[var4][var5][var18];
							if (var8 != -1) {
								var9 = class268.method6040(var8);
								var10 = Varcs.method2868(var8);
								var11 = MusicPatchNode2.method7087(var8);
								var12 = class149.method3791(var8);
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < FloatProjection.field2737.length; ++var14) {
									if (FloatProjection.field2737[var14] == var13 && ClanChannel.field1891[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										Varcs.method2871(var0, ClanChannel.field1891[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								method7355(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field451[0][var4][var5];
						if (var18 == -1) {
							WorldMapID.method6814(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				UserComparator8.method3491(true);

				for (var4 = 0; var4 < 4; ++var4) {
					MouseHandler.method722();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field451[var4][var5][var18];
							if (var20 != -1) {
								var8 = class268.method6040(var20);
								var9 = Varcs.method2868(var20);
								var10 = MusicPatchNode2.method7087(var20);
								var11 = class149.method3791(var20);
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < FloatProjection.field2737.length; ++var13) {
									if (FloatProjection.field2737[var13] == var12 && Canvas.field100[var13] != null) {
										Tiles.method2039(var0, Canvas.field100[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				UserComparator8.method3491(true);
				MouseHandler.method722();
				class162.method3975(var0);
				UserComparator8.method3491(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				MouseHandler.method722();
				Script.method1980();
				Client.field418 = false;
			}
		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwr;",
		garbageValue = "-51"
	)
	static DbTable method7361(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(ScriptEvent.field871, var0);
		}

		return var1;
	}
}
