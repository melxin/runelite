import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1326387697
	)
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 342543617
	)
	@Export("height")
	int height;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1400348293
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1783174675
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llf;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1761770547"
	)
	public static long method6229(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lir;B)Z",
		garbageValue = "-38"
	)
	static boolean method6230(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = HttpMethod.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
