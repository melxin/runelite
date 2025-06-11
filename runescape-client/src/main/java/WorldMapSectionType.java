import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("aa")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1058756989
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ac")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lll;",
		garbageValue = "-19"
	)
	static WorldMapSectionType[] method6574() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-800839183"
	)
	public static int method6563(int var0, int var1, int var2) {
		int var3 = Skills.method7913(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "88"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-987936070"
	)
	static final void method6569() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			Iterator var2 = var1.npcs.iterator();

			while (var2.hasNext()) {
				NPC var3 = (NPC)var2.next();
				if (var3 != null) {
					updateActorSequence(var1, var3, var3.definition.size);
				}
			}
		}

	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lcn;IB)V",
		garbageValue = "57"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(WorldView var0, Actor var1, int var2) {
		if (var1.spotAnimation >= Client.cycle) {
			WorldMapRenderer.method6470(var1);
		} else if (var1.field1016 >= Client.cycle) {
			class27.method394(var1);
		} else {
			AbstractArchive.method8164(var1);
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.y < 128 || 13184 <= var1.y) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1016 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -343670784;
			var1.y = var1.pathY[0] * 128 + var1.size * -343670784;
			var1.method2296();
		}

		if (var1 == class152.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.y < 1536 || 11776 <= var1.y)) {
			var1.sequence = -1;
			var1.spotAnimation = 0;
			var1.field1016 = 0;
			var1.clearSpotAnimations();
			var1.x = var1.pathX[0] * 128 + var1.size * -343670784;
			var1.y = var1.pathY[0] * 128 + var1.size * -343670784;
			var1.method2296();
		}

		int var5;
		int var6;
		int var13;
		if (var1.targetIndex != -1) {
			WorldView var3 = null;
			Actor var4 = null;
			var5 = 65536;
			if (var1.targetIndex < var5) {
				var3 = Widget.method7887(var1.targetIndex, Client.worldViewManager);
				var4 = (Actor)var3.npcs.get((long)var1.targetIndex);
			} else {
				var6 = var1.targetIndex - var5;
				WorldViewManager var8 = Client.worldViewManager;
				Iterator var9 = var8.iterator();

				WorldView var7;
				while (true) {
					if (var9.hasNext()) {
						WorldView var10 = (WorldView)var9.next();
						Player var11 = (Player)var10.players.get((long)var6);
						if (var11 == null || var10.id == -1) {
							continue;
						}

						var7 = var10;
						break;
					}

					var7 = var8.method2221();
					break;
				}

				var3 = var7;
				var4 = (Actor)var7.players.get((long)var6);
			}

			if (var4 != null) {
				class445 var12 = class47.method1781((float)var1.x, 0.0F, (float)var1.y);
				class445 var24;
				if (var0.id != var3.id) {
					WorldEntity var25;
					if (var0.id == -1) {
						var25 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var3.id);
						var24 = var25.method9718(var4.x, var4.y);
					} else if (var3.id == -1) {
						var25 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var0.id);
						var24 = var25.method9757(var4.x, var4.y);
					} else {
						var25 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var3.id);
						WorldEntity var26 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var0.id);
						class445 var27 = var25.method9718(var4.x, var4.y);
						var24 = var26.method9757((int)var27.field4967, (int)var27.field4969);
						var27.method8687();
					}
				} else {
					var24 = class47.method1781((float)var4.x, 0.0F, (float)var4.y);
				}

				var13 = (int)(var12.field4967 - var24.field4967);
				int var14 = (int)(var12.field4969 - var24.field4969);
				if (var13 != 0 || var14 != 0) {
					int var15 = (int)(Math.atan2((double)var13, (double)var14) * 325.94932345220167D) & 2047;
					var1.orientation = var15;
				}

				var12.method8687();
				var24.method8687();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var16;
		int var17;
		int var18;
		if (var1.pathLength == 0 || var1.field1085 > 0) {
			var16 = -1;
			if (var1.field1059 != -1 && var1.field1024 != -1) {
				var17 = Coord.method7242(var1.field1059 - Sound.topLevelWorldView.baseX);
				var5 = Coord.method7242(var1.field1024 - Sound.topLevelWorldView.baseY);
				var6 = var1.x - var17;
				var18 = var1.y - var5;
				if (var6 != 0 || var18 != 0) {
					var13 = (int)(Math.atan2((double)var6, (double)var18) * 325.94932345220167D) & 2047;
					var16 = var13;
				}
			} else if (var1.field1022 != -1) {
				var16 = var1.field1022;
			}

			if (var16 != -1) {
				var1.orientation = var16;
				if (var1.field1025) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2305();
		}

		var16 = var1.orientation - var1.rotation & 2047;
		if (var16 != 0) {
			boolean var29 = true;
			boolean var22 = true;
			++var1.field1078;
			var6 = var16 > 1024 ? -1 : 1;
			var1.rotation += var6 * var1.field1079;
			boolean var30 = true;
			if (var16 < var1.field1079 || var16 > 2048 - var1.field1079) {
				var1.rotation = var1.orientation;
				var30 = false;
			}

			if (var1.field1079 > 0 && var1.movementSequence == var1.idleSequence && (var1.field1078 > 25 || var30)) {
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

			var1.field1078 = 0;
		}

		var1.isWalking = false;
		if (var1.movementSequence != -1) {
			SequenceDefinition var19 = VarpDefinition.SequenceDefinition_get(var1.movementSequence);
			if (var19 != null) {
				if (!var19.isCachedModelIdSet() && var19.frameIds != null) {
					++var1.movementFrameCycle;
					if (var1.movementFrame < var19.frameIds.length && var1.movementFrameCycle > var19.frameLengths[var1.movementFrame]) {
						var1.movementFrameCycle = 1;
						++var1.movementFrame;
						class203.method4299(var0, var19, var1.movementFrame, var1.x, var1.y, var1 == class152.localPlayer);
					}

					if (var1.movementFrame >= var19.frameIds.length) {
						if (var19.frameCount > 0) {
							var1.movementFrame -= var19.frameCount;
							if (var19.field2361) {
								++var1.field1051;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var19.frameIds.length || var19.field2361 && var1.field1051 >= var19.field2363) {
								var1.movementFrameCycle = 0;
								var1.movementFrame = 0;
								var1.field1051 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class203.method4299(var0, var19, var1.movementFrame, var1.x, var1.y, var1 == class152.localPlayer);
					}
				} else if (var19.isCachedModelIdSet()) {
					++var1.movementFrame;
					var17 = var19.getMayaAnimFrame();
					if (var1.movementFrame < var17) {
						class203.method4299(var0, var19, var1.movementFrame, var1.x, var1.y, var1 == class152.localPlayer);
					} else {
						if (var19.frameCount > 0) {
							var1.movementFrame -= var19.frameCount;
							if (var19.field2361) {
								++var1.field1051;
							}

							if (var1.movementFrame < 0 || var1.movementFrame >= var17 || var19.field2361 && var1.field1051 >= var19.field2363) {
								var1.movementFrame = 0;
								var1.movementFrameCycle = 0;
								var1.field1051 = 0;
							}
						} else {
							var1.movementFrameCycle = 0;
							var1.movementFrame = 0;
						}

						class203.method4299(var0, var19, var1.movementFrame, var1.x, var1.y, var1 == class152.localPlayer);
					}
				} else {
					var1.movementSequence = -1;
				}
			} else {
				var1.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var20 = new IterableNodeHashTableIterator(var1.method2331());

		for (ActorSpotAnim var21 = (ActorSpotAnim)var20.method8308(); var21 != null; var21 = (ActorSpotAnim)var20.next()) {
			if (var21.spotAnimation != -1 && Client.cycle >= var21.field5237) {
				var5 = class386.SpotAnimationDefinition_get(var21.spotAnimation).sequence;
				if (var5 == -1) {
					var21.remove();
					--var1.graphicsCount;
				} else {
					var21.spotAnimationFrame = Math.max(var21.spotAnimationFrame, 0);
					SequenceDefinition var28 = VarpDefinition.SequenceDefinition_get(var5);
					if (var28.frameIds != null && !var28.isCachedModelIdSet()) {
						++var21.spotAnimationFrameCycle;
						if (var21.spotAnimationFrame < var28.frameIds.length && var21.spotAnimationFrameCycle > var28.frameLengths[var21.spotAnimationFrame]) {
							var21.spotAnimationFrameCycle = 1;
							++var21.spotAnimationFrame;
							class203.method4299(var0, var28, var21.spotAnimationFrame, var1.x, var1.y, var1 == class152.localPlayer);
						}

						if (var21.spotAnimationFrame >= var28.frameIds.length) {
							var21.remove();
							--var1.graphicsCount;
						}
					} else if (var28.isCachedModelIdSet()) {
						++var21.spotAnimationFrame;
						var18 = var28.getMayaAnimFrame();
						if (var21.spotAnimationFrame < var18) {
							class203.method4299(var0, var28, var21.spotAnimationFrame, var1.x, var1.y, var1 == class152.localPlayer);
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

		SequenceDefinition var23;
		if (var1.sequence != -1 && var1.sequenceDelay <= 1) {
			var23 = VarpDefinition.SequenceDefinition_get(var1.sequence);
			if (var23.field2341 == 1 && var1.field1048 > 0 && var1.spotAnimation <= Client.cycle && var1.field1016 < Client.cycle) {
				var1.sequenceDelay = 1;
				return;
			}
		}

		if (var1.sequence != -1 && var1.sequenceDelay == 0) {
			var23 = VarpDefinition.SequenceDefinition_get(var1.sequence);
			if (var23 == null) {
				var1.sequence = -1;
			} else if (!var23.isCachedModelIdSet() && var23.frameIds != null) {
				++var1.sequenceFrameCycle;
				if (var1.sequenceFrame < var23.frameIds.length && var1.sequenceFrameCycle > var23.frameLengths[var1.sequenceFrame]) {
					var1.sequenceFrameCycle = 1;
					++var1.sequenceFrame;
					class203.method4299(var0, var23, var1.sequenceFrame, var1.x, var1.y, var1 == class152.localPlayer);
				}

				if (var1.sequenceFrame >= var23.frameIds.length) {
					var1.sequenceFrame -= var23.frameCount;
					++var1.field1066;
					if (var1.field1066 >= var23.field2363) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var23.frameIds.length) {
						class203.method4299(var0, var23, var1.sequenceFrame, var1.x, var1.y, var1 == class152.localPlayer);
					} else {
						var1.sequence = -1;
					}
				}

				var1.isWalking = var23.field2364;
			} else if (var23.isCachedModelIdSet()) {
				++var1.sequenceFrame;
				var5 = var23.getMayaAnimFrame();
				if (var1.sequenceFrame < var5) {
					class203.method4299(var0, var23, var1.sequenceFrame, var1.x, var1.y, var1 == class152.localPlayer);
				} else {
					var1.sequenceFrame -= var23.frameCount;
					++var1.field1066;
					if (var1.field1066 >= var23.field2363) {
						var1.sequence = -1;
					} else if (var1.sequenceFrame >= 0 && var1.sequenceFrame < var5) {
						class203.method4299(var0, var23, var1.sequenceFrame, var1.x, var1.y, var1 == class152.localPlayer);
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

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method6573() {
		if (Client.isSpellSelected) {
			Widget var0 = ClientPreferences.widgetDefinition.getWidgetChild(class394.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				ModeWhere.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			ScriptFrame.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIIIIII)V",
		garbageValue = "274708225"
	)
	static final void method6571(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field472) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field472 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				ScriptFrame.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				ScriptFrame.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				ScriptFrame.invalidateWidget(var0);
				Client.field472 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * -1805166981;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				ScriptFrame.invalidateWidget(var0);
			}
		}

	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIII)V",
		garbageValue = "-413433980"
	)
	static final void method6575(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7762(ClientPreferences.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				MilliClock.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15104"
	)
	static final void method6572() {
		Client.field549 = Client.cycleCntr;
		WidgetDefinition.field3870 = true;
	}
}
