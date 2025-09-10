import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fj")
public class class144 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;Lqm;B)Lqm;",
		garbageValue = "46"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class165.method4019(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.method1958());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("aw")
	public static int method3737(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1317378068"
	)
	protected static final void method3738() {
		FontName.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class360.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lwb;IIIIIII)V",
		garbageValue = "-2009643821"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				int var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						var8[0][var3][var4] = -class442.method8864(var5 + 932731, var6 + 556238) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					Tiles.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					Tiles.field848[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					Message.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			EnumComposition.method4307(var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "828398723"
	)
	static int method3739(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var8;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Calendar.method8131(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class136.ItemContainer_getCount(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class197.method4388(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = SecureRandomFuture.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class333.topLevelWorldView.plane;
					var8 = (HealthBarUpdate.localPlayer.x >> 7) + class333.topLevelWorldView.baseX;
					var5 = (HealthBarUpdate.localPlayer.y >> 7) + class333.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Coord.method7461(var3, var8, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Coord.method7424(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Coord.method7413(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Coord.method7415(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Calendar.method8131(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class136.ItemContainer_getCount(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class197.method4388(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					UserComparator7.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
					int var7 = Coord.method7461(var5, var8, var6);
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 + var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.field386;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.field396;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.field615[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Client.field345;
					return 1;
				} else if (var0 == 3339) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (var3 == -1) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					} else {
						class203 var4 = class157.method3872(var3);
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4 == null ? "" : var4.field2233;
					}

					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
