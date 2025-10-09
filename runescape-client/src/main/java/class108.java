import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class108 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	class114 field1431;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lev;"
	)
	VorbisCodebook[] field1440;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -281927065
	)
	int field1429;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -304251111
	)
	int field1451;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ldr;"
	)
	VorbisFloor[] field1427;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	VorbisResidue[] field1432;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Les;"
	)
	VorbisMapping[] field1443;
	@ObfuscatedName("aq")
	boolean[] field1434;
	@ObfuscatedName("ac")
	int[] field1435;
	@ObfuscatedName("aa")
	float[] field1436;
	@ObfuscatedName("ap")
	float[] field1437;
	@ObfuscatedName("ad")
	float[] field1438;
	@ObfuscatedName("av")
	float[] field1439;
	@ObfuscatedName("as")
	float[] field1448;
	@ObfuscatedName("ar")
	float[] field1441;
	@ObfuscatedName("az")
	int[] field1442;
	@ObfuscatedName("au")
	int[] field1449;
	@ObfuscatedName("ak")
	byte[][] field1444;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1575194367
	)
	int field1433;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1213634135
	)
	int field1446;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1626940127
	)
	int field1428;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1347407981
	)
	int field1430;
	@ObfuscatedName("ai")
	boolean field1453;
	@ObfuscatedName("am")
	float[] field1450;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 441599165
	)
	int field1445;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -430896017
	)
	int field1452;
	@ObfuscatedName("be")
	boolean field1447;
	@ObfuscatedName("ba")
	float[] field1454;

	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	class108(class114 var1) {
		this.field1431 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	int method3470() {
		return this.field1433;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2016304552"
	)
	int method3446() {
		return this.field1428;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	int method3449() {
		return this.field1430;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "502822611"
	)
	void method3444(Buffer var1) {
		this.field1433 = var1.method11575();
		this.field1446 = var1.method11575();
		this.field1428 = var1.method11575();
		this.field1430 = var1.method11575();
		if (this.field1430 < 0) {
			this.field1430 = ~this.field1430;
			this.field1453 = true;
		}

		int var2 = var1.method11575();
		this.field1444 = new byte[var2][];

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.readUnsignedByte();
				var4 += var5;
			} while(var5 >= 255);

			byte[] var6 = new byte[var4];
			var1.readBytes(var6, 0, var4);
			this.field1444[var3] = var6;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ldi;",
		garbageValue = "1009522985"
	)
	RawSound method3448() {
		this.field1445 = 0;
		this.field1450 = new float[this.field1451];
		short[] var1 = new short[this.field1446];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field1444.length; ++var3) {
			float[] var4 = this.method3443(var3);
			if (var4 != null) {
				int var5 = var4.length;
				if (var5 > this.field1446 - var2) {
					var5 = this.field1446 - var2;
				}

				for (int var6 = 0; var6 < var5; ++var6) {
					var1[var2++] = (short)KeyHandler.method396(-32768, 32767, (int)(var4[var6] * 32768.0F));
				}
			}
		}

		this.field1450 = null;
		return new RawSound(this.field1433, var1, this.field1428, this.field1430, this.field1453, false);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-19"
	)
	float[] method3443(int var1) {
		class114 var2 = new class114();
		var2.method3532(this.field1444[var1], 0);
		this.field1454 = new float[this.field1451];
		var2.method3531();
		int var3 = var2.method3529(class26.iLog(this.field1435.length - 1));
		boolean var4 = this.field1434[var3];
		int var5 = var4 ? this.field1451 : this.field1429;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method3531() != 0;
			var7 = var2.method3531() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (this.field1429 >> 2);
			var10 = (this.field1429 >> 2) + (var5 >> 2);
			var11 = this.field1429 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.field1429 >> 2);
			var13 = (this.field1429 >> 2) + (var5 - (var5 >> 2));
			var14 = this.field1429 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = this.field1443[this.field1435[var3]];
		int var16 = var15.field1414;
		int var17 = var15.field1416[var16];
		class113 var18 = this.field1427[var17].method3131(var2, this.field1440);
		boolean var19 = !var18.method3522();

		int var20;
		for (var20 = 0; var20 < var15.field1415; ++var20) {
			VorbisResidue var45 = this.field1432[var15.field1417[var20]];
			float[] var47 = this.field1454;
			var45.method3225(var47, var5 >> 1, var19, var2, this.field1440);
		}

		if (var18.method3522()) {
			var16 = var15.field1414;
			int var10000 = var15.field1416[var16];
			var18.method3521(this.field1454, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3522()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1454[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1454;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? this.field1439 : this.field1436;
			float[] var25 = var4 ? this.field1448 : this.field1437;
			float[] var26 = var4 ? this.field1441 : this.field1438;
			int[] var27 = var4 ? this.field1449 : this.field1442;

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
				var23[var5 - var28 * 4 - 1] = var31 * var29 - var32 * var30;
				var23[var5 - var28 * 4 - 3] = var32 * var29 + var31 * var30;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var31 + var29;
				var23[var20 + var28 * 4 + 1] = var32 + var30;
				var33 = var43[var20 - 4 - var28 * 4];
				var34 = var43[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - var34 * (var30 - var32);
				var23[var28 * 4 + 1] = var33 * (var30 - var32) + var34 * (var29 - var31);
			}

			var28 = class26.iLog(var5 - 1);

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
						var23[var52 - 1 - var36] = var39 + var37;
						var23[var52 - 3 - var36] = var40 + var38;
						float var41 = var43[var50 * var35];
						float var42 = var43[var50 * var35 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
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
				float var55 = (var33 + var54) * var30 + (var32 - var34) * var31;
				var23[var48 * 2 + var20] = 0.5F * (var55 + var34 + var32);
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F;
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34);
				var23[var20 + var48 * 2 + 1] = (var55 + (var33 - var54)) * 0.5F;
				var23[var5 - 1 - var48 * 2] = 0.5F * (var54 + -var33 + var55);
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var25[var48 * 2] * var23[var48 * 2 + var20] + var23[var48 * 2 + var20 + 1] * var25[var48 * 2 + 1];
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var48 * 2 + var20 + 1] * var25[var48 * 2];
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
				var30 = (float)Math.sin(0.5D * ((0.5D + (double)(var48 - var9)) / (double)var11) * 3.141592653589793D);
				var57 = this.field1454;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(3.141592653589793D * 0.5D * ((0.5D + (double)(var48 - var12)) / (double)var14) + 1.5707963267948966D);
				var57 = this.field1454;
				var57[var48] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1445 > 0) {
			var21 = var5 + this.field1445 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1447) {
				for (var22 = 0; var22 < this.field1452; ++var22) {
					var46 = var22 + (this.field1445 >> 1);
					var44[var22] += this.field1450[var46];
				}
			}

			if (var18.method3522()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1454[var22];
				}
			}
		}

		float[] var56 = this.field1450;
		this.field1450 = this.field1454;
		this.field1454 = var56;
		this.field1445 = var5;
		this.field1452 = var13 - (var5 >> 1);
		this.field1447 = !var18.method3522();
		return var44;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "23"
	)
	void method3461(byte[] var1, int var2) {
		class114 var3 = this.field1431;
		var3.method3532(var1, var2);
		this.field1429 = 1 << var3.method3529(4);
		this.field1451 = 1 << var3.method3529(4);

		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		for (var4 = 0; var4 < 2; ++var4) {
			var5 = var4 != 0 ? this.field1451 : this.field1429;
			var6 = var5 >> 1;
			var7 = var5 >> 2;
			var8 = var5 >> 3;
			float[] var21 = new float[var6];

			for (int var10 = 0; var10 < var7; ++var10) {
				var21[var10 * 2] = (float)Math.cos((double)(var10 * 4) * 3.141592653589793D / (double)var5);
				var21[var10 * 2 + 1] = -((float)Math.sin(3.141592653589793D * (double)(var10 * 4) / (double)var5));
			}

			float[] var22 = new float[var6];

			for (int var11 = 0; var11 < var7; ++var11) {
				var22[var11 * 2] = (float)Math.cos(3.141592653589793D * (double)(var11 * 2 + 1) / (double)(var5 * 2));
				var22[var11 * 2 + 1] = (float)Math.sin((double)(var11 * 2 + 1) * 3.141592653589793D / (double)(var5 * 2));
			}

			float[] var23 = new float[var7];

			for (int var12 = 0; var12 < var8; ++var12) {
				var23[var12 * 2] = (float)Math.cos((double)(var12 * 4 + 2) * 3.141592653589793D / (double)var5);
				var23[var12 * 2 + 1] = -((float)Math.sin((double)(var12 * 4 + 2) * 3.141592653589793D / (double)var5));
			}

			int[] var24 = new int[var8];
			int var13 = class26.iLog(var8 - 1);

			for (int var14 = 0; var14 < var8; ++var14) {
				int var18 = var14;
				int var19 = var13;

				int var20;
				for (var20 = 0; var19 > 0; --var19) {
					var20 = var20 << 1 | var18 & 1;
					var18 >>>= 1;
				}

				var24[var14] = var20;
			}

			if (var4 != 0) {
				this.field1439 = var21;
				this.field1448 = var22;
				this.field1441 = var23;
				this.field1449 = var24;
			} else {
				this.field1436 = var21;
				this.field1437 = var22;
				this.field1438 = var23;
				this.field1442 = var24;
			}
		}

		var4 = var3.method3529(8) + 1;
		this.field1440 = new VorbisCodebook[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			this.field1440[var5] = new VorbisCodebook(var3);
		}

		var5 = var3.method3529(6) + 1;

		for (var6 = 0; var6 < var5; ++var6) {
			var3.method3529(16);
		}

		var5 = var3.method3529(6) + 1;
		this.field1427 = new VorbisFloor[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			this.field1427[var6] = new VorbisFloor(var3);
		}

		var6 = var3.method3529(6) + 1;
		this.field1432 = new VorbisResidue[var6];

		for (var7 = 0; var7 < var6; ++var7) {
			this.field1432[var7] = new VorbisResidue(var3);
		}

		var7 = var3.method3529(6) + 1;
		this.field1443 = new VorbisMapping[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field1443[var8] = new VorbisMapping(var3);
		}

		var8 = var3.method3529(6) + 1;
		this.field1434 = new boolean[var8];
		this.field1435 = new int[var8];

		for (int var9 = 0; var9 < var8; ++var9) {
			this.field1434[var9] = var3.method3531() != 0;
			var3.method3529(16);
			var3.method3529(16);
			this.field1435[var9] = var3.method3529(8);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)F",
		garbageValue = "1494968104"
	)
	static final float method3469(float var0, float var1, float var2, float var3) {
		return var3 * var1 + var0 * var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "1568389174"
	)
	public static void method3468(ArrayList var0, int var1, int var2, int var3, int var4) {
		class338.field3891.clear();
		class338.field3891.addAll(var0);
		class338.musicPlayerStatus = var1;
		class338.field3899 = var2;
		class338.field3896 = var3;
		class338.field3901 = var4;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1363897036"
	)
	static int method3467(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			NPCComposition var6 = class81.getNpcDefinition(var5);
			Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = class81.getNpcDefinition(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.method4393(var4);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.method4395(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class81.getNpcDefinition(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)Lok;",
		garbageValue = "0"
	)
	static Widget method3454(Widget var0) {
		int var2 = MouseRecorder.method2181(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = class35.widgetDefinition.method7496(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
