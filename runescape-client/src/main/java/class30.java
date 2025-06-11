import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class30 {
	@ObfuscatedName("ao")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 232650631
	)
	@Export("worldPort")
	static int worldPort;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "616480864"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-596436936"
	)
	public static void method451(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class335.field3704.clear();
			class335.field3699.clear();
			if (var5) {
				WorldMapIcon_1.method6192();
			} else {
				for (int var6 = 0; var6 < class335.midiRequests.size(); ++var6) {
					MidiRequest var7 = (MidiRequest)class335.midiRequests.get(var6);
					if (var7 == null) {
						class335.midiRequests.remove(var6);
						--var6;
					} else if (var7.field3812) {
						if (var7.midiPcmStream.field3739 > 0) {
							--var7.midiPcmStream.field3739;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6981();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class335.midiRequests.remove(var6);
						--var6;
					} else {
						var7.field3812 = true;
					}
				}
			}

			class51.method1868(var0, var5);
			if (!class335.field3704.isEmpty()) {
				class335.musicPlayerStatus = var1;
				class335.field3697 = var2;
				class335.field3702 = var3;
				class335.field3703 = var4;
				class335.field3699.add(new AddRequestTask((SongTask)null));
				class335.field3699.add(new class469((SongTask)null, class141.field1661, class321.field3367, class335.field3693));
				ArrayList var9 = new ArrayList();
				var9.add(new class464(new FadeInTask((SongTask)null, 0, true, class335.field3703)));
				if (!class335.midiRequests.isEmpty()) {
					ArrayList var10 = new ArrayList();
					var10.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var9), class335.field3702));
					ArrayList var8 = Player.method2208();
					var10.add(new DelayFadeTask(new FadeOutTask(new class462((SongTask)null, var8), 0, false, class335.field3697), class335.musicPlayerStatus));
					class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var10));
				} else {
					class335.field3699.add(new DelayFadeTask((SongTask)null, class335.field3702));
					class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var9));
				}

			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbg;Lbg;IZIZI)I",
		garbageValue = "1095983329"
	)
	static int method448(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class302.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class302.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "2146023728"
	)
	static int method450(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class7.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = AttackOption.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class70.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class547.World_worlds[var8].id) {
							var7 = class547.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					ObjectComposition.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = TaskHandler.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = UserComparator3.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = TaskHandler.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = HealthBarConfig.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarConfig.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = TaskHandler.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = TaskHandler.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = ItemLayer.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ItemLayer.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class175.Interpreter_objectStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class175.Interpreter_objectStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field381;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class547.World_worlds[var3];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
