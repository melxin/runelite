import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class168 extends class150 {
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1951142615
	)
	int field1796;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -118886787
	)
	int field1795;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class168(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1796 = var1.readInt();
		this.field1795 = var1.readInt();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3717(this.field1796, this.field1795);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIIIIII)V",
		garbageValue = "-1803870393"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			ObjectComposition var16;
			if (var10 != 0L) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var27 = class360.Entity_unpackID(var10);
				int var28 = var15 & 31;
				int var29 = var15 >> 6 & 3;
				var16 = class142.getObjectDefinition(var27);
				if (var16 != null && var16.hasSound()) {
					int var19 = var16.sizeX;
					int var20 = var16.sizeY;
					if (var29 == 1 || var29 == 3) {
						var19 = var16.sizeY;
						var20 = var16.sizeX;
					}

					int var21 = (var19 + var3) * 128;
					int var22 = (var4 + var20) * 128;
					int var17 = var3 * 128;
					int var18 = var4 * 128;
					int var23 = var16.ambientSoundId;
					int var24 = var16.int7 * 128;
					int var25 = var16.int8 * 16384;
					if (var16.transforms != null) {
						ObjectComposition var26 = var16.transform();
						if (var26 != null) {
							var23 = var26.ambientSoundId;
							var24 = var26.int7 * 128;
							var25 = var26.int8 * 16384;
						}
					}

					Object var10000 = null;

					for (ObjectSound var30 = (ObjectSound)ObjectSound.objectSounds.last(); var30 != null; var30 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var30.plane == var1 && var17 == var30.x * 128 && var18 == var30.y * 16384 && var21 == var30.maxX * 16384 && var22 == var30.maxY * 16384 && var23 == var30.soundEffectId && var24 == var30.field840 && var25 == var30.field841) {
							if (var30.stream1 != null) {
								UserList.pcmStreamMixer.removeSubStream(var30.stream1);
								var30.stream1 = null;
							}

							if (var30.stream2 != null) {
								UserList.pcmStreamMixer.removeSubStream(var30.stream2);
								var30.stream2 = null;
							}

							var30.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5802(var3, var4, var28, var29, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var29, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5805(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				PcmPlayer.method823(var0, var1, var15, var3, var4, var5, var6, var7, var8, var0.collisionMaps[var1]);
				var16 = class142.getObjectDefinition(var5);
				if (var16 != null && var16.hasSound()) {
					GameEngine.createObjectSound(var15, var3, var4, var16, var6);
				}
			}
		}

	}
}
