import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class36 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static final void method683() {
		int var0;
		int var1;
		int var2;
		if (!Client.field596) {
			var0 = Coord.method6843(class153.field1700);
			var1 = Coord.method6843(PcmPlayer.field290);
			var2 = class77.getTileHeight(HttpRequest.topLevelWorldView, var0, var1, HttpRequest.topLevelWorldView.plane) - WorldMapLabelSize.field3089;
			class6.method47(var0, var2, var1);
		} else if (Client.field770 != null) {
			class403.cameraX = Client.field770.vmethod9494();
			class328.cameraZ = Client.field770.vmethod9492();
			if (Client.field575) {
				class166.cameraY = Client.field770.vmethod9493();
			} else {
				class166.cameraY = class77.getTileHeight(HttpRequest.topLevelWorldView, class403.cameraX, class328.cameraZ, HttpRequest.topLevelWorldView.plane) - Client.field770.vmethod9493();
			}

			Client.field770.method9503();
		}

		if (!Client.field512) {
			var0 = Coord.method6843(Client.field594);
			var1 = Coord.method6843(class144.field1638);
			var2 = class77.getTileHeight(HttpRequest.topLevelWorldView, var0, var1, HttpRequest.topLevelWorldView.plane) - ApproximateRouteStrategy.field474;
			int var3 = var0 - class403.cameraX;
			int var4 = var2 - class166.cameraY;
			int var5 = var1 - class328.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			HealthBarDefinition.method3848(var7, var8);
		} else {
			if (Client.field670 != null) {
				SoundSystem.cameraPitch = Client.field670.method9485();
				SoundSystem.cameraPitch = Math.min(Math.max(SoundSystem.cameraPitch, 128), 383);
				Client.field670.method9503();
			}

			if (Client.field771 != null) {
				ReflectionCheck.cameraYaw = Client.field771.method9485() & 2047;
				Client.field771.method9503();
			}
		}

	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Ldi;IB)V",
		garbageValue = "122"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		int var3;
		int var4;
		int var5;
		if (var1.spotAnimation >= Client.cycle) {
			var3 = Math.max(1, var1.spotAnimation - Client.cycle);
			var4 = var1.field1199 * -742859456 + var1.field1247 * 128;
			var5 = var1.field1249 * 128 + var1.field1199 * -742859456;
			var1.x += (var4 - var1.x) / var3;
			var1.y += (var5 - var1.y) / var3;
			var1.field1269 = 0;
			var1.orientation = var1.field1253;
		} else if (var1.field1252 >= Client.cycle) {
			RestClientThreadFactory.method195(var1);
		} else {
			class7.method49(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1252 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1199 * -742859456;
			var1.y = var1.pathY[0] * 128 + var1.field1199 * -742859456;
			var1.method2641();
		}

		if (var1 == AsyncHttpResponse.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1252 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.field1199 * -742859456;
			var1.y = var1.pathY[0] * 128 + var1.field1199 * -742859456;
			var1.method2641();
		}

		int var6;
		int var13;
		if (var1.targetIndex != -1) {
			WorldView var11 = null;
			Object var12 = null;
			var5 = 65536;
			WorldViewManager var8;
			Iterator var9;
			WorldView var10;
			if (var1.targetIndex < var5) {
				var13 = var1.targetIndex;
				var8 = Client.worldViewManager;
				var9 = var8.iterator();

				WorldView var14;
				while (true) {
					if (var9.hasNext()) {
						var10 = (WorldView)var9.next();
						if (var10.npcs[var13] == null) {
							continue;
						}

						var14 = var10;
						break;
					}

					var14 = var8.method2593();
					break;
				}

				var11 = var14;
				var12 = var14.npcs[var1.targetIndex];
			} else {
				var6 = var1.targetIndex - var5;
				var8 = Client.worldViewManager;
				var9 = var8.iterator();

				WorldView var7;
				while (true) {
					if (var9.hasNext()) {
						var10 = (WorldView)var9.next();
						if (var10.players[var6] == null || var10.id == -1) {
							continue;
						}

						var7 = var10;
						break;
					}

					var7 = var8.method2593();
					break;
				}

				var11 = var7;
				var12 = var7.players[var6];
			}

			if (var12 != null) {
				class426 var26 = PlayerCompositionColorTextureOverride.method3722((float)var1.x, 0.0F, (float)var1.y);
				class426 var19 = PlayerCompositionColorTextureOverride.method3722((float)((Actor)var12).x, 0.0F, (float)((Actor)var12).y);
				WorldEntity var20;
				if (var0.id != -1) {
					var20 = HttpRequest.topLevelWorldView.worldEntities[var0.id];
					var26 = var20.method9150(var1.x, var1.y);
				}

				if (var11.id != -1) {
					var20 = HttpRequest.topLevelWorldView.worldEntities[var11.id];
					var19 = var20.method9150(((Actor)var12).x, ((Actor)var12).y);
				}

				int var15 = (int)(var26.field4764 - var19.field4764);
				int var16 = (int)(var26.field4766 - var19.field4766);
				if (var15 != 0 || var16 != 0) {
					var1.orientation = LoginState.method1233(var15, var16);
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		if (var1.pathLength == 0 || var1.field1269 > 0) {
			var3 = -1;
			if (var1.field1251 != -1 && var1.field1234 != -1) {
				var4 = Coord.method6843(var1.field1251 - HttpRequest.topLevelWorldView.baseX);
				var5 = Coord.method6843(var1.field1234 - HttpRequest.topLevelWorldView.baseY);
				var6 = var1.x - var4;
				var13 = var1.y - var5;
				if (var6 != 0 || var13 != 0) {
					var3 = LoginState.method1233(var6, var13);
				}
			} else if (var1.field1242 != -1) {
				var3 = var1.field1242;
			}

			if (var3 != -1) {
				var1.orientation = var3;
				if (var1.field1227) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2650();
		}

		var3 = var1.orientation - var1.rotation & 2047;
		if (var3 != 0) {
			boolean var17 = true;
			boolean var18 = true;
			++var1.field1263;
			var6 = var3 > 1024 ? -1 : 1;
			var1.rotation += var1.field1241 * var6;
			boolean var24 = true;
			if (var3 < var1.field1241 || var3 > 2048 - var1.field1241) {
				var1.rotation = var1.orientation;
				var24 = false;
			}

			if (var1.field1241 > 0 && var1.movementSequence == var1.idleSequence && (var1.field1263 > 25 || var24)) {
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

			var1.field1263 = 0;
		}

		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			SequenceDefinition var21 = HealthBarDefinition.SequenceDefinition_get(var1.movementSequence);
			if (var21 != null) {
				if (!var21.isCachedModelIdSet() && var21.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var21.frameIds.length && var1.movementFrameCycle > var21.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						class277.method5753(var21, var1.movementFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					}

					if (var1.movementFrame >= var21.frameIds.length) {
						if (var21.frameCount > 0) {
							var1.movementFrame -= var21.frameCount;
							if (var21.field2299) {
								++var1.field1239;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var21.frameIds.length || var21.field2299 && var1.field1239 >= var21.field2295) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1239 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class277.method5753(var21, var1.movementFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					}
				} else if (var21.isCachedModelIdSet()) {
					++var1.movementFrame;
					var4 = var21.getMayaAnimFrame();
					if (var1.movementFrame < var4) {
						class277.method5753(var21, var1.movementFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					} else {
						if (var21.frameCount > 0) {
							var1.movementFrame -= var21.frameCount;
							if (var21.field2299) {
								++var1.field1239;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var4 || var21.field2299 && var1.field1239 >= var21.field2295) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1239 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class277.method5753(var21, var1.movementFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var22 = new IterableNodeHashTableIterator(var1.method2655());

		for (ActorSpotAnim var23 = (ActorSpotAnim)var22.method9758(); var23 != null; var23 = (ActorSpotAnim)var22.next()) {
			if (var23.spotAnimation != -1 && Client.cycle >= var23.field5053) {
				var5 = ViewportMouse.SpotAnimationDefinition_get(var23.spotAnimation).sequence;
				if (var5 == -1) {
					var23.remove();
					--var1.graphicsCount;
				} else {
					var23.spotAnimationFrame = Math.max(var23.spotAnimationFrame, 0);
					SequenceDefinition var27 = HealthBarDefinition.SequenceDefinition_get(var5);
					if (var27.frameIds != null && !var27.isCachedModelIdSet()) {
						++var23.spotAnimationFrameCycle;
						if (var23.spotAnimationFrame < var27.frameIds.length && var23.spotAnimationFrameCycle > var27.frameLengths[var23.spotAnimationFrame]) {
							var23.spotAnimationFrameCycle = 1;
							++var23.spotAnimationFrame;
							class277.method5753(var27, var23.spotAnimationFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
						}

						if (var23.spotAnimationFrame >= var27.frameIds.length) {
							var23.remove();
							--var1.graphicsCount;
						}
					} else if (var27.isCachedModelIdSet()) {
						++var23.spotAnimationFrame;
						var13 = var27.getMayaAnimFrame();
						if (var23.spotAnimationFrame < var13) {
							class277.method5753(var27, var23.spotAnimationFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
						} else {
							var23.remove();
							--var1.graphicsCount;
						}
					} else {
						var23.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var25;
		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var25 = HealthBarDefinition.SequenceDefinition_get(var1.sequence);
			if (var25.field2320 == 1 && var1.field1270 > 0 && var1.spotAnimation <= Client.cycle && var1.field1252 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var25 = HealthBarDefinition.SequenceDefinition_get(var1.sequence);
			if (var25 == null) {
				var1.sequence = -1;
			} else if (!var25.isCachedModelIdSet() && var25.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var25.frameIds.length && var1.sequenceFrameCycle > var25.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					class277.method5753(var25, var1.sequenceFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
				}

				if (var1.sequenceFrame >= var25.frameIds.length) {
					var1.sequenceFrame -= var25.frameCount;
					++var1.field1195;
					if (var1.field1195 >= var25.field2295) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var25.frameIds.length) {
						class277.method5753(var25, var1.sequenceFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var25.field2314;
			} else if (var25.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var25.getMayaAnimFrame();
				if (var1.sequenceFrame < var5) {
					class277.method5753(var25, var1.sequenceFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
				} else {
					var1.sequenceFrame -= var25.frameCount;
					++var1.field1195;
					if (var1.field1195 >= var25.field2295) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						class277.method5753(var25, var1.sequenceFrame, var1.x, var1.y, var1 == AsyncHttpResponse.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}
			} else {
				var1.sequence = -1;
			}
		}

		if (var1.sequenceDelay > 0) {
			--var1.sequenceDelay;
		}

	}
}
