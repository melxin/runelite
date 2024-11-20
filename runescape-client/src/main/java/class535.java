import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
public class class535 {
	@ObfuscatedName("at")
	public static final char[] field5358;
	@ObfuscatedName("ae")
	public static final char[] field5361;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 803297283
	)
	@Export("canvasHeight")
	public static int canvasHeight;

	static {
		field5358 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field5361 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZI)V",
		garbageValue = "-1563044922"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.npcCount; ++var2) {
			NPC var3 = var0.npcs[var0.npcIndices[var2]];
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.field1199 * -1018240139 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = WorldMapScaleHandler.calculateTag(0, 0, 1, !var3.definition.isInteractable, var0.npcIndices[var2], var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = class77.getTileHeight(var0, var3.field1199 * -742859456 - 64 + var3.x, var3.y + (var3.field1199 * -742859456 - 64), var4);
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var3.field1199 * -742859456 - 64 + 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
