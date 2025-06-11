import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1149136133
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -7395594187873777427L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1093110903
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1958462383
	)
	@Export("x")
	int x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 647786003
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1318744095
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 11828785
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1393213525
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1938687773
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-435382010"
	)
	public static void method5860() {
		class195.field2100.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)Lrz;",
		garbageValue = "818557913"
	)
	public static TransformationMatrix method5858(TransformationMatrix var0) {
		synchronized(TransformationMatrix.field4981) {
			if (TransformationMatrix.field4980 == 0) {
				return new TransformationMatrix(var0);
			} else {
				TransformationMatrix.field4981[--TransformationMatrix.field4980].method8778(var0);
				return TransformationMatrix.field4981[TransformationMatrix.field4980];
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lro;FFFI)F",
		garbageValue = "1011476231"
	)
	static float method5856(class449 var0, float var1, float var2, float var3) {
		float var4 = IndexCheck.method5922(var0.field5002, var0.field5003, var1);
		if (Math.abs(var4) < class132.field1558) {
			return var1;
		} else {
			float var5 = IndexCheck.method5922(var0.field5002, var0.field5003, var2);
			if (Math.abs(var5) < class132.field1558) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = class132.field1559 * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var12 * var17 * 2.0F;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * ((var10 - var11) * var10 * 2.0F * var17 - (var2 - var1) * (var11 - 1.0F));
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < var10 * 3.0F * var17 - Math.abs(var10 * var16) && var9 < Math.abs(0.5F * var12 * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = IndexCheck.method5922(var0.field5002, var0.field5003, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "543543108"
	)
	static void method5859() {
		Script.Script_cached.clear();
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lml;I)V",
		garbageValue = "1201152666"
	)
	static final void method5857(class325 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var11;
		int var12;
		int var13;
		int var14;
		int var18;
		int var20;
		int var21;
		int var30;
		int var35;
		if (class325.field3492 == var0) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readInt();
			var4 = Coord.method7222(var3);
			var5 = Coord.method7223(var3);
			var6 = Coord.method7224(var3);
			var7 = var1.readUnsignedShortLE();
			var21 = var1.readUnsignedShort();
			var20 = var1.readUnsignedByteSub();
			var30 = class330.worldView.plane;
			var11 = (var20 >> 4 & 7) + Ignored.field5198 + class330.worldView.baseX;
			var12 = (var20 & 7) + HitSplatDefinition.field2180 + class330.worldView.baseY;
			var13 = var1.readUnsignedShortAdd();
			var14 = var1.method10889();
			var35 = var1.readUnsignedShortAdd();
			int var36 = var1.readUnsignedByte();
			int var26 = var1.readUnsignedShortAddLE();
			var18 = var1.method10896();
			if (var21 != 65535) {
				Projectile var19 = new Projectile(var30, var11, var12, var7, var18, var4, var5, var6, var2, var14, var21, var13 + Client.cycle, var35 + Client.cycle, var36, var26);
				Client.playerUpdateManager.addFirst(var19);
			}

		} else if (class325.field3484 == var0) {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedByteSub();
			var4 = (var3 >> 4 & 7) + Ignored.field5198;
			var5 = (var3 & 7) + HitSplatDefinition.field2180;
			var6 = var1.readUnsignedIntIME();
			var7 = class330.worldView.plane;
			if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
				var21 = Client.field405 == -1 ? var7 : Client.field405;
				class385.method7946(var21, var4, var5, var2, var6);
			}

		} else if (class325.field3493 == var0) {
			var2 = var1.readUnsignedByteAdd();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field524[var3];
			var6 = var1.readUnsignedByteSub();
			var7 = (var6 >> 4 & 7) + Ignored.field5198;
			var21 = (var6 & 7) + HitSplatDefinition.field2180;
			if (var7 >= 0 && var21 >= 0 && var7 < class330.worldView.sizeX && var21 < class330.worldView.sizeY) {
				var20 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				class36.method703(class330.worldView, var20, var7, var21, var5, -1, var3, var4, 31, (String[])null, 0, -1);
			}

		} else if (class325.field3482 == var0) {
			var2 = var1.readUnsignedIntME();
			var3 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedByteSub();
			var5 = (var4 >> 4 & 7) + Ignored.field5198;
			var6 = (var4 & 7) + HitSplatDefinition.field2180;
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				var7 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				class385.method7945(var7, var5, var6, var3, var2);
			}

		} else if (class325.field3489 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = (var2 >> 4 & 7) + Ignored.field5198;
			var4 = (var2 & 7) + HitSplatDefinition.field2180;
			var5 = var1.readUnsignedShortAddLE();
			var6 = var1.readUnsignedByteAdd();
			var7 = var6 >> 2;
			var21 = var6 & 3;
			var20 = Client.field524[var7];
			if (0 <= var3 && var3 < 103 && 0 <= var4 && var4 < 103) {
				var30 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				PendingSpawn var25 = Message.method709(class330.worldView, var30, var3, var4, var20);
				if (var25 != null) {
					ObjectComposition var38 = HealthBarConfig.getObjectDefinition(var25.field1008);
					if (var38.field2224) {
						ClanChannelMember.method3677(var30, var3, var4, var7, var21, var20, var5);
						var25.field1003 = var5;
						return;
					}
				}

				boolean var34 = ClanChannelMember.method3677(var30, var3, var4, var7, var21, var20, var5);
				if (var34) {
					return;
				}

				if (var25 != null) {
					var25.field1003 = var5;
				}
			}

		} else if (class325.field3488 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = (var2 >> 4 & 7) + Ignored.field5198;
			var4 = (var2 & 7) + HitSplatDefinition.field2180;
			var5 = var1.readUnsignedShortLE();
			var6 = var1.readUnsignedByteNeg();
			var7 = var1.readUnsignedShortAddLE();
			if (var3 >= 0 && var4 >= 0 && var3 < class330.worldView.sizeX && var4 < class330.worldView.sizeY) {
				var3 = Coord.method7242(var3);
				var4 = Coord.method7242(var4);
				var21 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				GraphicsObject var29 = new GraphicsObject(class330.worldView, var7, var21, var3, var4, DevicePcmPlayerProvider.method329(class330.worldView, var3, var4, var21) - var6, var5, Client.cycle);
				class330.worldView.projectiles.addFirst(var29);
			}

		} else if (class325.field3490 == var0) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedByteNeg();
			var4 = (var3 >> 4 & 7) + Ignored.field5198;
			var5 = (var3 & 7) + HitSplatDefinition.field2180;
			var6 = var1.readUnsignedByteNeg();
			var7 = var1.readUnsignedIntLE();
			var21 = var1.readUnsignedShortAdd();
			var20 = var1.readUnsignedShort();
			boolean var32 = var1.readUnsignedByteSub() == 1;
			var11 = var1.readUnsignedByte();
			if (var4 >= 0 && var5 >= 0 && var4 < class330.worldView.sizeX && var5 < class330.worldView.sizeY) {
				var12 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				WorldMapDecoration.addTileItemToGroundItems(var12, var4, var5, var2, var7, var11, var20, var21, var6, var32);
			}

		} else if (class325.field3487 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = (var2 >> 4 & 7) + Ignored.field5198;
			var4 = (var2 & 7) + HitSplatDefinition.field2180;
			var5 = var1.readUnsignedShort();
			var6 = var1.readUnsignedIntIME();
			var7 = var1.readUnsignedIntME();
			if (var3 >= 0 && var4 >= 0 && var3 < class330.worldView.sizeX && var4 < class330.worldView.sizeY) {
				var21 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				SecureUrlRequester.method3363(var21, var3, var4, var5, var7, var6);
			}

		} else if (class325.field3485 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = (var2 >> 4 & 7) + Ignored.field5198;
			var4 = (var2 & 7) + HitSplatDefinition.field2180;
			byte var28 = var1.readByteNeg();
			var6 = var1.readUnsignedByte() * 4;
			var7 = var1.readUnsignedShort();
			var21 = var1.readUnsignedByteAdd();
			var20 = var1.readUnsignedShort();
			var30 = var1.readUnsignedByteAdd() * 4;
			byte var33 = var1.readByteAdd();
			var12 = var1.method10906();
			var13 = var1.readUnsignedShort();
			var14 = var1.readUnsignedShortAdd();
			var35 = var1.method10896();
			if (var7 != 65535) {
				var3 += class330.worldView.baseX;
				var4 += class330.worldView.baseY;
				var5 = var28 + var3;
				var11 = var33 + var4;
				Projectile var24 = new Projectile(class330.worldView.plane, var3, var4, var6, var35, class330.worldView.plane, var5, var11, var30, var12, var7, var13 + Client.cycle, var14 + Client.cycle, var21, var20);
				Client.playerUpdateManager.addFirst(var24);
			}

		} else if (class325.field3481 == var0) {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedIntLE();
			var4 = var1.method10899();
			var5 = var1.readUnsignedByteAdd();
			var6 = (var5 >> 4 & 7) + Ignored.field5198;
			var7 = (var5 & 7) + HitSplatDefinition.field2180;
			short var37 = (short)var1.readShortLE();
			var20 = var1.readShortLE();
			short var31 = (short)var1.readSignedShort();
			var11 = var1.readUnsignedShortAddLE();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				var12 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				class71.method2213(var12, var6, var7, var11, var3, var31, var20, var37, var4, var2);
			}

		} else if (class325.field3480 == var0) {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedByteSub();
			var4 = var1.readUnsignedByteAdd();
			var5 = var4 >> 2;
			var6 = var4 & 3;
			var7 = Client.field524[var5];
			var21 = var1.readUnsignedByte();
			var20 = (var21 >> 4 & 7) + Ignored.field5198;
			var30 = (var21 & 7) + HitSplatDefinition.field2180;
			var11 = var1.readUnsignedByteNeg();
			String[] var22 = null;
			if (var11 > 0) {
				var22 = new String[5];

				for (var13 = 0; var13 < var11; ++var13) {
					var14 = var1.readUnsignedByteSub();
					String var23 = var1.readStringCp1252NullTerminated();
					if (var14 >= 0 && var14 < 5) {
						var22[var14] = var23;
					}
				}
			}

			if (var20 >= 0 && var30 >= 0 && var20 < class330.worldView.sizeX && var30 < class330.worldView.sizeY) {
				var13 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
				class36.method703(class330.worldView, var13, var20, var30, var7, var2, var5, var6, var3, var22, 0, -1);
			}

		} else if (class325.field3483 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var3 = (var2 >> 4 & 7) + Ignored.field5198;
			var4 = (var2 & 7) + HitSplatDefinition.field2180;
			var5 = var1.readUnsignedByteSub();
			var6 = var1.readUnsignedShortLE();
			var7 = var1.readUnsignedByteAdd();
			var21 = var1.readUnsignedByteNeg() & 31;
			var20 = var1.readUnsignedByteAdd();
			if (var3 >= 0 && var4 >= 0 && var3 < class330.worldView.sizeX && var4 < class330.worldView.sizeY) {
				var30 = var21 + 1;
				if (class152.localPlayer.pathX[0] >= var3 - var30 && class152.localPlayer.pathX[0] <= var3 + var30 && class152.localPlayer.pathY[0] >= var4 - var30 && class152.localPlayer.pathY[0] <= var30 + var4) {
					WorldMapSprite.method6619(class330.worldView.id, var6, var3, var4, var21, var20, var5, var7);
				}
			}

		} else {
			if (class325.field3486 == var0) {
				var2 = var1.readUnsignedShortAdd();
				var3 = var1.readUnsignedByte();
				var4 = (var3 >> 4 & 7) + Ignored.field5198;
				var5 = (var3 & 7) + HitSplatDefinition.field2180;
				var6 = var1.readUnsignedByte();
				var7 = class330.worldView.plane;
				if (var4 >= 0 && var5 >= 0 && var4 < class330.worldView.sizeX && var5 < class330.worldView.sizeY) {
					NodeDeque var8 = class330.worldView.groundItems[var7][var4][var5];
					if (var8 != null) {
						for (TileItem var9 = (TileItem)var8.last(); var9 != null; var9 = (TileItem)var8.previous()) {
							if ((var2 & 32767) == var9.id) {
								var9.setFlag(var6);
								break;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < class330.worldView.sizeX && var5 < class330.worldView.sizeY) {
						var20 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
						PlayerType.method7979(var20, var4, var5, var2, var6);
					}

					return;
				}
			}

			if (class325.field3491 == var0) {
				byte var27 = var1.readByteAdd();
				var3 = var1.readUnsignedByte();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = Client.field524[var4];
				var7 = var1.readUnsignedByte();
				var21 = (var7 >> 4 & 7) + Ignored.field5198;
				var20 = (var7 & 7) + HitSplatDefinition.field2180;
				byte var10 = var1.readByte();
				var11 = var1.readUnsignedShort();
				var12 = var1.readUnsignedShortAdd();
				var13 = var1.readUnsignedShort();
				var14 = var1.readUnsignedShortAddLE();
				byte var15 = var1.readByte();
				byte var16 = var1.readByteSub();
				Player var17;
				if (var14 == Client.localPlayerIndex) {
					var17 = class152.localPlayer;
				} else {
					var17 = (Player)class330.worldView.players.get((long)var14);
				}

				if (var17 != null) {
					var18 = Client.field405 == -1 ? class330.worldView.plane : Client.field405;
					WorldMapCacheName.method6691(var18, var21, var20, var4, var5, var6, var12, var13, var11, var27, var10, var15, var16, var17);
				}
			}

		}
	}
}
