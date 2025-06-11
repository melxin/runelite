import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1348062047
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -634986741
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1484197127
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1152862637
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 669447941
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2093127817"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "126"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IIB)V",
		garbageValue = "-12"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lks;Lwe;I)Lrv;",
		garbageValue = "-985509085"
	)
	public static Bounds method4268(WorldEntityCoord var0, class575 var1) {
		int var2 = var1.field5678;
		int var3 = var1.field5679;
		int var4 = var1.field5674;
		int var5 = var1.field5680;
		int var6 = var0.getCurrentRotationAngle();
		int var7 = var0.getX();
		int var8 = var0.getY();
		double var9 = ClientPreferences.method2527(var6);
		double var11 = class517.method10079(var6);
		int var13 = (int)(var9 * (double)var2 - var11 * (double)var3);
		int var14 = (int)(var11 * (double)var2 + var9 * (double)var3);
		var7 += var13;
		var8 += var14;
		int var15 = (int)((double)var4 * var9 - var11 * (double)var5);
		int var16 = (int)((double)var4 * var11 + (double)var5 * var9);
		int var17 = (int)(var11 * (double)var5 + (double)var4 * var9);
		int var18 = (int)((double)var5 * var9 - (double)var4 * var11);
		int var19 = var7 - var15;
		int var20 = var8 + var16;
		int var21 = var17 + var7;
		int var22 = var18 + var8;
		int var23 = var15 + var7;
		int var24 = var8 - var16;
		int var25 = var7 - var17;
		int var26 = var8 - var18;
		int var27 = Math.min(var19, Math.min(var21, Math.min(var23, var25)));
		int var28 = Math.max(var19, Math.max(var21, Math.max(var23, var25)));
		int var29 = Math.min(var20, Math.min(var22, Math.min(var24, var26)));
		int var30 = Math.max(var20, Math.max(var22, Math.max(var24, var26)));
		return GameBuild.method7927(var27, var29, var28 - var27 + 1, var30 - var29 + 1);
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lwx;B)V",
		garbageValue = "71"
	)
	static final void method4251(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = (NPC)var0.npcs.get((long)var3);
			int var5 = var1.readUnsignedByte();
			int var6;
			if ((var5 & 64) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 2048) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 16;
			}

			if ((var5 & 256) != 0) {
				var4.npcCycle = Client.cycle + var1.readUnsignedShortLE();
				var4.field1027 = Client.cycle + var1.readUnsignedShortLE();
				byte var19 = var1.readByte();
				byte var7 = var1.readByteNeg();
				byte var8 = var1.readByteSub();
				byte var9 = (byte)var1.readUnsignedByteAdd();
				var4.field1054.method5715(var19, var7, var8, var9);
			}

			int var10;
			int var11;
			int var20;
			int var21;
			int var22;
			if ((var5 & 2) != 0) {
				var6 = var1.readUnsignedByteNeg();
				int var12;
				if (var6 > 0) {
					for (var20 = 0; var20 < var6; ++var20) {
						var22 = -1;
						var10 = -1;
						var11 = -1;
						var21 = var1.readUShortSmart();
						if (var21 == 32767) {
							var21 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var22 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var21 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var21 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var21, var10, var22, var11, Client.cycle, var12);
					}
				}

				var20 = var1.readUnsignedByte();
				if (var20 > 0) {
					for (var21 = 0; var21 < var20; ++var21) {
						var22 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByte();
							int var13 = var10 > 0 ? var1.readUnsignedByte() : var12;
							var4.addHealthBar(var22, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var22);
						}
					}
				}
			}

			if ((var5 & 32768) != 0) {
				var4.field1086 = var1.readUnsignedIntME();
			}

			if ((var5 & 131072) != 0) {
				var4.field1022 = var1.readUnsignedShortLE();
				var4.field1025 = var1.readUnsignedByteAdd() == 1;
			}

			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			boolean var23;
			if ((var5 & 512) != 0) {
				var6 = var1.readUnsignedByteSub();
				if ((var6 & 1) == 1) {
					var4.method2589();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var21 = var1.readUnsignedByteNeg();
						var14 = new int[var21];

						for (var22 = 0; var22 < var21; ++var22) {
							var10 = var1.readUnsignedShort();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var22] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var22 = 0;
						if (var4.definition.recolorTo != null) {
							var22 = var4.definition.recolorTo.length;
						}

						var15 = new short[var22];

						for (var10 = 0; var10 < var22; ++var10) {
							var15[var10] = (short)var1.readUnsignedShortAdd();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var1.readUnsignedShortAdd();
						}
					}

					var23 = false;
					if ((var6 & 16) != 0) {
						var23 = var1.readUnsignedByte() == 1;
					}

					var17 = (long)(++NPC.field1165 - 1);
					var4.method2607(new NpcOverrides(var17, var14, var15, var16, var23));
				}
			}

			if ((var5 & 4) != 0) {
				var1.readUnsignedShortLE();
				var1.readInt();
			}

			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedByteSub();
				if (var6 == 0) {
					var4.method2584();
				} else {
					var14 = new int[8];
					var15 = new short[8];

					for (var22 = 0; var22 < 8; ++var22) {
						if ((var6 & 1 << var22) != 0) {
							var14[var22] = var1.readNullableLargeSmart();
							var15[var22] = (short)var1.readShortSmartSub();
						} else {
							var14[var22] = -1;
							var15[var22] = -1;
						}
					}

					var4.method2583(var14, var15);
				}
			}

			if ((var5 & 1024) != 0) {
				var4.method2571(var1.readStringCp1252NullTerminated());
			}

			if ((var5 & 8192) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if ((var6 & 1) == 1) {
					var4.method2588();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var21 = var1.readUnsignedByte();
						var14 = new int[var21];

						for (var22 = 0; var22 < var21; ++var22) {
							var10 = var1.readUnsignedShort();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var22] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var22 = 0;
						if (var4.definition.recolorTo != null) {
							var22 = var4.definition.recolorTo.length;
						}

						var15 = new short[var22];

						for (var10 = 0; var10 < var22; ++var10) {
							var15[var10] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var1.readUnsignedShortLE();
						}
					}

					var23 = false;
					if ((var6 & 16) != 0) {
						var23 = var1.readUnsignedByteSub() == 1;
					}

					var17 = (long)(++NPC.field1164 - 1);
					var4.method2586(new NpcOverrides(var17, var14, var15, var16, var23));
				}
			}

			if ((var5 & 128) != 0) {
				var6 = var1.readUnsignedShortLE();
				var20 = var1.readUnsignedShortAdd();
				var4.field1025 = var1.readUnsignedByteNeg() == 1;
				var4.field1059 = var6;
				var4.field1024 = var20;
			}

			if ((var5 & 32) != 0) {
				var6 = var1.readUnsignedShort();
				if (var6 == 65535) {
					var6 = -1;
				}

				var20 = var1.readUnsignedByteNeg();
				if (var6 == var4.sequence && var6 != -1) {
					var21 = VarpDefinition.SequenceDefinition_get(var6).restartMode;
					if (var21 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var20;
						var4.field1066 = 0;
					}

					if (var21 == 2) {
						var4.field1066 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || VarpDefinition.SequenceDefinition_get(var6).field2360 >= VarpDefinition.SequenceDefinition_get(var4.sequence).field2360) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var20;
					var4.field1066 = 0;
					var4.field1048 = var4.pathLength;
				}
			}

			if ((var5 & 8) != 0) {
				var4.definition = UserComparator3.getNpcDefinition(var1.readUnsignedShort());
				Skeleton.method5174(var4);
			}

			if ((var5 & 16) != 0) {
				var4.targetIndex = var1.readUnsignedShort();
				var4.targetIndex += var1.readUnsignedByteSub() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedIntLE();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShort() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShort() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortAdd() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShort() : var4.definition.field2047;
				var4.field1043 = (var6 & 128) != 0 ? var1.readUnsignedShort() : var4.definition.field2042;
				var4.field1052 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2043;
				var4.field1045 = (var6 & 512) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2044;
				var4.field1046 = (var6 & 1024) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2049;
				var4.field1047 = (var6 & 2048) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2046;
				var4.field1074 = (var6 & 4096) != 0 ? var1.readUnsignedShort() : var4.definition.field2029;
				var4.field1038 = (var6 & 8192) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2048;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.idleSequence;
			}

			if ((var5 & 4096) != 0) {
				var4.field1062 = var1.readByteAdd();
				var4.field1065 = var1.readByteAdd();
				var4.field1070 = var1.readByte();
				var4.field1072 = var1.readByteSub();
				var4.spotAnimation = var1.readUnsignedShortAddLE() + Client.cycle;
				var4.field1016 = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1012 = var1.readUnsignedShort();
				var4.pathLength = 0;
				var4.field1048 = 0;
				var4.field1062 += var4.pathX[0];
				var4.field1065 += var4.pathY[0];
				var4.field1070 += var4.pathX[0];
				var4.field1072 += var4.pathY[0];
			}

			if ((var5 & 524288) != 0) {
				var6 = var1.readUnsignedByteNeg();

				for (var20 = 0; var20 < var6; ++var20) {
					var21 = var1.readUnsignedByteSub();
					var22 = var1.readUnsignedShort();
					var10 = var1.readUnsignedIntIME();
					var4.updateSpotAnimation(var21, var22, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 1) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 16384) != 0) {
				var4.method2573(var1.readUnsignedByteNeg());
			}
		}

	}
}
