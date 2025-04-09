import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
public class class291 {
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZLvu;B)V",
		garbageValue = "-82"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field699 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		int var20;
		NPC var21;
		if (var3 < var0.field1351.method9060()) {
			for (var4 = var3; var4 < var0.field1351.method9060(); ++var4) {
				var20 = var0.field1351.method9056(var4);
				Client.field700[++Client.field699 - 1] = var20;
				var21 = (NPC)var0.npcs.get((long)var20);
				var21.field1366 = true;
			}
		}

		if (var3 > var0.field1351.method9060()) {
			throw new RuntimeException("");
		} else {
			var0.field1351.method9058();

			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var20 = var0.field1351.method9056(var4);
				var21 = (NPC)var0.npcs.get((long)var20);
				var7 = var2.readBits(1);
				if (var7 == 0) {
					var0.field1351.method9064(var20);
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						var0.field1351.method9064(var20);
						Client.npcIndices[++Client.npcCount - 1] = var20;
					} else if (var8 == 1) {
						var0.field1351.method9064(var20);
						var9 = var2.readBits(3);
						var21.method2948(var9, MoveSpeed.field3126);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var20;
						}
					} else if (var8 == 2) {
						var0.field1351.method9064(var20);
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var21.method2948(var9, MoveSpeed.field3127);
							var10 = var2.readBits(3);
							var21.method2948(var10, MoveSpeed.field3127);
						} else {
							var9 = var2.readBits(3);
							var21.method2948(var9, MoveSpeed.field3133);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var20;
						}
					} else if (var8 == 3) {
						Client.field700[++Client.field699 - 1] = var20;
						var21.field1366 = true;
					}
				}
			}

			WorldMapElement.method5075(var0, var1, var2);

			NPC var5;
			for (var3 = 0; var3 < Client.npcCount; ++var3) {
				var4 = Client.npcIndices[var3];
				var5 = (NPC)var0.npcs.get((long)var4);
				int var6 = var2.readUnsignedByte();
				if ((var6 & 64) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 8;
				}

				if ((var6 & 32768) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 16;
				}

				int var11;
				int var12;
				if ((var6 & 128) != 0) {
					var7 = var2.readUnsignedByte();
					int var13;
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var10 = -1;
							var11 = -1;
							var12 = -1;
							var9 = var2.readUShortSmart();
							if (var9 == 32767) {
								var9 = var2.readUShortSmart();
								var11 = var2.readUShortSmart();
								var10 = var2.readUShortSmart();
								var12 = var2.readUShortSmart();
							} else if (var9 != 32766) {
								var11 = var2.readUShortSmart();
							} else {
								var9 = -1;
							}

							var13 = var2.readUShortSmart();
							var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13);
						}
					}

					var8 = var2.readUnsignedByteNeg();
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							if (var11 != 32767) {
								var12 = var2.readUShortSmart();
								var13 = var2.readUnsignedByteNeg();
								int var14 = var11 > 0 ? var2.readUnsignedByte() : var13;
								var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14);
							} else {
								var5.removeHealthBar(var10);
							}
						}
					}
				}

				if ((var6 & 4) != 0) {
					var2.readUnsignedShortAdd();
					var2.readUnsignedIntIME();
				}

				if ((var6 & 16) != 0) {
					var7 = var2.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var2.readUnsignedByte();
					if (var7 == var5.sequence && var7 != -1) {
						var9 = class91.SequenceDefinition_get(var7).restartMode;
						if (var9 == 1) {
							var5.sequenceFrame = 0;
							var5.sequenceFrameCycle = 0;
							var5.sequenceDelay = var8;
							var5.field1265 = 0;
						}

						if (var9 == 2) {
							var5.field1265 = 0;
						}
					} else if (var7 == -1 || var5.sequence == -1 || class91.SequenceDefinition_get(var7).field3022 >= class91.SequenceDefinition_get(var5.sequence).field3022) {
						var5.sequence = var7;
						var5.sequenceFrame = 0;
						var5.sequenceFrameCycle = 0;
						var5.sequenceDelay = var8;
						var5.field1265 = 0;
						var5.field1284 = var5.pathLength;
					}
				}

				if ((var6 & 1) != 0) {
					var5.definition = class232.getNpcDefinition(var2.readUnsignedShortAddLE());
					class30.method460(var5);
				}

				if ((var6 & 32) != 0) {
					var5.overheadText = var2.readStringCp1252NullTerminated();
					var5.overheadTextCyclesRemaining = 100;
				}

				if ((var6 & 8) != 0) {
					var7 = var2.readUnsignedShortLE();
					var8 = var2.readUnsignedShortAdd();
					var5.field1224 = var2.readUnsignedByte() == 1;
					var5.field1222 = var7;
					var5.field1223 = var8;
				}

				if ((var6 & 16384) != 0) {
					var5.field1285 = var2.readUnsignedIntLE();
				}

				int[] var15;
				short[] var16;
				short[] var17;
				long var18;
				boolean var26;
				if ((var6 & 1024) != 0) {
					var7 = var2.readUnsignedByteSub();
					if ((var7 & 1) == 1) {
						var5.method2908();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readUnsignedByteSub();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedShortAdd();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.definition.recolorTo != null) {
								var10 = var5.definition.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedShort();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.definition.retextureTo != null) {
								var11 = var5.definition.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedShortLE();
							}
						}

						var26 = false;
						if ((var7 & 16) != 0) {
							var26 = var2.readUnsignedByteSub() == 1;
						}

						var18 = (long)(++NPC.field1364 - 1);
						var5.method2906(new NpcOverrides(var18, var15, var16, var17, var26));
					}
				}

				if ((var6 & 262144) != 0) {
					var7 = var2.readUnsignedByte();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var2.readUnsignedByteNeg();
						var10 = var2.readUnsignedShortLE();
						var11 = var2.readInt();
						var5.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var6 & 4096) != 0) {
					var5.npcCycle = Client.cycle + var2.readUnsignedShortAdd();
					var5.field1226 = Client.cycle + var2.readUnsignedShortLE();
					byte var22 = var2.readByte();
					byte var23 = var2.readByteNeg();
					byte var24 = var2.readByteNeg();
					byte var25 = (byte)var2.readUnsignedByteAdd();
					var5.field1220.method4574(var22, var23, var24, var25);
				}

				if ((var6 & 512) != 0) {
					var5.field1256 = var2.readByte();
					var5.field1270 = var2.readByteSub();
					var5.field1269 = var2.readByte();
					var5.field1229 = var2.readByteNeg();
					var5.spotAnimation = var2.readUnsignedShortAdd() + Client.cycle;
					var5.field1273 = var2.readUnsignedShort() + Client.cycle;
					var5.field1217 = var2.readUnsignedShortAdd();
					var5.pathLength = 0;
					var5.field1284 = 0;
					var5.field1256 += var5.pathX[0];
					var5.field1270 += var5.pathY[0];
					var5.field1269 += var5.pathX[0];
					var5.field1229 += var5.pathY[0];
				}

				if ((var6 & 2) != 0) {
					var5.targetIndex = var2.readUnsignedShortLE();
					var5.targetIndex += var2.readUnsignedByteSub() << 16;
					var7 = 16777215;
					if (var7 == var5.targetIndex) {
						var5.targetIndex = -1;
					}
				}

				if ((var6 & 8192) != 0) {
					var5.method2892(var2.readStringCp1252NullTerminated());
				}

				if ((var6 & 65536) != 0) {
					var7 = var2.readUnsignedByteAdd();
					if (var7 == 0) {
						var5.method2904();
					} else {
						var15 = new int[8];
						var16 = new short[8];

						for (var10 = 0; var10 < 8; ++var10) {
							if ((var7 & 1 << var10) != 0) {
								var15[var10] = var2.readNullableLargeSmart();
								var16[var10] = (short)var2.readShortSmartSub();
							} else {
								var15[var10] = -1;
								var16[var10] = -1;
							}
						}

						var5.method2903(var15, var16);
					}
				}

				if ((var6 & 2048) != 0) {
					var7 = var2.readUnsignedByteAdd();
					if ((var7 & 1) == 1) {
						var5.method2909();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readUnsignedByte();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedShortAddLE();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.definition.recolorTo != null) {
								var10 = var5.definition.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedShortLE();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.definition.retextureTo != null) {
								var11 = var5.definition.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedShort();
							}
						}

						var26 = false;
						if ((var7 & 16) != 0) {
							var26 = var2.readUnsignedByte() == 1;
						}

						var18 = (long)(++NPC.field1363 - 1);
						var5.method2927(new NpcOverrides(var18, var15, var16, var17, var26));
					}
				}

				if ((var6 & 131072) != 0) {
					var7 = var2.readInt();
					var5.turnLeftSequence = (var7 & 1) != 0 ? var2.readUnsignedShortLE() : var5.definition.turnLeftSequence;
					var5.turnRightSequence = (var7 & 2) != 0 ? var2.readUnsignedShortLE() : var5.definition.turnRightSequence;
					var5.walkSequence = (var7 & 4) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.walkSequence;
					var5.walkBackSequence = (var7 & 8) != 0 ? var2.readUnsignedShortAdd() : var5.definition.walkBackSequence;
					var5.walkLeftSequence = (var7 & 16) != 0 ? var2.readUnsignedShortAdd() : var5.definition.walkLeftSequence;
					var5.walkRightSequence = (var7 & 32) != 0 ? var2.readUnsignedShortAdd() : var5.definition.walkRightSequence;
					var5.runSequence = (var7 & 64) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2712;
					var5.field1215 = (var7 & 128) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2711;
					var5.field1280 = (var7 & 256) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2716;
					var5.field1244 = (var7 & 512) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2715;
					var5.field1245 = (var7 & 1024) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2724;
					var5.field1246 = (var7 & 2048) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2717;
					var5.field1243 = (var7 & 4096) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2718;
					var5.field1248 = (var7 & 8192) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2719;
					var5.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedShort() : var5.definition.idleSequence;
				}

				if ((var6 & 256) != 0) {
					var5.method2893(var2.readUnsignedByteNeg());
				}
			}

			for (var3 = 0; var3 < Client.field699; ++var3) {
				var4 = Client.field700[var3];
				var5 = (NPC)var0.npcs.get((long)var4);
				if (var5.field1366) {
					var5.definition = null;
					var5.detach();
				}
			}

			if (var2.offset * -2066221813 != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset * -2066221813 + "," + Client.packetWriter.serverPacketLength);
			}
		}
	}
}
