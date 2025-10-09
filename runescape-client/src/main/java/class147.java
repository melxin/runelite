import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fg")
public class class147 extends class150 {
	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1589774043
	)
	int field1761;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 717543161
	)
	int field1755;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1155469409
	)
	int field1759;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -159743425
	)
	int field1757;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class147(class153 var1) {
		this.this$0 = var1;
		this.field1761 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1761 = var1.readUnsignedShort();
		this.field1755 = var1.method11575();
		this.field1759 = var1.readUnsignedByte();
		this.field1757 = var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method4005(this.field1761, this.field1755, this.field1759, this.field1757);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1558611674"
	)
	public static class450 method3882() {
		synchronized(class450.field5214) {
			if (class450.field5210 == 0) {
				return new class450();
			} else {
				class450.field5214[--class450.field5210].method9068();
				return class450.field5214[class450.field5210];
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1247253111"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Loh;",
		garbageValue = "-1298615106"
	)
	public static StudioGame[] method3886() {
		return new StudioGame[]{StudioGame.game5, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.oldscape, StudioGame.game3};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(JJLma;B)D",
		garbageValue = "97"
	)
	public static double method3887(long var0, long var2, class336 var4) {
		double var5 = var2 > 0L ? (double)FontName.method11000(0.0F, 1.0F, (float)var0 / (float)var2) : 1.0D;
		if (var5 > 0.0D && var5 < 1.0D) {
			double var7;
			double var9;
			switch(var4.field3874) {
			case 0:
			default:
				return var5;
			case 1:
				return 1.0D - Math.cos(var5 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(3.141592653589793D * var5 / 2.0D);
			case 3:
				return -(Math.cos(var5 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var5 * var5;
			case 5:
				return 1.0D - (1.0D - var5) * (1.0D - var5);
			case 6:
				return var5 < 0.5D ? var5 * 2.0D * var5 : 1.0D - Math.pow(var5 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var5 * var5 * var5;
			case 8:
				return 1.0D - Math.pow(1.0D - var5, 3.0D);
			case 9:
				return var5 < 0.5D ? 4.0D * var5 * var5 * var5 : 1.0D - Math.pow(-2.0D * var5 + 2.0D, 3.0D) / 2.0D;
			case 10:
				return var5 * var5 * var5 * var5;
			case 11:
				return 1.0D - Math.pow(1.0D - var5, 4.0D);
			case 12:
				return var5 < 0.5D ? var5 * var5 * 8.0D * var5 * var5 : 1.0D - Math.pow(2.0D + -2.0D * var5, 4.0D) / 2.0D;
			case 13:
				return var5 * var5 * var5 * var5 * var5;
			case 14:
				return 1.0D - Math.pow(1.0D - var5, 5.0D);
			case 15:
				return var5 < 0.5D ? var5 * var5 * var5 * 8.0D * var5 * var5 : 1.0D - Math.pow(2.0D + var5 * -2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var5 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var5);
			case 18:
				return var5 < 0.5D ? Math.pow(2.0D, var5 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var5 * -20.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var5, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var5 - 1.0D, 2.0D));
			case 21:
				return var5 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var5 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var5 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return var5 * 2.70158D * var5 * var5 - var5 * 1.70158D * var5;
			case 23:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var5 - 1.0D, 3.0D) + 1.70158D * Math.pow(var5 - 1.0D, 2.0D);
			case 24:
				var7 = 1.70158D;
				var9 = 2.5949095D;
				return var5 < 0.5D ? Math.pow(2.0D * var5, 2.0D) * (var5 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var5 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (var5 * 2.0D - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				var7 = 2.0943951023931953D;
				return -Math.pow(2.0D, 10.0D * var5 - 10.0D) * Math.sin((10.0D * var5 - 10.75D) * 2.0943951023931953D);
			case 26:
				var7 = 2.0943951023931953D;
				return Math.pow(2.0D, var5 * -10.0D) * Math.sin((var5 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var7 = 1.3962634015954636D;
				var9 = Math.sin(1.3962634015954636D * (var5 * 20.0D - 11.125D));
				return var5 < 0.5D ? -(Math.pow(2.0D, var5 * 20.0D - 10.0D) * var9) / 2.0D : Math.pow(2.0D, -20.0D * var5 + 10.0D) * var9 / 2.0D + 1.0D;
			}
		} else {
			return var5 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1979671527"
	)
	static int method3884(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var8;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = InterfaceParent.method2164(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class572.ItemContainer_getCount(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = HttpResponse.method303(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = GameEngine.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class547.topLevelWorldView.plane;
					var8 = (class159.localPlayer.x >> 7) + class547.topLevelWorldView.baseX;
					var5 = (class159.localPlayer.y >> 7) + class547.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Coord.method7419(var3, var8, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Coord.method7421(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Coord.method7460(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Coord.method7469(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = InterfaceParent.method2164(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class572.ItemContainer_getCount(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = HttpResponse.method303(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					UrlRequest.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var8 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
					int var7 = Coord.method7419(var5, var8, var6);
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 + var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.field375;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.field339;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.field334[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = Client.field325;
					return 1;
				} else if (var0 == 3339) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (var3 == -1) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					} else {
						class202 var4 = class178.method4207(var3);
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4 == null ? "" : var4.field2213;
					}

					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
