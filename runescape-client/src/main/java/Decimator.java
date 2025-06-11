import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -364807419
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -545473125
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ac")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = WorldMapScaleHandler.method6761(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = 6.0D + (double)var4 / (double)var1;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
					var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([SI)[S",
		garbageValue = "-1201159595"
	)
	@Export("resample")
	short[] resample(short[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				short var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var8[var9] * var7 >> 2;
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new short[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 8192 >> 14;
				if (var10 < -32768) {
					var1[var6] = -32768;
				} else if (var10 > 32767) {
					var1[var6] = 32767;
				} else {
					var1[var6] = (short)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-119"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2018286690"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}
}
