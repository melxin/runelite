import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("at")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1807549016"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIILoz;I)V",
		garbageValue = "-1045900274"
	)
	static void method7012(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		int var5 = Client.playerUpdateManager.playerCount;
		int[] var6 = Client.playerUpdateManager.playerIndices;

		for (int var7 = 0; var7 < var5; ++var7) {
			Player var8 = (Player)var0.players.get((long)var6[var7]);
			if (var8 != null && var8.isVisible() && !var8.isHidden) {
				ProjectionCoord var9 = class86.method2932(var0, var8.x, var8.y);
				int var10 = (int)var9.x;
				int var11 = (int)var9.y;
				var9.release();
				int var12 = var10 / 32 - Client.field468 / 32;
				int var13 = var11 / 32 - Client.field512 / 32;
				if (var8 == Client.worldViewManager.method2390()) {
					int var14 = Rasterizer3D.Rasterizer3D_sine[var3];
					int var15 = Rasterizer3D.Rasterizer3D_cosine[var3];
					int var16 = var15 * var12 + var14 * var13 >> 16;
					int var17 = var15 * var13 - var14 * var12 >> 16;
					class39.field239 = var16;
					class39.Players_count = var17;
				} else if (var8.isFriend()) {
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class579.field5923[3], var4);
				} else if (class330.localPlayer.team != 0 && var8.team != 0 && var8.team == class330.localPlayer.team) {
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class579.field5923[4], var4);
				} else if (var8.isFriendsChatMember()) {
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class579.field5923[5], var4);
				} else if (var8.isClanMember()) {
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class579.field5923[6], var4);
				} else {
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class579.field5923[2], var4);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Luf;",
		garbageValue = "-26"
	)
	public static class524[] method7016() {
		return new class524[]{class524.field5563, class524.field5562, class524.field5564, class524.field5569};
	}
}
