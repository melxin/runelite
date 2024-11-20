import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -318133067
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	public static void method7465() {
		synchronized(ArchiveDiskActionHandler.field4526) {
			if (ArchiveDiskActionHandler.field4525 != 0) {
				ArchiveDiskActionHandler.field4525 = 1;

				try {
					ArchiveDiskActionHandler.field4526.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IZI)V",
		garbageValue = "-1068540955"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.movementSequence == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = WorldMapScaleHandler.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = class77.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = class77.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
