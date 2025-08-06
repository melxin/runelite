import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ee")
public class class108 {
	@ObfuscatedName("pr")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	class114 field1418;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	VorbisCodebook[] field1407;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 653948047
	)
	int field1408;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -160561641
	)
	int field1406;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	VorbisFloor[] field1410;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ldl;"
	)
	VorbisResidue[] field1411;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	VorbisMapping[] field1412;
	@ObfuscatedName("ap")
	boolean[] field1413;
	@ObfuscatedName("am")
	int[] field1424;
	@ObfuscatedName("aj")
	float[] field1415;
	@ObfuscatedName("ag")
	float[] field1416;
	@ObfuscatedName("ay")
	float[] field1417;
	@ObfuscatedName("aa")
	float[] field1432;
	@ObfuscatedName("ai")
	float[] field1419;
	@ObfuscatedName("ak")
	float[] field1428;
	@ObfuscatedName("ar")
	int[] field1409;
	@ObfuscatedName("at")
	int[] field1422;
	@ObfuscatedName("ax")
	byte[][] field1423;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1897870255
	)
	int field1425;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1090704177
	)
	int field1420;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -895008237
	)
	int field1426;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -25672529
	)
	int field1427;
	@ObfuscatedName("aw")
	boolean field1421;
	@ObfuscatedName("af")
	float[] field1429;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1580223737
	)
	int field1435;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 393666773
	)
	int field1431;
	@ObfuscatedName("bj")
	boolean field1430;
	@ObfuscatedName("bn")
	float[] field1414;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class108(class114 var1) {
		this.field1418 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1057596360"
	)
	void method3318(Buffer var1) {
		this.field1425 = var1.readInt();
		this.field1420 = var1.readInt();
		this.field1426 = var1.readInt();
		this.field1427 = var1.readInt();
		if (this.field1427 < 0) {
			this.field1427 = ~this.field1427;
			this.field1421 = true;
		}

		int var2 = var1.readInt();
		this.field1423 = new byte[var2][];

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = 0;

			int var5;
			do {
				var5 = var1.readUnsignedByte();
				var4 += var5;
			} while(var5 >= 255);

			byte[] var6 = new byte[var4];
			var1.readBytes(var6, 0, var4);
			this.field1423[var3] = var6;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ldg;",
		garbageValue = "-41513460"
	)
	RawSound method3319() {
		this.field1435 = 0;
		this.field1429 = new float[this.field1406];
		short[] var1 = new short[this.field1420];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field1423.length; ++var3) {
			float[] var4 = this.method3320(var3);
			if (var4 != null) {
				int var5 = var4.length;
				if (var5 > this.field1420 - var2) {
					var5 = this.field1420 - var2;
				}

				for (int var6 = 0; var6 < var5; ++var6) {
					var1[var2++] = (short)class146.method3755(-32768, 32767, (int)(var4[var6] * 32768.0F));
				}
			}
		}

		this.field1429 = null;
		return new RawSound(this.field1425, var1, this.field1426, this.field1427, this.field1421, false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "82"
	)
	float[] method3320(int var1) {
		class114 var2 = new class114();
		var2.method3400(this.field1423[var1], 0);
		this.field1414 = new float[this.field1406];
		var2.method3408();
		int var3 = var2.method3409(class333.iLog(this.field1424.length - 1));
		boolean var4 = this.field1413[var3];
		int var5 = var4 ? this.field1406 : this.field1408;
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
			var9 = (var5 >> 2) - (this.field1408 >> 2);
			var10 = (this.field1408 >> 2) + (var5 >> 2);
			var11 = this.field1408 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.field1408 >> 2);
			var13 = (this.field1408 >> 2) + (var5 - (var5 >> 2));
			var14 = this.field1408 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = this.field1412[this.field1424[var3]];
		int var16 = var15.field1392;
		int var17 = var15.field1391[var16];
		class113 var18 = this.field1410[var17].method2987(var2, this.field1407);
		boolean var19 = !var18.method3385();

		int var20;
		for (var20 = 0; var20 < var15.field1393; ++var20) {
			VorbisResidue var45 = this.field1411[var15.field1394[var20]];
			float[] var47 = this.field1414;
			var45.method3096(var47, var5 >> 1, var19, var2, this.field1407);
		}

		if (var18.method3385()) {
			var16 = var15.field1392;
			int var10000 = var15.field1391[var16];
			var18.method3384(this.field1414, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method3385()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field1414[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field1414;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? this.field1432 : this.field1415;
			float[] var25 = var4 ? this.field1419 : this.field1416;
			float[] var26 = var4 ? this.field1428 : this.field1417;
			int[] var27 = var4 ? this.field1422 : this.field1409;

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
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var31 + var29;
				var23[var20 + var28 * 4 + 1] = var30 + var32;
				var33 = var43[var20 - 4 - var28 * 4];
				var34 = var43[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var29 - var31) * var34 + var33 * (var30 - var32);
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
						var23[var52 - 3 - var36] = var40 + var38;
						float var41 = var43[var35 * var50];
						float var42 = var43[var50 * var35 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - var42 * (var38 - var40);
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
				float var55 = var31 * (var32 - var34) + var30 * (var54 + var33);
				var23[var48 * 2 + var20] = 0.5F * (var55 + var34 + var32);
				var23[var5 - 2 - var48 * 2] = (var34 + var32 - var55) * 0.5F;
				var55 = (var33 + var54) * var31 - (var32 - var34) * var30;
				var23[var20 + var48 * 2 + 1] = 0.5F * (var55 + (var33 - var54));
				var23[var5 - 1 - var48 * 2] = (var55 + -var33 + var54) * 0.5F;
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var25[var48 * 2 + 1] * var23[var48 * 2 + var20 + 1] + var23[var20 + var48 * 2] * var25[var48 * 2];
				var23[var20 - 1 - var48] = var25[var48 * 2 + 1] * var23[var20 + var48 * 2] - var25[var48 * 2] * var23[var48 * 2 + var20 + 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + var21] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + var20] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) {
				var30 = (float)Math.sin(0.5D * ((0.5D + (double)(var48 - var9)) / (double)var11) * 3.141592653589793D);
				var57 = this.field1414;
				var57[var48] *= (float)Math.sin((double)var30 * 1.5707963267948966D * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin((0.5D + (double)(var48 - var12)) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field1414;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field1435 > 0) {
			var21 = var5 + this.field1435 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field1430) {
				for (var22 = 0; var22 < this.field1431; ++var22) {
					var46 = var22 + (this.field1435 >> 1);
					var44[var22] += this.field1429[var46];
				}
			}

			if (var18.method3385()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field1414[var22];
				}
			}
		}

		float[] var56 = this.field1429;
		this.field1429 = this.field1414;
		this.field1414 = var56;
		this.field1435 = var5;
		this.field1431 = var13 - (var5 >> 1);
		this.field1430 = !var18.method3385();
		return var44;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "144669309"
	)
	void method3321(byte[] var1) {
		class114 var2 = this.field1418;
		var2.method3400(var1, 0);
		this.field1408 = 1 << var2.method3409(4);
		this.field1406 = 1 << var2.method3409(4);

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		for (var3 = 0; var3 < 2; ++var3) {
			var4 = var3 != 0 ? this.field1406 : this.field1408;
			var5 = var4 >> 1;
			var6 = var4 >> 2;
			var7 = var4 >> 3;
			float[] var14 = new float[var5];

			for (int var9 = 0; var9 < var6; ++var9) {
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 4) * 3.141592653589793D / (double)var4);
				var14[var9 * 2 + 1] = -((float)Math.sin(3.141592653589793D * (double)(var9 * 4) / (double)var4));
			}

			float[] var15 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var15[var10 * 2] = (float)Math.cos(3.141592653589793D * (double)(var10 * 2 + 1) / (double)(var4 * 2));
				var15[var10 * 2 + 1] = (float)Math.sin((double)(var10 * 2 + 1) * 3.141592653589793D / (double)(var4 * 2));
			}

			float[] var16 = new float[var6];

			for (int var11 = 0; var11 < var7; ++var11) {
				var16[var11 * 2] = (float)Math.cos((double)(var11 * 4 + 2) * 3.141592653589793D / (double)var4);
				var16[var11 * 2 + 1] = -((float)Math.sin(3.141592653589793D * (double)(var11 * 4 + 2) / (double)var4));
			}

			int[] var17 = new int[var7];
			int var12 = class333.iLog(var7 - 1);

			for (int var13 = 0; var13 < var7; ++var13) {
				var17[var13] = Sound.method3856(var13, var12);
			}

			if (var3 != 0) {
				this.field1432 = var14;
				this.field1419 = var15;
				this.field1428 = var16;
				this.field1422 = var17;
			} else {
				this.field1415 = var14;
				this.field1416 = var15;
				this.field1417 = var16;
				this.field1409 = var17;
			}
		}

		var3 = var2.method3409(8) + 1;
		this.field1407 = new VorbisCodebook[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			this.field1407[var4] = new VorbisCodebook(var2);
		}

		var4 = var2.method3409(6) + 1;

		for (var5 = 0; var5 < var4; ++var5) {
			var2.method3409(16);
		}

		var4 = var2.method3409(6) + 1;
		this.field1410 = new VorbisFloor[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			this.field1410[var5] = new VorbisFloor(var2);
		}

		var5 = var2.method3409(6) + 1;
		this.field1411 = new VorbisResidue[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			this.field1411[var6] = new VorbisResidue(var2);
		}

		var6 = var2.method3409(6) + 1;
		this.field1412 = new VorbisMapping[var6];

		for (var7 = 0; var7 < var6; ++var7) {
			this.field1412[var7] = new VorbisMapping(var2);
		}

		var7 = var2.method3409(6) + 1;
		this.field1413 = new boolean[var7];
		this.field1424 = new int[var7];

		for (int var8 = 0; var8 < var7; ++var8) {
			this.field1413[var8] = var2.method3408() != 0;
			var2.method3409(16);
			var2.method3409(16);
			this.field1424[var8] = var2.method3409(8);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "707186061"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "318198826"
	)
	static void method3333() {
		for (int var0 = 0; var0 < class57.soundEffectCount; ++var0) {
			int var10002 = class57.queuedSoundEffectDelays[var0]--;
			int var2;
			if (class57.queuedSoundEffectDelays[var0] < -10) {
				--class57.soundEffectCount;

				for (var2 = var0; var2 < class57.soundEffectCount; ++var2) {
					class57.soundEffectIds[var2] = class57.soundEffectIds[var2 + 1];
					class57.soundEffects[var2] = class57.soundEffects[var2 + 1];
					class57.soundLocations[var2] = class57.soundLocations[var2 + 1];
					class57.field815[var2] = class57.field815[var2 + 1];
					class57.queuedSoundEffectLoops[var2] = class57.queuedSoundEffectLoops[var2 + 1];
					class57.queuedSoundEffectDelays[var2] = class57.queuedSoundEffectDelays[var2 + 1];
					class57.field808[var2] = class57.field808[var2 + 1];
					class57.field812[var2] = class57.field812[var2 + 1];
				}

				--var0;
			} else {
				SoundEffect var1 = class57.soundEffects[var0];
				if (var1 == null) {
					var2 = class4.field6.getGroupFileCount(class57.field815[var0]) - 1;
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class4.field6, class57.field815[var0], var2);
					if (var1 == null) {
						continue;
					}

					int[] var24 = class57.queuedSoundEffectDelays;
					var24[var0] += var1.calculateDelay();
					class57.soundEffects[var0] = var1;
				}

				if (class57.queuedSoundEffectDelays[var0] < 0) {
					if (class57.soundLocations[var0] != 0) {
						int var3 = Coord.method7393(class57.soundLocations[var0] & 255);
						int var4 = class57.soundLocations[var0] >> 16 & 255;
						int var5 = class57.soundLocations[var0] >> 8 & 255;
						int var6 = class57.soundEffectIds[var0];
						WorldView var7 = Client.worldViewManager.getWorldView(var6);
						class448 var8 = AttackOption.method2761(var7, Coord.method7393(var4), Coord.method7393(var5));
						int var9 = Coord.method7394((int)var8.field5059);
						int var10 = Coord.method7394((int)var8.field5054);
						var8.method9038();
						class448 var11 = Client.worldViewManager.method2363();
						int var12 = Math.abs(Coord.method7396(var9) - (int)var11.field5059);
						int var13 = Math.abs(Coord.method7396(var10) - (int)var11.field5054);
						var11.method9038();
						int var14 = Math.max(var12 + var13 - 128, 0);
						int var15 = Math.max(Coord.method7393((class57.field808[var0] & 31) - 1), 0);
						WorldEntity var16 = Client.worldViewManager.method2318();
						WorldEntity var17 = Client.worldViewManager.method2317(var6);
						boolean var18 = class57.field812[var0];
						boolean var19 = TaskHandler.method5885(var16, var17, var18);
						if (var14 >= var3 || !var19) {
							class57.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						float var20 = var15 < var3 ? Math.min(Math.max((float)(var3 - var14) / (float)(var3 - var15), 0.0F), 1.0F) : 1.0F;
						var2 = (int)(var20 * (float)FriendSystem.clientPreferences.getAreaSoundEffectsVolume());
					} else {
						var2 = FriendSystem.clientPreferences.getSoundEffectsVolume();
					}

					if (var2 > 0) {
						RawSound var21 = var1.toRawSound();
						RawPcmStream var22 = RawPcmStream.createRawPcmStream(var21, 100, var2);
						if (var22 != null) {
							var22.setNumLoops(class57.queuedSoundEffectLoops[var0] - 1);
							class366.pcmStreamMixer.addSubStream(var22);
						}
					}

					class57.queuedSoundEffectDelays[var0] = -100;
				}
			}
		}

		if (Client.playingJingle && !class113.method3399()) {
			if (FriendSystem.clientPreferences.getMusicVolume() != 0 && UserComparator9.method3532()) {
				GrandExchangeOfferUnitPriceComparator.method8561(MoveSpeed.field3199, FriendSystem.clientPreferences.getMusicVolume());
			}

			Client.playingJingle = false;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "5928"
	)
	public static long method3326(int var0) {
		if (var0 > 63) {
			throw new class453("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1248403200"
	)
	static final void method3329(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class531.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method4045()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class291.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class283.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
