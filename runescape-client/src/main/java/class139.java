import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class139 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1615;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1619;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1607;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1608;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1624;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1613;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1623;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1612;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1609;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1614;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1606;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1616;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1617;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1618;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1605;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1620;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class139 field1621;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static Bounds field1625;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -914255851
	)
	final int field1622;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1664735317
	)
	final int field1610;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1292924849
	)
	final int field1611;

	static {
		field1615 = new class139(0, 0, (String)null, -1, -1);
		field1619 = new class139(1, 1, (String)null, 0, 2);
		field1607 = new class139(2, 2, (String)null, 1, 2);
		field1608 = new class139(3, 3, (String)null, 2, 2);
		field1624 = new class139(4, 4, (String)null, 3, 1);
		field1613 = new class139(5, 5, (String)null, 4, 1);
		field1623 = new class139(6, 6, (String)null, 5, 1);
		field1612 = new class139(7, 7, (String)null, 6, 3);
		field1609 = new class139(8, 8, (String)null, 7, 3);
		field1614 = new class139(9, 9, (String)null, 8, 3);
		field1606 = new class139(10, 10, (String)null, 0, 7);
		field1616 = new class139(11, 11, (String)null, 1, 7);
		field1617 = new class139(12, 12, (String)null, 2, 7);
		field1618 = new class139(13, 13, (String)null, 3, 7);
		field1605 = new class139(14, 14, (String)null, 4, 7);
		field1620 = new class139(15, 15, (String)null, 5, 7);
		field1621 = new class139(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class139(int var1, int var2, String var3, int var4, int var5) {
		this.field1622 = var1;
		this.field1610 = var2;
		this.field1611 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1610;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1537310450"
	)
	int method3379() {
		return this.field1611;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "817102251"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-884407281"
	)
	public static int method3386(int var0) {
		return class331.field3608[var0];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-910047223"
	)
	static final void method3374(String var0) {
		HttpRequestTask.method269("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-553828434"
	)
	static final void method3371(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class217.field2364 || Projectile.field998 != var1) {
			class217.field2364 = var0;
			Projectile.field998 = var1;
			class31.updateGameState(25);
			Client.field518 = true;
			class135.drawLoadingMessage("Loading - please wait.", true);
			int var3 = HttpRequest.topLevelWorldView.baseX;
			int var4 = HttpRequest.topLevelWorldView.baseY;
			HttpRequest.topLevelWorldView.baseX = (var0 - 6) * 8;
			HttpRequest.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = HttpRequest.topLevelWorldView.baseX - var3;
			int var6 = HttpRequest.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var9;
			int var11;
			int[] var10000;
			for (var9 = 0; var9 < 65536; ++var9) {
				NPC var21 = HttpRequest.topLevelWorldView.npcs[var9];
				if (var21 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var21.pathX;
						var10000[var11] -= var5;
						var10000 = var21.pathY;
						var10000[var11] -= var6;
					}

					var21.x -= var7;
					var21.y -= var8;
					var21.field1247 -= var5;
					var21.field1249 -= var6;
					var21.field1248 -= var5;
					var21.field1250 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				Player var24 = HttpRequest.topLevelWorldView.players[var9];
				if (var24 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var24.pathX;
						var10000[var11] -= var5;
						var10000 = var24.pathY;
						var10000[var11] -= var6;
					}

					var24.x -= var7;
					var24.y -= var8;
					var24.field1247 -= var5;
					var24.field1249 -= var6;
					var24.field1248 -= var5;
					var24.field1250 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				WorldEntity var25 = HttpRequest.topLevelWorldView.worldEntities[var9];
				if (var25 != null) {
					var25.setPosition(-var7, -var8);
				}
			}

			byte var22 = 0;
			byte var10 = 104;
			byte var23 = 1;
			if (var5 < 0) {
				var22 = 103;
				var10 = -1;
				var23 = -1;
			}

			byte var12 = 0;
			byte var13 = 104;
			byte var14 = 1;
			if (var6 < 0) {
				var12 = 103;
				var13 = -1;
				var14 = -1;
			}

			int var16;
			for (int var15 = var22; var15 != var10; var15 += var23) {
				for (var16 = var12; var16 != var13; var16 += var14) {
					int var17 = var15 + var5;
					int var18 = var16 + var6;

					for (int var19 = 0; var19 < 4; ++var19) {
						if (0 <= var17 && var17 < 104 && 0 <= var18 && var18 < 104) {
							HttpRequest.topLevelWorldView.groundItems[var19][var15][var16] = HttpRequest.topLevelWorldView.groundItems[var19][var17][var18];
						} else {
							HttpRequest.topLevelWorldView.groundItems[var19][var15][var16] = null;
						}
					}
				}
			}

			for (PendingSpawn var20 = (PendingSpawn)HttpRequest.topLevelWorldView.pendingSpawns.last(); var20 != null; var20 = (PendingSpawn)HttpRequest.topLevelWorldView.pendingSpawns.previous()) {
				var20.x -= var5;
				var20.y -= var6;
				if (var20.x < 0 || 104 <= var20.x || var20.y < 0 || 104 <= var20.y) {
					var20.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class403.cameraX -= var5 << 7;
			class328.cameraZ -= var6 << 7;
			class443.oculusOrbFocalPointX -= var5 << 7;
			AsyncRestClient.oculusOrbFocalPointY -= var6 << 7;
			Client.field700 = -1;
			HttpRequest.topLevelWorldView.graphicsObjects.clear();
			HttpRequest.topLevelWorldView.projectiles.clear();

			for (var16 = 0; var16 < 4; ++var16) {
				HttpRequest.topLevelWorldView.collisionMaps[var16].clear();
			}

		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "-2733"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class36.scrollBarSprites[0].drawAt(var0, var1);
		class36.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field592);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field593);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field646);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field646);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field646);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field646);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field793);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field793);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field793);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field793);
	}
}
