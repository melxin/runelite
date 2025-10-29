import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("av")
	int field1393;
	@ObfuscatedName("at")
	@Export("entries")
	int entries;
	@ObfuscatedName("ag")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("an")
	int[] field1392;
	@ObfuscatedName("ae")
	float[][] field1396;
	@ObfuscatedName("aj")
	@Export("keys")
	int[] keys;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	VorbisCodebook(class114 var1) {
		var1.method3588(24);
		this.field1393 = var1.method3588(16);
		this.entries = var1.method3588(24);
		this.lengthMap = new int[this.entries];
		boolean var2 = var1.method3586() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method3588(5) + 1; var3 < this.entries; ++var4) {
				int var5 = var1.method3588(class39.iLog(this.entries - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.lengthMap[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method3586() != 0;

			for (var4 = 0; var4 < this.entries; ++var4) {
				if (var15 && var1.method3586() == 0) {
					this.lengthMap[var4] = 0;
				} else {
					this.lengthMap[var4] = var1.method3588(5) + 1;
				}
			}
		}

		this.method3460();
		var3 = var1.method3588(4);
		if (var3 > 0) {
			float var16 = VorbisSample.float32Unpack(var1.method3588(32));
			float var17 = VorbisSample.float32Unpack(var1.method3588(32));
			var6 = var1.method3588(4) + 1;
			boolean var7 = var1.method3586() != 0;
			int var8;
			if (var3 == 1) {
				var8 = mapType1QuantValues(this.entries, this.field1393);
			} else {
				var8 = this.entries * this.field1393;
			}

			this.field1392 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field1392[var9] = var1.method3588(var6);
			}

			this.field1396 = new float[this.entries][this.field1393];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.entries; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field1393; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field1392[var13] * var17 + var16 + var10;
						this.field1396[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (var9 = 0; var9 < this.entries; ++var9) {
					var10 = 0.0F;
					var11 = var9 * this.field1393;

					for (var12 = 0; var12 < this.field1393; ++var12) {
						float var18 = (float)this.field1392[var11] * var17 + var16 + var10;
						this.field1396[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	void method3460() {
		int[] var1 = new int[this.entries];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) {
			var4 = this.lengthMap[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var12;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var12 = var2[var8];
						if (var12 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var12 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var12 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var12 = var2[var8];
					if (var12 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.entries; ++var3) {
			var4 = this.lengthMap[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.keys[var6] == 0) {
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6];
					} else {
						++var6;
					}

					if (var6 >= this.keys.length) {
						int[] var9 = new int[this.keys.length * 2];

						for (var10 = 0; var10 < this.keys.length; ++var10) {
							var9[var10] = this.keys[var10];
						}

						this.keys = var9;
					}

					var8 >>>= 1;
				}

				this.keys[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lem;)I"
	)
	int method3461(class114 var1) {
		int var2;
		for (var2 = 0; this.keys[var2] >= 0; var2 = var1.method3586() != 0 ? this.keys[var2] : var2 + 1) {
		}

		return ~this.keys[var2];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lem;)[F"
	)
	float[] method3462(class114 var1) {
		return this.field1396[this.method3461(var1)];
	}

	@ObfuscatedName("av")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class237.method5213(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
