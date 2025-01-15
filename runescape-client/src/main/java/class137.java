import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class137 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1604;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1600;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1596;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1597;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1598;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class137 field1599;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field1603;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -56822517
	)
	final int field1595;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 632281529
	)
	final int field1601;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -135725277
	)
	final int field1602;

	static {
		field1604 = new class137(0, 0, (String)null, 0);
		field1600 = new class137(1, 1, (String)null, 9);
		field1596 = new class137(2, 2, (String)null, 3);
		field1597 = new class137(3, 3, (String)null, 6);
		field1598 = new class137(4, 4, (String)null, 1);
		field1599 = new class137(5, 5, (String)null, 3);
	}

	class137(int var1, int var2, String var3, int var4) {
		this.field1595 = var1;
		this.field1601 = var2;
		this.field1602 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1601;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1125994409"
	)
	int method3482() {
		return this.field1602;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfl;",
		garbageValue = "122"
	)
	static class144 method3480(int var0) {
		class144 var1 = (class144)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = UserComparator7.method3330(SequenceDefinition.SequenceDefinition_animationsArchive, class466.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IZI)V",
		garbageValue = "-1927975258"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.idleSequence == var3.movementSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = Projectile.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = Canvas.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = Canvas.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
