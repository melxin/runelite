import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class109 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	class115 field1441;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	VorbisCodebook[] field1439;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 84094287
	)
	int field1431;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 72714721
	)
	int field1429;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	VorbisFloor[] field1449;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	VorbisResidue[] field1433;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	VorbisMapping[] field1436;
	@ObfuscatedName("as")
	boolean[] field1435;
	@ObfuscatedName("al")
	int[] field1428;
	@ObfuscatedName("au")
	float[] field1437;
	@ObfuscatedName("ai")
	float[] field1438;
	@ObfuscatedName("aa")
	float[] field1430;
	@ObfuscatedName("am")
	float[] field1440;
	@ObfuscatedName("an")
	float[] field1453;
	@ObfuscatedName("ar")
	float[] field1442;
	@ObfuscatedName("ae")
	int[] field1443;
	@ObfuscatedName("ay")
	int[] field1444;
	@ObfuscatedName("ad")
	byte[][] field1445;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1426928041
	)
	int field1446;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -785509149
	)
	int field1447;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1649696133
	)
	int field1448;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1873419929
	)
	int field1454;
	@ObfuscatedName("ax")
	boolean field1450;
	@ObfuscatedName("ak")
	float[] field1451;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 59916551
	)
	int field1432;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -602706717
	)
	int field1434;
	@ObfuscatedName("bt")
	boolean field1452;
	@ObfuscatedName("bs")
	float[] field1455;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class109(class115 var1) {
		this.field1441 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1070872547"
	)
	void method3395(Buffer var1) {
		this.field1446 = var1.method1958();
		this.field1447 = var1.method1958();
		this.field1448 = var1.method1958();
		this.field1454 = var1.method1958();
		if (this.field1454 < 0) {
			this.field1454 = ~this.field1454;
			this.field1450 = true;
		}

		int var2 = var1.method1958();
		this.field1445 = new byte[var2][];

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.readUnsignedByte();
				var4 += var5;
			} while(var5 >= 255);

			byte[] var6 = new byte[var4];
			var1.readBytes(var6, 0, var4);
			this.field1445[var3] = var6;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ldv;",
		garbageValue = "316104051"
	)
	RawSound method3394() {
		this.field1432 = 0;
		this.field1451 = new float[this.field1429];
		short[] var1 = new short[this.field1447];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field1445.length; ++var3) {
			float[] var4 = this.method3393(var3);
			if (var4 != null) {
				int var5 = var4.length;
				if (var5 > this.field1447 - var2) {
					var5 = this.field1447 - var2;
				}

				for (int var6 = 0; var6 < var5; ++var6) {
					var1[var2++] = (short)WorldEntity.method10135(-32768, 32767, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.field1451 = null;
		return new RawSound(this.field1446, var1, this.field1448, this.field1454, this.field1450, false);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1132040972"
	)
	float[] method3393(int var1) {
		class115 var2 = new class115();
		var2.method3462(this.field1445[var1], 0);
		this.field1455 = new float[this.field1429];
		var2.method3465();
		int var3 = var2.method3467(AbstractSocket.iLog(this.field1428.length - 1));
		boolean var4 = this.field1435[var3];
		int var5 = var4 ? this.field1429 : this.field1431;
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
			var9 = (var5 >> 2) - (this.field1431 >> 2);
			var10 = (this.field1431 >> 2) + (var5 >> 2);
			var11 = this.field1431 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.field1431 >> 2);
			var13 = (this.field1431 >> 2) + (var5 - (var5 >> 2));
			var14 = this.field1431 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = this.field1436[this.field1428[var3]];
		int var16 = var15.field1415;
		int var17 = var15.field1416[var16];
		class114 var18 = this.field1449[var17].method3042(var2, this.field1439);
		boolean var19 = !var18.method3453();

		int var20;
		for (var20 = 0; var20 < var15.field1417; ++var20) {
			VorbisResidue var45 = this.field1433[var15.field1414[var20]];
			float[] var47 = this.field1455;
			var45.method3146(var47, var5 >> 1, var19, var2, this.field1439);
		}

		if (var18.method3453()) {
			var16 = var15.field1415;
			int var10000 = var15.field1416[var16];
			var18.method3451(this.field1455, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3453()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1455[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1455;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? this.field1440 : this.field1437;
			float[] var25 = var4 ? this.field1453 : this.field1438;
			float[] var26 = var4 ? this.field1442 : this.field1430;
			int[] var27 = var4 ? this.field1444 : this.field1443;

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
				var23[var5 - var28 * 4 - 1] = var31 * var29 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var31 * var30;
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
				var23[var28 * 4 + 3] = var33 * (var29 - var31) - (var30 - var32) * var34;
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
						var23[var52 - 3 - var36] = var40 + var38;
						float var41 = var43[var50 * var35];
						float var42 = var43[var50 * var35 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var53 - 3 - var36] = var42 * (var37 - var39) + (var38 - var40) * var41;
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
				var32 = var23[var48 * 2 + var20];
				var33 = var23[var20 + var48 * 2 + 1];
				var34 = var23[var5 - 2 - var48 * 2];
				float var54 = var23[var5 - 1 - var48 * 2];
				float var55 = (var32 - var34) * var31 + (var33 + var54) * var30;
				var23[var20 + var48 * 2] = (var34 + var32 + var55) * 0.5F;
				var23[var5 - 2 - var48 * 2] = 0.5F * (var34 + var32 - var55);
				var55 = var31 * (var54 + var33) - (var32 - var34) * var30;
				var23[var20 + var48 * 2 + 1] = (var55 + (var33 - var54)) * 0.5F;
				var23[var5 - 1 - var48 * 2] = 0.5F * (var54 + -var33 + var55);
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var25[var48 * 2] * var23[var20 + var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1];
				var23[var20 - 1 - var48] = var23[var48 * 2 + var20] * var25[var48 * 2 + 1] - var23[var48 * 2 + var20 + 1] * var25[var48 * 2];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var48 + var21];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + var20] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) {
				var30 = (float)Math.sin(3.141592653589793D * 0.5D * (((double)(var48 - var9) + 0.5D) / (double)var11));
				var57 = this.field1455;
				var57[var48] *= (float)Math.sin((double)var30 * (double)var30 * 1.5707963267948966D);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(1.5707963267948966D + 3.141592653589793D * 0.5D * (((double)(var48 - var12) + 0.5D) / (double)var14));
				var57 = this.field1455;
				var57[var48] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1432 > 0) {
			var21 = var5 + this.field1432 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1452) {
				for (var22 = 0; var22 < this.field1434; ++var22) {
					var46 = var22 + (this.field1432 >> 1);
					var44[var22] += this.field1451[var46];
				}
			}

			if (var18.method3453()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1455[var22];
				}
			}
		}

		float[] var56 = this.field1451;
		this.field1451 = this.field1455;
		this.field1455 = var56;
		this.field1432 = var5;
		this.field1434 = var13 - (var5 >> 1);
		this.field1452 = !var18.method3453();
		return var44;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "93"
	)
	void method3397(byte[] var1, int var2) {
		class115 var3 = this.field1441;
		var3.method3462(var1, var2);
		this.field1431 = 1 << var3.method3467(4);
		this.field1429 = 1 << var3.method3467(4);

		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		for (var4 = 0; var4 < 2; ++var4) {
			var5 = var4 != 0 ? this.field1429 : this.field1431;
			var6 = var5 >> 1;
			var7 = var5 >> 2;
			var8 = var5 >> 3;
			float[] var21 = new float[var6];

			for (int var10 = 0; var10 < var7; ++var10) {
				var21[var10 * 2] = (float)Math.cos(3.141592653589793D * (double)(var10 * 4) / (double)var5);
				var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4) * 3.141592653589793D / (double)var5));
			}

			float[] var22 = new float[var6];

			for (int var11 = 0; var11 < var7; ++var11) {
				var22[var11 * 2] = (float)Math.cos(3.141592653589793D * (double)(var11 * 2 + 1) / (double)(var5 * 2));
				var22[var11 * 2 + 1] = (float)Math.sin(3.141592653589793D * (double)(var11 * 2 + 1) / (double)(var5 * 2));
			}

			float[] var23 = new float[var7];

			for (int var12 = 0; var12 < var8; ++var12) {
				var23[var12 * 2] = (float)Math.cos((double)(var12 * 4 + 2) * 3.141592653589793D / (double)var5);
				var23[var12 * 2 + 1] = -((float)Math.sin((double)(var12 * 4 + 2) * 3.141592653589793D / (double)var5));
			}

			int[] var24 = new int[var8];
			int var13 = AbstractSocket.iLog(var8 - 1);

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
				this.field1440 = var21;
				this.field1453 = var22;
				this.field1442 = var23;
				this.field1444 = var24;
			} else {
				this.field1437 = var21;
				this.field1438 = var22;
				this.field1430 = var23;
				this.field1443 = var24;
			}
		}

		var4 = var3.method3467(8) + 1;
		this.field1439 = new VorbisCodebook[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			this.field1439[var5] = new VorbisCodebook(var3);
		}

		var5 = var3.method3467(6) + 1;

		for (var6 = 0; var6 < var5; ++var6) {
			var3.method3467(16);
		}

		var5 = var3.method3467(6) + 1;
		this.field1449 = new VorbisFloor[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			this.field1449[var6] = new VorbisFloor(var3);
		}

		var6 = var3.method3467(6) + 1;
		this.field1433 = new VorbisResidue[var6];

		for (var7 = 0; var7 < var6; ++var7) {
			this.field1433[var7] = new VorbisResidue(var3);
		}

		var7 = var3.method3467(6) + 1;
		this.field1436 = new VorbisMapping[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field1436[var8] = new VorbisMapping(var3);
		}

		var8 = var3.method3467(6) + 1;
		this.field1435 = new boolean[var8];
		this.field1428 = new int[var8];

		for (int var9 = 0; var9 < var8; ++var9) {
			this.field1435[var9] = var3.method3465() != 0;
			var3.method3467(16);
			var3.method3467(16);
			this.field1428[var9] = var3.method3467(8);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-694972437"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}
