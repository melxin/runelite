import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bk")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lbq;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class255.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "250513281"
	)
	static int method869(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class36.method716(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = GameBuild.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class75.method2360(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class369.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = GameEngine.topLevelWorldView.plane;
					var4 = (ModeWhere.localPlayer.x >> 7) + GameEngine.topLevelWorldView.baseX;
					var5 = (ModeWhere.localPlayer.y >> 7) + GameEngine.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6969(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6971(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6965(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Coord.method6972(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class36.method716(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = GameBuild.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class75.method2360(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					ScriptFrame.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
					int var7 = Coord.method6969(var5, var4, var6);
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field517;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field518;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field645[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = Client.field631;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
