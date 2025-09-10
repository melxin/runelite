import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("af")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1821922934"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIB)V",
		garbageValue = "8"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		ObjectSound.updateItemPile2(var0, var0.plane, var1, var2);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lwf;I)V",
		garbageValue = "-1375360465"
	)
	static final void method8141(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = (NPC)var0.npcs.get((long)var3);
			int var5 = var1.readUnsignedByte();
			int var6;
			if ((var5 & 2) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 2048) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 16;
			}

			if ((var5 & 32) != 0) {
				var4.targetIndex = var1.readUnsignedShortAddLE();
				var4.targetIndex += var1.readUnsignedByteSub() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			int[] var7;
			int var8;
			int var9;
			int var10;
			int var11;
			short[] var14;
			short[] var15;
			long var16;
			boolean var21;
			if ((var5 & 1024) != 0) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 1) {
					var4.method2732();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteSub();
						var7 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShort();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var14 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var14 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var14[var10] = (short)var1.readUnsignedShort();
						}
					}

					var15 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var15 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var15[var11] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var21 = false;
					if ((var6 & 16) != 0) {
						var21 = var1.readUnsignedByteNeg() == 1;
					}

					var16 = (long)(++NPC.field1186 - 1);
					var4.method2730(new NpcOverrides(var16, var7, var14, var15, var21));
				}
			}

			if ((var5 & 8) != 0) {
				var1.readUnsignedShortAdd();
				var1.readUnsignedShortLE();
				var1.readUnsignedByte();
			}

			if ((var5 & 16) != 0) {
				var4.definition = class63.getNpcDefinition(var1.readUnsignedShort());
				HorizontalAlignment.method4319(var4);
			}

			if ((var5 & 8192) != 0) {
				var4.field1089 = var1.readByteNeg();
				var4.field1091 = var1.readByte();
				var4.field1072 = var1.readByteNeg();
				var4.field1084 = var1.readByteSub();
				var4.spotAnimation = var1.readUnsignedShortAddLE() + Client.cycle;
				var4.field1094 = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1095 = var1.readUnsignedShortLE();
				var4.pathLength = 0;
				var4.field1040 = 0;
				var4.field1089 += var4.pathX[0];
				var4.field1091 += var4.pathY[0];
				var4.field1072 += var4.pathX[0];
				var4.field1084 += var4.pathY[0];
			}

			if ((var5 & 32768) != 0) {
				var4.method2716(var1.readStringCp1252NullTerminated());
			}

			int var18;
			if ((var5 & 1) != 0) {
				var6 = var1.readUnsignedShortAddLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var18 = var1.readUnsignedByteAdd();
				SequenceDefinition var23 = var4.animationSequence.getSequenceDefinition();
				if (var6 == var4.method2484() && var6 != -1) {
					var9 = var23.restartMode;
					if (var9 == 1) {
						var4.animationSequence.method9572();
						var4.field1102 = var18;
					}

					if (var9 == 2) {
						var4.animationSequence.method9589();
					}
				} else if (var6 == -1 || !var4.animationSequence.isActive() || InvDefinition.SequenceDefinition_get(var6).field2480 >= var23.field2480) {
					var4.animationSequence.setSequence(var6);
					var4.animationSequence.method9572();
					var4.field1102 = var18;
					var4.field1040 = var4.pathLength;
				}
			}

			if ((var5 & 256) != 0) {
				var4.method2717(var1.readUnsignedByteSub());
			}

			if ((var5 & 16384) != 0) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 1) {
					var4.method2733();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteSub();
						var7 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAddLE();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var14 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var14 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var14[var10] = (short)var1.readUnsignedShortAdd();
						}
					}

					var15 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.definition.retextureTo != null) {
							var10 = var4.definition.retextureTo.length;
						}

						var15 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var15[var11] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var21 = false;
					if ((var6 & 16) != 0) {
						var21 = var1.readUnsignedByteSub() == 1;
					}

					var16 = (long)(++NPC.field1185 - 1);
					var4.method2731(new NpcOverrides(var16, var7, var14, var15, var21));
				}
			}

			if ((var5 & 128) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 4096) != 0) {
				var4.npcCycle = Client.cycle + var1.readUnsignedShortLE();
				var4.field1052 = Client.cycle + var1.readUnsignedShortAddLE();
				byte var19 = var1.readByteSub();
				byte var24 = var1.readByteAdd();
				byte var20 = var1.readByteSub();
				byte var22 = (byte)var1.readUnsignedByteAdd();
				var4.field1076.method5649(var19, var24, var20, var22);
			}

			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedIntIME();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShort() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortLE() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortAdd() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2121;
				var4.field1068 = (var6 & 128) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2133;
				var4.field1065 = (var6 & 256) != 0 ? var1.readUnsignedShort() : var4.definition.field2155;
				var4.field1090 = (var6 & 512) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2124;
				var4.field1071 = (var6 & 1024) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2125;
				var4.field1069 = (var6 & 2048) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2126;
				var4.field1061 = (var6 & 4096) != 0 ? var1.readUnsignedShort() : var4.definition.field2115;
				var4.field1105 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var4.definition.field2122;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var4.definition.idleSequence;
			}

			if ((var5 & 4) != 0) {
				var6 = var1.readUnsignedByteAdd();
				int var12;
				if (var6 > 0) {
					for (var18 = 0; var18 < var6; ++var18) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var1.readUShortSmart();
						if (var8 == 32767) {
							var8 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var9 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var8 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
					}
				}

				var18 = var1.readUnsignedByte();
				if (var18 > 0) {
					for (var8 = 0; var8 < var18; ++var8) {
						var9 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByteSub();
							int var13 = var10 > 0 ? var1.readUnsignedByteSub() : var12;
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var5 & 512) != 0) {
				var4.field1106 = var1.readUnsignedIntIME();
			}

			if ((var5 & 524288) != 0) {
				var6 = var1.readUnsignedByteNeg();

				for (var18 = 0; var18 < var6; ++var18) {
					var8 = var1.readUnsignedByteNeg();
					var9 = var1.readUnsignedShortLE();
					var10 = var1.readUnsignedIntLE();
					var4.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 64) != 0) {
				var1.readUnsignedShortAdd();
				var1.readUnsignedIntME();
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if (var6 == 0) {
					var4.method2759();
				} else {
					var7 = new int[8];
					var14 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var7[var9] = var1.readNullableLargeSmart();
							var14[var9] = (short)var1.readShortSmartSub();
						} else {
							var7[var9] = -1;
							var14[var9] = -1;
						}
					}

					var4.method2727(var7, var14);
				}
			}

			if ((var5 & 131072) != 0) {
				var4.field1049 = var1.readUnsignedShort();
				var4.field1050 = var1.readUnsignedByte() == 1;
			}
		}

	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)I",
		garbageValue = "924285280"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = class518.method10317(var1, var0.childIndex * -217986249);
		return var2 != null ? var2.method7503() : var0.flags;
	}
}
