import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cn")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field913;
	@ObfuscatedName("af")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aw")
	@Export("lock")
	Object lock;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2103704019
	)
	@Export("index")
	int index;
	@ObfuscatedName("ac")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ap")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("aq")
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
		for (; this.isRunning; class164.method4001(50L)) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1908605701"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-2105325665"
	)
	static int method2152(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			var4 = SecureRandomCallable.method2082(var3);
			var5 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			var6 = Canvas.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = LoginType.method10882(var5);
				class334.field3837 = var6.method11060(var4, var7);
				if (class334.field3837 != null) {
					Client.field316 = class456.method9207(var5);
					class255.field3064 = class334.field3837.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class334.field3837.size();
					}
				} else {
					Client.field316 = -1;
					class255.field3064 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				var20 = class456.method9207(var19);
				var7 = BufferedNetSocket.method10223(var19);
				int var21 = LoginType.method10882(var19);
				DbRowType var26 = TransformationMatrix.getDbRowType(var3);
				DbTableType var27 = class574.getDbTableType(var20);
				int[] var28 = var27.types[var7];
				int var12 = 0;
				int var13 = var28.length;
				if (var21 >= 0) {
					if (var21 >= var13) {
						throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
					}

					var12 = var21;
					var13 = var21 + 1;
				}

				Object[] var14 = var26.getColumnType(var7);
				if (var14 == null && var27.defaultValues != null) {
					var14 = var27.defaultValues[var7];
				}

				int var15;
				int var16;
				if (var14 == null) {
					for (var15 = var12; var15 < var13; ++var15) {
						var16 = var28[var15];
						class574 var22 = class491.method9850(var16);
						if (var22 == class574.field5824) {
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Fonts.method10840(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class574 var18 = class491.method9850(var28[var16]);
							if (var18 == class574.field5824) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = class456.method9207(var19);
				var7 = BufferedNetSocket.method10223(var19);
				DbRowType var25 = TransformationMatrix.getDbRowType(var3);
				DbTableType var9 = class574.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--UserComparator7.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				DbTable var24 = AsyncRestClient.getDbTable2(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					class334.field3837 = var24.method11060(0, 0);
					var5 = 0;
					if (class334.field3837 != null) {
						Client.field316 = var3;
						class255.field3064 = class334.field3837.iterator();
						var5 = class334.field3837.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				DbRowType var23 = TransformationMatrix.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var19 = -1;
				if (class334.field3837 != null && var3 >= 0 && var3 < class334.field3837.size()) {
					var19 = (Integer)class334.field3837.get(var3);
				}

				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var4 = SecureRandomCallable.method2082(var3);
				var5 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var6 = Canvas.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (class456.method9207(var5) != Client.field316) {
					throw new RuntimeException();
				} else if (class334.field3837 == null && class334.field3837.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = LoginType.method10882(var5);
					List var8 = var6.method11060(var4, var7);
					class334.field3837 = new LinkedList(class334.field3837);
					if (var8 != null) {
						class334.field3837.retainAll(var8);
					} else {
						class334.field3837.clear();
					}

					class255.field3064 = class334.field3837.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class334.field3837.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (class255.field3064 != null && class255.field3064.hasNext()) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (Integer)class255.field3064.next();
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}
}
