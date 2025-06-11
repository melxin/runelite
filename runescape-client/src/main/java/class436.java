import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class436 {
	@ObfuscatedName("ap")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "366"
	)
	static final void method8568() {
		++Client.viewportDrawCount;
		Sound.topLevelWorldView.scene.cycle = Client.cycle;
		if (class152.localPlayer.x >> 7 == Client.destinationX && class152.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		Menu.method11496(Sound.topLevelWorldView);
		WorldView var0 = Sound.topLevelWorldView;
		int var1 = class571.method10767();
		int var5;
		if (var0 == Sound.topLevelWorldView && var1 >= 0 && Client.menu.menuOpcodes[var1] == 60) {
			int var2 = Client.menu.menuIdentifiers[var1] * 128;
			Model var3 = class27.field130;
			boolean var4 = true;
			var5 = Math.max(384, 2000 - Client.viewportZoom * 2);
			int var6 = Client.field527 - (int)(class517.method10079(var2) * (double)var5);
			int var7 = Client.field387;
			double var8 = (double)VertexNormal.method5706(var2) / 65536.0D;
			int var10 = var7 - (int)(var8 * (double)var5);
			int var11 = var0.plane;
			int var12 = var6 >> 7;
			int var15 = var10 >> 7;
			long var16 = class275.calculateTag(var11, var12, var15, 5, false, -1, var0.id);
			var0.scene.drawEntity(var0.plane, var6, var10, Client.field429, 60, var3, var2, var16, false);
		}

		class177.method3962(Sound.topLevelWorldView);
		WorldView var18 = Sound.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var18.players.get((long)Client.combatTargetPlayerIndex) != null) {
			WorldEntityCoord.addPlayerToScene(var18, Client.combatTargetPlayerIndex, false);
		}

		Clock.method4866(Sound.topLevelWorldView);
		Tile.method4989(Sound.topLevelWorldView, class389.TOKEN);
		Tile.method4989(Sound.topLevelWorldView, class389.field4605);
		AABB.addNpcsToScene(Sound.topLevelWorldView, true);
		WorldView var19 = Sound.topLevelWorldView;
		int var20 = Client.field326.playerCount;
		int[] var21 = Client.field326.playerIndices;

		for (var5 = 0; var5 < var20; ++var5) {
			if (var21[var5] != Client.combatTargetPlayerIndex && var21[var5] != Client.localPlayerIndex) {
				WorldEntityCoord.addPlayerToScene(var19, var21[var5], true);
			}
		}

		AABB.addNpcsToScene(Sound.topLevelWorldView, false);

		for (Projectile var22 = (Projectile)Client.playerUpdateManager.last(); var22 != null; var22 = (Projectile)Client.playerUpdateManager.previous()) {
			if (Client.cycle > var22.field783) {
				var22.remove();
			} else if (Client.cycle >= var22.field782) {
				var22.method1951(Client.worldViewManager, Client.cycle, Client.graphicsCycle);
				Sound.topLevelWorldView.scene.drawEntity(var22.plane, (int)var22.speedX, (int)var22.field787, (int)var22.field788, 60, var22, var22.yaw, -1L, false);
			}
		}

		WorldView var23 = Sound.topLevelWorldView;

		for (GraphicsObject var24 = (GraphicsObject)var23.projectiles.last(); var24 != null; var24 = (GraphicsObject)var23.projectiles.previous()) {
			if (var23.plane == var24.field706 && !var24.isFinished) {
				if (Client.cycle >= var24.field694) {
					var24.advance(Client.graphicsCycle);
					if (var24.isFinished) {
						var24.remove();
					} else {
						var23.scene.drawEntity(var24.field706, var24.x, var24.field697, var24.cycleStart, 60, var24, 0, -1L, false);
					}
				}
			} else {
				var24.remove();
			}
		}

		Tile.method4989(Sound.topLevelWorldView, class389.field4601);
	}
}
