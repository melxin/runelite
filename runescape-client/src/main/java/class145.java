import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public enum class145 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1702(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1704(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1696(2, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1697(3, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1698(4, 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1700(5, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1699(6, 6),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1701(7, 7),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1695(8, 8);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1836960927
	)
	final int field1703;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 18565779
	)
	final int field1694;

	class145(int var3, int var4) {
		this.field1703 = var3;
		this.field1694 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1694;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpl;III)Lwg;",
		garbageValue = "331286883"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class478.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class366.method7453();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1408330171"
	)
	public static void method3448() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldp;ZLvu;I)V",
		garbageValue = "646357668"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field709 = 0;
		Client.npcCount = 0;
		VarbitComposition.method4069(var0, var2);

		int var4;
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		while (true) {
			byte var3 = 16;
			var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) < var3 + 12) {
				break;
			}

			int var5 = var2.readBits(var3);
			if (var5 == var4 - 1) {
				break;
			}

			boolean var6 = false;
			NPC var21 = (NPC)var0.npcs.get((long)var5);
			if (var21 == null) {
				var21 = new NPC(var5);
				var0.npcs.add(var21, (long)var5);
				var6 = true;
			}

			var0.field1355.method9006(var5);
			var21.field1371 = false;
			var21.worldViewId = var0.id;
			var11 = Client.defaultRotations[var2.readBits(3)];
			if (var6) {
				var21.orientation = var21.rotation = var11;
			}

			boolean var12 = var2.readBits(1) == 1;
			if (var12) {
				var2.readBits(32);
			}

			var8 = var2.readBits(1);
			if (var1) {
				var9 = var2.readBits(8);
				if (var9 > 127) {
					var9 -= 256;
				}
			} else {
				var9 = var2.readBits(6);
				if (var9 > 31) {
					var9 -= 64;
				}
			}

			if (var1) {
				var10 = var2.readBits(8);
				if (var10 > 127) {
					var10 -= 256;
				}
			} else {
				var10 = var2.readBits(6);
				if (var10 > 31) {
					var10 -= 64;
				}
			}

			var13 = var2.readBits(1);
			if (var13 == 1) {
				Client.npcIndices[++Client.npcCount - 1] = var5;
			}

			var21.definition = class91.getNpcDefinition(var2.readBits(14));
			class94.method2524(var21);
			if (var21.field1265 == 0) {
				var21.rotation = 0;
			}

			var21.method2901(var9 + class519.field5270, var10 + Canvas.field100, var8 == 1);
		}

		var2.exportIndex();

		NPC var15;
		int var22;
		for (var22 = 0; var22 < Client.npcCount; ++var22) {
			var4 = Client.npcIndices[var22];
			var15 = (NPC)var0.npcs.get((long)var4);
			int var23 = var2.readUnsignedByte();
			int var7;
			if ((var23 & 16) != 0) {
				var7 = var2.readUnsignedByte();
				var23 += var7 << 8;
			}

			if ((var23 & 1024) != 0) {
				var7 = var2.readUnsignedByte();
				var23 += var7 << 16;
			}

			int var26;
			if ((var23 & 2) != 0) {
				var7 = var2.readUnsignedByteSub();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var10 = -1;
						var11 = -1;
						var26 = -1;
						var9 = var2.readUShortSmart();
						if (var9 == 32767) {
							var9 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							var10 = var2.readUShortSmart();
							var26 = var2.readUShortSmart();
						} else if (var9 != 32766) {
							var11 = var2.readUShortSmart();
						} else {
							var9 = -1;
						}

						var13 = var2.readUShortSmart();
						var15.addHitSplat(var9, var11, var10, var26, Client.cycle, var13);
					}
				}

				var8 = var2.readUnsignedByteSub();
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var2.readUShortSmart();
						var11 = var2.readUShortSmart();
						if (var11 != 32767) {
							var26 = var2.readUShortSmart();
							var13 = var2.readUnsignedByteNeg();
							int var14 = var11 > 0 ? var2.readUnsignedByteNeg() : var13;
							var15.addHealthBar(var10, Client.cycle, var11, var26, var13, var14);
						} else {
							var15.removeHealthBar(var10);
						}
					}
				}
			}

			if ((var23 & 256) != 0) {
				var15.npcCycle = Client.cycle + var2.readUnsignedShortAdd();
				var15.field1281 = Client.cycle + var2.readUnsignedShortAdd();
				byte var24 = var2.readByte();
				byte var25 = var2.readByteSub();
				byte var27 = var2.readByte();
				byte var28 = (byte)var2.readUnsignedByteNeg();
				var15.field1286.method5435(var24, var25, var27, var28);
			}

			if ((var23 & 4) != 0) {
				var15.overheadText = var2.readStringCp1252NullTerminated();
				var15.overheadTextCyclesRemaining = 100;
			}

			if ((var23 & 32) != 0) {
				var7 = var2.readUnsignedShortAdd();
				if (var7 == 65535) {
					var7 = -1;
				}

				var8 = var2.readUnsignedByte();
				if (var7 == var15.sequence && var7 != -1) {
					var9 = WorldMapData_1.SequenceDefinition_get(var7).restartMode;
					if (var9 == 1) {
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var8;
						var15.field1255 = 0;
					}

					if (var9 == 2) {
						var15.field1255 = 0;
					}
				} else if (var7 == -1 || var15.sequence == -1 || WorldMapData_1.SequenceDefinition_get(var7).field2368 >= WorldMapData_1.SequenceDefinition_get(var15.sequence).field2368) {
					var15.sequence = var7;
					var15.sequenceFrame = 0;
					var15.sequenceFrameCycle = 0;
					var15.sequenceDelay = var8;
					var15.field1255 = 0;
					var15.field1291 = var15.pathLength;
				}
			}

			if ((var23 & 16384) != 0) {
				var15.method2853(var2.readUnsignedByteNeg());
			}

			if ((var23 & 262144) != 0) {
				var7 = var2.readUnsignedByteAdd();

				for (var8 = 0; var8 < var7; ++var8) {
					var9 = var2.readUnsignedByteAdd();
					var10 = var2.readUnsignedShortAdd();
					var11 = var2.readUnsignedIntIME();
					var15.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
				}
			}

			if ((var23 & 8) != 0) {
				var15.targetIndex = var2.readUnsignedShortAdd();
				var15.targetIndex += var2.readUnsignedByteSub() << 16;
				var7 = 16777215;
				if (var7 == var15.targetIndex) {
					var15.targetIndex = -1;
				}
			}

			if ((var23 & 128) != 0) {
				var15.definition = class91.getNpcDefinition(var2.readUnsignedShort());
				class94.method2524(var15);
			}

			int[] var16;
			short[] var17;
			if ((var23 & 65536) != 0) {
				var7 = var2.readUnsignedByteSub();
				if (var7 == 0) {
					var15.method2864();
				} else {
					var16 = new int[8];
					var17 = new short[8];

					for (var10 = 0; var10 < 8; ++var10) {
						if ((var7 & 1 << var10) != 0) {
							var16[var10] = var2.readNullableLargeSmart();
							var17[var10] = (short)var2.readShortSmartSub();
						} else {
							var16[var10] = -1;
							var17[var10] = -1;
						}
					}

					var15.method2926(var16, var17);
				}
			}

			if ((var23 & 4096) != 0) {
				var15.method2868(var2.readStringCp1252NullTerminated());
			}

			if ((var23 & 1) != 0) {
				var2.readUnsignedShortLE();
				var2.readInt();
			}

			if ((var23 & 131072) != 0) {
				var7 = var2.readUnsignedIntLE();
				var15.turnLeftSequence = (var7 & 1) != 0 ? var2.readUnsignedShort() : var15.definition.turnLeftSequence;
				var15.turnRightSequence = (var7 & 2) != 0 ? var2.readUnsignedShort() : var15.definition.turnRightSequence;
				var15.walkSequence = (var7 & 4) != 0 ? var2.readUnsignedShort() : var15.definition.walkSequence;
				var15.walkBackSequence = (var7 & 8) != 0 ? var2.readUnsignedShortLE() : var15.definition.walkBackSequence;
				var15.walkLeftSequence = (var7 & 16) != 0 ? var2.readUnsignedShortAdd() : var15.definition.walkLeftSequence;
				var15.walkRightSequence = (var7 & 32) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.walkRightSequence;
				var15.runSequence = (var7 & 64) != 0 ? var2.readUnsignedShort() : var15.definition.field2049;
				var15.field1234 = (var7 & 128) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2037;
				var15.field1235 = (var7 & 256) != 0 ? var2.readUnsignedShort() : var15.definition.field2065;
				var15.field1272 = (var7 & 512) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2052;
				var15.field1229 = (var7 & 1024) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2053;
				var15.field1243 = (var7 & 2048) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2051;
				var15.field1283 = (var7 & 4096) != 0 ? var2.readUnsignedShort() : var15.definition.field2055;
				var15.field1240 = (var7 & 8192) != 0 ? var2.readUnsignedShort() : var15.definition.field2040;
				var15.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.idleSequence;
			}

			if ((var23 & 8192) != 0) {
				var15.field1257 = var2.readUnsignedIntME();
			}

			short[] var18;
			long var19;
			boolean var29;
			if ((var23 & 512) != 0) {
				var7 = var2.readUnsignedByte();
				if ((var7 & 1) == 1) {
					var15.method2851();
				} else {
					var16 = null;
					if ((var7 & 2) == 2) {
						var9 = var2.readUnsignedByte();
						var16 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.readUnsignedShortAdd();
							var11 = var11 == 65535 ? -1 : var11;
							var16[var10] = var11;
						}
					}

					var17 = null;
					if ((var7 & 4) == 4) {
						var10 = 0;
						if (var15.definition.recolorTo != null) {
							var10 = var15.definition.recolorTo.length;
						}

						var17 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var17[var11] = (short)var2.readUnsignedShortAddLE();
						}
					}

					var18 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var15.definition.retextureTo != null) {
							var11 = var15.definition.retextureTo.length;
						}

						var18 = new short[var11];

						for (var26 = 0; var26 < var11; ++var26) {
							var18[var26] = (short)var2.readUnsignedShortAddLE();
						}
					}

					var29 = false;
					if ((var7 & 16) != 0) {
						var29 = var2.readUnsignedByteNeg() == 1;
					}

					var19 = (long)(++NPC.field1381 - 1);
					var15.method2865(new NpcOverrides(var19, var16, var17, var18, var29));
				}
			}

			if ((var23 & 64) != 0) {
				var7 = var2.readUnsignedShortAdd();
				var8 = var2.readUnsignedShortAddLE();
				var15.field1260 = var2.readUnsignedByte() == 1;
				var15.field1258 = var7;
				var15.field1259 = var8;
			}

			if ((var23 & 32768) != 0) {
				var7 = var2.readUnsignedByteAdd();
				if ((var7 & 1) == 1) {
					var15.method2869();
				} else {
					var16 = null;
					if ((var7 & 2) == 2) {
						var9 = var2.readUnsignedByteSub();
						var16 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.readUnsignedShortLE();
							var11 = var11 == 65535 ? -1 : var11;
							var16[var10] = var11;
						}
					}

					var17 = null;
					if ((var7 & 4) == 4) {
						var10 = 0;
						if (var15.definition.recolorTo != null) {
							var10 = var15.definition.recolorTo.length;
						}

						var17 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var17[var11] = (short)var2.readUnsignedShortAddLE();
						}
					}

					var18 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var15.definition.retextureTo != null) {
							var11 = var15.definition.retextureTo.length;
						}

						var18 = new short[var11];

						for (var26 = 0; var26 < var11; ++var26) {
							var18[var26] = (short)var2.readUnsignedShort();
						}
					}

					var29 = false;
					if ((var7 & 16) != 0) {
						var29 = var2.readUnsignedByteSub() == 1;
					}

					var19 = (long)(++NPC.field1377 - 1);
					var15.method2867(new NpcOverrides(var19, var16, var17, var18, var29));
				}
			}

			if ((var23 & 2048) != 0) {
				var15.field1221 = var2.readByteNeg();
				var15.field1274 = var2.readByte();
				var15.field1273 = var2.readByteAdd();
				var15.field1275 = var2.readByteSub();
				var15.spotAnimation = var2.readUnsignedShortAddLE() + Client.cycle;
				var15.field1239 = var2.readUnsignedShortAddLE() + Client.cycle;
				var15.field1278 = var2.readUnsignedShortAddLE();
				var15.pathLength = 1;
				var15.field1291 = 0;
				var15.field1221 += var15.pathX[0];
				var15.field1274 += var15.pathY[0];
				var15.field1273 += var15.pathX[0];
				var15.field1275 += var15.pathY[0];
			}
		}

		for (var22 = 0; var22 < Client.field709; ++var22) {
			var4 = Client.field653[var22];
			var15 = (NPC)var0.npcs.get((long)var4);
			if (var15.field1371) {
				var15.definition = null;
				var15.detach();
			}
		}

		if (var2.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
		}
	}
}
