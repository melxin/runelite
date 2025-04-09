import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class280 implements Comparator {
	class280() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Lkx;I)I",
		garbageValue = "-1882465383"
	)
	int method5886(class272 var1, class272 var2) {
		return var1.method5744() - var2.method5744();
	}

	public int compare(Object var1, Object var2) {
		return this.method5886((class272)var1, (class272)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lcu;",
		garbageValue = "-876691685"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lws;",
		garbageValue = "1365221321"
	)
	static IndexedSprite method5890() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = class27.SpriteBuffer_spriteHeight;
		var0.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[0];
		var0.yOffset = MusicPatchPcmStream.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class386.SpriteBuffer_spriteHeights[0];
		var0.palette = class382.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
		MusicPatchPcmStream.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class386.SpriteBuffer_spriteHeights = null;
		class382.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1905139274"
	)
	static final void method5892(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field997 != 0) {
						if (var1.field997 > 0) {
							var2 = (NPC)DevicePcmPlayerProvider.worldView.npcs.get((long)(var1.field997 - 1));
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field976, var1.field977, var1.field986, Client.cycle);
							}
						} else {
							var3 = -var1.field997 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = Script.localPlayer;
							} else {
								var4 = (Player)DevicePcmPlayerProvider.worldView.players.get((long)var3);
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field976, var1.field977, var1.field986, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = (NPC)var0.npcs.get((long)(var1.targetIndex - 1));
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, GraphicsObject.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = Script.localPlayer;
						} else {
							var4 = (Player)var0.players.get((long)var3);
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, GraphicsObject.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.scene.drawEntity(var0.plane, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}
}
