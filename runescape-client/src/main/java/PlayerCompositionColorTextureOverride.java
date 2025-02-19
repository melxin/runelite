import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gf")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Bounds field1897;
	@ObfuscatedName("ah")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ac")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -939348983
	)
	int field1890;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1239599377
	)
	int field1898;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2077934379
	)
	int field1891;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -833618107
	)
	int field1893;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 79741019
	)
	public int field1894;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public Model field1895;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1890 = -1;
		this.field1898 = -1;
		this.field1891 = -1;
		this.field1893 = -1;
		ItemComposition var2 = class138.ItemDefinition_get(var1);
		if (var2.method4226()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4227()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1894 = var2.model;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method3709() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-267635569"
	)
	public boolean method3715() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "25"
	)
	boolean method3731(int var1) {
		return var1 == 0 && this.field1890 != -1 || var1 == 1 && this.field1898 != -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1723837063"
	)
	boolean method3712(int var1) {
		return var1 == 0 && this.field1891 != -1 || var1 == 1 && this.field1893 != -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-1"
	)
	int method3708(int var1) {
		return var1 == 0 ? this.field1890 : this.field1898;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1164990560"
	)
	int method3714(int var1) {
		return var1 == 0 ? this.field1891 : this.field1893;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqt;B)I",
		garbageValue = "0"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = GrandExchangeOfferOwnWorldComparator.method1217(var9);
			var8 = GrandExchangeOfferOwnWorldComparator.method1217(var10);
			var9 = BuddyRankComparator.standardizeChar(var9, var2);
			var10 = BuddyRankComparator.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return class376.lowercaseChar(var9, var2) - class376.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class376.lowercaseChar(var11, var2) - class376.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return class376.lowercaseChar(var12, var2) - class376.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "98"
	)
	public static void method3724(String[] var0, int[] var1) {
		HorizontalAlignment.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "329357941"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "-76"
	)
	static int method3740(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class311.method6425(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class131.method3274(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class133.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class200.topLevelWorldView.plane;
					var4 = (class132.localPlayer.x >> 7) + class200.topLevelWorldView.baseX;
					var5 = (class132.localPlayer.y >> 7) + class200.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Coord.method6863(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Coord.method6865(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Coord.method6864(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Coord.method6861(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class311.method6425(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class131.method3274(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					HealthBarConfig.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
					int var7 = Coord.method6863(var5, var4, var6);
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7 + var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.field529;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.field530;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.field662[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field643;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
