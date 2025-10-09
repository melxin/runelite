import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ag")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("aj")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-669181137"
	)
	void method11217(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method11218(var1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "54"
	)
	void method11218(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.types == null) {
				this.types = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];

				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}

				this.types[var5] = var7;
				if (var6) {
					if (this.defaultValues == null) {
						this.defaultValues = new Object[this.types.length][];
					}

					this.defaultValues[var5] = class154.method3933(var1, var7);
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134226478"
	)
	void method11219() {
	}
}
