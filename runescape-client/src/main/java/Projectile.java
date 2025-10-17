import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1741977073
	)
	@Export("sourceLevel")
	int sourceLevel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -154300045
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1063692605
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2087323613
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -231702991
	)
	@Export("sourceIndex")
	int sourceIndex;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1549622353
	)
	@Export("targetLevel")
	int targetLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -117747693
	)
	@Export("targetX")
	int targetX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1367890287
	)
	@Export("targetY")
	int targetY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1768780573
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 302081407
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1061276179
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 731816001
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1357407507
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2093040025
	)
	@Export("startPos")
	int startPos;
	@ObfuscatedName("ar")
	@Export("x")
	double x;
	@ObfuscatedName("az")
	@Export("y")
	double y;
	@ObfuscatedName("au")
	@Export("z")
	double z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -506674987
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1912427039
	)
	int field760;
	@ObfuscatedName("ax")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("an")
	double field752;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1809142385
	)
	@Export("id")
	int id;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		this.isMoving = false;
		this.animationSequence = new AnimationSequence();
		this.sourceLevel = var1;
		this.sourceX = var2;
		this.sourceY = var3;
		this.startHeight = var4;
		this.sourceIndex = var5;
		this.targetLevel = var6;
		this.targetX = var7;
		this.targetY = var8;
		this.endHeight = var9;
		this.targetIndex = var10;
		this.id = var11;
		this.cycleStart = var12;
		this.cycleEnd = var13;
		this.slope = var14;
		this.startPos = var15;
		this.animationSequence.setSequence(class535.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9634(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = class535.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			if (var2 == null) {
				return null;
			} else {
				var2.rotateZ(this.field760);
				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4823(this.animationSequence.getFrame())) {
			return true;
		} else {
			SpotAnimationDefinition var1 = class535.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.method4480();
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "128"
	)
	void method1992(int var1, int var2) {
		this.sourceX += var1;
		this.sourceY += var2;
		this.targetX += var1;
		this.targetY += var2;
		this.x += (double)Coord.method7440(var1);
		this.y += (double)Coord.method7440(var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIB)V",
		garbageValue = "-52"
	)
	@Export("setDestination")
	void setDestination(WorldViewManager var1, int var2, int var3) {
		if (var2 >= this.cycleStart) {
			ProjectionCoord var4 = TileItem.method2915(this.targetIndex, this.targetX, this.targetY, this.targetLevel, var1);
			int var5 = (int)var4.x;
			int var6 = (int)var4.y;
			int var7 = (int)var4.z - this.endHeight;
			var4.release();
			double var12;
			double var14;
			double var16;
			if (!this.isMoving) {
				ProjectionCoord var8 = TileItem.method2915(this.sourceIndex, this.sourceX, this.sourceY, this.sourceLevel, var1);
				int var9 = (int)var8.x;
				int var10 = (int)var8.y;
				int var11 = (int)var8.z - this.startHeight;
				var8.release();
				var12 = (double)(var5 - var9);
				var14 = (double)(var6 - var10);
				var16 = Math.sqrt(var12 * var12 + var14 * var14);
				this.x = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : (double)this.startPos * var12 / var16 + (double)var9;
				this.y = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : var14 * (double)this.startPos / var16 + (double)var10;
				this.z = (double)var11;
			}

			double var18 = (double)(this.cycleEnd + 1 - var2);
			double var20 = ((double)var5 - this.x) / var18;
			var12 = ((double)var6 - this.y) / var18;
			var14 = Math.sqrt(var12 * var12 + var20 * var20);
			if (!this.isMoving) {
				this.field752 = -var14 * Math.tan((double)this.slope * 0.02454369D);
			}

			var16 = ((double)var7 - this.z - this.field752 * var18) * 2.0D / (var18 * var18);
			this.isMoving = true;
			this.x += var20 * (double)var3;
			this.y += var12 * (double)var3;
			this.z += (double)var3 * this.field752 + (double)var3 * var16 * 0.5D * (double)var3;
			this.field752 += (double)var3 * var16;
			this.orientation = (int)(Math.atan2(var20, var12) * 325.949D) + 1024 & 2047;
			this.field760 = (int)(Math.atan2(this.field752, var14) * 325.949D) & 2047;
			Client.field472.method11014(class547.topLevelWorldView, (int)this.x, (int)this.y, false);
			CollisionMap.method6234(this.animationSequence, var3, Client.field472);
			Client.field472.method11013();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "-81"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 == 8222) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (var0 == 8225) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (var0 == 352) {
				var1 = -118;
			} else if (var0 == 8249) {
				var1 = -117;
			} else if (var0 == 338) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (var0 == 8211) {
				var1 = -106;
			} else if (var0 == 8212) {
				var1 = -105;
			} else if (var0 == 732) {
				var1 = -104;
			} else if (var0 == 8482) {
				var1 = -103;
			} else if (var0 == 353) {
				var1 = -102;
			} else if (var0 == 8250) {
				var1 = -101;
			} else if (var0 == 339) {
				var1 = -100;
			} else if (var0 == 382) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIILke;I)V",
		garbageValue = "-808712324"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = TileItem.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = ClanChannelMember.calculateTag(var1, var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				var0.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method5168(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = MusicPatch.field3967[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field817[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var1][var2][var3] = 50;
								Tiles.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = MusicPatch.field3967[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								Tiles.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = MusicPatch.field3967[var1][var2];
								var10000[var3 + 1] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								Tiles.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = MusicPatch.field3967[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								Tiles.Tiles_underlays2[var1][var2][var3] = 50;
								Tiles.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = MusicPatch.field3967[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method6228(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method5300(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field818[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								Tiles.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								Tiles.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								Tiles.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								Tiles.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method6228(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field817[var5], Tiles.field817[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[var3] |= 585;
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[1 + var3] |= 1170;
								} else if (var5 == 1) {
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[var3 + 1] |= 1170;
									var10000 = MusicPatch.field3967[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = MusicPatch.field3967[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[var3] |= 1170;
									var10000 = MusicPatch.field3967[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method6228(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method5300(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field818[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									Tiles.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									Tiles.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									Tiles.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									Tiles.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method6228(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method5168(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method5300(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field817[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field817[var5], 0, var23 * Tiles.field823[var5], var23 * Tiles.field820[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field821[var5], var23 * Tiles.field822[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (var24 != 0L) {
									var23 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field821[var5], var23 * Tiles.field822[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method5168(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method5535() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > Tiles.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									Tiles.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lpg;Ljava/lang/String;I)V",
		garbageValue = "-1250715338"
	)
	static void method2012(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field520 += var2.groupCount;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method2014(int var0) {
		for (WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.first(); var1 != null; var1 = (WidgetConfigNode)Client.widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 16 & 65535L)) {
				var1.remove();
			}
		}

	}
}
