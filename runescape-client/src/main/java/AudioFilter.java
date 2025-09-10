import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("ap")
	static float[][] field1493;
	@ObfuscatedName("aq")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("ao")
	static float field1496;
	@ObfuscatedName("as")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("al")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("au")
	int[][][] field1499;
	@ObfuscatedName("ai")
	int[][][] field1500;
	@ObfuscatedName("aa")
	int[] field1490;

	static {
		field1493 = new float[2][8];
		coefficients = new int[2][8];
	}

	AudioFilter() {
		this.pairs = new int[2];
		this.field1499 = new int[2][2][4];
		this.field1500 = new int[2][2][4];
		this.field1490 = new int[2];
	}

	@ObfuscatedName("aw")
	float method3433(int var1, int var2, float var3) {
		float var4 = (float)this.field1500[var1][0][var2] + var3 * (float)(this.field1500[var1][1][var2] - this.field1500[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfuscatedName("at")
	float method3434(int var1, int var2, float var3, int var4) {
		float var5 = (float)this.field1499[var1][0][var2] + var3 * (float)(this.field1499[var1][1][var2] - this.field1499[var1][0][var2]);
		var5 *= 1.2207031E-4F;
		return normalize(var5, var4);
	}

	@ObfuscatedName("ac")
	@Export("compute")
	int compute(int var1, float var2, int var3) {
		float var4;
		if (var1 == 0) {
			var4 = (float)this.field1490[0] + (float)(this.field1490[1] - this.field1490[0]) * var2;
			var4 *= 0.0030517578F;
			field1496 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
			forwardMultiplier = (int)(field1496 * 65536.0F);
		}

		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var4 = this.method3433(var1, 0, var2);
			field1493[var1][0] = -2.0F * var4 * (float)Math.cos((double)this.method3434(var1, 0, var2, var3));
			field1493[var1][1] = var4 * var4;

			float[] var10000;
			int var5;
			for (var5 = 1; var5 < this.pairs[var1]; ++var5) {
				var4 = this.method3433(var1, var5, var2);
				float var6 = -2.0F * var4 * (float)Math.cos((double)this.method3434(var1, var5, var2, var3));
				float var7 = var4 * var4;
				field1493[var1][var5 * 2 + 1] = field1493[var1][var5 * 2 - 1] * var7;
				field1493[var1][var5 * 2] = field1493[var1][var5 * 2 - 1] * var6 + field1493[var1][var5 * 2 - 2] * var7;

				for (int var8 = var5 * 2 - 1; var8 >= 2; --var8) {
					var10000 = field1493[var1];
					var10000[var8] += field1493[var1][var8 - 1] * var6 + field1493[var1][var8 - 2] * var7;
				}

				var10000 = field1493[var1];
				var10000[1] += field1493[var1][0] * var6 + var7;
				var10000 = field1493[var1];
				var10000[0] += var6;
			}

			if (var1 == 0) {
				for (var5 = 0; var5 < this.pairs[0] * 2; ++var5) {
					var10000 = field1493[0];
					var10000[var5] *= field1496;
				}
			}

			for (var5 = 0; var5 < this.pairs[var1] * 2; ++var5) {
				coefficients[var1][var5] = (int)(field1493[var1][var5] * 65536.0F);
			}

			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;Ldf;)V"
	)
	final void method3436(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field1490[0] = var1.readUnsignedShort();
			this.field1490[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field1499[var5][0][var6] = var1.readUnsignedShort();
					this.field1500[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field1499[var5][1][var6] = var1.readUnsignedShort();
						this.field1500[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field1499[var5][1][var6] = this.field1499[var5][0][var6];
						this.field1500[var5][1][var6] = this.field1500[var5][0][var6];
					}
				}
			}

			if (var7 != 0 || this.field1490[1] != this.field1490[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field1490;
			this.field1490[1] = 0;
			var4[0] = 0;
		}

	}

	@ObfuscatedName("af")
	@Export("normalize")
	static float normalize(float var0, int var1) {
		float var2 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var2 * 3.1415927F / (float)(var1 / 2);
	}
}
