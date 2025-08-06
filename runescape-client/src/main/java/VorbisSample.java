import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	static class114 field1463;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	static VorbisCodebook[] field1450;
	@ObfuscatedName("ac")
	static int field1438;
	@ObfuscatedName("av")
	static int field1439;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	static VorbisFloor[] field1445;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ldl;"
	)
	static VorbisResidue[] field1447;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	static VorbisMapping[] field1442;
	@ObfuscatedName("ap")
	static boolean[] field1453;
	@ObfuscatedName("am")
	static int[] field1444;
	@ObfuscatedName("aj")
	static boolean field1454;
	@ObfuscatedName("ag")
	static float[] field1440;
	@ObfuscatedName("ay")
	static float[] field1446;
	@ObfuscatedName("aa")
	static float[] field1448;
	@ObfuscatedName("ai")
	static float[] field1449;
	@ObfuscatedName("ak")
	static float[] field1441;
	@ObfuscatedName("ar")
	static float[] field1451;
	@ObfuscatedName("at")
	static int[] field1452;
	@ObfuscatedName("ax")
	static int[] field1436;
	@ObfuscatedName("aq")
	byte[][] field1437;
	@ObfuscatedName("ao")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("az")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("ad")
	@Export("start")
	int start;
	@ObfuscatedName("aw")
	@Export("end")
	int end;
	@ObfuscatedName("af")
	boolean field1459;
	@ObfuscatedName("an")
	float[] field1443;
	@ObfuscatedName("ae")
	int field1461;
	@ObfuscatedName("bj")
	int field1467;
	@ObfuscatedName("bn")
	boolean field1462;
	@ObfuscatedName("bi")
	float[] field1464;
	@ObfuscatedName("bw")
	@Export("samples")
	short[] samples;
	@ObfuscatedName("bo")
	int field1466;
	@ObfuscatedName("be")
	int field1460;

	static {
		field1463 = new class114();
		field1454 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("au")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field1459 = true;
		}

		int var3 = var2.readInt();
		this.field1437 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field1437[var4] = var7;
		}

	}

	@ObfuscatedName("as")
	float[] method3334(int var1) {
		class114 var2 = new class114();
		var2.method3400(this.field1437[var1], 0);
		this.field1464 = new float[field1439];
		var2.method3408();
		int var3 = var2.method3409(class333.iLog(field1444.length - 1));
		boolean var4 = field1453[var3];
		int var5 = var4 ? field1439 : field1438;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method3408() != 0;
			var7 = var2.method3408() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field1438 >> 2);
			var10 = (field1438 >> 2) + (var5 >> 2);
			var11 = field1438 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field1438 >> 2);
			var13 = (field1438 >> 2) + (var5 - (var5 >> 2));
			var14 = field1438 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field1442[field1444[var3]];
		int var16 = var15.field1392;
		int var17 = var15.field1391[var16];
		class113 var18 = field1445[var17].method2987(var2, field1450);
		boolean var19 = !var18.method3385();

		int var20;
		for (var20 = 0; var20 < var15.field1393; ++var20) {
			VorbisResidue var45 = field1447[var15.field1394[var20]];
			float[] var47 = this.field1464;
			var45.method3096(var47, var5 >> 1, var19, var2, field1450);
		}

		if (var18.method3385()) {
			var16 = var15.field1392;
			int var10000 = var15.field1391[var16];
			var18.method3384(this.field1464, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3385()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1464[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1464;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field1449 : field1440;
			float[] var25 = var4 ? field1441 : field1446;
			float[] var26 = var4 ? field1451 : field1448;
			int[] var27 = var4 ? field1436 : field1452;

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

			var28 = class333.iLog(var5 - 1);

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
				var57 = this.field1464;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1464;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1461 > 0) {
			var21 = var5 + this.field1461 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1462) {
				for (var22 = 0; var22 < this.field1467; ++var22) {
					var46 = var22 + (this.field1461 >> 1);
					var44[var22] += this.field1443[var46];
				}
			}

			if (var18.method3385()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1464[var22];
				}
			}
		}

		float[] var56 = this.field1443;
		this.field1443 = this.field1464;
		this.field1464 = var56;
		this.field1461 = var5;
		this.field1467 = var13 - (var5 >> 1);
		this.field1462 = !var18.method3385();
		return var44;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I)Ldg;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field1461 = 0;
				this.field1443 = new float[field1439];
				this.samples = new short[this.sampleCount];
				this.field1466 = 0;
				this.field1460 = 0;
			}

			for (; this.field1460 < this.field1437.length; ++this.field1460) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method3334(this.field1460);
				if (var2 != null) {
					int var3 = this.field1466;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						this.samples[var3++] = (short)class146.method3755(-32768, 32767, (int)(var2[var5] * 32768.0F));
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field1466;
					}

					this.field1466 = var3;
				}
			}

			this.field1443 = null;
			short[] var6 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var6, this.start, this.end, this.field1459, false);
		}
	}

	@ObfuscatedName("al")
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

	@ObfuscatedName("ab")
	static void method3336(byte[] var0) {
		class114 var1 = field1463;
		var1.method3400(var0, 0);
		field1438 = 1 << var1.method3409(4);
		field1439 = 1 << var1.method3409(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field1439 : field1438;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var13 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var13[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var13[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var14 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var14[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var15 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var15[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var15[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var16 = new int[var6];
			int var11 = class333.iLog(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				var16[var12] = Sound.method3856(var12, var11);
			}

			if (var2 != 0) {
				field1449 = var13;
				field1441 = var14;
				field1451 = var15;
				field1436 = var16;
			} else {
				field1440 = var13;
				field1446 = var14;
				field1448 = var15;
				field1452 = var16;
			}
		}

		var2 = var1.method3409(8) + 1;
		field1450 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field1450[var3] = new VorbisCodebook(field1463);
		}

		var3 = var1.method3409(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method3409(16);
		}

		var3 = var1.method3409(6) + 1;
		field1445 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field1445[var4] = new VorbisFloor(field1463);
		}

		var4 = var1.method3409(6) + 1;
		field1447 = new VorbisResidue[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field1447[var5] = new VorbisResidue(field1463);
		}

		var5 = var1.method3409(6) + 1;
		field1442 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field1442[var6] = new VorbisMapping(field1463);
		}

		var6 = var1.method3409(6) + 1;
		field1453 = new boolean[var6];
		field1444 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field1453[var7] = var1.method3408() != 0;
			var1.method3409(16);
			var1.method3409(16);
			field1444[var7] = var1.method3409(8);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpx;)Z"
	)
	static boolean method3341(AbstractArchive var0) {
		if (!field1454) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method3336(var1);
			field1454 = true;
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)Lek;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method3341(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
