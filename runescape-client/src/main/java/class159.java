import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class159 extends class150 {
	@ObfuscatedName("ab")
	String field1729;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class159(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1729 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.name = this.field1729;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Laj;I)Lae;",
		garbageValue = "564249290"
	)
	public static class3 method3521(class6 var0) {
		switch(var0.field19) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldt;",
		garbageValue = "1718649965"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class224.method4448(var1, var0);
		Script var4 = class31.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = class31.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var6 = var0 + -512;
				var4 = class31.getScript(var6, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-1722691019"
	)
	static final void method3522(class323 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		if (class323.field3423 == var0) {
			var2 = var1.readUnsignedShort();
			byte var3 = var1.readByteSub();
			byte var4 = var1.readByte();
			var5 = var1.readUnsignedShortLE();
			var6 = var1.readUnsignedByte();
			var7 = (var6 >> 4 & 7) + class178.field1859;
			var8 = (var6 & 7) + class201.field2085;
			byte var9 = var1.readByte();
			var10 = var1.readUnsignedShortAdd();
			var11 = var1.readUnsignedShortLE();
			var12 = var1.readUnsignedByteNeg();
			var13 = var12 >> 2;
			var14 = var12 & 3;
			var15 = Client.field588[var13];
			byte var16 = var1.readByteNeg();
			Player var17;
			if (var10 == Client.localPlayerIndex) {
				var17 = AsyncHttpResponse.localPlayer;
			} else {
				var17 = Projection.worldView.players[var10];
			}

			if (var17 != null) {
				int var18 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
				Decimator.method1108(var18, var7, var8, var13, var14, var15, var5, var2, var11, var16, var4, var9, var3, var17);
			}
		}

		int var23;
		int var24;
		if (class323.field3425 == var0) {
			var2 = var1.readUnsignedShort();
			var23 = var1.readUnsignedByteAdd();
			var24 = var1.readUnsignedShortAdd();
			var5 = var1.readUnsignedByteNeg();
			var6 = (var5 >> 4 & 7) + class178.field1859;
			var7 = (var5 & 7) + class201.field2085;
			if (var6 >= 0 && var7 >= 0 && var6 < Projection.worldView.sizeX && var7 < Projection.worldView.sizeY) {
				var6 = Coord.method6843(var6);
				var7 = Coord.method6843(var7);
				var8 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
				GraphicsObject var33 = new GraphicsObject(var2, var8, var6, var7, class77.getTileHeight(Projection.worldView, var6, var7, var8) - var23, var24, Client.cycle);
				Projection.worldView.graphicsObjects.addFirst(var33);
			}

		} else {
			int var26;
			if (class323.field3421 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var23 = var1.readUnsignedByte();
				var24 = var1.readUnsignedShort();
				var5 = var1.readUnsignedShortAdd();
				var6 = var1.readUnsignedShortLE();
				var7 = var1.readUnsignedIntME();
				var8 = var1.readUnsignedByteSub();
				var26 = (var8 >> 4 & 7) + class178.field1859;
				var10 = (var8 & 7) + class201.field2085;
				boolean var28 = var1.readUnsignedByteSub() == 1;
				if (var26 >= 0 && var10 >= 0 && var26 < Projection.worldView.sizeX && var10 < Projection.worldView.sizeY) {
					var12 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
					class273.addTileItemToGroundItems(var12, var26, var10, var6, var7, var23, var24, var5, var2, var28);
				}

			} else if (class323.field3420 == var0) {
				var2 = var1.method10244();
				var23 = var1.readUnsignedShortAdd();
				var24 = var1.readUnsignedShort();
				var5 = var1.readUnsignedShortAdd();
				var6 = var1.readUnsignedByteNeg();
				var7 = (var6 >> 4 & 7) + class178.field1859;
				var8 = (var6 & 7) + class201.field2085;
				var26 = var1.readUnsignedShortAdd();
				var10 = var1.method10309();
				var11 = var1.readUnsignedByte() * 4;
				byte var30 = var1.readByteSub();
				var13 = var1.readUnsignedByteSub() * 4;
				byte var31 = var1.readByteSub();
				var15 = var1.readUnsignedByteSub();
				var12 = var30 + var7;
				var14 = var31 + var8;
				if (var7 >= 0 && var8 >= 0 && var7 < Projection.worldView.sizeX && var8 < Projection.worldView.sizeY && var12 >= 0 && var14 >= 0 && var12 < Projection.worldView.sizeX && var14 < Projection.worldView.sizeY && var24 != 65535) {
					int var32 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
					class508.method9412(var32, var7, var8, var12, var14, var10, var24, var11, var13, var5, var23, var15, var26, var2);
				}

			} else if (class323.field3419 == var0) {
				var2 = var1.readUnsignedByteSub();
				var23 = var2 >> 2;
				var24 = var2 & 3;
				var5 = Client.field588[var23];
				var6 = var1.readUnsignedByte();
				var7 = (var6 >> 4 & 7) + class178.field1859;
				var8 = (var6 & 7) + class201.field2085;
				if (var7 >= 0 && var8 >= 0 && var7 < Projection.worldView.sizeX && var8 < Projection.worldView.sizeY) {
					var26 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
					class180.method3754(Projection.worldView, var26, var7, var8, var5, -1, var23, var24, 31, 0, -1);
				}

			} else if (class323.field3418 == var0) {
				var2 = var1.readUnsignedByteSub();
				var23 = (var2 >> 4 & 7) + class178.field1859;
				var24 = (var2 & 7) + class201.field2085;
				var5 = var1.readUnsignedShortAdd();
				var6 = var1.readInt();
				var7 = var1.readUnsignedIntIME();
				if (var23 >= 0 && var24 >= 0 && var23 < Projection.worldView.sizeX && var24 < Projection.worldView.sizeY) {
					var8 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
					WorldMapArea.method5907(var8, var23, var24, var5, var6, var7);
				}

			} else if (class323.field3426 == var0) {
				var2 = var1.readUnsignedByteSub();
				var23 = (var2 >> 4 & 7) + class178.field1859;
				var24 = (var2 & 7) + class201.field2085;
				var5 = var1.readUnsignedByteNeg() & 31;
				var6 = var1.readUnsignedShortLE();
				var7 = var1.readUnsignedByte();
				var8 = var1.readUnsignedByte();
				var26 = var1.readUnsignedByteAdd();
				if (var23 >= 0 && var24 >= 0 && var23 < Projection.worldView.sizeX && var24 < Projection.worldView.sizeY) {
					var10 = var5 + 1;
					if (AsyncHttpResponse.localPlayer.pathX[0] >= var23 - var10 && AsyncHttpResponse.localPlayer.pathX[0] <= var10 + var23 && AsyncHttpResponse.localPlayer.pathY[0] >= var24 - var10 && AsyncHttpResponse.localPlayer.pathY[0] <= var10 + var24 && SecureUrlRequester.clientPreferences.getAreaSoundEffectsVolume() != 0 && var7 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var6;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var5 + (var24 << 8) + (var23 << 16);
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var26;
						Client.field763[Client.soundEffectCount] = var8;
						++Client.soundEffectCount;
					}
				}

			} else if (class323.field3428 == var0) {
				var2 = var1.readShort();
				short var25 = (short)var1.readSignedShort();
				var24 = var1.readUnsignedByteAdd();
				var5 = (var24 >> 4 & 7) + class178.field1859;
				var6 = (var24 & 7) + class201.field2085;
				var7 = var1.readUnsignedShortLE();
				var8 = var1.readShortLE();
				var26 = var1.readInt();
				var10 = var1.readUnsignedShortAdd();
				short var27 = (short)var1.readShort();
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
					var12 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
					SpotAnimationDefinition.method3990(var12, var5, var6, var7, var26, var27, var8, var25, var2, var10);
				}

			} else {
				if (class323.field3422 == var0) {
					var2 = var1.readUnsignedByte();
					var23 = var1.readUnsignedByteAdd();
					var24 = (var23 >> 4 & 7) + class178.field1859;
					var5 = (var23 & 7) + class201.field2085;
					var6 = var1.readUnsignedShortLE();
					var7 = Projection.worldView.plane;
					if (var24 >= 0 && var5 >= 0 && var24 < Projection.worldView.sizeX && var5 < Projection.worldView.sizeY) {
						NodeDeque var19 = Projection.worldView.groundItems[var7][var24][var5];
						if (var19 != null) {
							for (TileItem var20 = (TileItem)var19.last(); var20 != null; var20 = (TileItem)var19.previous()) {
								if ((var6 & 32767) == var20.id) {
									var20.setFlag(var2);
									break;
								}
							}
						}

						if (var24 >= 0 && var5 >= 0 && var24 < Projection.worldView.sizeX && var5 < Projection.worldView.sizeY) {
							var26 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
							WorldMapSection0.method6174(var26, var24, var5, var6, var2);
						}

						return;
					}
				}

				if (class323.field3424 == var0) {
					var2 = var1.readUnsignedShortLE();
					var23 = var1.readUnsignedByteAdd();
					var24 = (var23 >> 4 & 7) + class178.field1859;
					var5 = (var23 & 7) + class201.field2085;
					var6 = var1.readInt();
					var7 = Projection.worldView.plane;
					if (0 <= var24 && var24 < 104 && 0 <= var5 && var5 < 104) {
						var8 = Client.field567 == -1 ? var7 : Client.field567;
						class188.method3856(var8, var24, var5, var2, var6);
					}

				} else if (class323.field3429 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var23 = var1.readUnsignedShort();
					var24 = var1.readUnsignedByteSub();
					var5 = var24 >> 2;
					var6 = var24 & 3;
					var7 = Client.field588[var5];
					var8 = var1.readUnsignedByte();
					var26 = (var8 >> 4 & 7) + class178.field1859;
					var10 = (var8 & 7) + class201.field2085;
					if (var26 >= 0 && var10 >= 0 && var26 < Projection.worldView.sizeX && var10 < Projection.worldView.sizeY) {
						var11 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
						class180.method3754(Projection.worldView, var11, var26, var10, var7, var23, var5, var6, var2, 0, -1);
					}

				} else if (class323.field3427 == var0) {
					var2 = var1.readUnsignedShort();
					var23 = var1.readUnsignedIntLE();
					var24 = var1.readUnsignedByteAdd();
					var5 = (var24 >> 4 & 7) + class178.field1859;
					var6 = (var24 & 7) + class201.field2085;
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var7 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
						class327.method6473(var7, var5, var6, var2, var23);
					}

				} else if (class323.field3430 == var0) {
					var2 = var1.readUnsignedShortLE();
					var23 = var1.readUnsignedByte();
					var24 = (var23 >> 4 & 7) + class178.field1859;
					var5 = (var23 & 7) + class201.field2085;
					var6 = var1.readUnsignedByteSub();
					var7 = var6 >> 2;
					var8 = var6 & 3;
					var26 = Client.field588[var7];
					if (0 <= var24 && var24 < 103 && 0 <= var5 && var5 < 103) {
						var10 = Client.field567 == -1 ? Projection.worldView.plane : Client.field567;
						PendingSpawn var21 = class433.method8339(Projection.worldView, var10, var24, var5, var26);
						if (var21 != null) {
							ObjectComposition var22 = HttpMethod.getObjectDefinition(var21.field1191);
							if (var22.field2208) {
								var21.field1189 = var2;
								return;
							}
						}

						boolean var29 = class27.method398(var10, var24, var5, var7, var8, var26, var2);
						if (var29) {
							return;
						}

						if (var21 != null) {
							var21.field1189 = var2;
						}
					}

				}
			}
		}
	}
}
