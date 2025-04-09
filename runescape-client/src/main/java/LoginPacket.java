import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ft")
@Implements("LoginPacket")
public class LoginPacket extends class148 {
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -1069868261
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 9118602942750785495L
	)
	long field1698;
	@ObfuscatedName("an")
	String field1697;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	LoginPacket(class151 var1) {
		this.this$0 = var1;
		this.field1698 = -1L;
		this.field1697 = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 29699747;
			this.field1698 = var1.readLong();
		}

		this.field1697 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3606(this.field1698, this.field1697, 0);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIZIIB)J",
		garbageValue = "-15"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1876593791"
	)
	static int method3458(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = class151.method3493(var3);
			var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			var6 = InterfaceParent.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = class419.method8000(var5);
				IgnoreList.field5105 = var6.method10189(var4, var7);
				if (IgnoreList.field5105 != null) {
					Client.field809 = UserComparator6.method3255(var5);
					PendingSpawn.field1208 = IgnoreList.field5105.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = IgnoreList.field5105.size();
					}
				} else {
					Client.field809 = -1;
					PendingSpawn.field1208 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
				var20 = UserComparator6.method3255(var19);
				var7 = class256.method5325(var19);
				int var21 = class419.method8000(var19);
				DbRowType var26 = FloorDecoration.getDbRowType(var3);
				DbTableType var27 = class449.getDbTableType(var20);
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
						class555 var22 = SpotAnimationDefinition.method5259(var16);
						if (var22 == class555.field5521) {
							Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class478.method9105(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class555 var18 = SpotAnimationDefinition.method5259(var28[var16]);
							if (var18 == class555.field5521) {
								Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = (String)var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = UserComparator6.method3255(var19);
				var7 = class256.method5325(var19);
				DbRowType var25 = FloorDecoration.getDbRowType(var3);
				DbTableType var9 = class449.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--AbstractByteArrayCopier.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				DbTable var24 = UserComparator4.method3197(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					IgnoreList.field5105 = var24.method10189(0, 0);
					var5 = 0;
					if (IgnoreList.field5105 != null) {
						Client.field809 = var3;
						PendingSpawn.field1208 = IgnoreList.field5105.iterator();
						var5 = IgnoreList.field5105.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				DbRowType var23 = FloorDecoration.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var19 = -1;
				if (IgnoreList.field5105 != null && var3 >= 0 && var3 < IgnoreList.field5105.size()) {
					var19 = (Integer)IgnoreList.field5105.get(var3);
				}

				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = class151.method3493(var3);
				var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				var6 = InterfaceParent.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (UserComparator6.method3255(var5) != Client.field809) {
					throw new RuntimeException();
				} else if (IgnoreList.field5105 == null && IgnoreList.field5105.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = class419.method8000(var5);
					List var8 = var6.method10189(var4, var7);
					IgnoreList.field5105 = new LinkedList(IgnoreList.field5105);
					if (var8 != null) {
						IgnoreList.field5105.retainAll(var8);
					} else {
						IgnoreList.field5105.clear();
					}

					PendingSpawn.field1208 = IgnoreList.field5105.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = IgnoreList.field5105.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (PendingSpawn.field1208 != null && PendingSpawn.field1208.hasNext()) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = (Integer)PendingSpawn.field1208.next();
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}
}
