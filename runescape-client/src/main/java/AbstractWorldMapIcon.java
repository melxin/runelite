import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2111048913
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -951866125
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "468922444"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lli;",
		garbageValue = "24"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1283952551"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1685687159"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "4"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-428697607"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2092098035"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class31.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1327668678"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "-15"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4883) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4885 > 0) {
				var3 = ByteArrayPool.field4892[--ByteArrayPool.field4885];
				ByteArrayPool.field4892[ByteArrayPool.field4885] = null;
				return var3;
			}

			int var6;
			if (class225.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class580.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class580.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class580.ByteArrayPool_alternativeSizes[var6] && var1) && KitDefinition.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class225.ByteArrayPool_arrays[var6][--KitDefinition.ByteArrayPool_altSizeArrayCounts[var6]];
						class225.ByteArrayPool_arrays[var6][KitDefinition.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class580.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class580.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class580.ByteArrayPool_alternativeSizes[var6] && KitDefinition.ByteArrayPool_altSizeArrayCounts[var6] < class225.ByteArrayPool_arrays[var6].length) {
						return new byte[class580.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	static void method6463(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class383.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = ModeWhere.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != ModeWhere.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteAdd(0);
					var8.packetBuffer.writeShortLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteNeg(0);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			Interpreter.addGameMessage(4, "", "Unable to find " + var1);
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "118"
	)
	static void method6464(int var0, int var1, int var2, int var3) {
		Widget var4 = ClanChannel.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			Friend.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class33.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class106.selectedSpellFlags = var2;
		UserComparator8.invalidateWidget(var4);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1229904046"
	)
	static boolean method6465(int var0, int var1) {
		if (!class77.method2369(var0, var1)) {
			return false;
		} else {
			if (ArchiveLoader.method2587(var1)) {
				class491 var2 = Client.worldViewManager.method2740(var0);
				if (var2 == class491.field5089) {
					return false;
				}

				if (var2 == class491.field5088) {
					boolean var3 = var1 == 1002 || var1 == 1003 || var1 == 1004;
					if (!var3) {
						return false;
					}
				}
			}

			return true;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIII)V",
		garbageValue = "-317605604"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class113.method3178();
		SpriteMask var4 = var0.method7446(ClanChannel.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + class53.entity.getX() / 32;
				int var7 = 464 - class53.entity.getY() / 32;
				class174.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class53.entity.getX() / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class53.entity.getY() / 32;
					FontName.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = GameEngine.topLevelWorldView.groundItems[GameEngine.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class53.entity.getX() / 32;
							var12 = var16 * 4 + 2 - class53.entity.getY() / 32;
							FontName.drawSpriteOnMinimap(var1, var2, var11, var12, class464.field4957[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < GameEngine.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = GameEngine.topLevelWorldView.npcs[GameEngine.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class53.entity.getX() / 32;
							var12 = var9.y / 32 - class53.entity.getY() / 32;
							FontName.drawSpriteOnMinimap(var1, var2, var11, var12, class464.field4957[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = GameEngine.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != ModeWhere.localPlayer) {
						var12 = var15.x / 32 - class53.entity.getX() / 32;
						int var13 = var15.y / 32 - class53.entity.getY() / 32;
						if (var15.isFriend()) {
							FontName.drawSpriteOnMinimap(var1, var2, var12, var13, class464.field4957[3], var4);
						} else if (ModeWhere.localPlayer.team != 0 && var15.team != 0 && var15.team == ModeWhere.localPlayer.team) {
							FontName.drawSpriteOnMinimap(var1, var2, var12, var13, class464.field4957[4], var4);
						} else if (var15.isFriendsChatMember()) {
							FontName.drawSpriteOnMinimap(var1, var2, var12, var13, class464.field4957[5], var4);
						} else if (var15.isClanMember()) {
							FontName.drawSpriteOnMinimap(var1, var2, var12, var13, class464.field4957[6], var4);
						} else {
							FontName.drawSpriteOnMinimap(var1, var2, var12, var13, class464.field4957[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < GameEngine.topLevelWorldView.npcs.length) {
						NPC var19 = GameEngine.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class53.entity.getX() / 32;
							var12 = var19.y / 32 - class53.entity.getY() / 32;
							class53.worldToMinimap(var1, var2, var11, var12, class140.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - GameEngine.topLevelWorldView.baseX * 4 + 2 - class53.entity.getX() / 32;
						var11 = Client.hintArrowY * 4 - GameEngine.topLevelWorldView.baseY * 4 + 2 - class53.entity.getY() / 32;
						class53.worldToMinimap(var1, var2, var10, var11, class140.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < GameEngine.topLevelWorldView.players.length) {
						Player var20 = GameEngine.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class53.entity.getX() / 32;
							var12 = var20.y / 32 - class53.entity.getY() / 32;
							class53.worldToMinimap(var1, var2, var11, var12, class140.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class53.entity.getX() / 32;
					var11 = Client.destinationY * 4 + 2 - class53.entity.getY() / 32;
					FontName.drawSpriteOnMinimap(var1, var2, var10, var11, class140.mapDotSprites[0], var4);
				}

				if (!ModeWhere.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field732[var3] = true;
		}
	}
}
