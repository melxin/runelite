import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ae")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-425598815"
	)
	public void method5077(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method5078(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;IB)V",
		garbageValue = "-6"
	)
	void method5078(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "1008351714"
	)
	public static int method5086(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1341452479"
	)
	static void method5076(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		class157.method3539(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < WorldMapScaleHandler.field3349.length; ++var4) {
			if (ModelData0.field2361[var4] != -1 && WorldMapScaleHandler.field3349[var4] == null) {
				WorldMapScaleHandler.field3349[var4] = class161.archive9.takeFile(ModelData0.field2361[var4], 0);
				if (WorldMapScaleHandler.field3349[var4] == null) {
					var3 = false;
				}
			}

			if (HorizontalAlignment.field2679[var4] != -1 && class235.field2577[var4] == null) {
				class235.field2577[var4] = class161.archive9.takeFileEncrypted(HorizontalAlignment.field2679[var4], 0, Actor.field1286[var4]);
				if (class235.field2577[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			class157.method3539(false);
			var3 = true;

			for (var4 = 0; var4 < WorldMapScaleHandler.field3349.length; ++var4) {
				byte[] var17 = class235.field2577[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= class235.method5048(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				class362.method7337();
				class36.method710();
				class521.method9686();
				class157.method3539(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					class362.method7337();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field657[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < class370.field4122.length; ++var14) {
									if (class370.field4122[var14] == var13 && WorldMapScaleHandler.field3349[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										class325.method6545(var0, WorldMapScaleHandler.field3349[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								MusicPatch.method6824(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field657[0][var4][var5];
						if (var18 == -1) {
							PlayerType.method7585(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				class157.method3539(true);

				for (var4 = 0; var4 < 4; ++var4) {
					class362.method7337();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field657[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < class370.field4122.length; ++var13) {
									if (class370.field4122[var13] == var12 && class235.field2577[var13] != null) {
										Tiles.method2385(var0, class235.field2577[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				class157.method3539(true);
				class362.method7337();
				Clock.method4982(var0);
				class157.method3539(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				class362.method7337();
				Widget.method7392();
				Client.field637 = false;
			}
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "-1635141000"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class4.loginState != var0) {
			class4.loginState = var0;
		}
	}
}
