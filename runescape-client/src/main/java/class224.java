import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class224 {
	@ObfuscatedName("ao")
	public String field2450;
	@ObfuscatedName("ad")
	public float[] field2447;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1579963723
	)
	public int field2451;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -937616875
	)
	public int field2453;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -116708463
	)
	public int field2454;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class223 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	class224(class223 var1) {
		this.this$0 = var1;
		this.field2447 = new float[4];
		this.field2451 = 1;
		this.field2453 = 1;
		this.field2454 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "0"
	)
	public static int method5045(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lmr;B)V",
		garbageValue = "-9"
	)
	static final void method5046(class323 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var20;
		if (class323.field3432 == var0) {
			var2 = var1.readUnsignedShortLE();
			var3 = var1.readUnsignedByteNeg();
			var4 = var1.readUnsignedByteSub();
			var5 = (var4 >> 4 & 7) + AbstractWorldMapData.field3215;
			var6 = (var4 & 7) + class360.field3857;
			var7 = var1.readUnsignedShortLE();
			if (var5 >= 0 && var6 >= 0 && var5 < class30.worldView.sizeX && var6 < class30.worldView.sizeY) {
				var5 = Coord.method6980(var5);
				var6 = Coord.method6980(var6);
				var20 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
				GraphicsObject var31 = new GraphicsObject(var2, var20, var5, var6, Canvas.getTileHeight(class30.worldView, var5, var6, var20) - var3, var7, Client.cycle);
				class30.worldView.graphicsObjects.addFirst(var31);
			}

		} else {
			int var10;
			int var19;
			if (class323.field3430 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field578[var3];
				var6 = var1.readUnsignedByteAdd();
				var7 = (var6 >> 4 & 7) + AbstractWorldMapData.field3215;
				var20 = (var6 & 7) + class360.field3857;
				var19 = var1.readUnsignedShortAdd();
				if (0 <= var7 && var7 < 103 && 0 <= var20 && var20 < 103) {
					var10 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
					PendingSpawn var23 = BuddyRankComparator.method3365(class30.worldView, var10, var7, var20, var5);
					if (var23 != null) {
						ObjectComposition var24 = class142.getObjectDefinition(var23.field1192);
						if (var24.field2840) {
							var23.field1189 = var19;
							return;
						}
					}

					boolean var34 = class323.method6619(var10, var7, var20, var3, var4, var5, var19);
					if (var34) {
						return;
					}

					if (var23 != null) {
						var23.field1189 = var19;
					}
				}

			} else {
				int var11;
				int var12;
				if (class323.field3431 == var0) {
					var2 = var1.readInt();
					short var28 = (short)var1.readSignedShort();
					short var30 = (short)var1.readShortLE();
					var5 = var1.readUnsignedByteSub();
					var6 = (var5 >> 4 & 7) + AbstractWorldMapData.field3215;
					var7 = (var5 & 7) + class360.field3857;
					var20 = var1.readUnsignedShort();
					var19 = var1.readUnsignedShortLE();
					var10 = var1.readShort();
					var11 = var1.method10325();
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
						var12 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
						class482.method9366(var12, var6, var7, var19, var2, var30, var10, var28, var11, var20);
					}

				} else {
					if (class323.field3423 == var0) {
						var2 = var1.readUnsignedShortLE();
						var3 = var1.readUnsignedByte();
						var4 = var1.readUnsignedByteAdd();
						var5 = (var4 >> 4 & 7) + AbstractWorldMapData.field3215;
						var6 = (var4 & 7) + class360.field3857;
						var7 = class30.worldView.plane;
						if (var5 >= 0 && var6 >= 0 && var5 < class30.worldView.sizeX && var6 < class30.worldView.sizeY) {
							NodeDeque var8 = class30.worldView.groundItems[var7][var5][var6];
							if (var8 != null) {
								for (TileItem var9 = (TileItem)var8.last(); var9 != null; var9 = (TileItem)var8.previous()) {
									if ((var2 & 32767) == var9.id) {
										var9.setFlag(var3);
										break;
									}
								}
							}

							if (var5 >= 0 && var6 >= 0 && var5 < class30.worldView.sizeX && var6 < class30.worldView.sizeY) {
								var19 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
								HttpRequest.method92(var19, var5, var6, var2, var3);
							}

							return;
						}
					}

					if (class323.field3424 == var0) {
						var2 = var1.readUnsignedShortLE();
						var3 = var1.readUnsignedByteSub();
						var4 = (var3 >> 4 & 7) + AbstractWorldMapData.field3215;
						var5 = (var3 & 7) + class360.field3857;
						var6 = var1.readUnsignedIntLE();
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
							var7 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
							class323.method6617(var7, var4, var5, var2, var6);
						}

					} else if (class323.field3427 == var0) {
						var2 = var1.readUnsignedByteSub();
						var3 = (var2 >> 4 & 7) + AbstractWorldMapData.field3215;
						var4 = (var2 & 7) + class360.field3857;
						var5 = var1.readUnsignedByteAdd();
						var6 = var5 >> 2;
						var7 = var5 & 3;
						var20 = Client.field578[var6];
						if (var3 >= 0 && var4 >= 0 && var3 < class30.worldView.sizeX && var4 < class30.worldView.sizeY) {
							var19 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
							Varcs.method3211(class30.worldView, var19, var3, var4, var20, -1, var6, var7, 31, (String[])null, 0, -1);
						}

					} else if (class323.field3433 == var0) {
						var2 = var1.readInt();
						var3 = var1.readUnsignedIntME();
						var4 = var1.readUnsignedByteAdd();
						var5 = (var4 >> 4 & 7) + AbstractWorldMapData.field3215;
						var6 = (var4 & 7) + class360.field3857;
						var7 = var1.readUnsignedShortAddLE();
						if (var5 >= 0 && var6 >= 0 && var5 < class30.worldView.sizeX && var6 < class30.worldView.sizeY) {
							var20 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
							Login.method2450(var20, var5, var6, var7, var3, var2);
						}

					} else {
						int var13;
						if (class323.field3425 != var0) {
							if (class323.field3420 == var0) {
								var2 = var1.readUnsignedShort();
								var3 = var1.readUnsignedByteSub();
								var4 = (var3 >> 4 & 7) + AbstractWorldMapData.field3215;
								var5 = (var3 & 7) + class360.field3857;
								var6 = var1.readInt();
								var7 = class30.worldView.plane;
								if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
									var20 = Client.field767 == -1 ? var7 : Client.field767;
									WorldView.method2997(var20, var4, var5, var2, var6);
								}

							} else if (class323.field3429 == var0) {
								var2 = var1.readUnsignedByte();
								var3 = var1.readUnsignedByteAdd();
								var4 = (var3 >> 4 & 7) + AbstractWorldMapData.field3215;
								var5 = (var3 & 7) + class360.field3857;
								var6 = var1.readUnsignedShort();
								var7 = var1.readUnsignedByteAdd();
								var20 = var1.readUnsignedByteAdd();
								var19 = var1.readUnsignedByteNeg() & 31;
								if (var4 >= 0 && var5 >= 0 && var4 < class30.worldView.sizeX && var5 < class30.worldView.sizeY) {
									var10 = var19 + 1;
									if (ModeWhere.localPlayer.pathX[0] >= var4 - var10 && ModeWhere.localPlayer.pathX[0] <= var4 + var10 && ModeWhere.localPlayer.pathY[0] >= var5 - var10 && ModeWhere.localPlayer.pathY[0] <= var5 + var10 && class544.clientPreferences.getAreaSoundEffectsVolume() != 0 && var7 > 0 && Client.soundEffectCount < 50) {
										Client.soundEffectIds[Client.soundEffectCount] = var6;
										Client.soundEffects[Client.soundEffectCount] = null;
										Client.soundLocations[Client.soundEffectCount] = var19 + (var5 << 8) + (var4 << 16);
										Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7;
										Client.queuedSoundEffectDelays[Client.soundEffectCount] = var20;
										Client.field753[Client.soundEffectCount] = var2;
										++Client.soundEffectCount;
									}
								}

							} else if (class323.field3419 == var0) {
								var2 = var1.readUnsignedByteAdd();
								var3 = (var2 >> 4 & 7) + AbstractWorldMapData.field3215;
								var4 = (var2 & 7) + class360.field3857;
								var5 = var1.readUnsignedByteNeg();
								var6 = var1.readUnsignedShortAdd();
								var7 = var1.readUnsignedByteNeg();
								var20 = var7 >> 2;
								var19 = var7 & 3;
								var10 = Client.field578[var20];
								if (var3 >= 0 && var4 >= 0 && var3 < class30.worldView.sizeX && var4 < class30.worldView.sizeY) {
									var11 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
									Varcs.method3211(class30.worldView, var11, var3, var4, var10, var6, var20, var19, var5, (String[])null, 0, -1);
								}

							} else if (class323.field3421 == var0) {
								var2 = var1.readUnsignedByteAdd();
								var3 = var1.readUnsignedShortAddLE();
								var4 = var1.readUnsignedIntME();
								boolean var27 = var1.readUnsignedByteAdd() == 1;
								var6 = var1.readUnsignedShort();
								var7 = var1.readUnsignedShort();
								var20 = var1.readUnsignedByteAdd();
								var19 = var1.readUnsignedByteSub();
								var10 = (var19 >> 4 & 7) + AbstractWorldMapData.field3215;
								var11 = (var19 & 7) + class360.field3857;
								if (var10 >= 0 && var11 >= 0 && var10 < class30.worldView.sizeX && var11 < class30.worldView.sizeY) {
									var12 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
									InvDefinition.addTileItemToGroundItems(var12, var10, var11, var7, var4, var2, var3, var6, var20, var27);
								}

							} else {
								int var14;
								int var15;
								int var16;
								if (class323.field3422 == var0) {
									byte var25 = var1.readByteAdd();
									var3 = var1.readUnsignedShortLE();
									byte var26 = var1.readByteAdd();
									var5 = var1.readUnsignedShort();
									byte var29 = var1.readByteNeg();
									var7 = var1.readUnsignedByteSub();
									var20 = (var7 >> 4 & 7) + AbstractWorldMapData.field3215;
									var19 = (var7 & 7) + class360.field3857;
									var10 = var1.readUnsignedShortLE();
									var11 = var1.readUnsignedShort();
									byte var33 = var1.readByte();
									var13 = var1.readUnsignedByte();
									var14 = var13 >> 2;
									var15 = var13 & 3;
									var16 = Client.field578[var14];
									Player var17;
									if (var3 == Client.localPlayerIndex) {
										var17 = ModeWhere.localPlayer;
									} else {
										var17 = class30.worldView.players[var3];
									}

									if (var17 != null) {
										int var18 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
										class384.method7652(var18, var20, var19, var14, var15, var16, var5, var11, var10, var29, var33, var26, var25, var17);
									}
								}

								if (class323.field3428 == var0) {
									var2 = var1.readUnsignedByteNeg() * 4;
									var3 = var1.readUnsignedByte();
									var4 = var1.readUnsignedShort();
									var5 = var1.method10330();
									var6 = var1.readUnsignedByte() * 4;
									var7 = var1.readUnsignedByte();
									var20 = (var7 >> 4 & 7) + AbstractWorldMapData.field3215;
									var19 = (var7 & 7) + class360.field3857;
									byte var32 = var1.readByteNeg();
									var11 = var1.readUnsignedShortAdd();
									var12 = var1.readUnsignedShortLE();
									var13 = var1.readUnsignedShortLE();
									byte var35 = var1.readByte();
									var15 = var1.method10330();
									var10 = var32 + var20;
									var14 = var35 + var19;
									if (var20 >= 0 && var19 >= 0 && var20 < class30.worldView.sizeX && var19 < class30.worldView.sizeY && var10 >= 0 && var14 >= 0 && var10 < class30.worldView.sizeX && var14 < class30.worldView.sizeY && var11 != 65535) {
										var16 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
										UserComparator7.method3332(var16, var20, var19, var10, var14, var5, var11, var6, var2, var13, var12, var3, var4, var15);
									}

								}
							}
						} else {
							var2 = var1.readUnsignedByte();
							var3 = (var2 >> 4 & 7) + AbstractWorldMapData.field3215;
							var4 = (var2 & 7) + class360.field3857;
							var5 = var1.readUnsignedByteNeg();
							var6 = var5 >> 2;
							var7 = var5 & 3;
							var20 = Client.field578[var6];
							var19 = var1.readUnsignedByteNeg();
							String[] var21 = null;
							if (var19 > 0) {
								var21 = new String[5];

								for (var11 = 0; var11 < var19; ++var11) {
									var12 = var1.readUnsignedByteAdd();
									String var22 = var1.readStringCp1252NullTerminated();
									if (var12 >= 0 && var12 < 5) {
										var21[var12] = var22;
									}
								}
							}

							var11 = var1.readUnsignedByteNeg();
							var12 = var1.readUnsignedShort();
							if (var3 >= 0 && var4 >= 0 && var3 < class30.worldView.sizeX && var4 < class30.worldView.sizeY) {
								var13 = Client.field767 == -1 ? class30.worldView.plane : Client.field767;
								Varcs.method3211(class30.worldView, var13, var3, var4, var20, var12, var6, var7, var11, var21, 0, -1);
							}

						}
					}
				}
			}
		}
	}
}
