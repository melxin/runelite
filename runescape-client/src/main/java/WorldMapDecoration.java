import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ls")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 535705447
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1926597639
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2132478609
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1906380786"
	)
	static class426 method6233() {
		synchronized(class426.field4765) {
			if (class426.field4762 == 0) {
				return new class426();
			} else {
				class426.field4765[--class426.field4762].method8159();
				return class426.field4765[class426.field4762];
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "307005441"
	)
	public static int method6234(int var0, int var1, int var2) {
		int var3 = class139.method3386(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "555408269"
	)
	static int method6231(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1315407546"
	)
	static int method6232(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldMapLabelSize.method5794(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class318.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class53.method1064(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class139.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = HttpRequest.topLevelWorldView.plane;
					var4 = (AsyncHttpResponse.localPlayer.x >> 7) + HttpRequest.topLevelWorldView.baseX;
					var5 = (AsyncHttpResponse.localPlayer.y >> 7) + HttpRequest.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Coord.method6812(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Coord.method6814(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Coord.method6813(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Coord.method6815(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldMapLabelSize.method5794(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class318.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class53.method1064(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					PrivateChatMode.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
					int var7 = Coord.method6812(var5, var4, var6);
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.field528;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.field529;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.field655[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field614;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
