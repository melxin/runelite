import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ab")
	public int[] field3144;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 871671027
	)
	public int field3133;
	@ObfuscatedName("av")
	int[] field3131;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1853366425
	)
	int field3135;
	@ObfuscatedName("as")
	public char field3136;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -119820185
	)
	public int field3137;
	@ObfuscatedName("ap")
	char[] field3132;
	@ObfuscatedName("am")
	int[] field3140;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -937926805
	)
	int field3134;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1569662997
	)
	int field3141;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -221580601
	)
	int field3142;
	@ObfuscatedName("aa")
	boolean[] field3138;
	@ObfuscatedName("ai")
	boolean[] field3143;
	@ObfuscatedName("ak")
	boolean[] field3145;

	public IndexCheck() {
		this.field3144 = new int[128];
		this.field3133 = 0;
		this.field3131 = new int[128];
		this.field3135 = 0;
		this.field3132 = new char[128];
		this.field3140 = new int[128];
		this.field3134 = 0;
		this.field3141 = 0;
		this.field3142 = 0;
		this.field3138 = new boolean[112];
		this.field3143 = new boolean[112];
		this.field3145 = new boolean[112];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "14585"
	)
	public boolean vmethod6086(int var1) {
		this.method6089(var1);
		this.field3138[var1] = true;
		this.field3143[var1] = true;
		this.field3145[var1] = false;
		if (this.field3133 < 128) {
			this.field3144[++this.field3133 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "646363744"
	)
	public boolean vmethod6087(int var1) {
		this.field3138[var1] = false;
		this.field3143[var1] = false;
		this.field3145[var1] = true;
		if (this.field3135 < 128) {
			this.field3131[++this.field3135 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "89"
	)
	public boolean vmethod6088(char var1) {
		int var2 = this.field3141 + 1 & 127;
		if (var2 != this.field3134) {
			this.field3140[this.field3141] = -1;
			this.field3132[this.field3141] = var1;
			this.field3141 = var2;
		}

		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "13804206"
	)
	public boolean vmethod6112(boolean var1) {
		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1516874669"
	)
	void method6089(int var1) {
		int var2 = this.field3141 + 1 & 127;
		if (var2 != this.field3134) {
			this.field3140[this.field3141] = var1;
			this.field3132[this.field3141] = 0;
			this.field3141 = var2;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1509681323"
	)
	public void method6091() {
		this.field3134 = this.field3142;
		this.field3142 = this.field3141;
		this.field3133 = 0;
		this.field3135 = 0;
		Arrays.fill(this.field3143, false);
		Arrays.fill(this.field3145, false);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1418915743"
	)
	public final boolean method6092() {
		if (this.field3134 == this.field3142) {
			return false;
		} else {
			this.field3137 = this.field3140[this.field3134];
			this.field3136 = this.field3132[this.field3134];
			this.field3134 = this.field3134 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	public boolean method6093(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3143[var1] : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-618438564"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3138[var1] : false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1602734321"
	)
	public boolean method6095(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3145[var1] : false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-56"
	)
	public int[] method6098() {
		int[] var1 = new int[this.field3133];

		for (int var2 = 0; var2 < this.field3133; ++var2) {
			var1[var2] = this.field3144[var2];
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "795566676"
	)
	public int[] method6090() {
		int[] var1 = new int[this.field3135];

		for (int var2 = 0; var2 < this.field3135; ++var2) {
			var1[var2] = this.field3131[var2];
		}

		return var1;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZLwk;B)V",
		garbageValue = "1"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field370 = 0;
		Client.npcCount = 0;
		StructComposition.method4518(var0, var2);

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
			NPC var7 = (NPC)var0.npcs.get((long)var5);
			if (var7 == null) {
				var7 = new NPC(var5);
				var0.npcs.add(var7, (long)var5);
				var6 = true;
			}

			var0.field1150.method9808(var5);
			var7.field1165 = false;
			var7.worldViewId = var0.id;
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

			var11 = var2.readBits(1);
			if (var11 == 1) {
				Client.npcIndices[++Client.npcCount - 1] = var5;
			}

			boolean var12 = var2.readBits(1) == 1;
			if (var12) {
				var2.readBits(32);
			}

			var8 = var2.readBits(1);
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

			var13 = Client.field497[var2.readBits(3)];
			if (var6) {
				var7.orientation = var7.rotation = var13;
			}

			var7.definition = class191.getNpcDefinition(var2.readBits(14));
			class545.method10646(var7);
			if (var7.field1041 == 0) {
				var7.rotation = 0;
			}

			var7.method2668(var9 + class36.field225, var10 + class364.field4029, var8 == 1);
		}

		var2.exportIndex();

		NPC var15;
		int var22;
		for (var22 = 0; var22 < Client.npcCount; ++var22) {
			var4 = Client.npcIndices[var22];
			var15 = (NPC)var0.npcs.get((long)var4);
			int var23 = var2.readUnsignedByte();
			int var16;
			if ((var23 & 8) != 0) {
				var16 = var2.readUnsignedByte();
				var23 += var16 << 8;
			}

			if ((var23 & 4096) != 0) {
				var16 = var2.readUnsignedByte();
				var23 += var16 << 16;
			}

			if ((var23 & 16) != 0) {
				var15.definition = class191.getNpcDefinition(var2.readUnsignedShortLE());
				class545.method10646(var15);
			}

			int var25;
			if ((var23 & 64) != 0) {
				var16 = var2.readUnsignedByte();
				if (var16 > 0) {
					for (var8 = 0; var8 < var16; ++var8) {
						var10 = -1;
						var11 = -1;
						var25 = -1;
						var9 = var2.readUShortSmart();
						if (var9 == 32767) {
							var9 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							var10 = var2.readUShortSmart();
							var25 = var2.readUShortSmart();
						} else if (var9 != 32766) {
							var11 = var2.readUShortSmart();
						} else {
							var9 = -1;
						}

						var13 = var2.readUShortSmart();
						var15.addHitSplat(var9, var11, var10, var25, Client.cycle, var13);
					}
				}

				var8 = var2.readUnsignedByte();
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var2.readUShortSmart();
						var11 = var2.readUShortSmart();
						if (var11 != 32767) {
							var25 = var2.readUShortSmart();
							var13 = var2.readUnsignedByteAdd();
							int var14 = var11 > 0 ? var2.readUnsignedByteNeg() : var13;
							var15.addHealthBar(var10, Client.cycle, var11, var25, var13, var14);
						} else {
							var15.removeHealthBar(var10);
						}
					}
				}
			}

			if ((var23 & 16384) != 0) {
				var15.field1087 = var2.readUnsignedIntME();
			}

			if ((var23 & 524288) != 0) {
				var15.field1062 = var2.readUnsignedShortAddLE();
				var15.field1068 = var2.readUnsignedByteAdd() == 1;
			}

			int[] var17;
			short[] var18;
			if ((var23 & 262144) != 0) {
				var16 = var2.readUnsignedByteNeg();
				if (var16 == 0) {
					var15.method2675();
				} else {
					var17 = new int[8];
					var18 = new short[8];

					for (var10 = 0; var10 < 8; ++var10) {
						if ((var16 & 1 << var10) != 0) {
							var17[var10] = var2.readNullableLargeSmart();
							var18[var10] = (short)var2.readShortSmartSub();
						} else {
							var17[var10] = -1;
							var18[var10] = -1;
						}
					}

					var15.method2674(var17, var18);
				}
			}

			if ((var23 & 32) != 0) {
				var15.overheadText = var2.readStringCp1252NullTerminated();
				var15.overheadTextCyclesRemaining = 100;
			}

			if ((var23 & 256) != 0) {
				var15.field1070 = var2.readByte();
				var15.field1072 = var2.readByteNeg();
				var15.field1071 = var2.readByteNeg();
				var15.field1073 = var2.readByteSub();
				var15.spotAnimation = var2.readUnsignedShort() + Client.cycle;
				var15.field1075 = var2.readUnsignedShortAdd() + Client.cycle;
				var15.field1076 = var2.readUnsignedShort();
				var15.pathLength = 0;
				var15.field1086 = 0;
				var15.field1070 += var15.pathX[0];
				var15.field1072 += var15.pathY[0];
				var15.field1071 += var15.pathX[0];
				var15.field1073 += var15.pathY[0];
			}

			if ((var23 & 1) != 0) {
				var16 = var2.readUnsignedShortLE();
				if (var16 == 65535) {
					var16 = -1;
				}

				var8 = var2.readUnsignedByte();
				SequenceDefinition var29 = var15.field1065.method9571();
				if (var16 == var15.method2384() && var16 != -1) {
					var10 = var29.restartMode;
					if (var10 == 1) {
						var15.field1065.method9576();
						var15.field1059 = var8;
					}

					if (var10 == 2) {
						var15.field1065.method9577();
					}
				} else if (var16 == -1 || !var15.field1065.method9570() || AsyncHttpResponse.SequenceDefinition_get(var16).field2410 >= var29.field2410) {
					var15.field1065.method9569(var16);
					var15.field1065.method9576();
					var15.field1059 = var8;
					var15.field1086 = var15.pathLength;
				}
			}

			if ((var23 & 4) != 0) {
				var15.targetIndex = var2.readUnsignedShort();
				var15.targetIndex += var2.readUnsignedByteNeg() << 16;
				var16 = 16777215;
				if (var16 == var15.targetIndex) {
					var15.targetIndex = -1;
				}
			}

			if ((var23 & 8192) != 0) {
				var15.method2663(var2.readStringCp1252NullTerminated());
			}

			short[] var19;
			long var20;
			boolean var27;
			if ((var23 & 1024) != 0) {
				var16 = var2.readUnsignedByteSub();
				if ((var16 & 1) == 1) {
					var15.method2680();
				} else {
					var17 = null;
					if ((var16 & 2) == 2) {
						var9 = var2.readUnsignedByteAdd();
						var17 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.readUnsignedShort();
							var11 = var11 == 65535 ? -1 : var11;
							var17[var10] = var11;
						}
					}

					var18 = null;
					if ((var16 & 4) == 4) {
						var10 = 0;
						if (var15.definition.recolorTo != null) {
							var10 = var15.definition.recolorTo.length;
						}

						var18 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var18[var11] = (short)var2.readUnsignedShort();
						}
					}

					var19 = null;
					if ((var16 & 8) == 8) {
						var11 = 0;
						if (var15.definition.retextureTo != null) {
							var11 = var15.definition.retextureTo.length;
						}

						var19 = new short[var11];

						for (var25 = 0; var25 < var11; ++var25) {
							var19[var25] = (short)var2.readUnsignedShort();
						}
					}

					var27 = false;
					if ((var16 & 16) != 0) {
						var27 = var2.readUnsignedByteSub() == 1;
					}

					var20 = (long)(++NPC.field1162 - 1);
					var15.method2705(new NpcOverrides(var20, var17, var18, var19, var27));
				}
			}

			if ((var23 & 65536) != 0) {
				var16 = var2.readUnsignedByteSub();

				for (var8 = 0; var8 < var16; ++var8) {
					var9 = var2.readUnsignedByteAdd();
					var10 = var2.readUnsignedShort();
					var11 = var2.readUnsignedIntLE();
					var15.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
				}
			}

			if ((var23 & 128) != 0) {
				var2.readUnsignedShortAddLE();
				var2.readUnsignedIntIME();
			}

			if ((var23 & 131072) != 0) {
				var16 = var2.readInt();
				var15.turnLeftSequence = (var16 & 1) != 0 ? var2.readUnsignedShort() : var15.definition.turnLeftSequence;
				var15.turnRightSequence = (var16 & 2) != 0 ? var2.readUnsignedShort() : var15.definition.turnRightSequence;
				var15.walkSequence = (var16 & 4) != 0 ? var2.readUnsignedShortLE() : var15.definition.walkSequence;
				var15.walkBackSequence = (var16 & 8) != 0 ? var2.readUnsignedShortAdd() : var15.definition.walkBackSequence;
				var15.walkLeftSequence = (var16 & 16) != 0 ? var2.readUnsignedShortLE() : var15.definition.walkLeftSequence;
				var15.walkRightSequence = (var16 & 32) != 0 ? var2.readUnsignedShort() : var15.definition.walkRightSequence;
				var15.runSequence = (var16 & 64) != 0 ? var2.readUnsignedShort() : var15.definition.field2086;
				var15.field1077 = (var16 & 128) != 0 ? var2.readUnsignedShort() : var15.definition.field2101;
				var15.field1050 = (var16 & 256) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2073;
				var15.field1051 = (var16 & 512) != 0 ? var2.readUnsignedShort() : var15.definition.field2089;
				var15.field1052 = (var16 & 1024) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2090;
				var15.field1020 = (var16 & 2048) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2091;
				var15.field1061 = (var16 & 4096) != 0 ? var2.readUnsignedShortLE() : var15.definition.field2092;
				var15.field1055 = (var16 & 8192) != 0 ? var2.readUnsignedShortLE() : var15.definition.field2093;
				var15.idleSequence = (var16 & 16384) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.idleSequence;
			}

			if ((var23 & 32768) != 0) {
				var15.npcCycle = Client.cycle + var2.readUnsignedShortAddLE();
				var15.field1026 = Client.cycle + var2.readUnsignedShort();
				byte var30 = var2.readByteSub();
				byte var24 = var2.readByteSub();
				byte var26 = var2.readByteAdd();
				byte var28 = (byte)var2.readUnsignedByteAdd();
				var15.field1066.method5658(var30, var24, var26, var28);
			}

			if ((var23 & 2) != 0) {
				var2.readUnsignedShortAddLE();
				var2.readUnsignedShort();
				var2.readUnsignedByte();
			}

			if ((var23 & 2048) != 0) {
				var15.method2664(var2.readUnsignedByteNeg());
			}

			if ((var23 & 512) != 0) {
				var16 = var2.readUnsignedByteAdd();
				if ((var16 & 1) == 1) {
					var15.method2714();
				} else {
					var17 = null;
					if ((var16 & 2) == 2) {
						var9 = var2.readUnsignedByteAdd();
						var17 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var2.readUnsignedShort();
							var11 = var11 == 65535 ? -1 : var11;
							var17[var10] = var11;
						}
					}

					var18 = null;
					if ((var16 & 4) == 4) {
						var10 = 0;
						if (var15.definition.recolorTo != null) {
							var10 = var15.definition.recolorTo.length;
						}

						var18 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var18[var11] = (short)var2.readUnsignedShort();
						}
					}

					var19 = null;
					if ((var16 & 8) == 8) {
						var11 = 0;
						if (var15.definition.retextureTo != null) {
							var11 = var15.definition.retextureTo.length;
						}

						var19 = new short[var11];

						for (var25 = 0; var25 < var11; ++var25) {
							var19[var25] = (short)var2.readUnsignedShortLE();
						}
					}

					var27 = false;
					if ((var16 & 16) != 0) {
						var27 = var2.readUnsignedByteSub() == 1;
					}

					var20 = (long)(++NPC.field1163 - 1);
					var15.method2677(new NpcOverrides(var20, var17, var18, var19, var27));
				}
			}
		}

		for (var22 = 0; var22 < Client.field370; ++var22) {
			var4 = Client.field494[var22];
			var15 = (NPC)var0.npcs.get((long)var4);
			if (var15.field1165) {
				var15.definition = null;
				var15.detach();
			}
		}

		if (var2.field5818 != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var2.field5818 + "," + Client.packetWriter.serverPacketLength);
		}
	}
}
