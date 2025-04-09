import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("as")
	static final String[] field856;
	@ObfuscatedName("aa")
	static final double field859;
	@ObfuscatedName("aw")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ar")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("au")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("al")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1053048089
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	static ScriptFrame[] field865;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("az")
	static boolean field867;
	@ObfuscatedName("at")
	static boolean field868;
	@ObfuscatedName("ab")
	static ArrayList field869;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -870740203
	)
	static int field870;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	static {
		field856 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field859 = Math.log(2.0D);
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		field865 = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		field867 = false;
		field868 = false;
		field869 = new ArrayList();
		field870 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	static void method2160(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "390988770"
	)
	static void method2161() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "-1246380245"
	)
	static int method2062(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class143.method3437(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class446.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class440.method8335(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = UserComparator3.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class509.topLevelWorldView.plane;
					var4 = (Script.localPlayer.x >> 7) + class509.topLevelWorldView.baseX;
					var5 = (Script.localPlayer.y >> 7) + class509.topLevelWorldView.baseY;
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Coord.method6902(var3, var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Coord.method6892(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Coord.method6891(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Coord.method6903(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] + 32768;
					var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class143.method3437(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] + 32768;
					var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class446.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] + 32768;
					var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class440.method8335(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
					var3 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var4 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					var5 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
					int var6 = Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
					int var7 = Coord.method6902(var5, var4, var6);
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.field581;
					return 1;
				} else if (var0 == 3327) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.field724;
					return 1;
				} else if (var0 == 3331) {
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.field538[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = Client.field703;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lnh;IIIIIIB)V",
		garbageValue = "-45"
	)
	static final void method2025(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field666) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field666 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class139.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class139.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class139.invalidateWidget(var0);
				Client.field666 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * 624892547;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class139.invalidateWidget(var0);
			}
		}

	}
}
