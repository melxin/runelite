import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	public static AbstractArchive field5408;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("az")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("ao")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "215413861"
	)
	void method10151(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method10152(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "14"
	)
	void method10152(Buffer var1, int var2) {
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

					Object[][] var17 = this.defaultValues;
					int var11 = var1.readUShortSmart();
					Object[] var12 = new Object[var7.length * var11];

					for (int var13 = 0; var13 < var11; ++var13) {
						for (int var14 = 0; var14 < var7.length; ++var14) {
							int var15 = var14 + var7.length * var13;
							class544 var16 = EnumComposition.method5280(var7[var14]);
							var12[var15] = var16.method10123(var1);
						}
					}

					var17[var5] = var12;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	void method10159() {
	}
}
