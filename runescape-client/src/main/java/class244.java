import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class244 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2026")
	public static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2013371277"
	)
	public static int method5163(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ldy;IB)V",
		garbageValue = "9"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var3;
		int var4;
		int var5;
		int var6;
		int var8;
		int var9;
		SequenceDefinition var13;
		int var14;
		int var26;
		if (var1.spotAnimation >= Client.cycle) {
			class167.method3694(var1);
		} else if (var1.field1273 >= Client.cycle) {
			boolean var12 = Client.cycle == var1.field1273 || var1.sequence == -1 || var1.sequenceDelay != 0;
			if (!var12) {
				var13 = class91.SequenceDefinition_get(var1.sequence);
				if (var13 != null && !var13.isCachedModelIdSet()) {
					var12 = var1.sequenceFrameCycle + 1 > var13.frameLengths[var1.sequenceFrame];
				} else {
					var12 = true;
				}
			}

			if (var12) {
				var4 = var1.field1273 - var1.spotAnimation;
				var5 = Client.cycle - var1.spotAnimation;
				var6 = var1.field1256 * 128 + var1.size * -729546752;
				var14 = var1.field1270 * 128 + var1.size * -729546752;
				var8 = var1.field1269 * 128 + var1.size * -729546752;
				var9 = var1.field1229 * 128 + var1.size * -729546752;
				var1.x = (var5 * var8 + var6 * (var4 - var5)) / var4;
				var1.y = (var9 * var5 + var14 * (var4 - var5)) / var4;
			}

			var1.field1283 = 0;
			var1.orientation = var1.field1217;
			var1.rotation = var1.orientation;
		} else {
			var1.movementSequence = var1.idleSequence;
			if (var1.pathLength == 0) {
				var1.field1283 = 0;
			} else {
				label548: {
					if (var1.sequence != -1 && var1.sequenceDelay == 0) {
						var3 = class91.SequenceDefinition_get(var1.sequence);
						if (var1.field1284 > 0 && var3.field3010 == 0) {
							++var1.field1283;
							break label548;
						}

						if (var1.field1284 <= 0 && var3.field3000 == 0) {
							++var1.field1283;
							break label548;
						}
					}

					var26 = var1.x;
					var4 = var1.y;
					var5 = var1.pathX[var1.pathLength - 1] * 128 + var1.size * -729546752;
					var6 = var1.pathY[var1.pathLength - 1] * 128 + var1.size * -729546752;
					if (var26 < var5) {
						if (var4 < var6) {
							var1.orientation = 1280;
						} else if (var4 > var6) {
							var1.orientation = 1792;
						} else {
							var1.orientation = 1536;
						}
					} else if (var26 > var5) {
						if (var4 < var6) {
							var1.orientation = 768;
						} else if (var4 > var6) {
							var1.orientation = 256;
						} else {
							var1.orientation = 512;
						}
					} else if (var4 < var6) {
						var1.orientation = 1024;
					} else if (var4 > var6) {
						var1.orientation = 0;
					}

					MoveSpeed var7 = var1.pathTraversed[var1.pathLength - 1];
					if (var5 - var26 <= 256 && var5 - var26 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
						var8 = var1.orientation - var1.rotation & 2047;
						if (var8 > 1024) {
							var8 -= 2048;
						}

						var9 = var1.walkBackSequence;
						if (var8 >= -256 && var8 <= 256) {
							var9 = var1.walkSequence;
						} else if (var8 >= 256 && var8 < 768) {
							var9 = var1.walkRightSequence;
						} else if (var8 >= -768 && var8 <= -256) {
							var9 = var1.walkLeftSequence;
						}

						if (var9 == -1) {
							var9 = var1.walkSequence;
						}

						var1.movementSequence = var9;
						int var10 = 4;
						boolean var11 = true;
						if (var1 instanceof NPC) {
							var11 = ((NPC)var1).definition.isClipped;
						}

						if (var11) {
							if (var1.orientation != var1.rotation && var1.targetIndex == -1 && var1.field1241 != 0) {
								var10 = 2;
							}

							if (var1.pathLength > 2) {
								var10 = 6;
							}

							if (var1.pathLength > 3) {
								var10 = 8;
							}

							if (var1.field1283 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1283;
							}
						} else {
							if (var1.pathLength > 1) {
								var10 = 6;
							}

							if (var1.pathLength > 2) {
								var10 = 8;
							}

							if (var1.field1283 > 0 && var1.pathLength > 1) {
								var10 = 8;
								--var1.field1283;
							}
						}

						if (var7 == MoveSpeed.field3127) {
							var10 <<= 1;
						} else if (var7 == MoveSpeed.field3133) {
							var10 >>= 1;
						}

						if (var10 >= 8) {
							if (var1.walkSequence == var1.movementSequence && var1.runSequence != -1) {
								var1.movementSequence = var1.runSequence;
							} else if (var1.movementSequence == var1.walkBackSequence && var1.field1215 != -1) {
								var1.movementSequence = var1.field1215;
							} else if (var1.walkLeftSequence == var1.movementSequence && var1.field1280 != -1) {
								var1.movementSequence = var1.field1280;
							} else if (var1.movementSequence == var1.walkRightSequence && var1.field1244 != -1) {
								var1.movementSequence = var1.field1244;
							}
						} else if (var10 <= 2) {
							if (var1.movementSequence == var1.walkSequence && var1.field1245 != -1) {
								var1.movementSequence = var1.field1245;
							} else if (var1.walkBackSequence == var1.movementSequence && var1.field1246 != -1) {
								var1.movementSequence = var1.field1246;
							} else if (var1.movementSequence == var1.walkLeftSequence && var1.field1243 != -1) {
								var1.movementSequence = var1.field1243;
							} else if (var1.walkRightSequence == var1.movementSequence && var1.field1248 != -1) {
								var1.movementSequence = var1.field1248;
							}
						}

						if (var26 != var5 || var6 != var4) {
							if (var26 < var5) {
								var1.x += var10;
								if (var1.x > var5) {
									var1.x = var5;
								}
							} else if (var26 > var5) {
								var1.x -= var10;
								if (var1.x < var5) {
									var1.x = var5;
								}
							}

							if (var4 < var6) {
								var1.y += var10;
								if (var1.y > var6) {
									var1.y = var6;
								}
							} else if (var4 > var6) {
								var1.y -= var10;
								if (var1.y < var6) {
									var1.y = var6;
								}
							}
						}

						if (var5 == var1.x && var6 == var1.y) {
							--var1.pathLength;
							if (var1.field1284 > 0) {
								--var1.field1284;
							}
						}
					} else {
						var1.x = var5;
						var1.y = var6;
						--var1.pathLength;
						if (var1.field1284 > 0) {
							--var1.field1284;
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1273 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -729546752;
			var1.y = var1.pathY[0] * 128 + var1.size * -729546752;
			var1.method2641();
		}

		if (var1 == Script.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1273 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -729546752;
			var1.y = var1.pathY[0] * 128 + var1.size * -729546752;
			var1.method2641();
		}

		if (var1.targetIndex != -1) {
			var3 = null;
			var13 = null;
			var5 = 65536;
			WorldViewManager var15;
			Iterator var16;
			WorldView var17;
			WorldView var20;
			Actor var27;
			if (var1.targetIndex < var5) {
				var14 = var1.targetIndex;
				var15 = Client.worldViewManager;
				var16 = var15.iterator();

				WorldView var19;
				while (true) {
					if (var16.hasNext()) {
						var17 = (WorldView)var16.next();
						if (var17.npcs.get((long)var14) == null) {
							continue;
						}

						var19 = var17;
						break;
					}

					var19 = var15.method2574();
					break;
				}

				var20 = var19;
				var27 = (Actor)var19.npcs.get((long)var1.targetIndex);
			} else {
				var6 = var1.targetIndex - var5;
				var15 = Client.worldViewManager;
				var16 = var15.iterator();

				WorldView var23;
				while (true) {
					if (var16.hasNext()) {
						var17 = (WorldView)var16.next();
						Player var18 = (Player)var17.players.get((long)var6);
						if (var18 == null || var17.id == -1) {
							continue;
						}

						var23 = var17;
						break;
					}

					var23 = var15.method2574();
					break;
				}

				var20 = var23;
				var27 = (Actor)var23.players.get((long)var6);
			}

			if (var27 != null) {
				class442 var32 = class219.method4844((float)var1.x, 0.0F, (float)var1.y);
				class442 var24;
				if (var0.id != var20.id) {
					WorldEntity var29;
					if (var0.id == -1) {
						var29 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var20.id);
						var24 = var29.method9358(var27.x, var27.y);
					} else if (var20.id == -1) {
						var29 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var0.id);
						var24 = var29.method9396(var27.x, var27.y);
					} else {
						var29 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var20.id);
						WorldEntity var30 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var0.id);
						class442 var31 = var29.method9358(var27.x, var27.y);
						var24 = var30.method9396((int)var31.field4918, (int)var31.field4922);
						var31.method8339();
					}
				} else {
					var24 = class219.method4844((float)var27.x, 0.0F, (float)var27.y);
				}

				var8 = (int)(var32.field4918 - var24.field4918);
				var9 = (int)(var32.field4922 - var24.field4922);
				if (var8 != 0 || var9 != 0) {
					int var25 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
					var1.orientation = var25;
				}

				var32.method8339();
				var24.method8339();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		if (var1.pathLength == 0 || var1.field1283 > 0) {
			var26 = -1;
			if (var1.field1222 != -1 && var1.field1223 != -1) {
				var4 = Coord.method6897(var1.field1222 - class509.topLevelWorldView.baseX);
				var5 = Coord.method6897(var1.field1223 - class509.topLevelWorldView.baseY);
				var6 = var1.x - var4;
				var14 = var1.y - var5;
				if (var6 != 0 || var14 != 0) {
					var8 = (int)(Math.atan2((double)var6, (double)var14) * 325.94932345220167D) & 2047;
					var26 = var8;
				}
			} else if (var1.field1211 != -1) {
				var26 = var1.field1211;
			}

			if (var26 != -1) {
				var1.orientation = var26;
				if (var1.field1224) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2693();
		}

		var26 = var1.orientation - var1.rotation & 2047;
		if (var26 != 0) {
			boolean var21 = true;
			boolean var22 = true;
			++var1.field1277;
			var6 = var26 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1241;
			boolean var28 = true;
			if (var26 < var1.field1241 || var26 > 2048 - var1.field1241) {
				var1.rotation = var1.orientation;
				var28 = false;
			}

			if (var1.field1241 > 0 && var1.movementSequence == var1.idleSequence && (var1.field1277 > 25 || var28)) {
				if (var6 == -1 && var1.turnLeftSequence != -1) {
					var1.movementSequence = var1.turnLeftSequence;
				} else if (var6 == 1 && var1.turnRightSequence != -1) {
					var1.movementSequence = var1.turnRightSequence;
				} else {
					var1.movementSequence = var1.walkSequence;
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1277 = 0;
		}

		AbstractUserComparator.method9227(var1);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1927373214"
	)
	static final void method5165() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)var1.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		TaskHandler.method4790();
		if (SoundCache.friendsChat != null) {
			SoundCache.friendsChat.clearFriends();
		}

	}
}
