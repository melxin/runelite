import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class381 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4308(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4309(2, 2);

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field4313;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1508883517
	)
	public final int field4307;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1250854929
	)
	int field4311;

	class381(int var3, int var4) {
		this.field4307 = var3;
		this.field4311 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4311;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "124772969"
	)
	static boolean method8158(int var0) {
		return var0 != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpq;",
		garbageValue = "52"
	)
	public static class391[] method8165() {
		return new class391[]{class391.field4700, class391.field4696, class391.TOKEN};
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-2141405868"
	)
	static int method8168(int var0, Script var1, boolean var2) {
		DynamicArray var8;
		DynamicArray var9;
		if (var0 == 8000) {
			SecureRandomFuture.Interpreter_objectStackSize -= 2;
			var9 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
			var8 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
			class101.method3100(var9, var8);
			return 1;
		} else {
			int var3;
			int var4;
			DynamicArray var5;
			if (var0 == 8001) {
				AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
				var5 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
				class448.method9073(var5, var3, var4);
				return 1;
			} else if (var0 == 8002) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 == null ? 1 : 0;
				return 1;
			} else if (var0 == 8003) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var9 != null ? var9.method10351() : 0;
				return 1;
			} else if (var0 == 8004) {
				SecureRandomFuture.Interpreter_objectStackSize -= 2;
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
				var8 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class165.method4008(var9, var8);
				return 1;
			} else {
				DynamicArray var7;
				int var10;
				Object var13;
				if (var0 == 8005) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					var13 = class28.method462(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? class375.method8135(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8006) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					var13 = class28.method462(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? class292.method6704(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8007) {
					AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
					var13 = class28.method462(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7 != null ? WorldMapSection0.method6725(var7, var13, var3, var4) : 0;
					return 1;
				} else {
					String var14;
					if (var0 == 8008) {
						var9 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						var4 = MouseRecorder.method2126(var9);
						if (var9.field5399 == class570.field5721) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10348()[var4] : -1;
						} else {
							if (var9.field5399 != class570.field5718) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10393()[var4] : null));
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8009) {
						var9 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						var4 = class392.method8222(var9);
						if (var9.field5399 == class570.field5721) {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10348()[var4] : -1;
						} else {
							if (var9.field5399 != class570.field5718) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10393()[var4] : null));
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8010) {
						AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
						var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
						var13 = class28.method462(var10);
						var7 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						class389.method8205(var7, var13, var3, var4);
						return 1;
					} else {
						DynamicArray var6;
						if (var0 == 8011) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
							var6 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							class101.method3098(var6, var3, 1, var4, var10);
							return 1;
						} else if (var0 == 8012) {
							var9 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							BufferedSink.method10274(var9);
							return 1;
						} else if (var0 == 8013) {
							var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							var8 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							StudioGame.method8179(var8, var3);
							return 1;
						} else if (var0 == 8014) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var5 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							FriendsChat.method9903(var5, var3, var4);
							return 1;
						} else if (var0 == 8015) {
							AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
							SecureRandomFuture.Interpreter_objectStackSize -= 2;
							var6 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							var7 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
							class442.method8957(var6, var7, var3, var4, var10);
							return 1;
						} else if (var0 == 8016) {
							var9 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = (int)MusicPatch.method7314(var9);
							return 1;
						} else if (var0 == 8017) {
							var9 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = HealthBarDefinition.method4258(var9, var4);
							return 1;
						} else {
							String var17;
							if (var0 == 8018) {
								SecureRandomFuture.Interpreter_objectStackSize -= 2;
								String var16 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = UrlRequest.method3470(var16, var17);
								return 1;
							} else if (var0 == 8019) {
								SecureRandomFuture.Interpreter_objectStackSize -= 2;
								var9 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = FontName.method10901(var9, var17);
								return 1;
							} else {
								EnumComposition var12;
								if (var0 == 8020) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
									var12 = class159.getEnum(var4);
									if (var3 != var12.inputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var12.method4288();
										return 1;
									}
								} else if (var0 == 8021) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
									var12 = class159.getEnum(var4);
									if (var3 != var12.outputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var12.method4272();
										return 1;
									}
								} else if (var0 == 8022) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 3;
									var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
									var10 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
									if (var10 < var4) {
										var10 = var4;
									}

									if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
										if (var3 == 115) {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class570.field5718, "", var4, var10);
										} else if (var3 != 105 && var3 != 49) {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class570.field5721, -1, var4, var10);
										} else {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class570.field5721, 0, var4, var10);
										}

										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8023) {
									var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
									var8 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
									if (var3 >= 0 && var3 <= 5000) {
										var8.method10354(var3);
										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8024) {
									var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
									Object var15 = class28.method462(var3);
									var5 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
									class504.method10191(var5, var5.method10351(), var15);
									return 1;
								} else {
									Object var11;
									if (var0 == 8025) {
										AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
										var11 = class28.method462(var4);
										var6 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										class504.method10191(var6, var3, var11);
										return 1;
									} else if (var0 == 8026) {
										var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
										var8 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var11 = HttpHeaders.method9794(var8, var3);
										class570.method11073(var8.field5399, var11);
										return 1;
									} else if (var0 == 8027) {
										SecureRandomFuture.Interpreter_objectStackSize -= 2;
										var9 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var8 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
										Projection.method5413(var9, var8, var9.method10351());
										return 1;
									} else if (var0 == 8028) {
										var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
										SecureRandomFuture.Interpreter_objectStackSize -= 2;
										var8 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var5 = class533.method10575(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
										Projection.method5413(var8, var5, var3);
										return 1;
									} else if (var0 == 8029) {
										AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
										var5 = class533.method10575(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										ScriptFrame.method764(var5, var3, var4);
										return 1;
									} else {
										return 2;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lms;I)V",
		garbageValue = "65536"
	)
	static final void method8166(class326 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var13;
		int var14;
		int var15;
		int var16;
		int var18;
		int var21;
		int var31;
		int var32;
		int var33;
		int var35;
		if (class326.field3557 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedShortLE();
			var6 = var1.readUnsignedShortAddLE();
			var7 = var1.readUnsignedByteNeg();
			var21 = var1.readUnsignedIntLE();
			var35 = Coord.method7426(var21);
			var31 = Coord.method7392(var21);
			var32 = Coord.method7451(var21);
			var33 = var1.method11278();
			var13 = var1.readUnsignedShortAddLE();
			var14 = var1.readUnsignedByte();
			var15 = class81.worldView.plane;
			var16 = (var14 >> 4 & 7) + class67.field906 + class81.worldView.baseX;
			int var26 = (var14 & 7) + WorldMapArea.field3255 + class81.worldView.baseY;
			var18 = var1.method11278();
			if (var4 != 65535) {
				Projectile var19 = new Projectile(var15, var16, var26, var2, var33, var35, var31, var32, var6, var18, var4, var13 + Client.cycle, var5 + Client.cycle, var7, var3);
				Client.projectiles.addFirst(var19);
			}

		} else {
			if (class326.field3558 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = var1.readUnsignedShortAdd();
				var4 = var1.readUnsignedByteAdd();
				var5 = (var4 >> 4 & 7) + class67.field906;
				var6 = (var4 & 7) + WorldMapArea.field3255;
				var7 = class81.worldView.plane;
				if (var5 >= 0 && var6 >= 0 && var5 < class81.worldView.sizeX && var6 < class81.worldView.sizeY) {
					NodeDeque var8 = class81.worldView.groundItems[var7][var5][var6];
					if (var8 != null) {
						for (TileItem var29 = (TileItem)var8.last(); var29 != null; var29 = (TileItem)var8.previous()) {
							if ((var3 & 32767) == var29.id) {
								var29.setFlag(var2);
								break;
							}
						}
					}

					if (var5 >= 0 && var6 >= 0 && var5 < class81.worldView.sizeX && var6 < class81.worldView.sizeY) {
						var35 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						SequenceDefinition.method4724(var35, var5, var6, var3, var2);
					}

					return;
				}
			}

			if (class326.field3550 == var0) {
				var2 = var1.readUnsignedShort();
				var3 = var1.readUnsignedShort();
				short var27 = (short)var1.method9343();
				var5 = var1.readShortLE();
				short var30 = (short)var1.method9343();
				var7 = var1.readUnsignedIntIME();
				var21 = var1.readUnsignedByteSub();
				var35 = (var21 >> 4 & 7) + class67.field906;
				var31 = (var21 & 7) + WorldMapArea.field3255;
				var32 = var1.readSignedShort();
				if (var35 >= 0 && var31 >= 0 && var35 < 104 && var31 < 104) {
					var33 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
					class30.method482(var33, var35, var31, var2, var7, var30, var5, var27, var32, var3);
				}

			} else if (class326.field3562 == var0) {
				var2 = var1.readUnsignedShort();
				var3 = var1.readUnsignedByteSub();
				var4 = (var3 >> 4 & 7) + class67.field906;
				var5 = (var3 & 7) + WorldMapArea.field3255;
				var6 = var1.readInt();
				var7 = class81.worldView.plane;
				if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
					var21 = Client.overheadTextLimit == -1 ? var7 : Client.overheadTextLimit;
					class487.method9869(var21, var4, var5, var2, var6);
				}

			} else if (class326.field3554 == var0) {
				var2 = var1.readUnsignedByteNeg();
				var3 = (var2 >> 4 & 7) + class67.field906;
				var4 = (var2 & 7) + WorldMapArea.field3255;
				var5 = var1.readUnsignedByteSub();
				var6 = var1.readUnsignedByteNeg();
				var7 = var1.readUnsignedShortAdd();
				var21 = var1.readUnsignedByte();
				var35 = var1.readUnsignedByteSub() & 31;
				if (var3 >= 0 && var4 >= 0 && var3 < class81.worldView.sizeX && var4 < class81.worldView.sizeY) {
					var31 = var35 + 1;
					if (class27.localPlayer.pathX[0] >= var3 - var31 && class27.localPlayer.pathX[0] <= var31 + var3 && class27.localPlayer.pathY[0] >= var4 - var31 && class27.localPlayer.pathY[0] <= var31 + var4) {
						class7.method56(class81.worldView.id, var7, var3, var4, var35, var21, var6, var5);
					}
				}

			} else {
				if (class326.field3552 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedByteNeg();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.field298[var4];
					var7 = var1.readUnsignedShort();
					var21 = var1.readUnsignedShortAddLE();
					byte var20 = var1.readByte();
					byte var10 = var1.readByteSub();
					byte var11 = var1.readByteSub();
					byte var12 = var1.readByte();
					var13 = var1.readUnsignedShortAddLE();
					var14 = var1.readUnsignedByteSub();
					var15 = (var14 >> 4 & 7) + class67.field906;
					var16 = (var14 & 7) + WorldMapArea.field3255;
					Player var17;
					if (var13 == Client.localPlayerIndex) {
						var17 = class27.localPlayer;
					} else {
						var17 = (Player)class81.worldView.players.get((long)var13);
					}

					if (var17 != null) {
						var18 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						class523.method10505(var18, var15, var16, var4, var5, var6, var2, var21, var7, var20, var10, var12, var11, var17);
					}
				}

				if (class326.field3559 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedShortLE();
					var4 = var1.readUnsignedShort();
					boolean var28 = var1.readUnsignedByteNeg() == 1;
					var6 = var1.readUnsignedByteAdd();
					var7 = var1.readUnsignedByteNeg();
					var21 = var1.readUnsignedByteNeg();
					var35 = (var21 >> 4 & 7) + class67.field906;
					var31 = (var21 & 7) + WorldMapArea.field3255;
					var32 = var1.readUnsignedIntME();
					if (var35 >= 0 && var31 >= 0 && var35 < class81.worldView.sizeX && var31 < class81.worldView.sizeY) {
						var33 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						class157.addTileItemToGroundItems(var33, var35, var31, var2, var32, var6, var3, var4, var7, var28);
					}

				} else if (class326.field3556 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedByteNeg();
					var4 = (var3 >> 4 & 7) + class67.field906;
					var5 = (var3 & 7) + WorldMapArea.field3255;
					var6 = var1.readUnsignedIntLE();
					var7 = var1.readInt();
					if (var4 >= 0 && var5 >= 0 && var4 < class81.worldView.sizeX && var5 < class81.worldView.sizeY) {
						var21 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						class140.method3699(var21, var4, var5, var2, var7, var6);
					}

				} else if (class326.field3560 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var3 = (var2 >> 4 & 7) + class67.field906;
					var4 = (var2 & 7) + WorldMapArea.field3255;
					var5 = var1.readUnsignedByteNeg();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var21 = Client.field298[var6];
					if (var3 >= 0 && var4 >= 0 && var3 < class81.worldView.sizeX && var4 < class81.worldView.sizeY) {
						var35 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						MouseHandler.method743(class81.worldView, var35, var3, var4, var21, -1, var6, var7, 31, (String[])null, 0, -1);
					}

				} else if (class326.field3555 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = var1.readUnsignedShortAdd();
					var4 = var1.readUnsignedShort();
					var5 = var1.readUnsignedByteAdd();
					var6 = (var5 >> 4 & 7) + class67.field906;
					var7 = (var5 & 7) + WorldMapArea.field3255;
					if (var6 >= 0 && var7 >= 0 && var6 < class81.worldView.sizeX && var7 < class81.worldView.sizeY) {
						var6 = Coord.method7396(var6);
						var7 = Coord.method7396(var7);
						var21 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						GraphicsObject var9 = new GraphicsObject(class81.worldView, var3, var21, var6, var7, class477.getTileHeight(class81.worldView, var6, var7, var21) - var2, var4, Client.cycle);
						class81.worldView.graphicsObjects.addFirst(var9);
					}

				} else if (class326.field3549 != var0) {
					if (class326.field3561 == var0) {
						var2 = var1.readUnsignedShortAdd();
						var3 = var1.readUnsignedByte();
						var4 = (var3 >> 4 & 7) + class67.field906;
						var5 = (var3 & 7) + WorldMapArea.field3255;
						var6 = var1.readUnsignedByteAdd();
						var7 = var6 >> 2;
						var21 = var6 & 3;
						var35 = Client.field298[var7];
						if (0 <= var4 && var4 < 103 && 0 <= var5 && var5 < 103) {
							var31 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
							PendingSpawn var22 = class383.method8170(class81.worldView, var31, var4, var5, var35);
							if (var22 != null) {
								ObjectComposition var23 = SpriteMask.getObjectDefinition(var22.field1011);
								if (var23.field2321) {
									class554.method10912(var31, var4, var5, var7, var21, var35, var2);
									var22.field1003 = var2;
									return;
								}
							}

							boolean var34 = class554.method10912(var31, var4, var5, var7, var21, var35, var2);
							if (var34) {
								return;
							}

							if (var22 != null) {
								var22.field1003 = var2;
							}
						}

					} else if (class326.field3553 == var0) {
						var2 = var1.readUnsignedIntME();
						var3 = var1.readUnsignedByte();
						var4 = (var3 >> 4 & 7) + class67.field906;
						var5 = (var3 & 7) + WorldMapArea.field3255;
						var6 = var1.readUnsignedShortAdd();
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
							var7 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
							FriendsList.method9884(var7, var4, var5, var6, var2);
						}

					}
				} else {
					var2 = var1.readUnsignedByteSub();
					var3 = var1.readUnsignedByteAdd();
					String[] var24 = null;
					if (var3 > 0) {
						var24 = new String[5];

						for (var5 = 0; var5 < var3; ++var5) {
							var6 = var1.readUnsignedByteSub();
							String var25 = var1.readStringCp1252NullTerminated();
							if (var6 >= 0 && var6 < 5) {
								var24[var6] = var25;
							}
						}
					}

					var5 = var1.readUnsignedByteSub();
					var6 = (var5 >> 4 & 7) + class67.field906;
					var7 = (var5 & 7) + WorldMapArea.field3255;
					var21 = var1.readUnsignedShortAddLE();
					var35 = var1.readUnsignedByteSub();
					var31 = var35 >> 2;
					var32 = var35 & 3;
					var33 = Client.field298[var31];
					if (var6 >= 0 && var7 >= 0 && var6 < class81.worldView.sizeX && var7 < class81.worldView.sizeY) {
						var13 = Client.overheadTextLimit == -1 ? class81.worldView.plane : Client.overheadTextLimit;
						MouseHandler.method743(class81.worldView, var13, var6, var7, var33, var21, var31, var32, var2, var24, 0, -1);
					}

				}
			}
		}
	}
}
