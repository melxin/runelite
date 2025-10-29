import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("ae")
	static float[][] field1472;
	@ObfuscatedName("aj")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("ak")
	static float field1469;
	@ObfuscatedName("aw")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("ap")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("ay")
	int[][][] field1473;
	@ObfuscatedName("au")
	int[][][] field1470;
	@ObfuscatedName("az")
	int[] field1475;

	static {
		field1472 = new float[2][8];
		coefficients = new int[2][8];
	}

	AudioFilter() {
		this.pairs = new int[2];
		this.field1473 = new int[2][2][4];
		this.field1470 = new int[2][2][4];
		this.field1475 = new int[2];
	}

	@ObfuscatedName("at")
	float method3571(int var1, int var2, float var3) {
		float var4 = (float)this.field1470[var1][0][var2] + var3 * (float)(this.field1470[var1][1][var2] - this.field1470[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfuscatedName("ag")
	float method3559(int var1, int var2, float var3, int var4) {
		float var5 = (float)this.field1473[var1][0][var2] + var3 * (float)(this.field1473[var1][1][var2] - this.field1473[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return normalize(var5, var4);
	}

	@ObfuscatedName("an")
	@Export("compute")
	int compute(int var1, float var2, int var3) {
		float var4;
		if (var1 == 0) {
			var4 = (float)this.field1475[0] + (float)(this.field1475[1] - this.field1475[0]) * var2;
			var4 *= 0.0030517578F;
			field1469 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
			forwardMultiplier = (int)(field1469 * 65536.0F);
		}

		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var4 = this.method3571(var1, 0, var2);
			field1472[var1][0] = -2.0F * var4 * (float)Math.cos((double)this.method3559(var1, 0, var2, var3));
			field1472[var1][1] = var4 * var4;

			float[] var10000;
			int var5;
			for (var5 = 1; var5 < this.pairs[var1]; ++var5) {
				var4 = this.method3571(var1, var5, var2);
				float var6 = -2.0F * var4 * (float)Math.cos((double)this.method3559(var1, var5, var2, var3));
				float var7 = var4 * var4;
				field1472[var1][var5 * 2 + 1] = field1472[var1][var5 * 2 - 1] * var7;
				field1472[var1][var5 * 2] = field1472[var1][var5 * 2 - 1] * var6 + field1472[var1][var5 * 2 - 2] * var7;

				for (int var8 = var5 * 2 - 1; var8 >= 2; --var8) {
					var10000 = field1472[var1];
					var10000[var8] += field1472[var1][var8 - 1] * var6 + field1472[var1][var8 - 2] * var7;
				}

				var10000 = field1472[var1];
				var10000[1] += field1472[var1][0] * var6 + var7;
				var10000 = field1472[var1];
				var10000[0] += var6;
			}

			if (var1 == 0) {
				for (var5 = 0; var5 < this.pairs[0] * 2; ++var5) {
					var10000 = field1472[0];
					var10000[var5] *= field1469;
				}
			}

			for (var5 = 0; var5 < this.pairs[var1] * 2; ++var5) {
				coefficients[var1][var5] = (int)(field1472[var1][var5] * 65536.0F);
			}

			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Ldp;)V"
	)
	final void method3558(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field1475[0] = var1.readUnsignedShort();
			this.field1475[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field1473[var5][0][var6] = var1.readUnsignedShort();
					this.field1470[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field1473[var5][1][var6] = var1.readUnsignedShort();
						this.field1470[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field1473[var5][1][var6] = this.field1473[var5][0][var6];
						this.field1470[var5][1][var6] = this.field1470[var5][0][var6];
					}
				}
			}

			if (var7 != 0 || this.field1475[1] != this.field1475[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field1475;
			this.field1475[1] = 0;
			var4[0] = 0;
		}

	}

	@ObfuscatedName("av")
	@Export("normalize")
	static float normalize(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var2 * 3.1415927F / (float)(var1 / 2);
	}
}
