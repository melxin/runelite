import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;Lqm;Lqm;I)V",
		garbageValue = "526958247"
	)
	public static void method2151(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Tiles.SequenceDefinition_archive = var0;
		class152.SequenceDefinition_animationsArchive = var1;
		WorldMapData_0.SequenceDefinition_skeletonsArchive = var2;
		WorldMapIcon_0.SpotAnimationDefinition_archive = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-590831217"
	)
	static final void method2150(int var0) {
		int[] var1 = class437.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 1;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Occluder.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Occluder.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					Occluder.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class437.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Occluder.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					HealthBarDefinition.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Occluder.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					HealthBarDefinition.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		class39.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = Occluder.topLevelWorldView.scene.getFloorDecorationTag(Occluder.topLevelWorldView.plane, var5, var6);
				if (0L != var7) {
					int var9 = HorizontalAlignment.Entity_unpackID(var7);
					int var10 = AsyncHttpResponse.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class463.WorldMapElement_get(var10).field1996) {
						class39.mapIcons[class39.mapIconCount] = class463.WorldMapElement_get(var10).getSpriteBool(false);
						class39.mapIconXs[class39.mapIconCount] = var5;
						class39.mapIconYs[class39.mapIconCount] = var6;
						++class39.mapIconCount;
					}
				}
			}
		}

		GameEngine.rasterProvider.apply();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026536314"
	)
	public static void method2149() {
		boolean var0;
		int var1;
		do {
			var0 = true;

			for (var1 = 0; var1 < ViewportMouse.ViewportMouse_entityCount; ++var1) {
				if (ViewportMouse.field3116[var1] < ViewportMouse.field3116[var1 + 1]) {
					long var5 = ViewportMouse.ViewportMouse_entityTags[var1];
					ViewportMouse.ViewportMouse_entityTags[var1] = ViewportMouse.ViewportMouse_entityTags[var1 + 1];
					ViewportMouse.ViewportMouse_entityTags[var1 + 1] = var5;
					int var4 = ViewportMouse.field3116[var1];
					ViewportMouse.field3116[var1] = ViewportMouse.field3116[var1 + 1];
					ViewportMouse.field3116[var1 + 1] = var4;
					var0 = false;
				}
			}
		} while(!var0);

		for (var1 = 0; var1 < ViewportMouse.ViewportMouse_entityCount; ++var1) {
			for (int var2 = var1 + 1; var2 <= ViewportMouse.ViewportMouse_entityCount; ++var2) {
				if (ViewportMouse.ViewportMouse_entityTags[var2] == ViewportMouse.ViewportMouse_entityTags[var1]) {
					ViewportMouse.ViewportMouse_entityTags[var1] = -1L;
					break;
				}
			}
		}

	}
}
