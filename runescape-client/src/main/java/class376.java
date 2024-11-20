import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class376 {
	@ObfuscatedName("af")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("fc")
	static boolean field4116;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1904227441
	)
	static int field4114;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2144988570"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class168.sortWorlds(class142.World_worlds, 0, class142.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}
}
