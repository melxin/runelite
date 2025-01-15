import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ah")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("az")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("ao")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("ad")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("ay")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "449666140"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "1500148000"
	)
	static void method7859(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		Projectile.method2454(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < WorldMapSectionType.field3193.length; ++var4) {
			if (class440.field4851[var4] != -1 && WorldMapSectionType.field3193[var4] == null) {
				WorldMapSectionType.field3193[var4] = LoginState.archive9.takeFile(class440.field4851[var4], 0);
				if (WorldMapSectionType.field3193[var4] == null) {
					var3 = false;
				}
			}

			if (HealthBarDefinition.field2578[var4] != -1 && AccessFile.field5365[var4] == null) {
				AccessFile.field5365[var4] = LoginState.archive9.takeFileEncrypted(HealthBarDefinition.field2578[var4], 0, class374.field4114[var4]);
				if (AccessFile.field5365[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			Projectile.method2454(false);
			var3 = true;

			for (var4 = 0; var4 < WorldMapSectionType.field3193.length; ++var4) {
				byte[] var17 = AccessFile.field5365[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= class508.method9614(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				class113.method3178();
				Renderable.method4460();
				World.method1957();
				Projectile.method2454(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					class113.method3178();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field574[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < StructComposition.field2742.length; ++var14) {
									if (StructComposition.field2742[var14] == var13 && WorldMapSectionType.field3193[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										class92.method2646(var0, WorldMapSectionType.field3193[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								FloorOverlayDefinition.method5662(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field574[0][var4][var5];
						if (var18 == -1) {
							class280.method5989(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				Projectile.method2454(true);

				for (var4 = 0; var4 < 4; ++var4) {
					class113.method3178();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field574[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < StructComposition.field2742.length; ++var13) {
									if (StructComposition.field2742[var13] == var12 && AccessFile.field5365[var13] != null) {
										Tiles.method2511(var0, AccessFile.field5365[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				Projectile.method2454(true);
				class113.method3178();
				GrandExchangeEvent.method7903(var0);
				Projectile.method2454(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				class113.method3178();
				UserComparator7.method3331();
				Client.field509 = false;
			}
		}
	}
}
