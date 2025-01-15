import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static AbstractArchive field5417;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("az")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("ao")
	int[][] field5415;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 180951745
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "56"
	)
	void method10170(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method10185(var1, var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "1657346556"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-2139902597"
	)
	void method10185(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5415 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				Object[][] var16 = this.columnTypes;
				int var10 = var1.readUShortSmart();
				Object[] var11 = new Object[var6.length * var10];

				for (int var12 = 0; var12 < var10; ++var12) {
					for (int var13 = 0; var13 < var6.length; ++var13) {
						int var14 = var13 + var6.length * var12;
						class544 var15 = EnumComposition.method5280(var6[var13]);
						var11[var14] = var15.method10123(var1);
					}
				}

				var16[var4] = var11;
				this.field5415[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	void method10172() {
	}
}
