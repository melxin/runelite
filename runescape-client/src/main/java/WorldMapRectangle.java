import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -816015567
	)
	@Export("width")
	int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -82625235
	)
	@Export("height")
	int height;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 498571187
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 782021347
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llj;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1109454388"
	)
	public static boolean method6799() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class337.field3795.isEmpty()) {
			SongTask var2 = (SongTask)class337.field3795.get(0);
			if (var2 == null) {
				class337.field3795.remove(0);
			} else if (var2.vmethod9672()) {
				if (var2.method9650()) {
					System.out.println("Error in midimanager.service: " + var2.method9667());
					var0 = true;
				} else {
					if (var2.method9653() != null) {
						class337.field3795.add(1, var2.method9653());
					}

					var1 = var2.method9655();
				}

				class337.field3795.remove(0);
			} else {
				var1 = var2.method9655();
			}
		}

		if (var0) {
			class337.field3795.clear();
			class82.method2752();
		}

		return var1;
	}
}
