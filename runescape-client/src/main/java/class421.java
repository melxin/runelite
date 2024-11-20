import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public final class class421 {
	@ObfuscatedName("ab")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("aw")
	static long[] field4743;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4743 = new long[12];

		for (int var0 = 0; var0 < field4743.length; ++var0) {
			field4743[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2010619536"
	)
	static int method8052() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILsr;Loa;I)V",
		garbageValue = "-1933129536"
	)
	static void method8044(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1499398033"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = HttpRequest.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = 0L != var6;
			if (var13) {
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var20 = VerticalAlignment.sceneMinimapSprite.pixels;
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class137.Entity_unpackID(var6);
			ObjectComposition var16 = HttpMethod.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = class160.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 1) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var20[var27] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class137.Entity_unpackID(var6);
			ObjectComposition var21 = HttpMethod.getObjectDefinition(var11);
			if (var21.mapSceneId != -1) {
				IndexedSprite var29 = class160.mapSceneSprites[var21.mapSceneId];
				if (var29 != null) {
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2;
					var15 = (var21.sizeY * 4 - var29.subHeight) / 2;
					var29.drawAt(var1 * 4 + var27 + 48, (104 - var2 - var21.sizeY) * 4 + var15 + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var28 = 0L != var6;
				if (var28) {
					boolean var22 = (int)(var6 >>> 16 & 1L) == 1;
					var28 = !var22;
				}

				if (var28) {
					var26 = 15597568;
				}

				int[] var23 = VerticalAlignment.sceneMinimapSprite.pixels;
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var23[var30] = var26;
					var23[var30 + 1 + 512] = var26;
					var23[var30 + 1024 + 2] = var26;
					var23[var30 + 1536 + 3] = var26;
				} else {
					var23[var30 + 1536] = var26;
					var23[var30 + 1 + 1024] = var26;
					var23[var30 + 512 + 2] = var26;
					var23[var30 + 3] = var26;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class137.Entity_unpackID(var6);
			ObjectComposition var24 = HttpMethod.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = class160.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var12 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var1 * 4 + var11 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIIIIII)V",
		garbageValue = "-1316359099"
	)
	static final void method8050(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field562) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field562 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class178.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class178.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class178.invalidateWidget(var0);
				Client.field562 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * 1063514007;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class178.invalidateWidget(var0);
			}
		}

	}
}
