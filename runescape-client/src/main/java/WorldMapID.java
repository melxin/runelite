import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final WorldMapID field3471;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final WorldMapID field3466;
	@ObfuscatedName("ng")
	static boolean field3470;
	@ObfuscatedName("ok")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 944343001
	)
	@Export("value")
	final int value;

	static {
		field3471 = new WorldMapID(0);
		field3466 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lct;II)V",
		garbageValue = "-4277042"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		SequenceDefinition var4;
		int var5;
		int var6;
		int var7;
		int var9;
		int var13;
		int var19;
		if (var1.spotAnimation >= Client.cycle) {
			class574.method11034(var1);
		} else {
			int var12;
			if (var1.field1094 >= Client.cycle) {
				boolean var3 = Client.cycle == var1.field1094 || !var1.method2420();
				if (!var3) {
					var4 = var1.animationSequence.getSequenceDefinition();
					if (var4 != null && !var4.isCachedModelIdSet()) {
						var3 = var1.animationSequence.getFrameCycle() + 1 > var4.frameLengths[var1.animationSequence.getFrame()];
					} else {
						var3 = true;
					}
				}

				if (var3) {
					var12 = var1.field1094 - var1.spotAnimation;
					var5 = Client.cycle - var1.spotAnimation;
					var6 = var1.field1089 * 128 + var1.size * 92278784;
					var7 = var1.field1091 * 128 + var1.size * 92278784;
					var13 = var1.field1072 * 128 + var1.size * 92278784;
					var9 = var1.field1084 * 128 + var1.size * 92278784;
					var1.x = (var5 * var13 + var6 * (var12 - var5)) / var12;
					var1.y = (var5 * var9 + var7 * (var12 - var5)) / var12;
				}

				var1.field1104 = 0;
				var1.orientation = var1.field1095;
				var1.rotation = var1.orientation;
			} else {
				var19 = var1.idleSequence;
				if (var1.pathLength == 0) {
					var1.field1104 = 0;
					var1.method2438(var19);
				} else {
					label510: {
						if (var1.method2420()) {
							var4 = var1.animationSequence.getSequenceDefinition();
							if (var1.field1040 > 0 && var4.field2492 == 0) {
								++var1.field1104;
								var1.method2438(var19);
								break label510;
							}

							if (var1.field1040 <= 0 && var4.field2485 == 0) {
								++var1.field1104;
								var1.method2438(var19);
								break label510;
							}
						}

						var12 = var1.x;
						var5 = var1.y;
						var6 = var1.pathX[var1.pathLength - 1] * 128 + var1.size * 92278784;
						var7 = var1.pathY[var1.pathLength - 1] * 128 + var1.size * 92278784;
						if (var12 < var6) {
							if (var5 < var7) {
								var1.orientation = 1280;
							} else if (var5 > var7) {
								var1.orientation = 1792;
							} else {
								var1.orientation = 1536;
							}
						} else if (var12 > var6) {
							if (var5 < var7) {
								var1.orientation = 768;
							} else if (var5 > var7) {
								var1.orientation = 256;
							} else {
								var1.orientation = 512;
							}
						} else if (var5 < var7) {
							var1.orientation = 1024;
						} else if (var5 > var7) {
							var1.orientation = 0;
						}

						MoveSpeed var8 = var1.pathTraversed[var1.pathLength - 1];
						if (var6 - var12 <= 256 && var6 - var12 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
							var9 = var1.orientation - var1.rotation & 2047;
							if (var9 > 1024) {
								var9 -= 2048;
							}

							var19 = var1.walkBackSequence;
							if (var9 >= -256 && var9 <= 256) {
								var19 = var1.walkSequence;
							} else if (var9 >= 256 && var9 < 768) {
								var19 = var1.walkRightSequence;
							} else if (var9 >= -768 && var9 <= -256) {
								var19 = var1.walkLeftSequence;
							}

							if (var19 == -1) {
								var19 = var1.walkSequence;
							}

							int var10 = 4;
							boolean var11 = true;
							if (var1 instanceof NPC) {
								var11 = ((NPC)var1).definition.isClipped;
							}

							if (var11) {
								if (var1.orientation != var1.rotation && var1.targetIndex == -1 && var1.field1099 != 0) {
									var10 = 2;
								}

								if (var1.pathLength > 2) {
									var10 = 6;
								}

								if (var1.pathLength > 3) {
									var10 = 8;
								}

								if (var1.field1104 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1104;
								}
							} else {
								if (var1.pathLength > 1) {
									var10 = 6;
								}

								if (var1.pathLength > 2) {
									var10 = 8;
								}

								if (var1.field1104 > 0 && var1.pathLength > 1) {
									var10 = 8;
									--var1.field1104;
								}
							}

							if (var8 == MoveSpeed.field3282) {
								var10 <<= 1;
							} else if (var8 == MoveSpeed.field3280) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var19 == var1.walkSequence && var1.runSequence != -1) {
									var19 = var1.runSequence;
								} else if (var19 == var1.walkBackSequence && var1.field1068 != -1) {
									var19 = var1.field1068;
								} else if (var19 == var1.walkLeftSequence && var1.field1065 != -1) {
									var19 = var1.field1065;
								} else if (var19 == var1.walkRightSequence && var1.field1090 != -1) {
									var19 = var1.field1090;
								}
							} else if (var10 <= 2) {
								if (var19 == var1.walkSequence && var1.field1071 != -1) {
									var19 = var1.field1071;
								} else if (var19 == var1.walkBackSequence && var1.field1069 != -1) {
									var19 = var1.field1069;
								} else if (var19 == var1.walkLeftSequence && var1.field1061 != -1) {
									var19 = var1.field1061;
								} else if (var19 == var1.walkRightSequence && var1.field1105 != -1) {
									var19 = var1.field1105;
								}
							}

							if (var6 != var12 || var5 != var7) {
								if (var12 < var6) {
									var1.x += var10;
									if (var1.x > var6) {
										var1.x = var6;
									}
								} else if (var12 > var6) {
									var1.x -= var10;
									if (var1.x < var6) {
										var1.x = var6;
									}
								}

								if (var5 < var7) {
									var1.y += var10;
									if (var1.y > var7) {
										var1.y = var7;
									}
								} else if (var5 > var7) {
									var1.y -= var10;
									if (var1.y < var7) {
										var1.y = var7;
									}
								}
							}

							if (var6 == var1.x && var7 == var1.y) {
								--var1.pathLength;
								if (var1.field1040 > 0) {
									--var1.field1040;
								}
							}

							var1.method2438(var19);
						} else {
							var1.x = var6;
							var1.y = var7;
							--var1.pathLength;
							if (var1.field1040 > 0) {
								--var1.field1040;
							}

							var1.method2438(var19);
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.method2472();
			var1.spotAnimation = 0;
			var1.field1094 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * 92278784;
			var1.y = var1.pathY[0] * 128 + var1.size * 92278784;
			var1.method2423();
		}

		if (var1 == HealthBarUpdate.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.method2472();
			var1.spotAnimation = 0;
			var1.field1094 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * 92278784;
			var1.y = var1.pathY[0] * 128 + var1.size * 92278784;
			var1.method2423();
		}

		if (var1.targetIndex != -1) {
			WorldView var14 = null;
			var4 = null;
			var5 = 65536;
			Actor var20;
			if (var1.targetIndex >= var5) {
				var6 = var1.targetIndex - var5;
				var14 = class418.method8493(var6, Client.worldViewManager);
				var20 = (Actor)var14.players.get((long)var6);
			} else {
				var7 = var1.targetIndex;
				WorldViewManager var23 = Client.worldViewManager;
				Iterator var15 = var23.iterator();

				WorldView var16;
				while (true) {
					if (var15.hasNext()) {
						WorldView var17 = (WorldView)var15.next();
						if (var17.npcs.get((long)var7) == null) {
							continue;
						}

						var16 = var17;
						break;
					}

					var16 = var23.method2343();
					break;
				}

				var14 = var16;
				var20 = (Actor)var16.npcs.get((long)var1.targetIndex);
			}

			if (var20 != null) {
				class452 var27 = WorldMapSection0.method6761((float)var1.x, 0.0F, (float)var1.y);
				class452 var18;
				if (var0.id != var14.id) {
					WorldEntity var24;
					if (var0.id == -1) {
						var24 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var14.id);
						var18 = var24.method10084(var20.x, var20.y);
					} else if (var14.id == -1) {
						var24 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var0.id);
						var18 = var24.method10107(var20.x, var20.y);
					} else {
						var24 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var14.id);
						WorldEntity var26 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var0.id);
						class452 var28 = var24.method10084(var20.x, var20.y);
						var18 = var26.method10107((int)var28.field5175, (int)var28.field5169);
						var28.method8992();
					}
				} else {
					var18 = WorldMapSection0.method6761((float)var20.x, 0.0F, (float)var20.y);
				}

				var13 = (int)(var27.field5175 - var18.field5175);
				var9 = (int)(var27.field5169 - var18.field5169);
				if (var13 != 0 || var9 != 0) {
					var1.orientation = AbstractByteArrayCopier.method8118(var13, var9);
				}

				var27.method8992();
				var18.method8992();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		if (var1.pathLength == 0 || var1.field1104 > 0) {
			var19 = -1;
			if (var1.field1049 != -1) {
				var19 = var1.field1049;
			}

			if (var19 != -1) {
				var1.orientation = var19;
				if (var1.field1050) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2432();
		}

		var19 = var1.orientation - var1.rotation & 2047;
		if (var19 != 0) {
			boolean var25 = true;
			boolean var21 = true;
			++var1.field1098;
			var6 = var19 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1099;
			boolean var22 = true;
			if (var19 < var1.field1099 || var19 > 2048 - var1.field1099) {
				var1.rotation = var1.orientation;
				var22 = false;
			}

			if (var1.field1099 > 0 && var1.method2416() == var1.idleSequence && (var1.field1098 > 25 || var22)) {
				if (var6 == -1 && var1.turnLeftSequence != -1) {
					var1.method2438(var1.turnLeftSequence);
				} else if (var6 == 1 && var1.turnRightSequence != -1) {
					var1.method2438(var1.turnRightSequence);
				} else {
					var1.method2438(var1.walkSequence);
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1098 = 0;
		}

		AddRequestTask.method9640(var0, var1);
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "220324664"
	)
	static final void method6832(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2349()];
		float[] var3 = new float[Client.worldViewManager.method2349()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var22 = (WorldView)var5.next();
			var2[var4] = var22.id;
			var3[var4] = var22.scene.field2719;
		}

		WorldMapRegion.method6637(var3, var2);
		HashMap var23 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class518 var24 = Client.worldViewManager.method2352(var2[var4]);
				if (!var23.containsKey(var24)) {
					var23.put(var24, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class518 var7 = Client.worldViewManager.method2352(var6);
			Integer var8 = (Integer)var23.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class518.field5493) {
					class423.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class518.field5494) {
					int var9 = Client.viewportWidth / 2;
					int var10 = Client.viewportHeight / 2;
					int var11 = Client.viewportZoom;
					class452 var12 = StructComposition.method4561(class333.topLevelWorldView.scene, Client.field512, HealthBarDefinition.cameraX, class174.cameraY, HttpRequest.cameraZ, var9, var10, var11);
					if (var12 != null) {
						class452 var13 = WorldMapSection0.method6761((float)Client.field552, (float)Client.field512, (float)Client.field337);
						class452 var15 = class334.method7060(var12);
						var15.method9052(var13);
						class452 var16 = GrandExchangeOfferUnitPriceComparator.method8536(class452.field5170, var15);
						float var17 = (float)Math.atan2((double)PendingSpawn.method2413(var16, class452.field5174), (double)PendingSpawn.method2413(class452.field5170, var15));
						int var18 = (int)(2048.0D * ((double)var17 / 6.283185307179586D)) & 2047;
						int var21 = var18 + 64;
						int var20 = (var21 & 2047) / 128;
						class423.insertMenuItem("Set heading", "", 60, var20, 0, 0, 0, false, var6);
						var13.method8992();
						var15.method8992();
						var16.method8992();
						var12.method8992();
					}
				}
			}
		}

	}
}
