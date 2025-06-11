import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = -2056924463
	)
	static int field2811;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1994869327
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 513748147
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 934249539
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -391804225
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 834848893
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1653333789
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1902189619
	)
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("aabb")
	AABB aabb;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.orientation = var1;
		this.xMid = var2;
		this.yMid = var3;
		this.zMid = var4;
		this.xMidOffset = var5;
		this.yMidOffset = var6;
		this.zMidOffset = var7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILtb;Lpu;I)V",
		garbageValue = "-1368267450"
	)
	static void method5442(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
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

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldl;ZB)V",
		garbageValue = "5"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.field1147.method9429(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1147.method9430(var2));
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size * -5369856 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = class275.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = GrandExchangeOfferTotalQuantityComparator.method8203(var0, var3.x, var3.y, var4, var3.definition.method4165());
					int var10 = var3.size * -343670784 - 64 + 60;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
