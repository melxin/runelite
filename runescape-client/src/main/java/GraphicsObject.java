import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1509051389
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1825662489
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -541831403
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1225837841
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2079930249
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1394947909
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1251605919
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 35256697
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("an")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = ViewportMouse.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = HealthBarDefinition.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "812001498"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}

					class277.method5753(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.getMayaAnimFrame()) {
					this.isFinished = true;
				} else {
					class277.method5753(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ViewportMouse.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhf;",
		garbageValue = "-1503380453"
	)
	static HorizontalAlignment[] method2242() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1973, HorizontalAlignment.field1971, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1093388179"
	)
	static boolean method2251(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2038267884"
	)
	static int method2245(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZLvg;I)V",
		garbageValue = "1008801193"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field645 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < var0.npcCount) {
			for (var4 = var3; var4 < var0.npcCount; ++var4) {
				Client.field647[++Client.field645 - 1] = var0.npcIndices[var4];
			}
		}

		if (var3 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			int var5;
			int var7;
			int var10;
			int var16;
			int var17;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.npcIndices[var4];
				NPC var21 = var0.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var5;
					var21.npcCycle = Client.cycle;
				} else {
					var16 = var2.readBits(2);
					if (var16 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var5;
						var21.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var5;
					} else if (var16 == 1) {
						var0.npcIndices[++var0.npcCount - 1] = var5;
						var21.npcCycle = Client.cycle;
						var17 = var2.readBits(3);
						var21.method2921(var17, MoveSpeed.field3067);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
						}
					} else if (var16 == 2) {
						var0.npcIndices[++var0.npcCount - 1] = var5;
						var21.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var17 = var2.readBits(3);
							var21.method2921(var17, MoveSpeed.field3073);
							var10 = var2.readBits(3);
							var21.method2921(var10, MoveSpeed.field3073);
						} else {
							var17 = var2.readBits(3);
							var21.method2921(var17, MoveSpeed.field3066);
						}

						var17 = var2.readBits(1);
						if (var17 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
						}
					} else if (var16 == 3) {
						Client.field647[++Client.field645 - 1] = var5;
					}
				}
			}

			int var6;
			int var11;
			int var13;
			int var14;
			while (true) {
				byte var22 = 16;
				var4 = 1 << var22;
				if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) < var22 + 12) {
					break;
				}

				var5 = var2.readBits(var22);
				if (var5 == var4 - 1) {
					break;
				}

				var6 = class492.field5089;
				boolean var23 = false;
				if (var0.npcs[var5] == null) {
					var0.npcs[var5] = new NPC();
					var23 = true;
				}

				NPC var8 = var0.npcs[var5];
				var8.field1351 = var6;
				var0.npcIndices[++var0.npcCount - 1] = var5;
				var8.npcCycle = Client.cycle;
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

				var17 = var2.readBits(1);
				if (var1) {
					var11 = var2.readBits(8);
					if (var11 > 127) {
						var11 -= 256;
					}
				} else {
					var11 = var2.readBits(6);
					if (var11 > 31) {
						var11 -= 64;
					}
				}

				var8.definition = DynamicObject.getNpcDefinition(var2.readBits(14));
				boolean var12 = var2.readBits(1) == 1;
				if (var12) {
					var2.readBits(32);
				}

				var13 = var2.readBits(1);
				if (var13 == 1) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
				}

				var14 = Client.defaultRotations[var2.readBits(3)];
				if (var23) {
					var8.orientation = var8.rotation = var14;
				}

				class452.method8771(var8);
				if (var8.field1241 == 0) {
					var8.rotation = 0;
				}

				var8.method2915(var10 + class319.field3309, var11 + HttpRequestTask.field88, var17 == 1);
			}

			var2.exportIndex();

			for (var3 = 0; var3 < Client.npcCount; ++var3) {
				var4 = Client.npcIndices[var3];
				NPC var15 = var0.npcs[var4];
				var6 = var2.readUnsignedByte();
				if ((var6 & 2) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 8;
				}

				if ((var6 & 256) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 16;
				}

				if ((var6 & 8) != 0) {
					var2.readUnsignedShortAddLE();
					var2.readUnsignedIntLE();
				}

				short[] var9;
				int[] var24;
				if ((var6 & 262144) != 0) {
					var7 = var2.readUnsignedByteNeg();
					if (var7 == 0) {
						var15.method2902();
					} else {
						var24 = new int[8];
						var9 = new short[8];

						for (var10 = 0; var10 < 8; ++var10) {
							if ((var7 & 1 << var10) != 0) {
								var24[var10] = var2.readNullableLargeSmart();
								var9[var10] = (short)var2.readShortSmartSub();
							} else {
								var24[var10] = -1;
								var9[var10] = -1;
							}
						}

						var15.method2901(var24, var9);
					}
				}

				if ((var6 & 128) != 0) {
					var15.definition = DynamicObject.getNpcDefinition(var2.readUnsignedShortLE());
					class452.method8771(var15);
				}

				if ((var6 & 16) != 0) {
					var7 = var2.readUnsignedShortLE();
					var16 = var2.readUnsignedShortAdd();
					var15.field1227 = var2.readUnsignedByteNeg() == 1;
					var15.field1251 = var7;
					var15.field1234 = var16;
				}

				if ((var6 & 32) != 0) {
					var15.targetIndex = var2.readUnsignedShortAddLE();
					var15.targetIndex += var2.readUnsignedByteNeg() << 16;
					var7 = 16777215;
					if (var7 == var15.targetIndex) {
						var15.targetIndex = -1;
					}
				}

				if ((var6 & 2048) != 0) {
					var15.field1271 = var2.readUnsignedIntLE();
				}

				if ((var6 & 8192) != 0) {
					var15.method2910(var2.readStringCp1252NullTerminated());
				}

				if ((var6 & 16384) != 0) {
					var15.field1247 = var2.readByteSub();
					var15.field1249 = var2.readByte();
					var15.field1248 = var2.readByteAdd();
					var15.field1250 = var2.readByteSub();
					var15.spotAnimation = var2.readUnsignedShortAdd() + Client.cycle;
					var15.field1252 = var2.readUnsignedShort() + Client.cycle;
					var15.field1253 = var2.readUnsignedShortAddLE();
					var15.pathLength = 1;
					var15.field1270 = 0;
					var15.field1247 += var15.pathX[0];
					var15.field1249 += var15.pathY[0];
					var15.field1248 += var15.pathX[0];
					var15.field1250 += var15.pathY[0];
				}

				short[] var18;
				long var19;
				int var25;
				boolean var26;
				if ((var6 & 4096) != 0) {
					var7 = var2.readUnsignedByteAdd();
					if ((var7 & 1) == 1) {
						var15.method2916();
					} else {
						var24 = null;
						if ((var7 & 2) == 2) {
							var17 = var2.readUnsignedByte();
							var24 = new int[var17];

							for (var10 = 0; var10 < var17; ++var10) {
								var11 = var2.readUnsignedShort();
								var11 = var11 == 65535 ? -1 : var11;
								var24[var10] = var11;
							}
						}

						var9 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var15.definition.recolorTo != null) {
								var10 = var15.definition.recolorTo.length;
							}

							var9 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var9[var11] = (short)var2.readUnsignedShort();
							}
						}

						var18 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var15.definition.retextureTo != null) {
								var11 = var15.definition.retextureTo.length;
							}

							var18 = new short[var11];

							for (var25 = 0; var25 < var11; ++var25) {
								var18[var25] = (short)var2.readUnsignedShortAdd();
							}
						}

						var26 = false;
						if ((var7 & 16) != 0) {
							var26 = var2.readUnsignedByteNeg() == 1;
						}

						var19 = (long)(++NPC.field1349 - 1);
						var15.method2903(new NpcOverrides(var19, var24, var9, var18, var26));
					}
				}

				if ((var6 & 512) != 0) {
					var7 = var2.readUnsignedByteSub();
					if ((var7 & 1) == 1) {
						var15.method2907();
					} else {
						var24 = null;
						if ((var7 & 2) == 2) {
							var17 = var2.readUnsignedByte();
							var24 = new int[var17];

							for (var10 = 0; var10 < var17; ++var10) {
								var11 = var2.readUnsignedShortAdd();
								var11 = var11 == 65535 ? -1 : var11;
								var24[var10] = var11;
							}
						}

						var9 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var15.definition.recolorTo != null) {
								var10 = var15.definition.recolorTo.length;
							}

							var9 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var9[var11] = (short)var2.readUnsignedShortAdd();
							}
						}

						var18 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var15.definition.retextureTo != null) {
								var11 = var15.definition.retextureTo.length;
							}

							var18 = new short[var11];

							for (var25 = 0; var25 < var11; ++var25) {
								var18[var25] = (short)var2.readUnsignedShortAddLE();
							}
						}

						var26 = false;
						if ((var7 & 16) != 0) {
							var26 = var2.readUnsignedByteNeg() == 1;
						}

						var19 = (long)(++NPC.field1356 - 1);
						var15.method2935(new NpcOverrides(var19, var24, var9, var18, var26));
					}
				}

				if ((var6 & 1024) != 0) {
					var15.field1256 = Client.cycle + var2.readUnsignedShort();
					var15.field1264 = Client.cycle + var2.readUnsignedShortAddLE();
					var15.field1224 = var2.readByteAdd();
					var15.field1235 = var2.readByteSub();
					var15.field1240 = var2.readByteSub();
					var15.field1233 = (byte)var2.readUnsignedByteNeg();
				}

				if ((var6 & 65536) != 0) {
					var7 = var2.readUnsignedByteNeg();

					for (var16 = 0; var16 < var7; ++var16) {
						var17 = var2.readUnsignedByteNeg();
						var10 = var2.readUnsignedShortLE();
						var11 = var2.readUnsignedIntME();
						var15.updateSpotAnimation(var17, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var6 & 64) != 0) {
					var15.overheadText = var2.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}

				if ((var6 & 32768) != 0) {
					var15.method2891(var2.readUnsignedByteNeg());
				}

				if ((var6 & 1) != 0) {
					var7 = var2.readUnsignedShortAddLE();
					if (var7 == 65535) {
						var7 = -1;
					}

					var16 = var2.readUnsignedByte();
					if (var7 == var15.sequence && var7 != -1) {
						var17 = HealthBarDefinition.SequenceDefinition_get(var7).restartMode;
						if (var17 == 1) {
							var15.sequenceFrame = 0;
							var15.sequenceFrameCycle = 0;
							var15.sequenceDelay = var16;
							var15.field1195 = 0;
						}

						if (var17 == 2) {
							var15.field1195 = 0;
						}
					} else if (var7 == -1 || var15.sequence == -1 || HealthBarDefinition.SequenceDefinition_get(var7).field2319 >= HealthBarDefinition.SequenceDefinition_get(var15.sequence).field2319) {
						var15.sequence = var7;
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var16;
						var15.field1195 = 0;
						var15.field1270 = var15.pathLength;
					}
				}

				if ((var6 & 131072) != 0) {
					var7 = var2.readUnsignedIntLE();
					var15.turnLeftSequence = (var7 & 1) != 0 ? var2.readUnsignedShortAdd() : var15.definition.turnLeftSequence;
					var15.turnRightSequence = (var7 & 2) != 0 ? var2.readUnsignedShort() : var15.definition.turnRightSequence;
					var15.walkSequence = (var7 & 4) != 0 ? var2.readUnsignedShort() : var15.definition.walkSequence;
					var15.walkBackSequence = (var7 & 8) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.walkBackSequence;
					var15.walkLeftSequence = (var7 & 16) != 0 ? var2.readUnsignedShortAdd() : var15.definition.walkLeftSequence;
					var15.walkRightSequence = (var7 & 32) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.walkRightSequence;
					var15.runSequence = (var7 & 64) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2003;
					var15.field1209 = (var7 & 128) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field1999;
					var15.field1228 = (var7 & 256) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2029;
					var15.field1266 = (var7 & 512) != 0 ? var2.readUnsignedShort() : var15.definition.field2004;
					var15.field1212 = (var7 & 1024) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2005;
					var15.field1213 = (var7 & 2048) != 0 ? var2.readUnsignedShort() : var15.definition.field2006;
					var15.field1214 = (var7 & 4096) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2007;
					var15.field1215 = (var7 & 8192) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2008;
					var15.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedShortLE() : var15.definition.idleSequence;
				}

				if ((var6 & 4) != 0) {
					var7 = var2.readUnsignedByteAdd();
					if (var7 > 0) {
						for (var16 = 0; var16 < var7; ++var16) {
							var10 = -1;
							var11 = -1;
							var25 = -1;
							var17 = var2.readUShortSmart();
							if (var17 == 32767) {
								var17 = var2.readUShortSmart();
								var11 = var2.readUShortSmart();
								var10 = var2.readUShortSmart();
								var25 = var2.readUShortSmart();
							} else if (var17 != 32766) {
								var11 = var2.readUShortSmart();
							} else {
								var17 = -1;
							}

							var13 = var2.readUShortSmart();
							var15.addHitSplat(var17, var11, var10, var25, Client.cycle, var13);
						}
					}

					var16 = var2.readUnsignedByteAdd();
					if (var16 > 0) {
						for (var17 = 0; var17 < var16; ++var17) {
							var10 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							if (var11 != 32767) {
								var25 = var2.readUShortSmart();
								var13 = var2.readUnsignedByteNeg();
								var14 = var11 > 0 ? var2.readUnsignedByte() : var13;
								var15.addHealthBar(var10, Client.cycle, var11, var25, var13, var14);
							} else {
								var15.removeHealthBar(var10);
							}
						}
					}
				}
			}

			for (var3 = 0; var3 < Client.field645; ++var3) {
				var4 = Client.field647[var3];
				if (var0.npcs[var4].npcCycle != Client.cycle) {
					var0.npcs[var4].definition = null;
					var0.npcs[var4] = null;
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var3 = 0; var3 < var0.npcCount; ++var3) {
					if (var0.npcs[var0.npcIndices[var3]] == null) {
						throw new RuntimeException(var3 + "," + var0.npcCount);
					}
				}

			}
		}
	}

	public GraphicsObject() {
	}
}
