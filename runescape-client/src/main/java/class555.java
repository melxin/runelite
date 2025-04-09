import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class class555 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	public static final class555 field5525;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	public static final class555 field5520;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	public static final class555 field5521;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static Widget field5526;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1356795157
	)
	public final int field5519;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -924494775
	)
	public final int field5528;
	@ObfuscatedName("aq")
	public final Class field5524;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	final class551 field5522;

	static {
		field5525 = new class555(0, 0, Integer.class, new class552());
		field5520 = new class555(1, 1, Long.class, new class554());
		field5521 = new class555(2, 2, String.class, new class556());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lvo;)V"
	)
	class555(int var1, int var2, Class var3, class551 var4) {
		this.field5519 = var1;
		this.field5528 = var2;
		this.field5524 = var3;
		this.field5522 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5528;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Ljava/lang/Object;",
		garbageValue = "1080775832"
	)
	public Object method10144(Buffer var1) {
		return this.field5522.vmethod10160(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvh;",
		garbageValue = "104"
	)
	public static class555[] method10145() {
		return new class555[]{field5520, field5525, field5521};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lvh;",
		garbageValue = "504210649"
	)
	public static class555 method10141(Class var0) {
		class555[] var1 = method10145();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class555 var3 = var1[var2];
			if (var3.field5524 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lvo;",
		garbageValue = "1445494295"
	)
	public static class551 method10142(Class var0) {
		class555 var1 = method10141(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5522;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lwc;",
		garbageValue = "1"
	)
	static SpritePixels method10140() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = class27.SpriteBuffer_spriteHeight;
		var0.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[0];
		var0.yOffset = MusicPatchPcmStream.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class386.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = SpriteBufferProperties.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = class382.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
		MusicPatchPcmStream.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class386.SpriteBuffer_spriteHeights = null;
		class382.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lmx;I)V",
		garbageValue = "912424242"
	)
	static final void method10157(class325 var0) {
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
		int var16;
		byte var19;
		int var20;
		int var27;
		int var31;
		if (class325.field3491 == var0) {
			var2 = var1.readUnsignedIntME();
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedIntIME();
			var5 = var1.readUnsignedByteNeg() * 4;
			var6 = var1.readUnsignedShortLE();
			var7 = var1.readUnsignedShortAddLE();
			byte var34 = var1.readByteSub();
			var19 = var1.readByteNeg();
			var27 = var1.readUnsignedByteAdd();
			var11 = var1.readUnsignedByteNeg() * 4;
			var12 = var1.readUnsignedByte();
			var13 = (var12 >> 4 & 7) + class251.field2775;
			var14 = (var12 & 7) + class300.field3306;
			int var30 = var1.readUnsignedShortLE();
			var20 = var34 + var13;
			var31 = var19 + var14;
			if (var13 >= 0 && var14 >= 0 && var13 < DevicePcmPlayerProvider.worldView.sizeX && var14 < DevicePcmPlayerProvider.worldView.sizeY && var20 >= 0 && var31 >= 0 && var20 < DevicePcmPlayerProvider.worldView.sizeX && var31 < DevicePcmPlayerProvider.worldView.sizeY && var7 != 65535) {
				var16 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
				Message.method1225(var16, var13, var14, var20, var31, var2, var7, var5, var11, var30, var3, var27, var6, var4);
			}

		} else if (class325.field3493 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var3 = (var2 >> 4 & 7) + class251.field2775;
			var4 = (var2 & 7) + class300.field3306;
			var5 = var1.readUnsignedShortLE();
			var6 = var1.readUnsignedByteAdd();
			var7 = var6 >> 2;
			var20 = var6 & 3;
			var31 = Client.field504[var7];
			if (0 <= var3 && var3 < 103 && 0 <= var4 && var4 < 103) {
				var27 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
				PendingSpawn var23 = LoginScreenAnimation.method2744(DevicePcmPlayerProvider.worldView, var27, var3, var4, var31);
				if (var23 != null) {
					ObjectComposition var24 = class162.getObjectDefinition(var23.field1200);
					if (var24.field2909) {
						class400.method7680(var27, var3, var4, var7, var20, var31, var5);
						var23.field1207 = var5;
						return;
					}
				}

				boolean var29 = class400.method7680(var27, var3, var4, var7, var20, var31, var5);
				if (var29) {
					return;
				}

				if (var23 != null) {
					var23.field1207 = var5;
				}
			}

		} else {
			if (class325.field3489 == var0) {
				var2 = var1.readUnsignedShortAdd();
				var3 = var1.readUnsignedByteSub();
				var4 = (var3 >> 4 & 7) + class251.field2775;
				var5 = (var3 & 7) + class300.field3306;
				var6 = var1.readUnsignedByte();
				var7 = DevicePcmPlayerProvider.worldView.plane;
				if (var4 >= 0 && var5 >= 0 && var4 < DevicePcmPlayerProvider.worldView.sizeX && var5 < DevicePcmPlayerProvider.worldView.sizeY) {
					NodeDeque var8 = DevicePcmPlayerProvider.worldView.groundItems[var7][var4][var5];
					if (var8 != null) {
						for (TileItem var26 = (TileItem)var8.last(); var26 != null; var26 = (TileItem)var8.previous()) {
							if ((var2 & 32767) == var26.id) {
								var26.setFlag(var6);
								break;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < DevicePcmPlayerProvider.worldView.sizeX && var5 < DevicePcmPlayerProvider.worldView.sizeY) {
						var31 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						AbstractWorldMapIcon.method6408(var31, var4, var5, var2, var6);
					}

					return;
				}
			}

			if (class325.field3490 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = var1.readUnsignedByteAdd();
				var4 = (var3 >> 4 & 7) + class251.field2775;
				var5 = (var3 & 7) + class300.field3306;
				var6 = var1.readUnsignedByte();
				var7 = var1.readUnsignedShortAddLE();
				var20 = var1.method10372();
				boolean var32 = var1.readUnsignedByte() == 1;
				var27 = var1.readUnsignedShortAddLE();
				var11 = var1.readUnsignedShort();
				if (var4 >= 0 && var5 >= 0 && var4 < DevicePcmPlayerProvider.worldView.sizeX && var5 < DevicePcmPlayerProvider.worldView.sizeY) {
					var12 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
					class339.addTileItemToGroundItems(var12, var4, var5, var27, var20, var2, var7, var11, var6, var32);
				}

			} else {
				if (class325.field3492 == var0) {
					byte var25 = var1.readByteAdd();
					var3 = var1.readUnsignedByteAdd();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.field504[var4];
					var7 = var1.readUnsignedShortAddLE();
					var20 = var1.readUnsignedShortAddLE();
					var19 = var1.readByteAdd();
					byte var10 = var1.readByte();
					var11 = var1.readUnsignedShortAddLE();
					var12 = var1.readUnsignedByte();
					var13 = (var12 >> 4 & 7) + class251.field2775;
					var14 = (var12 & 7) + class300.field3306;
					byte var15 = var1.readByteNeg();
					var16 = var1.readUnsignedShort();
					Player var17;
					if (var11 == Client.localPlayerIndex) {
						var17 = Script.localPlayer;
					} else {
						var17 = (Player)DevicePcmPlayerProvider.worldView.players.get((long)var11);
					}

					if (var17 != null) {
						int var18 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						class243.method5161(var18, var13, var14, var4, var5, var6, var7, var20, var16, var10, var15, var25, var19, var17);
					}
				}

				if (class325.field3484 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = (var2 >> 4 & 7) + class251.field2775;
					var4 = (var2 & 7) + class300.field3306;
					var5 = var1.method10372();
					var6 = var1.readUnsignedShortLE();
					var7 = DevicePcmPlayerProvider.worldView.plane;
					if (0 <= var3 && var3 < 104 && 0 <= var4 && var4 < 104) {
						var20 = Client.field660 == -1 ? var7 : Client.field660;
						class449.method8542(var20, var3, var4, var6, var5);
					}

				} else if (class325.field3488 == var0) {
					var2 = var1.method10378();
					var3 = var1.readUnsignedByte();
					var4 = (var3 >> 4 & 7) + class251.field2775;
					var5 = (var3 & 7) + class300.field3306;
					var6 = var1.readUnsignedShortLE();
					var7 = var1.method10372();
					if (var4 >= 0 && var5 >= 0 && var4 < DevicePcmPlayerProvider.worldView.sizeX && var5 < DevicePcmPlayerProvider.worldView.sizeY) {
						var20 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						StructComposition.method5379(var20, var4, var5, var6, var2, var7);
					}

				} else if (class325.field3495 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = (var2 >> 4 & 7) + class251.field2775;
					var4 = (var2 & 7) + class300.field3306;
					var5 = var1.readUnsignedByteSub();
					var6 = var1.readUnsignedShort();
					var7 = var1.readUnsignedShort();
					if (var3 >= 0 && var4 >= 0 && var3 < DevicePcmPlayerProvider.worldView.sizeX && var4 < DevicePcmPlayerProvider.worldView.sizeY) {
						var3 = Coord.method6897(var3);
						var4 = Coord.method6897(var4);
						var20 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						GraphicsObject var9 = new GraphicsObject(var7, var20, var3, var4, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var3, var4, var20) - var5, var6, Client.cycle);
						DevicePcmPlayerProvider.worldView.graphicsObjects.addFirst(var9);
					}

				} else if (class325.field3496 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = (var2 >> 4 & 7) + class251.field2775;
					var4 = (var2 & 7) + class300.field3306;
					var5 = var1.readUnsignedByteNeg();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var20 = Client.field504[var6];
					if (var3 >= 0 && var4 >= 0 && var3 < DevicePcmPlayerProvider.worldView.sizeX && var4 < DevicePcmPlayerProvider.worldView.sizeY) {
						var31 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						class210.method4716(DevicePcmPlayerProvider.worldView, var31, var3, var4, var20, -1, var6, var7, 31, (String[])null, 0, -1);
					}

				} else if (class325.field3494 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var3 = (var2 >> 4 & 7) + class251.field2775;
					var4 = (var2 & 7) + class300.field3306;
					var5 = var1.readUnsignedByteAdd() & 31;
					var6 = var1.readUnsignedByteAdd();
					var7 = var1.readUnsignedByteAdd();
					var20 = var1.readUnsignedByteSub();
					var31 = var1.readUnsignedShortAddLE();
					if (var3 >= 0 && var4 >= 0 && var3 < DevicePcmPlayerProvider.worldView.sizeX && var4 < DevicePcmPlayerProvider.worldView.sizeY) {
						var27 = var5 + 1;
						if (Script.localPlayer.pathX[0] >= var3 - var27 && Script.localPlayer.pathX[0] <= var27 + var3 && Script.localPlayer.pathY[0] >= var4 - var27 && Script.localPlayer.pathY[0] <= var4 + var27 && Renderable.clientPreferences.getAreaSoundEffectsVolume() != 0 && var20 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var31;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var5 + (var4 << 8) + (var3 << 16);
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var20;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6;
							Client.field552[Client.soundEffectCount] = var7;
							++Client.soundEffectCount;
						}
					}

				} else if (class325.field3486 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readShort();
					var4 = var1.readUnsignedShortAdd();
					var5 = var1.readUnsignedByteSub();
					var6 = (var5 >> 4 & 7) + class251.field2775;
					var7 = (var5 & 7) + class300.field3306;
					short var33 = (short)var1.readShort();
					var31 = var1.method10352();
					var27 = var1.readShort();
					short var28 = (short)var1.readShortLE();
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
						var12 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						class267.method5630(var12, var6, var7, var4, var31, var28, var3, var33, var27, var2);
					}

				} else if (class325.field3487 != var0) {
					if (class325.field3485 == var0) {
						var2 = var1.readUnsignedShortAddLE();
						var3 = var1.method10372();
						var4 = var1.readUnsignedByteSub();
						var5 = (var4 >> 4 & 7) + class251.field2775;
						var6 = (var4 & 7) + class300.field3306;
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var7 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
							class212.method4780(var7, var5, var6, var2, var3);
						}

					}
				} else {
					var2 = var1.readUnsignedByteNeg();
					var3 = var1.readUnsignedByteNeg();
					String[] var21 = null;
					if (var3 > 0) {
						var21 = new String[5];

						for (var5 = 0; var5 < var3; ++var5) {
							var6 = var1.readUnsignedByteNeg();
							String var22 = var1.readStringCp1252NullTerminated();
							if (var6 >= 0 && var6 < 5) {
								var21[var6] = var22;
							}
						}
					}

					var5 = var1.readUnsignedShortAdd();
					var6 = var1.readUnsignedByteNeg();
					var7 = var6 >> 2;
					var20 = var6 & 3;
					var31 = Client.field504[var7];
					var27 = var1.readUnsignedByteNeg();
					var11 = (var27 >> 4 & 7) + class251.field2775;
					var12 = (var27 & 7) + class300.field3306;
					if (var11 >= 0 && var12 >= 0 && var11 < DevicePcmPlayerProvider.worldView.sizeX && var12 < DevicePcmPlayerProvider.worldView.sizeY) {
						var13 = Client.field660 == -1 ? DevicePcmPlayerProvider.worldView.plane : Client.field660;
						class210.method4716(DevicePcmPlayerProvider.worldView, var13, var11, var12, var31, var5, var7, var20, var2, var21, 0, -1);
					}

				}
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)I",
		garbageValue = "-3"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return UserComparator6.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
