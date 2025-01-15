import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ah")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1210153578"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "-969612135"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lvv;I)V",
		garbageValue = "-1570915856"
	)
	static final void method9189(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = var0.npcs[var3];
			int var5 = var1.readUnsignedByte();
			int var6;
			if ((var5 & 16) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 2048) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 16;
			}

			if ((var5 & 32) != 0) {
				var4.targetIndex = var1.readUnsignedShortAddLE();
				var4.targetIndex += var1.readUnsignedByteAdd() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 4) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedIntLE();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShort() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortAdd() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShort() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2659;
				var4.field1198 = (var6 & 128) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2633;
				var4.field1210 = (var6 & 256) != 0 ? var1.readUnsignedShort() : var4.definition.field2634;
				var4.field1251 = (var6 & 512) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2623;
				var4.field1212 = (var6 & 1024) != 0 ? var1.readUnsignedShort() : var4.definition.field2636;
				var4.field1234 = (var6 & 2048) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2649;
				var4.field1214 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2660;
				var4.field1220 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var4.definition.field2639;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var4.definition.idleSequence;
			}

			int var7;
			int var8;
			int var9;
			int var10;
			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedByteSub();

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var1.readUnsignedByteAdd();
					var9 = var1.readUnsignedShort();
					var10 = var1.readUnsignedIntME();
					var4.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 2) != 0) {
				var4.definition = FadeOutTask.getNpcDefinition(var1.readUnsignedShort());
				WorldViewManager.method2736(var4);
			}

			if ((var5 & 4096) != 0) {
				var4.method3022(var1.readStringCp1252NullTerminated());
			}

			int var11;
			if ((var5 & 8) != 0) {
				var6 = var1.readUnsignedByteSub();
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
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

				var7 = var1.readUnsignedByteSub();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByteAdd();
							int var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var12;
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var5 & 256) != 0) {
				var4.field1256 = Client.cycle + var1.readUnsignedShortAddLE();
				var4.field1252 = Client.cycle + var1.readUnsignedShortAdd();
				var4.field1258 = var1.readByteNeg();
				var4.field1211 = var1.readByteSub();
				var4.field1261 = var1.readByteNeg();
				var4.field1208 = (byte)var1.readUnsignedByte();
			}

			if ((var5 & 64) != 0) {
				var6 = var1.readUnsignedShort();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var1.readUnsignedByteSub();
				if (var6 == var4.sequence && var6 != -1) {
					var8 = class33.SequenceDefinition_get(var6).restartMode;
					if (var8 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var7;
						var4.field1244 = 0;
					}

					if (var8 == 2) {
						var4.field1244 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || class33.SequenceDefinition_get(var6).field2930 >= class33.SequenceDefinition_get(var4.sequence).field2930) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var7;
					var4.field1244 = 0;
					var4.field1270 = var4.pathLength;
				}
			}

			if ((var5 & 8192) != 0) {
				var4.field1247 = var1.readByteAdd();
				var4.field1249 = var1.readByte();
				var4.field1248 = var1.readByteAdd();
				var4.field1250 = var1.readByteAdd();
				var4.spotAnimation = var1.readUnsignedShortAdd() + Client.cycle;
				var4.field1199 = var1.readUnsignedShortAddLE() + Client.cycle;
				var4.field1253 = var1.readUnsignedShortAddLE();
				var4.pathLength = 1;
				var4.field1270 = 0;
				var4.field1247 += var4.pathX[0];
				var4.field1249 += var4.pathY[0];
				var4.field1248 += var4.pathX[0];
				var4.field1250 += var4.pathY[0];
			}

			if ((var5 & 512) != 0) {
				var4.field1209 = var1.readInt();
			}

			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			boolean var19;
			if ((var5 & 16384) != 0) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 1) {
					var4.method3028();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByte();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAdd();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
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
							var16[var11] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteNeg() == 1;
					}

					var17 = (long)(++NPC.field1349 - 1);
					var4.method3019(new NpcOverrides(var17, var14, var15, var16, var19));
				}
			}

			if ((var5 & 1) != 0) {
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedShort();
				var4.field1235 = var1.readUnsignedByteNeg() == 1;
				var4.field1233 = var6;
				var4.field1205 = var7;
			}

			if ((var5 & 32768) != 0) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 1) {
					var4.method3014();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByte();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAddLE();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
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
							var16[var11] = (short)var1.readUnsignedShort();
						}
					}

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteNeg() == 1;
					}

					var17 = (long)(++NPC.field1352 - 1);
					var4.method3027(new NpcOverrides(var17, var14, var15, var16, var19));
				}
			}

			if ((var5 & 128) != 0) {
				var1.readUnsignedShortAddLE();
				var1.readInt();
			}

			if ((var5 & 131072) != 0) {
				var6 = var1.readUnsignedByte();
				if (var6 == 0) {
					var4.method3024();
				} else {
					var14 = new int[8];
					var15 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var14[var9] = var1.readNullableLargeSmart();
							var15[var9] = (short)var1.readShortSmartSub();
						} else {
							var14[var9] = -1;
							var15[var9] = -1;
						}
					}

					var4.method3023(var14, var15);
				}
			}

			if ((var5 & 1024) != 0) {
				var4.method3013(var1.readUnsignedByteNeg());
			}
		}

	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1138663028"
	)
	static void method9190() {
		if (class184.field1975 != null) {
			Client.field791 = Client.cycle;
			class184.field1975.method7940();

			for (int var0 = 0; var0 < GameEngine.topLevelWorldView.players.length; ++var0) {
				if (GameEngine.topLevelWorldView.players[var0] != null) {
					class184.field1975.method7943((GameEngine.topLevelWorldView.players[var0].x >> 7) + GameEngine.topLevelWorldView.baseX, (GameEngine.topLevelWorldView.players[var0].y >> 7) + GameEngine.topLevelWorldView.baseY);
				}
			}
		}

	}
}
