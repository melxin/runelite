import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vm")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	public static AbstractArchive field5405;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1869409605
	)
	public static int field5406;
	@ObfuscatedName("at")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("ae")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-2021165702"
	)
	void method9992(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method9980(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-850202518"
	)
	void method9980(Buffer var1, int var2) {
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

					this.defaultValues[var5] = LoginScreenAnimation.method2740(var1, var7);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1278325333"
	)
	void method9982() {
	}
}
