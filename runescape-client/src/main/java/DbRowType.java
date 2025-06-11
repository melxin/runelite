import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("an")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("ai")
	int[][] field5621;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1548193487
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "45"
	)
	void method10689(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method10691(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "141433590"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1631846637"
	)
	void method10691(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5621 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readShortSmartSub();
				}

				Object[][] var16 = this.columnTypes;
				int var10 = var1.readShortSmartSub();
				Object[] var11 = new Object[var6.length * var10];

				for (int var12 = 0; var12 < var10; ++var12) {
					for (int var13 = 0; var13 < var6.length; ++var13) {
						int var14 = var13 + var6.length * var12;
						class563 var15 = class282.method6156(var6[var13]);
						var11[var14] = var15.method10636(var1);
					}
				}

				var16[var4] = var11;
				this.field5621[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	void method10692() {
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "6"
	)
	static int method10713(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class148.method3660() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
