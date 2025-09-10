import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("VorbisResidue")
public class VorbisResidue {
	@ObfuscatedName("af")
	@Export("residueType")
	int residueType;
	@ObfuscatedName("aw")
	@Export("begin")
	int begin;
	@ObfuscatedName("at")
	@Export("end")
	int end;
	@ObfuscatedName("ac")
	@Export("partitionSize")
	int partitionSize;
	@ObfuscatedName("ap")
	@Export("classifications")
	int classifications;
	@ObfuscatedName("aq")
	@Export("classbook")
	int classbook;
	@ObfuscatedName("ao")
	@Export("cascade")
	int[] cascade;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	VorbisResidue(class115 var1) {
		this.residueType = var1.method3467(16);
		this.begin = var1.method3467(24);
		this.end = var1.method3467(24);
		this.partitionSize = var1.method3467(24) + 1;
		this.classifications = var1.method3467(6) + 1;
		this.classbook = var1.method3467(8);
		int[] var2 = new int[this.classifications];

		int var3;
		for (var3 = 0; var3 < this.classifications; ++var3) {
			int var4 = 0;
			int var5 = var1.method3467(3);
			boolean var6 = var1.method3465() != 0;
			if (var6) {
				var4 = var1.method3467(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.cascade = new int[this.classifications * 8];

		for (var3 = 0; var3 < this.classifications * 8; ++var3) {
			this.cascade[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method3467(8) : -1;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([FIZLed;[Leb;)V"
	)
	void method3146(float[] var1, int var2, boolean var3, class115 var4, VorbisCodebook[] var5) {
		int var6;
		for (var6 = 0; var6 < var2; ++var6) {
			var1[var6] = 0.0F;
		}

		if (!var3) {
			var6 = var5[this.classbook].field1418;
			int var7 = this.end - this.begin;
			int var8 = var7 / this.partitionSize;
			int[] var9 = new int[var8];

			for (int var10 = 0; var10 < 8; ++var10) {
				int var11 = 0;

				while (var11 < var8) {
					int var12;
					int var13;
					if (var10 == 0) {
						var12 = var5[this.classbook].method3359(var4);

						for (var13 = var6 - 1; var13 >= 0; --var13) {
							if (var11 + var13 < var8) {
								var9[var11 + var13] = var12 % this.classifications;
							}

							var12 /= this.classifications;
						}
					}

					for (var12 = 0; var12 < var6; ++var12) {
						var13 = var9[var11];
						int var14 = this.cascade[var10 + var13 * 8];
						if (var14 >= 0) {
							int var15 = var11 * this.partitionSize + this.begin;
							VorbisCodebook var16 = var5[var14];
							int var17;
							if (this.residueType == 0) {
								var17 = this.partitionSize / var16.field1418;

								for (int var21 = 0; var21 < var17; ++var21) {
									float[] var22 = var16.method3363(var4);

									for (int var20 = 0; var20 < var16.field1418; ++var20) {
										var1[var15 + var21 + var20 * var17] += var22[var20];
									}
								}
							} else {
								var17 = 0;

								while (var17 < this.partitionSize) {
									float[] var18 = var16.method3363(var4);

									for (int var19 = 0; var19 < var16.field1418; ++var19) {
										var1[var15 + var17] += var18[var19];
										++var17;
									}
								}
							}
						}

						++var11;
						if (var11 >= var8) {
							break;
						}
					}
				}
			}

		}
	}
}
