import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class96 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpq;IB)V",
		garbageValue = "51"
	)
	public static void method2709(AbstractArchive var0, int var1) {
		if (!class333.field3626.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class333.field3626.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3742 = false;
				var4.field3741 = false;
				var4.field3745 = false;
				var4.field3744 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3739 = 0.0F;
				var2.add(var4);
			}

			class1.method9(var2, class333.musicPlayerStatus, class333.field3632, class333.field3633, class333.field3634, false);
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lda;I)V",
		garbageValue = "-498840566"
	)
	static final void method2710(WorldView var0, Actor var1) {
		int var4;
		int var5;
		int var12;
		if (var1.targetIndex != -1) {
			WorldView var2 = null;
			Object var3 = null;
			var4 = 65536;
			if (var1.targetIndex < var4) {
				var2 = class508.method9616(var1.targetIndex, Client.worldViewManager);
				var3 = var2.npcs[var1.targetIndex];
			} else {
				var5 = var1.targetIndex - var4;
				var2 = BuddyRankComparator.method3366(var5, Client.worldViewManager);
				var3 = var2.players[var5];
			}

			if (var3 != null) {
				class426 var11 = Varps.method6964((float)var1.x, 0.0F, (float)var1.y);
				class426 var6 = Varps.method6964((float)((Actor)var3).x, 0.0F, (float)((Actor)var3).y);
				WorldEntity var7;
				if (var0.id != -1) {
					var7 = GameEngine.topLevelWorldView.worldEntities[var0.id];
					var11 = var7.method9302(var1.x, var1.y);
				}

				if (var2.id != -1) {
					var7 = GameEngine.topLevelWorldView.worldEntities[var2.id];
					var6 = var7.method9302(((Actor)var3).x, ((Actor)var3).y);
				}

				var12 = (int)(var11.field4747 - var6.field4747);
				int var8 = (int)(var11.field4749 - var6.field4749);
				if (var12 != 0 || var8 != 0) {
					int var10 = (int)(Math.atan2((double)var12, (double)var8) * 325.94932345220167D) & 2047;
					var1.orientation = var10;
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var13;
		if (var1.pathLength == 0 || var1.field1269 > 0) {
			var13 = -1;
			if (var1.field1233 != -1 && var1.field1205 != -1) {
				int var14 = Coord.method6980(var1.field1233 - GameEngine.topLevelWorldView.baseX);
				var4 = Coord.method6980(var1.field1205 - GameEngine.topLevelWorldView.baseY);
				var5 = var1.x - var14;
				int var15 = var1.y - var4;
				if (var5 != 0 || var15 != 0) {
					var12 = (int)(Math.atan2((double)var5, (double)var15) * 325.94932345220167D) & 2047;
					var13 = var12;
				}
			} else if (var1.field1232 != -1) {
				var13 = var1.field1232;
			}

			if (var13 != -1) {
				var1.orientation = var13;
				if (var1.field1235) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2782();
		}

		var13 = var1.orientation - var1.rotation & 2047;
		if (var13 != 0) {
			boolean var17 = true;
			boolean var16 = true;
			++var1.field1231;
			var5 = var13 > 1024 ? -1 : 1;
			var1.rotation += var5 * var1.field1200;
			boolean var18 = true;
			if (var13 < var1.field1200 || var13 > 2048 - var1.field1200) {
				var1.rotation = var1.orientation;
				var18 = false;
			}

			if (var1.field1200 > 0 && var1.idleSequence == var1.movementSequence && (var1.field1231 > 25 || var18)) {
				if (var5 == -1 && var1.turnLeftSequence != -1) {
					var1.movementSequence = var1.turnLeftSequence;
				} else if (var5 == 1 && var1.turnRightSequence != -1) {
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

			var1.field1231 = 0;
		}

	}
}
