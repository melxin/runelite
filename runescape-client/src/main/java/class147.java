import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public enum class147 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1730(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1728(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1729(2, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1734(3, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1731(4, 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1732(5, 5),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1727(6, 6),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1735(7, 7),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	field1733(8, 8);

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 542887857
	)
	final int field1736;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -923091163
	)
	final int field1737;

	class147(int var3, int var4) {
		this.field1736 = var3;
		this.field1737 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1737;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-439804613"
	)
	public static int method3941(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		if (var0 < var2) {
			var6 += var2 - var0;
		} else if (var0 > var4) {
			var6 += var0 - var4;
		}

		if (var1 < var3) {
			var6 += var3 - var1;
		} else if (var1 > var5) {
			var6 += var1 - var5;
		}

		return var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;Ljava/lang/String;Ljava/lang/String;B)Lsu;",
		garbageValue = "78"
	)
	public static Font method3944(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			Font var6;
			if (!FloorOverlayDefinition.method4919(var0, var4, var5)) {
				var6 = null;
			} else {
				var6 = class181.method4292(var1.takeFile(var4, var5));
			}

			return var6;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lof;II)I",
		garbageValue = "850322810"
	)
	static final int method3943(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class226.widgetDefinition.method7728(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class150.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = class330.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class226.widgetDefinition.method7728(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class150.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = WorldMapData_1.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (class330.localPlayer.x >> 7) + Occluder.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (class330.localPlayer.y >> 7) + Occluder.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
