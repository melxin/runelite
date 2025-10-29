import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class108 {
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 788805875
	)
	static int field1429;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	class114 field1424;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lee;"
	)
	VorbisCodebook[] field1409;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -284574227
	)
	int field1403;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1385525943
	)
	int field1404;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ldu;"
	)
	VorbisFloor[] field1402;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	VorbisResidue[] field1406;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	VorbisMapping[] field1426;
	@ObfuscatedName("aw")
	boolean[] field1405;
	@ObfuscatedName("ap")
	int[] field1425;
	@ObfuscatedName("ay")
	float[] field1410;
	@ObfuscatedName("au")
	float[] field1411;
	@ObfuscatedName("az")
	float[] field1412;
	@ObfuscatedName("ad")
	float[] field1413;
	@ObfuscatedName("ai")
	float[] field1420;
	@ObfuscatedName("as")
	float[] field1415;
	@ObfuscatedName("ac")
	int[] field1416;
	@ObfuscatedName("ab")
	int[] field1417;
	@ObfuscatedName("ax")
	byte[][] field1418;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2039671841
	)
	int field1401;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -547117659
	)
	int field1419;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2145751539
	)
	int field1421;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 442890883
	)
	int field1408;
	@ObfuscatedName("am")
	boolean field1423;
	@ObfuscatedName("ao")
	float[] field1428;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -920882293
	)
	int field1414;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2012767871
	)
	int field1422;
	@ObfuscatedName("be")
	boolean field1427;
	@ObfuscatedName("bo")
	float[] field1407;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class108(class114 var1) {
		this.field1424 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1863658004"
	)
	int method3493() {
		return this.field1401;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1107150673"
	)
	int method3492() {
		return this.field1421;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-745750199"
	)
	int method3495() {
		return this.field1408;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1537732678"
	)
	void method3496(Buffer var1) {
		this.field1401 = var1.readInt();
		this.field1419 = var1.readInt();
		this.field1421 = var1.readInt();
		this.field1408 = var1.readInt();
		if (this.field1408 < 0) {
			this.field1408 = ~this.field1408;
			this.field1423 = true;
		}

		int var2 = var1.readInt();
		this.field1418 = new byte[var2][];

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.readUnsignedByte();
				var4 += var5;
			} while(var5 >= 255);

			byte[] var6 = new byte[var4];
			var1.readBytes(var6, 0, var4);
			this.field1418[var3] = var6;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ldq;",
		garbageValue = "-86"
	)
	RawSound method3506() {
		this.field1414 = 0;
		this.field1428 = new float[this.field1404];
		short[] var1 = new short[this.field1419];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field1418.length; ++var3) {
			float[] var4 = this.method3519(var3);
			if (var4 != null) {
				int var5 = var4.length;
				if (var5 > this.field1419 - var2) {
					var5 = this.field1419 - var2;
				}

				for (int var6 = 0; var6 < var5; ++var6) {
					var1[var2++] = (short)class470.method9686(-32768, 32767, (int)(32768.0F * var4[var6]));
				}
			}
		}

		this.field1428 = null;
		return new RawSound(this.field1401, var1, this.field1421, this.field1408, this.field1423, false);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "796065525"
	)
	float[] method3519(int var1) {
		class114 var2 = new class114();
		var2.method3590(this.field1418[var1], 0);
		this.field1407 = new float[this.field1404];
		var2.method3586();
		int var3 = var2.method3588(class39.iLog(this.field1425.length - 1));
		boolean var4 = this.field1405[var3];
		int var5 = var4 ? this.field1404 : this.field1403;
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
			var9 = (var5 >> 2) - (this.field1403 >> 2);
			var10 = (this.field1403 >> 2) + (var5 >> 2);
			var11 = this.field1403 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.field1403 >> 2);
			var13 = (this.field1403 >> 2) + (var5 - (var5 >> 2));
			var14 = this.field1403 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = this.field1426[this.field1425[var3]];
		int var16 = var15.field1390;
		int var17 = var15.field1388[var16];
		class113 var18 = this.field1402[var17].method3145(var2, this.field1409);
		boolean var19 = !var18.method3575();

		int var20;
		for (var20 = 0; var20 < var15.field1389; ++var20) {
			VorbisResidue var45 = this.field1406[var15.field1391[var20]];
			float[] var47 = this.field1407;
			var45.method3256(var47, var5 >> 1, var19, var2, this.field1409);
		}

		if (var18.method3575()) {
			var16 = var15.field1390;
			int var10000 = var15.field1388[var16];
			var18.method3579(this.field1407, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3575()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1407[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1407;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? this.field1413 : this.field1410;
			float[] var25 = var4 ? this.field1420 : this.field1411;
			float[] var26 = var4 ? this.field1415 : this.field1412;
			int[] var27 = var4 ? this.field1417 : this.field1416;

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
				var23[var5 - var28 * 4 - 3] = var30 * var31 + var32 * var29;
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
				var23[var28 * 4 + 1] = (var29 - var31) * var34 + (var30 - var32) * var33;
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
						var23[var52 - 1 - var36] = var39 + var37;
						var23[var52 - 3 - var36] = var40 + var38;
						float var41 = var43[var50 * var35];
						float var42 = var43[var50 * var35 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
						var23[var53 - 3 - var36] = var41 * (var38 - var40) + (var37 - var39) * var42;
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
				float var55 = (var54 + var33) * var30 + (var32 - var34) * var31;
				var23[var48 * 2 + var20] = (var55 + var34 + var32) * 0.5F;
				var23[var5 - 2 - var48 * 2] = 0.5F * (var34 + var32 - var55);
				var55 = var31 * (var54 + var33) - var30 * (var32 - var34);
				var23[var48 * 2 + var20 + 1] = (var55 + (var33 - var54)) * 0.5F;
				var23[var5 - 1 - var48 * 2] = 0.5F * (-var33 + var54 + var55);
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var25[var48 * 2] * var23[var48 * 2 + var20] + var25[var48 * 2 + 1] * var23[var48 * 2 + var20 + 1];
				var23[var20 - 1 - var48] = var23[var48 * 2 + var20] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2];
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
				var30 = (float)Math.sin(0.5D * (((double)(var48 - var9) + 0.5D) / (double)var11) * 3.141592653589793D);
				var57 = this.field1407;
				var57[var48] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(1.5707963267948966D + 0.5D * ((0.5D + (double)(var48 - var12)) / (double)var14) * 3.141592653589793D);
				var57 = this.field1407;
				var57[var48] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1414 > 0) {
			var21 = var5 + this.field1414 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1427) {
				for (var22 = 0; var22 < this.field1422; ++var22) {
					var46 = var22 + (this.field1414 >> 1);
					var44[var22] += this.field1428[var46];
				}
			}

			if (var18.method3575()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1407[var22];
				}
			}
		}

		float[] var56 = this.field1428;
		this.field1428 = this.field1407;
		this.field1407 = var56;
		this.field1414 = var5;
		this.field1422 = var13 - (var5 >> 1);
		this.field1427 = !var18.method3575();
		return var44;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1226370646"
	)
	void method3499(byte[] var1, int var2) {
		class114 var3 = this.field1424;
		var3.method3590(var1, var2);
		this.field1403 = 1 << var3.method3588(4);
		this.field1404 = 1 << var3.method3588(4);

		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		for (var4 = 0; var4 < 2; ++var4) {
			var5 = var4 != 0 ? this.field1404 : this.field1403;
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
				var22[var11 * 2] = (float)Math.cos((double)(var11 * 2 + 1) * 3.141592653589793D / (double)(var5 * 2));
				var22[var11 * 2 + 1] = (float)Math.sin((double)(var11 * 2 + 1) * 3.141592653589793D / (double)(var5 * 2));
			}

			float[] var23 = new float[var7];

			for (int var12 = 0; var12 < var8; ++var12) {
				var23[var12 * 2] = (float)Math.cos(3.141592653589793D * (double)(var12 * 4 + 2) / (double)var5);
				var23[var12 * 2 + 1] = -((float)Math.sin((double)(var12 * 4 + 2) * 3.141592653589793D / (double)var5));
			}

			int[] var24 = new int[var8];
			int var13 = class39.iLog(var8 - 1);

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
				this.field1413 = var21;
				this.field1420 = var22;
				this.field1415 = var23;
				this.field1417 = var24;
			} else {
				this.field1410 = var21;
				this.field1411 = var22;
				this.field1412 = var23;
				this.field1416 = var24;
			}
		}

		var4 = var3.method3588(8) + 1;
		this.field1409 = new VorbisCodebook[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			this.field1409[var5] = new VorbisCodebook(var3);
		}

		var5 = var3.method3588(6) + 1;

		for (var6 = 0; var6 < var5; ++var6) {
			var3.method3588(16);
		}

		var5 = var3.method3588(6) + 1;
		this.field1402 = new VorbisFloor[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			this.field1402[var6] = new VorbisFloor(var3);
		}

		var6 = var3.method3588(6) + 1;
		this.field1406 = new VorbisResidue[var6];

		for (var7 = 0; var7 < var6; ++var7) {
			this.field1406[var7] = new VorbisResidue(var3);
		}

		var7 = var3.method3588(6) + 1;
		this.field1426 = new VorbisMapping[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field1426[var8] = new VorbisMapping(var3);
		}

		var8 = var3.method3588(6) + 1;
		this.field1405 = new boolean[var8];
		this.field1425 = new int[var8];

		for (int var9 = 0; var9 < var8; ++var9) {
			this.field1405[var9] = var3.method3586() != 0;
			var3.method3588(16);
			var3.method3588(16);
			this.field1425[var9] = var3.method3588(8);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "-527943295"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lql;III)I",
		garbageValue = "-43392855"
	)
	static int method3518(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1059509023"
	)
	static final void method3522() {
		KitDefinition.KitDefinition_archive = null;
		ClanChannelMember.KitDefinition_modelsArchive = null;
		class408.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "21"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		Occluder.topLevelWorldView.scene.cycle = Client.cycle;
		class50.method1942();
		class164.method4140(Occluder.topLevelWorldView);
		WorldView var4 = Occluder.topLevelWorldView;
		int var5 = Client.menu.menuOptionsCount - 1;
		if (AbstractWorldMapIcon.field3523 != null && var4 == Occluder.topLevelWorldView && var5 >= 0 && Client.menu.menuOpcodes[var5] == 60 && (Client.field536 <= 0 || Client.menu.menuIdentifiers[var5] != Client.field377)) {
			int var7 = Client.menu.menuIdentifiers[var5] * 128;
			Clock.method5250(var4, var7, AbstractWorldMapIcon.field3523);
		}

		WorldView var12 = Occluder.topLevelWorldView;
		if (Client.renderSelf) {
			class31.addPlayerToScene(var12, Client.localPlayerIndex, false);
		}

		WorldView var13 = Occluder.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var13.players.get((long)Client.combatTargetPlayerIndex) != null) {
			class31.addPlayerToScene(var13, Client.combatTargetPlayerIndex, false);
		}

		WorldView var14 = Occluder.topLevelWorldView;
		WorldEntity var8 = (WorldEntity)var14.worldEntities.get((long)Client.currentWorldViewId);
		if (var8 != null) {
			WorldMapLabelSize.method6575(var14, var8, false);
		}

		class212.method4683(Occluder.topLevelWorldView, class400.TOKEN);
		class212.method4683(Occluder.topLevelWorldView, class400.field4844);
		class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2172);
		WorldView var16 = Occluder.topLevelWorldView;
		int var9 = Client.playerUpdateManager.playerCount;
		int[] var10 = Client.playerUpdateManager.playerIndices;

		for (int var11 = 0; var11 < var9; ++var11) {
			if (var10[var11] != Client.combatTargetPlayerIndex && var10[var11] != Client.localPlayerIndex) {
				class31.addPlayerToScene(var16, var10[var11], true);
			}
		}

		class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2168);
		class291.addNpcsToScene(Occluder.topLevelWorldView, class201.field2167);
		class338.method7282();
		UserList.method10364(Occluder.topLevelWorldView);
		class212.method4683(Occluder.topLevelWorldView, class400.field4843);
		class33.worldToScreen(var0, var1, var2, var3);
		Occluder.topLevelWorldView.scene.setViewportWalking();

		for (int var15 = 0; var15 < Occluder.topLevelWorldView.field1148.method10038(); ++var15) {
			WorldEntity var17 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)Occluder.topLevelWorldView.field1148.method10037(var15));
			if (var17 != null) {
				var17.worldView.scene.setViewportWalking();
			}
		}

	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "-113"
	)
	static final String method3521(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return class144.colorStartTag(16711680);
		} else if (var2 < -6) {
			return class144.colorStartTag(16723968);
		} else if (var2 < -3) {
			return class144.colorStartTag(16740352);
		} else if (var2 < 0) {
			return class144.colorStartTag(16756736);
		} else if (var2 > 9) {
			return class144.colorStartTag(65280);
		} else if (var2 > 6) {
			return class144.colorStartTag(4259584);
		} else if (var2 > 3) {
			return class144.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class144.colorStartTag(12648192) : class144.colorStartTag(16776960);
		}
	}
}
