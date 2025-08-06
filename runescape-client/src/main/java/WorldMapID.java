import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final WorldMapID field3385;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final WorldMapID field3386;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 59685367
	)
	@Export("value")
	final int value;

	static {
		field3385 = new WorldMapID(0);
		field3386 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIII)V",
		garbageValue = "-1577543669"
	)
	static final void method6814(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Script.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var9 == var3 + var1 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1604750526"
	)
	static final void method6815() {
		++Client.viewportDrawCount;
		class7.topLevelWorldView.scene.cycle = Client.cycle;
		if (class27.localPlayer.x >> 7 == Client.destinationX && class27.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		WorldView var0 = class7.topLevelWorldView;
		if (Client.field307 > 0) {
			int var1 = Client.field308 * 128;
			class462.method9530(var0, var1, Archive.field4803);
		}

		WorldView var7 = class7.topLevelWorldView;
		int var2 = Client.menu.menuOptionsCount - 1;
		int var4;
		if (var7 == class7.topLevelWorldView && var2 >= 0 && Client.menu.menuOpcodes[var2] == 60) {
			var4 = Client.menu.menuIdentifiers[var2] * 128;
			class462.method9530(var7, var4, class177.field1939);
		}

		WorldView var8 = class7.topLevelWorldView;
		if (Client.renderSelf) {
			InvDefinition.addPlayerToScene(var8, Client.localPlayerIndex, false);
		}

		Archive.method8323(class7.topLevelWorldView);
		class31.method499(class7.topLevelWorldView);
		class152.method3811(class7.topLevelWorldView, class391.TOKEN);
		class152.method3811(class7.topLevelWorldView, class391.field4700);
		AbstractArchive.addNpcsToScene(class7.topLevelWorldView, true);
		WorldView var9 = class7.topLevelWorldView;
		var4 = Client.playerUpdateManager.playerCount;
		int[] var5 = Client.playerUpdateManager.playerIndices;

		for (int var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				InvDefinition.addPlayerToScene(var9, var5[var6], true);
			}
		}

		AbstractArchive.addNpcsToScene(class7.topLevelWorldView, false);

		for (Projectile var10 = (Projectile)Client.projectiles.last(); var10 != null; var10 = (Projectile)Client.projectiles.previous()) {
			if (Client.cycle > var10.cycleEnd) {
				var10.remove();
			} else if (Client.cycle >= var10.cycleStart) {
				var10.setDestination(Client.worldViewManager, Client.cycle, Client.graphicsCycle);
				class7.topLevelWorldView.scene.drawEntity(var10.sourceLevel, (int)var10.x, (int)var10.y, (int)var10.z, 60, var10, var10.orientation, -1L, false);
			}
		}

		class322.method7010(class7.topLevelWorldView);
		class152.method3811(class7.topLevelWorldView, class391.field4696);
	}
}
