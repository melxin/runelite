import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class148 extends class149 {
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -734235235
	)
	static int field1710;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -248590595
	)
	int field1709;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class148(class152 var1) {
		this.this$0 = var1;
		this.field1709 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1709 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3748(this.field1709);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "1551333846"
	)
	public static VarcInt method3652(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method4024(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "17299"
	)
	static final void method3659(int var0, int var1, int var2, int var3) {
		Client.field332 = 0;
		int var4 = (class152.localPlayer.x >> 7) + Sound.topLevelWorldView.baseX;
		int var5 = (class152.localPlayer.y >> 7) + Sound.topLevelWorldView.baseY;
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field332 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field332 = 1;
		}

		if (Client.field332 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field332 = 0;
		}

	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "1495576013"
	)
	static void method3653(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		class242.method5121(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < Fonts.field5525.length; ++var4) {
			if (FriendSystem.field634[var4] != -1 && Fonts.field5525[var4] == null) {
				Fonts.field5525[var4] = VerticalAlignment.archive9.takeFile(FriendSystem.field634[var4], 0);
				if (Fonts.field5525[var4] == null) {
					var3 = false;
				}
			}

			if (class228.field2491[var4] != -1 && WorldMapCacheName.field3329[var4] == null) {
				WorldMapCacheName.field3329[var4] = VerticalAlignment.archive9.takeFileEncrypted(class228.field2491[var4], 0, class7.field26[var4]);
				if (WorldMapCacheName.field3329[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			class242.method5121(false);
			var3 = true;

			for (var4 = 0; var4 < Fonts.field5525.length; ++var4) {
				byte[] var17 = WorldMapCacheName.field3329[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= ReflectionCheck.method706(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				MusicPatchNode2.method6884();
				Skills.method7912();
				class242.method5121(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					MusicPatchNode2.method6884();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field463[var4][var5][var18];
							if (var8 != -1) {
								var9 = class300.method6623(var8);
								var10 = class188.method4106(var8);
								var11 = SpriteMask.method7212(var8);
								var12 = WorldMapRegion.method6426(var8);
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < HttpRequest.field53.length; ++var14) {
									if (HttpRequest.field53[var14] == var13 && Fonts.field5525[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										AuthenticationScheme.method3633(var0, Fonts.field5525[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								SecureRandomCallable.method2078(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field463[0][var4][var5];
						if (var18 == -1) {
							Tiles.method2077(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				class242.method5121(true);

				for (var4 = 0; var4 < 4; ++var4) {
					MusicPatchNode2.method6884();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field463[var4][var5][var18];
							if (var20 != -1) {
								var8 = class300.method6623(var20);
								var9 = class188.method4106(var20);
								var10 = SpriteMask.method7212(var20);
								var11 = WorldMapRegion.method6426(var20);
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < HttpRequest.field53.length; ++var13) {
									if (HttpRequest.field53[var13] == var12 && WorldMapCacheName.field3329[var13] != null) {
										Tiles.method2024(var0, WorldMapCacheName.field3329[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				class242.method5121(true);
				MusicPatchNode2.method6884();
				FloorOverlayDefinition.method4536(var0);
				class242.method5121(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				MusicPatchNode2.method6884();
				class269.method5881();
				Client.field442 = false;
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-629609218"
	)
	static final boolean method3660() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1186697553"
	)
	static final void method3662(int var0, int var1, int var2, boolean var3) {
		if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
			ViewportMouse.resizeInterface(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3);
		}
	}
}
