import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	static AbstractArchive field5415;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("at")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("ae")
	int[][] field5414;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1899141421
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-1095657975"
	)
	void method10002(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method10004(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "293265911"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "629701006"
	)
	void method10004(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5414 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				this.columnTypes[var4] = LoginScreenAnimation.method2740(var1, var6);
				this.field5414[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	void method10005() {
	}
}
