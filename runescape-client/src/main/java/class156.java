import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
public class class156 extends class166 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1538274283
	)
	int field1712;
	@ObfuscatedName("ah")
	byte field1710;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1511951237
	)
	int field1711;
	@ObfuscatedName("ao")
	String field1713;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	class156(class167 var1) {
		this.this$0 = var1;
		this.field1712 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	void vmethod3869(Buffer var1) {
		this.field1712 = var1.readUnsignedShort();
		this.field1710 = var1.readByte();
		this.field1711 = var1.readUnsignedShort();
		var1.readLong();
		this.field1713 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	void vmethod3870(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1712);
		var2.rank = this.field1710;
		var2.world = this.field1711;
		var2.username = new Username(this.field1713);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "61"
	)
	static int method3638(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			var4 = class4.method17(var3);
			var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			var6 = SoundCache.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = WallDecoration.method4819(var5);
				class230.field2489 = var6.method10168(var4, var7);
				if (class230.field2489 != null) {
					Client.field790 = class244.method5288(var5);
					class261.field2784 = class230.field2489.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class230.field2489.size();
					}
				} else {
					Client.field790 = -1;
					class261.field2784 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				var20 = class244.method5288(var19);
				var7 = class384.method7653(var19);
				int var21 = WallDecoration.method4819(var19);
				DbRowType var26 = class28.getDbRowType(var3);
				DbTableType var27 = ArchiveDiskActionHandler.getDbTableType(var20);
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
						class544 var22 = EnumComposition.method5280(var16);
						if (var22 == class544.field5393) {
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ActorSpotAnim.method9377(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class544 var18 = EnumComposition.method5280(var28[var16]);
							if (var18 == class544.field5393) {
								Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = (String)var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = class244.method5288(var19);
				var7 = class384.method7653(var19);
				DbRowType var25 = class28.getDbRowType(var3);
				DbTableType var9 = ArchiveDiskActionHandler.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--ScriptFrame.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				DbTable var24 = class454.method8935(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					class230.field2489 = var24.method10168(0, 0);
					var5 = 0;
					if (class230.field2489 != null) {
						Client.field790 = var3;
						class261.field2784 = class230.field2489.iterator();
						var5 = class230.field2489.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				DbRowType var23 = class28.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				var19 = -1;
				if (class230.field2489 != null && var3 >= 0 && var3 < class230.field2489.size()) {
					var19 = (Integer)class230.field2489.get(var3);
				}

				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				var4 = class4.method17(var3);
				var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				var6 = SoundCache.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (class244.method5288(var5) != Client.field790) {
					throw new RuntimeException();
				} else if (class230.field2489 == null && class230.field2489.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = WallDecoration.method4819(var5);
					List var8 = var6.method10168(var4, var7);
					class230.field2489 = new LinkedList(class230.field2489);
					if (var8 != null) {
						class230.field2489.retainAll(var8);
					} else {
						class230.field2489.clear();
					}

					class261.field2784 = class230.field2489.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class230.field2489.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (class261.field2784 != null && class261.field2784.hasNext()) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = (Integer)class261.field2784.next();
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}
}
