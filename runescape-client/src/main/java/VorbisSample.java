import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	static class114 field1460;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lee;"
	)
	static VorbisCodebook[] field1431;
	@ObfuscatedName("ag")
	static int field1432;
	@ObfuscatedName("an")
	static int field1433;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ldu;"
	)
	static VorbisFloor[] field1434;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	static VorbisResidue[] field1435;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	static VorbisMapping[] field1455;
	@ObfuscatedName("aw")
	static boolean[] field1437;
	@ObfuscatedName("ap")
	static int[] field1438;
	@ObfuscatedName("ay")
	static boolean field1452;
	@ObfuscatedName("au")
	static float[] field1440;
	@ObfuscatedName("az")
	static float[] field1449;
	@ObfuscatedName("ad")
	static float[] field1442;
	@ObfuscatedName("ai")
	static float[] field1443;
	@ObfuscatedName("as")
	static float[] field1444;
	@ObfuscatedName("ac")
	static float[] field1445;
	@ObfuscatedName("ab")
	static int[] field1446;
	@ObfuscatedName("ax")
	static int[] field1447;
	@ObfuscatedName("ar")
	byte[][] field1454;
	@ObfuscatedName("ah")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("al")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("af")
	@Export("start")
	int start;
	@ObfuscatedName("am")
	@Export("end")
	int end;
	@ObfuscatedName("ao")
	boolean field1453;
	@ObfuscatedName("aa")
	float[] field1441;
	@ObfuscatedName("aq")
	int field1448;
	@ObfuscatedName("be")
	int field1456;
	@ObfuscatedName("bo")
	boolean field1436;
	@ObfuscatedName("bg")
	float[] field1458;
	@ObfuscatedName("bs")
	@Export("samples")
	short[] samples;
	@ObfuscatedName("bz")
	int field1439;
	@ObfuscatedName("bk")
	int field1461;

	static {
		field1460 = new class114();
		field1452 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("ae")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field1453 = true;
		}

		int var3 = var2.readInt();
		this.field1454 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field1454[var4] = var7;
		}

	}

	@ObfuscatedName("aj")
	float[] method3527(int var1) {
		class114 var2 = new class114();
		var2.method3590(this.field1454[var1], 0);
		this.field1458 = new float[field1433];
		var2.method3586();
		int var3 = var2.method3588(class39.iLog(field1438.length - 1));
		boolean var4 = field1437[var3];
		int var5 = var4 ? field1433 : field1432;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method3586() != 0;
			var7 = var2.method3586() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1432 >> 2);
			var10 = (field1432 >> 2) + (var5 >> 2);
			var11 = field1432 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1432 >> 2);
			var13 = (field1432 >> 2) + (var5 - (var5 >> 2));
			var14 = field1432 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field1455[field1438[var3]];
		int var16 = var15.field1390;
		int var17 = var15.field1388[var16];
		class113 var18 = field1434[var17].method3145(var2, field1431);
		boolean var19 = !var18.method3575();

		int var20;
		for (var20 = 0; var20 < var15.field1389; ++var20) {
			VorbisResidue var45 = field1435[var15.field1391[var20]];
			float[] var47 = this.field1458;
			var45.method3256(var47, var5 >> 1, var19, var2, field1431);
		}

		if (var18.method3575()) {
			var16 = var15.field1390;
			int var10000 = var15.field1388[var16];
			var18.method3579(this.field1458, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3575()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1458[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1458;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field1443 : field1440;
			float[] var25 = var4 ? field1444 : field1449;
			float[] var26 = var4 ? field1445 : field1442;
			int[] var27 = var4 ? field1447 : field1446;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var21; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var43[var28 * 2];
				var32 = var43[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var29 + var31;
				var23[var20 + var28 * 4 + 1] = var30 + var32;
				var33 = var43[var20 - 4 - var28 * 4];
				var34 = var43[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = class39.iLog(var5 - 1);

			int var48;
			int var49;
			int var50;
			int var51;
			for (var48 = 0; var48 < var28 - 3; ++var48) {
				var49 = var5 >> var48 + 2;
				var50 = 8 << var48;

				for (var51 = 0; var51 < 2 << var48; ++var51) {
					int var52 = var5 - var49 * var51 * 2;
					int var53 = var5 - var49 * (var51 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var48 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var52 - 1 - var36];
						float var38 = var23[var52 - 3 - var36];
						float var39 = var23[var53 - 1 - var36];
						float var40 = var23[var53 - 3 - var36];
						var23[var52 - 1 - var36] = var37 + var39;
						var23[var52 - 3 - var36] = var38 + var40;
						float var41 = var43[var35 * var50];
						float var42 = var43[var35 * var50 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var48 = 1; var48 < var22 - 1; ++var48) {
				var49 = var27[var48];
				if (var48 < var49) {
					var50 = var48 * 8;
					var51 = var49 * 8;
					var33 = var23[var50 + 1];
					var23[var50 + 1] = var23[var51 + 1];
					var23[var51 + 1] = var33;
					var33 = var23[var50 + 3];
					var23[var50 + 3] = var23[var51 + 3];
					var23[var51 + 3] = var33;
					var33 = var23[var50 + 5];
					var23[var50 + 5] = var23[var51 + 5];
					var23[var51 + 5] = var33;
					var33 = var23[var50 + 7];
					var23[var50 + 7] = var23[var51 + 7];
					var23[var51 + 7] = var33;
				}
			}

			for (var48 = 0; var48 < var20; ++var48) {
				var23[var48] = var23[var48 * 2 + 1];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var23[var5 - 1 - var48 * 2] = var23[var48 * 4];
				var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1];
				var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2];
				var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var30 = var26[var48 * 2];
				var31 = var26[var48 * 2 + 1];
				var32 = var23[var20 + var48 * 2];
				var33 = var23[var20 + var48 * 2 + 1];
				var34 = var23[var5 - 2 - var48 * 2];
				float var54 = var23[var5 - 1 - var48 * 2];
				float var55 = var31 * (var32 - var34) + var30 * (var33 + var54);
				var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F;
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F;
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34);
				var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F;
				var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F;
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1];
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var20 + var48] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field1458;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1458;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1448 > 0) {
			var21 = var5 + this.field1448 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1436) {
				for (var22 = 0; var22 < this.field1456; ++var22) {
					var46 = var22 + (this.field1448 >> 1);
					var44[var22] += this.field1441[var46];
				}
			}

			if (var18.method3575()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1458[var22];
				}
			}
		}

		float[] var56 = this.field1441;
		this.field1441 = this.field1458;
		this.field1458 = var56;
		this.field1448 = var5;
		this.field1456 = var13 - (var5 >> 1);
		this.field1436 = !var18.method3575();
		return var44;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I)Ldq;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field1448 = 0;
				this.field1441 = new float[field1433];
				this.samples = new short[this.sampleCount];
				this.field1439 = 0;
				this.field1461 = 0;
			}

			for (; this.field1461 < this.field1454.length; ++this.field1461) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method3527(this.field1461);
				if (var2 != null) {
					int var3 = this.field1439;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						this.samples[var3++] = (short)class470.method9686(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1439;
					}

					this.field1439 = var3;
				}
			}

			this.field1441 = null;
			short[] var6 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var6, this.start, this.end, this.field1453, false);
		}
	}

	@ObfuscatedName("av")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfuscatedName("at")
	static void method3525(byte[] var0) {
		class114 var1 = field1460;
		var1.method3590(var0, 0);
		field1432 = 1 << var1.method3588(4);
		field1433 = 1 << var1.method3588(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1433 : field1432;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var19 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var19[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var19[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var20 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var21 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var22 = new int[var6];
			int var11 = class39.iLog(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				int var16 = var12;
				int var17 = var11;

				int var18;
				for (var18 = 0; var17 > 0; --var17) {
					var18 = var18 << 1 | var16 & 1;
					var16 >>>= 1;
				}

				var22[var12] = var18;
			}

			if (var2 != 0) {
				field1443 = var19;
				field1444 = var20;
				field1445 = var21;
				field1447 = var22;
			} else {
				field1440 = var19;
				field1449 = var20;
				field1442 = var21;
				field1446 = var22;
			}
		}

		var2 = var1.method3588(8) + 1;
		field1431 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field1431[var3] = new VorbisCodebook(field1460);
		}

		var3 = var1.method3588(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method3588(16);
		}

		var3 = var1.method3588(6) + 1;
		field1434 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field1434[var4] = new VorbisFloor(field1460);
		}

		var4 = var1.method3588(6) + 1;
		field1435 = new VorbisResidue[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field1435[var5] = new VorbisResidue(field1460);
		}

		var5 = var1.method3588(6) + 1;
		field1455 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field1455[var6] = new VorbisMapping(field1460);
		}

		var6 = var1.method3588(6) + 1;
		field1437 = new boolean[var6];
		field1438 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field1437[var7] = var1.method3586() != 0;
			var1.method3588(16);
			var1.method3588(16);
			field1438[var7] = var1.method3588(8);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqm;)Z"
	)
	static boolean method3526(AbstractArchive var0) {
		if (!field1452) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method3525(var1);
			field1452 = true;
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqm;II)Ler;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method3526(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
