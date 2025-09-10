import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kh")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -1461086973
	)
	static int field3224;
	@ObfuscatedName("oo")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("aw")
	public int[] field3207;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1497320747
	)
	public int field3206;
	@ObfuscatedName("ac")
	int[] field3209;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 466896143
	)
	int field3210;
	@ObfuscatedName("aq")
	public char field3215;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -470392627
	)
	public int field3212;
	@ObfuscatedName("as")
	char[] field3213;
	@ObfuscatedName("al")
	int[] field3214;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1941940403
	)
	int field3217;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1713754727
	)
	int field3211;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1568342569
	)
	int field3222;
	@ObfuscatedName("am")
	boolean[] field3218;
	@ObfuscatedName("an")
	boolean[] field3219;
	@ObfuscatedName("ar")
	boolean[] field3220;

	public IndexCheck() {
		this.field3207 = new int[128];
		this.field3206 = 0;
		this.field3209 = new int[128];
		this.field3210 = 0;
		this.field3213 = new char[128];
		this.field3214 = new int[128];
		this.field3217 = 0;
		this.field3211 = 0;
		this.field3222 = 0;
		this.field3218 = new boolean[112];
		this.field3219 = new boolean[112];
		this.field3220 = new boolean[112];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-112"
	)
	public boolean vmethod6115(int var1) {
		this.method6118(var1);
		this.field3218[var1] = true;
		this.field3219[var1] = true;
		this.field3220[var1] = false;
		if (this.field3206 < 128) {
			this.field3207[++this.field3206 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-195994958"
	)
	public boolean vmethod6123(int var1) {
		this.field3218[var1] = false;
		this.field3219[var1] = false;
		this.field3220[var1] = true;
		if (this.field3210 < 128) {
			this.field3209[++this.field3210 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "737785830"
	)
	public boolean vmethod6117(char var1) {
		int var2 = this.field3211 + 1 & 127;
		if (var2 != this.field3217) {
			this.field3214[this.field3211] = -1;
			this.field3213[this.field3211] = var1;
			this.field3211 = var2;
		}

		return false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "18"
	)
	public boolean vmethod6119(boolean var1) {
		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1873200788"
	)
	void method6118(int var1) {
		int var2 = this.field3211 + 1 & 127;
		if (var2 != this.field3217) {
			this.field3214[this.field3211] = var1;
			this.field3213[this.field3211] = 0;
			this.field3211 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2070254508"
	)
	public void method6120() {
		this.field3217 = this.field3222;
		this.field3222 = this.field3211;
		this.field3206 = 0;
		this.field3210 = 0;
		Arrays.fill(this.field3219, false);
		Arrays.fill(this.field3220, false);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-760839349"
	)
	public final boolean method6121() {
		if (this.field3222 == this.field3217) {
			return false;
		} else {
			this.field3212 = this.field3214[this.field3217];
			this.field3215 = this.field3213[this.field3217];
			this.field3217 = this.field3217 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "661727347"
	)
	public boolean method6122(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3219[var1] : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1794579815"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3218[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2089530482"
	)
	public boolean method6124(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3220[var1] : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-950945526"
	)
	public int[] method6135() {
		int[] var1 = new int[this.field3206];

		for (int var2 = 0; var2 < this.field3206; ++var2) {
			var1[var2] = this.field3207[var2];
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "84"
	)
	public int[] method6126() {
		int[] var1 = new int[this.field3210];

		for (int var2 = 0; var2 < this.field3210; ++var2) {
			var1[var2] = this.field3209[var2];
		}

		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "454045361"
	)
	static int method6160(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = AttackOption.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var10 = AttackOption.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var10 = AttackOption.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				ItemComposition var6 = AttackOption.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					var4 = AttackOption.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					var4 = AttackOption.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					var4 = AttackOption.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					var4 = AttackOption.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					var8 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					class370.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ModelData0.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						HttpRequestTask.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var8 = AttackOption.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = AttackOption.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.field2416;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = AttackOption.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (WorldEntityCoord.foundItemIds != null && HttpRequestTask.foundItemIndex < ModelData0.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = WorldEntityCoord.foundItemIds[++HttpRequestTask.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "853651621"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1018851475"
	)
	static final int method6161(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
