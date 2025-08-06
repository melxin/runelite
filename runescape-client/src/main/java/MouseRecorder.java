import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("al")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ab")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 293125129
	)
	@Export("index")
	int index;
	@ObfuscatedName("av")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("au")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("as")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; UserComparator4.method3477(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-555349277"
	)
	static void method2130() {
		ByteArrayPool.field5220.clear();
		ByteArrayPool.field5220.add(100);
		ByteArrayPool.field5220.add(5000);
		ByteArrayPool.field5220.add(10000);
		ByteArrayPool.field5220.add(30000);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)I",
		garbageValue = "606029226"
	)
	public static int method2126(DynamicArray var0) {
		class281.method6335(var0);
		byte var1 = 0;
		int var2 = var0.method10351();
		int var3 = -1;
		int var8;
		if (var0.field5399 == class570.field5721) {
			int[] var4 = var0.method10348();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] < var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5399 == class570.field5724) {
			long[] var9 = var0.method10377();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] < var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5399 == class570.field5718) {
			String var10 = null;
			Object[] var5 = var0.method10393();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-601123716"
	)
	static int method2129(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = NpcOverrides.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class563.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class86.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3] == 1;
					class547.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var5 = Messages.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class191.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class191.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var5 = Messages.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = SpriteMask.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = SpriteMask.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var5 = Messages.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = ObjectComposition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ObjectComposition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var5 = Messages.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class143.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class143.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							--AbstractWorldMapIcon.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.field320;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
