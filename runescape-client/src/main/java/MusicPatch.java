import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1314390951
	)
	int field3958;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	@Export("rawSounds")
	class108[] rawSounds;
	@ObfuscatedName("ac")
	short[] field3959;
	@ObfuscatedName("ap")
	byte[] field3956;
	@ObfuscatedName("aq")
	byte[] field3957;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lnz;"
	)
	MusicPatchNode2[] field3963;
	@ObfuscatedName("as")
	byte[] field3954;
	@ObfuscatedName("al")
	ArrayList field3960;
	@ObfuscatedName("au")
	int[] field3961;

	MusicPatch(byte[] var1) {
		this.field3960 = new ArrayList(8);
		this.rawSounds = new class108[128];
		this.field3959 = new short[128];
		this.field3956 = new byte[128];
		this.field3957 = new byte[128];
		this.field3963 = new MusicPatchNode2[128];
		this.field3954 = new byte[128];
		this.field3961 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset * 1216585693] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		var2.offset += -290410379;
		++var3;
		var5 = var2.offset * 1216585693;
		var2.offset += var3 * -290410379;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset * 1216585693] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		var2.offset += -290410379;
		++var6;
		var8 = var2.offset * 1216585693;
		var2.offset += -290410379 * var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset * 1216585693] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		var2.offset += -290410379;
		++var9;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var41 = var2.readUnsignedByte();
				if (var41 == 0) {
					var13 = var12++;
				} else {
					if (var41 <= var13) {
						--var41;
					}

					var13 = var41;
				}

				var36[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var15 = var37[var14] = new MusicPatchNode2();
			int var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3878 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3879 = new byte[var40 * 2 + 2];
				var15.field3879[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset * 1216585693] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		var2.offset += -290410379;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3959[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field3959;
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var48 = this.field3959;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3961[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3961[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3954[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3961[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3957[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var38 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3961[var26] != 0) {
				if (var20 == 0) {
					var38 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3963[var26] = var38;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3961[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3956[var27] = (byte)var26;
			--var20;
		}

		this.field3958 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3878 != null) {
				for (var29 = 1; var29 < var39.field3878.length; var29 += 2) {
					var39.field3878[var29] = var2.readByte();
				}
			}

			if (var39.field3879 != null) {
				for (var29 = 3; var29 < var39.field3879.length - 2; var29 += 2) {
					var39.field3879[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) {
			for (var27 = 1; var27 < var42.length; var27 += 2) {
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3879 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3879.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field3879[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3878 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3878.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var39.field3878[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) {
			var19 = var2.readUnsignedByte();
			var42[0] = (byte)var19;

			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var42[var27] = (byte)var19;
			}

			var47 = var42[0];
			byte var28 = var42[1];

			for (var29 = 0; var29 < var47; ++var29) {
				this.field3956[var29] = (byte)(var28 * this.field3956[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				byte var31 = var42[var29 + 1];
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class240.method5443(var32, var30 - var47);
					this.field3956[var33] = (byte)(var34 * this.field3956[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var47 = var30;
				var28 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field3956[var45] = (byte)(var28 * this.field3956[var45] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var47 = var16[0];
			int var44 = var16[1] << 1;

			for (var29 = 0; var29 < var47; ++var29) {
				var45 = var44 + (this.field3957[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field3957[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var46 = var16[var29 + 1] << 1;
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = class240.method5443(var32, var30 - var47);
					int var35 = var34 + (this.field3957[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3957[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field3957[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3957[var45] = (byte)var46;
			}

			Object var43 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3880 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3878 != null) {
				var39.field3881 = var2.readUnsignedByte();
			}

			if (var39.field3879 != null) {
				var39.field3882 = var2.readUnsignedByte();
			}

			if (var39.field3880 > 0) {
				var39.field3883 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3886 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3886 > 0) {
				var39.field3884 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3884 > 0) {
				var39.field3885 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Ljava/util/BitSet;I)Z",
		garbageValue = "2021832491"
	)
	boolean method7328(SoundCache var1, BitSet var2) {
		boolean var3 = true;
		int var4 = 0;
		class108 var5 = new class108();

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
			var7 = var2.nextClearBit(var6);

			for (int var8 = var6; var8 < var7; ++var8) {
				if (var2.get(var8)) {
					int var9 = this.field3961[var8];
					if (var9 != 0) {
						if (var4 != var9) {
							var4 = var9--;
							if ((var9 & 1) == 0) {
								var5 = new class108(var1.method3121(var9 >> 2));
							} else {
								var5 = var1.method3120(var9 >> 2);
							}

							if (var5.method3390()) {
								var3 = false;
							} else {
								this.field3960.add(this.field3960.size(), var5);
							}
						}

						if (!var5.method3390()) {
							this.rawSounds[var8] = var5;
							this.field3961[var8] = 0;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-524330729"
	)
	@Export("_remove")
	void _remove() {
		this.field3961 = null;
	}

	@ObfuscatedName("af")
	public static int method7334(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldr;[BIIIII)V",
		garbageValue = "-2192181"
	)
	static final void method7331(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				CollisionMap var13 = var0.collisionMaps[var6];

				for (var8 = var2; var8 < var2 + 64; ++var8) {
					for (var9 = var3; var9 < var3 + 64; ++var9) {
						if (var13.method6174(var8, var9)) {
							var13.method6173(var8, var9, 1073741824);
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		int var7;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					var10 = var8 + var2;
					int var11 = var3 + var9;
					class144.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

		var7 = var12.offset * 1216585693 < var12.array.length ? var12.readUnsignedByte() : 0;
		boolean var14 = (var7 & 1) != 0;
		if (var14) {
			for (var9 = 0; var9 < 64; ++var9) {
				for (var10 = 0; var10 < 64; ++var10) {
					EnumComposition.method4307(var12);
				}
			}
		}

	}
}
