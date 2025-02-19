import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class272 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3095;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3088;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3092;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3090;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3091;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3097;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class272 field3093;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lka;"
	)
	static final class272[] field3087;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 979962097
	)
	final int field3094;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 694543483
	)
	final int field3089;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -156318829
	)
	final int field3096;

	static {
		field3095 = new class272(4, 8, 8);
		field3088 = new class272(0, 16, 16);
		field3092 = new class272(5, 32, 32);
		field3090 = new class272(2, 48, 48);
		field3091 = new class272(3, 64, 64);
		field3097 = new class272(6, 96, 96);
		field3093 = new class272(1, 128, 128);
		field3087 = class74.method2213();
		Arrays.sort(field3087, new class280());
	}

	class272(int var1, int var2, int var3) {
		this.field3094 = var1;
		this.field3089 = var2;
		this.field3096 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	int method5673() {
		return this.field3096 * this.field3089;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lwp;B)Lmo;",
		garbageValue = "31"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = FaceNormal.method5190();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Ldf;IB)V",
		garbageValue = "80"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		int var3;
		SequenceDefinition var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var12;
		if (var1.spotAnimation >= Client.cycle) {
			var3 = Math.max(1, var1.spotAnimation - Client.cycle);
			var12 = var1.size * 64 + var1.field1221 * 128;
			var5 = var1.size * 64 + var1.field1274 * 128;
			var1.x += (var12 - var1.x) / var3;
			var1.y += (var5 - var1.y) / var3;
			var1.field1277 = 0;
			var1.orientation = var1.field1278;
		} else if (var1.field1239 >= Client.cycle) {
			boolean var19 = Client.cycle == var1.field1239 || var1.sequence == -1 || var1.sequenceDelay != 0;
			if (!var19) {
				var4 = WorldMapData_1.SequenceDefinition_get(var1.sequence);
				if (var4 != null && !var4.isCachedModelIdSet()) {
					var19 = var1.sequenceFrameCycle + 1 > var4.frameLengths[var1.sequenceFrame];
				} else {
					var19 = true;
				}
			}

			if (var19) {
				var12 = var1.field1239 - var1.spotAnimation;
				var5 = Client.cycle - var1.spotAnimation;
				var6 = var1.size * 64 + var1.field1221 * 128;
				var7 = var1.size * 64 + var1.field1274 * 128;
				var8 = var1.size * 64 + var1.field1273 * 128;
				var9 = var1.size * 64 + var1.field1275 * 128;
				var1.x = (var5 * var8 + var6 * (var12 - var5)) / var12;
				var1.y = (var9 * var5 + var7 * (var12 - var5)) / var12;
			}

			var1.field1277 = 0;
			var1.orientation = var1.field1278;
			var1.rotation = var1.orientation;
		} else {
			WorldMapRenderer.method6148(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1239 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * 64;
			var1.y = var1.pathY[0] * 128 + var1.size * 64;
			var1.method2592();
		}

		if (var1 == class132.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1239 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * 64;
			var1.y = var1.pathY[0] * 128 + var1.size * 64;
			var1.method2592();
		}

		if (var1.targetIndex != -1) {
			WorldView var13 = null;
			var4 = null;
			var5 = 65536;
			Actor var20;
			if (var1.targetIndex < var5) {
				var13 = class387.method7530(var1.targetIndex, Client.worldViewManager);
				var20 = (Actor)var13.npcs.get((long)var1.targetIndex);
			} else {
				var6 = var1.targetIndex - var5;
				WorldViewManager var14 = Client.worldViewManager;
				Iterator var15 = var14.iterator();

				WorldView var16;
				while (true) {
					if (var15.hasNext()) {
						WorldView var10 = (WorldView)var15.next();
						Player var11 = (Player)var10.players.get((long)var6);
						if (var11 == null || var10.id == -1) {
							continue;
						}

						var16 = var10;
						break;
					}

					var16 = var14.method2532();
					break;
				}

				var13 = var16;
				var20 = (Actor)var16.players.get((long)var6);
			}

			if (var20 != null) {
				class442 var17 = EnumComposition.method3908((float)var1.x, 0.0F, (float)var1.y);
				class442 var30;
				if (var0.id != var13.id) {
					WorldEntity var26;
					if (var0.id == -1) {
						var26 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var13.id);
						var30 = var26.method9302(var20.x, var20.y);
					} else if (var13.id == -1) {
						var26 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var0.id);
						var30 = var26.method9347(var20.x, var20.y);
					} else {
						var26 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var13.id);
						WorldEntity var29 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var0.id);
						class442 var24 = var26.method9302(var20.x, var20.y);
						var30 = var29.method9347((int)var24.field4898, (int)var24.field4900);
						var24.method8341();
					}
				} else {
					var30 = EnumComposition.method3908((float)var20.x, 0.0F, (float)var20.y);
				}

				var8 = (int)(var17.field4898 - var30.field4898);
				var9 = (int)(var17.field4900 - var30.field4900);
				if (var8 != 0 || var9 != 0) {
					int var18 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
					var1.orientation = var18;
				}

				var17.method8341();
				var30.method8341();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		if (var1.pathLength == 0 || var1.field1277 > 0) {
			var3 = -1;
			if (var1.field1258 != -1 && var1.field1259 != -1) {
				var12 = Coord.method6905(var1.field1258 - class200.topLevelWorldView.baseX);
				var5 = Coord.method6905(var1.field1259 - class200.topLevelWorldView.baseY);
				var6 = var1.x - var12;
				var7 = var1.y - var5;
				if (var6 != 0 || var7 != 0) {
					var8 = (int)(Math.atan2((double)var6, (double)var7) * 325.94932345220167D) & 2047;
					var3 = var8;
				}
			} else if (var1.field1271 != -1) {
				var3 = var1.field1271;
			}

			if (var3 != -1) {
				var1.orientation = var3;
				if (var1.field1260) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2601();
		}

		var3 = var1.orientation - var1.rotation & 2047;
		if (var3 != 0) {
			boolean var25 = true;
			boolean var22 = true;
			++var1.field1264;
			var6 = var3 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1265;
			boolean var23 = true;
			if (var3 < var1.field1265 || var3 > 2048 - var1.field1265) {
				var1.rotation = var1.orientation;
				var23 = false;
			}

			if (var1.field1265 > 0 && var1.movementSequence == var1.idleSequence && (var1.field1264 > 25 || var23)) {
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

			var1.field1264 = 0;
		}

		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			SequenceDefinition var27 = WorldMapData_1.SequenceDefinition_get(var1.movementSequence);
			if (var27 != null) {
				if (!var27.isCachedModelIdSet() && var27.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var27.frameIds.length && var1.movementFrameCycle > var27.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						MusicPatchPcmStream.method6807(var27, var1.movementFrame, var1.x, var1.y, var1 == class132.localPlayer);
					}

					if (var1.movementFrame >= var27.frameIds.length) {
						if (var27.frameCount > 0) {
							var1.movementFrame -= var27.frameCount;
							if (var27.field2372) {
								++var1.field1294;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var27.frameIds.length || var27.field2372 && var1.field1294 >= var27.field2355) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1294 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						MusicPatchPcmStream.method6807(var27, var1.movementFrame, var1.x, var1.y, var1 == class132.localPlayer);
					}
				} else if (var27.isCachedModelIdSet()) {
					++var1.movementFrame;
					var12 = var27.getMayaAnimFrame();
					if (var1.movementFrame < var12) {
						MusicPatchPcmStream.method6807(var27, var1.movementFrame, var1.x, var1.y, var1 == class132.localPlayer);
					} else {
						if (var27.frameCount > 0) {
							var1.movementFrame -= var27.frameCount;
							if (var27.field2372) {
								++var1.field1294;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var12 || var27.field2372 && var1.field1294 >= var27.field2355) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1294 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						MusicPatchPcmStream.method6807(var27, var1.movementFrame, var1.x, var1.y, var1 == class132.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var28 = new IterableNodeHashTableIterator(var1.method2655());

		for (ActorSpotAnim var21 = (ActorSpotAnim)var28.method7899(); var21 != null; var21 = (ActorSpotAnim)var28.next()) {
			if (var21.spotAnimation != -1 && Client.cycle >= var21.field5168) {
				var5 = class176.SpotAnimationDefinition_get(var21.spotAnimation).sequence;
				if (var5 == -1) {
					var21.remove();
					--var1.graphicsCount;
				} else {
					var21.spotAnimationFrame = Math.max(var21.spotAnimationFrame, 0);
					SequenceDefinition var31 = WorldMapData_1.SequenceDefinition_get(var5);
					if (var31.frameIds != null && !var31.isCachedModelIdSet()) {
						++var21.spotAnimationFrameCycle;
						if (var21.spotAnimationFrame < var31.frameIds.length && var21.spotAnimationFrameCycle > var31.frameLengths[var21.spotAnimationFrame]) {
							var21.spotAnimationFrameCycle = 1;
							++var21.spotAnimationFrame;
							MusicPatchPcmStream.method6807(var31, var21.spotAnimationFrame, var1.x, var1.y, var1 == class132.localPlayer);
						}

						if (var21.spotAnimationFrame >= var31.frameIds.length) {
							var21.remove();
							--var1.graphicsCount;
						}
					} else if (var31.isCachedModelIdSet()) {
						++var21.spotAnimationFrame;
						var7 = var31.getMayaAnimFrame();
						if (var21.spotAnimationFrame < var7) {
							MusicPatchPcmStream.method6807(var31, var21.spotAnimationFrame, var1.x, var1.y, var1 == class132.localPlayer);
						} else {
							var21.remove();
							--var1.graphicsCount;
						}
					} else {
						var21.remove();
						--var1.graphicsCount;
					}
				}
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var4 = WorldMapData_1.SequenceDefinition_get(var1.sequence);
			if (var4.field2373 == 1 && var1.field1291 > 0 && var1.spotAnimation <= Client.cycle && var1.field1239 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var4 = WorldMapData_1.SequenceDefinition_get(var1.sequence);
			if (var4 == null) {
				var1.sequence = -1;
			} else if (!var4.isCachedModelIdSet() && var4.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var4.frameIds.length && var1.sequenceFrameCycle > var4.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					MusicPatchPcmStream.method6807(var4, var1.sequenceFrame, var1.x, var1.y, var1 == class132.localPlayer);
				}

				if (var1.sequenceFrame >= var4.frameIds.length) {
					var1.sequenceFrame -= var4.frameCount;
					++var1.field1255;
					if (var1.field1255 >= var4.field2355) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var4.frameIds.length) {
						MusicPatchPcmStream.method6807(var4, var1.sequenceFrame, var1.x, var1.y, var1 == class132.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var4.field2350;
			} else if (var4.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var4.getMayaAnimFrame();
				if (var1.sequenceFrame < var5) {
					MusicPatchPcmStream.method6807(var4, var1.sequenceFrame, var1.x, var1.y, var1 == class132.localPlayer);
				} else {
					var1.sequenceFrame -= var4.frameCount;
					++var1.field1255;
					if (var1.field1255 >= var4.field2355) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						MusicPatchPcmStream.method6807(var4, var1.sequenceFrame, var1.x, var1.y, var1 == class132.localPlayer);
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

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1570989421"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class376.widgetDefinition.loadInterface(var0)) {
			GameEngine.field197 = null;
			SwapSongTask.drawInterface(class376.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (GameEngine.field197 != null) {
				SwapSongTask.drawInterface(GameEngine.field197, -1412584499, var1, var2, var3, var4, class150.field1726, MidiRequest.field3815, var7);
				GameEngine.field197 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lnz;S)Z",
		garbageValue = "20134"
	)
	static final boolean method5683(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6950(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6951(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6951(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
