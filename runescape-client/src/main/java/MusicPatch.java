import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("aw")
	static int[][][] field3967;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1600190309
	)
	int field3963;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ley;"
	)
	@Export("rawSounds")
	class107[] rawSounds;
	@ObfuscatedName("aj")
	short[] field3965;
	@ObfuscatedName("ah")
	byte[] field3966;
	@ObfuscatedName("af")
	byte[] field3970;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lmt;"
	)
	MusicPatchNode2[] field3968;
	@ObfuscatedName("aq")
	byte[] field3969;
	@ObfuscatedName("ac")
	ArrayList field3972;
	@ObfuscatedName("aa")
	int[] field3971;

	MusicPatch(byte[] var1) {
		this.field3972 = new ArrayList(8);
		this.rawSounds = new class107[128];
		this.field3965 = new short[128];
		this.field3966 = new byte[128];
		this.field3970 = new byte[128];
		this.field3968 = new MusicPatchNode2[128];
		this.field3969 = new byte[128];
		this.field3971 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
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
				var15.field3883 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3881 = new byte[var40 * 2 + 2];
				var15.field3881[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3965[var20] = (short)var19;
		}

		var19 = 0;

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var48 = this.field3965;
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

			var48 = this.field3965;
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3971[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3971[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3969[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3971[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3970[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var38 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3971[var26] != 0) {
				if (var20 == 0) {
					var38 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3968[var26] = var38;
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

				if (this.field3971[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3966[var27] = (byte)var26;
			--var20;
		}

		this.field3963 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3883 != null) {
				for (var29 = 1; var29 < var39.field3883.length; var29 += 2) {
					var39.field3883[var29] = var2.readByte();
				}
			}

			if (var39.field3881 != null) {
				for (var29 = 3; var29 < var39.field3881.length - 2; var29 += 2) {
					var39.field3881[var29] = var2.readByte();
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
			if (var39.field3881 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3881.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field3881[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3883 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var39.field3883.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field3883[var29] = (byte)var19;
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
				this.field3966[var29] = (byte)(var28 * this.field3966[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				byte var31 = var42[var29 + 1];
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = WorldMapID.method6845(var32, var30 - var47);
					this.field3966[var33] = (byte)(var34 * this.field3966[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var47 = var30;
				var28 = var31;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				this.field3966[var45] = (byte)(var28 * this.field3966[var45] + 32 >> 6);
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
				var45 = var44 + (this.field3970[var29] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field3970[var29] = (byte)var45;
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var46 = var16[var29 + 1] << 1;
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2;

				for (var33 = var47; var33 < var30; ++var33) {
					var34 = WorldMapID.method6845(var32, var30 - var47);
					int var35 = var34 + (this.field3970[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3970[var33] = (byte)var35;
					var32 += var46 - var44;
				}

				var47 = var30;
				var44 = var46;
			}

			for (var45 = var47; var45 < 128; ++var45) {
				var46 = var44 + (this.field3970[var45] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3970[var45] = (byte)var46;
			}

			Object var43 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3890 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3883 != null) {
				var39.field3885 = var2.readUnsignedByte();
			}

			if (var39.field3881 != null) {
				var39.field3884 = var2.readUnsignedByte();
			}

			if (var39.field3890 > 0) {
				var39.field3882 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3887 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3887 > 0) {
				var39.field3886 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3886 > 0) {
				var39.field3888 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldb;Ljava/util/BitSet;B)Z",
		garbageValue = "-84"
	)
	boolean method7339(SoundCache var1, BitSet var2) {
		boolean var3 = true;
		int var4 = 0;
		class107 var5 = new class107();

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
			var7 = var2.nextClearBit(var6);

			for (int var8 = var6; var8 < var7; ++var8) {
				if (var2.get(var8)) {
					int var9 = this.field3971[var8];
					if (var9 != 0) {
						if (var4 != var9) {
							var4 = var9--;
							if ((var9 & 1) == 0) {
								var5 = new class107(var1.method3206(var9 >> 2));
							} else {
								var5 = var1.method3205(var9 >> 2);
							}

							if (var5.method3422()) {
								var3 = false;
							} else {
								this.field3972.add(this.field3972.size(), var5);
							}
						}

						if (!var5.method3422()) {
							this.rawSounds[var8] = var5;
							this.field3971[var8] = 0;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1596555308"
	)
	@Export("_remove")
	void _remove() {
		this.field3971 = null;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lmr;B)V",
		garbageValue = "-78"
	)
	static void method7346(PacketBufferNode var0) {
		var0.packetBuffer.writeIntME(GrandExchangeOffer.archive6.hash);
		var0.packetBuffer.writeIntLE(BoundaryObject.archive8.hash);
		var0.packetBuffer.writeInt(Canvas.archive13.hash);
		var0.packetBuffer.writeInt(UserComparator4.field1562.hash);
		var0.packetBuffer.writeIntIME(RestClientThreadFactory.field67.hash);
		var0.packetBuffer.writeIntLE(WorldMapSprite.field3462.hash);
		var0.packetBuffer.writeInt(PacketWriter.field1291.hash);
		var0.packetBuffer.writeIntME(Client.field376.hash);
		var0.packetBuffer.writeIntME(0);
		var0.packetBuffer.writeIntLE(class113.field1508.hash);
		var0.packetBuffer.writeIntIME(class206.archive2.hash);
		var0.packetBuffer.writeIntME(ItemContainer.archive9.hash);
		var0.packetBuffer.writeInt(PendingSpawn.field1023.hash);
		var0.packetBuffer.writeInt(class322.field3540.hash);
		var0.packetBuffer.writeIntLE(class156.field1814.hash);
		var0.packetBuffer.writeInt(WorldMapArea.field3339.hash);
		var0.packetBuffer.writeIntLE(WorldMapDecoration.field3459.hash);
		var0.packetBuffer.writeIntIME(Projection.archive10.hash);
		var0.packetBuffer.writeIntME(FriendSystem.field621.hash);
		var0.packetBuffer.writeIntIME(WorldViewManager.field1001.hash);
		var0.packetBuffer.writeIntME(class142.archive12.hash);
		var0.packetBuffer.writeIntIME(class416.archive4.hash);
		var0.packetBuffer.writeIntLE(class443.field5180.hash);
	}
}
