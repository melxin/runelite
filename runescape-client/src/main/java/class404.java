import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class404 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977346418"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = LoginState.getPreferencesFile("", NpcOverrides.field2082.name, true);
			Buffer var1 = class154.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Ltg;ZI)V",
		garbageValue = "67970309"
	)
	static void method8319(WorldView var0, WorldEntity var1, boolean var2) {
		boolean var3 = var1.field5482.field2215 && !var2;
		long var4 = 0L;
		boolean var6 = var1.worldView.id == Client.currentWorldViewId;
		class396 var7 = var1.method10206(var6);
		boolean var8;
		int var14;
		if (var7 == class396.field4889) {
			var4 = ClanChannelMember.calculateTag(0, 0, 0, 5, false, 0, 0);
		} else if (var3 && var7 != class396.field4882) {
			var8 = var7 == class396.field4884;
			int var9 = var1.getX();
			int var11 = var1.getY();
			int var10 = var11 >> 7;
			var14 = var1.getPlane();
			int var13 = var14 >> 7;
			var4 = ClanChannelMember.calculateTag(var9, var10, var13, 4, !var8, var1.plane, var0.id);
		}

		var1.worldEntityCoord.setZ(class280.getTileHeight(var0, var1.getY(), var1.getPlane(), var0.plane));
		var1.worldView.scene.cycle = Client.cycle;
		var1.initScenePlane(var2);
		var8 = var0.scene.drawEntity(var0.plane, var1.getY(), var1.getPlane(), var1.getZ(), 60, var1.worldView.scene, var1.method10204(), var4, false);
		if (var8 && !var2) {
			WorldView var15 = var1.worldView;
			if (Client.renderSelf) {
				class46.addPlayerToScene(var15, Client.localPlayerIndex, false);
			}

			WorldView var16 = var1.worldView;
			if (Client.combatTargetPlayerIndex >= 0 && var16.players.get((long)Client.combatTargetPlayerIndex) != null) {
				class46.addPlayerToScene(var16, Client.combatTargetPlayerIndex, false);
			}

			PlayerUpdateManager.addNpcsToScene(var1.worldView, class196.field2146);
			WorldView var17 = var1.worldView;
			int var12 = Client.playerUpdateManager.playerCount;
			int[] var18 = Client.playerUpdateManager.playerIndices;

			for (var14 = 0; var14 < var12; ++var14) {
				if (var18[var14] != Client.combatTargetPlayerIndex && var18[var14] != Client.localPlayerIndex) {
					class46.addPlayerToScene(var17, var18[var14], true);
				}
			}

			PlayerUpdateManager.addNpcsToScene(var1.worldView, class196.field2147);
			PlayerUpdateManager.addNpcsToScene(var1.worldView, class196.field2151);
			CollisionMap.method6235(var1.worldView);
		}

	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZLwn;I)V",
		garbageValue = "686709960"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field487 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		int var5;
		NPC var22;
		if (var3 < var0.field1169.method9887()) {
			for (var4 = var3; var4 < var0.field1169.method9887(); ++var4) {
				var5 = var0.field1169.method9886(var4);
				Client.field488[++Client.field487 - 1] = var5;
				var22 = (NPC)var0.npcs.get((long)var5);
				var22.field1183 = true;
			}
		}

		if (var3 > var0.field1169.method9887()) {
			throw new RuntimeException("");
		} else {
			var0.field1169.method9888();

			int var8;
			int var9;
			int var10;
			int var16;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var0.field1169.method9886(var4);
				var22 = (NPC)var0.npcs.get((long)var5);
				var16 = var2.readBits(1);
				if (var16 == 0) {
					var0.field1169.method9884(var5);
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						var0.field1169.method9884(var5);
						Client.npcIndices[++Client.npcCount - 1] = var5;
					} else if (var8 == 1) {
						var0.field1169.method9884(var5);
						var9 = var2.readBits(3);
						var22.method2782(var9, MoveSpeed.field3276);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
						}
					} else if (var8 == 2) {
						var0.field1169.method9884(var5);
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var22.method2782(var9, MoveSpeed.field3274);
							var10 = var2.readBits(3);
							var22.method2782(var10, MoveSpeed.field3274);
						} else {
							var9 = var2.readBits(3);
							var22.method2782(var9, MoveSpeed.field3280);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field488[++Client.field487 - 1] = var5;
						var22.field1183 = true;
					}
				}
			}

			int var11;
			int var12;
			while (true) {
				byte var23 = 16;
				var4 = 1 << var23;
				if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) < var23 + 12) {
					break;
				}

				var5 = var2.readBits(var23);
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

				var0.field1169.method9884(var5);
				var7.field1183 = false;
				var7.worldViewId = var0.id;
				var11 = var2.readBits(1);
				if (var11 == 1) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
				}

				var7.definition = class81.getNpcDefinition(var2.readBits(14));
				var8 = var2.readBits(1);
				var12 = Client.defaultRotations[var2.readBits(3)];
				if (var6) {
					var7.orientation = var7.rotation = var12;
					var7.field1075 = var7.orientation;
				}

				boolean var13 = var2.readBits(1) == 1;
				if (var13) {
					var2.readBits(32);
				}

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

				class562.method11051(var7);
				if (var7.field1088 == 0) {
					var7.rotation = 0;
				}

				var7.method2799(var9 + GameBuild.field4437, var10 + class362.field4087, var8 == 1);
			}

			var2.exportIndex();

			NPC var15;
			for (var3 = 0; var3 < Client.npcCount; ++var3) {
				var4 = Client.npcIndices[var3];
				var15 = (NPC)var0.npcs.get((long)var4);
				int var24 = var2.readUnsignedByte();
				if ((var24 & 4) != 0) {
					var16 = var2.readUnsignedByte();
					var24 += var16 << 8;
				}

				if ((var24 & 32768) != 0) {
					var16 = var2.readUnsignedByte();
					var24 += var16 << 16;
				}

				if ((var24 & 16) != 0) {
					var15.overheadText = var2.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}

				if ((var24 & 65536) != 0) {
					var16 = var2.readUnsignedIntIME();
					var15.turnLeftSequence = (var16 & 1) != 0 ? var2.readUnsignedShort() : var15.definition.turnLeftSequence;
					var15.turnRightSequence = (var16 & 2) != 0 ? var2.readUnsignedShort() : var15.definition.turnRightSequence;
					var15.walkSequence = (var16 & 4) != 0 ? var2.readUnsignedShort() : var15.definition.walkSequence;
					var15.walkBackSequence = (var16 & 8) != 0 ? var2.readUnsignedShort() : var15.definition.walkBackSequence;
					var15.walkLeftSequence = (var16 & 16) != 0 ? var2.readUnsignedShortAdd() : var15.definition.walkLeftSequence;
					var15.walkRightSequence = (var16 & 32) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.walkRightSequence;
					var15.runSequence = (var16 & 64) != 0 ? var2.readUnsignedShort() : var15.definition.field2106;
					var15.field1079 = (var16 & 128) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2107;
					var15.field1058 = (var16 & 256) != 0 ? var2.readUnsignedShortAdd() : var15.definition.field2108;
					var15.field1059 = (var16 & 512) != 0 ? var2.readUnsignedShortLE() : var15.definition.field2138;
					var15.field1060 = (var16 & 1024) != 0 ? var2.readUnsignedShortLE() : var15.definition.field2110;
					var15.field1046 = (var16 & 2048) != 0 ? var2.readUnsignedShort() : var15.definition.field2111;
					var15.field1062 = (var16 & 4096) != 0 ? var2.readUnsignedShortAddLE() : var15.definition.field2112;
					var15.field1047 = (var16 & 8192) != 0 ? var2.readUnsignedShortLE() : var15.definition.field2104;
					var15.idleSequence = (var16 & 16384) != 0 ? var2.readUnsignedShortLE() : var15.definition.idleSequence;
				}

				int[] var17;
				short[] var18;
				short[] var19;
				long var20;
				boolean var27;
				if ((var24 & 512) != 0) {
					var16 = var2.readUnsignedByteAdd();
					if ((var16 & 1) == 1) {
						var15.method2795();
					} else {
						var17 = null;
						if ((var16 & 2) == 2) {
							var9 = var2.readUnsignedByteNeg();
							var17 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedShortAddLE();
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
								var18[var11] = (short)var2.readUnsignedShortAddLE();
							}
						}

						var19 = null;
						if ((var16 & 8) == 8) {
							var11 = 0;
							if (var15.definition.retextureTo != null) {
								var11 = var15.definition.retextureTo.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.readUnsignedShortAddLE();
							}
						}

						var27 = false;
						if ((var16 & 16) != 0) {
							var27 = var2.readUnsignedByteSub() == 1;
						}

						var20 = (long)(++NPC.field1181 - 1);
						var15.method2819(new NpcOverrides(var20, var17, var18, var19, var27));
					}
				}

				if ((var24 & 64) != 0) {
					var2.readUnsignedShortAdd();
					var2.readUnsignedShortAdd();
					var2.readUnsignedByteAdd();
				}

				if ((var24 & 8) != 0) {
					var16 = var2.readUnsignedByteSub();
					int var26;
					if (var16 > 0) {
						for (var8 = 0; var8 < var16; ++var8) {
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

							var26 = var2.readUShortSmart();
							var15.addHitSplat(var9, var11, var10, var12, Client.cycle, var26);
						}
					}

					var8 = var2.readUnsignedByte();
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							if (var11 != 32767) {
								var12 = var2.readUShortSmart();
								var26 = var2.readUnsignedByteSub();
								int var14 = var11 > 0 ? var2.readUnsignedByteNeg() : var26;
								var15.addHealthBar(var10, Client.cycle, var11, var12, var26, var14);
							} else {
								var15.removeHealthBar(var10);
							}
						}
					}
				}

				if ((var24 & 8192) != 0) {
					var15.method2778(var2.readStringCp1252NullTerminated());
				}

				if ((var24 & 1024) != 0) {
					var16 = var2.readUnsignedByteNeg();
					if ((var16 & 1) == 1) {
						var15.method2796();
					} else {
						var17 = null;
						if ((var16 & 2) == 2) {
							var9 = var2.readUnsignedByteSub();
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
								var18[var11] = (short)var2.readUnsignedShortLE();
							}
						}

						var19 = null;
						if ((var16 & 8) == 8) {
							var11 = 0;
							if (var15.definition.retextureTo != null) {
								var11 = var15.definition.retextureTo.length;
							}

							var19 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var19[var12] = (short)var2.readUnsignedShortAdd();
							}
						}

						var27 = false;
						if ((var16 & 16) != 0) {
							var27 = var2.readUnsignedByteNeg() == 1;
						}

						var20 = (long)(++NPC.field1180 - 1);
						var15.method2794(new NpcOverrides(var20, var17, var18, var19, var27));
					}
				}

				if ((var24 & 262144) != 0) {
					var15.field1075 = var2.readUnsignedShort();
					var15.field1039 = var2.readUnsignedByte() == 1;
				}

				if ((var24 & 2) != 0) {
					var15.targetIndex = var2.readUnsignedShort();
					var15.targetIndex += var2.readUnsignedByte() << 16;
					var16 = 16777215;
					if (var16 == var15.targetIndex) {
						var15.targetIndex = -1;
					}
				}

				if ((var24 & 32) != 0) {
					var2.readUnsignedShortAdd();
					var2.readUnsignedIntIME();
				}

				if ((var24 & 2048) != 0) {
					var15.npcCycle = Client.cycle + var2.readUnsignedShort();
					var15.field1041 = Client.cycle + var2.readUnsignedShortAdd();
					byte var30 = var2.readByteNeg();
					byte var25 = var2.readByte();
					byte var28 = var2.readByteNeg();
					byte var29 = (byte)var2.readUnsignedByte();
					var15.field1071.method5729(var30, var25, var28, var29);
				}

				if ((var24 & 1) != 0) {
					var16 = var2.readUnsignedShort();
					if (var16 == 65535) {
						var16 = -1;
					}

					var8 = var2.readUnsignedByteAdd();
					SequenceDefinition var31 = var15.animationSequence.getSequenceDefinition();
					if (var16 == var15.method2445() && var16 != -1) {
						var10 = var31.restartMode;
						if (var10 == 1) {
							var15.animationSequence.method9630();
							var15.field1054 = var8;
						}

						if (var10 == 2) {
							var15.animationSequence.method9678();
						}
					} else if (var16 == -1 || !var15.animationSequence.isActive() || class171.SequenceDefinition_get(var16).field2485 >= var31.field2485) {
						var15.animationSequence.setSequence(var16);
						var15.animationSequence.method9630();
						var15.field1054 = var8;
						var15.field1094 = var15.pathLength;
					}
				}

				if ((var24 & 128) != 0) {
					var15.definition = class81.getNpcDefinition(var2.readUnsignedShortLE());
					class562.method11051(var15);
				}

				if ((var24 & 16384) != 0) {
					var15.field1032 = var2.readByte();
					var15.field1080 = var2.readByte();
					var15.field1061 = var2.readByte();
					var15.field1055 = var2.readByte();
					var15.spotAnimation = var2.readUnsignedShortAdd() + Client.cycle;
					var15.field1083 = var2.readUnsignedShortAddLE() + Client.cycle;
					var15.field1084 = var2.readUnsignedShortAdd();
					var15.pathLength = 0;
					var15.field1094 = 0;
					var15.field1032 += var15.pathX[0];
					var15.field1080 += var15.pathY[0];
					var15.field1061 += var15.pathX[0];
					var15.field1055 += var15.pathY[0];
				}

				if ((var24 & 131072) != 0) {
					var16 = var2.readUnsignedByte();
					if (var16 == 0) {
						var15.method2791();
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

						var15.method2790(var17, var18);
					}
				}

				if ((var24 & 256) != 0) {
					var15.method2779(var2.readUnsignedByteNeg());
				}

				if ((var24 & 524288) != 0) {
					var16 = var2.readUnsignedByteNeg();

					for (var8 = 0; var8 < var16; ++var8) {
						var9 = var2.readUnsignedByte();
						var10 = var2.readUnsignedShort();
						var11 = var2.readUnsignedIntIME();
						var15.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var24 & 4096) != 0) {
					var15.field1057 = var2.readUnsignedIntME();
				}
			}

			for (var3 = 0; var3 < Client.field487; ++var3) {
				var4 = Client.field488[var3];
				var15 = (NPC)var0.npcs.get((long)var4);
				if (var15.field1183) {
					var15.definition = null;
					var15.detach();
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
			}
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1617860993"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class154.clientPreferences.getMusicVolume()) {
			if (class154.clientPreferences.getMusicVolume() == 0 && WorldMapAreaData.method6932()) {
				Archive var6 = class443.field5180;
				if (!class338.field3891.isEmpty()) {
					ArrayList var7 = new ArrayList();
					Iterator var3 = class338.field3891.iterator();

					while (var3.hasNext()) {
						MidiRequest var4 = (MidiRequest)var3.next();
						var4.field4021 = false;
						var4.field4025 = false;
						var4.field4023 = false;
						var4.field4015 = false;
						var4.musicTrackArchive = var6;
						var4.musicTrackVolume = var0;
						var4.field4019 = 0.0F;
						var7.add(var4);
					}

					TextureProvider.method5489(var7, class338.musicPlayerStatus, class338.field3899, class338.field3896, class338.field3901, false);
				}

				Client.playingJingle = false;
			} else if (var0 == 0) {
				Clock.method6092(0, 0);
				Client.playingJingle = false;
			} else if (!class338.midiRequests.isEmpty()) {
				Iterator var1 = class338.midiRequests.iterator();

				while (var1.hasNext()) {
					MidiRequest var2 = (MidiRequest)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MidiRequest var5 = (MidiRequest)class338.midiRequests.get(0);
				if (var5 != null && var5.midiPcmStream != null && var5.midiPcmStream.isReady() && !var5.field4023) {
					var5.midiPcmStream.setPcmStreamVolume(var0);
					var5.field4019 = (float)var0;
				}
			}

			class154.clientPreferences.updateMusicVolume(var0);
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(IIILnt;I)V",
		garbageValue = "824386273"
	)
	static void method8318(int var0, int var1, int var2, SpriteMask var3) {
		for (int var4 = 0; var4 < Client.mapIconCount; ++var4) {
			int var5 = Client.mapIconXs[var4] * 4 + 2 - Client.field484 / 32;
			int var6 = Client.mapIconYs[var4] * 4 + 2 - Client.field377 / 32;
			class445.drawSpriteOnMinimap(var0, var1, var5, var6, var2, Client.mapIcons[var4], var3);
		}

	}
}
