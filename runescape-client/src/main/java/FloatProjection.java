import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = -1784452011
	)
	static int field2946;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("at")
	@Export("projection")
	float[] projection;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5649451870187191813L
	)
	long field2942;

	@ObfuscatedSignature(
		descriptor = "(Lry;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.field2942 = 0L;
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		int var8 = class177.method4270();
		if (this.field2942 != 0L) {
			boolean var9 = WorldMapLabelSize.method6577(var6);
			boolean var10 = !var9 || WorldMapLabelSize.method6577(this.field2942);
			if (var10) {
				long var13 = this.field2942;
				long var11 = var13 & -524289L;
				var6 = var11;
			}
		}

		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
		if (this.field2942 != 0L && var8 != class177.method4270()) {
			this.field2942 = class236.calculateTag(0, 0, 0, 5, !WorldMapLabelSize.method6577(this.field2942), 0, 0);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkz;IIII)V",
		garbageValue = "-436402298"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		if (Rasterizer3D.clips.field3150 != 1) {
			float var6;
			float var7 = var6 = (float)(var4 << 7);
			float var8;
			float var9 = var8 = (float)(var5 << 7);
			float var10;
			float var11 = var10 = var7 + 128.0F;
			float var12;
			float var13 = var12 = var9 + 128.0F;
			float var14 = (float)var1.tileHeights[var3][var4][var5];
			float var15 = (float)var1.tileHeights[var3][var4 + 1][var5];
			float var16 = (float)var1.tileHeights[var3][var4 + 1][var5 + 1];
			float var17 = (float)var1.tileHeights[var3][var4][var5 + 1];
			this.transformationMatrix.transformPoint(var7, var14, var9, this.projection);
			var7 = this.projection[0];
			var14 = this.projection[1];
			var9 = this.projection[2];
			if (var9 >= 50.0F) {
				this.transformationMatrix.transformPoint(var11, var15, var8, this.projection);
				var11 = this.projection[0];
				var15 = this.projection[1];
				var8 = this.projection[2];
				if (var8 >= 50.0F) {
					this.transformationMatrix.transformPoint(var10, var16, var13, this.projection);
					var10 = this.projection[0];
					var16 = this.projection[1];
					var13 = this.projection[2];
					if (var13 >= 50.0F) {
						this.transformationMatrix.transformPoint(var6, var17, var12, this.projection);
						var6 = this.projection[0];
						var17 = this.projection[1];
						var12 = this.projection[2];
						if (var12 >= 50.0F) {
							this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkr;III)V",
		garbageValue = "-656009185"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		if (Rasterizer3D.clips.field3150 != 1) {
			int var5 = var2.vertexX.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				float var7 = (float)var2.vertexX[var6];
				float var8 = (float)var2.vertexY[var6];
				float var9 = (float)var2.vertexZ[var6];
				this.transformationMatrix.transformPoint(var7, var8, var9, this.projection);
				var7 = this.projection[0];
				var8 = this.projection[1];
				var9 = this.projection[2];
				if (var9 < 50.0F) {
					return;
				}

				if (var2.triangleTextureId != null) {
					SceneTileModel.triangleTexturesX[var6] = (int)var7;
					SceneTileModel.triangleTexturesY[var6] = (int)var8;
					SceneTileModel.triangleTexturesZ[var6] = (int)var9;
				}

				SceneTileModel.verticesX[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesY[var6] = (float)Rasterizer3D.getClipMidY() + var8 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesZ[var6] = WorldMapSectionType.method6970(var9);
			}

			this.drawSceneTileModel(var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ad")
	void method5804(long var1) {
		this.field2942 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2131319982"
	)
	public static int method5820(int var0, int var1, int var2) {
		int var3 = SpotAnimationDefinition.method4582(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lxj;B)V",
		garbageValue = "14"
	)
	static final void method5819(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = (NPC)var0.npcs.get((long)var3);
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

			if ((var5 & 512) != 0) {
				var4.field1076 = var1.readInt();
			}

			int[] var7;
			short[] var8;
			int var9;
			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if (var6 == 0) {
					var4.method2820();
				} else {
					var7 = new int[8];
					var8 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var7[var9] = var1.readNullableLargeSmart();
							var8[var9] = (short)var1.readShortSmartSub();
						} else {
							var7[var9] = -1;
							var8[var9] = -1;
						}
					}

					var4.method2819(var7, var8);
				}
			}

			if ((var5 & 131072) != 0) {
				var4.field1009 = var1.readUnsignedShortAdd();
				var4.field1020 = var1.readUnsignedByte() == 1;
			}

			int var14;
			if ((var5 & 2) != 0) {
				var6 = var1.readUnsignedShortLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var14 = var1.readUnsignedByteNeg();
				SequenceDefinition var19 = var4.animationSequence.getSequenceDefinition();
				if (var6 == var4.method2572() && var6 != -1) {
					var9 = var19.restartMode;
					if (var9 == 1) {
						var4.animationSequence.method9872();
						var4.field1017 = var14;
					}

					if (var9 == 2) {
						var4.animationSequence.method9890();
					}
				} else if (var6 == -1 || !var4.animationSequence.isActive() || ClientPacket.SequenceDefinition_get(var6).field2512 >= var19.field2512) {
					var4.animationSequence.setSequence(var6);
					var4.animationSequence.method9872();
					var4.field1017 = var14;
					var4.field1075 = var4.pathLength;
				}
			}

			if ((var5 & 32768) != 0) {
				var4.method2844(var1.readUnsignedByteSub());
			}

			if ((var5 & 1) != 0) {
				var1.readUnsignedShortAdd();
				var1.method11804();
			}

			if ((var5 & 524288) != 0) {
				var6 = var1.method11858();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShort() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShort() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShort() : var4.definition.field2123;
				var4.field1038 = (var6 & 128) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2124;
				var4.field1027 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2105;
				var4.field1012 = (var6 & 512) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2126;
				var4.field1041 = (var6 & 1024) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2127;
				var4.field1042 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var4.definition.field2120;
				var4.field1040 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2129;
				var4.field1043 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var4.definition.field2130;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var4.definition.idleSequence;
			}

			int var10;
			int var11;
			int var15;
			short[] var16;
			long var17;
			boolean var21;
			if ((var5 & 1024) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if ((var6 & 1) == 1) {
					var4.method2824();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var15 = var1.readUnsignedByteAdd();
						var7 = new int[var15];

						for (var9 = 0; var9 < var15; ++var9) {
							var10 = var1.readUnsignedShortLE();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var8 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var8 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var8[var10] = (short)var1.readUnsignedShortAddLE();
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

					var21 = false;
					if ((var6 & 16) != 0) {
						var21 = var1.readUnsignedByteAdd() == 1;
					}

					var17 = (long)(++NPC.field1167 - 1);
					var4.method2822(new NpcOverrides(var17, var7, var8, var16, var21));
				}
			}

			if ((var5 & 8192) != 0) {
				var6 = var1.readUnsignedByteAdd();
				if ((var6 & 1) == 1) {
					var4.method2825();
				} else {
					var7 = null;
					if ((var6 & 2) == 2) {
						var15 = var1.readUnsignedByteAdd();
						var7 = new int[var15];

						for (var9 = 0; var9 < var15; ++var9) {
							var10 = var1.readUnsignedShortAdd();
							var10 = var10 == 65535 ? -1 : var10;
							var7[var9] = var10;
						}
					}

					var8 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.definition.recolorTo != null) {
							var9 = var4.definition.recolorTo.length;
						}

						var8 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var8[var10] = (short)var1.readUnsignedShortAddLE();
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

					var21 = false;
					if ((var6 & 16) != 0) {
						var21 = var1.readUnsignedByte() == 1;
					}

					var17 = (long)(++NPC.field1168 - 1);
					var4.method2823(new NpcOverrides(var17, var7, var8, var16, var21));
				}
			}

			if ((var5 & 64) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedByteSub();

				for (var14 = 0; var14 < var6; ++var14) {
					var15 = var1.readUnsignedByteNeg();
					var9 = var1.readUnsignedShortLE();
					var10 = var1.method11867();
					var4.updateSpotAnimation(var15, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 128) != 0) {
				var4.targetIndex = var1.readUnsignedShortAdd();
				var4.targetIndex += var1.readUnsignedByte() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 8) != 0) {
				var4.definition = AsyncHttpResponse.getNpcDefinition(var1.readUnsignedShortAddLE());
				class151.method3976(var4);
			}

			if ((var5 & 16384) != 0) {
				var4.field1059 = var1.readByteSub();
				var4.field1061 = var1.readByte();
				var4.field1060 = var1.readByteSub();
				var4.field1062 = var1.readByteSub();
				var4.spotAnimation = var1.readUnsignedShortAdd() + Client.cycle;
				var4.field1057 = var1.readUnsignedShortAdd() + Client.cycle;
				var4.field1021 = var1.readUnsignedShortAddLE();
				var4.pathLength = 0;
				var4.field1075 = 0;
				var4.field1059 += var4.pathX[0];
				var4.field1061 += var4.pathY[0];
				var4.field1060 += var4.pathX[0];
				var4.field1062 += var4.pathY[0];
			}

			if ((var5 & 32) != 0) {
				var1.readUnsignedShort();
				var1.readUnsignedShortAdd();
				var1.readUnsignedByteSub();
			}

			if ((var5 & 256) != 0) {
				var4.npcCycle = Client.cycle + var1.readUnsignedShortAdd();
				var4.field1022 = Client.cycle + var1.readUnsignedShortAdd();
				byte var20 = var1.readByteNeg();
				byte var23 = var1.readByteSub();
				byte var24 = var1.readByteNeg();
				byte var22 = (byte)var1.readUnsignedByteSub();
				var4.field1065.method6123(var20, var23, var24, var22);
			}

			if ((var5 & 4) != 0) {
				var6 = var1.readUnsignedByteSub();
				int var12;
				if (var6 > 0) {
					for (var14 = 0; var14 < var6; ++var14) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var15 = var1.readUShortSmart();
						if (var15 == 32767) {
							var15 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var9 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var15 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var15 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var15, var10, var9, var11, Client.cycle, var12);
					}
				}

				var14 = var1.readUnsignedByteAdd();
				if (var14 > 0) {
					for (var15 = 0; var15 < var14; ++var15) {
						var9 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByteNeg();
							int var13 = var10 > 0 ? var1.readUnsignedByteSub() : var12;
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var5 & 4096) != 0) {
				var4.method2808(var1.readStringCp1252NullTerminated());
			}
		}

	}
}
