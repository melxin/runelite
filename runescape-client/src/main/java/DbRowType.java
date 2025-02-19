import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
@Implements("DbRowType")
public class DbRowType extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static AbstractArchive field5516;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("au")
	@Export("columnTypes")
	Object[][] columnTypes;
	@ObfuscatedName("ad")
	int[][] field5515;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2029104545
	)
	@Export("tableId")
	public int tableId;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64);
	}

	DbRowType() {
		this.tableId = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "251987210"
	)
	void method10118(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method10120(var1, var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "0"
	)
	@Export("getColumnType")
	public Object[] getColumnType(int var1) {
		return this.columnTypes == null ? null : this.columnTypes[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-860123602"
	)
	void method10120(Buffer var1, int var2) {
		if (var2 == 3) {
			int var3 = var1.readUnsignedByte();
			if (this.columnTypes == null) {
				this.columnTypes = new Object[var3][];
				this.field5515 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var1.readUnsignedByte();
				int[] var6 = new int[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					var6[var7] = var1.readUShortSmart();
				}

				this.columnTypes[var4] = DevicePcmPlayerProvider.method274(var1, var6);
				this.field5515[var4] = var6;
			}
		} else if (var2 == 4) {
			this.tableId = var1.packBytesToInt();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23683"
	)
	void method10121() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lwj;",
		garbageValue = "-1664421276"
	)
	public static PrivateChatMode method10133(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5724, PrivateChatMode.field5726, PrivateChatMode.field5725};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5727) {
				return var4;
			}
		}

		return null;
	}
}
