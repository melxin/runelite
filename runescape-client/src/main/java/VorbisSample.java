import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static class115 field1465;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	static VorbisCodebook[] field1457;
	@ObfuscatedName("at")
	static int field1458;
	@ObfuscatedName("ac")
	static int field1459;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	static VorbisFloor[] field1460;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	static VorbisResidue[] field1479;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	static VorbisMapping[] field1462;
	@ObfuscatedName("as")
	static boolean[] field1463;
	@ObfuscatedName("al")
	static int[] field1477;
	@ObfuscatedName("au")
	static boolean field1461;
	@ObfuscatedName("ai")
	static float[] field1466;
	@ObfuscatedName("aa")
	static float[] field1467;
	@ObfuscatedName("am")
	static float[] field1468;
	@ObfuscatedName("an")
	static float[] field1469;
	@ObfuscatedName("ar")
	static float[] field1470;
	@ObfuscatedName("ae")
	static float[] field1471;
	@ObfuscatedName("ay")
	static int[] field1472;
	@ObfuscatedName("ad")
	static int[] field1473;
	@ObfuscatedName("ag")
	byte[][] field1474;
	@ObfuscatedName("av")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("ah")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("ab")
	@Export("start")
	int start;
	@ObfuscatedName("ax")
	@Export("end")
	int end;
	@ObfuscatedName("ak")
	boolean field1464;
	@ObfuscatedName("aj")
	float[] field1480;
	@ObfuscatedName("az")
	int field1476;
	@ObfuscatedName("bt")
	int field1482;
	@ObfuscatedName("bs")
	boolean field1483;
	@ObfuscatedName("bu")
	float[] field1456;
	@ObfuscatedName("bi")
	@Export("samples")
	short[] samples;
	@ObfuscatedName("bd")
	int field1484;
	@ObfuscatedName("ba")
	int field1481;

	static {
		field1465 = new class115();
		field1461 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("ap")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.method1958();
		this.sampleCount = var2.method1958();
		this.start = var2.method1958();
		this.end = var2.method1958();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field1464 = true;
		}

		int var3 = var2.method1958();
		this.field1474 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field1474[var4] = var7;
		}

	}

	@ObfuscatedName("aq")
	float[] method3410(int var1) {
		class115 var2 = new class115();
		var2.method3462(this.field1474[var1], 0);
		this.field1456 = new float[field1459];
		var2.method3465();
		int var3 = var2.method3467(AbstractSocket.iLog(field1477.length - 1));
		boolean var4 = field1463[var3];
		int var5 = var4 ? field1459 : field1458;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method3465() != 0;
			var7 = var2.method3465() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1458 >> 2);
			var10 = (field1458 >> 2) + (var5 >> 2);
			var11 = field1458 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1458 >> 2);
			var13 = (field1458 >> 2) + (var5 - (var5 >> 2));
			var14 = field1458 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field1462[field1477[var3]];
		int var16 = var15.field1415;
		int var17 = var15.field1416[var16];
		class114 var18 = field1460[var17].method3042(var2, field1457);
		boolean var19 = !var18.method3453();

		int var20;
		for (var20 = 0; var20 < var15.field1417; ++var20) {
			VorbisResidue var45 = field1479[var15.field1414[var20]];
			float[] var47 = this.field1456;
			var45.method3146(var47, var5 >> 1, var19, var2, field1457);
		}

		if (var18.method3453()) {
			var16 = var15.field1415;
			int var10000 = var15.field1416[var16];
			var18.method3451(this.field1456, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3453()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1456[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1456;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field1469 : field1466;
			float[] var25 = var4 ? field1470 : field1467;
			float[] var26 = var4 ? field1471 : field1468;
			int[] var27 = var4 ? field1473 : field1472;

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

			var28 = AbstractSocket.iLog(var5 - 1);

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
				var57 = this.field1456;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1456;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1476 > 0) {
			var21 = var5 + this.field1476 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1483) {
				for (var22 = 0; var22 < this.field1482; ++var22) {
					var46 = var22 + (this.field1476 >> 1);
					var44[var22] += this.field1480[var46];
				}
			}

			if (var18.method3453()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1456[var22];
				}
			}
		}

		float[] var56 = this.field1480;
		this.field1480 = this.field1456;
		this.field1456 = var56;
		this.field1476 = var5;
		this.field1482 = var13 - (var5 >> 1);
		this.field1483 = !var18.method3453();
		return var44;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I)Ldv;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field1476 = 0;
				this.field1480 = new float[field1459];
				this.samples = new short[this.sampleCount];
				this.field1484 = 0;
				this.field1481 = 0;
			}

			for (; this.field1481 < this.field1474.length; ++this.field1481) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method3410(this.field1481);
				if (var2 != null) {
					int var3 = this.field1484;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						this.samples[var3++] = (short)WorldEntity.method10135(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1484;
					}

					this.field1484 = var3;
				}
			}

			this.field1480 = null;
			short[] var6 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var6, this.start, this.end, this.field1464, false);
		}
	}

	@ObfuscatedName("af")
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

	@ObfuscatedName("aw")
	static void method3402(byte[] var0) {
		class115 var1 = field1465;
		var1.method3462(var0, 0);
		field1458 = 1 << var1.method3467(4);
		field1459 = 1 << var1.method3467(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1459 : field1458;
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
			int var11 = AbstractSocket.iLog(var6 - 1);

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
				field1469 = var19;
				field1470 = var20;
				field1471 = var21;
				field1473 = var22;
			} else {
				field1466 = var19;
				field1467 = var20;
				field1468 = var21;
				field1472 = var22;
			}
		}

		var2 = var1.method3467(8) + 1;
		field1457 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field1457[var3] = new VorbisCodebook(field1465);
		}

		var3 = var1.method3467(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method3467(16);
		}

		var3 = var1.method3467(6) + 1;
		field1460 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field1460[var4] = new VorbisFloor(field1465);
		}

		var4 = var1.method3467(6) + 1;
		field1479 = new VorbisResidue[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field1479[var5] = new VorbisResidue(field1465);
		}

		var5 = var1.method3467(6) + 1;
		field1462 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field1462[var6] = new VorbisMapping(field1465);
		}

		var6 = var1.method3467(6) + 1;
		field1463 = new boolean[var6];
		field1477 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field1463[var7] = var1.method3465() != 0;
			var1.method3467(16);
			var1.method3467(16);
			field1477[var7] = var1.method3467(8);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpx;)Z"
	)
	static boolean method3403(AbstractArchive var0) {
		if (!field1461) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method3402(var1);
			field1461 = true;
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Leo;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method3403(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
